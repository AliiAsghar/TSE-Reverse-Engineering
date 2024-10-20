package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class baa {
    public final diy a;
    public cti b = null;
    public cti c;

    public baa(diy diyVar, cti ctiVar) {
        this.a = diyVar;
        this.c = ctiVar;
    }

    public static /* synthetic */ int e(baa baaVar, long j) {
        return baaVar.a(j, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r0 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long f(long r3) {
        /*
            r2 = this;
            cti r0 = r2.b
            if (r0 == 0) goto L19
            boolean r1 = r0.r()
            if (r1 == 0) goto L15
            cti r1 = r2.c
            if (r1 == 0) goto L13
            cjp r0 = defpackage.cth.a(r1, r0)
            goto L17
        L13:
            r0 = 0
            goto L17
        L15:
            cjp r0 = defpackage.cjp.a
        L17:
            if (r0 != 0) goto L1b
        L19:
            cjp r0 = defpackage.cjp.a
        L1b:
            long r3 = defpackage.a.bv(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baa.f(long):long");
    }

    public final int a(long j, boolean z) {
        if (z) {
            j = f(j);
        }
        return this.a.j(b(j));
    }

    public final long b(long j) {
        cti ctiVar;
        cti ctiVar2 = this.b;
        if (ctiVar2 != null) {
            cti ctiVar3 = null;
            if (true != ctiVar2.r()) {
                ctiVar2 = null;
            }
            if (ctiVar2 != null && (ctiVar = this.c) != null) {
                if (true == ctiVar.r()) {
                    ctiVar3 = ctiVar;
                }
                if (ctiVar3 != null) {
                    return ctiVar2.h(ctiVar3, j);
                }
                return j;
            }
            return j;
        }
        return j;
    }

    public final long c(long j) {
        cti ctiVar;
        cti ctiVar2 = this.b;
        if (ctiVar2 != null) {
            cti ctiVar3 = null;
            if (true != ctiVar2.r()) {
                ctiVar2 = null;
            }
            if (ctiVar2 != null && (ctiVar = this.c) != null) {
                if (true == ctiVar.r()) {
                    ctiVar3 = ctiVar;
                }
                if (ctiVar3 != null) {
                    return ctiVar3.h(ctiVar2, j);
                }
                return j;
            }
            return j;
        }
        return j;
    }

    public final boolean d(long j) {
        long b = b(f(j));
        int h = this.a.h(Float.intBitsToFloat((int) (4294967295L & b)));
        int i = (int) (b >> 32);
        if (Float.intBitsToFloat(i) >= this.a.b(h)) {
            if (Float.intBitsToFloat(i) <= this.a.c(h)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
