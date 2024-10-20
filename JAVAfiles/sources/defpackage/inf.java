package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class inf implements imv {
    public final Uri a;
    public final long b;
    public final myz c;
    private final String d;
    private final ameb e;

    public inf() {
        throw null;
    }

    public static vld k() {
        vld vldVar = new vld((char[]) null);
        vldVar.a = "text/x-vCard";
        vldVar.d = null;
        vldVar.f(0L);
        return vldVar;
    }

    @Override // defpackage.mxf
    public final Uri b() {
        return null;
    }

    @Override // defpackage.mxf
    public final Uri d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        myz myzVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof inf) {
            inf infVar = (inf) obj;
            if (this.d.equals(infVar.d) && this.a.equals(infVar.a) && this.e.equals(infVar.e) && ((myzVar = this.c) != null ? myzVar.equals(infVar.c) : infVar.c == null) && this.b == infVar.b) {
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
        return this.c;
    }

    @Override // defpackage.imv
    public final ameb g() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.e.hashCode();
        myz myzVar = this.c;
        if (myzVar == null) {
            hashCode = 0;
        } else {
            hashCode = myzVar.hashCode();
        }
        long j = this.b;
        return (((hashCode2 * (-721379959)) ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // defpackage.mym
    public final String j() {
        return this.d;
    }

    public final String toString() {
        myz myzVar = this.c;
        ameb amebVar = this.e;
        return "VCardContent{contentType=" + this.d + ", uri=" + String.valueOf(this.a) + ", contentSource=" + String.valueOf(amebVar) + ", originalUri=null, progress=" + String.valueOf(myzVar) + ", fileSize=" + this.b + "}";
    }

    public inf(String str, Uri uri, ameb amebVar, myz myzVar, long j) {
        this.d = str;
        this.a = uri;
        this.e = amebVar;
        this.c = myzVar;
        this.b = j;
    }

    @Override // defpackage.afcs
    public final /* synthetic */ Object fi() {
        return this;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
