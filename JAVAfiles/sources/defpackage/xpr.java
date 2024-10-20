package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xpr {
    public final String a;

    public xpr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xpr) {
            return this.a.equals(((xpr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "DownloadResult{downloadId=" + this.a + "}";
    }

    public xpr(String str) {
        this.a = str;
    }
}
