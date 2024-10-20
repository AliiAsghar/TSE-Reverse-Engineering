package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbw {
    public final int a;
    public final int b;

    public zbw(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbw)) {
            return false;
        }
        zbw zbwVar = (zbw) obj;
        if (this.a == zbwVar.a && this.b == zbwVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "GroupLimitExcludingSelf(mmsGroupLimit=" + this.a + ", rcsGroupLimit=" + this.b + ")";
    }

    public zbw() {
        this(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
}
