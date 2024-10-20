package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxs implements mym {
    public final alog a;
    public final String b;

    public mxs() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxs) {
            mxs mxsVar = (mxs) obj;
            if (alzz.at(this.a, mxsVar.a)) {
                String str = this.b;
                String str2 = mxsVar.b;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    @Override // defpackage.mym
    public final /* synthetic */ String j() {
        return "multipart/mixed";
    }

    public final String toString() {
        return "BugleMultiPartContent{attachments=" + String.valueOf(this.a) + ", text=" + this.b + "}";
    }

    public mxs(alog alogVar, String str) {
        this.a = alogVar;
        this.b = str;
    }
}
