package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxz implements mxf {
    public final boolean a;
    public final myz b;
    private final String c;
    private final Uri d;
    private final long e;

    public mxz() {
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
        if (obj instanceof mxz) {
            mxz mxzVar = (mxz) obj;
            if (this.c.equals(mxzVar.c) && this.d.equals(mxzVar.d) && this.e == mxzVar.e && this.a == mxzVar.a) {
                myz myzVar = this.b;
                myz myzVar2 = mxzVar.b;
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
        return this.b;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = ((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode();
        myz myzVar = this.b;
        if (myzVar == null) {
            hashCode = 0;
        } else {
            hashCode = myzVar.hashCode();
        }
        long j = this.e;
        int i2 = hashCode2 * 1000003;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((i2 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i) * (-721379959)) ^ hashCode;
    }

    @Override // defpackage.mym
    public final String j() {
        return this.c;
    }

    public final String toString() {
        myz myzVar = this.b;
        return "BugleUnknownPendingAttachmentContent{contentType=" + this.c + ", uri=" + String.valueOf(this.d) + ", fileSize=" + this.e + ", canRedownload=" + this.a + ", originalUri=null, progress=" + String.valueOf(myzVar) + "}";
    }

    public mxz(String str, Uri uri, long j, boolean z, myz myzVar) {
        this.c = str;
        this.d = uri;
        this.e = j;
        this.a = z;
        this.b = myzVar;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
