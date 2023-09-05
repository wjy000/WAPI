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
//        String[] existParams = {"authkey=gmLl7weRNA6Fr2pGjveP+Dv/Fuju8Jj1uxc7mePsmnI=", "cc=1", "in=9899888315", "id=dfbcb4d2df464d0295df"};
//        String exist = Verification.exist(userAgent, encrypted, existParams);
//        System.out.println(exist);

        //Request code
        String token = Verification.calculateAndroidToken("9899888315");
        String[] codeParams = {"authkey=gmLl7weRNA6Fr2pGjveP+Dv/Fuju8Jj1uxc7mePsmnI=", "cc=1", "in=9899888315", "id=dfbcb4d2df464d0295df", "token=" + token, "method=sms"};
        String code = Verification.code(userAgent, encrypted, codeParams);
        System.out.println(code);
//
//		//Register account using code
//		String[] registerParams = {};
//		Verification.register(userAgent,encrypted,registerParams);
    }
}