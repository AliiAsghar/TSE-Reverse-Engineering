package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dle {
    private final Object d = null;
    public final vj a = new vj();
    public final ve c = new ve((byte[]) null);
    public final dpr b = new dpr();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dle$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        /* synthetic */ Object a;
        int c;
        dle d;
        b e;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return dle.this.b(null, null, this);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final Object a;

        public /* synthetic */ a(Object obj) {
            this.a = obj;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof a) && d.F(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return "AsyncTypefaceResult(result=" + this.a + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b {
        private final dlh a;
        private final Object b = null;

        public b(dlh dlhVar) {
            this.a = dlhVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!d.F(this.a, bVar.a)) {
                return false;
            }
            Object obj2 = bVar.b;
            if (d.F(null, null)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode() * 31;
        }

        public final String toString() {
            return "Key(font=" + this.a + ", loaderKey=null)";
        }
    }

    public static /* synthetic */ void a(dle dleVar, dlh dlhVar, Object obj) {
        b bVar = new b(dlhVar);
        synchronized (dleVar.b) {
            if (obj == null) {
                ve veVar = dleVar.c;
                Object obj2 = dleVar.d;
                veVar.j(bVar, new a(null));
            } else {
                dleVar.a.c(bVar, new a(obj));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.dlh r6, defpackage.arqr r7, defpackage.arpe r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dle.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            dle$1 r0 = (defpackage.dle.AnonymousClass1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dle$1 r0 = new dle$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            dle$b r6 = r0.e
            dle r7 = r0.d
            defpackage.aqil.P(r8)
            goto L67
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.aqil.P(r8)
            dle$b r8 = new dle$b
            r8.<init>(r6)
            dpr r6 = r5.b
            monitor-enter(r6)
            vj r2 = r5.a     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r2 = r2.a(r8)     // Catch: java.lang.Throwable -> L8a
            dle$a r2 = (dle.a) r2     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto L50
            ve r2 = r5.c     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r2 = r2.a(r8)     // Catch: java.lang.Throwable -> L8a
            dle$a r2 = (dle.a) r2     // Catch: java.lang.Throwable -> L8a
        L50:
            if (r2 == 0) goto L56
            java.lang.Object r7 = r2.a     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r6)
            return r7
        L56:
            monitor-exit(r6)
            r0.d = r5
            r0.e = r8
            r0.c = r3
            java.lang.Object r6 = r7.a(r0)
            if (r6 == r1) goto L89
            r7 = r5
            r4 = r8
            r8 = r6
            r6 = r4
        L67:
            dpr r0 = r7.b
            monitor-enter(r0)
            if (r8 != 0) goto L7a
            ve r1 = r7.c     // Catch: java.lang.Throwable -> L86
            java.lang.Object r7 = r7.d     // Catch: java.lang.Throwable -> L86
            dle$a r7 = new dle$a     // Catch: java.lang.Throwable -> L86
            r2 = 0
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L86
            r1.j(r6, r7)     // Catch: java.lang.Throwable -> L86
            goto L84
        L7a:
            vj r7 = r7.a     // Catch: java.lang.Throwable -> L86
            dle$a r1 = new dle$a     // Catch: java.lang.Throwable -> L86
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L86
            r7.c(r6, r1)     // Catch: java.lang.Throwable -> L86
        L84:
            monitor-exit(r0)
            return r8
        L86:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L89:
            return r1
        L8a:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dle.b(dlh, arqr, arpe):java.lang.Object");
    }
}
