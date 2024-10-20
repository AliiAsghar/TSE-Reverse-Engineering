package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hmm implements hxb {
    private final dtq a;

    public hmm(dtq dtqVar) {
        this.a = dtqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r1 = r1;
     */
    @Override // defpackage.hxb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean eV(defpackage.hpp r1, java.lang.Object r2) {
        /*
            r0 = this;
            if (r1 != 0) goto L9
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unknown error"
            r1.<init>(r2)
        L9:
            dtq r2 = r0.a
            r2.d(r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmm.eV(hpp, java.lang.Object):boolean");
    }

    @Override // defpackage.hxb
    public final boolean eW(Object obj, Object obj2) {
        try {
            this.a.b(new hmk(obj));
            return true;
        } catch (Throwable th) {
            this.a.d(th);
            return true;
        }
    }
}
