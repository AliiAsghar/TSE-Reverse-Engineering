package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qta {
    /* JADX WARN: Multi-variable type inference failed */
    public static final qso a(String str, qsn qsnVar) {
        qsx qsxVar = new qsx(qsz.a);
        qsxVar.c(new mut(str, qsnVar, 17));
        alog t = qsxVar.b().t();
        t.getClass();
        ArrayList arrayList = new ArrayList(aqjn.J(t, 10));
        alur it = t.iterator();
        while (it.hasNext()) {
            qst qstVar = (qst) it.next();
            qstVar.getClass();
            arrayList.add(c(qstVar));
        }
        return (qso) aqjn.ah(arrayList);
    }

    public static final qst b(qso qsoVar) {
        String[] strArr = qsz.a;
        int i = qqe.a;
        tmc tmcVar = new tmc((char[]) null, (byte[]) null);
        tmcVar.l(qsoVar.a);
        tmcVar.j(qsoVar.c);
        tmcVar.k(qsoVar.b);
        return tmcVar.i();
    }

    public static final qso c(qst qstVar) {
        qstVar.ao(0, "token");
        qss qssVar = qstVar.a;
        qssVar.getClass();
        qstVar.ao(2, "address_type");
        qsn qsnVar = qstVar.c;
        qsnVar.getClass();
        qstVar.ao(1, "address");
        String str = qstVar.b;
        str.getClass();
        return new qso(qssVar, qsnVar, str);
    }

    public static final qss d(String str) {
        if (str != null) {
            UUID fromString = UUID.fromString(str);
            fromString.getClass();
            return new qss(fromString);
        }
        return null;
    }

    public static final String e(qss qssVar) {
        if (qssVar != null) {
            String uuid = ((UUID) qssVar.a).toString();
            uuid.getClass();
            return uuid;
        }
        return null;
    }

    public static final qro f(armf armfVar) {
        if (((int) ((Number) armfVar.b()).longValue()) == -1) {
            return new qro(Integer.MAX_VALUE);
        }
        return new qro((int) ((Number) armfVar.b()).longValue());
    }

    public static final akul g(ConversationIdType conversationIdType, boolean z, amra amraVar, boolean z2, Optional optional, alog alogVar, qrj qrjVar) {
        if (!z2) {
            return aktp.ag(null);
        }
        return qrjVar.a(conversationIdType, z, optional, alogVar, amraVar);
    }

    public static smr h(qpj qpjVar, msh mshVar, armf armfVar) {
        return qpjVar.b(albo.ag(mshVar.m()), armfVar);
    }

    public static smr i(qpj qpjVar, Collection collection, armf armfVar) {
        Stream map = Collection.EL.stream(collection).map(new qcq(17));
        int i = alog.d;
        return qpjVar.d((alog) map.collect(alls.a), armfVar);
    }

    public static akul j(qpj qpjVar, msh mshVar) {
        return qpjVar.f(albo.ag(mshVar.m()));
    }

    public static akul k(qpj qpjVar, java.util.Collection collection) {
        Stream map = Collection.EL.stream(collection).map(new qcq(18));
        int i = alog.d;
        return qpjVar.h((alog) map.collect(alls.a));
    }

    public static akul l(qpj qpjVar, msh mshVar, armf armfVar) {
        return qpjVar.k(albo.ag(mshVar.m()), armfVar);
    }

    public static Optional m(qpj qpjVar, msh mshVar) {
        return qpjVar.m(albo.ag(mshVar.m()));
    }

    public static Optional n(qpj qpjVar, msh mshVar) {
        return qpjVar.o(albo.ag(mshVar.m()));
    }

    public static final IncomingDraft o(Bundle bundle) {
        return (IncomingDraft) ef.b(bundle, "incoming_draft", IncomingDraft.class);
    }

    public static final IncomingDraft p(eog eogVar) {
        return (IncomingDraft) eogVar.a("incoming_draft");
    }

    public static final ComposeRowState q(Bundle bundle) {
        return (ComposeRowState) ef.b(bundle, "compose_row_state", ComposeRowState.class);
    }

    public static boolean r() {
        return anfi.a("bugle.unicode_wrap_user_strings", "bugle");
    }
}
