package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anpj extends anme {
    public final anpm e;
    public final aocj f;
    public final Integer g;
    public final aojh h;

    private anpj(anpm anpmVar, aojh aojhVar, aocj aocjVar, Integer num) {
        super((byte[]) null);
        this.e = anpmVar;
        this.h = aojhVar;
        this.f = aocjVar;
        this.g = num;
    }

    public static anpj F(anpl anplVar, aojh aojhVar, Integer num) {
        aocj b;
        anpl anplVar2 = anpl.c;
        if (anplVar != anplVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + anplVar.d + " the value of idRequirement must be non-null");
        }
        if (anplVar == anplVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (aojhVar.x() == 32) {
            anpm anpmVar = new anpm(anplVar);
            anpl anplVar3 = anpmVar.e;
            if (anplVar3 == anplVar2) {
                b = antr.a;
            } else if (anplVar3 == anpl.b) {
                b = antr.a(num.intValue());
            } else if (anplVar3 == anpl.a) {
                b = antr.b(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(anplVar3.d));
            }
            return new anpj(anpmVar, aojhVar, b, num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aojhVar.x());
    }
}
