package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexi implements aexn {
    public final aexh a;
    public final Uri b;
    public final String c;
    public final arqg d;

    public aexi(aexh aexhVar, Uri uri, String str, arqg arqgVar) {
        aexhVar.getClass();
        this.a = aexhVar;
        this.b = uri;
        this.c = str;
        this.d = arqgVar;
    }

    @Override // defpackage.aexn
    public final Uri a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aexi)) {
            return false;
        }
        aexi aexiVar = (aexi) obj;
        if (this.a == aexiVar.a && d.F(this.b, aexiVar.b) && d.F(this.c, aexiVar.c) && d.F(this.d, aexiVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Uri uri = this.b;
        int i = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return ((i2 + i) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Downloadable(type=" + this.a + ", uri=" + this.b + ", label=" + this.c + ", onClick=" + this.d + ")";
    }
}
