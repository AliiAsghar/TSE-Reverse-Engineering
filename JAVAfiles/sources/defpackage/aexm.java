package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexm implements aexn {
    public final aexh a;
    public final Uri b;
    public final Float c;
    public final arqg d;

    public aexm(aexh aexhVar, Uri uri, Float f, arqg arqgVar) {
        aexhVar.getClass();
        this.a = aexhVar;
        this.b = uri;
        this.c = f;
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
        if (!(obj instanceof aexm)) {
            return false;
        }
        aexm aexmVar = (aexm) obj;
        if (this.a == aexmVar.a && d.F(this.b, aexmVar.b) && d.F(this.c, aexmVar.c) && d.F(this.d, aexmVar.d)) {
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
        Float f = this.c;
        if (f != null) {
            i = f.hashCode();
        }
        return ((i2 + i) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Loading(type=" + this.a + ", uri=" + this.b + ", progress=" + this.c + ", onClick=" + this.d + ")";
    }
}
