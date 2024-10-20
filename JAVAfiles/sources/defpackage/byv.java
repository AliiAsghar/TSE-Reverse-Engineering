package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byv implements byd {
    public final bxy a = new bxy();
    private final byd b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: byv$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1<R> extends arps {
        Object a;
        /* synthetic */ Object b;
        int d;
        byv e;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return byv.this.a(null, this);
        }
    }

    public byv(byd bydVar) {
        this.b = bydVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0088 A[PHI: r8
  0x0088: PHI (r8v9 java.lang.Object) = (r8v8 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x0085, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.byd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arqr r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.byv.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            byv$1 r0 = (defpackage.byv.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            byv$1 r0 = new byv$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r8)
            goto L88
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.a
            byv r2 = r0.e
            defpackage.aqil.P(r8)
            goto L78
        L3a:
            defpackage.aqil.P(r8)
            bxy r8 = r6.a
            r0.e = r6
            r0.a = r7
            r0.d = r4
            boolean r2 = r8.a()
            if (r2 == 0) goto L4e
            arnb r8 = defpackage.arnb.a
            goto L75
        L4e:
            arvp r2 = new arvp
            arpe r5 = defpackage.arhi.i(r0)
            r2.<init>(r5, r4)
            r2.A()
            java.lang.Object r4 = r8.a
            monitor-enter(r4)
            java.util.List r5 = r8.b     // Catch: java.lang.Throwable -> L8a
            r5.add(r2)     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r4)
            bxx r4 = new bxx
            r4.<init>(r8, r2)
            r2.d(r4)
            java.lang.Object r8 = r2.l()
            arpl r2 = defpackage.arpl.a
            if (r8 == r2) goto L75
            arnb r8 = defpackage.arnb.a
        L75:
            if (r8 == r1) goto L89
            r2 = r6
        L78:
            byd r8 = r2.b
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L88
            return r1
        L88:
            return r8
        L89:
            return r1
        L8a:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byv.a(arqr, arpe):java.lang.Object");
    }

    @Override // defpackage.arpi
    public final <R> R fold(R r, arqv<? super R, ? super arpg, ? extends R> arqvVar) {
        return (R) arhi.k(this, r, arqvVar);
    }

    @Override // defpackage.arpg, defpackage.arpi
    public final <E extends arpg> E get(arph<E> arphVar) {
        return (E) arhi.l(this, arphVar);
    }

    @Override // defpackage.arpg
    public final /* synthetic */ arph getKey() {
        return byd.e;
    }

    @Override // defpackage.arpi
    public final arpi minusKey(arph<?> arphVar) {
        return arhi.m(this, arphVar);
    }

    @Override // defpackage.arpi
    public final arpi plus(arpi arpiVar) {
        return arhi.n(this, arpiVar);
    }
}
