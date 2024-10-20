package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgu {
    public static final dgu a = new dgu(brg.a, new arsy(brg.a, brg.a));
    public final float b;
    public final arsy c;
    private final int d = 0;

    public dgu(float f, arsy arsyVar) {
        this.b = f;
        this.c = arsyVar;
        if (!Float.isNaN(f)) {
        } else {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgu)) {
            return false;
        }
        dgu dguVar = (dgu) obj;
        if (this.b != dguVar.b || !d.F(this.c, dguVar.c)) {
            return false;
        }
        int i = dguVar.d;
        return true;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.b) * 31) + this.c.hashCode()) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.b + ", range=" + this.c + ", steps=0)";
    }
}
