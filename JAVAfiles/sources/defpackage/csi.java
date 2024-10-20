package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csi {
    public static final cta a = new cta(AnonymousClass1.a);
    public static final cta b = new cta(AnonymousClass2.a);

    /* compiled from: PG */
    /* renamed from: csi$1, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass1 extends arrm implements arqv<Integer, Integer, Integer> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2, arsk.class, "min", "min(II)I", 1);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
        }
    }

    /* compiled from: PG */
    /* renamed from: csi$2, reason: invalid class name */
    /* loaded from: classes.dex */
    /* synthetic */ class AnonymousClass2 extends arrm implements arqv<Integer, Integer, Integer> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(2, arsk.class, "max", "max(II)I", 1);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
        }
    }
}
