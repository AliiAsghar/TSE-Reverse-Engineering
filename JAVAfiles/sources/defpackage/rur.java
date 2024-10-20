package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rur {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationParticipantsProviderImpl");
    public final armf b;
    public final msk c;
    public final ryg d;
    public final arpi e;
    public final arwe f;
    private final adji g;

    public rur(armf armfVar, msk mskVar, adji adjiVar, ryg rygVar, arpi arpiVar, arwe arweVar) {
        armfVar.getClass();
        mskVar.getClass();
        adjiVar.getClass();
        rygVar.getClass();
        arpiVar.getClass();
        arweVar.getClass();
        this.b = armfVar;
        this.c = mskVar;
        this.g = adjiVar;
        this.d = rygVar;
        this.e = arpiVar;
        this.f = arweVar;
    }

    public final msh a(qwm qwmVar) {
        if (qwmVar.j()) {
            return (msh) arsd.k(qwmVar.b());
        }
        adit a2 = this.g.a(qwmVar.e());
        if (a2 == null) {
            alvw d = a.d();
            d.X(alwp.a, "BugleConversation");
            ((alvg) d.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationParticipantsProviderImpl", "toMessagingIdentity", 190, "ConversationParticipantsProviderImpl.kt")).q("No associated RCS provisioning, fallback on subscription.");
            return (msh) arsd.k(qwmVar.b());
        }
        return this.c.c(a2.a, new rxm(1));
    }

    public final Object b(ConversationIdType conversationIdType, arpe arpeVar) {
        return arro.q(this.e, new rdx(this, conversationIdType, (arpe) null, 8, (byte[]) null), arpeVar);
    }

    public final List c(ConversationIdType conversationIdType) {
        List K = ((rtz) this.b.b()).K(conversationIdType);
        K.getClass();
        return K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List d(ConversationIdType conversationIdType) {
        msh mshVar;
        armf armfVar = this.b;
        List c = c(conversationIdType);
        smr q = ((rtz) armfVar.b()).q(conversationIdType);
        if (q == null) {
            return c;
        }
        if (!tvu.e(q.h())) {
            return c;
        }
        SelfIdentityId W = lga.W(q.K());
        if (W == null) {
            alvw i = a.i();
            i.X(alwp.a, "BugleConversation");
            ((alvg) i.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationParticipantsProviderImpl", "doGetParticipantsExcludingConversationCurrentSelf", 137, "ConversationParticipantsProviderImpl.kt")).t("Current self id is not present for RCS group conversation[%s].", conversationIdType);
            return c;
        }
        qwm c2 = this.d.c(W);
        if (c2 == null) {
            alvw i2 = a.i();
            i2.X(alwp.a, "BugleConversation");
            ((alvg) i2.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationParticipantsProviderImpl", "getCurrentSelfParticipantMessagingIdentity", 167, "ConversationParticipantsProviderImpl.kt")).t("No subscription associated with currentSelfId[%s].", W);
        }
        if (c2 != null) {
            mshVar = a(c2);
        } else {
            mshVar = null;
        }
        if (mshVar == null) {
            return c;
        }
        ArrayList arrayList = new ArrayList();
        alur it = ((alog) c).iterator();
        while (it.hasNext()) {
            E next = it.next();
            if (!d.F(this.c.q((ParticipantsTable.BindData) next), mshVar)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final List e(ConversationIdType conversationIdType) {
        aiut.b();
        return c(conversationIdType);
    }

    public final List f(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        aiut.b();
        return d(conversationIdType);
    }
}
