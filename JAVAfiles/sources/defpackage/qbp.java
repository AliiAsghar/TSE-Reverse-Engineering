package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qbp implements qbv {
    public static final alwo a = alwo.o("BugleGroupManagement");
    private final qcb b;
    private final anen c;

    public qbp(qcb qcbVar, anen anenVar) {
        this.b = qcbVar;
        this.c = anenVar;
    }

    @Override // defpackage.qbv
    public final akul a(ConversationIdType conversationIdType, qfl qflVar) {
        qet qetVar = qflVar.d;
        if (qetVar == null) {
            qetVar = qet.a;
        }
        if (qet.a.equals(qetVar)) {
            return aktp.ag(upm.b());
        }
        return this.b.f(conversationIdType).h(new mmq(qetVar, conversationIdType, 12), this.c);
    }
}
