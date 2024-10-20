package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbb {
    public final nbg a;
    public final int b;
    public final alog c;
    private final boolean d;

    public nbb(nbg nbgVar, int i, boolean z, alog alogVar) {
        this.a = nbgVar;
        this.b = i;
        this.d = z;
        this.c = alogVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbb)) {
            return false;
        }
        nbb nbbVar = (nbb) obj;
        if (d.F(this.a, nbbVar.a) && this.b == nbbVar.b && this.d == nbbVar.d && d.F(this.c, nbbVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        alog alogVar = this.c;
        return ((((hashCode + this.b) * 31) + a.v(this.d)) * 31) + alogVar.hashCode();
    }

    public final String toString() {
        return "DefaultReactionState(reaction=" + this.a + ", count=" + this.b + ", hasAnimationEffect=" + this.d + ", reactionsMetadata=" + this.c + ")";
    }
}
