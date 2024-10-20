package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qbo implements qbv {
    public static final alwo a = alwo.o("BugleGroupManagement");
    public final vtj b;
    public final hmk c;
    private final anen d;
    private final qcb e;

    public qbo(anen anenVar, qcb qcbVar, vtj vtjVar, hmk hmkVar) {
        this.d = anenVar;
        this.e = qcbVar;
        this.b = vtjVar;
        this.c = hmkVar;
    }

    @Override // defpackage.qbv
    public final akul a(final ConversationIdType conversationIdType, qfl qflVar) {
        final qer qerVar = qflVar.f;
        if (qerVar == null) {
            qerVar = qer.a;
        }
        return this.e.f(conversationIdType).h(new algk() { // from class: qbn
            @Override // defpackage.algk
            public final Object apply(Object obj) {
                qbo qboVar;
                ConversationIdType conversationIdType2;
                qbs qbsVar = (qbs) obj;
                vtk a2 = qbsVar.i.a();
                qer qerVar2 = qerVar;
                Iterator<E> it = qerVar2.b.iterator();
                while (true) {
                    qboVar = qbo.this;
                    if (!it.hasNext()) {
                        break;
                    }
                    qdz qdzVar = (qdz) it.next();
                    vtj vtjVar = qboVar.b;
                    qes b = qes.b(qdzVar.c);
                    if (b == null) {
                        b = qes.UNKNOWN_TYPE;
                    }
                    vtl vtlVar = (vtl) vtjVar.fu(b);
                    if (vtlVar == null) {
                        alwl alwlVar = (alwl) qbo.a.m().h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/CapabilitiesGroupMetadataProcessor", "addCapabilitiesToBuilder", 103, "CapabilitiesGroupMetadataProcessor.java");
                        qes b2 = qes.b(qdzVar.c);
                        if (b2 == null) {
                            b2 = qes.UNKNOWN_TYPE;
                        }
                        alwlVar.t("Received a server capability not supported by the client: %s", b2.name());
                    } else {
                        a2.c(vtlVar);
                    }
                }
                for (qfv qfvVar : qerVar2.c) {
                    vtj vtjVar2 = qboVar.b;
                    qes b3 = qes.b(qfvVar.c);
                    if (b3 == null) {
                        b3 = qes.UNKNOWN_TYPE;
                    }
                    vtl vtlVar2 = (vtl) vtjVar2.fu(b3);
                    if (vtlVar2 == null) {
                        alwl alwlVar2 = (alwl) qbo.a.m().h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/CapabilitiesGroupMetadataProcessor", "removeCapabilitiesFromBuilder", 120, "CapabilitiesGroupMetadataProcessor.java");
                        qes b4 = qes.b(qfvVar.c);
                        if (b4 == null) {
                            b4 = qes.UNKNOWN_TYPE;
                        }
                        alwlVar2.t("Received a server capability not supported by the client: %s", b4.name());
                    } else {
                        a2.b(vtlVar2);
                    }
                }
                vtm a3 = a2.a();
                sng sngVar = new sng();
                sngVar.aj("CapabilitiesG/roupMetadataProcessor#process");
                sngVar.ag();
                sngVar.J(a3);
                sngVar.e(qbsVar.a);
                alvw m = qbo.a.m();
                m.X(ydl.r, qbsVar.b);
                m.X(ydl.o, qbsVar.a.toString());
                m.X(ydl.I, qbsVar.f);
                ((alwl) m.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/CapabilitiesGroupMetadataProcessor", "process", 81, "CapabilitiesGroupMetadataProcessor.java")).D("RCS group capabilities updated. Previous capabilities: %s. New capabilities; %s", qbsVar.i.c(), a3.c());
                hmk hmkVar = qboVar.c;
                Iterator<E> it2 = qerVar2.b.iterator();
                while (true) {
                    conversationIdType2 = conversationIdType;
                    if (!it2.hasNext()) {
                        break;
                    }
                    int i = ((qdz) it2.next()).c;
                    qes b5 = qes.b(i);
                    if (b5 == null) {
                        b5 = qes.UNKNOWN_TYPE;
                    }
                    if (b5 == qes.REMOVE_PARTICIPANT_BY_ALL) {
                        ((zap) hmkVar.a).j(conversationIdType2, 3);
                    } else {
                        qes b6 = qes.b(i);
                        if (b6 == null) {
                            b6 = qes.UNKNOWN_TYPE;
                        }
                        if (b6 == qes.REMOVE_PARTICIPANT_BY_ADMIN) {
                            ((zap) hmkVar.a).j(conversationIdType2, 4);
                        }
                    }
                }
                Iterator<E> it3 = qerVar2.c.iterator();
                while (it3.hasNext()) {
                    int i2 = ((qfv) it3.next()).c;
                    qes b7 = qes.b(i2);
                    if (b7 == null) {
                        b7 = qes.UNKNOWN_TYPE;
                    }
                    if (b7 != qes.REMOVE_PARTICIPANT_BY_ALL) {
                        qes b8 = qes.b(i2);
                        if (b8 == null) {
                            b8 = qes.UNKNOWN_TYPE;
                        }
                        if (b8 == qes.REMOVE_PARTICIPANT_BY_ADMIN) {
                        }
                    }
                    ((zap) hmkVar.a).j(conversationIdType2, 2);
                }
                return upm.b();
            }
        }, this.d);
    }
}
