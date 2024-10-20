package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sng extends agps {
    public sng() {
        super("conversations");
    }

    public final void A(long j) {
        this.a.put("participant_contact_id", Long.valueOf(j));
    }

    public final void B(int i) {
        this.a.put("participant_count", Integer.valueOf(i));
    }

    public final void C(String str) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 15010) {
            agnc.t("participant_display_destination", intValue2);
        }
        if (intValue >= 15010) {
            agnc.r(this.a, "participant_display_destination", yta.a(str));
        }
    }

    public final void D(String str) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 8500) {
            agnc.t("participant_id_list", intValue2);
        }
        if (intValue >= 8500) {
            agnc.r(this.a, "participant_id_list", str);
        }
    }

    public final void E(String str) {
        agnc.r(this.a, "participant_lookup_key", str);
    }

    public final void F(String str) {
        agnc.r(this.a, "participant_normalized_destination", str);
    }

    public final void G(String str) {
        agnc.r(this.a, "preview_content_type", str);
    }

    public final void H(Uri uri) {
        if (uri == null) {
            this.a.putNull("preview_uri");
        } else {
            this.a.put("preview_uri", uri.toString());
        }
    }

    public final void I(String str) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 40050) {
            agnc.t("rcs_conference_uri", intValue2);
        }
        if (intValue >= 40050) {
            agnc.r(this.a, "rcs_conference_uri", yzc.h(str));
        }
    }

    public final void J(vtm vtmVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 49020) {
            agnc.t("rcs_group_capabilities", intValue2);
        }
        if (intValue >= 49020) {
            if (vtmVar == null) {
                this.a.putNull("rcs_group_capabilities");
            } else {
                this.a.put("rcs_group_capabilities", Long.valueOf(vtmVar.a));
            }
        }
    }

    public final void K(String str) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 40050) {
            agnc.t("rcs_group_id", intValue2);
        }
        if (intValue >= 40050) {
            agnc.r(this.a, "rcs_group_id", str);
        }
    }

    public final void L(Optional optional) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 58910) {
            agnc.t("rcs_group_last_sync_timestamp", intValue2);
        }
        if (intValue >= 58910) {
            this.a.put("rcs_group_last_sync_timestamp", Long.valueOf(uxi.f(optional)));
        }
    }

    public final void M(String str) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 58540) {
            agnc.t("rcs_group_self_msisdn", intValue2);
        }
        if (intValue >= 58540) {
            agnc.r(this.a, "rcs_group_self_msisdn", str);
        }
    }

    public final void N(long j) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 10000) {
            agnc.t("rcs_session_id", intValue2);
        }
        if (intValue >= 10000) {
            this.a.put("rcs_session_id", Long.valueOf(j));
        }
    }

    public final void O(Optional optional) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 58750) {
            agnc.t("recipient_offline_timestamp_ms", intValue2);
        }
        if (intValue >= 58750) {
            this.a.put("recipient_offline_timestamp_ms", Long.valueOf(uxi.f(optional)));
        }
    }

    public final void P(int i) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 10016) {
            agnc.t("send_mode", intValue2);
        }
        if (intValue >= 10016) {
            this.a.put("send_mode", Integer.valueOf(i));
        }
    }

    public final void Q(boolean z) {
        this.a.put("show_draft", Boolean.valueOf(z));
    }

    public final void R(xhv xhvVar) {
        if (xhvVar == null) {
            this.a.putNull("sms_thread_id");
        } else {
            this.a.put("sms_thread_id", Long.valueOf(yyb.cE(xhvVar)));
        }
    }

    public final void S(String str) {
        agnc.r(this.a, "snippet_text", yta.a(str));
    }

    public final void T(long j) {
        this.a.put("sort_timestamp", Long.valueOf(j));
    }

    public final void U(boolean z) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 23000) {
            agnc.t("spam_warning_dismiss_status", intValue2);
        }
        if (intValue >= 23000) {
            this.a.put("spam_warning_dismiss_status", Boolean.valueOf(z));
        }
    }

    public final void V(String str) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 59760) {
            agnc.t("subtitle", intValue2);
        }
        if (intValue >= 59760) {
            agnc.r(this.a, "subtitle", str);
        }
    }

    public final void W(snh snhVar) {
        Z(new agpw(snhVar));
    }

    public final void X(Function function) {
        Object apply;
        apply = function.apply(new snh());
        Z(new agpw((snh) apply));
    }

    public final tqh b() {
        ContentValues contentValues = this.a;
        tqh[] values = tqh.values();
        int intValue = contentValues.getAsInteger("name_is_automatic").intValue();
        if (intValue < values.length) {
            return values[intValue];
        }
        throw new IllegalArgumentException();
    }

    public final String c() {
        return this.a.getAsString("name");
    }

    public final String d() {
        return this.a.getAsString("participant_lookup_key");
    }

    public final boolean e(ConversationIdType conversationIdType) {
        snh snhVar = new snh();
        snhVar.j(conversationIdType);
        return ae(new agpw(snhVar), "conversations-buildAndUpdateForId");
    }

    @Override // defpackage.agps
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final agpr a() {
        ac();
        String str = this.c;
        agpt agptVar = this.e;
        return new agpr(str, this.a, this.b, this.d.g(), agptVar.a());
    }

    public final void g(String str) {
        snh snhVar = new snh();
        snhVar.f(str);
        Y(new agpw(snhVar), "conversations-buildAndUpdateForCurrentSelfId");
    }

    public final void h(tqc tqcVar) {
        if (tqcVar == null) {
            this.a.putNull("archive_status");
        } else {
            this.a.put("archive_status", Integer.valueOf(tqcVar.h));
        }
    }

    public final void i(boolean z) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 49060) {
            agnc.t("awaiting_reverse_sync", intValue2);
        }
        if (intValue >= 49060) {
            this.a.put("awaiting_reverse_sync", Boolean.valueOf(z));
        }
    }

    public final void j() {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 10007) {
            agnc.t("conv_type", intValue2);
        }
        if (intValue >= 10007) {
            this.a.put("conv_type", (Integer) 2);
        }
    }

    public final void k(String str) {
        agnc.r(this.a, "current_self_id", str);
    }

    public final void l(long j) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 29020) {
            agnc.t("delete_timestamp", intValue2);
        }
        if (intValue >= 29020) {
            this.a.put("delete_timestamp", Long.valueOf(j));
        }
    }

    public final void m(int i) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 29060) {
            agnc.t("etouffee_default", intValue2);
        }
        if (intValue >= 29060) {
            this.a.put("etouffee_default", Integer.valueOf(i));
        }
    }

    public final void n(String str) {
        agnc.r(this.a, "draft_preview_content_type", str);
    }

    public final void o(Uri uri) {
        if (uri == null) {
            this.a.putNull("draft_preview_uri");
        } else {
            this.a.put("draft_preview_uri", uri.toString());
        }
    }

    public final void p() {
        this.a.putNull("draft_preview_uri");
    }

    public final void q(String str) {
        agnc.r(this.a, "draft_snippet_text", yta.a(str));
    }

    public final void r(String str) {
        agnc.r(this.a, "draft_subject_text", yta.a(str));
    }

    public final void s(qpd qpdVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 58140) {
            agnc.t("error_state", intValue2);
        }
        if (intValue >= 58140) {
            if (qpdVar == null) {
                this.a.putNull("error_state");
            } else {
                this.a.put("error_state", Integer.valueOf(qpdVar.a()));
            }
        }
    }

    public final void t() {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 59210) {
            agnc.t("has_been_e2ee", intValue2);
        }
        if (intValue >= 59210) {
            this.a.put("has_been_e2ee", (Boolean) true);
        }
    }

    public final void u(String str) {
        agnc.r(this.a, "icon", str);
    }

    public final void v(int i) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 10006) {
            agnc.t("join_state", intValue2);
        }
        if (intValue >= 10006) {
            this.a.put("join_state", Integer.valueOf(i));
        }
    }

    public final void w(vvh vvhVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 60050) {
            agnc.t("mms_group_upgrade_status", intValue2);
        }
        if (intValue >= 60050) {
            if (vvhVar == null) {
                this.a.putNull("mms_group_upgrade_status");
            } else {
                this.a.put("mms_group_upgrade_status", Integer.valueOf(vvhVar.ordinal()));
            }
        }
    }

    public final void x(String str) {
        agnc.r(this.a, "name", ysw.a(str));
    }

    public final void y(tqh tqhVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 10012) {
            agnc.t("name_is_automatic", intValue2);
        }
        if (intValue >= 10012) {
            if (tqhVar == null) {
                this.a.putNull("name_is_automatic");
            } else {
                this.a.put("name_is_automatic", Integer.valueOf(tqhVar.ordinal()));
            }
        }
    }

    public final void z(int i) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 26020) {
            agnc.t("open_count", intValue2);
        }
        if (intValue >= 26020) {
            this.a.put("open_count", Integer.valueOf(i));
        }
    }
}
