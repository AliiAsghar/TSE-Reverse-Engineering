package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anou extends anme {
    public final anox e;
    public final aocj f;
    public final Integer g;

    private anou(anox anoxVar, aocj aocjVar, Integer num) {
        super((byte[]) null);
        this.e = anoxVar;
        this.f = aocjVar;
        this.g = num;
    }

    public static anou F(anox anoxVar, Integer num) {
        aocj b;
        anow anowVar = anoxVar.e;
        if (anowVar == anow.b) {
            if (num == null) {
                b = antr.a;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (anowVar == anow.a) {
            if (num != null) {
                b = antr.b(num.intValue());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(anowVar.c));
        }
        return new anou(anoxVar, b, num);
    }
}
