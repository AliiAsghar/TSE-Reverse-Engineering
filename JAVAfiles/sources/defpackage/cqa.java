package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqa {
    public cqc a;
    public arqg b = new AnonymousClass1();
    public arwe c;

    /* compiled from: PG */
    /* renamed from: cqa$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<arwe> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return cqa.this.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cqa$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arps {
        /* synthetic */ Object a;
        int c;

        public AnonymousClass2(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return cqa.this.d(0L, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cqa$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arps {
        /* synthetic */ Object a;
        int c;

        public AnonymousClass3(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return cqa.this.e(0L, this);
        }
    }

    public final long a(long j, long j2, int i) {
        cpz c = c();
        if (c != null) {
            return c.a(j, j2, i);
        }
        return 0L;
    }

    public final long b(long j, int i) {
        cpz c = c();
        if (c != null) {
            return c.b(j, i);
        }
        return 0L;
    }

    public final cpz c() {
        cqc cqcVar = this.a;
        if (cqcVar != null) {
            return cqcVar.e();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r8, long r10, defpackage.arpe r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.cqa.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r12
            cqa$2 r0 = (defpackage.cqa.AnonymousClass2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqa$2 r0 = new cqa$2
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.a
            arpl r0 = defpackage.arpl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.aqil.P(r12)
            goto L43
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.aqil.P(r12)
            cpz r1 = r7.c()
            if (r1 == 0) goto L49
            r6.c = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.c(r2, r4, r6)
            if (r12 == r0) goto L48
        L43:
            drp r12 = (defpackage.drp) r12
            long r8 = r12.a
            goto L4b
        L48:
            return r0
        L49:
            r8 = 0
        L4b:
            drp r10 = new drp
            r10.<init>(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqa.d(long, long, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r5, defpackage.arpe r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cqa.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r7
            cqa$3 r0 = (defpackage.cqa.AnonymousClass3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqa$3 r0 = new cqa$3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r7)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.aqil.P(r7)
            cpz r7 = r4.c()
            if (r7 == 0) goto L46
            r0.c = r3
            java.lang.Object r7 = r7.d(r5, r0)
            if (r7 == r1) goto L45
        L40:
            drp r7 = (defpackage.drp) r7
            long r5 = r7.a
            goto L48
        L45:
            return r1
        L46:
            r5 = 0
        L48:
            drp r7 = new drp
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqa.e(long, arpe):java.lang.Object");
    }

    public final arwe f() {
        arwe arweVar = (arwe) this.b.a();
        if (arweVar != null) {
            return arweVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
