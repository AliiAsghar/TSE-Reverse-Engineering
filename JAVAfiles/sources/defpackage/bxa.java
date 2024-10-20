package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxa<T> extends bzc<T> {
    private final bxb a;

    /* compiled from: PG */
    /* renamed from: bxa$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<T> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final Object a() {
            bwp.g("Unexpected call to default provider");
            throw new armj();
        }
    }

    public bxa(arqr arqrVar) {
        super(AnonymousClass1.a);
        this.a = new bxb(arqrVar);
    }

    @Override // defpackage.bwv
    public final /* synthetic */ cax a() {
        return this.a;
    }

    @Override // defpackage.bzc
    public final bzd c(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        return new bzd(this, obj, z, null, true);
    }
}
