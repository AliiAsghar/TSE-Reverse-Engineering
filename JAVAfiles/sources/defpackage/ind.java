package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ind implements imv, myp {
    public final String a;
    public final double b;
    public final double c;
    private final String d;
    private final Uri e;
    private final ameb f;
    private final Size g;

    public ind() {
        throw null;
    }

    public static inc k() {
        inc incVar = new inc();
        incVar.a = "application/vnd.gsma.rcspushlocation+xml";
        return incVar;
    }

    @Override // defpackage.mxf
    public final Uri b() {
        return null;
    }

    @Override // defpackage.mxf
    public final Uri d() {
        return this.e;
    }

    @Override // defpackage.myt
    public final Size e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ind) {
            ind indVar = (ind) obj;
            if (this.d.equals(indVar.d) && this.e.equals(indVar.e) && this.f.equals(indVar.f) && this.g.equals(indVar.g) && this.a.equals(indVar.a)) {
                if (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(indVar.b)) {
                    if (Double.doubleToLongBits(this.c) == Double.doubleToLongBits(indVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.afcq
    public final /* synthetic */ afcp fh() {
        return hwr.m(this);
    }

    @Override // defpackage.afcq
    public final /* synthetic */ String fj() {
        return toString();
    }

    @Override // defpackage.mxf
    public final /* synthetic */ boolean fk() {
        return lga.aE(this);
    }

    @Override // defpackage.mxf
    public final myz fl() {
        return null;
    }

    @Override // defpackage.imv
    public final ameb g() {
        return this.f;
    }

    public final int hashCode() {
        return (((((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c)))) * 583896283;
    }

    @Override // defpackage.myt
    public final String i() {
        return null;
    }

    @Override // defpackage.mym
    public final String j() {
        return this.d;
    }

    @Override // defpackage.myp
    public final double l() {
        return this.c;
    }

    @Override // defpackage.myp
    public final double m() {
        return this.b;
    }

    @Override // defpackage.myp
    public final String n() {
        return this.a;
    }

    public final String toString() {
        Size size = this.g;
        ameb amebVar = this.f;
        return "LocationContent{contentType=" + this.d + ", uri=" + String.valueOf(this.e) + ", contentSource=" + String.valueOf(amebVar) + ", size=" + String.valueOf(size) + ", captionText=" + this.a + ", longitude=" + this.b + ", latitude=" + this.c + ", originalUri=null, progress=null, caption=null}";
    }

    public ind(String str, Uri uri, ameb amebVar, Size size, String str2, double d, double d2) {
        this.d = str;
        this.e = uri;
        this.f = amebVar;
        this.g = size;
        this.a = str2;
        this.b = d;
        this.c = d2;
    }

    @Override // defpackage.afcs
    public final /* synthetic */ Object fi() {
        return this;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
