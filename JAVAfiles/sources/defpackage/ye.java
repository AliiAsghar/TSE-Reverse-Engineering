package defpackage;

import defpackage.cnr;
import defpackage.yg;
import defpackage.yi;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ye implements xt, bzt {
    public final byn c;
    public final byn d;
    public final byn e;
    public final byn g;
    public final byn h;
    public clr i;
    public ye k;
    public final byj a = new byr(brg.a);
    public final byn b = new byu(true, cav.a);
    public final byn f = new byu(false, cav.a);
    public arqg j = AnonymousClass1.a;
    private final byn l = new byu(null, cav.a);

    /* compiled from: PG */
    /* renamed from: ye$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return null;
        }
    }

    public ye(yd ydVar, wk wkVar, yg.b bVar, yg.a aVar, yg.d dVar) {
        this.c = new byu(ydVar, cav.a);
        this.d = new byu(wkVar, cav.a);
        this.e = new byu(bVar, cav.a);
        this.g = new byu(aVar, cav.a);
        this.h = new byu(dVar, cav.a);
    }

    @Override // defpackage.xt
    public final float a() {
        return this.a.b();
    }

    @Override // defpackage.xt
    public final void b(cny cnyVar) {
        cjn cjnVar;
        cof f = f();
        if (f != null && l()) {
            if (d().a() != null) {
                cjp a = d().a();
                if (a != null) {
                    cjnVar = new cjn(a.c());
                } else {
                    cjnVar = null;
                }
                cjnVar.getClass();
                long j = cjnVar.a;
                int i = (int) (4294967295L & j);
                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat(i);
                float f2 = -intBitsToFloat2;
                float f3 = -intBitsToFloat;
                ((cnr.AnonymousClass1) cnyVar.q()).a.e(intBitsToFloat, intBitsToFloat2);
                try {
                    coh.a(cnyVar, f);
                    return;
                } finally {
                    ((cnr.AnonymousClass1) cnyVar.q()).a.e(f3, f2);
                }
            }
            throw new IllegalArgumentException("Error: current bounds not set yet.");
        }
    }

    public final wk c() {
        return (wk) this.d.a();
    }

    public final yd d() {
        return (yd) this.c.a();
    }

    public final yg.d e() {
        return (yg.d) this.h.a();
    }

    public final cof f() {
        return (cof) this.l.a();
    }

    @Override // defpackage.bzt
    public final void h() {
        yi yiVar = d().b;
        yd d = d();
        d.d.remove(this);
        if (d.d.isEmpty()) {
            d.g();
            yi yiVar2 = d.b;
            yi.a.a().b(d);
        } else {
            d.b.g(d, d.e, d.f);
        }
        yiVar.e.a(yiVar);
        d.b.f();
        yiVar.h.remove(this);
        if (d.d.isEmpty()) {
            arrn.J(d.b.b, null, null, new yk(d, null), 3);
        }
        d().h();
    }

    @Override // defpackage.bzt
    public final void i() {
        ye yeVar;
        yi yiVar = d().b;
        yd d = d();
        d.d.add(this);
        d.b.g(d, d.e, d.f);
        yiVar.e.a(yiVar);
        d.b.f();
        int i = 0;
        cff cffVar = new cff(yiVar.h, 0);
        while (true) {
            if (cffVar.hasNext()) {
                xt xtVar = (xt) cffVar.next();
                yd ydVar = null;
                if (xtVar instanceof ye) {
                    yeVar = (ye) xtVar;
                } else {
                    yeVar = null;
                }
                if (yeVar != null) {
                    ydVar = yeVar.d();
                }
                if (d.F(ydVar, d())) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (i != yiVar.h.a() - 1 && i != -1) {
            yiVar.h.add(i + 1, this);
        } else {
            yiVar.h.add(this);
        }
        d().h();
    }

    public final void j(cof cofVar) {
        this.l.h(cofVar);
    }

    public final boolean k() {
        if (!d.F(d().c, this) && ((Boolean) this.f.a()).booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean l() {
        if (k() && d().i() && ((Boolean) this.b.a()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bzt
    public final void g() {
    }
}
