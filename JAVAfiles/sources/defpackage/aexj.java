package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexj implements aexn {
    public final aexh a;
    public final arqg b;
    private final Uri c;

    public aexj(aexh aexhVar, Uri uri, arqg arqgVar) {
        aexhVar.getClass();
        this.a = aexhVar;
        this.c = uri;
        this.b = arqgVar;
    }

    @Override // defpackage.aexn
    public final Uri a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aexj)) {
            return false;
        }
        aexj aexjVar = (aexj) obj;
        if (this.a == aexjVar.a && d.F(this.c, aexjVar.c) && d.F(this.b, aexjVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Uri uri = this.c;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Error(type=" + this.a + ", uri=" + this.c + ", onClick=" + this.b + ")";
    }
}
