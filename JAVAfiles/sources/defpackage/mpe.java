package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpe implements mld {
    public final armf a;
    public final lrf b;
    private final anen c;

    public mpe(anen anenVar, lrf lrfVar, armf armfVar) {
        this.c = anenVar;
        this.b = lrfVar;
        this.a = armfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation] */
    @Override // defpackage.miw
    public final Conversation a(ConversationId conversationId, miv mivVar) {
        akrh e = aktp.e("PenpalBotConversationRepository#openConversation");
        try {
            d.s(conversationId instanceof PenpalBotConversationId);
            PenpalBotConversation j = this.b.j(((mlu) this.a.b()).a(((PenpalBotConversationId) conversationId).b, mivVar), (miw) this.a.b());
            e.close();
            return j;
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
        d.s(false);
        return ((mlu) this.a.b()).d(((PenpalBotConversationId) conversationId).b);
    }

    @Override // defpackage.miw
    public final ncq e(int i, boolean z) {
        return ((mlu) this.a.b()).e(i, z);
    }

    @Override // defpackage.miw
    public final akul f(ConversationId conversationId, amfe amfeVar) {
        d.s(conversationId instanceof PenpalBotConversationId);
        return ((mlu) this.a.b()).f(((PenpalBotConversationId) conversationId).b, amfeVar);
    }

    @Override // defpackage.miw
    public final akul g(ConversationId conversationId) {
        d.s(conversationId instanceof PenpalBotConversationId);
        return ((mlu) this.a.b()).g(((PenpalBotConversationId) conversationId).b);
    }

    @Override // defpackage.miw
    public final akul h(mqy mqyVar) {
        alog alogVar = mqyVar.a;
        if (alogVar.size() == 1 && ((Recipient) alogVar.get(0)).f().z()) {
            return ((mlu) this.a.b()).h(mqyVar).h(new mme(4), this.c);
        }
        return aktp.af(new IllegalArgumentException("Recipients don't contain exactly penpal bot"));
    }

    @Override // defpackage.miw
    public final akul i(alog alogVar) {
        if (((alsx) alogVar).c == 1 && ((Recipient) alogVar.get(0)).f().z()) {
            return ((mlu) this.a.b()).i(alogVar).h(new mme(3), this.c);
        }
        return aktp.af(new IllegalArgumentException("Recipients don't contain exactly penpal bot"));
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
        if (alogVar.size() == 1 && ((Recipient) alogVar.get(0)).f().z()) {
            return ((mlu) this.a.b()).l(optional, alogVar, str).h(new mds(this, 14), this.c);
        }
        return aktp.af(new IllegalArgumentException("Recipients don't contain exactly penpal bot"));
    }

    @Override // defpackage.miw
    public final akul m(ConversationId conversationId, mnk mnkVar, Recipient recipient) {
        d.s(false);
        return ((mlu) this.a.b()).m(((PenpalBotConversationId) conversationId).b, mnkVar, recipient);
    }

    @Override // defpackage.miw
    public final akul n(ConversationId conversationId) {
        return aktp.af(new UnsupportedOperationException("Leave not supported for penpal bot conversation"));
    }

    @Override // defpackage.miw
    public final akul o(ConversationId conversationId, mnk mnkVar) {
        d.s(conversationId instanceof PenpalBotConversationId);
        return ((mlu) this.a.b()).o(((PenpalBotConversationId) conversationId).b, mnkVar);
    }

    @Override // defpackage.miw
    public final akul p(Recipient recipient) {
        return aktp.af(new UnsupportedOperationException("refreshAllConversationIconsForRecipient not supported for penpal bot conversation"));
    }

    @Override // defpackage.miw
    public final akul q(ConversationId conversationId, String str) {
        return aktp.af(new UnsupportedOperationException("Rename not supported for penpal conversation"));
    }

    @Override // defpackage.miw
    public final akul r(ConversationId conversationId, nfw nfwVar) {
        akrh e = aktp.e("PenpalBotConversationRepository#setActiveSelfIdentity");
        try {
            d.s(conversationId instanceof PenpalBotConversationId);
            akul r = ((mlu) this.a.b()).r(((PenpalBotConversationId) conversationId).b, nfwVar);
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
        d.s(conversationId instanceof PenpalBotConversationId);
        return ((mlu) this.a.b()).s(((PenpalBotConversationId) conversationId).b, str, str2, mxfVar);
    }

    @Override // defpackage.miw
    public final akul t(ConversationId conversationId, mmy mmyVar) {
        return aktp.af(new UnsupportedOperationException("setParentalApprovalStatusLocally not supported for penpal bot conversation"));
    }

    @Override // defpackage.miw
    public final akul u(ConversationId conversationId, amfe amfeVar) {
        d.s(conversationId instanceof PenpalBotConversationId);
        return ((mlu) this.a.b()).u(((PenpalBotConversationId) conversationId).b, amfeVar);
    }

    @Override // defpackage.miw
    public final akul v(ConversationId conversationId) {
        return aktp.af(new UnsupportedOperationException("upgradeConversation not supported for penpal bot conversation"));
    }

    @Override // defpackage.miw
    public final akul w(ConversationId conversationId, amfe amfeVar) {
        akrh e = aktp.e("PenpalBotConversationRepository#deleteConversation");
        try {
            d.s(conversationId instanceof PenpalBotConversationId);
            akul w = ((mlu) this.a.b()).w(((PenpalBotConversationId) conversationId).b, amfeVar);
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
        mlu mluVar = (mlu) this.a.b();
        Stream map = Collection.EL.stream(alogVar).map(new mqm(1));
        int i = alog.d;
        return mluVar.x((alog) map.collect(alls.a));
    }

    @Override // defpackage.miw
    public final akul y(alog alogVar) {
        mlu mluVar = (mlu) this.a.b();
        Stream map = Collection.EL.stream(alogVar).map(new mmv(19));
        int i = alog.d;
        return mluVar.y((alog) map.collect(alls.a));
    }

    @Override // defpackage.mld
    public final ConversationId z(mpi mpiVar) {
        boolean z;
        mph b = mph.b(mpiVar.b);
        if (b == null) {
            b = mph.UNRECOGNIZED;
        }
        if (b == mph.PENPAL_BOT) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        return new PenpalBotConversationId(ruy.b(mpiVar.c));
    }
}
