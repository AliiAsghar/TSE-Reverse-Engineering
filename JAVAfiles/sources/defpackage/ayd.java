package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayd {
    public ayq a;
    public final bze b;
    public final ddz c;
    public dov e;
    public cti h;
    public dhv j;
    public final axz o;
    public final dng d = new dng();
    public final byn f = new byu(false, cav.a);
    public final byn g = new byu(new dqy(brg.a), cav.a);
    public final byn i = new byu(null, cav.a);
    private final byn u = new byu(axq.a, cav.a);
    private final byn v = new byu(false, cav.a);
    public final byn k = new byu(false, cav.a);
    public final byn l = new byu(false, cav.a);
    public final byn m = new byu(false, cav.a);
    public boolean n = true;
    private final byn w = new byu(true, cav.a);
    public arqr p = AnonymousClass3.a;
    public final arqr q = new AnonymousClass2();
    public final arqr r = new AnonymousClass1();
    public final clp s = new ckc();
    public long t = cku.h;
    private final byn x = new byu(new djc(djc.a), cav.a);
    private final byn y = new byu(new djc(djc.a), cav.a);

    /* compiled from: PG */
    /* renamed from: ayd$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<dnn, arnb> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            arqr arqrVar;
            ddz ddzVar;
            int i = ((dnn) obj).a;
            boolean bA = a.bA(i, 7);
            axz axzVar = ayd.this.o;
            arnb arnbVar = null;
            if (bA) {
                arqrVar = axzVar.a().b;
            } else {
                if (a.bA(i, 2)) {
                    axzVar.a();
                } else if (a.bA(i, 6)) {
                    arqr arqrVar2 = axzVar.a().c;
                } else if (a.bA(i, 5)) {
                    axzVar.a();
                } else if (a.bA(i, 3)) {
                    arqrVar = axzVar.a().d;
                } else if (a.bA(i, 4)) {
                    arqrVar = axzVar.a().e;
                } else if (!a.bA(i, 1) && !a.bA(i, 0)) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                arqrVar = null;
            }
            if (arqrVar != null) {
                arqrVar.a(axzVar);
                arnbVar = arnb.a;
            }
            if (arnbVar == null) {
                if (a.bA(i, 6)) {
                    axzVar.b().b(1);
                } else if (a.bA(i, 5)) {
                    axzVar.b().b(2);
                } else if (a.bA(i, 7) && (ddzVar = axzVar.a) != null) {
                    ddzVar.a();
                }
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: ayd$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<doj, arnb> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            String str;
            doj dojVar = (doj) obj;
            String a = dojVar.a();
            dhv dhvVar = ayd.this.j;
            if (dhvVar != null) {
                str = dhvVar.b;
            } else {
                str = null;
            }
            if (!d.F(a, str)) {
                ayd.this.g(axq.a);
            }
            ayd.this.i(djc.a);
            ayd.this.f(djc.a);
            ayd.this.p.a(dojVar);
            ayd.this.b.a();
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: ayd$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<doj, arnb> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return arnb.a;
        }
    }

    public ayd(ayq ayqVar, bze bzeVar, ddz ddzVar) {
        this.a = ayqVar;
        this.b = bzeVar;
        this.c = ddzVar;
        this.o = new axz(ddzVar);
    }

    public final long a() {
        return ((djc) this.y.a()).b;
    }

    public final long b() {
        return ((djc) this.x.a()).b;
    }

    public final axq c() {
        return (axq) this.u.a();
    }

    public final baa d() {
        return (baa) this.i.a();
    }

    public final cti e() {
        cti ctiVar = this.h;
        if (ctiVar != null && ctiVar.r()) {
            return ctiVar;
        }
        return null;
    }

    public final void f(long j) {
        this.y.h(new djc(j));
    }

    public final void g(axq axqVar) {
        this.u.h(axqVar);
    }

    public final void h(boolean z) {
        this.w.h(Boolean.valueOf(z));
    }

    public final void i(long j) {
        this.x.h(new djc(j));
    }

    public final void j(boolean z) {
        this.m.h(Boolean.valueOf(z));
    }

    public final void k(boolean z) {
        this.v.h(Boolean.valueOf(z));
    }

    public final void l(boolean z) {
        this.l.h(Boolean.valueOf(z));
    }

    public final void m(boolean z) {
        this.k.h(Boolean.valueOf(z));
    }

    public final boolean n() {
        return ((Boolean) this.f.a()).booleanValue();
    }

    public final boolean o() {
        return ((Boolean) this.v.a()).booleanValue();
    }

    public final boolean p() {
        return ((Boolean) this.w.a()).booleanValue();
    }
}
