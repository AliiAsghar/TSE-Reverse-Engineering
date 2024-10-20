package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anoj extends anme {
    public final anom e;
    public final aocj f;
    public final Integer g;
    public final aojh h;

    private anoj(anom anomVar, aojh aojhVar, aocj aocjVar, Integer num) {
        super((byte[]) null);
        this.e = anomVar;
        this.h = aojhVar;
        this.f = aocjVar;
        this.g = num;
    }

    public static anoj F(anol anolVar, aojh aojhVar, Integer num) {
        aocj b;
        anol anolVar2 = anol.c;
        if (anolVar != anolVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + anolVar.d + " the value of idRequirement must be non-null");
        }
        if (anolVar == anolVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (aojhVar.x() == 32) {
            anom anomVar = new anom(anolVar);
            anol anolVar3 = anomVar.e;
            if (anolVar3 == anolVar2) {
                b = antr.a;
            } else if (anolVar3 == anol.b) {
                b = antr.a(num.intValue());
            } else if (anolVar3 == anol.a) {
                b = antr.b(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(anolVar3.d));
            }
            return new anoj(anomVar, aojhVar, b, num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aojhVar.x());
    }
}
