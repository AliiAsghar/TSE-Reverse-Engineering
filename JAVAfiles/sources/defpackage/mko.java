package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mko implements mkl {
    private final String a;
    private final String b;
    private final String c;
    private final msh d;
    private final String e;
    private final String f;
    private final Uri g;

    public mko(String str, String str2, String str3, msh mshVar, String str4, String str5, Uri uri) {
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = mshVar;
        this.e = str4;
        this.f = str5;
        this.g = uri;
    }

    @Override // defpackage.mkl
    public final Uri a() {
        return this.g;
    }

    @Override // defpackage.mkl
    public final msh b() {
        return this.d;
    }

    @Override // defpackage.mkl
    public final String c() {
        return this.e;
    }

    @Override // defpackage.mkl
    public final String d() {
        return this.f;
    }

    @Override // defpackage.mkl
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mko)) {
            return false;
        }
        mko mkoVar = (mko) obj;
        if (d.F(this.a, mkoVar.a) && d.F(this.b, mkoVar.b) && d.F(this.c, mkoVar.c) && d.F(this.d, mkoVar.d) && d.F(this.e, mkoVar.e) && d.F(this.f, mkoVar.f) && d.F(this.g, mkoVar.g)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mkl
    public final String f() {
        return this.a;
    }

    @Override // defpackage.mkl
    public final String g() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        Uri uri = this.g;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "IcingSearchContactEntry(id=" + this.a + ", lookupKey=" + this.b + ", displayName=" + this.c + ", destination=" + this.d + ", destinationType=" + this.e + ", displayDestination=" + this.f + ", uri=" + this.g + ")";
    }
}
