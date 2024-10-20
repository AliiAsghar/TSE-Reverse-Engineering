package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cox extends cpb {
    public cko a;
    public float e;
    public cko f;
    public float j;
    public float l;
    public boolean o;
    public clr p;
    private cod q;
    private final clr r;
    private final arml s;
    public float b = 1.0f;
    public List c = cpe.a;
    public float d = 1.0f;
    public int g = 0;
    public int h = 0;
    public float i = 4.0f;
    public float k = 1.0f;
    public boolean m = true;
    public boolean n = true;

    /* compiled from: PG */
    /* renamed from: cox$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<clt> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return ckg.a();
        }
    }

    public cox() {
        cke ckeVar = new cke((byte[]) null);
        this.r = ckeVar;
        this.p = ckeVar;
        this.s = armd.b(3, AnonymousClass1.a);
    }

    private final clt c() {
        return (clt) this.s.a();
    }

    private final void d() {
        if (this.j == brg.a && this.k == 1.0f) {
            this.p = this.r;
            return;
        }
        if (d.F(this.p, this.r)) {
            this.p = new cke((byte[]) null);
        } else {
            int a = this.p.a();
            this.p.l();
            this.p.m(a);
        }
        c().c(this.r);
        float a2 = c().a();
        float f = this.j;
        float f2 = this.l;
        float f3 = ((f + f2) % 1.0f) * a2;
        float f4 = ((this.k + f2) % 1.0f) * a2;
        if (f3 > f4) {
            c().b(f3, a2, this.p);
            c().b(brg.a, f4, this.p);
        } else {
            c().b(f3, f4, this.p);
        }
    }

    @Override // defpackage.cpb
    public final void b(cny cnyVar) {
        if (this.m) {
            cpa.a(this.c, this.r);
            d();
        } else if (this.o) {
            d();
        }
        this.m = false;
        this.o = false;
        cko ckoVar = this.a;
        if (ckoVar != null) {
            cnw.j(cnyVar, this.p, ckoVar, this.b, null, 56);
        }
        cko ckoVar2 = this.f;
        if (ckoVar2 != null) {
            cod codVar = this.q;
            if (this.n || codVar == null) {
                codVar = new cod(this.e, this.i, this.g, this.h, 16);
                this.q = codVar;
                this.n = false;
            }
            cnw.j(cnyVar, this.p, ckoVar2, this.d, codVar, 48);
        }
    }

    public final String toString() {
        return this.r.toString();
    }
}
