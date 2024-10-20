package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import defpackage.bwj;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vr {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: vr$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<wd, wr> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return new wr(wx.g(zs.d(220, 90, null, 4), 2).a(wx.i(zs.d(220, 90, null, 4), 0.92f, 4)), wx.h(zs.d(90, 0, null, 6), 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: vr$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ Object a;
        final /* synthetic */ cga b;
        final /* synthetic */ arqr c;
        final /* synthetic */ cfq d;
        final /* synthetic */ String e;
        final /* synthetic */ arqr f;
        final /* synthetic */ arqx g;
        final /* synthetic */ int h;
        final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Object obj, cga cgaVar, arqr arqrVar, cfq cfqVar, String str, arqr arqrVar2, arqx arqxVar, int i, int i2) {
            super(2);
            this.a = obj;
            this.b = cgaVar;
            this.c = arqrVar;
            this.d = cfqVar;
            this.e = str;
            this.f = arqrVar2;
            this.g = arqxVar;
            this.h = i;
            this.i = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            vr.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (bwj) obj, bzh.a(this.h | 1), this.i);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: vr$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ abt a;
        final /* synthetic */ Object b;
        final /* synthetic */ arqr c;
        final /* synthetic */ AnimatedContentTransitionScopeImpl d;
        final /* synthetic */ cez e;
        final /* synthetic */ arqx f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(abt abtVar, Object obj, arqr arqrVar, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, cez cezVar, arqx arqxVar) {
            super(2);
            this.a = abtVar;
            this.b = obj;
            this.c = arqrVar;
            this.d = animatedContentTransitionScopeImpl;
            this.e = cezVar;
            this.f = arqxVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            xn xnVar;
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                arqr arqrVar = this.c;
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.d;
                Object h = bwjVar.h();
                if (h == bwj.a.a) {
                    h = (wr) arqrVar.a(animatedContentTransitionScopeImpl);
                    bwjVar.B(h);
                }
                wr wrVar = (wr) h;
                boolean H = bwjVar.H(d.F(this.a.d().b(), this.b));
                abt abtVar = this.a;
                Object obj3 = this.b;
                arqr arqrVar2 = this.c;
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = this.d;
                Object h2 = bwjVar.h();
                if (H || h2 == bwj.a.a) {
                    if (d.F(abtVar.d().b(), obj3)) {
                        xnVar = xn.a;
                    } else {
                        xnVar = ((wr) arqrVar2.a(animatedContentTransitionScopeImpl2)).b;
                    }
                    h2 = xnVar;
                    bwjVar.B(h2);
                }
                Object obj4 = this.b;
                abt abtVar2 = this.a;
                xn xnVar2 = (xn) h2;
                Object h3 = bwjVar.h();
                if (h3 == bwj.a.a) {
                    h3 = new AnimatedContentTransitionScopeImpl.a(d.F(obj4, abtVar2.f()));
                    bwjVar.B(h3);
                }
                xl xlVar = wrVar.a;
                AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) h3;
                cga.a aVar2 = cga.e;
                boolean I = bwjVar.I(wrVar);
                Object h4 = bwjVar.h();
                if (I || h4 == bwj.a.a) {
                    h4 = new vt(wrVar);
                    bwjVar.B(h4);
                }
                cga a = cts.a(aVar2, (arqw) h4);
                aVar.a.h(Boolean.valueOf(d.F(this.b, this.a.f())));
                cga a2 = a.a(aVar);
                abt abtVar3 = this.a;
                boolean I2 = bwjVar.I(this.b);
                Object obj5 = this.b;
                Object h5 = bwjVar.h();
                if (I2 || h5 == bwj.a.a) {
                    h5 = new vu(obj5);
                    bwjVar.B(h5);
                }
                arqr arqrVar3 = (arqr) h5;
                boolean G = bwjVar.G(xnVar2);
                Object h6 = bwjVar.h();
                if (G || h6 == bwj.a.a) {
                    h6 = new vv(xnVar2);
                    bwjVar.B(h6);
                }
                wf.e(abtVar3, arqrVar3, a2, xlVar, xnVar2, (arqv) h6, cdk.e(-616195562, new vy(this.e, this.b, this.d, this.f), bwjVar), bwjVar, 12582912);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: vr$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ abt a;
        final /* synthetic */ cga b;
        final /* synthetic */ arqr c;
        final /* synthetic */ cfq d;
        final /* synthetic */ arqr e;
        final /* synthetic */ arqx f;
        final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(abt abtVar, cga cgaVar, arqr arqrVar, cfq cfqVar, arqr arqrVar2, arqx arqxVar, int i) {
            super(2);
            this.a = abtVar;
            this.b = cgaVar;
            this.c = arqrVar;
            this.d = cfqVar;
            this.e = arqrVar2;
            this.f = arqxVar;
            this.g = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            vr.b(this.a, this.b, this.c, this.d, this.e, this.f, (bwj) obj, bzh.a(this.g | 1));
            return arnb.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.Object r18, defpackage.cga r19, defpackage.arqr r20, defpackage.cfq r21, java.lang.String r22, defpackage.arqr r23, defpackage.arqx r24, defpackage.bwj r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr.a(java.lang.Object, cga, arqr, cfq, java.lang.String, arqr, arqx, bwj, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ba, code lost:
    
        if (r2 == bwj.a.a) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.abt r22, defpackage.cga r23, defpackage.arqr r24, defpackage.cfq r25, defpackage.arqr r26, defpackage.arqx r27, defpackage.bwj r28, int r29) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr.b(abt, cga, arqr, cfq, arqr, arqx, bwj, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: vr$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final Object a(Object obj) {
            return obj;
        }
    }
}
