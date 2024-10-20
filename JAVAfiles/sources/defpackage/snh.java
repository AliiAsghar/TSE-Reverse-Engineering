package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class snh extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(Function... functionArr) {
        Object apply;
        snh[] snhVarArr = new snh[functionArr.length];
        for (int i = 0; i < functionArr.length; i++) {
            apply = functionArr[i].apply(new snh());
            snhVarArr[i] = (snh) apply;
        }
        V(snhVarArr);
    }

    public final void c(tqc tqcVar) {
        int i;
        if (tqcVar == null) {
            i = 0;
        } else {
            i = tqcVar.h;
        }
        U(new agoi("conversations.archive_status", 1, Integer.valueOf(i)));
    }

    public final void d(tqc tqcVar) {
        int i;
        if (tqcVar == null) {
            i = 0;
        } else {
            i = tqcVar.h;
        }
        U(new agoi("conversations.archive_status", 2, Integer.valueOf(i)));
    }

    public final void e(int i) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 10007) {
            agnc.t("conv_type", intValue);
        }
        U(new agoi("conversations.conv_type", 1, Integer.valueOf(i)));
    }

    public final void f(String str) {
        U(new agmd("conversations.current_self_id", 1, String.valueOf(str)));
    }

    public final void g(int i) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 29060) {
            agnc.t("etouffee_default", intValue);
        }
        U(new agoi("conversations.etouffee_default", 1, Integer.valueOf(i)));
    }

    public final void h() {
        U(new agmd("conversations.draft_preview_uri", 11, "android.resource%"));
    }

    public final void i(boolean z) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 59210) {
            agnc.t("has_been_e2ee", intValue);
        }
        U(new agoi("conversations.has_been_e2ee", 1, Integer.valueOf(z ? 1 : 0)));
    }

    public final void j(ConversationIdType conversationIdType) {
        U(new agmd("conversations._id", 1, Long.valueOf(ruy.a(conversationIdType))));
    }

    public final void k(agpj agpjVar) {
        U(new agme("conversations._id", 3, agpjVar));
    }

    public final void l(Iterable iterable) {
        alob alobVar = new alob();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            alobVar.h(String.valueOf(ruy.a((ConversationIdType) it.next())));
        }
        U(new agmf("conversations._id", 3, X(alobVar.g()), true));
    }

    public final void m(int i) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 10006) {
            agnc.t("join_state", intValue);
        }
        U(new agoi("conversations.join_state", 1, Integer.valueOf(i)));
    }

    public final void n(int i) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 10006) {
            agnc.t("join_state", intValue);
        }
        U(new agoi("conversations.join_state", 2, Integer.valueOf(i)));
    }

    public final void o() {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 59220) {
            agnc.t("marked_as_unread", intValue);
        }
        U(new agoi("conversations.marked_as_unread", 1, 1));
    }

    public final void p() {
        U(new agoi("conversations.participant_count", 1, 1));
    }

    public final void q(int i) {
        U(new agoi("conversations.participant_count", 10, Integer.valueOf(i)));
    }

    public final void r(String str) {
        U(new agmd("conversations.participant_normalized_destination", 1, String.valueOf(str)));
    }

    public final void s(String str) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 40050) {
            agnc.t("rcs_conference_uri", intValue);
        }
        U(new agmd("conversations.rcs_conference_uri", 1, String.valueOf(str)));
    }

    public final void t() {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 40050) {
            agnc.t("rcs_conference_uri", intValue);
        }
        U(new agmd("conversations.rcs_conference_uri", 11, "sip:%"));
    }

    public final void u(String str) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 40050) {
            agnc.t("rcs_group_id", intValue);
        }
        U(new agmd("conversations.rcs_group_id", 1, String.valueOf(str)));
    }

    public final void v() {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 40050) {
            agnc.t("rcs_group_id", intValue);
        }
        U(new agmg("conversations.rcs_group_id", 5));
    }

    public final void w(long j) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 10000) {
            agnc.t("rcs_session_id", intValue);
        }
        U(new agoi("conversations.rcs_session_id", 1, Long.valueOf(j)));
    }

    public final void x() {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 10000) {
            agnc.t("rcs_session_id", intValue);
        }
        U(new agoi("conversations.rcs_session_id", 2, -1L));
    }

    public final void y(xhv xhvVar) {
        U(new agmd("conversations.sms_thread_id", 1, Long.valueOf(yyb.cE(xhvVar))));
    }

    public final void z(int i) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 8500) {
            agnc.t("source_type", intValue);
        }
        U(new agoi("conversations.source_type", 1, Integer.valueOf(i)));
    }
}
