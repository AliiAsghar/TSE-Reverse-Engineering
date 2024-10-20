package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aht {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aht$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        /* synthetic */ Object a;
        int b;
        arry c;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return aht.a(null, brg.a, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aht$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arpw implements arqv<ahv, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ float b;
        final /* synthetic */ zr c;
        final /* synthetic */ arry d;
        private /* synthetic */ Object e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: aht$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arrp implements arqv<Float, Float, arnb> {
            final /* synthetic */ arry a;
            final /* synthetic */ ahv b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(arry arryVar, ahv ahvVar) {
                super(2);
                this.a = arryVar;
                this.b = ahvVar;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                float f = this.a.a;
                this.a.a = f + this.b.a(floatValue - f);
                return arnb.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f, zr zrVar, arry arryVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = f;
            this.c = zrVar;
            this.d = arryVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((ahv) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                ahv ahvVar = (ahv) this.e;
                float f = this.b;
                zr zrVar = this.c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, ahvVar);
                this.a = 1;
                if (abq.h(brg.a, f, zrVar, anonymousClass1, this, 4) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, this.c, this.d, arpeVar);
            anonymousClass2.e = obj;
            return anonymousClass2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.aig r5, float r6, defpackage.zr r7, defpackage.arpe r8) {
        /*
            boolean r0 = r8 instanceof defpackage.aht.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            aht$1 r0 = (defpackage.aht.AnonymousClass1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aht$1 r0 = new aht$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            arry r5 = r0.c
            defpackage.aqil.P(r8)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.aqil.P(r8)
            arry r8 = new arry
            r8.<init>()
            aht$2 r2 = new aht$2
            r4 = 0
            r2.<init>(r6, r7, r8, r4)
            r0.c = r8
            r0.b = r3
            java.lang.Object r5 = defpackage.aif.a(r5, r2, r0)
            if (r5 == r1) goto L52
            r5 = r8
        L4a:
            float r5 = r5.a
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aht.a(aig, float, zr, arpe):java.lang.Object");
    }
}
