package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhs {
    public final long a;
    public final int b;
    public final boolean c;

    public jhs(long j, int i, boolean z) {
        this.a = j;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhs)) {
            return false;
        }
        jhs jhsVar = (jhs) obj;
        if (this.a == jhsVar.a && this.b == jhsVar.b && this.c == jhsVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((a.A(this.a) * 31) + this.b) * 31) + a.v(this.c);
    }

    public final String toString() {
        return "ComposeConstraintsTransportCapabilityData(maxMessageSizeBytes=" + this.a + ", textLengthLimit=" + this.b + ", hasActiveSelfIdentity=" + this.c + ")";
    }
}
