package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anqy extends anrp {
    public final anqz e;
    public final aojh f;
    public final ahmn g;

    public anqy(anqz anqzVar, ahmn ahmnVar, aojh aojhVar) {
        this.e = anqzVar;
        this.g = ahmnVar;
        this.f = aojhVar;
    }

    public static anqy H(anqz anqzVar, ahmn ahmnVar) {
        ECPoint eCPoint = anqzVar.f;
        if (eCPoint != null) {
            Object obj = ahmnVar.a;
            anqt anqtVar = anqzVar.e.f;
            BigInteger order = J(anqtVar).getOrder();
            BigInteger bigInteger = (BigInteger) obj;
            if (bigInteger.signum() > 0 && bigInteger.compareTo(order) < 0) {
                if (ansx.e(bigInteger, J(anqtVar)).equals(eCPoint)) {
                    return new anqy(anqzVar, ahmnVar, null);
                }
                throw new GeneralSecurityException("Invalid private value");
            }
            throw new GeneralSecurityException("Invalid private value");
        }
        throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
    }

    private static ECParameterSpec J(anqt anqtVar) {
        if (anqtVar == anqt.a) {
            return ansx.a;
        }
        if (anqtVar == anqt.b) {
            return ansx.b;
        }
        if (anqtVar == anqt.c) {
            return ansx.c;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(String.valueOf(anqtVar))));
    }

    public final anqx F() {
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
