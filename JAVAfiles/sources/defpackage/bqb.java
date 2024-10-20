package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqb implements ahk {
    public arqg a;
    public arqr b;
    public final float[] c;
    public final byk d;
    public boolean e;
    public final byj f;
    public final byj g;
    public final arqg h;
    public final ahg i;
    public final aff j;
    public final arsy k;
    private final byj l;
    private final byn m;
    private final byj n;
    private final byj o;

    /* compiled from: PG */
    /* renamed from: bqb$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ afd c;
        final /* synthetic */ arqv d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(afd afdVar, arqv arqvVar, arpe arpeVar) {
            super(2, arpeVar);
            this.c = afdVar;
            this.d = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                bqb.this.h(true);
                bqb bqbVar = bqb.this;
                afd afdVar = this.c;
                arqv arqvVar = this.d;
                this.a = 1;
                if (bqbVar.j.a(bqbVar.i, afdVar, arqvVar, this) == arplVar) {
                    return arplVar;
                }
            }
            bqb.this.h(false);
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass1(this.c, this.d, arpeVar);
        }
    }

    public bqb() {
        this(brg.a, null, new arsy(brg.a, 1.0f));
    }

    @Override // defpackage.ahk
    public final Object a(afd afdVar, arqv arqvVar, arpe arpeVar) {
        Object d = arwi.d(new AnonymousClass1(afdVar, arqvVar, null), arpeVar);
        if (d == arpl.a) {
            return d;
        }
        return arnb.a;
    }

    public final float b() {
        return bpw.a(((Number) this.k.c()).floatValue(), ((Number) this.k.b()).floatValue(), arrn.q(e(), ((Number) this.k.c()).floatValue(), ((Number) this.k.b()).floatValue()));
    }

    public final float c() {
        return this.n.b();
    }

    public final float d() {
        return this.g.b();
    }

    public final float e() {
        return this.l.b();
    }

    public final int f() {
        return this.d.b();
    }

    public final void g(float f) {
        float max = Math.max(f() - (d() / 2.0f), brg.a);
        float min = Math.min(d() / 2.0f, max);
        this.n.d(c() + f + this.o.b());
        i(brg.a);
        float c = c();
        float f2 = bpw.a;
        float b = bpw.b(min, max, c, ((Number) this.k.c()).floatValue(), ((Number) this.k.b()).floatValue());
        if (b == e()) {
            return;
        }
        arqr arqrVar = this.b;
        if (arqrVar != null) {
            arqrVar.a(Float.valueOf(b));
        } else {
            j(b);
        }
    }

    public final void h(boolean z) {
        this.m.h(Boolean.valueOf(z));
    }

    public final void i(float f) {
        this.o.d(f);
    }

    public final void j(float f) {
        float q = arrn.q(f, ((Number) this.k.c()).floatValue(), ((Number) this.k.b()).floatValue());
        ((Number) this.k.c()).floatValue();
        ((Number) this.k.b()).floatValue();
        float f2 = bpw.a;
        this.l.d(q);
    }

    public final boolean k() {
        return ((Boolean) this.m.a()).booleanValue();
    }

    public bqb(float f, arqg arqgVar, arsy arsyVar) {
        this.a = arqgVar;
        this.k = arsyVar;
        this.l = new byr(f);
        float f2 = bpw.a;
        this.c = new float[0];
        this.d = new bys(0);
        this.f = new byr(brg.a);
        this.g = new byr(brg.a);
        this.m = new byu(false, cav.a);
        this.h = new bqd(this);
        this.n = new byr(bpw.b(((Number) arsyVar.c()).floatValue(), ((Number) arsyVar.b()).floatValue(), f, brg.a, brg.a));
        this.o = new byr(brg.a);
        this.i = new bqc(this);
        this.j = new aff();
    }
}
