package digitalsignatures.usingjava;

import java.io.*;
import java.security.*;

public class DigitalSignaturesUsingJava {
    private static String checksum(String filepath, MessageDigest md) throws IOException {
        // file hashing with DigestInputStream
        try (DigestInputStream dis = new DigestInputStream(new FileInputStream(filepath), md)) {
            while (dis.read() != -1) ; //empty loop to clear the data
            md = dis.getMessageDigest();
        }
        // bytes to hex
        StringBuilder result = new StringBuilder();
        for (byte b : md.digest()) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        /* Generate a DSA signature */
//        if (args.length != 1) {
//            System.out.println("Usage: GenSig nameOfFileToSign");
//        }
//        else
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

            // Supply the Signature Object the Data to Be Signed
//            FileInputStream fis = new FileInputStream("data.txt");
//
//            BufferedInputStream bufin = new BufferedInputStream(fis);
//            byte[] buffer = new byte[1024];
//            int len;
//            while ((len = bufin.read(buffer)) >= 0) {
//                dsa.update(buffer, 0, len);
//            };
//            bufin.close();
            MessageDigest md = MessageDigest.getInstance("SHA-256"); //SHA, MD2, MD5, SHA-256, SHA-384...
            String hex = checksum("./data.txt", md);
            dsa.update(hex.getBytes());

            // Generate the Signature
            byte[] realSig = dsa.sign();

            //Printing the signature
            System.out.println("Digital signature for given text: "+new String(realSig, "UTF8"));

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
