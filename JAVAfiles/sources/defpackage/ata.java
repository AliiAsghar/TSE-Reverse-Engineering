package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ata {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ata$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ asw a;
        final /* synthetic */ arqw b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(asw aswVar, arqw arqwVar) {
            super(2);
            this.a = aswVar;
            this.b = arqwVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                asw aswVar = this.a;
                bwjVar.y(-796079677);
                ceb cebVar = (ceb) cdy.b(new Object[0], ceb.a, ced.a, bwjVar, 3072, 4);
                cebVar.c = (cee) bwjVar.g(ceg.a);
                bwjVar.q();
                aswVar.b.h(cebVar);
                this.b.a(this.a, bwjVar, 0);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ata$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqw a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arqw arqwVar, int i) {
            super(2);
            this.a = arqwVar;
            this.b = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.b | 1);
            ata.a(this.a, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ata$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqg<asw> {
        final /* synthetic */ cee a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(cee ceeVar) {
            super(0);
            this.a = ceeVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return new asw(this.a, arnw.a);
        }
    }

    public static final void a(arqw arqwVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 6;
        bwj c = bwjVar.c(674185128);
        if (i4 == 0) {
            if (true != c.I(arqwVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c.L()) {
            c.v();
        } else {
            cee ceeVar = (cee) c.g(ceg.a);
            Object[] objArr = {ceeVar};
            cej cejVar = new cej(asx.a, new asy(ceeVar));
            boolean I = c.I(ceeVar);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (I || T == bwj.a.a) {
                T = new AnonymousClass3(ceeVar);
                bwkVar.ad(T);
            }
            asw aswVar = (asw) cdy.b(objArr, cejVar, (arqg) T, c, 0, 4);
            bwx.a(ceg.a.c(aswVar), cdk.e(1863926504, new AnonymousClass1(aswVar, arqwVar), c), c, 56);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(arqwVar, i);
        }
    }
}
