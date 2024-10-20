package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aci {
    public static final acg a = new ach(AnonymousClass5.a, AnonymousClass6.a);
    public static final acg b = new ach(AnonymousClass11.a, AnonymousClass12.a);
    public static final acg c = new ach(AnonymousClass3.a, AnonymousClass4.a);
    public static final acg d = new ach(AnonymousClass1.a, AnonymousClass2.a);
    public static final acg e = new ach(AnonymousClass17.a, AnonymousClass18.a);
    public static final acg f = new ach(AnonymousClass13.a, AnonymousClass14.a);
    public static final acg g = new ach(AnonymousClass7.a, AnonymousClass8.a);
    public static final acg h = new ach(AnonymousClass9.a, AnonymousClass10.a);
    public static final acg i = new ach(AnonymousClass15.a, AnonymousClass16.a);

    /* compiled from: PG */
    /* renamed from: aci$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<dqz, zw> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j = ((dqz) obj).a;
            return new zw(dqz.a(j), dqz.b(j));
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$10, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass10 extends arrp implements arqr<zw, dri> {
        public static final AnonymousClass10 a = new AnonymousClass10();

        public AnonymousClass10() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            zw zwVar = (zw) obj;
            int round = Math.round(zwVar.a);
            int i = 0;
            if (round < 0) {
                round = 0;
            }
            int round2 = Math.round(zwVar.b);
            if (round2 >= 0) {
                i = round2;
            }
            return new dri(i | (round << 32));
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$11, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass11 extends arrp implements arqr<Integer, zv> {
        public static final AnonymousClass11 a = new AnonymousClass11();

        public AnonymousClass11() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return new zv(((Number) obj).intValue());
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$12, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass12 extends arrp implements arqr<zv, Integer> {
        public static final AnonymousClass12 a = new AnonymousClass12();

        public AnonymousClass12() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return Integer.valueOf((int) ((zv) obj).a);
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$13, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass13 extends arrp implements arqr<cjn, zw> {
        public static final AnonymousClass13 a = new AnonymousClass13();

        public AnonymousClass13() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j = ((cjn) obj).a;
            return new zw(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$14, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass14 extends arrp implements arqr<zw, cjn> {
        public static final AnonymousClass14 a = new AnonymousClass14();

        public AnonymousClass14() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            return new cjn(a.bG((zw) obj));
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$15, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass15 extends arrp implements arqr<cjp, zy> {
        public static final AnonymousClass15 a = new AnonymousClass15();

        public AnonymousClass15() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cjp cjpVar = (cjp) obj;
            return new zy(cjpVar.b, cjpVar.c, cjpVar.d, cjpVar.e);
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$16, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass16 extends arrp implements arqr<zy, cjp> {
        public static final AnonymousClass16 a = new AnonymousClass16();

        public AnonymousClass16() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            zy zyVar = (zy) obj;
            return new cjp(zyVar.a, zyVar.b, zyVar.c, zyVar.d);
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$17, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass17 extends arrp implements arqr<cjt, zw> {
        public static final AnonymousClass17 a = new AnonymousClass17();

        public AnonymousClass17() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j = ((cjt) obj).a;
            return new zw(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$18, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass18 extends arrp implements arqr<zw, cjt> {
        public static final AnonymousClass18 a = new AnonymousClass18();

        public AnonymousClass18() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            return new cjt(a.bG((zw) obj));
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<zw, dqz> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            return new dqz(a.bG((zw) obj));
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<dqy, zv> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            return new zv(((dqy) obj).a);
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqr<zv, dqy> {
        public static final AnonymousClass4 a = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            return new dqy(((zv) obj).a);
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqr<Float, zv> {
        public static final AnonymousClass5 a = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            return new zv(((Number) obj).floatValue());
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$6, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass6 extends arrp implements arqr<zv, Float> {
        public static final AnonymousClass6 a = new AnonymousClass6();

        public AnonymousClass6() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return Float.valueOf(((zv) obj).a);
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$7, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass7 extends arrp implements arqr<dre, zw> {
        public static final AnonymousClass7 a = new AnonymousClass7();

        public AnonymousClass7() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j = ((dre) obj).a;
            return new zw(dre.a(j), dre.b(j));
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$8, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass8 extends arrp implements arqr<zw, dre> {
        public static final AnonymousClass8 a = new AnonymousClass8();

        public AnonymousClass8() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            zw zwVar = (zw) obj;
            return new dre((Math.round(zwVar.a) << 32) | (Math.round(zwVar.b) & 4294967295L));
        }
    }

    /* compiled from: PG */
    /* renamed from: aci$9, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass9 extends arrp implements arqr<dri, zw> {
        public static final AnonymousClass9 a = new AnonymousClass9();

        public AnonymousClass9() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            long j = ((dri) obj).a;
            return new zw((int) (j >> 32), (int) (j & 4294967295L));
        }
    }
}
