package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zy extends zz {
    public float a;
    public float b;
    public float c;
    public float d;

    public zy(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.zz
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return brg.a;
                    }
                    return this.d;
                }
                return this.c;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.zz
    public final int b() {
        return 4;
    }

    @Override // defpackage.zz
    public final /* synthetic */ zz c() {
        return new zy(brg.a, brg.a, brg.a, brg.a);
    }

    @Override // defpackage.zz
    public final void d() {
        this.a = brg.a;
        this.b = brg.a;
        this.c = brg.a;
        this.d = brg.a;
    }

    @Override // defpackage.zz
    public final void e(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.d = f;
                    return;
                }
                this.c = f;
                return;
            }
            this.b = f;
            return;
        }
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zy) {
            zy zyVar = (zy) obj;
            if (zyVar.a == this.a && zyVar.b == this.b && zyVar.c == this.c && zyVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
