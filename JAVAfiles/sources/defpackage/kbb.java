package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbb implements kaa {
    public final mxh a;
    public final boolean b;
    public final String c;
    public final miz d;
    public final kap e;
    public final boolean f;
    public final boolean g;
    public final aevr h = null;

    public kbb(mxh mxhVar, boolean z, String str, miz mizVar, kap kapVar, boolean z2, boolean z3) {
        this.a = mxhVar;
        this.b = z;
        this.c = str;
        this.d = mizVar;
        this.e = kapVar;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbb)) {
            return false;
        }
        kbb kbbVar = (kbb) obj;
        if (!d.F(this.a, kbbVar.a) || this.b != kbbVar.b || !d.F(this.c, kbbVar.c) || !d.F(this.d, kbbVar.d) || !d.F(this.e, kbbVar.e) || this.f != kbbVar.f || this.g != kbbVar.g) {
            return false;
        }
        aevr aevrVar = kbbVar.h;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.a.hashCode() * 31) + a.v(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        kap kapVar = this.e;
        if (kapVar == null) {
            hashCode = 0;
        } else {
            hashCode = kapVar.hashCode();
        }
        return ((((((hashCode2 * 31) + hashCode) * 31) + a.v(this.f)) * 31) + a.v(this.g)) * 31;
    }

    public final String toString() {
        return "AudioBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ", message=" + this.d + ", searchData=" + this.e + ", isRichType=" + this.f + ", isOutgoing=" + this.g + ", statusUiData=null)";
    }
}
