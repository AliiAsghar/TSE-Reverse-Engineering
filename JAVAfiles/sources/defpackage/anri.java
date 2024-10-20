package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anri extends anrq {
    public final anrf e;
    public final aocj f;
    public final aocj g;
    public final Integer h;

    private anri(anrf anrfVar, aocj aocjVar, aocj aocjVar2, Integer num) {
        this.e = anrfVar;
        this.f = aocjVar;
        this.g = aocjVar2;
        this.h = num;
    }

    public static anri F(anrf anrfVar, aocj aocjVar, Integer num) {
        EllipticCurve curve;
        aocj b;
        anre anreVar = anrfVar.h;
        if (!anreVar.equals(anre.c) && num == null) {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + anreVar.d + " variant.");
        }
        if (anreVar.equals(anre.c) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        anrd anrdVar = anrfVar.e;
        int a = aocjVar.a();
        String str = "Encoded public key byte length for " + anrdVar.toString() + " must be %d, not " + a;
        anrd anrdVar2 = anrd.a;
        if (anrdVar == anrdVar2) {
            if (a != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (anrdVar == anrd.b) {
            if (a != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (anrdVar == anrd.c) {
            if (a != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else if (anrdVar == anrd.f) {
            if (a != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else {
            throw new GeneralSecurityException("Unable to validate public key length for ".concat(anrdVar.toString()));
        }
        if (anrdVar == anrdVar2 || anrdVar == anrd.b || anrdVar == anrd.c) {
            if (anrdVar == anrdVar2) {
                curve = ansx.a.getCurve();
            } else if (anrdVar == anrd.b) {
                curve = ansx.b.getCurve();
            } else if (anrdVar == anrd.c) {
                curve = ansx.c.getCurve();
            } else {
                throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(anrdVar.toString()));
            }
            ansx.f(aode.F(curve, aobk.UNCOMPRESSED, aocjVar.c()), curve);
        }
        anre anreVar2 = anrfVar.h;
        if (anreVar2 == anre.c) {
            b = antr.a;
        } else if (num != null) {
            if (anreVar2 == anre.b) {
                b = antr.a(num.intValue());
            } else if (anreVar2 == anre.a) {
                b = antr.b(num.intValue());
            } else {
                throw new IllegalStateException("Unknown HpkeParameters.Variant: ".concat(anreVar2.d));
            }
        } else {
            throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant ".concat(anreVar2.d));
        }
        return new anri(anrfVar, aocjVar, b, num);
    }

    @Override // defpackage.anrq
    public final aocj H() {
        return this.g;
    }

    @Override // defpackage.anme
    public final Integer a() {
        return this.h;
    }
}
