package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnw implements mld {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/conversation/emergencysos/EmergencySosConversationRepository");
    public final anen b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final lrf g;
    private final armf h;
    private final armf i;

    public mnw(lrf lrfVar, anen anenVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        this.g = lrfVar;
        this.b = anenVar;
        this.c = armfVar;
        this.h = armfVar2;
        this.d = armfVar3;
        this.i = armfVar4;
        this.e = armfVar5;
        this.f = armfVar6;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [arwe, java.lang.Object] */
    public final akul A(alog alogVar, String str, boolean z) {
        akul c;
        yyt yytVar = (yyt) this.h.b();
        c = qjh.c(yytVar.b, arpj.a, arwf.a, new vck(yytVar, (arpe) null, 8));
        return c.i(new mhv(this, alogVar, str, 8), this.b).i(new led(this, z, 3), this.b);
    }

    public final boolean B(msh mshVar, boolean z) {
        msh l;
        if (z) {
            l = ((msk) this.i.b()).m();
        } else {
            l = ((msk) this.i.b()).l();
        }
        return l.equals(mshVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation] */
    @Override // defpackage.miw
    public final Conversation a(ConversationId conversationId, miv mivVar) {
        akrh e = aktp.e("EmergencySosConversationRepository#openConversation");
        try {
            d.s(conversationId instanceof EmergencySosConversationId);
            EmergencySosConversation k = this.g.k(((mlu) this.e.b()).a(((EmergencySosConversationId) conversationId).b, mivVar));
            qiu.f(((wsl) this.d.b()).a(), "Failed to update satellite session status.");
            e.close();
            return k;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.miw
    public final /* synthetic */ ConversationId b(mpi mpiVar) {
        return lgc.J();
    }

    @Override // defpackage.miw
    public final /* synthetic */ ConversationId c(byte[] bArr) {
        return lgc.K();
    }

    @Override // defpackage.miw
    public final ncq d(ConversationId conversationId) {
        throw new UnsupportedOperationException("Not implemented for Satellite");
    }

    @Override // defpackage.miw
    public final ncq e(int i, boolean z) {
        return ((mlu) this.e.b()).e(i, z);
    }

    @Override // defpackage.miw
    public final akul f(ConversationId conversationId, amfe amfeVar) {
        d.s(conversationId instanceof EmergencySosConversationId);
        return ((mlu) this.e.b()).f(((EmergencySosConversationId) conversationId).b, amfeVar);
    }

    @Override // defpackage.miw
    public final akul g(ConversationId conversationId) {
        return ((mlu) this.e.b()).g(((EmergencySosConversationId) conversationId).b);
    }

    @Override // defpackage.miw
    public final akul h(mqy mqyVar) {
        return aktp.af(new UnsupportedOperationException("Find conversation not supported for emergency sos conversations"));
    }

    @Override // defpackage.miw
    public final akul i(alog alogVar) {
        return aktp.af(new UnsupportedOperationException("Find conversation not supported for emergency sos conversations"));
    }

    @Override // defpackage.miw
    public final akul j() {
        int i = alog.d;
        return aktp.ag(alsx.a);
    }

    @Override // defpackage.miw
    public final akul k(alog alogVar, String str) {
        return l(Optional.empty(), alogVar, str);
    }

    @Override // defpackage.miw
    public final akul l(Optional optional, alog alogVar, String str) {
        akul i;
        akrh e = aktp.e("EmergencySosConversationRepository#getOrCreateConversation");
        try {
            if (alogVar.isEmpty()) {
                alvw i2 = a.i();
                i2.X(alwp.a, "BugleEmergencySOS");
                ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/api/messaging/conversation/emergencysos/EmergencySosConversationRepository", "getOrCreateConversation", 114, "EmergencySosConversationRepository.java")).q("Unable to getOrCreateConversation: Empty recipient list.");
                i = aktp.af(new IllegalArgumentException("Unable to getOrCreateConversation: Empty recipient list."));
            } else {
                boolean z = true;
                if (alogVar.size() != 1 || !((Recipient) alogVar.get(0)).f().B()) {
                    z = false;
                }
                d.t(z, "Only one Satellite recipient is supported.");
                alvw g = a.g();
                g.X(alwp.a, "BugleEmergencySOS");
                alvg alvgVar = (alvg) g;
                alvgVar.X(ydl.B, ((Recipient) alogVar.get(0)).f());
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/emergencysos/EmergencySosConversationRepository", "getOrCreateConversation", 125, "EmergencySosConversationRepository.java")).q("Processing getOrCreate for emergency conversation.");
                i = ((wsl) this.d.b()).a().i(new mhv(this, alogVar, str, 7), this.b);
            }
            e.close();
            return i;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.miw
    public final akul m(ConversationId conversationId, mnk mnkVar, Recipient recipient) {
        return aktp.af(new UnsupportedOperationException("incomingRichThemeUpdate not supported for emergency sos conversations"));
    }

    @Override // defpackage.miw
    public final akul n(ConversationId conversationId) {
        return aktp.af(new UnsupportedOperationException("Leave not supported for emergency sos conversation"));
    }

    @Override // defpackage.miw
    public final akul o(ConversationId conversationId, mnk mnkVar) {
        return aktp.af(new UnsupportedOperationException("outgoingRichThemeUpdate not supported for emergency sos conversations"));
    }

    @Override // defpackage.miw
    public final akul p(Recipient recipient) {
        return aktp.af(new UnsupportedOperationException("refreshAllConversationIconsForRecipient not supported for emergency sos conversations"));
    }

    @Override // defpackage.miw
    public final akul q(ConversationId conversationId, String str) {
        return aktp.af(new UnsupportedOperationException("Rename not supported for emergency sos conversations"));
    }

    @Override // defpackage.miw
    public final akul r(ConversationId conversationId, nfw nfwVar) {
        akrh e = aktp.e("EmergencySosConversationRepository#setActiveSelfIdentity");
        try {
            d.s(conversationId instanceof EmergencySosConversationId);
            akul r = ((mlu) this.e.b()).r(((EmergencySosConversationId) conversationId).b, nfwVar);
            e.close();
            return r;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.miw
    public final akul s(ConversationId conversationId, String str, String str2, mxf mxfVar) {
        return ((mlu) this.e.b()).s(((EmergencySosConversationId) conversationId).b, str, str2, mxfVar);
    }

    @Override // defpackage.miw
    public final akul t(ConversationId conversationId, mmy mmyVar) {
        return aktp.af(new UnsupportedOperationException("setParentalApprovalStatusLocally not supported for emergency sos conversations"));
    }

    @Override // defpackage.miw
    public final akul u(ConversationId conversationId, amfe amfeVar) {
        d.s(conversationId instanceof EmergencySosConversationId);
        return ((mlu) this.e.b()).u(((EmergencySosConversationId) conversationId).b, amfeVar);
    }

    @Override // defpackage.miw
    public final akul v(ConversationId conversationId) {
        return aktp.af(new UnsupportedOperationException("upgradeConversation not supported for emergency sos conversations"));
    }

    @Override // defpackage.miw
    public final akul w(ConversationId conversationId, amfe amfeVar) {
        akrh e = aktp.e("EmergencySosConversationRepository#deleteConversation");
        try {
            d.s(conversationId instanceof EmergencySosConversationId);
            akul w = ((mlu) this.e.b()).w(((EmergencySosConversationId) conversationId).b, amfeVar);
            e.close();
            return w;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.miw
    public final akul x(alog alogVar) {
        return aktp.af(new UnsupportedOperationException("markConversationsAsRead not supported for emergency sos conversations"));
    }

    @Override // defpackage.miw
    public final akul y(alog alogVar) {
        return aktp.af(new UnsupportedOperationException("markConversationsAsUnread not supported for emergency sos conversations"));
    }

    @Override // defpackage.mld
    public final ConversationId z(mpi mpiVar) {
        boolean z;
        mph b = mph.b(mpiVar.b);
        if (b == null) {
            b = mph.UNRECOGNIZED;
        }
        if (b == mph.SATELLITE) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        return new EmergencySosConversationId(ruy.b(mpiVar.c));
    }
}
