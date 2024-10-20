package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwx {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bwx$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bzd[] a;
        final /* synthetic */ arqv b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bzd[] bzdVarArr, arqv arqvVar, int i) {
            super(2);
            this.a = bzdVarArr;
            this.b = arqvVar;
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bzd[] bzdVarArr = this.a;
            bzd[] bzdVarArr2 = (bzd[]) Arrays.copyOf(bzdVarArr, bzdVarArr.length);
            int a = bzh.a(this.c | 1);
            bwx.b(bzdVarArr2, this.b, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bwx$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bzd a;
        final /* synthetic */ arqv b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(bzd bzdVar, arqv arqvVar, int i) {
            super(2);
            this.a = bzdVar;
            this.b = arqvVar;
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.c | 1);
            bwx.a(this.a, this.b, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r6 == r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.bzd r10, defpackage.arqv r11, defpackage.bwj r12, int r13) {
        /*
            r0 = -1350970552(0xffffffffaf79d348, float:-2.272148E-10)
            bwj r12 = r12.c(r0)
            r0 = r12
            bwk r0 = (defpackage.bwk) r0
            byx r1 = r0.P()
            java.lang.Object r2 = defpackage.bwp.b
            r3 = 201(0xc9, float:2.82E-43)
            r0.ac(r3, r2)
            java.lang.Object r2 = r0.T()
            java.lang.Object r3 = bwj.a.a
            boolean r3 = defpackage.d.F(r2, r3)
            r4 = 0
            if (r3 == 0) goto L24
            r2 = r4
            goto L29
        L24:
            r2.getClass()
            cax r2 = (defpackage.cax) r2
        L29:
            bwv r3 = r10.a
            cax r5 = r3.b(r10, r2)
            boolean r2 = defpackage.d.F(r5, r2)
            if (r2 != 0) goto L38
            r0.ad(r5)
        L38:
            boolean r6 = r0.y
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L50
            boolean r2 = r10.f
            if (r2 != 0) goto L48
            boolean r2 = defpackage.bwz.c(r1, r3)
            if (r2 != 0) goto L4c
        L48:
            byx r1 = r1.d(r3, r5)
        L4c:
            r0.u = r8
        L4e:
            r8 = r7
            goto L7c
        L50:
            caa r6 = r0.r
            int r9 = r6.e
            java.lang.Object r6 = r6.j(r9)
            r6.getClass()
            byx r6 = (defpackage.byx) r6
            boolean r9 = r0.L()
            if (r9 == 0) goto L65
            if (r2 != 0) goto L70
        L65:
            boolean r2 = r10.f
            if (r2 != 0) goto L72
            boolean r2 = defpackage.bwz.c(r1, r3)
            if (r2 != 0) goto L70
            goto L72
        L70:
            r1 = r6
            goto L76
        L72:
            byx r1 = r1.d(r3, r5)
        L76:
            boolean r2 = r0.m
            if (r2 != 0) goto L7c
            if (r6 == r1) goto L4e
        L7c:
            if (r8 == 0) goto L85
            boolean r2 = r0.y
            if (r2 != 0) goto L85
            r0.Z(r1)
        L85:
            bxr r2 = r0.l
            boolean r3 = r0.k
            int r3 = defpackage.bwp.a(r3)
            r2.e(r3)
            r0.k = r8
            r0.v = r1
            java.lang.Object r2 = defpackage.bwp.c
            r3 = 202(0xca, float:2.83E-43)
            r0.ab(r3, r2, r7, r1)
            int r1 = r13 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.a(r12, r1)
            r0.Y()
            r0.Y()
            bxr r1 = r0.l
            int r1 = r1.c()
            boolean r1 = defpackage.bwp.n(r1)
            r0.k = r1
            r0.v = r4
            bzz r12 = r12.e()
            if (r12 == 0) goto Lc9
            bwx$2 r0 = new bwx$2
            r0.<init>(r10, r11, r13)
            bzf r12 = (defpackage.bzf) r12
            r12.d = r0
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwx.a(bzd, arqv, bwj, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (defpackage.d.F(r1, r2) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.bzd[] r8, defpackage.arqv r9, defpackage.bwj r10, int r11) {
        /*
            r0 = -1390796515(0xffffffffad1a211d, float:-8.761239E-12)
            bwj r10 = r10.c(r0)
            r0 = r10
            bwk r0 = (defpackage.bwk) r0
            byx r1 = r0.P()
            java.lang.Object r2 = defpackage.bwp.b
            r3 = 201(0xc9, float:2.82E-43)
            r0.ac(r3, r2)
            boolean r2 = r0.y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L29
            cdm r2 = defpackage.cdm.d
            byx r2 = defpackage.bwz.a(r8, r1, r2)
            byx r1 = r0.Q(r1, r2)
            r0.u = r3
        L27:
            r3 = r4
            goto L67
        L29:
            caa r2 = r0.r
            java.lang.Object r2 = r2.k(r4)
            r2.getClass()
            byx r2 = (defpackage.byx) r2
            caa r5 = r0.r
            java.lang.Object r5 = r5.k(r3)
            r5.getClass()
            byx r5 = (defpackage.byx) r5
            byx r6 = defpackage.bwz.a(r8, r1, r5)
            boolean r7 = r0.L()
            if (r7 == 0) goto L59
            boolean r7 = r0.m
            if (r7 != 0) goto L59
            boolean r5 = defpackage.d.F(r5, r6)
            if (r5 != 0) goto L54
            goto L59
        L54:
            r0.aa()
            r1 = r2
            goto L27
        L59:
            byx r1 = r0.Q(r1, r6)
            boolean r5 = r0.m
            if (r5 != 0) goto L67
            boolean r2 = defpackage.d.F(r1, r2)
            if (r2 != 0) goto L27
        L67:
            if (r3 == 0) goto L70
            boolean r2 = r0.y
            if (r2 != 0) goto L70
            r0.Z(r1)
        L70:
            bxr r2 = r0.l
            boolean r5 = r0.k
            int r5 = defpackage.bwp.a(r5)
            r2.e(r5)
            r0.k = r3
            r0.v = r1
            java.lang.Object r2 = defpackage.bwp.c
            r3 = 202(0xca, float:2.83E-43)
            r0.ab(r3, r2, r4, r1)
            int r1 = r11 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.a(r10, r1)
            r0.Y()
            r0.Y()
            bxr r1 = r0.l
            int r1 = r1.c()
            boolean r1 = defpackage.bwp.n(r1)
            r0.k = r1
            r1 = 0
            r0.v = r1
            bzz r10 = r10.e()
            if (r10 == 0) goto Lb5
            bwx$1 r0 = new bwx$1
            r0.<init>(r8, r9, r11)
            bzf r10 = (defpackage.bzf) r10
            r10.d = r0
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwx.b(bzd[], arqv, bwj, int):void");
    }
}
