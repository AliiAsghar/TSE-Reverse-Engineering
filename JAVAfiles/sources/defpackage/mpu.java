package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpu implements mld, miw {
    public final arwe a;
    public final armf b;
    public final armf c;
    public final jat d;
    private final arwe e;

    public mpu(arwe arweVar, arwe arweVar2, jat jatVar, armf armfVar, armf armfVar2) {
        arweVar.getClass();
        arweVar2.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.a = arweVar;
        this.e = arweVar2;
        this.d = jatVar;
        this.b = armfVar;
        this.c = armfVar2;
    }

    @Override // defpackage.miw
    public final Conversation a(ConversationId conversationId, miv mivVar) {
        conversationId.getClass();
        mivVar.getClass();
        akrh e = aktp.e("RbmConversationRepository#openConversation");
        try {
            if (conversationId instanceof RbmConversationId) {
                RbmConversation A = this.d.A(((mlu) this.b.b()).C(((RbmConversationId) conversationId).b, mivVar, new mpt(0)));
                armd.i(e, null);
                return A;
            }
            throw new IllegalArgumentException("Failed requirement.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
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
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.miw
    public final ncq e(int i, boolean z) {
        return ((mlu) this.b.b()).e(i, z);
    }

    @Override // defpackage.miw
    public final akul f(ConversationId conversationId, amfe amfeVar) {
        amfeVar.getClass();
        if (conversationId instanceof RbmConversationId) {
            akul f = ((mlu) this.b.b()).f(((RbmConversationId) conversationId).b, amfeVar);
            f.getClass();
            return f;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.miw
    public final akul g(ConversationId conversationId) {
        conversationId.getClass();
        if (conversationId instanceof RbmConversationId) {
            akul g = ((mlu) this.b.b()).g(((RbmConversationId) conversationId).b);
            g.getClass();
            return g;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.miw
    public final akul h(mqy mqyVar) {
        akul c;
        alog alogVar = mqyVar.a;
        if (alogVar.size() == 1 && ((Recipient) alogVar.get(0)).f().A()) {
            c = qjh.c(this.e, arpj.a, arwf.a, new mlg(this, mqyVar, (arpe) null, 3));
            return c;
        }
        akul af = aktp.af(new IllegalArgumentException("Recipients don't contain exactly rbm bot"));
        af.getClass();
        return af;
    }

    @Override // defpackage.miw
    @armg
    public final akul i(alog alogVar) {
        akul c;
        alogVar.getClass();
        if (((alsx) alogVar).c == 1 && ((Recipient) alogVar.get(0)).f().A()) {
            c = qjh.c(this.e, arpj.a, arwf.a, new mlg(this, alogVar, (arpe) null, 2));
            return c;
        }
        akul af = aktp.af(new IllegalArgumentException("Recipients don't contain exactly rbm bot"));
        af.getClass();
        return af;
    }

    @Override // defpackage.miw
    public final akul j() {
        int i = alog.d;
        akul ag = aktp.ag(alsx.a);
        ag.getClass();
        return ag;
    }

    @Override // defpackage.miw
    public final akul k(alog alogVar, String str) {
        alogVar.getClass();
        return l(Optional.empty(), alogVar, str);
    }

    @Override // defpackage.miw
    public final akul l(Optional optional, alog alogVar, String str) {
        akul c;
        optional.getClass();
        alogVar.getClass();
        if (alogVar.size() == 1 && ((Recipient) alogVar.get(0)).f().A()) {
            c = qjh.c(this.e, arpj.a, arwf.a, new hak(this, optional, alogVar, str, (arpe) null, 16));
            return c;
        }
        akul af = aktp.af(new IllegalArgumentException("Recipients don't contain exactly rbm bot"));
        af.getClass();
        return af;
    }

    @Override // defpackage.miw
    public final akul m(ConversationId conversationId, mnk mnkVar, Recipient recipient) {
        recipient.getClass();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.miw
    public final akul n(ConversationId conversationId) {
        akul af = aktp.af(new UnsupportedOperationException("Leave not supported for rbm conversation"));
        af.getClass();
        return af;
    }

    @Override // defpackage.miw
    public final akul o(ConversationId conversationId, mnk mnkVar) {
        if (conversationId instanceof RbmConversationId) {
            akul o = ((mlu) this.b.b()).o(((RbmConversationId) conversationId).b, mnkVar);
            o.getClass();
            return o;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.miw
    public final akul p(Recipient recipient) {
        akul af = aktp.af(new UnsupportedOperationException("refreshAllConversationIconsForRecipient not supported for rbm conversation"));
        af.getClass();
        return af;
    }

    @Override // defpackage.miw
    public final akul q(ConversationId conversationId, String str) {
        str.getClass();
        akul af = aktp.af(new UnsupportedOperationException("Rename not supported for rbm conversation"));
        af.getClass();
        return af;
    }

    @Override // defpackage.miw
    public final akul r(ConversationId conversationId, nfw nfwVar) {
        conversationId.getClass();
        nfwVar.getClass();
        akrh e = aktp.e("RbmConversationRepository#setActiveSelfIdentity");
        try {
            if (conversationId instanceof RbmConversationId) {
                akul r = ((mlu) this.b.b()).r(((RbmConversationId) conversationId).b, nfwVar);
                r.getClass();
                armd.i(e, null);
                return r;
            }
            throw new IllegalArgumentException("Failed requirement.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.miw
    public final akul s(ConversationId conversationId, String str, String str2, mxf mxfVar) {
        conversationId.getClass();
        if (conversationId instanceof RbmConversationId) {
            return ((mlu) this.b.b()).s(((RbmConversationId) conversationId).b, str, str2, mxfVar);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.miw
    public final akul t(ConversationId conversationId, mmy mmyVar) {
        mmyVar.getClass();
        akul af = aktp.af(new UnsupportedOperationException("setParentalApprovalStatusLocally not supported for rbm conversation"));
        af.getClass();
        return af;
    }

    @Override // defpackage.miw
    public final akul u(ConversationId conversationId, amfe amfeVar) {
        amfeVar.getClass();
        if (conversationId instanceof RbmConversationId) {
            akul u = ((mlu) this.b.b()).u(((RbmConversationId) conversationId).b, amfeVar);
            u.getClass();
            return u;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.miw
    public final akul v(ConversationId conversationId) {
        conversationId.getClass();
        akul af = aktp.af(new UnsupportedOperationException("upgradeConversation not supported for rbm conversation"));
        af.getClass();
        return af;
    }

    @Override // defpackage.miw
    public final akul w(ConversationId conversationId, amfe amfeVar) {
        amfeVar.getClass();
        akrh e = aktp.e("RbmConversationRepository#deleteConversation");
        try {
            if (conversationId instanceof RbmConversationId) {
                akul w = ((mlu) this.b.b()).w(((RbmConversationId) conversationId).b, amfeVar);
                w.getClass();
                armd.i(e, null);
                return w;
            }
            throw new IllegalArgumentException("Failed requirement.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.miw
    public final akul x(alog alogVar) {
        alogVar.getClass();
        mlu mluVar = (mlu) this.b.b();
        ArrayList arrayList = new ArrayList(aqjn.J(alogVar, 10));
        Iterator<E> it = alogVar.iterator();
        while (it.hasNext()) {
            ConversationId conversationId = (ConversationId) it.next();
            if (conversationId instanceof RbmConversationId) {
                arrayList.add(((RbmConversationId) conversationId).b);
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        akul x = mluVar.x(alzz.aZ(arrayList));
        x.getClass();
        return x;
    }

    @Override // defpackage.miw
    public final akul y(alog alogVar) {
        alogVar.getClass();
        mlu mluVar = (mlu) this.b.b();
        ArrayList arrayList = new ArrayList(aqjn.J(alogVar, 10));
        Iterator<E> it = alogVar.iterator();
        while (it.hasNext()) {
            ConversationId conversationId = (ConversationId) it.next();
            if (conversationId instanceof RbmConversationId) {
                arrayList.add(((RbmConversationId) conversationId).b);
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        return mluVar.y(alzz.aZ(arrayList));
    }

    @Override // defpackage.mld
    public final ConversationId z(mpi mpiVar) {
        mpiVar.getClass();
        mph b = mph.b(mpiVar.b);
        if (b == null) {
            b = mph.UNRECOGNIZED;
        }
        if (b == mph.RBM) {
            return new RbmConversationId(ruy.b(mpiVar.c));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
