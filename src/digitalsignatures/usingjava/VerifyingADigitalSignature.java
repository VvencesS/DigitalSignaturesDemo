package digitalsignatures.usingjava;

import java.io.*;
import java.security.*;
import java.security.spec.*;

public class VerifyingADigitalSignature {
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

            /* Verify the Signature */
            // Initialize the Signature Object for Verification
            Signature sig = Signature.getInstance("SHA1withDSA", "SUN");
            sig.initVerify(pubKey);

            // Supply the Signature Object With the Data to be Verified
//            FileInputStream datafis = new FileInputStream("data.txt");
//            BufferedInputStream bufin = new BufferedInputStream(datafis);
//
//            byte[] buffer = new byte[1024];
//            int len;
//            while (bufin.available() != 0) {
//                len = bufin.read(buffer);
//                sig.update(buffer, 0, len);
//            };
//
//            bufin.close();
            MessageDigest md = MessageDigest.getInstance("SHA-256"); //SHA, MD2, MD5, SHA-256, SHA-384...
            String hex = checksum("./data.txt", md);
            sig.update(hex.getBytes());

            // Verify the Signature
            boolean verifies = sig.verify(sigToVerify);

            System.out.println("signature verifies: " + verifies);
        } catch (Exception e) {
            System.err.println("Caught exception " + e.toString());
        }
    }
}
