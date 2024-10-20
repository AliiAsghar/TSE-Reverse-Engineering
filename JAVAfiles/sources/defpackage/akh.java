package defpackage;

import defpackage.bwj;
import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akh {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: akh$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<cvn, dqs, cuf> {
        final /* synthetic */ cue a;
        final /* synthetic */ arqw b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cue cueVar, arqw arqwVar) {
            super(2);
            this.a = cueVar;
            this.b = arqwVar;
        }

        @Override // defpackage.arqv
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            cvn cvnVar = (cvn) obj;
            long j = ((dqs) obj2).a;
            return this.a.e(cvnVar, cvnVar.a(arnb.a, new cdj(-1945019079, true, new akg(this.b, new akj(cvnVar, j)))), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: akh$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ cfq b;
        final /* synthetic */ arqw c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cga cgaVar, cfq cfqVar, arqw arqwVar, int i, int i2) {
            super(2);
            this.a = cgaVar;
            this.b = cfqVar;
            this.c = arqwVar;
            this.d = i;
            this.e = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            akh.a(this.a, this.b, this.c, (bwj) obj, bzh.a(this.d | 1), this.e);
            return arnb.a;
        }
    }

    public static final void a(cga cgaVar, cfq cfqVar, arqw arqwVar, bwj bwjVar, int i, int i2) {
        cga cgaVar2;
        int i3;
        int i4;
        cga cgaVar3;
        cfq cfqVar2;
        int i5;
        int i6 = i2 & 1;
        bwj c = bwjVar.c(1781813501);
        boolean z = true;
        if (i6 != 0) {
            i3 = i | 6;
            cgaVar2 = cgaVar;
        } else if ((i & 6) == 0) {
            cgaVar2 = cgaVar;
            if (true != c.G(cgaVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i3 = i4 | i;
        } else {
            cgaVar2 = cgaVar;
            i3 = i;
        }
        int i7 = i3 | 432;
        if ((i & 3072) == 0) {
            if (true != c.I(arqwVar)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i7 |= i5;
        }
        if ((i7 & 1171) == 1170 && c.L()) {
            c.v();
            cfqVar2 = cfqVar;
        } else {
            if (i6 != 0) {
                cgaVar3 = cga.e;
            } else {
                cgaVar3 = cgaVar2;
            }
            int i8 = cfq.a;
            cfq cfqVar3 = cfq.a.a;
            cue a = akc.a(cfqVar3, false);
            if ((i7 & 7168) != 2048) {
                z = false;
            }
            boolean G = z | c.G(a);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (G || T == bwj.a.a) {
                T = new AnonymousClass1(a, arqwVar);
                bwkVar.ad(T);
            }
            cvl.a(cgaVar3, (arqv) T, c, i7 & 14, 0);
            cfqVar2 = cfqVar3;
            cgaVar2 = cgaVar3;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(cgaVar2, cfqVar2, arqwVar, i, i2);
        }
    }
}
