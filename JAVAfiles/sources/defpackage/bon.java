package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bon {
    public static final bzc a = new bxj(cav.a, AnonymousClass1.a);
    private static final boo b;
    private static final boo c;

    /* compiled from: PG */
    /* renamed from: bon$1 */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<bol> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return new bol(cku.h);
        }
    }

    static {
        long j = cku.h;
        b = new boo(true, Float.NaN, j);
        c = new boo(false, Float.NaN, j);
    }

    public static /* synthetic */ afa a(boolean z, float f, long j, int i) {
        if ((i & 4) != 0) {
            j = cku.h;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        boolean z2 = true;
        int i2 = (z ? 1 : 0) | (i & 1);
        if (dqy.b(f, Float.NaN) && a.bB(j, cku.h)) {
            if (i2 != 0) {
                return b;
            }
            return c;
        }
        if (1 != i2) {
            z2 = false;
        }
        return new boo(z2, f, j);
    }
}
