package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkr {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public bkr(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bkr)) {
            return false;
        }
        bkr bkrVar = (bkr) obj;
        if (dqy.b(this.a, bkrVar.a) && dqy.b(this.b, bkrVar.b) && dqy.b(this.c, bkrVar.c) && dqy.b(this.d, bkrVar.d) && dqy.b(brg.a, brg.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(brg.a);
    }
}
