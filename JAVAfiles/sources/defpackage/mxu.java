package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxu implements myr {
    public final String a;
    private final alog b;

    public mxu() {
        throw null;
    }

    public static mzr c() {
        mzr mzrVar = new mzr();
        int i = alog.d;
        mzrVar.b(alsx.a);
        return mzrVar;
    }

    @Override // defpackage.myr
    public final alog a() {
        return this.b;
    }

    @Override // defpackage.myr
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxu) {
            mxu mxuVar = (mxu) obj;
            if (this.a.equals(mxuVar.a) && alzz.at(this.b, mxuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // defpackage.myr, defpackage.mym
    public final /* synthetic */ String j() {
        return "text/plain";
    }

    public final String toString() {
        return "BugleTextContent{text=" + this.a + ", annotations=" + String.valueOf(this.b) + "}";
    }

    public mxu(String str, alog alogVar) {
        this.a = str;
        this.b = alogVar;
    }
}
