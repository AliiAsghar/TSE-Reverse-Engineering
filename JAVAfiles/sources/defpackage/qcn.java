package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qcn implements qbv {
    private final anen a;

    public qcn(anen anenVar) {
        this.a = anenVar;
    }

    @Override // defpackage.qbv
    public final akul a(ConversationIdType conversationIdType, qfl qflVar) {
        qfc qfcVar = qflVar.j;
        if (qfcVar == null) {
            qfcVar = qfc.a;
        }
        if (qfc.a.equals(qfcVar)) {
            return aktp.ag(upm.b());
        }
        return aktp.ai(new mzn(conversationIdType, qfcVar, 20), this.a);
    }
}
