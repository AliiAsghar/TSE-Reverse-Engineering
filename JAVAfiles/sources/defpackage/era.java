package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class era {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        eul.M(0);
        eul.M(1);
        eul.M(2);
        eul.M(3);
        eul.M(4);
    }

    public era(eqz eqzVar) {
        long j = eqzVar.a;
        long j2 = eqzVar.b;
        long j3 = eqzVar.c;
        float f = eqzVar.d;
        float f2 = eqzVar.e;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof era)) {
            return false;
        }
        era eraVar = (era) obj;
        if (this.a == eraVar.a && this.b == eraVar.b && this.c == eraVar.c && this.d == eraVar.d && this.e == eraVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        float f = this.d;
        int i2 = 0;
        if (f != brg.a) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        float f2 = this.e;
        if (f2 != brg.a) {
            i2 = Float.floatToIntBits(f2);
        }
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + i) * 31) + i2;
    }
}
