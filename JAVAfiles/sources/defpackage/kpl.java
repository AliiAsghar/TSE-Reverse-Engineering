package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpl {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/emergency/conversationprovider/EmergencyConversationProviderImpl");
    public final armf a;
    private final armf c;
    private final armf d;

    public kpl(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.c = armfVar;
        this.d = armfVar2;
        this.a = armfVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.kpj
            if (r0 == 0) goto L13
            r0 = r7
            kpj r0 = (defpackage.kpj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kpj r0 = new kpj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.aqil.P(r7)
            kda r7 = new kda
            r2 = 0
            r4 = 12
            r7.<init>(r5, r6, r2, r4)
            r0.c = r3
            java.lang.Object r7 = defpackage.arwi.d(r7, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpl.a(com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(boolean r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.kpk
            if (r0 == 0) goto L13
            r0 = r6
            kpk r0 = (defpackage.kpk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kpk r0 = new kpk
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            msg r5 = r0.d
            defpackage.aqil.P(r6)
            goto L68
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.aqil.P(r6)
            if (r5 == 0) goto L43
            armf r5 = r4.c
            java.lang.Object r5 = r5.b()
            msk r5 = (defpackage.msk) r5
            msh r5 = r5.m()
            goto L4f
        L43:
            armf r5 = r4.c
            java.lang.Object r5 = r5.b()
            msk r5 = (defpackage.msk) r5
            msh r5 = r5.l()
        L4f:
            armf r6 = r4.d
            java.lang.Object r6 = r6.b()
            ndi r6 = (defpackage.ndi) r6
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r6 = r6.e(r5)
            r2 = r5
            msg r2 = (defpackage.msg) r2
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = r4.a(r6, r0)
            if (r6 == r1) goto L9f
        L68:
            com.google.android.apps.messaging.shared.api.messaging.Conversation r6 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r6
            alvi r0 = defpackage.kpl.b
            alvw r0 = r0.g()
            alvz r1 = defpackage.alwp.a
            java.lang.String r2 = "BugleEmergencySOS"
            r0.X(r1, r2)
            alvg r0 = (defpackage.alvg) r0
            alvz r1 = defpackage.ydl.q
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r2 = r6.c()
            r0.X(r1, r2)
            alvz r1 = defpackage.ydl.B
            r0.X(r1, r5)
            java.lang.String r5 = "getOrCreateEsosConversation"
            r1 = 52
            java.lang.String r2 = "com/google/android/apps/messaging/emergency/conversationprovider/EmergencyConversationProviderImpl"
            java.lang.String r3 = "EmergencyConversationProviderImpl.kt"
            alvw r5 = r0.h(r2, r5, r1, r3)
            alvg r5 = (defpackage.alvg) r5
            java.lang.String r0 = "Created or retrieved eSOS Conversation"
            r5.q(r0)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r6.c()
            return r5
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpl.b(boolean, arpe):java.lang.Object");
    }
}
