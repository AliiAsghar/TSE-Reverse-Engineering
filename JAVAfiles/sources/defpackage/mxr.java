package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxr {
    public final Long a;
    public final myn b;
    public final myn c;
    public final long d;

    public mxr(Long l, myn mynVar, myn mynVar2, long j) {
        this.a = l;
        this.b = mynVar;
        this.c = mynVar2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxr)) {
            return false;
        }
        mxr mxrVar = (mxr) obj;
        if (d.F(this.a, mxrVar.a) && d.F(this.b, mxrVar.b) && d.F(this.c, mxrVar.c) && this.d == mxrVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        myn mynVar = this.b;
        if (mynVar == null) {
            hashCode = 0;
        } else {
            hashCode = mynVar.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + this.c.hashCode()) * 31) + a.A(this.d);
    }

    public final String toString() {
        return "BugleMediaRichCardAttachmentContent(targetFileSize=" + this.a + ", thumbnailContent=" + this.b + ", mediaContent=" + this.c + ", partId=" + this.d + ")";
    }
}
