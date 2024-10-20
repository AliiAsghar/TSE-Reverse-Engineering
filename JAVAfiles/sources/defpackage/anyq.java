package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anyq extends anzn {
    public final anyn e;
    public final aocj f;
    public final aocj g;
    public final Integer h;

    private anyq(anyn anynVar, aocj aocjVar, aocj aocjVar2, Integer num) {
        this.e = anynVar;
        this.f = aocjVar;
        this.g = aocjVar2;
        this.h = num;
    }

    public static anyq G(anym anymVar, aocj aocjVar, Integer num) {
        aocj a;
        anyn anynVar = new anyn(anymVar);
        if (!anymVar.equals(anym.d) && num == null) {
            throw new GeneralSecurityException("For given Variant " + anymVar.e + " the value of idRequirement must be non-null");
        }
        if (anymVar.equals(anym.d) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (aocjVar.a() == 32) {
            anym anymVar2 = anynVar.e;
            if (anymVar2 == anym.d) {
                a = antr.a;
            } else if (anymVar2 != anym.b && anymVar2 != anym.c) {
                if (anymVar2 == anym.a) {
                    a = antr.b(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(anymVar2.e));
                }
            } else {
                a = antr.a(num.intValue());
            }
            return new anyq(anynVar, aocjVar, a, num);
        }
        throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + aocjVar.a());
    }

    @Override // defpackage.anzn
    public final aocj F() {
        return this.g;
    }

    @Override // defpackage.anme
    public final Integer a() {
        return this.h;
    }
}
