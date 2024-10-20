package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rqc {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/impl/ConversationRefresherImpl");
    public final armf b;
    public final arpi c;
    private final agnq d;
    private final pia e;
    private final asgm f;

    public rqc(armf armfVar, agnq agnqVar, arpi arpiVar, pia piaVar) {
        armfVar.getClass();
        agnqVar.getClass();
        arpiVar.getClass();
        this.b = armfVar;
        this.d = agnqVar;
        this.c = arpiVar;
        this.e = piaVar;
        this.f = new asgm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a A[Catch: all -> 0x00d9, TryCatch #0 {all -> 0x00d9, blocks: (B:11:0x004b, B:12:0x0054, B:14:0x005a, B:17:0x006f, B:22:0x0073, B:24:0x0087, B:25:0x00d1, B:30:0x0094, B:31:0x0098, B:33:0x009e), top: B:10:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[Catch: all -> 0x00d9, TryCatch #0 {all -> 0x00d9, blocks: (B:11:0x004b, B:12:0x0054, B:14:0x005a, B:17:0x006f, B:22:0x0073, B:24:0x0087, B:25:0x00d1, B:30:0x0094, B:31:0x0098, B:33:0x009e), top: B:10:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[Catch: all -> 0x00d9, TryCatch #0 {all -> 0x00d9, blocks: (B:11:0x004b, B:12:0x0054, B:14:0x005a, B:17:0x006f, B:22:0x0073, B:24:0x0087, B:25:0x00d1, B:30:0x0094, B:31:0x0098, B:33:0x009e), top: B:10:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.alog r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.rqb
            if (r0 == 0) goto L13
            r0 = r10
            rqb r0 = (defpackage.rqb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            rqb r0 = new rqb
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            asgm r9 = r0.f
            java.lang.Object r1 = r0.a
            rqc r0 = r0.e
            defpackage.aqil.P(r10)
            r10 = r9
            r9 = r1
            goto L4b
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            defpackage.aqil.P(r10)
            asgm r10 = r8.f
            r0.e = r8
            r0.a = r9
            r0.f = r10
            r0.d = r3
            java.lang.Object r0 = r10.b(r0)
            if (r0 == r1) goto Lde
            r0 = r8
        L4b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld9
            r1.<init>()     // Catch: java.lang.Throwable -> Ld9
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> Ld9
        L54:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> Ld9
            if (r2 == 0) goto L73
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> Ld9
            r3 = r2
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r3 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r3     // Catch: java.lang.Throwable -> Ld9
            armf r4 = r0.b     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> Ld9
            ruq r4 = (defpackage.ruq) r4     // Catch: java.lang.Throwable -> Ld9
            boolean r3 = r4.i(r3)     // Catch: java.lang.Throwable -> Ld9
            if (r3 == 0) goto L54
            r1.add(r2)     // Catch: java.lang.Throwable -> Ld9
            goto L54
        L73:
            pia r9 = r0.e     // Catch: java.lang.Throwable -> Ld9
            phn r9 = (defpackage.phn) r9     // Catch: java.lang.Throwable -> Ld9
            armf r9 = r9.a     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r9 = r9.b()     // Catch: java.lang.Throwable -> Ld9
            ansy r9 = (defpackage.ansy) r9     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r2 = "bugle.run_conversation_refresher_impl_in_scope"
            boolean r9 = r9.e(r2)     // Catch: java.lang.Throwable -> Ld9
            if (r9 == 0) goto L94
            agnq r9 = r0.d     // Catch: java.lang.Throwable -> Ld9
            ndb r2 = new ndb     // Catch: java.lang.Throwable -> Ld9
            r3 = 15
            r2.<init>(r1, r0, r3)     // Catch: java.lang.Throwable -> Ld9
            r9.b(r2)     // Catch: java.lang.Throwable -> Ld9
            goto Ld1
        L94:
            java.util.Iterator r9 = r1.iterator()     // Catch: java.lang.Throwable -> Ld9
        L98:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> Ld9
            if (r2 == 0) goto Ld1
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> Ld9
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r2 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r2     // Catch: java.lang.Throwable -> Ld9
            alvi r3 = defpackage.rqc.a     // Catch: java.lang.Throwable -> Ld9
            alvw r3 = r3.f()     // Catch: java.lang.Throwable -> Ld9
            alvz r4 = defpackage.alwp.a     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = "BugleBackup"
            r3.X(r4, r5)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/impl/ConversationRefresherImpl"
            java.lang.String r5 = "refreshConversationsInBatch"
            java.lang.String r6 = "ConversationRefresherImpl.kt"
            r7 = 80
            alvw r3 = r3.h(r4, r5, r7, r6)     // Catch: java.lang.Throwable -> Ld9
            alvg r3 = (defpackage.alvg) r3     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r4 = "Refreshing conversation [%s]"
            r3.t(r4, r2)     // Catch: java.lang.Throwable -> Ld9
            armf r3 = r0.b     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> Ld9
            ruq r3 = (defpackage.ruq) r3     // Catch: java.lang.Throwable -> Ld9
            r4 = 0
            r3.j(r2, r4)     // Catch: java.lang.Throwable -> Ld9
            goto L98
        Ld1:
            alog r9 = defpackage.alzz.aZ(r1)     // Catch: java.lang.Throwable -> Ld9
            r10.d()
            return r9
        Ld9:
            r9 = move-exception
            r10.d()
            throw r9
        Lde:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqc.a(alog, arpe):java.lang.Object");
    }
}
