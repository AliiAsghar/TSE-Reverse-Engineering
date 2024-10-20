package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cns implements coa {
    public final /* synthetic */ cnu a;

    public cns(cnu cnuVar) {
        this.a = cnuVar;
    }

    public final long a() {
        return this.a.a();
    }

    @Override // defpackage.coa
    public final void b(float f, float f2, float f3, float f4, int i) {
        this.a.b().a(f, f2, f3, f4, i);
    }

    @Override // defpackage.coa
    public final void c(float f, long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        ckr b = this.a.b();
        b.o(Float.intBitsToFloat(i2), Float.intBitsToFloat(i));
        b.k(f);
        b.o(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i));
    }

    @Override // defpackage.coa
    public final void d(float f, float f2, long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        ckr b = this.a.b();
        b.o(Float.intBitsToFloat(i2), Float.intBitsToFloat(i));
        b.n(f, f2);
        b.o(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i));
    }

    @Override // defpackage.coa
    public final void e(float f, float f2) {
        this.a.b().o(f, f2);
    }

    @Override // defpackage.coa
    public final void f(float f, float f2) {
        ckr b = this.a.b();
        float intBitsToFloat = Float.intBitsToFloat((int) (a() >> 32)) - (f + brg.a);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (a() & 4294967295L)) - (f2 + brg.a);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < brg.a || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < brg.a) {
            clj.a("Width and height must be greater than or equal to zero");
        }
        this.a.h(floatToRawIntBits);
        b.o(brg.a, brg.a);
    }

    @Override // defpackage.coa
    public final void g(clr clrVar) {
        this.a.b().r(clrVar);
    }
}
