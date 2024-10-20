package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class inb implements imv, myt {
    public final String a;
    public final Uri b;
    private final String c;
    private final Uri d;
    private final ameb e;
    private final Size f;

    public inb() {
        throw null;
    }

    @Override // defpackage.mxf
    public final Uri b() {
        return this.b;
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
        if (obj == this) {
            return true;
        }
        if (obj instanceof inb) {
            inb inbVar = (inb) obj;
            if (this.c.equals(inbVar.c) && this.d.equals(inbVar.d) && this.e.equals(inbVar.e) && this.f.equals(inbVar.f) && this.a.equals(inbVar.a)) {
                Uri uri = this.b;
                Uri uri2 = inbVar.b;
                if (uri != null ? uri.equals(uri2) : uri2 == null) {
                    return true;
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
        return this.e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.a.hashCode();
        Uri uri = this.b;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return ((hashCode2 * 1000003) ^ hashCode) * (-721379959);
    }

    @Override // defpackage.myt
    public final String i() {
        return null;
    }

    @Override // defpackage.mym
    public final String j() {
        return this.c;
    }

    public final String toString() {
        Uri uri = this.b;
        Size size = this.f;
        ameb amebVar = this.e;
        return "GifContent{contentType=" + this.c + ", uri=" + String.valueOf(this.d) + ", contentSource=" + String.valueOf(amebVar) + ", size=" + String.valueOf(size) + ", domain=" + this.a + ", originalUri=" + String.valueOf(uri) + ", progress=null, caption=null}";
    }

    public inb(String str, Uri uri, ameb amebVar, Size size, String str2, Uri uri2) {
        this.c = str;
        this.d = uri;
        this.e = amebVar;
        this.f = size;
        this.a = str2;
        this.b = uri2;
    }

    @Override // defpackage.afcs
    public final /* synthetic */ Object fi() {
        return this;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
