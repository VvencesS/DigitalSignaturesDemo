package digitalsignatures.controller;

import digitalsignatures.dao.SignedDocumentDAO;
import digitalsignatures.db.ConnectDB;
import digitalsignatures.model.SignedDocument;
import digitalsignatures.service.Hash;
import digitalsignatures.service.ObjectToXml;

import java.io.*;
import java.security.*;

public class DigitalSignaturesUsingJava {

    public static void main(String[] args) {
        /* Generate a DSA signature */
        try {
            /*Generate Public and Private Keys*/
            // Create a Key Pair Generator
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA", "SUN");

            // Initialize the Key Pair Generator
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
            keyGen.initialize(1024, random);

            // Generate the Pair of Keys
            KeyPair pair = keyGen.generateKeyPair();
            PrivateKey priv = pair.getPrivate();
            PublicKey pub = pair.getPublic();

            /*Sign the Data*/
            // Get a Signature Object
            Signature dsa = Signature.getInstance("SHA1withDSA", "SUN");

            // Initialize the Signature Object
            dsa.initSign(priv);

            // Chuyển từ Object sang Xml và hash xml đó
            String hex = Hash.hashString(ObjectToXml.jaxbObjectToXML());
            dsa.update(hex.getBytes());

            // Generate the Signature
            byte[] realSig = dsa.sign();

            //Printing the signature
            System.out.println("Digital signature for given text: " + new String(realSig, "UTF8"));

            // Thêm vào db
            SignedDocumentDAO.InsertData(ConnectDB.CreateConnection(), new SignedDocument(1, realSig));

            /*Save the Signature and the Public Key in Files*/
            FileOutputStream sigfos = new FileOutputStream("sig");
            sigfos.write(realSig);
            sigfos.close();

            /* Save the public key in a file */
            byte[] key = pub.getEncoded();
            FileOutputStream keyfos = new FileOutputStream("suepk");
            keyfos.write(key);
            keyfos.close();
        } catch (Exception e) {
            System.err.println("Caught exception " + e.toString());
        }
    }
}
