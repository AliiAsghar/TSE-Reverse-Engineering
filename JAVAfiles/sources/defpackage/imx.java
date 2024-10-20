package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imx implements imv, myt {
    public final String a;
    public final Uri b;
    public final ameb c;
    public final Size d;
    public final String e;

    public imx() {
        throw null;
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
        if (obj == this) {
            return true;
        }
        if (obj instanceof imx) {
            imx imxVar = (imx) obj;
            if (this.a.equals(imxVar.a) && this.b.equals(imxVar.b) && this.c.equals(imxVar.c) && this.d.equals(imxVar.d) && this.e.equals(imxVar.e)) {
                return true;
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
        return this.c;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * (-721379959)) ^ this.e.hashCode()) * (-721379959);
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
        Size size = this.d;
        ameb amebVar = this.c;
        return "ExpressiveStickerContent{contentType=" + this.a + ", uri=" + String.valueOf(this.b) + ", contentSource=" + String.valueOf(amebVar) + ", size=" + String.valueOf(size) + ", caption=null, stickerName=" + this.e + ", originalUri=null, progress=null}";
    }

    public imx(String str, Uri uri, ameb amebVar, Size size, String str2) {
        this.a = str;
        this.b = uri;
        this.c = amebVar;
        this.d = size;
        this.e = str2;
    }

    @Override // defpackage.afcs
    public final /* synthetic */ Object fi() {
        return this;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
