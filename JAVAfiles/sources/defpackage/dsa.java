package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsa {
    public static final arqr a = AnonymousClass5.a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsa$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqr a;
        final /* synthetic */ cga b;
        final /* synthetic */ arqr c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqr arqrVar, cga cgaVar, arqr arqrVar2, int i, int i2) {
            super(2);
            this.a = arqrVar;
            this.b = cgaVar;
            this.c = arqrVar2;
            this.d = i;
            this.e = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            dsa.b(this.a, this.b, this.c, (bwj) obj, bzh.a(this.d | 1), this.e);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsa$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<cxn, arqr, arnb> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            dsn a2 = dsa.a((cxn) obj);
            a2.x = (arqr) obj2;
            a2.e = new dsm(a2);
            a2.f = true;
            a2.q.a();
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsa$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<cxn, arqr, arnb> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            dsn a2 = dsa.a((cxn) obj);
            a2.y = (arqr) obj2;
            a2.h = new dsl(a2);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dsa$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ arqr a;
        final /* synthetic */ cga b;
        final /* synthetic */ arqr c;
        final /* synthetic */ arqr d;
        final /* synthetic */ int e;
        final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(arqr arqrVar, cga cgaVar, arqr arqrVar2, arqr arqrVar3, int i, int i2) {
            super(2);
            this.a = arqrVar;
            this.b = cgaVar;
            this.c = arqrVar2;
            this.d = arqrVar3;
            this.e = i;
            this.f = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            dsa.c(this.a, this.b, this.c, this.d, (bwj) obj, bzh.a(this.e | 1), this.f);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: dsa$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqr<View, arnb> {
        public static final AnonymousClass5 a = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return arnb.a;
        }
    }

    public static final dsn a(cxn cxnVar) {
        drx drxVar = cxnVar.m;
        if (drxVar != null) {
            return (dsn) drxVar;
        }
        csg.a("Required value was null.");
        throw new armj();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.arqr r13, defpackage.cga r14, defpackage.arqr r15, defpackage.bwj r16, int r17, int r18) {
        /*
            r4 = r17
            r0 = r18 & 1
            r1 = -1783766393(0xffffffff95ade287, float:-7.023154E-26)
            r2 = r16
            bwj r1 = r2.c(r1)
            r2 = 1
            if (r0 == 0) goto L14
            r0 = r4 | 6
            r3 = r13
            goto L25
        L14:
            r0 = r4 & 6
            r3 = r13
            if (r0 != 0) goto L24
            boolean r0 = r1.I(r13)
            if (r2 == r0) goto L21
            r0 = 2
            goto L22
        L21:
            r0 = 4
        L22:
            r0 = r0 | r4
            goto L25
        L24:
            r0 = r4
        L25:
            r5 = r18 & 2
            if (r5 == 0) goto L2c
            r0 = r0 | 48
            goto L3e
        L2c:
            r6 = r4 & 48
            if (r6 != 0) goto L3e
            r6 = r14
            boolean r7 = r1.G(r14)
            if (r2 == r7) goto L3a
            r7 = 16
            goto L3c
        L3a:
            r7 = 32
        L3c:
            r0 = r0 | r7
            goto L3f
        L3e:
            r6 = r14
        L3f:
            r7 = r18 & 4
            if (r7 == 0) goto L46
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L58
        L46:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L58
            r8 = r15
            boolean r9 = r1.I(r15)
            if (r2 == r9) goto L54
            r2 = 128(0x80, float:1.8E-43)
            goto L56
        L54:
            r2 = 256(0x100, float:3.59E-43)
        L56:
            r0 = r0 | r2
            goto L59
        L58:
            r8 = r15
        L59:
            r2 = r0 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r2 != r9) goto L6c
            boolean r2 = r1.L()
            if (r2 != 0) goto L66
            goto L6c
        L66:
            r1.v()
            r2 = r6
            r12 = r8
            goto L92
        L6c:
            if (r5 == 0) goto L71
            cga$a r2 = defpackage.cga.e
            goto L72
        L71:
            r2 = r6
        L72:
            if (r7 == 0) goto L78
            arqr r5 = defpackage.dsa.a
            r12 = r5
            goto L79
        L78:
            r12 = r8
        L79:
            r5 = r0 & 14
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            r6 = r0 & 112(0x70, float:1.57E-43)
            int r0 = r0 << 6
            r5 = r5 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r6
            r10 = r5 | r0
            arqr r7 = defpackage.dsa.a
            r11 = 4
            r5 = r13
            r6 = r2
            r8 = r12
            r9 = r1
            c(r5, r6, r7, r8, r9, r10, r11)
        L92:
            bzz r6 = r1.e()
            if (r6 == 0) goto La8
            dsa$1 r7 = new dsa$1
            r0 = r7
            r1 = r13
            r3 = r12
            r4 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            bzf r6 = (defpackage.bzf) r6
            r6.d = r7
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsa.b(arqr, cga, arqr, bwj, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.arqr r21, defpackage.cga r22, defpackage.arqr r23, defpackage.arqr r24, defpackage.bwj r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsa.c(arqr, cga, arqr, arqr, bwj, int, int):void");
    }
}
