package digitalsignatures.usingjava;

import java.io.*;
import java.security.*;
import java.security.spec.*;

public class VerifyingADigitalSignature {
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
            FileInputStream datafis = new FileInputStream("data.txt");
            BufferedInputStream bufin = new BufferedInputStream(datafis);

            byte[] buffer = new byte[1024];
            int len;
            while (bufin.available() != 0) {
                len = bufin.read(buffer);
                sig.update(buffer, 0, len);
            };

            bufin.close();

            // Verify the Signature
            boolean verifies = sig.verify(sigToVerify);

            System.out.println("signature verifies: " + verifies);
        } catch (Exception e) {
            System.err.println("Caught exception " + e.toString());
        }
    }
}
