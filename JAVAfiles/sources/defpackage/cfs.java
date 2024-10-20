package defpackage;

import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfs implements cfq {
    private final float b;
    private final float c;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a implements cfq.b {
        private final float a;

        public a(float f) {
            this.a = f;
        }

        @Override // cfq.b
        public final int a(int i, int i2, drk drkVar) {
            float f;
            if (drkVar == drk.a) {
                f = this.a;
            } else {
                f = -this.a;
            }
            return Math.round(((i2 - i) / 2.0f) * (f + 1.0f));
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

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b implements cfq.c {
        private final float a;

        public b(float f) {
            this.a = f;
        }

        @Override // cfq.c
        public final int a(int i, int i2) {
            return Math.round(((i2 - i) / 2.0f) * (this.a + 1.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        public final String toString() {
            return "Vertical(bias=" + this.a + ')';
        }
    }

    public cfs(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.cfq
    public final long a(long j, long j2, drk drkVar) {
        float f;
        if (drkVar == drk.a) {
            f = this.b;
        } else {
            f = -this.b;
        }
        long j3 = j2 & 4294967295L;
        float f2 = this.c;
        return (Math.round(((((int) j3) - ((int) (j & 4294967295L))) / 2.0f) * (f2 + 1.0f)) & 4294967295L) | (Math.round(((((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f) * (f + 1.0f)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfs)) {
            return false;
        }
        cfs cfsVar = (cfs) obj;
        if (Float.compare(this.b, cfsVar.b) == 0 && Float.compare(this.c, cfsVar.c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.b + ", verticalBias=" + this.c + ')';
    }
}
