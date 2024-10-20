package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfu {
    public static final arqv a = new cdj(2069405901, false, AnonymousClass1.a);
    public static final arqv b = new cdj(-231850563, false, AnonymousClass2.a);
    public static final arqw c = new cdj(-147687984, false, AnonymousClass3.a);
    public static final arqv d = new cdj(-900670499, false, AnonymousClass4.a);

    /* compiled from: PG */
    /* renamed from: bfu$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            return a.K(obj, obj2);
        }
    }

    /* compiled from: PG */
    /* renamed from: bfu$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            return a.K(obj, obj2);
        }
    }

    /* compiled from: PG */
    /* renamed from: bfu$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqw<bhv, bwj, Integer, arnb> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(3);
        }

        @Override // defpackage.arqw
        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            int i;
            bhv bhvVar = (bhv) obj;
            bwj bwjVar = (bwj) obj2;
            int intValue = ((Number) obj3).intValue();
            if ((intValue & 6) == 0) {
                if (true != bwjVar.G(bhvVar)) {
                    i = 2;
                } else {
                    i = 4;
                }
                intValue |= i;
            }
            if ((intValue & 19) == 18 && bwjVar.L()) {
                bwjVar.v();
            } else {
                bhs.b(bhvVar, null, null, bwjVar, intValue & 14);
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: bfu$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        public static final AnonymousClass4 a = new AnonymousClass4();

        public AnonymousClass4() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            return a.K(obj, obj2);
        }
    }
}
