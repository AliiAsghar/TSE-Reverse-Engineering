package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqm {
    public static final gqm a = new gqm("expandContainers", brg.a);
    public static final gqm b = gvf.aP(0.5f);
    public static final gqm c = new gqm("hinge", -1.0f);
    public final float d;
    private final String e;

    public gqm(String str, float f) {
        this.e = str;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gqm)) {
            return false;
        }
        gqm gqmVar = (gqm) obj;
        if (this.d == gqmVar.d && d.F(this.e, gqmVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (Float.floatToIntBits(this.d) * 31);
    }

    public final String toString() {
        return this.e;
    }
}
