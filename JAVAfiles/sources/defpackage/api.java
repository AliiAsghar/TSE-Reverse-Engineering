package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class api extends ark<aph> implements aqm {
    private static final arqv c = AnonymousClass1.a;
    public final aqq a = new aqq(this);
    public final atb b = new atb();

    /* compiled from: PG */
    /* renamed from: api$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<apr, Integer, apc> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            return new apc();
        }
    }

    public api(arqr arqrVar) {
        arqrVar.a(this);
    }

    @Override // defpackage.ark
    public final /* synthetic */ ara a() {
        return this.b;
    }

    @Override // defpackage.aqm
    public final void b(int i, arqr arqrVar, arqr arqrVar2, arqx arqxVar) {
        this.b.b(i, new aph(arqrVar, c, arqrVar2, arqxVar));
    }
}
