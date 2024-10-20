package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cvc implements cui {
    public int a;
    public int b;
    public long c = 0;
    public long d = cvd.b;
    public long e = 0;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public abstract class a {
        private boolean a;

        public static /* synthetic */ void m(a aVar, cvc cvcVar, int i, int i2) {
            long j = (i2 & 4294967295L) | (i << 32);
            if (aVar.c() != drk.a && aVar.a() != 0) {
                int a = aVar.a() - cvcVar.a;
                int a2 = dre.a(j);
                aVar.d(cvcVar);
                cvcVar.ee(dre.d((dre.b(j) & 4294967295L) | ((a - a2) << 32), cvcVar.e), brg.a, null);
                return;
            }
            aVar.d(cvcVar);
            cvcVar.ee(dre.d(j, cvcVar.e), brg.a, null);
        }

        public static /* synthetic */ void n(a aVar, cvc cvcVar, long j) {
            if (aVar.c() != drk.a && aVar.a() != 0) {
                int a = aVar.a() - cvcVar.a;
                int a2 = dre.a(j);
                int b = dre.b(j);
                aVar.d(cvcVar);
                cvcVar.ee(dre.d((b & 4294967295L) | ((a - a2) << 32), cvcVar.e), brg.a, null);
                return;
            }
            aVar.d(cvcVar);
            cvcVar.ee(dre.d(j, cvcVar.e), brg.a, null);
        }

        public static /* synthetic */ void o(a aVar, cvc cvcVar, int i, int i2) {
            long j = (i2 & 4294967295L) | (i << 32);
            arqr arqrVar = cvd.a;
            if (aVar.c() != drk.a && aVar.a() != 0) {
                int a = aVar.a() - cvcVar.a;
                int a2 = dre.a(j);
                aVar.d(cvcVar);
                cvcVar.ee(dre.d((dre.b(j) & 4294967295L) | ((a - a2) << 32), cvcVar.e), brg.a, arqrVar);
                return;
            }
            aVar.d(cvcVar);
            cvcVar.ee(dre.d(j, cvcVar.e), brg.a, arqrVar);
        }

        public static /* synthetic */ void p(a aVar, cvc cvcVar, long j) {
            arqr arqrVar = cvd.a;
            if (aVar.c() != drk.a && aVar.a() != 0) {
                int a = aVar.a() - cvcVar.a;
                int a2 = dre.a(j);
                int b = dre.b(j);
                aVar.d(cvcVar);
                cvcVar.ee(dre.d((b & 4294967295L) | ((a - a2) << 32), cvcVar.e), brg.a, arqrVar);
                return;
            }
            aVar.d(cvcVar);
            cvcVar.ee(dre.d(j, cvcVar.e), brg.a, arqrVar);
        }

        public static /* synthetic */ void q(a aVar, cvc cvcVar, int i, int i2, arqr arqrVar, int i3) {
            if ((i3 & 8) != 0) {
                arqrVar = cvd.a;
            }
            aVar.g(cvcVar, i, i2, brg.a, arqrVar);
        }

        public abstract int a();

        public cti b() {
            throw null;
        }

        public abstract drk c();

        /* JADX WARN: Multi-variable type inference failed */
        public final void d(cvc cvcVar) {
            if (cvcVar instanceof cyh) {
                ((cyh) cvcVar).ej(this.a);
            }
        }

        public final void e(cvc cvcVar, int i, int i2, float f) {
            d(cvcVar);
            cvcVar.ee(dre.d((i2 & 4294967295L) | (i << 32), cvcVar.e), f, null);
        }

        public final void f(cvc cvcVar, long j, float f) {
            d(cvcVar);
            cvcVar.ee(dre.d(j, cvcVar.e), f, null);
        }

        public final void g(cvc cvcVar, int i, int i2, float f, arqr arqrVar) {
            d(cvcVar);
            cvcVar.ee(dre.d((i2 & 4294967295L) | (i << 32), cvcVar.e), f, arqrVar);
        }

        public final void h(cvc cvcVar, long j, float f, arqr arqrVar) {
            d(cvcVar);
            cvcVar.ee(dre.d(j, cvcVar.e), f, arqrVar);
        }

        public final void i(cvc cvcVar, long j, cof cofVar, float f) {
            d(cvcVar);
            cvcVar.v(dre.d(j, cvcVar.e), f, cofVar);
        }

        public final void j(arqr arqrVar) {
            this.a = true;
            arqrVar.a(this);
            this.a = false;
        }
    }

    private final void ex() {
        long j = this.c >> 32;
        long j2 = this.d;
        this.a = arrn.u((int) j, dqs.d(j2), dqs.b(j2));
        long j3 = this.c & 4294967295L;
        long j4 = this.d;
        this.b = arrn.u((int) j3, dqs.c(j4), dqs.a(j4));
        int i = this.a;
        long j5 = this.c;
        this.e = (((i - ((int) (j5 >> 32))) / 2) << 32) | (((r0 - ((int) (j5 & 4294967295L))) / 2) & 4294967295L);
    }

    protected abstract void ee(long j, float f, arqr arqrVar);

    public /* synthetic */ Object f() {
        return null;
    }

    public int t() {
        return (int) (this.c & 4294967295L);
    }

    public int u() {
        return (int) (this.c >> 32);
    }

    public void v(long j, float f, cof cofVar) {
        ee(j, f, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(long j) {
        if (!defpackage.a.bB(this.c, j)) {
            this.c = j;
            ex();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(long j) {
        if (!defpackage.a.bB(this.d, j)) {
            this.d = j;
            ex();
        }
    }
}
