package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mer {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/analytics/mmsgroup/DeidentifiedMmsGroupEventLogger");
    private final arwe b;
    private final armf c;
    private final armf d;
    private final xnv e;
    private final mbb f;

    public mer(arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3, mbb mbbVar, xnv xnvVar) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        mbbVar.getClass();
        xnvVar.getClass();
        this.b = arweVar;
        this.c = armfVar;
        this.d = armfVar3;
        this.f = mbbVar;
        this.e = xnvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object b(defpackage.mer r18, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r19, int r20, defpackage.arpe r21) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mer.b(mer, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0124 A[LOOP:0: B:14:0x011e->B:16:0x0124, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0152 A[LOOP:1: B:19:0x014c->B:21:0x0152, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r13, defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mer.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, arpe):java.lang.Object");
    }

    public final void c(ConversationIdType conversationIdType, int i) {
        String str;
        alvg alvgVar = (alvg) a.d().h("com/google/android/apps/messaging/shared/analytics/mmsgroup/DeidentifiedMmsGroupEventLogger", "logEvent", 77, "DeidentifiedMmsGroupEventLogger.kt");
        if (i != 4) {
            str = "MMS_GROUP_UPGRADE_NOT_ELIGIBLE";
        } else {
            str = "MMS_GROUP_UPGRADE_ELIGIBLE";
        }
        alvgVar.t("Logging MMS group event: %s", str);
        qjh.l(this.b, null, new mdi(this, conversationIdType, i, (arpe) null, 4), 3);
    }
}
