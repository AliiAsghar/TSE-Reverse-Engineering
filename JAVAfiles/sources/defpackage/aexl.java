package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexl implements aexn {
    public final String a;
    public final arqg b;
    public final arqg c;
    private final Uri d;

    public aexl(Uri uri, String str, arqg arqgVar, arqg arqgVar2) {
        this.d = uri;
        this.a = str;
        this.b = arqgVar;
        this.c = arqgVar2;
        aexh aexhVar = aexh.a;
    }

    @Override // defpackage.aexn
    public final Uri a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aexl)) {
            return false;
        }
        aexl aexlVar = (aexl) obj;
        if (d.F(this.d, aexlVar.d) && d.F(this.a, aexlVar.a) && d.F(this.b, aexlVar.b) && d.F(this.c, aexlVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.d.hashCode() * 31;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LoadedVideo(uri=" + this.d + ", duration=" + this.a + ", onError=" + this.b + ", onClick=" + this.c + ")";
    }
}
