package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnu {
    public static final bzc a = new cat(AnonymousClass1.a);

    /* compiled from: PG */
    /* renamed from: bnu$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<bnt> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return new bns();
        }
    }

    public static final aap a(buz buzVar, bwj bwjVar) {
        bnt b = bmp.b(bwjVar);
        buz buzVar2 = buz.a;
        int ordinal = buzVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return b.e();
                            }
                            throw new armm();
                        }
                        return b.c();
                    }
                    return b.a();
                }
                return b.f();
            }
            return b.d();
        }
        return b.b();
    }
}
