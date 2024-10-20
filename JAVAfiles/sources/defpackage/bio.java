package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bio {
    public cjn a;
    public final float b;
    public final boolean c;
    public Float d;
    public cjn e;
    public final zj f = zk.a(brg.a);
    public final zj g = zk.a(brg.a);
    public final zj h = zk.a(brg.a);
    private final arvv k = new arvv();
    public final byn i = new byu(false, cav.a);
    public final byn j = new byu(false, cav.a);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bio$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        /* synthetic */ Object a;
        int c;
        bio d;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return bio.this.a(this);
        }
    }

    public bio(cjn cjnVar, float f, boolean z) {
        this.a = cjnVar;
        this.b = f;
        this.c = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r8.hk(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arpe r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.bio.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            bio$1 r0 = (defpackage.bio.AnonymousClass1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bio$1 r0 = new bio$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.aqil.P(r8)
            goto L86
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            bio r2 = r0.d
            defpackage.aqil.P(r8)
            goto L70
        L3c:
            bio r2 = r0.d
            defpackage.aqil.P(r8)
            goto L5b
        L42:
            defpackage.aqil.P(r8)
            r0.d = r7
            r0.c = r6
            bip r8 = new bip
            r8.<init>(r7, r5)
            java.lang.Object r8 = defpackage.arwi.d(r8, r0)
            arpl r2 = defpackage.arpl.a
            if (r8 == r2) goto L58
            arnb r8 = defpackage.arnb.a
        L58:
            if (r8 == r1) goto L89
            r2 = r7
        L5b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            byn r6 = r2.i
            r6.h(r8)
            arvv r8 = r2.k
            r0.d = r2
            r0.c = r4
            java.lang.Object r8 = r8.hk(r0)
            if (r8 == r1) goto L89
        L70:
            r0.d = r5
            r0.c = r3
            biq r8 = new biq
            r8.<init>(r2, r5)
            java.lang.Object r8 = defpackage.arwi.d(r8, r0)
            arpl r0 = defpackage.arpl.a
            if (r8 == r0) goto L83
            arnb r8 = defpackage.arnb.a
        L83:
            if (r8 != r1) goto L86
            goto L89
        L86:
            arnb r8 = defpackage.arnb.a
            return r8
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bio.a(arpe):java.lang.Object");
    }

    public final void b() {
        this.j.h(true);
        this.k.T(arnb.a);
    }
}
