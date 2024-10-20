package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnw implements myp, jnr {
    private final Uri a;
    private final String b;
    private final double c;
    private final double d;

    public jnw(Uri uri, String str, double d, double d2) {
        this.a = uri;
        this.b = str;
        this.c = d;
        this.d = d2;
    }

    @Override // defpackage.mxf
    public final Uri b() {
        return null;
    }

    @Override // defpackage.mxf
    public final Uri d() {
        return this.a;
    }

    @Override // defpackage.myt
    public final Size e() {
        return new Size(800, 400);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnw)) {
            return false;
        }
        jnw jnwVar = (jnw) obj;
        if (d.F(this.a, jnwVar.a) && d.F(this.b, jnwVar.b) && Double.compare(this.c, jnwVar.c) == 0 && Double.compare(this.d, jnwVar.d) == 0) {
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
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + d.aI(this.c)) * 31) + d.aI(this.d);
    }

    @Override // defpackage.myt
    public final /* bridge */ /* synthetic */ String i() {
        return null;
    }

    @Override // defpackage.mym
    public final String j() {
        return "application/vnd.gsma.rcspushlocation+xml";
    }

    @Override // defpackage.myp
    public final double l() {
        return this.c;
    }

    @Override // defpackage.myp
    public final double m() {
        return this.d;
    }

    @Override // defpackage.myp
    public final String n() {
        return this.b;
    }

    public final String toString() {
        double d = this.d;
        String str = this.b;
        return "MapiRichLocationContent(uri=" + yyb.bf(this.a) + ", captionText=" + ((Object) yyb.be(str)) + ", longitude=" + ((Object) yyb.be(String.valueOf(d))) + ", latitude=" + ((Object) yyb.be(String.valueOf(this.c))) + ")";
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
