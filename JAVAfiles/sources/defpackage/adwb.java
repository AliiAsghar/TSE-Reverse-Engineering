package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwb implements aijy {
    private static final advp a = new advp("PAccesNetworkInfoMessageFilter");
    private final adey b;
    private final int c;

    public adwb(int i, adey adeyVar) {
        this.c = i;
        this.b = adeyVar;
    }

    private static final void b(aiom aiomVar, String str) {
        try {
            aiomVar.q(ahmc.X("P-Access-Network-Info", str));
        } catch (Exception e) {
            advr.j(e, a, "Exception while adding Access Info Header", new Object[0]);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r2.equals("INVITE") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cf, code lost:
    
        if (r2.equals("BYE") != false) goto L82;
     */
    @Override // defpackage.aijy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.aiom r10) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adwb.a(aiom):void");
    }
}
