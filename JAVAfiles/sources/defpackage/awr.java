package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awr {
    public static final arqw a = new cdj(997835932, false, AnonymousClass1.a);

    /* compiled from: PG */
    /* renamed from: awr$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqw<arqv<? super bwj, ? super Integer, ? extends arnb>, bwj, Integer, arnb> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(3);
        }

        @Override // defpackage.arqw
        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            int i;
            arqv arqvVar = (arqv) obj;
            bwj bwjVar = (bwj) obj2;
            int intValue = ((Number) obj3).intValue();
            if ((intValue & 6) == 0) {
                if (true != bwjVar.I(arqvVar)) {
                    i = 2;
                } else {
                    i = 4;
                }
                intValue |= i;
            }
            if ((intValue & 19) == 18 && bwjVar.L()) {
                bwjVar.v();
            } else {
                arqvVar.a(bwjVar, Integer.valueOf(intValue & 14));
            }
            return arnb.a;
        }
    }
}
