package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zx extends zz {
    private float a;
    private float b;
    private float c;

    public zx(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.zz
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return brg.a;
                }
                return this.c;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.zz
    public final int b() {
        return 3;
    }

    @Override // defpackage.zz
    public final /* synthetic */ zz c() {
        return new zx(brg.a, brg.a, brg.a);
    }

    @Override // defpackage.zz
    public final void d() {
        this.a = brg.a;
        this.b = brg.a;
        this.c = brg.a;
    }

    @Override // defpackage.zz
    public final void e(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
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
        if (obj instanceof zx) {
            zx zxVar = (zx) obj;
            if (zxVar.a == this.a && zxVar.b == this.b && zxVar.c == this.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
