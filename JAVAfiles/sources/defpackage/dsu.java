package defpackage;

import defpackage.bwj;
import defpackage.cwl;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsu {
    public static final /* synthetic */ int a = 0;
    private static final bzc b = new bxj(cav.a, AnonymousClass1.a);

    /* compiled from: PG */
    /* renamed from: dsu$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<String> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsu$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass10 extends arrp implements arqg<UUID> {
        public static final AnonymousClass10 a = new AnonymousClass10();

        public AnonymousClass10() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return UUID.randomUUID();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsu$11, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass11 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ dth a;
        final /* synthetic */ cas b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(dth dthVar, cas casVar) {
            super(2);
            this.a = dthVar;
            this.b = casVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            cga c;
            float f;
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) != 2 || !bwjVar.L()) {
                c = dhb.c(cga.e, false, dsx.a);
                boolean I = bwjVar.I(this.a);
                dth dthVar = this.a;
                Object h = bwjVar.h();
                if (I || h == bwj.a.a) {
                    h = new dsy(dthVar);
                    bwjVar.B(h);
                }
                cga a = cuw.a(c, (arqr) h);
                if (true != ((Boolean) this.a.h.a()).booleanValue()) {
                    f = brg.a;
                } else {
                    f = 1.0f;
                }
                cga a2 = cha.a(a, f);
                cas casVar = this.b;
                int i = dsu.a;
                arqv arqvVar = (arqv) casVar.a();
                dsz dszVar = dsz.a;
                int a3 = bwg.a(bwjVar);
                bwy d = bwjVar.d();
                cga b = cfv.b(bwjVar, a2);
                int i2 = cwl.a;
                arqg arqgVar = cwl.a.a;
                bwjVar.N();
                bwjVar.A();
                if (bwjVar.K()) {
                    bwjVar.l(arqgVar);
                } else {
                    bwjVar.C();
                }
                caw.b(bwjVar, dszVar, cwl.a.e);
                caw.b(bwjVar, d, cwl.a.d);
                arqv arqvVar2 = cwl.a.f;
                if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a3))) {
                    Integer valueOf = Integer.valueOf(a3);
                    bwjVar.B(valueOf);
                    bwjVar.j(valueOf, arqvVar2);
                }
                caw.b(bwjVar, b, cwl.a.c);
                arqvVar.a(bwjVar, 0);
                bwjVar.p();
            } else {
                bwjVar.v();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsu$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cfq a;
        final /* synthetic */ arqg b;
        final /* synthetic */ dtn c;
        final /* synthetic */ arqv d;
        final /* synthetic */ int e;
        final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cfq cfqVar, arqg arqgVar, dtn dtnVar, arqv arqvVar, int i, int i2) {
            super(2);
            this.a = cfqVar;
            this.b = arqgVar;
            this.c = dtnVar;
            this.d = arqvVar;
            this.e = i;
            this.f = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            dsu.c(this.a, this.b, this.c, this.d, (bwj) obj, bzh.a(this.e | 1), this.f);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsu$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ dth a;
        final /* synthetic */ arqg b;
        final /* synthetic */ dtn c;
        final /* synthetic */ drk d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(dth dthVar, arqg arqgVar, dtn dtnVar, drk drkVar) {
            super(1);
            this.a = dthVar;
            this.b = arqgVar;
            this.c = dtnVar;
            this.d = drkVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dth dthVar = this.a;
            dthVar.b.addView(dthVar, dthVar.c);
            this.a.n(this.b, this.c, this.d);
            return new dsv(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsu$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqg<arnb> {
        final /* synthetic */ dth a;
        final /* synthetic */ arqg b;
        final /* synthetic */ dtn c;
        final /* synthetic */ drk d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(dth dthVar, arqg arqgVar, dtn dtnVar, drk drkVar) {
            super(0);
            this.a = dthVar;
            this.b = arqgVar;
            this.c = dtnVar;
            this.d = drkVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            this.a.n(this.b, this.c, this.d);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsu$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ dth a;
        final /* synthetic */ dtm b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(dth dthVar, dtm dtmVar) {
            super(1);
            this.a = dthVar;
            this.b = dtmVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dth dthVar = this.a;
            dthVar.d = this.b;
            dthVar.m();
            return new dsw();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsu$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ dth b;
        private /* synthetic */ Object c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: dsu$6$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arrp implements arqr<Long, arnb> {
            public static final AnonymousClass1 a = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                ((Number) obj).longValue();
                return arnb.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(dth dthVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = dthVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass6) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        
            if (r3.a() == r0) goto L13;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
        @Override // defpackage.arpq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.lang.Object r9) {
            /*
                r8 = this;
                arpl r0 = defpackage.arpl.a
                int r1 = r8.a
                r2 = 1
                if (r1 == 0) goto Lf
                java.lang.Object r1 = r8.c
                arwe r1 = (defpackage.arwe) r1
                defpackage.aqil.P(r9)
                goto L43
            Lf:
                defpackage.aqil.P(r9)
                java.lang.Object r9 = r8.c
                arwe r9 = (defpackage.arwe) r9
                r1 = r9
            L17:
                boolean r9 = defpackage.arwi.h(r1)
                if (r9 == 0) goto L5f
                dsu$6$1 r9 = defpackage.dsu.AnonymousClass6.AnonymousClass1.a
                r8.c = r1
                r8.a = r2
                arpi r3 = r8.u()
                dcw$a r4 = defpackage.dcw.a
                arpg r3 = r3.get(r4)
                dcw r3 = (defpackage.dcw) r3
                if (r3 != 0) goto L36
                java.lang.Object r9 = defpackage.byf.c(r9, r8)
                goto L40
            L36:
                dcx r4 = new dcx
                r5 = 0
                r4.<init>(r9, r5)
                java.lang.Object r9 = r3.a()
            L40:
                if (r9 != r0) goto L43
                return r0
            L43:
                dth r9 = r8.b
                int[] r3 = r9.i
                r4 = 0
                r5 = r3[r4]
                r6 = r3[r2]
                android.view.View r7 = r9.a
                r7.getLocationOnScreen(r3)
                int[] r3 = r9.i
                r4 = r3[r4]
                if (r5 != r4) goto L5b
                r3 = r3[r2]
                if (r6 == r3) goto L17
            L5b:
                r9.l()
                goto L17
            L5f:
                arnb r9 = defpackage.arnb.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dsu.AnonymousClass6.b(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.b, arpeVar);
            anonymousClass6.c = obj;
            return anonymousClass6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsu$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends arrp implements arqr<cti, arnb> {
        final /* synthetic */ dth a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(dth dthVar) {
            super(1);
            this.a = dthVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cti o = ((cti) obj).o();
            o.getClass();
            dth dthVar = this.a;
            dthVar.g.h(o);
            dthVar.l();
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsu$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass9 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ dtm a;
        final /* synthetic */ arqg b;
        final /* synthetic */ dtn c;
        final /* synthetic */ arqv d;
        final /* synthetic */ int e;
        final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(dtm dtmVar, arqg arqgVar, dtn dtnVar, arqv arqvVar, int i, int i2) {
            super(2);
            this.a = dtmVar;
            this.b = arqgVar;
            this.c = dtnVar;
            this.d = arqvVar;
            this.e = i;
            this.f = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            dsu.b(this.a, this.b, this.c, this.d, (bwj) obj, bzh.a(this.e | 1), this.f);
            return arnb.a;
        }
    }

    public static final int a(dtn dtnVar, boolean z) {
        boolean z2 = dtnVar.b;
        int i = dtnVar.a;
        if (z2) {
            if (z) {
                return i | 8192;
            }
            return i & (-8193);
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.dtm r26, defpackage.arqg r27, defpackage.dtn r28, defpackage.arqv r29, defpackage.bwj r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsu.b(dtm, arqg, dtn, arqv, bwj, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.cfq r15, defpackage.arqg r16, defpackage.dtn r17, defpackage.arqv r18, defpackage.bwj r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsu.c(cfq, arqg, dtn, arqv, bwj, int, int):void");
    }
}
