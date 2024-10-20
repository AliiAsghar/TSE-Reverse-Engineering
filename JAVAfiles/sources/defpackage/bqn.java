package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqn {
    private final asgm b = new asgm();
    private final byn a = new byu(null, cav.a);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bqn$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;
        bqn f;
        asgm g;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return bqn.this.b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a implements bqe {
        private final bqu a;
        private final arvo b;

        public a(bqu bquVar, arvo arvoVar) {
            this.a = bquVar;
            this.b = arvoVar;
        }

        @Override // defpackage.bqe
        public final bqu a() {
            return this.a;
        }

        @Override // defpackage.bqe
        public final void b() {
            if (this.b.i()) {
                this.b.w(bqt.a);
            }
        }

        @Override // defpackage.bqe
        public final void c() {
            if (this.b.i()) {
                this.b.w(bqt.b);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (d.F(this.a, aVar.a) && d.F(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class b implements bqu {
        public final String a;
        public final String b;
        public final boolean c;
        public final bqf d;

        public b(String str, String str2, boolean z, bqf bqfVar) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = bqfVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                b bVar = (b) obj;
                if (d.F(this.a, bVar.a) && d.F(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            return ((((hashCode + i) * 31) + defpackage.a.v(this.c)) * 31) + this.d.hashCode();
        }
    }

    private final void d(bqe bqeVar) {
        this.a.h(bqeVar);
    }

    public final bqe a() {
        return (bqe) this.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #2 {all -> 0x0096, blocks: (B:26:0x005e, B:28:0x0084), top: B:25:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.bqu r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.bqn.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            bqn$1 r0 = (defpackage.bqn.AnonymousClass1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            bqn$1 r0 = new bqn$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r9 = r0.b
            asgm r9 = r0.g
            java.lang.Object r1 = r0.a
            bqn r0 = r0.f
            defpackage.aqil.P(r10)     // Catch: java.lang.Throwable -> L33
            goto L8d
        L33:
            r10 = move-exception
            goto L9b
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            asgm r9 = r0.g
            java.lang.Object r2 = r0.a
            bqn r6 = r0.f
            defpackage.aqil.P(r10)
            r10 = r9
            r9 = r2
            goto L5e
        L4a:
            defpackage.aqil.P(r10)
            asgm r10 = r8.b
            r0.f = r8
            r0.a = r9
            r0.g = r10
            r0.e = r5
            java.lang.Object r2 = r10.b(r0)
            if (r2 == r1) goto La3
            r6 = r8
        L5e:
            r0.f = r6     // Catch: java.lang.Throwable -> L96
            r0.a = r9     // Catch: java.lang.Throwable -> L96
            r0.g = r10     // Catch: java.lang.Throwable -> L96
            r0.b = r0     // Catch: java.lang.Throwable -> L96
            r0.e = r4     // Catch: java.lang.Throwable -> L96
            arvp r2 = new arvp     // Catch: java.lang.Throwable -> L96
            arpe r4 = defpackage.arhi.i(r0)     // Catch: java.lang.Throwable -> L96
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L96
            r2.A()     // Catch: java.lang.Throwable -> L96
            bqn$a r4 = new bqn$a     // Catch: java.lang.Throwable -> L96
            r4.<init>(r9, r2)     // Catch: java.lang.Throwable -> L96
            r6.d(r4)     // Catch: java.lang.Throwable -> L96
            java.lang.Object r9 = r2.l()     // Catch: java.lang.Throwable -> L96
            arpl r2 = defpackage.arpl.a     // Catch: java.lang.Throwable -> L96
            if (r9 != r2) goto L87
            r0.getClass()     // Catch: java.lang.Throwable -> L96
        L87:
            if (r9 == r1) goto La3
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        L8d:
            r0.d(r3)     // Catch: java.lang.Throwable -> L94
            r9.d()
            return r10
        L94:
            r10 = move-exception
            goto L9f
        L96:
            r9 = move-exception
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        L9b:
            r0.d(r3)     // Catch: java.lang.Throwable -> L94
            throw r10     // Catch: java.lang.Throwable -> L94
        L9f:
            r9.d()
            throw r10
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqn.b(bqu, arpe):java.lang.Object");
    }

    public final Object c(String str, String str2, boolean z, bqf bqfVar, arpe arpeVar) {
        return b(new b(str, str2, z, bqfVar), arpeVar);
    }
}
