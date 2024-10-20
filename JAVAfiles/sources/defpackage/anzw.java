package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anzw implements annh {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    public static final Provider c;
    private final RSAPublicKey d;
    private final String e;
    private final PSSParameterSpec f;
    private final byte[] g;
    private final byte[] h;

    static {
        if (anuk.d()) {
            anuk.c().intValue();
        }
        c = ansq.a();
    }

    public anzw(RSAPublicKey rSAPublicKey, anze anzeVar, anze anzeVar2, int i, byte[] bArr, byte[] bArr2) {
        if (anme.z(2)) {
            if (anzeVar.equals(anzeVar2)) {
                aoci.b(rSAPublicKey.getModulus().bitLength());
                aoci.c(rSAPublicKey.getPublicExponent());
                this.d = rSAPublicKey;
                this.e = b(anzeVar);
                this.f = c(anzeVar, anzeVar2, i);
                this.g = bArr;
                this.h = bArr2;
                return;
            }
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(anze anzeVar) {
        if (anzeVar == anze.a) {
            return "SHA256withRSA/PSS";
        }
        if (anzeVar == anze.b) {
            return "SHA384withRSA/PSS";
        }
        if (anzeVar == anze.c) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(String.valueOf(anzeVar))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PSSParameterSpec c(anze anzeVar, anze anzeVar2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        anze anzeVar3 = anze.a;
        if (anzeVar == anzeVar3) {
            str = "SHA-256";
        } else if (anzeVar == anze.b) {
            str = "SHA-384";
        } else if (anzeVar == anze.c) {
            str = "SHA-512";
        } else {
            throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(String.valueOf(anzeVar))));
        }
        String str2 = str;
        if (anzeVar2 == anzeVar3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (anzeVar2 == anze.b) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else if (anzeVar2 == anze.c) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        } else {
            throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(String.valueOf(anzeVar2))));
        }
        return new PSSParameterSpec(str2, "MGF1", mGF1ParameterSpec, i, 1);
    }

    public static boolean d() {
        if (c != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.annh
    public final void a(byte[] bArr, byte[] bArr2) {
        if (anuk.e(this.g, bArr)) {
            Signature signature = Signature.getInstance(this.e, c);
            signature.initVerify(this.d);
            signature.setParameter(this.f);
            signature.update(bArr2);
            byte[] bArr3 = this.h;
            if (bArr3.length > 0) {
                signature.update(bArr3);
            }
            byte[] bArr4 = this.g;
            int length = bArr.length;
            int length2 = bArr4.length;
            if (signature.verify(bArr, length2, length - length2)) {
                return;
            } else {
                throw new GeneralSecurityException("signature verification failed");
            }
        }
        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
    }
}
