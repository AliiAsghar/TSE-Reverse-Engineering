package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyw implements czc {
    public static final arqr a = AnonymousClass1.a;
    public final cyu b;

    /* compiled from: PG */
    /* renamed from: cyw$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cyw, arnb> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cyw cywVar = (cyw) obj;
            if (cywVar.J()) {
                cywVar.b.a();
            }
            return arnb.a;
        }
    }

    public cyw(cyu cyuVar) {
        this.b = cyuVar;
    }

    @Override // defpackage.czc
    public final boolean J() {
        return this.b.A().z;
    }
}
