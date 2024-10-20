package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tvk implements qcd {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/OnParticipantGroupMetadataChangeEtouffeeListener");
    private final armf b;
    private final armf c;

    public tvk(armf armfVar, armf armfVar2) {
        this.c = armfVar2;
        this.b = armfVar;
    }

    @Override // defpackage.qcd
    public final akul a(qei qeiVar, ConversationIdType conversationIdType, qfg qfgVar) {
        if (qfgVar.b.size() + qfgVar.d.size() + qfgVar.c.size() <= 0) {
            alvw g = a.g();
            g.X(alwp.a, "BugleEtouffee");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/OnParticipantGroupMetadataChangeEtouffeeListener", "onProcessCompleteFuture", 64, "OnParticipantGroupMetadataChangeEtouffeeListener.java")).q("No group changes found. Skip updating group conversation e2ee state.");
            return aktp.ag(null);
        }
        rto z = ((uac) this.c.b()).z(conversationIdType);
        if (z == null) {
            alvw g2 = a.g();
            g2.X(alwp.a, "BugleEtouffee");
            ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/OnParticipantGroupMetadataChangeEtouffeeListener", "onProcessCompleteFuture", 70, "OnParticipantGroupMetadataChangeEtouffeeListener.java")).q("Conversation is missing. Skip updating group conversation e2ee state.");
            return aktp.ag(null);
        }
        Stream map = Collection.EL.stream(qfgVar.b).filter(new trt(2)).map(new tvq(1));
        int i = alog.d;
        akul b = ((tsc) this.b.b()).a(qeiVar, conversationIdType).b((alog) map.collect(alls.a));
        if (!z.E()) {
            alvw g3 = a.g();
            g3.X(alwp.a, "BugleEtouffee");
            ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/OnParticipantGroupMetadataChangeEtouffeeListener", "onProcessCompleteFuture", 81, "OnParticipantGroupMetadataChangeEtouffeeListener.java")).q("Conversation is not already encrypted. Launch async encryption update worker.");
            qiu.h(b);
            return aktp.ag(null);
        }
        alvw g4 = a.g();
        g4.X(alwp.a, "BugleEtouffee");
        ((alvg) ((alvg) g4).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/OnParticipantGroupMetadataChangeEtouffeeListener", "onProcessCompleteFuture", 86, "OnParticipantGroupMetadataChangeEtouffeeListener.java")).q("Participant changes found. Updating group conversation e2ee state.");
        return b;
    }
}
