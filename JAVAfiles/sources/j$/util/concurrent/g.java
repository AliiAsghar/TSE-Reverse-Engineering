package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class g extends l {
    final l[] e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(l[] lVarArr) {
        super(-1, null, null);
        this.e = lVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        return null;
     */
    @Override // j$.util.concurrent.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.util.concurrent.l a(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            j$.util.concurrent.l[] r0 = r4.e
        L2:
            int r1 = r0.length
            r2 = 0
            if (r1 == 0) goto L35
            int r1 = r1 + (-1)
            r1 = r1 & r5
            j$.util.concurrent.l r0 = j$.util.concurrent.ConcurrentHashMap.k(r0, r1)
            if (r0 != 0) goto L10
            goto L35
        L10:
            int r1 = r0.a
            if (r1 != r5) goto L21
            java.lang.Object r3 = r0.b
            if (r3 == r6) goto L20
            if (r3 == 0) goto L21
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L21
        L20:
            return r0
        L21:
            if (r1 >= 0) goto L31
            boolean r1 = r0 instanceof j$.util.concurrent.g
            if (r1 == 0) goto L2c
            j$.util.concurrent.g r0 = (j$.util.concurrent.g) r0
            j$.util.concurrent.l[] r0 = r0.e
            goto L2
        L2c:
            j$.util.concurrent.l r5 = r0.a(r5, r6)
            return r5
        L31:
            j$.util.concurrent.l r0 = r0.d
            if (r0 != 0) goto L10
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.g.a(int, java.lang.Object):j$.util.concurrent.l");
    }
}
