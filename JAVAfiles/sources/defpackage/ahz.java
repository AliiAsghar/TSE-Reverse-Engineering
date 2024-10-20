package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahz implements cpz {
    public boolean a;
    private final aii b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ahz$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        long a;
        /* synthetic */ Object b;
        int d;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ahz.this.c(0L, 0L, this);
        }
    }

    public ahz(aii aiiVar, boolean z) {
        this.b = aiiVar;
        this.a = z;
    }

    @Override // defpackage.cpz
    public final long a(long j, long j2, int i) {
        if (!this.a) {
            return 0L;
        }
        aii aiiVar = this.b;
        if (aiiVar.a.i()) {
            return 0L;
        }
        return aiiVar.f(aiiVar.a(aiiVar.a.a(aiiVar.a(aiiVar.b(j2)))));
    }

    @Override // defpackage.cpz
    public final /* synthetic */ long b(long j, int i) {
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cpz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r3, long r5, defpackage.arpe r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof defpackage.ahz.AnonymousClass1
            if (r3 == 0) goto L13
            r3 = r7
            ahz$1 r3 = (defpackage.ahz.AnonymousClass1) r3
            int r4 = r3.d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.d = r4
            goto L18
        L13:
            ahz$1 r3 = new ahz$1
            r3.<init>(r7)
        L18:
            java.lang.Object r4 = r3.b
            arpl r7 = defpackage.arpl.a
            int r0 = r3.d
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            long r5 = r3.a
            defpackage.aqil.P(r4)
            goto L44
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L31:
            defpackage.aqil.P(r4)
            boolean r4 = r2.a
            if (r4 == 0) goto L4e
            aii r4 = r2.b
            r3.a = r5
            r3.d = r1
            java.lang.Object r4 = r4.g(r5, r3)
            if (r4 == r7) goto L4d
        L44:
            drp r4 = (defpackage.drp) r4
            long r3 = r4.a
            long r3 = defpackage.a.Q(r5, r3)
            goto L50
        L4d:
            return r7
        L4e:
            r3 = 0
        L50:
            drp r5 = new drp
            r5.<init>(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahz.c(long, long, arpe):java.lang.Object");
    }

    @Override // defpackage.cpz
    public final /* synthetic */ Object d(long j, arpe arpeVar) {
        return new drp(0L);
    }
}
