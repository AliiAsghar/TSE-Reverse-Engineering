package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhv {
    private final asgm b = new asgm();
    private final byn a = new byu(null, cav.a);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bhv$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        /* synthetic */ Object a;
        int c;
        bhv d;
        String e;
        bhn f;
        asgm g;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return bhv.this.b(null, null, this);
        }
    }

    private final void c(bhm bhmVar) {
        this.a.h(bhmVar);
    }

    public final bhm a() {
        return (bhm) this.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r9, defpackage.bhn r10, defpackage.arpe r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.bhv.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            bhv$1 r0 = (defpackage.bhv.AnonymousClass1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bhv$1 r0 = new bhv$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            asgm r9 = r0.g
            bhv r10 = r0.d
            defpackage.aqil.P(r11)     // Catch: java.lang.Throwable -> L2f
            goto L88
        L2f:
            r11 = move-exception
            goto L95
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            asgm r9 = r0.g
            bhn r10 = r0.f
            java.lang.String r2 = r0.e
            bhv r6 = r0.d
            defpackage.aqil.P(r11)
            r11 = r9
            r9 = r2
            r2 = r10
            r10 = r6
            goto L61
        L4a:
            defpackage.aqil.P(r11)
            asgm r11 = r8.b
            r0.d = r8
            r0.e = r9
            r0.f = r10
            r0.g = r11
            r0.c = r5
            java.lang.Object r2 = r11.b(r0)
            if (r2 == r1) goto L9d
            r2 = r10
            r10 = r8
        L61:
            r0.d = r10     // Catch: java.lang.Throwable -> L91
            r0.e = r9     // Catch: java.lang.Throwable -> L91
            r0.f = r2     // Catch: java.lang.Throwable -> L91
            r0.g = r11     // Catch: java.lang.Throwable -> L91
            r0.c = r4     // Catch: java.lang.Throwable -> L91
            arvp r4 = new arvp     // Catch: java.lang.Throwable -> L91
            arpe r0 = defpackage.arhi.i(r0)     // Catch: java.lang.Throwable -> L91
            r4.<init>(r0, r5)     // Catch: java.lang.Throwable -> L91
            r4.A()     // Catch: java.lang.Throwable -> L91
            bhv$a r0 = new bhv$a     // Catch: java.lang.Throwable -> L91
            r0.<init>(r9, r2, r4)     // Catch: java.lang.Throwable -> L91
            r10.c(r0)     // Catch: java.lang.Throwable -> L91
            java.lang.Object r9 = r4.l()     // Catch: java.lang.Throwable -> L91
            if (r9 == r1) goto L9d
            r7 = r11
            r11 = r9
            r9 = r7
        L88:
            r10.c(r3)     // Catch: java.lang.Throwable -> L8f
            r9.d()
            return r11
        L8f:
            r10 = move-exception
            goto L99
        L91:
            r9 = move-exception
            r7 = r11
            r11 = r9
            r9 = r7
        L95:
            r10.c(r3)     // Catch: java.lang.Throwable -> L8f
            throw r11     // Catch: java.lang.Throwable -> L8f
        L99:
            r9.d()
            throw r10
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhv.b(java.lang.String, bhn, arpe):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a implements bhm {
        private final String a;
        private final bhn b;
        private final arvo c;

        public a(String str, bhn bhnVar, arvo arvoVar) {
            this.a = str;
            this.b = bhnVar;
            this.c = arvoVar;
        }

        @Override // defpackage.bhm
        public final bhn a() {
            return this.b;
        }

        @Override // defpackage.bhm
        public final String b() {
            return this.a;
        }

        @Override // defpackage.bhm
        public final void c() {
            if (this.c.i()) {
                this.c.w(bhz.a);
            }
        }

        @Override // defpackage.bhm
        public final void d() {
        }
    }
}
