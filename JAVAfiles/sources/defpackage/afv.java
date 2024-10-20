package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afv implements aig {
    public static final ceh a = new cej(AnonymousClass1.a, AnonymousClass2.a);
    public float e;
    private final byk f;
    public final byk b = new bys(0);
    public final ajr c = new ajs();
    public final byk d = new bys(Integer.MAX_VALUE);
    private final aig g = new agv(new AnonymousClass5());
    private final cas h = new bxd(new AnonymousClass4(), null);
    private final cas i = new bxd(new AnonymousClass3(), null);

    /* compiled from: PG */
    /* renamed from: afv$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<cek, afv, Integer> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return Integer.valueOf(((afv) obj2).c());
        }
    }

    /* compiled from: PG */
    /* renamed from: afv$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<Integer, afv> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            return new afv(((Number) obj).intValue());
        }
    }

    /* compiled from: PG */
    /* renamed from: afv$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqg<Boolean> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            boolean z;
            if (afv.this.c() > 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: PG */
    /* renamed from: afv$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqg<Boolean> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            boolean z;
            afv afvVar = afv.this;
            if (afvVar.c() < afvVar.b()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: PG */
    /* renamed from: afv$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqr<Float, Float> {
        public AnonymousClass5() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            float floatValue = ((Number) obj).floatValue();
            afv afvVar = afv.this;
            float c = afv.this.c() + floatValue + afvVar.e;
            float b = afvVar.b();
            afv afvVar2 = afv.this;
            float q = arrn.q(c, brg.a, b);
            float c2 = q - afvVar2.c();
            int round = Math.round(c2);
            afv afvVar3 = afv.this;
            afvVar3.f(afvVar3.c() + round);
            afv.this.e = c2 - round;
            if (c != q) {
                floatValue = c2;
            }
            return Float.valueOf(floatValue);
        }
    }

    public afv(int i) {
        this.f = new bys(i);
    }

    @Override // defpackage.aig
    public final float a(float f) {
        return this.g.a(f);
    }

    public final int b() {
        return this.d.b();
    }

    public final int c() {
        return this.f.b();
    }

    public final Object d(int i, zr zrVar, arpe arpeVar) {
        Object a2 = aht.a(this, i - c(), zrVar, arpeVar);
        if (a2 == arpl.a) {
            return a2;
        }
        return arnb.a;
    }

    @Override // defpackage.aig
    public final Object e(afd afdVar, arqv arqvVar, arpe arpeVar) {
        Object e = this.g.e(afdVar, arqvVar, arpeVar);
        if (e == arpl.a) {
            return e;
        }
        return arnb.a;
    }

    public final void f(int i) {
        this.f.d(i);
    }

    @Override // defpackage.aig
    public final boolean g() {
        return ((Boolean) this.i.a()).booleanValue();
    }

    @Override // defpackage.aig
    public final boolean h() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    @Override // defpackage.aig
    public final boolean i() {
        return this.g.i();
    }
}
