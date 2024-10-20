package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anpf extends anme {
    public final anpi e;
    public final aocj f;
    public final Integer g;
    public final aojh h;

    private anpf(anpi anpiVar, aojh aojhVar, aocj aocjVar, Integer num) {
        super((byte[]) null);
        this.e = anpiVar;
        this.h = aojhVar;
        this.f = aocjVar;
        this.g = num;
    }

    public static anpf F(anpi anpiVar, aojh aojhVar, Integer num) {
        aocj b;
        anph anphVar = anpiVar.e;
        anph anphVar2 = anph.b;
        if (anphVar != anphVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + anphVar.c + " the value of idRequirement must be non-null");
        }
        if (anphVar == anphVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (aojhVar.x() == 32) {
            if (anphVar == anphVar2) {
                b = antr.a;
            } else if (anphVar == anph.a) {
                b = antr.b(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(anphVar.c));
            }
            return new anpf(anpiVar, aojhVar, b, num);
        }
        throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + aojhVar.x());
    }
}
