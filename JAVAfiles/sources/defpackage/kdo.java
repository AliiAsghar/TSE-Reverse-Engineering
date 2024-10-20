package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdo implements kaa {
    public final miz a;
    public final boolean b;
    public final String c;
    public final mxt d;

    public kdo(miz mizVar, mxt mxtVar, boolean z, String str) {
        this.a = mizVar;
        this.d = mxtVar;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdo)) {
            return false;
        }
        kdo kdoVar = (kdo) obj;
        if (d.F(this.a, kdoVar.a) && d.F(this.d, kdoVar.d) && this.b == kdoVar.b && d.F(this.c, kdoVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + a.v(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RichCardCarouselBubbleArgs(message=" + this.a + ", content=" + this.d + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ")";
    }
}
