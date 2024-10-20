package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxv implements mys {
    private final String a;
    private final boolean b;
    private final String c;
    private final alog d;

    public mxv() {
        throw null;
    }

    @Override // defpackage.myr
    public final alog a() {
        return this.d;
    }

    @Override // defpackage.myr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.mys
    public final String c() {
        return this.c;
    }

    @Override // defpackage.mys
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxv) {
            mxv mxvVar = (mxv) obj;
            if (this.a.equals(mxvVar.a) && this.b == mxvVar.b && ((str = this.c) != null ? str.equals(mxvVar.c) : mxvVar.c == null) && alzz.at(this.d, mxvVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((((hashCode2 * 1000003) ^ i) * 1000003) ^ hashCode) * 1000003) ^ this.d.hashCode();
    }

    @Override // defpackage.myr, defpackage.mym
    public final /* synthetic */ String j() {
        return "text/plain";
    }

    public final String toString() {
        return "BugleTextWithSubjectContent{text=" + this.a + ", isUrgent=" + this.b + ", subject=" + this.c + ", annotations=" + String.valueOf(this.d) + "}";
    }

    public mxv(String str, boolean z, String str2, alog alogVar) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = alogVar;
    }
}
