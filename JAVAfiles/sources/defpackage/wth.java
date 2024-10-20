package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wth {
    public final boolean a;
    public final String b;

    public wth(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wth)) {
            return false;
        }
        wth wthVar = (wth) obj;
        if (this.a == wthVar.a && d.F(this.b, wthVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (a.v(this.a) * 31) + hashCode;
    }

    public final String toString() {
        return "ScreenDetectionResult(isProbablyActive=" + this.a + ", packageName=" + this.b + ")";
    }

    public /* synthetic */ wth(boolean z) {
        this(z, null);
    }
}
