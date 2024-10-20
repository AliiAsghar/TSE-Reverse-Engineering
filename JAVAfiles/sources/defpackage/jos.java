package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jos implements jpe {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ApiIncomingDraftParser");
    public final eog a;
    private final jlj c;

    public jos(eog eogVar, jlj jljVar) {
        eogVar.getClass();
        this.a = eogVar;
        this.c = jljVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arqg r10, defpackage.arpe r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.joq
            if (r0 == 0) goto L13
            r0 = r11
            joq r0 = (defpackage.joq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            joq r0 = new joq
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            java.lang.String r5 = "parse"
            java.lang.String r6 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ApiIncomingDraftParser"
            java.lang.String r7 = "ApiIncomingDraftParser.kt"
            java.lang.String r8 = "BugleComposeRow2"
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            defpackage.aqil.P(r11)     // Catch: defpackage.qpb -> L30
            goto L7e
        L30:
            r10 = move-exception
            goto L87
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            defpackage.aqil.P(r11)
            java.lang.Object r10 = r10.a()
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r10 = (com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft) r10
            if (r10 != 0) goto L5e
            alvi r10 = defpackage.jos.b
            alvw r10 = r10.d()
            alvz r11 = defpackage.alwp.a
            r10.X(r11, r8)
            r11 = 36
            alvw r10 = r10.h(r6, r5, r11, r7)
            alvg r10 = (defpackage.alvg) r10
            java.lang.String r11 = "ApiIncomingDraftParser found no incoming draft"
            r10.q(r11)
            return r3
        L5e:
            alvi r11 = defpackage.jos.b
            alvw r11 = r11.d()
            alvz r2 = defpackage.alwp.a
            r11.X(r2, r8)
            r2 = 40
            alvw r11 = r11.h(r6, r5, r2, r7)
            alvg r11 = (defpackage.alvg) r11
            java.lang.String r2 = "Parsing incoming %s"
            r11.t(r2, r10)
            r0.c = r4     // Catch: defpackage.qpb -> L30
            java.lang.Object r11 = r9.d(r10, r0)     // Catch: defpackage.qpb -> L30
            if (r11 == r1) goto L86
        L7e:
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r11 = (com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft) r11     // Catch: defpackage.qpb -> L30
            r10 = 2
            jhc r10 = defpackage.hwr.ak(r11, r10)     // Catch: defpackage.qpb -> L30
            return r10
        L86:
            return r1
        L87:
            alvi r11 = defpackage.jos.b
            alvw r11 = r11.i()
            alvz r0 = defpackage.alwp.a
            r11.X(r0, r8)
            alvg r11 = (defpackage.alvg) r11
            alvw r10 = r11.g(r10)
            r11 = 44
            alvw r10 = r10.h(r6, r5, r11, r7)
            alvg r10 = (defpackage.alvg) r10
            java.lang.String r11 = "Incoming draft was filtered out"
            r10.q(r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jos.a(arqg, arpe):java.lang.Object");
    }

    @Override // defpackage.jpe
    public final Object b(arpe arpeVar) {
        alvw d = b.d();
        d.X(alwp.a, "BugleComposeRow2");
        ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ApiIncomingDraftParser", "peek", 29, "ApiIncomingDraftParser.kt")).q("Starting ApiIncomingDraftParser.peek");
        return a(new jmy(this, 3), arpeVar);
    }

    @Override // defpackage.jpe
    public final Object c(arpe arpeVar) {
        alvw d = b.d();
        d.X(alwp.a, "BugleComposeRow2");
        ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ApiIncomingDraftParser", "remove", 24, "ApiIncomingDraftParser.kt")).q("Starting ApiIncomingDraftParser.remove");
        return a(new jmy(this, 4), arpeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0072 -> B:10:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r13, defpackage.arpe r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.jor
            if (r0 == 0) goto L13
            r0 = r14
            jor r0 = (defpackage.jor) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            jor r0 = new jor
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.d
            arpl r1 = defpackage.arpl.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft$Attachment r13 = r0.i
            java.lang.Object r2 = r0.c
            java.lang.Object r4 = r0.b
            java.lang.Object r5 = r0.a
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r6 = r0.h
            jos r7 = r0.g
            defpackage.aqil.P(r14)
            goto L76
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            defpackage.aqil.P(r14)
            java.util.List r14 = r13.b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r14 = r14.iterator()
            r7 = r12
            r4 = r14
            r5 = r2
        L4c:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto La4
            java.lang.Object r2 = r4.next()
            r14 = r2
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft$Attachment r14 = (com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft.Attachment) r14
            jlj r6 = r7.c
            android.net.Uri r8 = r14.b
            r0.g = r7
            r0.h = r13
            r0.a = r5
            r0.b = r4
            r0.c = r2
            r0.i = r14
            r0.f = r3
            java.lang.Object r6 = r6.b(r8, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            r11 = r6
            r6 = r13
            r13 = r14
            r14 = r11
        L76:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L9f
            alvi r14 = defpackage.jos.b
            alvw r14 = r14.h()
            alvz r2 = defpackage.alwp.a
            java.lang.String r8 = "BugleComposeRow2"
            r14.X(r2, r8)
            java.lang.String r2 = "sanitizeAttachments"
            r8 = 56
            java.lang.String r9 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ApiIncomingDraftParser"
            java.lang.String r10 = "ApiIncomingDraftParser.kt"
            alvw r14 = r14.h(r9, r2, r8, r10)
            alvg r14 = (defpackage.alvg) r14
            java.lang.String r2 = "Attachment from IncomingDraft blocked by security filter: silently removing %s"
            r14.t(r2, r13)
            goto La2
        L9f:
            r5.add(r2)
        La2:
            r13 = r6
            goto L4c
        La4:
            r14 = 0
            r0 = 125(0x7d, float:1.75E-43)
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r13 = com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft.a(r13, r5, r14, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jos.d(com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft, arpe):java.lang.Object");
    }
}
