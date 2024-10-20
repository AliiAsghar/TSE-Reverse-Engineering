package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqx implements cuq {
    private boolean a;
    private arpe b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aqx$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        /* synthetic */ Object a;
        int c;
        arpk d;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return aqx.this.d(this);
        }
    }

    @Override // defpackage.cga
    public final /* synthetic */ cga a(cga cgaVar) {
        return cfz.a(this, cgaVar);
    }

    @Override // defpackage.cga
    public final /* synthetic */ Object b(Object obj, arqv arqvVar) {
        return cgb.a(this, obj, arqvVar);
    }

    @Override // defpackage.cga
    public final /* synthetic */ boolean c(arqr arqrVar) {
        return cgb.b(this, arqrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aqx.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            aqx$1 r0 = (defpackage.aqx.AnonymousClass1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aqx$1 r0 = new aqx$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            arpk r0 = r0.d
            defpackage.aqil.P(r5)
            goto L53
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.aqil.P(r5)
            boolean r5 = r4.a
            if (r5 != 0) goto L5c
            arpe r5 = r4.b
            r2 = r5
            arpk r2 = (defpackage.arpk) r2
            r0.d = r2
            r0.c = r3
            arpk r2 = new arpk
            arpe r0 = defpackage.arhi.i(r0)
            r2.<init>(r0)
            r4.b = r2
            java.lang.Object r0 = r2.a()
            if (r0 == r1) goto L5b
            r0 = r5
        L53:
            if (r0 == 0) goto L5c
            arnb r5 = defpackage.arnb.a
            r0.w(r5)
            goto L5c
        L5b:
            return r1
        L5c:
            arnb r5 = defpackage.arnb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqx.d(arpe):java.lang.Object");
    }

    @Override // defpackage.cuq
    public final void e() {
        if (!this.a) {
            this.a = true;
            arpe arpeVar = this.b;
            if (arpeVar != null) {
                arpeVar.w(arnb.a);
            }
            this.b = null;
        }
    }
}
