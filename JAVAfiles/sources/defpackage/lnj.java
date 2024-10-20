package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnj implements ljw {
    private final uxx a;
    private final llc b;

    public lnj(uxx uxxVar, llc llcVar) {
        uxxVar.getClass();
        this.a = uxxVar;
        this.b = llcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.ljw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.lnh r8, defpackage.arpe r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.lni
            if (r0 == 0) goto L13
            r0 = r9
            lni r0 = (defpackage.lni) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lni r0 = new lni
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.aqil.P(r9)
            goto Lb0
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            lnj r8 = r0.d
            defpackage.aqil.P(r9)
            goto L8c
        L3d:
            lnj r8 = r0.d
            defpackage.aqil.P(r9)
            goto L60
        L43:
            defpackage.aqil.P(r9)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r9 = r8.a
            boolean r2 = r9 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId
            if (r2 != 0) goto L64
            uxx r8 = r7.a
            java.lang.String r9 = r9.b()
            r9.getClass()
            r0.d = r7
            r0.c = r5
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 == r1) goto L63
            r8 = r7
        L60:
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            goto L8e
        L63:
            return r1
        L64:
            java.util.List r9 = r8.b
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto Lc2
            uxx r9 = r7.a
            java.util.List r8 = r8.b
            r0.d = r7
            r0.c = r4
            armf r2 = r9.c
            java.lang.Object r2 = r2.b()
            r2.getClass()
            arpi r2 = (defpackage.arpi) r2
            uwn r4 = new uwn
            r5 = 6
            r4.<init>(r8, r9, r6, r5)
            java.lang.Object r9 = defpackage.arro.q(r2, r4, r0)
            if (r9 == r1) goto Lc1
            r8 = r7
        L8c:
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
        L8e:
            if (r9 == 0) goto Lbe
            android.content.IntentSender r9 = r9.getIntentSender()
            r9.getClass()
            sd r2 = new sd
            r4 = 0
            r2.<init>(r9, r6, r4, r4)
            llc r8 = r8.b
            sm r9 = new sm
            r9.<init>()
            r0.d = r6
            r0.c = r3
            java.lang.String r3 = "PARENTAL_APPROVAL_DIALOG_KEY"
            java.lang.Object r9 = defpackage.llc.b(r8, r3, r9, r2, r0)
            if (r9 == r1) goto Lbd
        Lb0:
            ru r9 = (defpackage.ru) r9
            int r8 = r9.a
            r9 = -1
            if (r8 != r9) goto Lba
            lnk r8 = defpackage.lnk.a
            goto Lbc
        Lba:
            lnk r8 = defpackage.lnk.b
        Lbc:
            return r8
        Lbd:
            return r1
        Lbe:
            lnk r8 = defpackage.lnk.b
            return r8
        Lc1:
            return r1
        Lc2:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Either ConversationId or messaging identities must be provided."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lnj.b(lnh, arpe):java.lang.Object");
    }
}
