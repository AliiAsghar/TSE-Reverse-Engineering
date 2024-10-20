package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zv extends zz {
    public float a;

    public zv(float f) {
        this.a = f;
    }

    @Override // defpackage.zz
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return brg.a;
    }

    @Override // defpackage.zz
    public final int b() {
        return 1;
    }

    @Override // defpackage.zz
    public final /* synthetic */ zz c() {
        return new zv(brg.a);
    }

    @Override // defpackage.zz
    public final void d() {
        this.a = brg.a;
    }

    @Override // defpackage.zz
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zv) && ((zv) obj).a == this.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
