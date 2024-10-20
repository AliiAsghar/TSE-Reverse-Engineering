package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kay implements kaa {
    public final inf a;
    public final boolean b;
    public final String c;
    public final miz d;
    public final boolean e;

    public kay(inf infVar, boolean z, String str, miz mizVar, boolean z2) {
        this.a = infVar;
        this.b = z;
        this.c = str;
        this.d = mizVar;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kay)) {
            return false;
        }
        kay kayVar = (kay) obj;
        if (d.F(this.a, kayVar.a) && this.b == kayVar.b && d.F(this.c, kayVar.c) && d.F(this.d, kayVar.d) && this.e == kayVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + a.v(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a.v(this.e);
    }

    public final String toString() {
        return "VCardBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ", message=" + this.d + ", isOutgoing=" + this.e + ")";
    }
}
