package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imo implements imv {
    public final Uri a;
    public final long b;
    public final aggp c;
    private final String d;
    private final ameb e;

    public imo() {
        throw null;
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
        if (obj == this) {
            return true;
        }
        if (obj instanceof imo) {
            imo imoVar = (imo) obj;
            if (this.d.equals(imoVar.d) && this.a.equals(imoVar.a) && this.e.equals(imoVar.e) && this.b == imoVar.b && this.c.equals(imoVar.c)) {
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
        int hashCode = ((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.e.hashCode();
        long j = this.b;
        return ((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * (-721379959);
    }

    @Override // defpackage.mym
    public final String j() {
        return this.d;
    }

    public final String toString() {
        aggp aggpVar = this.c;
        ameb amebVar = this.e;
        return "AudioContent{contentType=" + this.d + ", uri=" + String.valueOf(this.a) + ", contentSource=" + String.valueOf(amebVar) + ", duration=" + this.b + ", voiceMetadata=" + String.valueOf(aggpVar) + ", originalUri=null, progress=null}";
    }

    public imo(String str, Uri uri, ameb amebVar, long j, aggp aggpVar) {
        this.d = str;
        this.a = uri;
        this.e = amebVar;
        this.b = j;
        this.c = aggpVar;
    }

    @Override // defpackage.afcs
    public final /* synthetic */ Object fi() {
        return this;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
