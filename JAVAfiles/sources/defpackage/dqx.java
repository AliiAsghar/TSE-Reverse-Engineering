package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqx implements dqv {
    private final float a;
    private final float b;
    private final drq c;

    public dqx(float f, float f2, drq drqVar) {
        this.a = f;
        this.b = f2;
        this.c = drqVar;
    }

    @Override // defpackage.dqv
    public final float ec() {
        return this.a;
    }

    @Override // defpackage.drc
    public final float ed() {
        return this.b;
    }

    @Override // defpackage.drc
    public final float ef(long j) {
        if (a.bB(drm.c(j), 4294967296L)) {
            return this.c.b(drm.a(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // defpackage.dqv
    public final /* synthetic */ float eg(float f) {
        return dqu.a(this, f);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ float eh(int i) {
        return dqu.b(this, i);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ float el(long j) {
        return dqu.c(this, j);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ float em(float f) {
        return dqu.d(this, f);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ int en(long j) {
        return dqu.e(this, j);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ int eo(float f) {
        return dqu.f(this, f);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ long ep(long j) {
        return dqu.g(this, j);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ long eq(long j) {
        return dqu.h(this, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqx)) {
            return false;
        }
        dqx dqxVar = (dqx) obj;
        if (Float.compare(this.a, dqxVar.a) == 0 && Float.compare(this.b, dqxVar.b) == 0 && d.F(this.c, dqxVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.drc
    public final long er(float f) {
        return drn.b(this.c.a(f));
    }

    @Override // defpackage.dqv
    public final /* synthetic */ long es(float f) {
        return dqu.i(this, f);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ')';
    }
}
