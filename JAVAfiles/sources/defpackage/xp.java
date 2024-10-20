package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xp {
    public final float a = brg.a;
    public final aap b;

    public xp(aap aapVar) {
        this.b = aapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp)) {
            return false;
        }
        xp xpVar = (xp) obj;
        float f = xpVar.a;
        if (Float.compare(brg.a, brg.a) == 0 && d.F(this.b, xpVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(brg.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.b + ')';
    }
}
