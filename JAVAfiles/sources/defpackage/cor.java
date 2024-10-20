package defpackage;

import defpackage.cnr;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cor {
    private ckv a;
    private float b = 1.0f;
    private drk c = drk.a;

    public abstract long a();

    protected abstract void b(cny cnyVar);

    protected void c(float f) {
        throw null;
    }

    protected void d(ckv ckvVar) {
        throw null;
    }

    public final void e(cny cnyVar, long j, float f, ckv ckvVar) {
        if (this.b != f) {
            c(f);
            this.b = f;
        }
        if (!d.F(this.a, ckvVar)) {
            d(ckvVar);
            this.a = ckvVar;
        }
        drk r = cnyVar.r();
        if (this.c != r) {
            f(r);
            this.c = r;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (cnyVar.o() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (cnyVar.o() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((cnr.AnonymousClass1) cnyVar.q()).a.f(intBitsToFloat, intBitsToFloat2);
        float f2 = -intBitsToFloat;
        float f3 = -intBitsToFloat2;
        if (f > brg.a) {
            try {
                if (Float.intBitsToFloat(i) > brg.a && Float.intBitsToFloat(i2) > brg.a) {
                    b(cnyVar);
                }
            } finally {
                ((cnr.AnonymousClass1) cnyVar.q()).a.f(f2, f3);
            }
        }
    }

    protected void f(drk drkVar) {
    }
}
