package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbf {
    public final boolean a;
    private final boolean b;

    public zbf() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbf)) {
            return false;
        }
        zbf zbfVar = (zbf) obj;
        if (this.b == zbfVar.b && this.a == zbfVar.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.v(this.b) * 31) + a.v(this.a);
    }

    public final String toString() {
        return "Flags(useTransparentBordersForMonogramRow=" + this.b + ", preventDuplicateGroupName=" + this.a + ")";
    }

    public zbf(boolean z, boolean z2) {
        this.b = z;
        this.a = z2;
    }

    public /* synthetic */ zbf(byte[] bArr) {
        this(false, false);
    }
}
