package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpi {
    public final float a;

    public bpi(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bpi)) {
            return false;
        }
        bpi bpiVar = (bpi) obj;
        if (dqy.b(brg.a, brg.a) && dqy.b(brg.a, brg.a) && dqy.b(brg.a, brg.a) && dqy.b(this.a, bpiVar.a) && dqy.b(brg.a, brg.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(brg.a) * 31) + Float.floatToIntBits(brg.a)) * 31) + Float.floatToIntBits(brg.a)) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(brg.a);
    }
}
