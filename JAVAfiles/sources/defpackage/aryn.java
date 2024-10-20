package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aryn extends asfk implements Runnable {
    public final long b;

    public aryn(long j, arpe arpeVar) {
        super(arpeVar.u(), arpeVar);
        this.b = j;
    }

    @Override // defpackage.arvg, defpackage.arxw
    public final String h() {
        return super.h() + "(timeMillis=" + this.b + ")";
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r0 == null) goto L10;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r5 = this;
            arpi r0 = r5.a
            arwm r0 = defpackage.arwi.o(r0)
            boolean r1 = r0 instanceof defpackage.arwo
            if (r1 == 0) goto Ld
            arwo r0 = (defpackage.arwo) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            long r1 = r5.b
            if (r0 == 0) goto L1f
            long r3 = defpackage.arut.a
            aruv r3 = defpackage.aruv.c
            defpackage.arsd.p(r1, r3)
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L27
        L1f:
            java.lang.String r0 = "Timed out waiting for "
            java.lang.String r3 = " ms"
            java.lang.String r0 = defpackage.a.cn(r1, r0, r3)
        L27:
            arym r1 = new arym
            r1.<init>(r0, r5)
            r5.Q(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aryn.run():void");
    }
}
