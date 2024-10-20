package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzw {
    public final boolean a;
    public final int b;

    public jzw() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzw)) {
            return false;
        }
        jzw jzwVar = (jzw) obj;
        if (this.a == jzwVar.a && this.b == jzwVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.v(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "Flags(splitTallText=" + this.a + ", stricterSplittingForTallTextMessagesLimit=" + this.b + ")";
    }

    public jzw(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public /* synthetic */ jzw(byte[] bArr) {
        this(false, 5000);
    }
}
