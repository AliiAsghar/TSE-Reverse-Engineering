package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgx {
    public static final bzc a = new bxj(cav.a, AnonymousClass1.a);
    public static final bin b;
    public static final bin c;
    public static final bin d;
    private static final bgy e;
    private static final bgy f;

    /* compiled from: PG */
    /* renamed from: bgx$1 */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<bgw> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return new bgw(cku.h);
        }
    }

    static {
        long j = cku.h;
        e = new bgy(true, Float.NaN, j);
        f = new bgy(false, Float.NaN, j);
        b = new bin(0.16f, 0.24f, 0.08f, 0.24f);
        c = new bin(0.08f, 0.12f, 0.04f, 0.12f);
        d = new bin(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static /* synthetic */ afa a(boolean z, float f2, int i) {
        int i2 = i & 2;
        long j = cku.h;
        if (i2 != 0) {
            f2 = Float.NaN;
        }
        boolean b2 = dqy.b(f2, Float.NaN);
        boolean z2 = true;
        int i3 = (z ? 1 : 0) | (i & 1);
        if (b2 && a.bB(j, cku.h)) {
            if (i3 != 0) {
                return e;
            }
            return f;
        }
        if (1 != i3) {
            z2 = false;
        }
        return new bgy(z2, f2, j);
    }
}
