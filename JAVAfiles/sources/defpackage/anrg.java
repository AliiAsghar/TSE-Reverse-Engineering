package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anrg extends anrp {
    public final anri e;
    public final aojh f;

    private anrg(anri anriVar, aojh aojhVar) {
        this.e = anriVar;
        this.f = aojhVar;
    }

    public static anrg H(anri anriVar, aojh aojhVar) {
        ECParameterSpec eCParameterSpec;
        int x = aojhVar.x();
        anrd anrdVar = anriVar.e.e;
        String str = "Encoded private key byte length for " + anrdVar.toString() + " must be %d, not " + x;
        if (anrdVar == anrd.a) {
            if (x != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (anrdVar == anrd.b) {
            if (x != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (anrdVar == anrd.c) {
            if (x != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else if (anrdVar == anrd.f) {
            if (x != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else {
            throw new GeneralSecurityException("Unable to validate private key length for ".concat(anrdVar.toString()));
        }
        anrf anrfVar = anriVar.e;
        byte[] c = anriVar.f.c();
        byte[] y = aojhVar.y();
        anrd anrdVar2 = anrfVar.e;
        anrd anrdVar3 = anrd.a;
        if (anrdVar2 != anrdVar3 && anrdVar2 != anrd.b && anrdVar2 != anrd.c) {
            if (anrdVar2 == anrd.f) {
                if (!Arrays.equals(aode.e(y), c)) {
                    throw new GeneralSecurityException("Invalid private key for public key.");
                }
            } else {
                throw new IllegalArgumentException("Unable to validate key pair for ".concat(anrdVar2.toString()));
            }
        } else {
            if (anrdVar2 == anrdVar3) {
                eCParameterSpec = ansx.a;
            } else if (anrdVar2 == anrd.b) {
                eCParameterSpec = ansx.b;
            } else if (anrdVar2 == anrd.c) {
                eCParameterSpec = ansx.c;
            } else {
                throw new IllegalArgumentException("Unable to determine NIST curve params for ".concat(anrdVar2.toString()));
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger bigInteger = new BigInteger(1, y);
            if (bigInteger.signum() > 0 && bigInteger.compareTo(order) < 0) {
                if (!ansx.e(bigInteger, eCParameterSpec).equals(aode.F(eCParameterSpec.getCurve(), aobk.UNCOMPRESSED, c))) {
                    throw new GeneralSecurityException("Invalid private key for public key.");
                }
            } else {
                throw new GeneralSecurityException("Invalid private key.");
            }
        }
        return new anrg(anriVar, aojhVar);
    }

    public final anrf F() {
        return this.e.e;
    }

    @Override // defpackage.anrp
    public final /* synthetic */ anrq G() {
        return this.e;
    }

    @Override // defpackage.anrp, defpackage.annf
    public final /* synthetic */ anme b() {
        return this.e;
    }
}
