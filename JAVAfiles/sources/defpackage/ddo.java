package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddo {
    private static final bzc a = new cat(AnonymousClass1.a);

    /* compiled from: PG */
    /* renamed from: ddo$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<dcd> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ddo$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arps {
        /* synthetic */ Object a;
        int b;

        public AnonymousClass2(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return ddo.a(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ddo$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arps {
        /* synthetic */ Object a;
        int b;

        public AnonymousClass3(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return ddo.b(null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.ddn r4, defpackage.arqv r5, defpackage.arpe r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ddo.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r6
            ddo$2 r0 = (defpackage.ddo.AnonymousClass2) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ddo$2 r0 = new ddo$2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            defpackage.aqil.P(r6)
            goto L56
        L2f:
            defpackage.aqil.P(r6)
            r6 = r4
            cga$c r6 = (cga.c) r6
            cga$c r6 = r6.p
            boolean r6 = r6.z
            if (r6 == 0) goto L5c
            czb r6 = defpackage.cwp.g(r4)
            cxn r4 = defpackage.cwp.e(r4)
            bwy r4 = r4.t
            bzc r2 = defpackage.ddo.a
            java.lang.Object r4 = r4.b(r2)
            dcd r4 = (defpackage.dcd) r4
            r0.b = r3
            java.lang.Object r4 = b(r6, r4, r5, r0)
            if (r4 != r1) goto L56
            return r1
        L56:
            armj r4 = new armj
            r4.<init>()
            throw r4
        L5c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddo.a(ddn, arqv, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.czb r5, defpackage.dcd r6, defpackage.arqv r7, defpackage.arpe r8) {
        /*
            boolean r0 = r8 instanceof defpackage.ddo.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r8
            ddo$3 r0 = (defpackage.ddo.AnonymousClass3) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ddo$3 r0 = new ddo$3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2e:
            defpackage.aqil.P(r8)
            armj r5 = new armj
            r5.<init>()
            throw r5
        L37:
            defpackage.aqil.P(r8)
            goto L49
        L3b:
            defpackage.aqil.P(r8)
            if (r6 != 0) goto L4f
            r0.b = r4
            java.lang.Object r5 = r5.n(r7, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            armj r5 = new armj
            r5.<init>()
            throw r5
        L4f:
            r0.b = r3
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddo.b(czb, dcd, arqv, arpe):java.lang.Object");
    }
}
