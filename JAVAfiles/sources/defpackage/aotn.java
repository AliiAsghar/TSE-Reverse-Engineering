package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aotn extends arkz {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aotn(aqrs aqrsVar, aqrr aqrrVar) {
        super(aqrsVar, aqrrVar, null);
        aqrrVar.getClass();
    }

    @Override // defpackage.arlb
    public final /* bridge */ /* synthetic */ arlb a(aqrs aqrsVar, aqrr aqrrVar) {
        return new aotn(aqrsVar, aqrrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.aotd r8, defpackage.aqut r9, defpackage.arpe r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.aotm
            if (r0 == 0) goto L13
            r0 = r10
            aotm r0 = (defpackage.aotm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aotm r0 = new aotm
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            arpl r0 = defpackage.arpl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.aqil.P(r10)
            goto L82
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.aqil.P(r10)
            aqrs r1 = r7.a
            aqux r10 = defpackage.aotl.a
            if (r10 != 0) goto L74
            java.lang.Class<aotl> r3 = defpackage.aotl.class
            monitor-enter(r3)
            aqux r10 = defpackage.aotl.a     // Catch: java.lang.Throwable -> L71
            if (r10 != 0) goto L6f
            aquu r10 = defpackage.aqux.a()     // Catch: java.lang.Throwable -> L71
            aquw r4 = defpackage.aquw.UNARY     // Catch: java.lang.Throwable -> L71
            r10.e = r4     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = "google.internal.abuse.ondevicesafety.v1alpha.ProgramBlobService"
            java.lang.String r5 = "DownloadBlob"
            java.lang.String r4 = defpackage.aqux.c(r4, r5)     // Catch: java.lang.Throwable -> L71
            r10.a = r4     // Catch: java.lang.Throwable -> L71
            r10.b()     // Catch: java.lang.Throwable -> L71
            aotd r4 = defpackage.aotd.a     // Catch: java.lang.Throwable -> L71
            aozs r5 = defpackage.arkx.a     // Catch: java.lang.Throwable -> L71
            arkw r5 = new arkw     // Catch: java.lang.Throwable -> L71
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L71
            r10.c = r5     // Catch: java.lang.Throwable -> L71
            aote r4 = defpackage.aote.a     // Catch: java.lang.Throwable -> L71
            arkw r5 = new arkw     // Catch: java.lang.Throwable -> L71
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L71
            r10.d = r5     // Catch: java.lang.Throwable -> L71
            aqux r10 = r10.a()     // Catch: java.lang.Throwable -> L71
            defpackage.aotl.a = r10     // Catch: java.lang.Throwable -> L71
        L6f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            goto L74
        L71:
            r8 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            throw r8
        L74:
            aqrr r4 = r7.b
            r6.c = r2
            r2 = r10
            r3 = r8
            r5 = r9
            java.lang.Object r10 = defpackage.arhi.d(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L82
            return r0
        L82:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aotn.b(aotd, aqut, arpe):java.lang.Object");
    }
}
