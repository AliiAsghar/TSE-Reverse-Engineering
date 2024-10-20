package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rkc {
    public final boolean a;

    public rkc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rkc) && this.a == ((rkc) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.a);
    }

    public final String toString() {
        return "BackupParameters(includeC2pData=" + this.a + ")";
    }
}
