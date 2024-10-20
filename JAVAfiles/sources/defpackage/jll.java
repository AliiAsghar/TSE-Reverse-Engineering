package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jll implements jln {
    public final String a;

    public jll(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jll) && d.F(this.a, ((jll) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Discard(textCaption=" + this.a + ")";
    }
}
