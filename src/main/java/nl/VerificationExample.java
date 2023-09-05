package nl;

import nl.ben221199.wapi.Verification;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.io.IOException;
import java.security.Security;

public class VerificationExample {
    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static void main(String... args) throws IOException {
        String userAgent = "Dalvik/2.1.0 (Linux; U; Android 12; Android SDK built for x86_64 Build/SE1A.220826.006.A1)";
        boolean encrypted = true;

        //Check if account already exists
        String[] existParams = {};
        Verification.exist(userAgent, encrypted, existParams);

//		//Request code
//		String[] codeParams = {};
//		Verification.code(userAgent,encrypted,codeParams);
//
//		//Register account using code
//		String[] registerParams = {};
//		Verification.register(userAgent,encrypted,registerParams);
    }
}