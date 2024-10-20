package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jqz {
    public final boolean a;
    public final long b;

    public jqz(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqz)) {
            return false;
        }
        jqz jqzVar = (jqz) obj;
        if (this.a == jqzVar.a && this.b == jqzVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.v(this.a) * 31) + a.A(this.b);
    }

    public final String toString() {
        return "InfoData(useInfoTooltip=" + this.a + ", maxMessageSizeBytes=" + this.b + ")";
    }
}
