package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anzt implements annh {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    public static final Provider c;
    private final RSAPublicKey d;
    private final String e;
    private final byte[] f;
    private final byte[] g;

    static {
        if (anuk.d()) {
            anuk.c().intValue();
        }
        c = ansq.a();
    }

    public anzt(RSAPublicKey rSAPublicKey, anyx anyxVar, byte[] bArr, byte[] bArr2) {
        String str;
        if (anme.z(2)) {
            aoci.b(rSAPublicKey.getModulus().bitLength());
            aoci.c(rSAPublicKey.getPublicExponent());
            this.d = rSAPublicKey;
            if (anyxVar == anyx.a) {
                str = "SHA256withRSA";
            } else if (anyxVar == anyx.b) {
                str = "SHA384withRSA";
            } else if (anyxVar == anyx.c) {
                str = "SHA512withRSA";
            } else {
                throw new GeneralSecurityException("unknown hash type");
            }
            this.e = str;
            this.f = bArr;
            this.g = bArr2;
            return;
        }
        throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static boolean b() {
        if (c != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.annh
    public final void a(byte[] bArr, byte[] bArr2) {
        if (anuk.e(this.f, bArr)) {
            String str = this.e;
            Provider provider = c;
            if (provider != null) {
                Signature signature = Signature.getInstance(str, provider);
                signature.initVerify(this.d);
                signature.update(bArr2);
                byte[] bArr3 = this.g;
                if (bArr3.length > 0) {
                    signature.update(bArr3);
                }
                try {
                    if (signature.verify(Arrays.copyOfRange(bArr, this.f.length, bArr.length))) {
                        return;
                    }
                } catch (RuntimeException unused) {
                }
                throw new GeneralSecurityException("Invalid signature");
            }
            throw new GeneralSecurityException("Conscrypt Provider not found");
        }
        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
    }
}
