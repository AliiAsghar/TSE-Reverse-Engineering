package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrw implements adpg {
    final /* synthetic */ adrx a;
    private int b = 1;

    public adrw(adrx adrxVar) {
        this.a = adrxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        r9 = ((defpackage.adzc) r9).b;
        r10 = r17.a.g.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        if (r10.hasNext() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        r0 = (defpackage.ahjj) r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        defpackage.advr.c("Presence subscription state has changed to %s", r9.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        defpackage.advr.i(r0, "Error while invoking listener: %s", r0.getMessage());
     */
    @Override // defpackage.adpg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(defpackage.adpe r18, java.lang.String r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adrw.p(adpe, java.lang.String, byte[]):void");
    }

    @Override // defpackage.adpg
    public final void r(int i, String str) {
        this.a.i = null;
    }

    @Override // defpackage.adpg
    public final void s(aduf adufVar) {
        this.a.i = null;
    }

    @Override // defpackage.adpg
    public final void u() {
        this.a.i = null;
    }

    @Override // defpackage.adpg
    public final void v(aduf adufVar) {
        advr.g("Subscription terminated because of exception: %s", adufVar.getMessage());
        this.a.i = null;
    }

    @Override // defpackage.adpg
    public final void t() {
    }
}
