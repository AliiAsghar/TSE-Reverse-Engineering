package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.time.Instant;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sya extends agps {
    public sya() {
        super("messages");
    }

    public final void A(int i) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 58040) {
            agnc.t("result_code", intValue2);
        }
        if (intValue >= 58040) {
            this.a.put("result_code", Integer.valueOf(i));
        }
    }

    public final void B(long j) {
        this.a.put("retry_start_timestamp", Long.valueOf(j));
    }

    public final void C(ruz ruzVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 59490) {
            agnc.t("satellite_datagram_id", intValue2);
        }
        if (intValue >= 59490) {
            if (ruzVar.equals(ruz.a)) {
                this.a.putNull("satellite_datagram_id");
            } else {
                this.a.put("satellite_datagram_id", ruz.d(ruzVar));
            }
        }
    }

    public final void D(String str) {
        agnc.r(this.a, "self_id", str);
    }

    public final void E(long j) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 35030) {
            agnc.t("send_counter", intValue2);
        }
        if (intValue >= 35030) {
            this.a.put("send_counter", Long.valueOf(j));
        }
    }

    public final void F(String str) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 54040) {
            agnc.t("sender_send_destination", intValue2);
        }
        if (intValue >= 54040) {
            agnc.r(this.a, "sender_send_destination", str);
        }
    }

    public final void G(long j) {
        this.a.put("sent_timestamp", Long.valueOf(j));
    }

    public final void H(int i) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 9000) {
            agnc.t("sms_error_code", intValue2);
        }
        if (intValue >= 9000) {
            this.a.put("sms_error_code", Integer.valueOf(i));
        }
    }

    public final void I(String str) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 9000) {
            agnc.t("sms_error_desc_map_name", intValue2);
        }
        if (intValue >= 9000) {
            agnc.r(this.a, "sms_error_desc_map_name", str);
        }
    }

    public final void J(long j) {
        this.a.put("sms_message_size", Long.valueOf(j));
    }

    public final void K(Uri uri) {
        if (uri == null) {
            this.a.putNull("sms_message_uri");
        } else {
            this.a.put("sms_message_uri", uri.toString());
        }
    }

    public final void L(int i) {
        this.a.put("message_status", Integer.valueOf(i));
    }

    public final void M(tqr tqrVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 29090) {
            agnc.t(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, intValue2);
        }
        if (intValue >= 29090) {
            if (tqrVar == null) {
                this.a.putNull(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
            } else {
                this.a.put(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, Integer.valueOf(tqrVar.ordinal()));
            }
        }
    }

    public final void N(tqu tquVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 59310) {
            agnc.t("xms_transport", intValue2);
        }
        if (intValue >= 59310) {
            if (tquVar == null) {
                this.a.putNull("xms_transport");
            } else {
                this.a.put("xms_transport", Integer.valueOf(tquVar.ordinal()));
            }
        }
    }

    public final void O(syc sycVar) {
        Z(new syb(sycVar));
    }

    public final void P(Function function) {
        Object apply;
        apply = function.apply(new syc());
        Z(new syb((syc) apply));
    }

    public final int b() {
        return this.a.getAsInteger("message_status").intValue();
    }

    public final long c() {
        return this.a.getAsLong("received_timestamp").longValue();
    }

    @Override // defpackage.agps
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final sxz a() {
        ac();
        return new sxz(this.c, this.a, this.b, this.d.g(), this.e.a());
    }

    public final boolean e(MessageIdType messageIdType) {
        syc sycVar = new syc();
        sycVar.i(messageIdType);
        return ae(new syb(sycVar), "messages-buildAndUpdateForId");
    }

    public final void f(int i) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 58230) {
            agnc.t("auto_retry_counter", intValue2);
        }
        if (intValue >= 58230) {
            this.a.put("auto_retry_counter", Integer.valueOf(i));
        }
    }

    public final void g(boolean z) {
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

    public final void h(boolean z) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 58280) {
            agnc.t("can_revoke_before_delivered_with_rcs", intValue2);
        }
        if (intValue >= 58280) {
            this.a.put("can_revoke_before_delivered_with_rcs", Boolean.valueOf(z));
        }
    }

    public final void i(ConversationIdType conversationIdType) {
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            this.a.put("conversation_id", Long.valueOf(ruy.a(conversationIdType)));
        } else {
            this.a.putNull("conversation_id");
        }
    }

    public final void j(apwq apwqVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 45020) {
            agnc.t("custom_headers", intValue2);
        }
        if (intValue >= 45020) {
            if (apwqVar == null) {
                this.a.putNull("custom_headers");
            } else {
                this.a.put("custom_headers", apwqVar.toByteArray());
            }
        }
    }

    public final void k(boolean z) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 30010) {
            agnc.t("is_hidden", intValue2);
        }
        if (intValue >= 30010) {
            this.a.put("is_hidden", Boolean.valueOf(z));
        }
    }

    public final void l(int i) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 13020) {
            agnc.t("message_report_status", intValue2);
        }
        if (intValue >= 13020) {
            this.a.put("message_report_status", Integer.valueOf(i));
        }
    }

    public final void m(long j) {
        this.a.put("mms_expiry", Long.valueOf(j));
    }

    public final void n(String str) {
        agnc.r(this.a, "mms_transaction_id", str);
    }

    public final void o(boolean z) {
        this.a.put("seen", Boolean.valueOf(z));
    }

    public final void p() {
        this.a.putNull("old_sms_message_uri");
    }

    public final void q(tqp tqpVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 58720) {
            agnc.t("outgoing_delivery_report_status", intValue2);
        }
        if (intValue >= 58720) {
            if (tqpVar == null) {
                this.a.putNull("outgoing_delivery_report_status");
            } else {
                this.a.put("outgoing_delivery_report_status", Integer.valueOf(tqpVar.ordinal()));
            }
        }
    }

    public final void r(tqp tqpVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 58720) {
            agnc.t("outgoing_read_report_status", intValue2);
        }
        if (intValue >= 58720) {
            if (tqpVar == null) {
                this.a.putNull("outgoing_read_report_status");
            } else {
                this.a.put("outgoing_read_report_status", Integer.valueOf(tqpVar.ordinal()));
            }
        }
    }

    public final void s(int i) {
        this.a.put("message_protocol", Integer.valueOf(i));
    }

    public final void t(Instant instant) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 17030) {
            agnc.t("queue_insert_timestamp", intValue2);
        }
        if (intValue >= 17030) {
            if (instant == null) {
                this.a.putNull("queue_insert_timestamp");
            } else {
                this.a.put("queue_insert_timestamp", Long.valueOf(uzz.k(instant)));
            }
        }
    }

    public final void u(int i) {
        this.a.put("raw_status", Integer.valueOf(i));
    }

    public final void v(int i) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 29060) {
            agnc.t("etouffee_status", intValue2);
        }
        if (intValue >= 29060) {
            this.a.put("etouffee_status", Integer.valueOf(i));
        }
    }

    public final void w(long j) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 10004) {
            agnc.t("rcs_file_transfer_session_id", intValue2);
        }
        if (intValue >= 10004) {
            this.a.put("rcs_file_transfer_session_id", Long.valueOf(j));
        }
    }

    public final void x(rve rveVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 41040) {
            agnc.t("rcs_message_id_with_text_type", intValue2);
        }
        if (intValue >= 41040) {
            if (rveVar == null) {
                this.a.putNull("rcs_message_id_with_text_type");
            } else {
                this.a.put("rcs_message_id_with_text_type", rve.d(rveVar));
            }
        }
    }

    public final void y(boolean z) {
        this.a.put("read", Boolean.valueOf(z));
    }

    public final void z(long j) {
        this.a.put("received_timestamp", Long.valueOf(j));
    }
}
