package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aevf {
    public final boolean a;

    public aevf() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aevf) && this.a == ((aevf) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.a);
    }

    public final String toString() {
        return "Flags(useNewUx=" + this.a + ")";
    }

    public aevf(boolean z) {
        this.a = z;
    }

    public /* synthetic */ aevf(byte[] bArr) {
        this(false);
    }
}
