package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pyh implements qar {
    private final armf a;

    public pyh(armf armfVar) {
        this.a = armfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    @Override // defpackage.qar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.amro a(defpackage.pwr r9) {
        /*
            r8 = this;
            alor r0 = r9.d
            java.lang.String r1 = "Retry-After"
            boolean r0 = r0.containsKey(r1)
            r2 = 0
            if (r0 != 0) goto Ld
            goto L4a
        Ld:
            alor r0 = r9.d
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L1c
            goto L4a
        L1c:
            r4 = 0
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.NumberFormatException -> L28
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L28
            long r2 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L28
            goto L4a
        L28:
            r0 = move-exception
            alwo r4 = defpackage.pwr.a
            alvw r4 = r4.i()
            alwl r4 = (defpackage.alwl) r4
            alvw r0 = r4.g(r0)
            alwl r0 = (defpackage.alwl) r0
            java.lang.String r4 = "getRetryAfterValue"
            r5 = 146(0x92, float:2.05E-43)
            java.lang.String r6 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/FileTransferFailure"
            java.lang.String r7 = "FileTransferFailure.java"
            alvw r0 = r0.h(r6, r4, r5, r7)
            alwl r0 = (defpackage.alwl) r0
            java.lang.String r4 = "Failed to parse %s header. Retrying immediately."
            r0.t(r4, r1)
        L4a:
            int r9 = r9.c
            r0 = 401(0x191, float:5.62E-43)
            if (r9 == r0) goto L78
            r0 = 410(0x19a, float:5.75E-43)
            if (r9 == r0) goto L75
            r0 = 422(0x1a6, float:5.91E-43)
            if (r9 == r0) goto L78
            r0 = 403(0x193, float:5.65E-43)
            if (r9 == r0) goto L63
            r0 = 404(0x194, float:5.66E-43)
            if (r9 == r0) goto L75
            amrn r9 = defpackage.amrn.RETRY_AFTER_DELAY
            goto L7a
        L63:
            armf r9 = r8.a
            java.lang.Object r9 = r9.b()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L72
            goto L78
        L72:
            amrn r9 = defpackage.amrn.NO_RETRY
            goto L7a
        L75:
            amrn r9 = defpackage.amrn.NO_RETRY
            goto L7a
        L78:
            amrn r9 = defpackage.amrn.RETRY_AFTER_REPROVISIONING
        L7a:
            amro r0 = defpackage.amro.a
            aozy r0 = r0.createBuilder()
            apag r1 = r0.b
            boolean r1 = r1.isMutable()
            if (r1 != 0) goto L8b
            r0.u()
        L8b:
            apag r1 = r0.b
            r4 = r1
            amro r4 = (defpackage.amro) r4
            int r9 = r9.f
            r4.c = r9
            int r9 = r4.b
            r9 = r9 | 1
            r4.b = r9
            boolean r9 = r1.isMutable()
            if (r9 != 0) goto La3
            r0.u()
        La3:
            apag r9 = r0.b
            amro r9 = (defpackage.amro) r9
            int r1 = r9.b
            r1 = r1 | 2
            r9.b = r1
            r9.d = r2
            apag r9 = r0.s()
            amro r9 = (defpackage.amro) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyh.a(pwr):amro");
    }
}
