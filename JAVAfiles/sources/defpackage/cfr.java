package defpackage;

import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfr implements cfq {
    private final float b;
    private final float c = -1.0f;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a implements cfq.b {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        @Override // cfq.b
        public final int a(int i, int i2, drk drkVar) {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && Float.compare(this.a, ((a) obj).a) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        public final String toString() {
            return "Horizontal(bias=" + this.a + ')';
        }
    }

    public cfr(float f) {
        this.b = f;
    }

    @Override // defpackage.cfq
    public final long a(long j, long j2, drk drkVar) {
        long j3 = ((-((int) (j >> 32))) << 32) | ((-((int) (j & 4294967295L))) & 4294967295L);
        return (Math.round((((int) (j3 & 4294967295L)) / 2.0f) * brg.a) & 4294967295L) | (Math.round((((int) (j3 >> 32)) / 2.0f) * (this.b + 1.0f)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfr)) {
            return false;
        }
        cfr cfrVar = (cfr) obj;
        if (Float.compare(this.b, cfrVar.b) != 0) {
            return false;
        }
        float f = cfrVar.c;
        if (Float.compare(-1.0f, -1.0f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(-1.0f);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.b + ", verticalBias=-1.0)";
    }
}
