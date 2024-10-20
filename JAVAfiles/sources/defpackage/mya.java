package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mya implements mxf {
    private final String a;
    private final Uri b;
    private final myz c;

    public mya() {
        throw null;
    }

    public static pa a() {
        pa paVar = new pa((char[]) null);
        paVar.c = null;
        return paVar;
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
        if (obj instanceof mya) {
            mya myaVar = (mya) obj;
            if (this.a.equals(myaVar.a) && this.b.equals(myaVar.b)) {
                myz myzVar = this.c;
                myz myzVar2 = myaVar.c;
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
        return this.c;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        myz myzVar = this.c;
        if (myzVar == null) {
            hashCode = 0;
        } else {
            hashCode = myzVar.hashCode();
        }
        return (hashCode2 * (-721379959)) ^ hashCode;
    }

    @Override // defpackage.mym
    public final String j() {
        return this.a;
    }

    public final String toString() {
        myz myzVar = this.c;
        return "BugleUnsupportedAttachmentContent{contentType=" + this.a + ", uri=" + String.valueOf(this.b) + ", originalUri=null, progress=" + String.valueOf(myzVar) + "}";
    }

    public mya(String str, Uri uri, myz myzVar) {
        this.a = str;
        this.b = uri;
        this.c = myzVar;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
