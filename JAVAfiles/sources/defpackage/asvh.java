package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asvh implements asvd {
    protected final BigInteger a;

    public asvh(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asvh)) {
            return false;
        }
        return this.a.equals(((asvh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
