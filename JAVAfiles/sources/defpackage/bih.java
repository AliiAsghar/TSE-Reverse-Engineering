package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
@armg
/* loaded from: classes.dex */
public final class bih extends bix implements bzt, bit {
    public final boolean a;
    public final cas b;
    public final cas c;
    public final ViewGroup d;
    public bis e;
    public final byn f;
    public long g;
    public int h;
    public final arqg i;
    private final float l;
    private final byn m;

    /* compiled from: PG */
    /* renamed from: bih$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            bih.this.f.h(Boolean.valueOf(!r0.d()));
            return arnb.a;
        }
    }

    public bih(boolean z, float f, cas casVar, cas casVar2, ViewGroup viewGroup) {
        super(z, casVar2);
        this.a = z;
        this.l = f;
        this.b = casVar;
        this.c = casVar2;
        this.d = viewGroup;
        this.m = new byu(null, cav.a);
        this.f = new byu(true, cav.a);
        this.g = 0L;
        this.h = -1;
        this.i = new AnonymousClass1();
    }

    private final biw f() {
        return (biw) this.m.a();
    }

    private final void j() {
        bis bisVar = this.e;
        if (bisVar != null) {
            bisVar.b(this);
        }
    }

    @Override // defpackage.aew
    public final void a(cnt cntVar) {
        int eo;
        float em;
        this.g = cntVar.o();
        if (Float.isNaN(this.l)) {
            eo = arsk.g(bir.a(cntVar, this.a, cntVar.o()));
        } else {
            eo = cntVar.eo(this.l);
        }
        this.h = eo;
        long j = ((cku) this.b.a()).i;
        float f = ((bin) this.c.a()).d;
        cntVar.p();
        float f2 = this.l;
        bjd bjdVar = this.k;
        if (Float.isNaN(f2)) {
            em = bir.a(cntVar, this.j, cntVar.o());
        } else {
            em = cntVar.em(f2);
        }
        bjdVar.a(cntVar, em, j);
        ckr b = cntVar.q().b();
        d();
        biw f3 = f();
        if (f3 != null) {
            f3.d(cntVar.o(), this.h, j, f);
            f3.draw(cjx.a(b));
        }
    }

    @Override // defpackage.bit
    public final void b() {
        c(null);
    }

    public final void c(biw biwVar) {
        this.m.h(biwVar);
    }

    public final boolean d() {
        return ((Boolean) this.f.a()).booleanValue();
    }

    @Override // defpackage.bix
    public final void e() {
        biw f = f();
        if (f != null) {
            f.c();
        }
    }

    @Override // defpackage.bzt
    public final void g() {
        j();
    }

    @Override // defpackage.bzt
    public final void h() {
        j();
    }

    @Override // defpackage.bzt
    public final void i() {
    }
}
