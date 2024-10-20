package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhy {
    public final alog a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public lhy() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhy)) {
            return false;
        }
        lhy lhyVar = (lhy) obj;
        if (d.F(this.a, lhyVar.a) && this.b == lhyVar.b && this.c == lhyVar.c && this.d == lhyVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.d;
        return ((((hashCode + a.v(this.b)) * 31) + a.v(this.c)) * 31) + a.v(z);
    }

    public final String toString() {
        return "ConversationsResultState(conversations=" + this.a + ", loaded=" + this.b + ", isLoadMoreVisible=" + this.c + ", isLoadMoreText=" + this.d + ")";
    }

    public lhy(alog alogVar, boolean z, boolean z2, boolean z3) {
        alogVar.getClass();
        this.a = alogVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lhy(byte[] bArr) {
        this(alsx.a, false, false, false);
        int i = alog.d;
    }
}
