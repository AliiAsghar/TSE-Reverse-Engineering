package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface cwl {
    public static final /* synthetic */ int a = 0;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final arqg a = cxn.b;
        public static final arqg b = AnonymousClass5.a;
        public static final arqv c = AnonymousClass3.a;
        public static final arqv d = AnonymousClass4.a;
        public static final arqv e = AnonymousClass2.a;
        public static final arqv f = AnonymousClass1.a;

        /* compiled from: PG */
        /* renamed from: cwl$a$1, reason: invalid class name */
        /* loaded from: classes.dex */
        static final class AnonymousClass1 extends arrp implements arqv<cwl, Integer, arnb> {
            public static final AnonymousClass1 a = new AnonymousClass1();

            public AnonymousClass1() {
                super(2);
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                ((Number) obj2).intValue();
                ((cwl) obj).i();
                return arnb.a;
            }
        }

        /* compiled from: PG */
        /* renamed from: cwl$a$2, reason: invalid class name */
        /* loaded from: classes.dex */
        static final class AnonymousClass2 extends arrp implements arqv<cwl, cue, arnb> {
            public static final AnonymousClass2 a = new AnonymousClass2();

            public AnonymousClass2() {
                super(2);
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                ((cwl) obj).g((cue) obj2);
                return arnb.a;
            }
        }

        /* compiled from: PG */
        /* renamed from: cwl$a$3, reason: invalid class name */
        /* loaded from: classes.dex */
        static final class AnonymousClass3 extends arrp implements arqv<cwl, cga, arnb> {
            public static final AnonymousClass3 a = new AnonymousClass3();

            public AnonymousClass3() {
                super(2);
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                ((cwl) obj).h((cga) obj2);
                return arnb.a;
            }
        }

        /* compiled from: PG */
        /* renamed from: cwl$a$4, reason: invalid class name */
        /* loaded from: classes.dex */
        static final class AnonymousClass4 extends arrp implements arqv<cwl, bwy, arnb> {
            public static final AnonymousClass4 a = new AnonymousClass4();

            public AnonymousClass4() {
                super(2);
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                ((cwl) obj).f((bwy) obj2);
                return arnb.a;
            }
        }

        /* compiled from: PG */
        /* renamed from: cwl$a$5, reason: invalid class name */
        /* loaded from: classes.dex */
        static final class AnonymousClass5 extends arrp implements arqg<cxn> {
            public static final AnonymousClass5 a = new AnonymousClass5();

            public AnonymousClass5() {
                super(0);
            }

            @Override // defpackage.arqg
            public final /* synthetic */ Object a() {
                return new cxn(true, 2, null);
            }
        }
    }

    static {
        arqg arqgVar = a.a;
    }

    void f(bwy bwyVar);

    void g(cue cueVar);

    void h(cga cgaVar);

    void i();
}
