package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmk implements lkf {
    public final Uri a;
    public final String b;
    public final String c;
    public final long d;
    public final boolean e;

    public lmk(Uri uri, String str, String str2, long j, boolean z) {
        str.getClass();
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmk)) {
            return false;
        }
        lmk lmkVar = (lmk) obj;
        if (d.F(this.a, lmkVar.a) && d.F(this.b, lmkVar.b) && d.F(this.c, lmkVar.c) && this.d == lmkVar.d && this.e == lmkVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.A(this.d)) * 31) + a.v(this.e);
    }

    public final String toString() {
        return "FileViewer(fileUri=" + this.a + ", contentType=" + this.b + ", fileName=" + this.c + ", fileSize=" + this.d + ", saveUnsupportedFile=" + this.e + ")";
    }
}
