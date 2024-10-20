package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class avh implements ahl {
    public final avc a;
    private final ain b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: avh$1, reason: invalid class name */
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
            return avh.this.a(null, brg.a, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: avh$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<Float, arnb> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            float f;
            float floatValue = ((Number) obj).floatValue();
            if (avh.this.a.l() != 0) {
                f = floatValue / avh.this.a.l();
            } else {
                f = brg.a;
            }
            avh.this.a.A(arsk.g(f) + avh.this.a.j());
            return arnb.a;
        }
    }

    public avh(ain ainVar, avc avcVar) {
        this.b = ainVar;
        this.a = avcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ahl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ahv r6, float r7, defpackage.arpe r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.avh.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            avh$1 r0 = (defpackage.avh.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            avh$1 r0 = new avh$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.a
            defpackage.aqil.P(r8)
            goto L46
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.aqil.P(r8)
            ain r8 = r5.b
            avh$2 r2 = new avh$2
            r2.<init>()
            r0.a = r5
            r0.d = r3
            java.lang.Object r8 = r8.b(r6, r7, r2, r0)
            if (r8 == r1) goto L9e
            r6 = r5
        L46:
            java.lang.Number r8 = (java.lang.Number) r8
            float r7 = r8.floatValue()
            avh r6 = (defpackage.avh) r6
            avc r8 = r6.a
            float r8 = r8.c()
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L5a
            goto L93
        L5a:
            avc r8 = r6.a
            float r8 = r8.c()
            float r8 = java.lang.Math.abs(r8)
            double r1 = (double) r8
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto L93
            avc r6 = r6.a
            int r8 = r6.j()
            boolean r1 = r6.i()
            if (r1 == 0) goto L8e
            byn r1 = r6.l
            java.lang.Object r1 = r1.a()
            auv r1 = (defpackage.auv) r1
            arwe r1 = r1.t
            avd r2 = new avd
            r3 = 0
            r2.<init>(r6, r3)
            r4 = 3
            defpackage.arrn.J(r1, r3, r3, r2, r4)
        L8e:
            r1 = 0
            r6.v(r8, r0, r1)
            goto L98
        L93:
            avc r6 = r6.a
            r6.c()
        L98:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r7)
            return r6
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avh.a(ahv, float, arpe):java.lang.Object");
    }
}
