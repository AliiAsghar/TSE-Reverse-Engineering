package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class astm {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;

    public astm(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        if (i > bigInteger.bitLength() && !atde.b("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.a = bigInteger2;
        this.b = bigInteger;
        this.c = bigInteger3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof astm)) {
            return false;
        }
        astm astmVar = (astm) obj;
        BigInteger bigInteger = this.c;
        if (bigInteger != null) {
            if (!bigInteger.equals(astmVar.c)) {
                return false;
            }
        } else if (astmVar.c != null) {
            return false;
        }
        if (!astmVar.b.equals(this.b) || !astmVar.a.equals(this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() ^ this.a.hashCode();
        BigInteger bigInteger = this.c;
        if (bigInteger != null) {
            i = bigInteger.hashCode();
        } else {
            i = 0;
        }
        return hashCode ^ i;
    }
}
