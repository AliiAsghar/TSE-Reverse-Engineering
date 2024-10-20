package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azv {
    public static final ceh a = cdx.a(AnonymousClass1.a, AnonymousClass2.a);
    public long b;
    private final byj c;
    private final byj d;
    private cjp e;
    private final byn f;

    /* compiled from: PG */
    /* renamed from: azv$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<cek, azv, List<? extends Object>> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            boolean z;
            azv azvVar = (azv) obj2;
            Float valueOf = Float.valueOf(azvVar.b());
            if (azvVar.c() == ahp.a) {
                z = true;
            } else {
                z = false;
            }
            return aqjn.B(valueOf, Boolean.valueOf(z));
        }
    }

    /* compiled from: PG */
    /* renamed from: azv$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<List<? extends Object>, azv> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ahp ahpVar;
            List list = (List) obj;
            Object obj2 = list.get(1);
            obj2.getClass();
            if (((Boolean) obj2).booleanValue()) {
                ahpVar = ahp.a;
            } else {
                ahpVar = ahp.b;
            }
            Object obj3 = list.get(0);
            obj3.getClass();
            return new azv(ahpVar, ((Float) obj3).floatValue());
        }
    }

    public azv() {
        this(ahp.a);
    }

    public final float a() {
        return this.d.b();
    }

    public final float b() {
        return this.c.b();
    }

    public final ahp c() {
        return (ahp) this.f.a();
    }

    public final void d(float f) {
        this.c.d(f);
    }

    public final void e(ahp ahpVar, cjp cjpVar, int i, int i2) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4 = i2 - i;
        this.d.d(f4);
        cjp cjpVar2 = this.e;
        if (cjpVar.b != cjpVar2.b || cjpVar.c != cjpVar2.c) {
            if (ahpVar == ahp.a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f = cjpVar.c;
            } else {
                f = cjpVar.b;
            }
            if (z) {
                f2 = cjpVar.e;
            } else {
                f2 = cjpVar.d;
            }
            float b = b();
            float f5 = i;
            float f6 = b + f5;
            if (f2 > f6 || (f < b && f2 - f > f5)) {
                f3 = f2 - f6;
            } else if (f < b && f2 - f <= f5) {
                f3 = f - b;
            } else {
                f3 = 0.0f;
            }
            d(b() + f3);
            this.e = cjpVar;
        }
        d(arrn.q(b(), brg.a, f4));
    }

    public azv(ahp ahpVar, float f) {
        this.c = new byr(f);
        this.d = new byr(brg.a);
        this.e = cjp.a;
        this.b = djc.a;
        this.f = new byu(ahpVar, cav.a);
    }

    public /* synthetic */ azv(ahp ahpVar) {
        this(ahpVar, brg.a);
    }
}
