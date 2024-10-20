package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnv implements myn, jnr {
    public final boolean a;
    public final boolean b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final Size f;
    private final String g;
    private final Instant h;
    private final pyz i;
    private final int j;

    public jnv(String str, Uri uri, Uri uri2, Size size, String str2, Instant instant, boolean z, boolean z2, int i) {
        str.getClass();
        if (i != 0) {
            this.c = str;
            this.d = uri;
            this.e = uri2;
            this.f = size;
            this.g = str2;
            this.h = instant;
            this.a = z;
            this.b = z2;
            this.i = null;
            this.j = i;
            return;
        }
        throw null;
    }

    @Override // defpackage.myn
    public final long a() {
        return this.h.toEpochMilli();
    }

    @Override // defpackage.mxf
    public final Uri b() {
        return this.e;
    }

    @Override // defpackage.myn
    public final /* bridge */ /* synthetic */ Uri c() {
        return null;
    }

    @Override // defpackage.mxf
    public final Uri d() {
        return this.d;
    }

    @Override // defpackage.myt
    public final Size e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnv)) {
            return false;
        }
        jnv jnvVar = (jnv) obj;
        if (!d.F(this.c, jnvVar.c) || !d.F(this.d, jnvVar.d) || !d.F(this.e, jnvVar.e) || !d.F(this.f, jnvVar.f) || !d.F(this.g, jnvVar.g) || !d.F(this.h, jnvVar.h) || this.a != jnvVar.a || this.b != jnvVar.b) {
            return false;
        }
        pyz pyzVar = jnvVar.i;
        if (d.F(null, null) && this.j == jnvVar.j) {
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

    @Override // defpackage.myn
    public final Optional h() {
        return Optional.empty();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() * 31) + this.d.hashCode();
        Uri uri = this.e;
        int i = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int hashCode3 = ((((hashCode2 * 31) + hashCode) * 31) + this.f.hashCode()) * 31;
        String str = this.g;
        if (str != null) {
            i = str.hashCode();
        }
        int hashCode4 = (((((((hashCode3 + i) * 31) + this.h.hashCode()) * 31) + a.v(this.a)) * 31) + a.v(this.b)) * 961;
        int i2 = this.j;
        a.aS(i2);
        return hashCode4 + i2;
    }

    @Override // defpackage.myt
    public final String i() {
        return this.g;
    }

    @Override // defpackage.mym
    public final String j() {
        return this.c;
    }

    @Override // defpackage.myn
    public final boolean k() {
        return this.a;
    }

    @Override // defpackage.myn
    public final boolean l() {
        return this.b;
    }

    @Override // defpackage.myn
    public final int m() {
        return this.j;
    }

    public final String toString() {
        String str;
        Uri uri = this.e;
        String bf = yyb.bf(this.d);
        CharSequence charSequence = null;
        if (uri != null) {
            str = yyb.bf(uri);
        } else {
            str = null;
        }
        Size size = this.f;
        String str2 = this.g;
        if (str2 != null) {
            charSequence = yyb.be(str2);
        }
        return "MapiImageContent(contentType=" + this.c + ", uri=" + bf + ", originalUri=" + str + ", size=" + size + ", caption=" + ((Object) charSequence) + ", mediaModifiedTimestamp=" + this.h + ", isResizable=" + this.a + ", saveToExternalStorage=" + this.b + "(), processingId=null";
    }

    @Override // defpackage.mxf
    public final void fm() {
    }
}
