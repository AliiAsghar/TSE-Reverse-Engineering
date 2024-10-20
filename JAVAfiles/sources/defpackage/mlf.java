package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mlf implements miw {
    private final Map a;
    private final armf b;
    private final armf c;
    private final armf d;

    public mlf(Map map, armf armfVar, armf armfVar2, armf armfVar3) {
        this.a = map;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
    }

    private final akul A(BiFunction biFunction, alog alogVar) {
        Stream stream = Collection.EL.stream(alogVar);
        mjz mjzVar = new mjz(this, 4);
        mcw mcwVar = new mcw(10);
        int i = alog.d;
        return aktp.ao((Iterable) Collection.EL.stream(((HashMap) stream.collect(Collectors.groupingBy(mjzVar, mcwVar, alls.a))).entrySet()).map(new mjz(biFunction, 5)).collect(alls.a)).h(new kli(9), andi.a);
    }

    @Override // defpackage.miw
    public final Conversation a(ConversationId conversationId, miv mivVar) {
        return z(conversationId).a(conversationId, mivVar);
    }

    @Override // defpackage.miw
    public final ConversationId b(mpi mpiVar) {
        boolean z;
        mph b = mph.b(mpiVar.b);
        if (b == null) {
            b = mph.UNRECOGNIZED;
        }
        if (b != mph.UNKNOWN) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        Map map = this.a;
        mph b2 = mph.b(mpiVar.b);
        if (b2 == null) {
            b2 = mph.UNRECOGNIZED;
        }
        mld mldVar = (mld) map.get(b2);
        mldVar.getClass();
        return mldVar.z(mpiVar);
    }

    @Override // defpackage.miw
    public final ConversationId c(byte[] bArr) {
        try {
            mpi mpiVar = (mpi) apag.parseFrom(mpi.a, bArr, aozs.a());
            mph b = mph.b(mpiVar.b);
            if (b == null) {
                b = mph.UNRECOGNIZED;
            }
            if (b == mph.UNKNOWN) {
                return null;
            }
            return b(mpiVar);
        } catch (apba unused) {
            return null;
        }
    }

    @Override // defpackage.miw
    public final ncq d(ConversationId conversationId) {
        return z(conversationId).d(conversationId);
    }

    @Override // defpackage.miw
    public final ncq e(int i, boolean z) {
        mld mldVar = (mld) this.a.get(mph.BUGLE);
        mldVar.getClass();
        return mldVar.e(i, z);
    }

    @Override // defpackage.miw
    public final akul f(ConversationId conversationId, amfe amfeVar) {
        return z(conversationId).f(conversationId, amfeVar);
    }

    @Override // defpackage.miw
    public final akul g(ConversationId conversationId) {
        return z(conversationId).g(conversationId);
    }

    @Override // defpackage.miw
    public final akul h(mqy mqyVar) {
        mld mldVar = (mld) this.a.get(mph.BUGLE);
        mldVar.getClass();
        return mldVar.h(mqyVar);
    }

    @Override // defpackage.miw
    public final akul i(alog alogVar) {
        mld mldVar = (mld) this.a.get(mph.BUGLE);
        mldVar.getClass();
        return mldVar.i(alogVar);
    }

    @Override // defpackage.miw
    public final akul j() {
        Stream map = Collection.EL.stream(((alor) this.a).values()).map(new mfk(19));
        int i = alog.d;
        return aktp.ad((alog) map.collect(alls.a)).h(new mdr(18), andi.a);
    }

    @Override // defpackage.miw
    public final akul k(alog alogVar, String str) {
        if (((orj) this.b.b()).a() && alogVar.size() == 1 && ((Recipient) alogVar.get(0)).f().B()) {
            mld mldVar = (mld) this.a.get(mph.SATELLITE);
            mldVar.getClass();
            return mldVar.k(alogVar, str);
        }
        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue()) {
        }
        if (((obm) this.d.b()).a() && alogVar.size() == 1 && ((Recipient) alogVar.get(0)).f().A()) {
            mld mldVar2 = (mld) this.a.get(mph.RBM);
            mldVar2.getClass();
            return mldVar2.k(alogVar, str);
        }
        mld mldVar3 = (mld) this.a.get(mph.BUGLE);
        mldVar3.getClass();
        return mldVar3.k(alogVar, str);
    }

    @Override // defpackage.miw
    public final akul l(Optional optional, alog alogVar, String str) {
        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue()) {
        }
        mld mldVar = (mld) this.a.get(mph.BUGLE);
        mldVar.getClass();
        return mldVar.l(optional, alogVar, str);
    }

    @Override // defpackage.miw
    public final akul m(ConversationId conversationId, mnk mnkVar, Recipient recipient) {
        return z(conversationId).m(conversationId, mnkVar, recipient);
    }

    @Override // defpackage.miw
    public final akul n(ConversationId conversationId) {
        return z(conversationId).n(conversationId);
    }

    @Override // defpackage.miw
    public final akul o(ConversationId conversationId, mnk mnkVar) {
        return z(conversationId).o(conversationId, mnkVar);
    }

    @Override // defpackage.miw
    public final akul p(Recipient recipient) {
        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue()) {
        }
        if (((obm) this.d.b()).a() && recipient.f().A()) {
            return aktp.ag(false);
        }
        mld mldVar = (mld) this.a.get(mph.BUGLE);
        mldVar.getClass();
        return mldVar.p(recipient);
    }

    @Override // defpackage.miw
    public final akul q(ConversationId conversationId, String str) {
        return z(conversationId).q(conversationId, str);
    }

    @Override // defpackage.miw
    public final akul r(ConversationId conversationId, nfw nfwVar) {
        return z(conversationId).r(conversationId, nfwVar);
    }

    @Override // defpackage.miw
    public final akul s(ConversationId conversationId, String str, String str2, mxf mxfVar) {
        return z(conversationId).s(conversationId, str, str2, mxfVar);
    }

    @Override // defpackage.miw
    public final akul t(ConversationId conversationId, mmy mmyVar) {
        return z(conversationId).t(conversationId, mmyVar);
    }

    @Override // defpackage.miw
    public final akul u(ConversationId conversationId, amfe amfeVar) {
        return z(conversationId).u(conversationId, amfeVar);
    }

    @Override // defpackage.miw
    public final akul v(ConversationId conversationId) {
        return z(conversationId).v(conversationId);
    }

    @Override // defpackage.miw
    public final akul w(ConversationId conversationId, amfe amfeVar) {
        return z(conversationId).w(conversationId, amfeVar);
    }

    @Override // defpackage.miw
    public final akul x(alog alogVar) {
        return A(new mle(0), alogVar);
    }

    @Override // defpackage.miw
    public final akul y(alog alogVar) {
        return A(new mle(1), alogVar);
    }

    public final mld z(ConversationId conversationId) {
        boolean z;
        if (conversationId != InvalidConversationId.a) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        mld mldVar = (mld) this.a.get(conversationId.a());
        mldVar.getClass();
        return mldVar;
    }
}
