package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqw implements dqv {
    private final float a;
    private final float b = 1.0f;

    public dqw(float f) {
        this.a = f;
    }

    @Override // defpackage.dqv
    public final float ec() {
        return this.a;
    }

    @Override // defpackage.drc
    public final float ed() {
        return 1.0f;
    }

    @Override // defpackage.drc
    public final /* synthetic */ float ef(long j) {
        return drb.a(this, j);
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
        if (!(obj instanceof dqw)) {
            return false;
        }
        dqw dqwVar = (dqw) obj;
        if (Float.compare(this.a, dqwVar.a) != 0) {
            return false;
        }
        float f = dqwVar.b;
        if (Float.compare(1.0f, 1.0f) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.drc
    public final /* synthetic */ long er(float f) {
        return drb.b(this, f);
    }

    @Override // defpackage.dqv
    public final /* synthetic */ long es(float f) {
        return dqu.i(this, f);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return "DensityImpl(density=" + this.a + ", fontScale=1.0)";
    }
}
