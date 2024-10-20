package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahd extends arpv implements arqv<cqg, arpe<? super arnb>, Object> {
    Object a;
    int b;
    final /* synthetic */ arqr c;
    final /* synthetic */ arqv d;
    final /* synthetic */ arqg e;
    final /* synthetic */ arqg f;
    private /* synthetic */ Object g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ahd$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<crc, arnb> {
        final /* synthetic */ arqv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqv arqvVar) {
            super(1);
            this.a = arqvVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            crc crcVar = (crc) obj;
            this.a.a(crcVar, Float.valueOf(Float.intBitsToFloat((int) (cqr.a(crcVar) & 4294967295L))));
            crcVar.b();
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ahd$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<crc, Float, arnb> {
        final /* synthetic */ arry a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arry arryVar) {
            super(2);
            this.a = arryVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            float floatValue = ((Number) obj2).floatValue();
            ((crc) obj).b();
            this.a.a = floatValue;
            return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahd(arqr arqrVar, arqv arqvVar, arqg arqgVar, arqg arqgVar2, arpe arpeVar) {
        super(arpeVar);
        this.c = arqrVar;
        this.d = arqvVar;
        this.e = arqgVar;
        this.f = arqgVar2;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahd) c((cqg) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        if (r11 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r11 != r0) goto L14;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r10.b
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L24
            if (r1 == r2) goto L1b
            if (r1 == r3) goto L11
            defpackage.aqil.P(r11)
            goto L8b
        L11:
            java.lang.Object r1 = r10.a
            java.lang.Object r2 = r10.g
            cqg r2 = (defpackage.cqg) r2
            defpackage.aqil.P(r11)
            goto L55
        L1b:
            java.lang.Object r1 = r10.g
            cqg r1 = (defpackage.cqg) r1
            defpackage.aqil.P(r11)
            r2 = r1
            goto L37
        L24:
            defpackage.aqil.P(r11)
            java.lang.Object r11 = r10.g
            cqg r11 = (defpackage.cqg) r11
            r10.g = r11
            r10.b = r2
            java.lang.Object r1 = defpackage.aik.j(r11, r10, r3)
            if (r1 == r0) goto L9b
            r2 = r11
            r11 = r1
        L37:
            crc r11 = (defpackage.crc) r11
            arry r1 = new arry
            r1.<init>()
            long r5 = r11.a
            int r7 = r11.i
            ahd$2 r8 = new ahd$2
            r8.<init>(r1)
            r10.g = r2
            r10.a = r1
            r10.b = r3
            r4 = r2
            r9 = r10
            java.lang.Object r11 = defpackage.agy.d(r4, r5, r7, r8, r9)
            if (r11 == r0) goto L9b
        L55:
            crc r11 = (defpackage.crc) r11
            if (r11 == 0) goto L98
            arqr r3 = r10.c
            long r4 = r11.c
            cjn r6 = new cjn
            r6.<init>(r4)
            r3.a(r6)
            arqv r3 = r10.d
            arry r1 = (defpackage.arry) r1
            float r1 = r1.a
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r1)
            r3.a(r11, r4)
            arqv r1 = r10.d
            ahd$1 r3 = new ahd$1
            r3.<init>(r1)
            r1 = 0
            r10.g = r1
            r10.a = r1
            r1 = 3
            r10.b = r1
            long r4 = r11.a
            java.lang.Object r11 = defpackage.agy.g(r2, r4, r3, r10)
            if (r11 != r0) goto L8b
            goto L9b
        L8b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L98
            arqg r11 = r10.f
            r11.a()
        L98:
            arnb r11 = defpackage.arnb.a
            return r11
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        ahd ahdVar = new ahd(this.c, this.d, this.e, this.f, arpeVar);
        ahdVar.g = obj;
        return ahdVar;
    }
}
