package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anqz extends anrq {
    public final anqx e;
    public final ECPoint f;
    public final aocj g;
    public final aocj h;
    public final Integer i;

    private anqz(anqx anqxVar, ECPoint eCPoint, aocj aocjVar, aocj aocjVar2, Integer num) {
        this.e = anqxVar;
        this.f = eCPoint;
        this.g = aocjVar;
        this.h = aocjVar2;
        this.i = num;
    }

    public static anqz F(anqx anqxVar, aocj aocjVar, Integer num) {
        if (anqxVar.f.equals(anqt.d)) {
            J(anqxVar.i, num);
            if (aocjVar.a() == 32) {
                return new anqz(anqxVar, null, aocjVar, I(anqxVar.i, num), num);
            }
            throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
        }
        throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
    }

    public static anqz G(anqx anqxVar, ECPoint eCPoint, Integer num) {
        EllipticCurve curve;
        if (!anqxVar.f.equals(anqt.d)) {
            J(anqxVar.i, num);
            anqt anqtVar = anqxVar.f;
            if (anqtVar == anqt.a) {
                curve = ansx.a.getCurve();
            } else if (anqtVar == anqt.b) {
                curve = ansx.b.getCurve();
            } else if (anqtVar == anqt.c) {
                curve = ansx.c.getCurve();
            } else {
                throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(String.valueOf(anqtVar))));
            }
            ansx.f(eCPoint, curve);
            return new anqz(anqxVar, eCPoint, null, I(anqxVar.i, num), num);
        }
        throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
    }

    private static aocj I(anqw anqwVar, Integer num) {
        if (anqwVar == anqw.c) {
            return antr.a;
        }
        if (num != null) {
            if (anqwVar == anqw.b) {
                return antr.a(num.intValue());
            }
            if (anqwVar == anqw.a) {
                return antr.b(num.intValue());
            }
            throw new IllegalStateException("Unknown EciesParameters.Variant: ".concat(String.valueOf(String.valueOf(anqwVar))));
        }
        throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(String.valueOf(anqwVar))));
    }

    private static void J(anqw anqwVar, Integer num) {
        if (!anqwVar.equals(anqw.c) && num == null) {
            throw new GeneralSecurityException(hht.b(anqwVar, "'idRequirement' must be non-null for ", " variant."));
        }
        if (anqwVar.equals(anqw.c) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    @Override // defpackage.anrq
    public final aocj H() {
        return this.h;
    }

    @Override // defpackage.anme
    public final Integer a() {
        return this.i;
    }
}
