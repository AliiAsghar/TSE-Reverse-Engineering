package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qbq implements qbv {
    public static final alwo a = alwo.o("BugleGroupManagement");
    public final anen b;
    public final anen c;
    public final armf d;
    public final pss e;
    public final qcb f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final pvw j;

    public qbq(anen anenVar, anen anenVar2, qcb qcbVar, armf armfVar, pss pssVar, armf armfVar2, armf armfVar3, pvw pvwVar, armf armfVar4) {
        this.b = anenVar;
        this.c = anenVar2;
        this.f = qcbVar;
        this.d = armfVar;
        this.e = pssVar;
        this.g = armfVar2;
        this.h = armfVar3;
        this.j = pvwVar;
        this.i = armfVar4;
    }

    private final akul b(ConversationIdType conversationIdType, qpd qpdVar) {
        return aktp.ai(new mzn(qpdVar, conversationIdType, 19, null), this.c);
    }

    @Override // defpackage.qbv
    public final akul a(ConversationIdType conversationIdType, qfl qflVar) {
        qew qewVar = qflVar.i;
        if (qewVar == null) {
            qewVar = qew.a;
        }
        if (!qewVar.c) {
            return aktp.ag(upm.b());
        }
        qpd qpdVar = qpd.RCS_GROUP_NOT_FOUND;
        qpd b = qpd.b(qewVar.d);
        if (b == null) {
            b = qpd.NONE;
        }
        if (qpdVar.equals(b)) {
            qpd b2 = qpd.b(qewVar.d);
            if (b2 == null) {
                b2 = qpd.NONE;
            }
            return b(conversationIdType, b2).i(new mhv(this, conversationIdType, qflVar, 17, (char[]) null), this.b);
        }
        qpd b3 = qpd.b(qewVar.d);
        if (b3 == null) {
            b3 = qpd.NONE;
        }
        return b(conversationIdType, b3);
    }
}
