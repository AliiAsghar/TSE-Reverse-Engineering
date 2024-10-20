package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qcm implements qbv {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SubjectGroupMetadataProcessor");
    public final vuz b;
    private final qcb c;
    private final anen d;

    public qcm(vuz vuzVar, qcb qcbVar, anen anenVar) {
        this.b = vuzVar;
        this.c = qcbVar;
        this.d = anenVar;
    }

    @Override // defpackage.qbv
    public final akul a(ConversationIdType conversationIdType, qfl qflVar) {
        qfk qfkVar = qflVar.g;
        if (qfkVar == null) {
            qfkVar = qfk.a;
        }
        if (!qfk.a.equals(qfkVar)) {
            boolean z = true;
            if (qfkVar.d && !qfkVar.c.isEmpty()) {
                z = false;
            }
            d.t(z, "When the subject deleted flag is true the subject field must be empty");
            return this.c.f(conversationIdType).i(new qbt(this, conversationIdType, qfkVar, 4), this.d);
        }
        alvw d = a.d();
        d.X(alwp.a, "BugleGroupManagement");
        alvg alvgVar = (alvg) d;
        alvgVar.X(ydl.p, conversationIdType);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SubjectGroupMetadataProcessor", "process", 54, "SubjectGroupMetadataProcessor.java")).q("No changes to the subject in the group notification");
        return aktp.ag(upm.b());
    }
}
