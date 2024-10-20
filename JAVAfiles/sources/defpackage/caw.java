package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class caw<T> {

    /* compiled from: PG */
    /* renamed from: caw$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<T, arnb, arnb> {
        final /* synthetic */ arqr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqr arqrVar) {
            super(2);
            this.a = arqrVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            this.a.a(obj);
            return arnb.a;
        }
    }

    public static final void a(bwj bwjVar, arqr arqrVar) {
        if (((bwk) bwjVar).y) {
            bwjVar.j(arnb.a, new AnonymousClass1(arqrVar));
        }
    }

    public static final void b(bwj bwjVar, Object obj, arqv arqvVar) {
        if (!bwjVar.K() && d.F(bwjVar.h(), obj)) {
            return;
        }
        bwjVar.B(obj);
        bwjVar.j(obj, arqvVar);
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
