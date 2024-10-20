package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jop {
    public final long a;
    public final long b;

    public jop(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jop)) {
            return false;
        }
        jop jopVar = (jop) obj;
        if (this.a == jopVar.a && this.b == jopVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.A(this.a) * 31) + a.A(this.b);
    }

    public final String toString() {
        return "AttachmentSize(currentSizeBytes=" + this.a + ", finalSizeBytes=" + this.b + ")";
    }
}
