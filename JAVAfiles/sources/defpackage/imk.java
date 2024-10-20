package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imk {
    public static final alwo a = alwo.o("BugleDatabase");
    public static final alvz b = new alvz("conversation_id", String.class, false, false);
    public static final alvz c = new alvz("conversation_self_id", String.class, false, false);
    public final armf d;
    public final tqx e;
    public final anen f;
    public final anen g;
    public final uhj h;
    public final armf i;
    public final armf j;
    public final Optional k;
    public final ConversationIdType l;
    public final AtomicReference m = new AtomicReference(iml.a);
    public final AtomicReference n = new AtomicReference();
    public final kor o;
    public final iew p;
    public final ahiy q;
    private final String r;
    private final ansy s;

    public imk(armf armfVar, tqx tqxVar, anen anenVar, anen anenVar2, ahiy ahiyVar, uhj uhjVar, ansy ansyVar, armf armfVar2, armf armfVar3, kor korVar, Optional optional, iew iewVar, ConversationIdType conversationIdType) {
        this.d = armfVar;
        this.e = tqxVar;
        this.f = anenVar;
        this.g = anenVar2;
        this.q = ahiyVar;
        this.h = uhjVar;
        this.s = ansyVar;
        this.i = armfVar2;
        this.j = armfVar3;
        this.o = korVar;
        this.k = optional;
        this.p = iewVar;
        this.l = conversationIdType;
        this.r = "draft_data_service".concat(conversationIdType.toString());
    }

    public final akfb a(ajwt ajwtVar) {
        return new akfk(this.s, new izd(this, ajwtVar, 1), this.r, 2);
    }

    public final akul b(Optional optional) {
        return (akul) optional.map(new ijs(this, 16)).orElse(aktp.ag(Optional.empty()));
    }

    public final void c(rsr rsrVar) {
        if (this.l.equals(rsrVar.d)) {
            if (!rsrVar.s.isEmpty()) {
                for (PendingAttachmentData pendingAttachmentData : rsrVar.s) {
                    rsrVar.u.remove(pendingAttachmentData);
                    pendingAttachmentData.bL();
                }
                rsrVar.s.clear();
            }
            this.q.q(aktp.aj(new imi(this, rsrVar.t(false), 0), this.g), this.r);
            return;
        }
        throw new IllegalArgumentException("Mismatched conversation id");
    }

    public final void d(MessageCoreData messageCoreData, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (messageCoreData != null && messageCoreData.u() != null) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "acceptNewDraft", 454, "DraftDataService.java")).q("DraftDataService only accepts incoming drafts that with replies if they are overwriting the text: clearing the reply context");
            messageCoreData.bB(null);
        } else {
            if (messageCoreData != null && messageCoreData.u() != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            d.t(z2, "DraftDataService does not accept incoming drafts that are replies unless they are explicitly overwriting the draft text");
        }
        ((alwl) a.m().h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "acceptNewDraft", 466, "DraftDataService.java")).H("DraftDataService : update local cached value with %s %s", z, messageCoreData);
        MessageCoreData messageCoreData2 = (MessageCoreData) this.n.getAndSet(messageCoreData);
        if (messageCoreData2 != null ? !messageCoreData2.equals(messageCoreData) : messageCoreData != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        iml imlVar = iml.a;
        if (z) {
            imlVar = iml.b;
        }
        if (this.m.getAndSet(imlVar) != imlVar) {
            z4 = true;
        }
        if (z3 | z4) {
            this.q.q(aktp.ag(null), this.r);
        }
    }
}
