package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brc {
    public final dqv a;
    public final bsr b;

    /* compiled from: PG */
    /* renamed from: brc$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<Float> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Float.valueOf(brc.this.a.em(125.0f));
        }
    }

    /* compiled from: PG */
    /* renamed from: brc$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqg<zr<Float>> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return bso.a;
        }
    }

    public brc(brd brdVar, dqv dqvVar, arqr arqrVar, arqr arqrVar2) {
        this.a = dqvVar;
        this.b = new bsr(brdVar, arqrVar2, new AnonymousClass1(), AnonymousClass2.a, arqrVar);
    }

    public final brd a() {
        return (brd) this.b.j();
    }
}
