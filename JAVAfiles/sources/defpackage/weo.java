package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class weo {
    private static final xze a = xze.g("BugleDataModel", "ParticipantOfflineDetector");
    private final xnv b;
    private final armf c;
    private final armf d;
    private final armf e;

    public weo(xnv xnvVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.b = xnvVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
    }

    public final void a(ConversationIdType conversationIdType) {
        smr q = ((rtz) this.d.b()).q(conversationIdType);
        if (q != null && !q.I().isPresent() && !q.ac() && q.h() == 0 && q.p() == 0 && ((vqu) this.e.b()).D(conversationIdType)) {
            rwd rwdVar = (rwd) this.c.b();
            akrh e = aktp.e("MessageDatabaseOperations#getLatestOutgoingRcsMessage");
            try {
                syc sycVar = new syc();
                sycVar.f(conversationIdType);
                sycVar.Q(1, 22);
                sycVar.w(3);
                sycVar.q(false);
                Optional ofNullable = Optional.ofNullable(rwdVar.j(new syb(sycVar)));
                e.close();
                if (ofNullable.isPresent() && rvx.q(((MessageCoreData) ofNullable.get()).j())) {
                    xyo a2 = a.a();
                    a2.b(conversationIdType);
                    a2.H("Set participant offline timestamp");
                    a2.q();
                    rtz rtzVar = (rtz) this.d.b();
                    sng sngVar = new sng();
                    sngVar.aj("markRecipientOfflineIfXmsReceivedInRcsChat");
                    sngVar.O(Optional.of(this.b.f()));
                    rtzVar.ah(conversationIdType, sngVar);
                }
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
