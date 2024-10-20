package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anv extends ark<anu> implements aos {
    public final atb a = new atb();

    /* compiled from: PG */
    /* renamed from: anv$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<Integer, Object> {
        final /* synthetic */ Object a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj) {
            super(1);
            this.a = obj;
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            ((Number) obj).intValue();
            return this.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: anv$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<Integer, Object> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((Number) obj).intValue();
            return null;
        }
    }

    /* compiled from: PG */
    /* renamed from: anv$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqx<anq, Integer, bwj, Integer, arnb> {
        final /* synthetic */ arqw a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(arqw arqwVar) {
            super(4);
            this.a = arqwVar;
        }

        @Override // defpackage.arqx
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
            int i;
            anq anqVar = (anq) obj;
            ((Number) obj2).intValue();
            bwj bwjVar = (bwj) obj3;
            int intValue = ((Number) obj4).intValue();
            if ((intValue & 6) == 0) {
                if (true != bwjVar.G(anqVar)) {
                    i = 2;
                } else {
                    i = 4;
                }
                intValue |= i;
            }
            if ((intValue & 131) == 130 && bwjVar.L()) {
                bwjVar.v();
            } else {
                this.a.a(anqVar, bwjVar, Integer.valueOf(intValue & 14));
            }
            return arnb.a;
        }
    }

    public anv(arqr arqrVar) {
        arqrVar.a(this);
    }

    @Override // defpackage.ark
    public final /* synthetic */ ara a() {
        return this.a;
    }

    @Override // defpackage.aos
    public final void b(int i, arqr arqrVar, arqr arqrVar2, arqx arqxVar) {
        this.a.b(i, new anu(arqrVar, arqrVar2, arqxVar));
    }

    @Override // defpackage.aos
    public final void c(Object obj, arqw arqwVar) {
        AnonymousClass1 anonymousClass1;
        if (obj != null) {
            anonymousClass1 = new AnonymousClass1(obj);
        } else {
            anonymousClass1 = null;
        }
        this.a.b(1, new anu(anonymousClass1, new AnonymousClass2(), new cdj(-1010194746, true, new AnonymousClass3(arqwVar))));
    }
}
