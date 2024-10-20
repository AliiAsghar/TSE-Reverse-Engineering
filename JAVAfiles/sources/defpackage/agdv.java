package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdv {
    public final long a;
    public final int b;

    public agdv(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agdv)) {
            return false;
        }
        agdv agdvVar = (agdv) obj;
        if (this.a == agdvVar.a && this.b == agdvVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.A(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "ScrollEvent(time=" + this.a + ", delta=" + this.b + ")";
    }
}
