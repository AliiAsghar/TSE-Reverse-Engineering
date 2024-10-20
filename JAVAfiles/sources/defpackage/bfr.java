package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfr<T> {
    public final arqg a;
    public final cas b;
    public final byj c;
    private final byn d;
    private final byn e;
    private final byn f;

    /* compiled from: PG */
    /* renamed from: bfr$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<T> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final Object a() {
            Object d = bfr.this.d();
            if (d == null) {
                bfr bfrVar = bfr.this;
                float a = bfrVar.a();
                if (!Float.isNaN(a)) {
                    Object c = bfrVar.c();
                    bge b = bfrVar.b();
                    b.b();
                    if (a != Float.NaN && !Float.isNaN(Float.NaN)) {
                        if (a > Float.NaN) {
                            b.a();
                        } else {
                            b.a();
                        }
                    }
                    return c;
                }
                return bfrVar.c();
            }
            return d;
        }
    }

    /* compiled from: PG */
    /* renamed from: bfr$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqg<Float> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            bfr bfrVar = bfr.this;
            bge b = bfrVar.b();
            bfrVar.c();
            b.b();
            bfr bfrVar2 = bfr.this;
            cas casVar = bfrVar2.b;
            bge b2 = bfrVar2.b();
            casVar.a();
            b2.b();
            float abs = Math.abs(Float.NaN);
            float f = 1.0f;
            if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                bfr bfrVar3 = bfr.this;
                if (!Float.isNaN(bfrVar3.a())) {
                    float a = (bfrVar3.a() + Float.NaN) / Float.NaN;
                    if (a < 1.0E-6f) {
                        f = brg.a;
                    } else if (a <= 0.999999f) {
                        f = a;
                    }
                } else {
                    throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
                }
            }
            return Float.valueOf(f);
        }
    }

    /* compiled from: PG */
    /* renamed from: bfr$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqg<T> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.arqg
        public final Object a() {
            Object d = bfr.this.d();
            if (d == null) {
                bfr bfrVar = bfr.this;
                float a = bfrVar.a();
                if (!Float.isNaN(a)) {
                    Object c = bfrVar.c();
                    bge b = bfrVar.b();
                    b.b();
                    float floatValue = ((Number) bfrVar.a.a()).floatValue();
                    if (a == Float.NaN || Float.isNaN(Float.NaN)) {
                        return c;
                    }
                    if (a > Float.NaN) {
                        if (floatValue <= brg.a) {
                            b.a();
                            throw null;
                        }
                        b.a();
                        throw null;
                    }
                    if ((-floatValue) >= brg.a) {
                        b.a();
                        throw null;
                    }
                    b.a();
                    throw null;
                }
                return bfrVar.c();
            }
            return d;
        }
    }

    public bfr(Object obj, arqg arqgVar) {
        this.a = arqgVar;
        new bgs();
        this.d = new byu(obj, cav.a);
        new bxd(new AnonymousClass3(), null);
        this.b = new bxd(new AnonymousClass1(), null);
        this.c = new byr(Float.NaN);
        new bxd(new AnonymousClass2(), cav.a);
        new byr(brg.a);
        this.e = new byu(null, cav.a);
        this.f = new byu(new bgt(arnw.a), cav.a);
    }

    public final float a() {
        return this.c.b();
    }

    public final bge b() {
        return (bge) this.f.a();
    }

    public final Object c() {
        return this.d.a();
    }

    public final Object d() {
        return this.e.a();
    }
}
