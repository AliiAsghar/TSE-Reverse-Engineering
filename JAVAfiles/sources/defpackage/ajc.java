package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajc {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ajc$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        float a;
        /* synthetic */ Object b;
        int c;
        zt d;
        arry e;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return ajc.b(null, brg.a, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ajc$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<zq<Float, zv>, arnb> {
        final /* synthetic */ float a;
        final /* synthetic */ arry b;
        final /* synthetic */ ahv c;
        final /* synthetic */ arqr d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f, arry arryVar, ahv ahvVar, arqr arqrVar) {
            super(1);
            this.a = f;
            this.b = arryVar;
            this.c = ahvVar;
            this.d = arqrVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            zq zqVar = (zq) obj;
            if (Math.abs(((Number) zqVar.a()).floatValue()) >= Math.abs(this.a)) {
                float a = ajc.a(((Number) zqVar.a()).floatValue(), this.a);
                ajc.d(zqVar, this.c, this.d, a - this.b.a);
                zqVar.c();
                this.b.a = a;
            } else {
                ajc.d(zqVar, this.c, this.d, ((Number) zqVar.a()).floatValue() - this.b.a);
                this.b.a = ((Number) zqVar.a()).floatValue();
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ajc$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arps {
        float a;
        float b;
        /* synthetic */ Object c;
        int d;
        zt e;
        arry f;

        public AnonymousClass3(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return ajc.c(null, brg.a, brg.a, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ajc$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqr<zq<Float, zv>, arnb> {
        final /* synthetic */ float a;
        final /* synthetic */ arry b;
        final /* synthetic */ ahv c;
        final /* synthetic */ arqr d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(float f, arry arryVar, ahv ahvVar, arqr arqrVar) {
            super(1);
            this.a = f;
            this.b = arryVar;
            this.c = ahvVar;
            this.d = arqrVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            b((zq) obj);
            return arnb.a;
        }

        public final void b(zq zqVar) {
            float f;
            float a = ajc.a(((Number) zqVar.a()).floatValue(), this.a);
            float f2 = a - this.b.a;
            try {
                f = this.c.a(f2);
            } catch (CancellationException unused) {
                zqVar.c();
                f = brg.a;
            }
            this.d.a(Float.valueOf(f));
            if (Math.abs(f2 - f) > 0.5f || a != ((Number) zqVar.a()).floatValue()) {
                zqVar.c();
            }
            this.b.a += f;
        }
    }

    public static final float a(float f, float f2) {
        if (f2 == brg.a) {
            return brg.a;
        }
        if (f2 > brg.a) {
            return arrn.p(f, f2);
        }
        return arrn.o(f, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.ahv r5, float r6, defpackage.zt r7, defpackage.aag r8, defpackage.arqr r9, defpackage.arpe r10) {
        /*
            boolean r0 = r10 instanceof defpackage.ajc.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            ajc$1 r0 = (defpackage.ajc.AnonymousClass1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajc$1 r0 = new ajc$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            float r6 = r0.a
            arry r5 = r0.e
            zt r7 = r0.d
            defpackage.aqil.P(r10)
            goto L63
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.aqil.P(r10)
            arry r10 = new arry
            r10.<init>()
            java.lang.Object r2 = r7.b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L4e
            r2 = 0
            goto L4f
        L4e:
            r2 = r3
        L4f:
            ajc$2 r4 = new ajc$2
            r4.<init>(r6, r10, r5, r9)
            r0.d = r7
            r0.e = r10
            r0.a = r6
            r0.c = r3
            java.lang.Object r5 = defpackage.abq.d(r7, r8, r2, r4, r0)
            if (r5 == r1) goto L71
            r5 = r10
        L63:
            aiv r8 = new aiv
            float r5 = r5.a
            float r6 = r6 - r5
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            r8.<init>(r5, r7)
            return r8
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajc.b(ahv, float, zt, aag, arqr, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.ahv r9, float r10, float r11, defpackage.zt r12, defpackage.zr r13, defpackage.arqr r14, defpackage.arpe r15) {
        /*
            boolean r0 = r15 instanceof defpackage.ajc.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r15
            ajc$3 r0 = (defpackage.ajc.AnonymousClass3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ajc$3 r0 = new ajc$3
            r0.<init>(r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.c
            arpl r0 = defpackage.arpl.a
            int r1 = r6.d
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            float r9 = r6.b
            float r10 = r6.a
            arry r11 = r6.f
            zt r12 = r6.e
            defpackage.aqil.P(r15)
            goto L7c
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.aqil.P(r15)
            arry r15 = new arry
            r15.<init>()
            java.lang.Object r1 = r12.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r8 = r1.floatValue()
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r10)
            java.lang.Object r1 = r12.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L61
            r1 = 0
            r4 = r1
            goto L62
        L61:
            r4 = r2
        L62:
            ajc$4 r5 = new ajc$4
            r5.<init>(r11, r15, r9, r14)
            r6.e = r12
            r6.f = r15
            r6.a = r10
            r6.b = r8
            r6.d = r2
            r1 = r12
            r2 = r3
            r3 = r13
            java.lang.Object r9 = defpackage.abq.e(r1, r2, r3, r4, r5, r6)
            if (r9 == r0) goto L9e
            r11 = r15
            r9 = r8
        L7c:
            java.lang.Object r13 = r12.b()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            float r9 = a(r13, r9)
            aiv r13 = new aiv
            float r11 = r11.a
            float r10 = r10 - r11
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r10)
            r10 = 29
            zt r9 = defpackage.zu.c(r12, r7, r9, r10)
            r13.<init>(r11, r9)
            return r13
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajc.c(ahv, float, float, zt, zr, arqr, arpe):java.lang.Object");
    }

    public static final void d(zq zqVar, ahv ahvVar, arqr arqrVar, float f) {
        float f2;
        try {
            f2 = ahvVar.a(f);
        } catch (CancellationException unused) {
            zqVar.c();
            f2 = brg.a;
        }
        arqrVar.a(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            zqVar.c();
        }
    }
}
