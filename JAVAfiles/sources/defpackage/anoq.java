package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anoq extends anme {
    public final anos e;
    public final aocj f;
    public final Integer g;

    private anoq(anos anosVar, aocj aocjVar, Integer num) {
        super((byte[]) null);
        this.e = anosVar;
        this.f = aocjVar;
        this.g = num;
    }

    public static anoq F(anos anosVar, Integer num) {
        aocj b;
        anor anorVar = anosVar.f;
        if (anorVar == anor.a) {
            if (num != null) {
                b = aocj.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (anorVar == anor.b) {
            if (num == null) {
                b = aocj.b(new byte[0]);
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(anorVar.c));
        }
        return new anoq(anosVar, b, num);
    }
}
