package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypk implements Comparable {
    public static final ypk a = new ypk(0.0d);
    public static final ypk b = new ypk(0.5d);
    public static final ypk c = new ypk(1.0d);
    private final double d;

    public ypk(double d) {
        this.d = d;
        if (d >= 0.0d) {
            if (d <= 1.0d) {
                return;
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final float a() {
        return (float) this.d;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ypk ypkVar) {
        ypkVar.getClass();
        return Double.compare(this.d, ypkVar.d);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ypk) || this.d != ((ypk) obj).d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return d.aI(this.d);
    }

    public final String toString() {
        return String.valueOf(this.d);
    }
}
