package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jns implements jnr, myt {
    public final afqc a;
    private final Uri b;
    private final String c = null;

    public jns(afqc afqcVar, Uri uri) {
        this.a = afqcVar;
        this.b = uri;
    }

    @Override // defpackage.mxf
    public final Uri b() {
        return null;
    }

    @Override // defpackage.mxf
    public final Uri d() {
        Uri uri = this.b;
        if (uri == null) {
            Uri parse = Uri.parse(this.a.b);
            parse.getClass();
            return parse;
        }
        return uri;
    }

    @Override // defpackage.myt
    public final Size e() {
        afqc afqcVar = this.a;
        return new Size(afqcVar.f, afqcVar.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jns)) {
            return false;
        }
        jns jnsVar = (jns) obj;
        if (!d.F(this.a, jnsVar.a) || !d.F(this.b, jnsVar.b)) {
            return false;
        }
        String str = jnsVar.c;
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
    public final /* bridge */ /* synthetic */ myz fl() {
        return null;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Uri uri = this.b;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return (hashCode2 + hashCode) * 31;
    }

    @Override // defpackage.myt
    public final String i() {
        return null;
    }

    @Override // defpackage.mym
    public final String j() {
        return afwv.L(this.a.e).a();
    }

    public final String toString() {
        String str;
        Uri uri = this.b;
        if (uri != null) {
            str = yyb.bf(uri);
        } else {
            str = null;
        }
        return "MapiCustomStickerContent(sticker=" + this.a + ", copy=" + str + ", caption=null)";
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
