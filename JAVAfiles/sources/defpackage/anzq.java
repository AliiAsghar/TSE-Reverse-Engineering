package defpackage;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anzq implements anng {
    public anzq() {
    }

    public anzq(atii atiiVar) {
        if (atiiVar.i()) {
            antn.a.a();
            anme.E(atiiVar);
        }
    }

    public anzq(RSAPrivateCrtKey rSAPrivateCrtKey, anze anzeVar, anze anzeVar2, int i) {
        if (anme.z(2)) {
            aoci.b(rSAPrivateCrtKey.getModulus().bitLength());
            aoci.c(rSAPrivateCrtKey.getPublicExponent());
            anzw.b(anzeVar);
            anzw.c(anzeVar, anzeVar2, i);
            return;
        }
        throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }

    public anzq(RSAPrivateCrtKey rSAPrivateCrtKey, aobr aobrVar, aobr aobrVar2) {
        if (!anqi.a()) {
            aoci.d(aobrVar);
            if (aobrVar.equals(aobrVar2)) {
                aoci.b(rSAPrivateCrtKey.getModulus().bitLength());
                aoci.c(rSAPrivateCrtKey.getPublicExponent());
                return;
            }
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }
}
