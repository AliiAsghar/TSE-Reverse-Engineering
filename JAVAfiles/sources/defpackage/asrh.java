package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asrh implements asrq {
    private final asqw a;
    private final asqu b;
    private asrl c;
    private int d;
    private boolean e;
    private long f;

    public asrh(asqw asqwVar) {
        int i;
        this.a = asqwVar;
        asqu asquVar = ((asrk) asqwVar).b;
        this.b = asquVar;
        asrl asrlVar = asquVar.a;
        this.c = asrlVar;
        if (asrlVar != null) {
            i = asrlVar.b;
        } else {
            i = -1;
        }
        this.d = i;
    }

    @Override // defpackage.asrq
    public final asrs a() {
        return this.a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r8 == r9.b) goto L13;
     */
    @Override // defpackage.asrq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(defpackage.asqu r7, long r8) {
        /*
            r6 = this;
            boolean r8 = r6.e
            if (r8 != 0) goto L5c
            asrl r8 = r6.c
            if (r8 == 0) goto L20
            asqu r9 = r6.b
            asrl r9 = r9.a
            if (r8 != r9) goto L18
            int r8 = r6.d
            r9.getClass()
            int r9 = r9.b
            if (r8 != r9) goto L18
            goto L20
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            r7.<init>(r8)
            throw r7
        L20:
            asqw r8 = r6.a
            long r0 = r6.f
            r2 = 1
            long r0 = r0 + r2
            boolean r8 = r8.D(r0)
            if (r8 != 0) goto L30
            r7 = -1
            return r7
        L30:
            asrl r8 = r6.c
            if (r8 != 0) goto L40
            asqu r8 = r6.b
            asrl r8 = r8.a
            if (r8 == 0) goto L40
            r6.c = r8
            int r8 = r8.b
            r6.d = r8
        L40:
            asqu r8 = r6.b
            long r8 = r8.b
            long r0 = r6.f
            long r8 = r8 - r0
            asqu r0 = r6.b
            r1 = 8192(0x2000, double:4.0474E-320)
            long r8 = java.lang.Math.min(r1, r8)
            long r2 = r6.f
            r1 = r7
            r4 = r8
            r0.G(r1, r2, r4)
            long r0 = r6.f
            long r0 = r0 + r8
            r6.f = r0
            return r8
        L5c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asrh.b(asqu, long):long");
    }

    @Override // defpackage.asrq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }
}
