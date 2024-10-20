package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imy implements imv, myk {
    public final String a;
    public final String b;
    public final long c;
    private final Uri d;
    private final ameb e;

    public imy() {
        throw null;
    }

    @Override // defpackage.mxf
    public final Uri b() {
        return null;
    }

    @Override // defpackage.mxf
    public final Uri d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof imy) {
            imy imyVar = (imy) obj;
            if (this.a.equals(imyVar.a) && this.d.equals(imyVar.d) && this.e.equals(imyVar.e) && this.b.equals(imyVar.b) && this.c == imyVar.c) {
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
        return this.e;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return ((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * (-721379959);
    }

    @Override // defpackage.mym
    public final String j() {
        return this.a;
    }

    @Override // defpackage.myk
    public final long k() {
        return this.c;
    }

    @Override // defpackage.myk
    public final String l() {
        return this.b;
    }

    public final String toString() {
        ameb amebVar = this.e;
        return "FileContent{contentType=" + this.a + ", uri=" + String.valueOf(this.d) + ", contentSource=" + String.valueOf(amebVar) + ", fileName=" + this.b + ", fileSize=" + this.c + ", originalUri=null, progress=null}";
    }

    public imy(String str, Uri uri, ameb amebVar, String str2, long j) {
        this.a = str;
        this.d = uri;
        this.e = amebVar;
        this.b = str2;
        this.c = j;
    }

    @Override // defpackage.afcs
    public final /* synthetic */ Object fi() {
        return this;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
