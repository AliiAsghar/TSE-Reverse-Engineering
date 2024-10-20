package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcf implements kaa {
    public final kcj a;
    public final boolean b;
    public final String c;

    public kcf(kcj kcjVar, boolean z, String str) {
        this.a = kcjVar;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcf)) {
            return false;
        }
        kcf kcfVar = (kcf) obj;
        if (d.F(this.a, kcfVar.a) && this.b == kcfVar.b && d.F(this.c, kcfVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.v(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "GalleryBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ")";
    }
}
