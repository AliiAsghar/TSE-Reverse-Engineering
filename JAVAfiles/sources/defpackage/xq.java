package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xq {
    public final float a;
    public final float b;
    private final dqv c;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final float a;
        public final float b;
        public final long c;

        public a(float f, float f2, long j) {
            this.a = f;
            this.b = f2;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + defpackage.a.A(this.c);
        }

        public final String toString() {
            return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
        }
    }

    public xq(float f, dqv dqvVar) {
        this.a = f;
        this.c = dqvVar;
        float ec = dqvVar.ec();
        float f2 = xr.a;
        this.b = ec * 386.0878f * 160.0f * 0.84f;
    }

    public final double a(float f) {
        int i = vq.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }

    public final a b(float f) {
        double a2 = a(f);
        double d = xr.a - 1.0d;
        return new a(f, (float) (this.a * this.b * Math.exp((xr.a / d) * a2)), (long) (Math.exp(a2 / d) * 1000.0d));
    }
}
