package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asto {
    public final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;
    public final astp d;

    public asto(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, astp astpVar) {
        this.a = bigInteger3;
        this.c = bigInteger;
        this.b = bigInteger2;
        this.d = astpVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof asto)) {
            return false;
        }
        asto astoVar = (asto) obj;
        if (!astoVar.c.equals(this.c) || !astoVar.b.equals(this.b) || !astoVar.a.equals(this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ this.b.hashCode()) ^ this.a.hashCode();
    }
}
