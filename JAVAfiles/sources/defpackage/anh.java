package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anh {
    public static final cwc a = new cwc(AnonymousClass1.a);

    /* compiled from: PG */
    /* renamed from: anh$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<and> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return new akw();
        }
    }

    /* compiled from: PG */
    /* renamed from: anh$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqw<cga, bwj, Integer, cga> {
        final /* synthetic */ arqr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arqr arqrVar) {
            super(3);
            this.a = arqrVar;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            bwj bwjVar = (bwj) obj2;
            ((Number) obj3).intValue();
            bwjVar.y(-1608161351);
            boolean G = bwjVar.G(this.a);
            Object h = bwjVar.h();
            if (G || h == bwj.a.a) {
                h = new akp(this.a);
                bwjVar.B(h);
            }
            akp akpVar = (akp) h;
            bwjVar.q();
            return akpVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: anh$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqw<cga, bwj, Integer, cga> {
        final /* synthetic */ and a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(and andVar) {
            super(3);
            this.a = andVar;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            bwj bwjVar = (bwj) obj2;
            ((Number) obj3).intValue();
            bwjVar.y(-1415685722);
            boolean G = bwjVar.G(this.a);
            Object h = bwjVar.h();
            if (G || h == bwj.a.a) {
                h = new als(this.a);
                bwjVar.B(h);
            }
            als alsVar = (als) h;
            bwjVar.q();
            return alsVar;
        }
    }

    public static final cga a(cga cgaVar, arqr arqrVar) {
        return cfv.g(cgaVar, new AnonymousClass2(arqrVar));
    }

    public static final cga b(cga cgaVar, and andVar) {
        return cfv.g(cgaVar, new AnonymousClass3(andVar));
    }
}
