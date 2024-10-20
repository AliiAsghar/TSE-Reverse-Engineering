package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xw {
    public final float a;
    public final long b;
    public final aap c;

    public xw(float f, long j, aap aapVar) {
        this.a = f;
        this.b = j;
        this.c = aapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw)) {
            return false;
        }
        xw xwVar = (xw) obj;
        if (Float.compare(this.a, xwVar.a) == 0 && a.bB(this.b, xwVar.b) && d.F(this.c, xwVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + a.A(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) cmg.c(this.b)) + ", animationSpec=" + this.c + ')';
    }
}
