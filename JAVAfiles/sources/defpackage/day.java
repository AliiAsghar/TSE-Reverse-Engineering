package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class day {
    public static final arqv a = AnonymousClass1.a;

    /* compiled from: PG */
    /* renamed from: day$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<dhe, dhe, Integer> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            dgy dgyVar = ((dhe) obj).c;
            dhn dhnVar = dhh.a;
            return Integer.valueOf(Float.compare(((Number) dgyVar.b(dhh.p, daw.a)).floatValue(), ((Number) ((dhe) obj2).c.b(dhh.p, dax.a)).floatValue()));
        }
    }

    public static final boolean a(dhe dheVar) {
        dgy e = dheVar.e();
        dhn dhnVar = dhh.a;
        if (!e.d(dhh.i)) {
            return true;
        }
        return false;
    }

    public static final boolean b(dhe dheVar) {
        if (dheVar.b.r == drk.b) {
            return true;
        }
        return false;
    }
}
