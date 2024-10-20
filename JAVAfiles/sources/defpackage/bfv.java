package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfv {
    public static final arqw a = new cdj(996639038, false, AnonymousClass1.a);

    /* compiled from: PG */
    /* renamed from: bfv$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqw<bhm, bwj, Integer, arnb> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(3);
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            boolean I;
            int i;
            bhm bhmVar = (bhm) obj;
            bwj bwjVar = (bwj) obj2;
            int intValue = ((Number) obj3).intValue();
            if ((intValue & 6) == 0) {
                if ((intValue & 8) == 0) {
                    I = bwjVar.G(bhmVar);
                } else {
                    I = bwjVar.I(bhmVar);
                }
                if (true != I) {
                    i = 2;
                } else {
                    i = 4;
                }
                intValue |= i;
            }
            if ((intValue & 19) == 18 && bwjVar.L()) {
                bwjVar.v();
            } else {
                bhy.b(bhmVar, null, null, 0L, 0L, 0L, brg.a, bwjVar, intValue & 14);
            }
            return arnb.a;
        }
    }
}
