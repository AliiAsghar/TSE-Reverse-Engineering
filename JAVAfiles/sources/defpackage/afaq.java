package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afaq {
    public final boolean a;

    public afaq() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afaq) && this.a == ((afaq) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.a);
    }

    public final String toString() {
        return "Flags(useLargerMonogramSize=" + this.a + ")";
    }

    public afaq(boolean z) {
        this.a = z;
    }

    public /* synthetic */ afaq(byte[] bArr) {
        this(true);
    }
}
