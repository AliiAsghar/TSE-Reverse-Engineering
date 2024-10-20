package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qom {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientSyncImpl");
    private final armf b;
    private final ndi c;

    public qom(ndi ndiVar, armf armfVar) {
        ndiVar.getClass();
        armfVar.getClass();
        this.c = ndiVar;
        this.b = armfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r9, boolean r10, defpackage.arpe r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.qok
            if (r0 == 0) goto L13
            r0 = r11
            qok r0 = (defpackage.qok) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            qok r0 = new qok
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            boolean r10 = r0.a
            ahqq r9 = r0.f
            qom r0 = r0.e
            defpackage.aqil.P(r11)
            goto L9e
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            defpackage.aqil.P(r11)
            alvi r11 = defpackage.qom.a
            alvw r11 = r11.g()
            alvz r2 = defpackage.alwp.a
            java.lang.String r5 = "BugleRecipientSync"
            r11.X(r2, r5)
            java.lang.String r2 = "syncChangedContacts"
            r5 = 36
            java.lang.String r6 = "com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientSyncImpl"
            java.lang.String r7 = "ContactRecipientSyncImpl.kt"
            alvw r11 = r11.h(r6, r2, r5, r7)
            alvg r11 = (defpackage.alvg) r11
            int r2 = r9.size()
            java.lang.String r5 = "Syncing %d changed contacts with recipients"
            r11.r(r5, r2)
            armf r11 = r8.b
            java.lang.Object r11 = r11.b()
            ahqr r11 = (defpackage.ahqr) r11
            ahqq r11 = r11.d()
            ndi r2 = r8.c
            alog r9 = defpackage.alzz.aZ(r9)
            java.lang.String r5 = "syncRecipientsWithChangedContacts"
            akrh r5 = defpackage.aktp.e(r5)
            armf r2 = r2.d     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> Lb6
            nfl r2 = (defpackage.nfl) r2     // Catch: java.lang.Throwable -> Lb6
            nfj r6 = new nfj     // Catch: java.lang.Throwable -> Lb6
            r6.<init>(r2, r9, r3)     // Catch: java.lang.Throwable -> Lb6
            arwe r9 = r2.d     // Catch: java.lang.Throwable -> Lb6
            akul r9 = defpackage.qjh.i(r9, r6)     // Catch: java.lang.Throwable -> Lb6
            r5.b(r9)     // Catch: java.lang.Throwable -> Lb6
            r5.close()
            r0.e = r8
            r0.f = r11
            r0.a = r10
            r0.d = r4
            java.lang.Object r9 = defpackage.arro.F(r9, r0)
            if (r9 == r1) goto Lb5
            r0 = r8
            r9 = r11
        L9e:
            armf r11 = r0.b
            java.lang.Object r11 = r11.b()
            ahqr r11 = (defpackage.ahqr) r11
            if (r10 == 0) goto Lab
            ahka r10 = defpackage.qld.d
            goto Lad
        Lab:
            ahka r10 = defpackage.qld.k
        Lad:
            ahqp r0 = defpackage.ahqp.SUCCESS
            r11.f(r9, r10, r3, r0)
            arnb r9 = defpackage.arnb.a
            return r9
        Lb5:
            return r1
        Lb6:
            r9 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> Lbb
            goto Lbf
        Lbb:
            r10 = move-exception
            r9.addSuppressed(r10)
        Lbf:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qom.a(java.util.List, boolean, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.Set r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.qol
            if (r0 == 0) goto L13
            r0 = r10
            qol r0 = (defpackage.qol) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qol r0 = new qol
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            ahqq r9 = r0.e
            qom r0 = r0.d
            defpackage.aqil.P(r10)
            goto L9b
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.aqil.P(r10)
            alvi r10 = defpackage.qom.a
            alvw r10 = r10.g()
            alvz r2 = defpackage.alwp.a
            java.lang.String r5 = "BugleRecipientSync"
            r10.X(r2, r5)
            java.lang.String r2 = "syncDeletedContacts"
            r5 = 54
            java.lang.String r6 = "com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientSyncImpl"
            java.lang.String r7 = "ContactRecipientSyncImpl.kt"
            alvw r10 = r10.h(r6, r2, r5, r7)
            alvg r10 = (defpackage.alvg) r10
            int r2 = r9.size()
            java.lang.String r5 = "Syncing %d deleted contacts with recipients"
            r10.r(r5, r2)
            armf r10 = r8.b
            java.lang.Object r10 = r10.b()
            ahqr r10 = (defpackage.ahqr) r10
            ahqq r10 = r10.d()
            ndi r2 = r8.c
            alpt r9 = defpackage.alzz.bd(r9)
            java.lang.String r5 = "syncRecipientsWithDeletedContacts"
            akrh r5 = defpackage.aktp.e(r5)
            armf r2 = r2.d     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> Lae
            nfl r2 = (defpackage.nfl) r2     // Catch: java.lang.Throwable -> Lae
            jog r6 = new jog     // Catch: java.lang.Throwable -> Lae
            r7 = 2
            r6.<init>(r2, r9, r3, r7)     // Catch: java.lang.Throwable -> Lae
            arwe r9 = r2.d     // Catch: java.lang.Throwable -> Lae
            akul r9 = defpackage.qjh.i(r9, r6)     // Catch: java.lang.Throwable -> Lae
            r5.b(r9)     // Catch: java.lang.Throwable -> Lae
            r5.close()
            r0.d = r8
            r0.e = r10
            r0.c = r4
            java.lang.Object r9 = defpackage.arro.F(r9, r0)
            if (r9 == r1) goto Lad
            r0 = r8
            r9 = r10
        L9b:
            armf r10 = r0.b
            java.lang.Object r10 = r10.b()
            ahqr r10 = (defpackage.ahqr) r10
            ahka r0 = defpackage.qld.l
            ahqp r1 = defpackage.ahqp.SUCCESS
            r10.f(r9, r0, r3, r1)
            arnb r9 = defpackage.arnb.a
            return r9
        Lad:
            return r1
        Lae:
            r9 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> Lb3
            goto Lb7
        Lb3:
            r10 = move-exception
            r9.addSuppressed(r10)
        Lb7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qom.b(java.util.Set, arpe):java.lang.Object");
    }
}
