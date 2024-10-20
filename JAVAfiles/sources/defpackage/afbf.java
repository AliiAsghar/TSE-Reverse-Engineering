package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afbf {
    public final boolean a;

    public afbf() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afbf) && this.a == ((afbf) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.a);
    }

    public final String toString() {
        return "Flags(useTransparentBordersForMonogramRow=" + this.a + ")";
    }

    public afbf(boolean z) {
        this.a = z;
    }

    public /* synthetic */ afbf(byte[] bArr) {
        this(false);
    }
}
