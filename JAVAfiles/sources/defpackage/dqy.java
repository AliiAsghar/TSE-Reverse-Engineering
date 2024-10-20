package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqy implements Comparable<dqy> {
    public final float a;

    public static String a(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public static final boolean b(float f, float f2) {
        if (Float.compare(f, f2) == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(dqy dqyVar) {
        return Float.compare(this.a, dqyVar.a);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dqy) && Float.compare(this.a, ((dqy) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
