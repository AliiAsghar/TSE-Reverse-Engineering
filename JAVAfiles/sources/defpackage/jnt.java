package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnt implements myk, jnr {
    private final String a;
    private final Uri b;
    private final Uri c;
    private final String d;
    private final long e;

    public jnt(String str, Uri uri, String str2, long j) {
        str.getClass();
        this.a = str;
        this.b = uri;
        this.c = null;
        this.d = str2;
        this.e = j;
    }

    @Override // defpackage.mxf
    public final Uri b() {
        return null;
    }

    @Override // defpackage.mxf
    public final Uri d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnt)) {
            return false;
        }
        jnt jntVar = (jnt) obj;
        if (!d.F(this.a, jntVar.a) || !d.F(this.b, jntVar.b)) {
            return false;
        }
        Uri uri = jntVar.c;
        if (d.F(null, null) && d.F(this.d, jntVar.d) && this.e == jntVar.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ boolean fk() {
        return lga.aE(this);
    }

    @Override // defpackage.mxf
    public final myz fl() {
        return null;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.d.hashCode()) * 31) + a.A(this.e);
    }

    @Override // defpackage.mym
    public final String j() {
        return this.a;
    }

    @Override // defpackage.myk
    public final long k() {
        return this.e;
    }

    @Override // defpackage.myk
    public final String l() {
        return this.d;
    }

    public final String toString() {
        String str = this.d;
        return "MapiFileContent(contentType=" + this.a + ", uri=" + yyb.bf(this.b) + ", originalUri=null, fileName=" + ((Object) yyb.be(str)) + ", fileSize=" + this.e + ")";
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
