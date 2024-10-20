package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnu implements myt, jnr {
    private final String a;
    private final Uri b;
    private final Uri c;
    private final Size d;
    private final String e;

    public jnu(String str, Uri uri, Size size) {
        str.getClass();
        this.a = str;
        this.b = uri;
        this.c = null;
        this.d = size;
        this.e = null;
    }

    @Override // defpackage.mxf
    public final Uri b() {
        return null;
    }

    @Override // defpackage.mxf
    public final Uri d() {
        return this.b;
    }

    @Override // defpackage.myt
    public final Size e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnu)) {
            return false;
        }
        jnu jnuVar = (jnu) obj;
        if (!d.F(this.a, jnuVar.a) || !d.F(this.b, jnuVar.b)) {
            return false;
        }
        Uri uri = jnuVar.c;
        if (!d.F(null, null) || !d.F(this.d, jnuVar.d)) {
            return false;
        }
        String str = jnuVar.e;
        if (d.F(null, null)) {
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
        return ((((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.d.hashCode()) * 31;
    }

    @Override // defpackage.myt
    public final String i() {
        return null;
    }

    @Override // defpackage.mym
    public final String j() {
        return this.a;
    }

    public final String toString() {
        return "MapiGifContent(contentType=" + this.a + ", uri=" + yyb.bf(this.b) + ", originalUri=null, size=" + this.d + ", caption=null)";
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
