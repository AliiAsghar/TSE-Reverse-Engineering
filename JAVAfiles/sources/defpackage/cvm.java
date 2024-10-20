package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvm {
    public final cvo a;
    public ctt b;
    public final arqv c;
    public final arqv d;
    public final arqv e;

    /* compiled from: PG */
    /* renamed from: cvm$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<cxn, bwr, arnb> {
        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            cvm.this.a().b = (bwr) obj2;
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: cvm$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqv<cxn, arqv<? super cvn, ? super dqs, ? extends cuf>, arnb> {
        public AnonymousClass2() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ctt a = cvm.this.a();
            ((cxn) obj).g(new ctu(a, (arqv) obj2, a.k));
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: cvm$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqv<cxn, cvm, arnb> {
        public AnonymousClass3() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            cxn cxnVar = (cxn) obj;
            ctt cttVar = cxnVar.y;
            cvm cvmVar = cvm.this;
            if (cttVar == null) {
                ctt cttVar2 = new ctt(cxnVar, cvmVar.a);
                cxnVar.y = cttVar2;
                cttVar = cttVar2;
            }
            cvmVar.b = cttVar;
            cvm.this.a().i();
            cvm cvmVar2 = cvm.this;
            ctt a = cvmVar2.a();
            cvo cvoVar = a.c;
            cvo cvoVar2 = cvmVar2.a;
            if (cvoVar != cvoVar2) {
                a.c = cvoVar2;
                a.j(false);
                cxn.aw(a.a, false, 7);
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface a {
        int a();

        void b();

        void c(int i, long j);

        void d(arqr arqrVar);
    }

    public cvm(cvo cvoVar) {
        this.a = cvoVar;
        this.c = new AnonymousClass3();
        this.d = new AnonymousClass1();
        this.e = new AnonymousClass2();
    }

    public final ctt a() {
        ctt cttVar = this.b;
        if (cttVar != null) {
            return cttVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public cvm() {
        this(cup.a);
    }
}
