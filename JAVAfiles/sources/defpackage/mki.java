package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mki implements mkl {
    public final msh a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Uri f;

    public mki(String str, String str2, String str3, msh mshVar, String str4, Uri uri) {
        str.getClass();
        str4.getClass();
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.a = mshVar;
        this.e = str4;
        this.f = uri;
    }

    @Override // defpackage.mkl
    public final Uri a() {
        return this.f;
    }

    @Override // defpackage.mkl
    public final msh b() {
        return this.a;
    }

    @Override // defpackage.mkl
    public final String c() {
        return this.e;
    }

    @Override // defpackage.mkl
    public final /* synthetic */ String d() {
        return this.a.F().toString();
    }

    @Override // defpackage.mkl
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mki)) {
            return false;
        }
        mki mkiVar = (mki) obj;
        if (d.F(this.b, mkiVar.b) && d.F(this.c, mkiVar.c) && d.F(this.d, mkiVar.d) && d.F(this.a, mkiVar.a) && d.F(this.e, mkiVar.e) && d.F(this.f, mkiVar.f)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mkl
    public final String f() {
        return this.b;
    }

    @Override // defpackage.mkl
    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.e.hashCode();
        Uri uri = this.f;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "DefaultSearchContactEntry(id=" + this.b + ", lookupKey=" + this.c + ", displayName=" + this.d + ", destination=" + this.a + ", destinationType=" + this.e + ", photo=" + this.f + ")";
    }
}
