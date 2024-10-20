package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class icp {
    public final int a;
    public final int b;
    public final int c;

    public icp() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icp)) {
            return false;
        }
        icp icpVar = (icp) obj;
        if (this.a == icpVar.a && this.b == icpVar.b && this.c == icpVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "BugleDatabaseAssetInfo(messageCount=" + this.a + ", conversationCount=" + this.b + ", attachmentCount=" + this.c + ")";
    }

    public icp(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public /* synthetic */ icp(byte[] bArr) {
        this(0, 0, 0);
    }
}
