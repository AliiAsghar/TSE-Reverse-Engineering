package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class keg implements kaa {
    public final miz a;
    public final boolean b;
    public final myn c;
    public final boolean d;
    public final String e;
    private final boolean f;

    public keg(miz mizVar, boolean z, boolean z2, myn mynVar, boolean z3, String str) {
        this.a = mizVar;
        this.b = z;
        this.f = z2;
        this.c = mynVar;
        this.d = z3;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof keg)) {
            return false;
        }
        keg kegVar = (keg) obj;
        if (d.F(this.a, kegVar.a) && this.b == kegVar.b && this.f == kegVar.f && d.F(this.c, kegVar.c) && this.d == kegVar.d && d.F(this.e, kegVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        myn mynVar = this.c;
        return ((((((((hashCode + a.v(this.b)) * 31) + a.v(this.f)) * 31) + mynVar.hashCode()) * 31) + a.v(this.d)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "VideoBubbleArgs(message=" + this.a + ", isOutgoing=" + this.b + ", hasBottomSheetAction=" + this.f + ", content=" + this.c + ", isHighlighted=" + this.d + ", contentDescription=" + this.e + ")";
    }
}
