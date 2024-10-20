package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avk implements avj {
    public final cbh a = new cbh(new avm[16]);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: avk$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        int a;
        int b;
        /* synthetic */ Object c;
        int e;
        cjp f;
        Object[] g;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return avk.this.a(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
    
        if (r9 >= r2) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0076 -> B:10:0x0079). Please report as a decompilation issue!!! */
    @Override // defpackage.avj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.cjp r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.avk.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            avk$1 r0 = (defpackage.avk.AnonymousClass1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            avk$1 r0 = new avk$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r9 = r0.b
            int r2 = r0.a
            java.lang.Object[] r4 = r0.g
            cjp r5 = r0.f
            defpackage.aqil.P(r10)
            r10 = r5
            goto L79
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            defpackage.aqil.P(r10)
            cbh r10 = r8.a
            int r2 = r10.b
            if (r2 <= 0) goto L7d
            java.lang.Object[] r10 = r10.a
            r4 = 0
            r7 = r10
            r10 = r9
            r9 = r4
            r4 = r7
        L48:
            r5 = r4[r9]
            avm r5 = (defpackage.avm) r5
            r0.f = r10
            r0.g = r4
            r0.a = r2
            r0.b = r9
            r0.e = r3
            cga$c r6 = r5.p
            boolean r6 = r6.z
            if (r6 != 0) goto L5f
            arnb r5 = defpackage.arnb.a
            goto L76
        L5f:
            cti r6 = defpackage.cwp.c(r5)
            avi r5 = defpackage.avl.a(r5)
            if (r5 != 0) goto L6c
            arnb r5 = defpackage.arnb.a
            goto L76
        L6c:
            java.lang.Object r5 = defpackage.avq.a(r5, r6, r10, r0)
            arpl r6 = defpackage.arpl.a
            if (r5 == r6) goto L76
            arnb r5 = defpackage.arnb.a
        L76:
            if (r5 != r1) goto L79
            return r1
        L79:
            int r9 = r9 + r3
            if (r9 >= r2) goto L7d
            goto L48
        L7d:
            arnb r9 = defpackage.arnb.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avk.a(cjp, arpe):java.lang.Object");
    }
}
