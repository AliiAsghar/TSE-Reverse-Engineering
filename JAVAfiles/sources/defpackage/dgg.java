package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgg {
    public final int a;
    public float b;
    private final arqv c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dgg$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        Object a;
        /* synthetic */ Object b;
        int d;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return dgg.this.b(brg.a, this);
        }
    }

    public dgg(int i, arqv arqvVar) {
        this.a = i;
        this.c = arqvVar;
    }

    public final int a(int i) {
        return arrn.u(i - arsk.g(this.b), 0, this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(float r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dgg.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            dgg$1 r0 = (defpackage.dgg.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dgg$1 r0 = new dgg$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.aqil.P(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.aqil.P(r6)
            arqv r6 = r4.c
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.a = r4
            r0.d = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            r5 = r4
        L47:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            dgg r5 = (defpackage.dgg) r5
            float r0 = r5.b
            float r0 = r0 + r6
            r5.b = r0
            arnb r5 = defpackage.arnb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgg.b(float, arpe):java.lang.Object");
    }

    public final Object c(float f, arpe arpeVar) {
        Object b = b(f - this.b, arpeVar);
        if (b == arpl.a) {
            return b;
        }
        return arnb.a;
    }
}
