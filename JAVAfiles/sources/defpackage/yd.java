package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yd {
    public final yi b;
    public ye c;
    public final Object a = "photoSelector_0";
    private final byn g = new byu(null, cav.a);
    private final byn h = new byu(false, cav.a);
    private final byn i = new byu(null, cav.a);
    public final cez d = new cez();
    public final arqr e = new AnonymousClass2();
    public final arqg f = new AnonymousClass1();

    /* compiled from: PG */
    /* renamed from: yd$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            yd.this.j();
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: yd$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<yd, arnb> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            yd.this.g();
            return arnb.a;
        }
    }

    public yd(yi yiVar) {
        this.b = yiVar;
    }

    public final cjp a() {
        return (cjp) this.i.a();
    }

    public final cjp b() {
        cjp cjpVar;
        ye yeVar = this.c;
        if (yeVar != null) {
            Object a = yeVar.j.a();
            if (a != null) {
                long h = yeVar.d().b.d().h((cti) a, 0L);
                Object a2 = yeVar.j.a();
                if (a2 != null) {
                    cjpVar = cjq.a(h, drj.c(((cti) a2).g()));
                } else {
                    throw new IllegalArgumentException("Error: lookahead coordinates is null for " + yeVar.d().a + '.');
                }
            } else {
                throw new IllegalArgumentException("Error: lookahead coordinates is null.");
            }
        } else {
            cjpVar = null;
        }
        f(cjpVar);
        return c();
    }

    public final cjp c() {
        return (cjp) this.g.a();
    }

    public final void d(cjp cjpVar) {
        this.i.h(cjpVar);
    }

    public final void e(boolean z) {
        this.h.h(Boolean.valueOf(z));
    }

    public final void f(cjp cjpVar) {
        this.g.h(cjpVar);
    }

    public final void g() {
        boolean j = j();
        if (this.d.a() > 1 && j) {
            e(true);
        } else if (this.b.a()) {
            if (!j) {
                e(false);
            }
        } else {
            e(false);
        }
        if (!this.d.isEmpty()) {
            this.b.g(this, this.e, this.f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        ye yeVar;
        cez cezVar = this.d;
        int a = cezVar.a() - 1;
        if (a >= 0) {
            yeVar = null;
            while (true) {
                int i = a - 1;
                ye yeVar2 = (ye) cezVar.get(a);
                if (true == yeVar2.c().f()) {
                    yeVar = yeVar2;
                }
                if (i < 0) {
                    break;
                } else {
                    a = i;
                }
            }
        } else {
            yeVar = null;
        }
        if (d.F(yeVar, this.c)) {
            return;
        }
        this.c = yeVar;
        f(null);
    }

    public final boolean i() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j() {
        cez cezVar = this.d;
        int a = cezVar.a();
        for (int i = 0; i < a; i++) {
            if (((ye) cezVar.get(i)).c().f()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k() {
        cez cezVar = this.d;
        int a = cezVar.a();
        int i = 0;
        while (true) {
            if (i >= a) {
                break;
            }
            abt abtVar = ((ye) cezVar.get(i)).c().a;
            while (true) {
                abt abtVar2 = abtVar.a;
                if (abtVar2 == null) {
                    break;
                }
                abtVar = abtVar2;
            }
            if (!d.F(abtVar.e(), abtVar.f())) {
                if (i()) {
                    return true;
                }
            } else {
                i++;
            }
        }
        return false;
    }
}
