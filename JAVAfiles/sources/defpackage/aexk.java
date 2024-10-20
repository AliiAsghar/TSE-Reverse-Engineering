package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexk implements aexn {
    public final arqg a;
    public final arqg b;
    private final Uri c;

    public aexk(Uri uri, arqg arqgVar, arqg arqgVar2) {
        this.c = uri;
        this.a = arqgVar;
        this.b = arqgVar2;
        aexh aexhVar = aexh.a;
    }

    @Override // defpackage.aexn
    public final Uri a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aexk)) {
            return false;
        }
        aexk aexkVar = (aexk) obj;
        if (d.F(this.c, aexkVar.c) && d.F(this.a, aexkVar.a) && d.F(this.b, aexkVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LoadedImage(uri=" + this.c + ", onError=" + this.a + ", onClick=" + this.b + ")";
    }
}
