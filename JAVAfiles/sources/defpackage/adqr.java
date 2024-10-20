package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqr implements adpg {
    final /* synthetic */ adqs a;
    private final long b;

    public adqr(adqs adqsVar, long j) {
        this.a = adqsVar;
        this.b = j;
    }

    private final void a() {
        this.a.g.a(this.b).ifPresent(new aavc(14));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[Catch: all -> 0x00b2, TryCatch #0 {, blocks: (B:6:0x000b, B:8:0x0015, B:9:0x0022, B:14:0x0025, B:16:0x003a, B:17:0x0041, B:19:0x0043, B:21:0x004b, B:24:0x0058, B:25:0x0068, B:27:0x007f, B:28:0x00a9, B:29:0x00a2), top: B:5:0x000b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2 A[Catch: all -> 0x00b2, TryCatch #0 {, blocks: (B:6:0x000b, B:8:0x0015, B:9:0x0022, B:14:0x0025, B:16:0x003a, B:17:0x0041, B:19:0x0043, B:21:0x004b, B:24:0x0058, B:25:0x0068, B:27:0x007f, B:28:0x00a9, B:29:0x00a2), top: B:5:0x000b, outer: #1 }] */
    @Override // defpackage.adpg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(defpackage.adpe r8, java.lang.String r9, byte[] r10) {
        /*
            r7 = this;
            r8 = 1
            r0 = 0
            adqs r1 = r7.a     // Catch: java.lang.Exception -> Lb5
            aduo r1 = r1.g     // Catch: java.lang.Exception -> Lb5
            long r2 = r7.b     // Catch: java.lang.Exception -> Lb5
            java.util.Map r4 = r1.b     // Catch: java.lang.Exception -> Lb5
            monitor-enter(r4)     // Catch: java.lang.Exception -> Lb5
            j$.util.Optional r5 = r1.a(r2)     // Catch: java.lang.Throwable -> Lb2
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto L25
            java.lang.String r9 = "Received NOTIFY for session ID %d, but cannot find group session data! Ignoring!"
            java.lang.Long r10 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Lb2
            r1[r0] = r10     // Catch: java.lang.Throwable -> Lb2
            defpackage.advr.q(r9, r1)     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb2
            goto Laa
        L25:
            java.lang.Object r2 = r5.get()     // Catch: java.lang.Throwable -> Lb2
            adum r2 = (defpackage.adum) r2     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = "Subscription notify for session: %s"
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Lb2
            r5[r0] = r2     // Catch: java.lang.Throwable -> Lb2
            defpackage.advr.c(r3, r5)     // Catch: java.lang.Throwable -> Lb2
            boolean r3 = defpackage.actx.j(r9, r10)     // Catch: java.lang.Throwable -> Lb2
            if (r3 != 0) goto L43
            java.lang.String r9 = "Invalid NOTIFY, ignoring!"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb2
            defpackage.advr.g(r9, r10)     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb2
            goto Laa
        L43:
            j$.util.Optional r3 = r2.b     // Catch: java.lang.Throwable -> Lb2
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lb2
            if (r3 != 0) goto L67
            j$.util.Optional r3 = r2.b     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> Lb2
            acop r3 = (defpackage.acop) r3     // Catch: java.lang.Throwable -> Lb2
            acpl r3 = r3.d     // Catch: java.lang.Throwable -> Lb2
            if (r3 != 0) goto L58
            goto L67
        L58:
            j$.util.Optional r3 = r2.b     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> Lb2
            acop r3 = (defpackage.acop) r3     // Catch: java.lang.Throwable -> Lb2
            acpl r3 = r3.d     // Catch: java.lang.Throwable -> Lb2
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Lb2
            goto L68
        L67:
            r3 = r0
        L68:
            j$.util.Optional r5 = r2.b     // Catch: java.lang.Throwable -> Lb2
            yjr r1 = r1.c     // Catch: java.lang.Throwable -> Lb2
            acop r9 = defpackage.actx.i(r5, r9, r10, r1)     // Catch: java.lang.Throwable -> Lb2
            r2.a(r9)     // Catch: java.lang.Throwable -> Lb2
            j$.util.Optional r9 = r2.b     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r9 = r9.get()     // Catch: java.lang.Throwable -> Lb2
            acop r9 = (defpackage.acop) r9     // Catch: java.lang.Throwable -> Lb2
            acpl r9 = r9.d     // Catch: java.lang.Throwable -> Lb2
            if (r9 == 0) goto La2
            java.lang.String r9 = "Before update, there are %d users in the conference. After update, there are %d users in conference"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lb2
            j$.util.Optional r1 = r2.b     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lb2
            acop r1 = (defpackage.acop) r1     // Catch: java.lang.Throwable -> Lb2
            acpl r1 = r1.d     // Catch: java.lang.Throwable -> Lb2
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lb2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lb2
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lb2
            r2[r0] = r10     // Catch: java.lang.Throwable -> Lb2
            r2[r8] = r1     // Catch: java.lang.Throwable -> Lb2
            defpackage.advr.o(r9, r2)     // Catch: java.lang.Throwable -> Lb2
            goto La9
        La2:
            java.lang.String r9 = "After update, there is no valid conference info"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb2
            defpackage.advr.g(r9, r10)     // Catch: java.lang.Throwable -> Lb2
        La9:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb2
        Laa:
            adqs r9 = r7.a     // Catch: java.lang.Exception -> Lb5
            aduo r9 = r9.g     // Catch: java.lang.Exception -> Lb5
            r9.d()     // Catch: java.lang.Exception -> Lb5
            return
        Lb2:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb2
            throw r9     // Catch: java.lang.Exception -> Lb5
        Lb5:
            r9 = move-exception
            java.lang.String r10 = r9.getMessage()
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r0] = r10
            java.lang.String r10 = "Error while processing incoming NOTIFY. Resubscribing to the conference: %s"
            defpackage.advr.i(r9, r10, r8)
            adqs r8 = r7.a
            long r9 = r7.b
            r8.p(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adqr.p(adpe, java.lang.String, byte[]):void");
    }

    @Override // defpackage.adpg
    public final void r(int i, String str) {
        advr.g("Subscription failed: %d - %s", Integer.valueOf(i), str);
        a();
    }

    @Override // defpackage.adpg
    public final void s(aduf adufVar) {
        advr.i(adufVar, "Subscription failed: %s", adufVar.getMessage());
        a();
    }

    @Override // defpackage.adpg
    public final void u() {
        advr.g("Subscription terminated!", new Object[0]);
        a();
    }

    @Override // defpackage.adpg
    public final void v(aduf adufVar) {
        advr.i(adufVar, "Subscription terminated: %s", adufVar.getMessage());
        a();
    }

    @Override // defpackage.adpg
    public final void t() {
    }
}
