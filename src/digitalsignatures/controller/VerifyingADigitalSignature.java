package digitalsignatures.controller;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.*;

import digitalsignatures.dao.SignedDocumentDAO;
import digitalsignatures.db.ConnectDB;
import digitalsignatures.model.SignedDocument;
import digitalsignatures.service.*;

public class VerifyingADigitalSignature {
    private StringBuilder append;

    public static void main(String[] args) {
        /* Verify a DSA signature */
        try {
            /* Input and Convert the Encoded Public Key Bytes */
            FileInputStream keyfis = new FileInputStream("suepk");
            byte[] encKey = new byte[keyfis.available()];
            keyfis.read(encKey);
            keyfis.close();

            X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(encKey);
            KeyFactory keyFactory = KeyFactory.getInstance("DSA", "SUN");
            PublicKey pubKey = keyFactory.generatePublic(pubKeySpec);

            /* Input the Signature Bytes */
            FileInputStream sigfis = new FileInputStream("sig");
            byte[] sigToVerify = new byte[sigfis.available()];
            sigfis.read(sigToVerify);
            sigfis.close();
//            SignedDocument signedDocument = SignedDocumentDAO.getData(ConnectDB.CreateConnection());

            /* Verify the Signature */
            // Initialize the Signature Object for Verification
            Signature sig = Signature.getInstance("SHA1withDSA", "SUN");
            sig.initVerify(pubKey);

            MessageDigest md = MessageDigest.getInstance("SHA-256"); //SHA, MD2, MD5, SHA-256, SHA-384...
            String hex = Hash.checksum("./wireTransfer103.xml", md);
            sig.update(hex.getBytes());

            // Verify the Signature
            boolean verifies = sig.verify(sigToVerify);

            System.out.println("signature verifies: " + verifies);

            final long startTime = System.currentTimeMillis();
//            String hash = hashString("Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello");
            String hash = Hash.checksum("./wireTransfer103.xml", MessageDigest.getInstance("SHA-256"));
            final long endTime = System.currentTimeMillis();
            System.out.println("Hash string: " + hash + "\nExecute time: " + (endTime-startTime));
        } catch (Exception e) {
            System.err.println("Caught exception " + e.toString());
        }
    }
}
