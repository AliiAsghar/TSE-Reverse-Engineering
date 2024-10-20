package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxm implements myk {
    private final String a;
    private final Uri b;
    private final String c;
    private final long d;
    private final myz e;

    public mxm() {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxm) {
            mxm mxmVar = (mxm) obj;
            if (this.a.equals(mxmVar.a) && this.b.equals(mxmVar.b) && this.c.equals(mxmVar.c) && this.d == mxmVar.d) {
                myz myzVar = this.e;
                myz myzVar2 = mxmVar.e;
                if (myzVar != null ? myzVar.equals(myzVar2) : myzVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ boolean fk() {
        return lga.aE(this);
    }

    @Override // defpackage.mxf
    public final myz fl() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        myz myzVar = this.e;
        if (myzVar == null) {
            hashCode = 0;
        } else {
            hashCode = myzVar.hashCode();
        }
        long j = this.d;
        return (((hashCode2 * 1000003) ^ ((int) (j ^ (j >>> 32)))) * (-721379959)) ^ hashCode;
    }

    @Override // defpackage.mym
    public final String j() {
        return this.a;
    }

    @Override // defpackage.myk
    public final long k() {
        return this.d;
    }

    @Override // defpackage.myk
    public final String l() {
        return this.c;
    }

    public final String toString() {
        myz myzVar = this.e;
        return "BugleFileContent{contentType=" + this.a + ", uri=" + String.valueOf(this.b) + ", fileName=" + this.c + ", fileSize=" + this.d + ", originalUri=null, progress=" + String.valueOf(myzVar) + "}";
    }

    public mxm(String str, Uri uri, String str2, long j, myz myzVar) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = j;
        this.e = myzVar;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
