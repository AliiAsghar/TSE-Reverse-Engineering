package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aejm implements aejo {
    public final Uri a;
    public final Uri b;
    public final String c;

    public aejm(Uri uri, Uri uri2, String str) {
        this.a = uri;
        this.b = uri2;
        this.c = str;
    }

    @Override // defpackage.aejt
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aejm)) {
            return false;
        }
        aejm aejmVar = (aejm) obj;
        if (d.F(this.a, aejmVar.a) && d.F(this.b, aejmVar.b) && d.F(this.c, aejmVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Uri uri = this.b;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Loaded(uri=" + this.a + ", fallbackUri=" + this.b + ", contentDescription=" + this.c + ")";
    }
}
