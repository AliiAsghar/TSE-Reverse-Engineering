package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wqg extends abhh {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/satelliteapi/incoming/satellitesessionstatenotificationservice/SatelliteSessionStateNotificationServiceImpl");
    private final wpu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqg(arpi arpiVar, wpu wpuVar) {
        super(arpiVar);
        arpiVar.getClass();
        this.b = wpuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.wrp r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.wqe
            if (r0 == 0) goto L13
            r0 = r6
            wqe r0 = (defpackage.wqe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wqe r0 = new wqe
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r6)
            goto L78
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.aqil.P(r6)
            wrw r6 = r5.c
            if (r6 != 0) goto L38
            wrw r6 = defpackage.wrw.a
        L38:
            int r6 = r6.c
            int r6 = defpackage.a.aU(r6)
            if (r6 != 0) goto L41
            goto L6d
        L41:
            r2 = 2
            if (r6 != r2) goto L6d
            io.grpc.Status r6 = io.grpc.Status.e
            wrw r5 = r5.c
            if (r5 != 0) goto L4c
            wrw r5 = defpackage.wrw.a
        L4c:
            int r5 = r5.c
            int r5 = defpackage.a.aU(r5)
            if (r5 != 0) goto L55
            goto L56
        L55:
            r3 = r5
        L56:
            java.lang.String r5 = "Failed to process OnReceiveSessionStatusUpdateRequest, invalid session status: "
            java.lang.String r0 = defpackage.wch.w(r3)
            java.lang.String r5 = r5.concat(r0)
            io.grpc.Status r5 = r6.withDescription(r5)
            io.grpc.StatusException r5 = r5.asException()
            java.lang.Object r6 = defpackage.aqil.O(r5)
            goto L78
        L6d:
            wpu r6 = r4.b
            r0.c = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L78
            return r1
        L78:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqg.b(wrp, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.abhh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.abgw r8, defpackage.arpe r9) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqg.c(abgw, arpe):java.lang.Object");
    }
}
