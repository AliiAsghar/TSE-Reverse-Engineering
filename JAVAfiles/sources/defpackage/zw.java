package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zw extends zz {
    public float a;
    public float b;

    public zw(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.zz
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                return brg.a;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.zz
    public final int b() {
        return 2;
    }

    @Override // defpackage.zz
    public final /* synthetic */ zz c() {
        return new zw(brg.a, brg.a);
    }

    @Override // defpackage.zz
    public final void d() {
        this.a = brg.a;
        this.b = brg.a;
    }

    @Override // defpackage.zz
    public final void e(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.b = f;
            return;
        }
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zw) {
            zw zwVar = (zw) obj;
            if (zwVar.a == this.a && zwVar.b == this.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
