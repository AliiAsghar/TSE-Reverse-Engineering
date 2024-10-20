package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class syc extends agpx {
    public final void A(boolean z) {
        U(new agoi("messages.read", 1, Integer.valueOf(z ? 1 : 0)));
    }

    public final void B(long j) {
        U(new agoi("messages.received_timestamp", 7, Long.valueOf(j)));
    }

    public final void C(long j) {
        U(new agoi("messages.received_timestamp", 8, Long.valueOf(j)));
    }

    public final void D(long j) {
        U(new agoi("messages.received_timestamp", 10, Long.valueOf(j)));
    }

    public final void E(ruz ruzVar) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 59490) {
            agnc.t("satellite_datagram_id", intValue);
        }
        U(new agmd("messages.satellite_datagram_id", 1, ruz.d(ruzVar)));
    }

    public final void F(String str) {
        U(new agmd("messages.sender_id", 1, String.valueOf(str)));
    }

    public final void G(Iterable iterable) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 54040) {
            agnc.t("sender_send_destination", intValue);
        }
        U(new agmf("messages.sender_send_destination", 3, X(iterable), false));
    }

    public final void H(long j) {
        U(new agoi("messages.sent_timestamp", 7, Long.valueOf(j)));
    }

    public final void I(Uri uri) {
        U(new agmd("messages.sms_message_uri", 1, uri));
    }

    public final void J(Iterable iterable) {
        U(new agmf("messages.sms_message_uri", 3, X(iterable), false));
    }

    public final void K() {
        U(new agmg("messages.sms_message_uri", 6));
    }

    public final void L() {
        U(new agmg("messages.sms_message_uri", 5));
    }

    public final void M(int i) {
        U(new agoi("messages.message_status", 1, Integer.valueOf(i)));
    }

    public final void N() {
        U(new agoi("messages.message_status", 7, 253));
    }

    public final void O(Iterable iterable) {
        U(new agmf("messages.message_status", 3, X(iterable), true));
    }

    public final void P(int... iArr) {
        U(new agmf("messages.message_status", 3, Y(iArr), true));
    }

    public final void Q(int i, int i2) {
        U(new agph("messages.message_status", String.valueOf(i), String.valueOf(i2)));
    }

    public final void R() {
        U(new agoi("messages.message_status", 8, Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED)));
    }

    public final void S(Iterable iterable) {
        U(new agmf("messages.message_status", 4, X(iterable), true));
    }

    public final void T(int... iArr) {
        U(new agmf("messages.message_status", 4, Y(iArr), true));
    }

    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new syb(this);
    }

    public final void b(Function... functionArr) {
        Object apply;
        syc[] sycVarArr = new syc[functionArr.length];
        for (int i = 0; i < functionArr.length; i++) {
            apply = functionArr[i].apply(new syc());
            sycVarArr[i] = (syc) apply;
        }
        V(sycVarArr);
    }

    public final void c() {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 49060) {
            agnc.t("awaiting_reverse_sync", intValue);
        }
        U(new agoi("messages.awaiting_reverse_sync", 1, 1));
    }

    public final void d(String str) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 8500) {
            agnc.t("cloud_sync_id", intValue);
        }
        U(new agmd("messages.cloud_sync_id", 1, String.valueOf(str)));
    }

    public final void e() {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 8500) {
            agnc.t("cloud_sync_id", intValue);
        }
        U(new agmg("messages.cloud_sync_id", 6));
    }

    public final void f(ConversationIdType conversationIdType) {
        U(new agmd("messages.conversation_id", 1, Long.valueOf(ruy.a(conversationIdType))));
    }

    public final void g(agpj agpjVar) {
        U(new agme("messages.conversation_id", 1, agpjVar));
    }

    public final void h(Iterable iterable) {
        alob alobVar = new alob();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            alobVar.h(String.valueOf(ruy.a((ConversationIdType) it.next())));
        }
        U(new agmf("messages.conversation_id", 3, X(alobVar.g()), true));
    }

    public final void i(MessageIdType messageIdType) {
        U(new agmd("messages._id", 1, Long.valueOf(rvc.a(messageIdType))));
    }

    public final void j(agpj agpjVar) {
        U(new agme("messages._id", 1, agpjVar));
    }

    public final void k(long j) {
        U(new agoi("messages._id", 7, Long.valueOf(j)));
    }

    public final void l(agpj agpjVar) {
        U(new agme("messages._id", 3, agpjVar));
    }

    public final void m(Iterable iterable) {
        alob alobVar = new alob();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            alobVar.h(String.valueOf(rvc.a((MessageIdType) it.next())));
        }
        U(new agmf("messages._id", 3, X(alobVar.g()), true));
    }

    public final void n(long j) {
        U(new agoi("messages._id", 8, Long.valueOf(j)));
    }

    public final void o(Iterable iterable) {
        alob alobVar = new alob();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            alobVar.h(String.valueOf(rvc.a((MessageIdType) it.next())));
        }
        U(new agmf("messages._id", 4, X(alobVar.g()), true));
    }

    public final void p(MessageIdType messageIdType) {
        U(new agmd("messages._id", 2, Long.valueOf(rvc.a(messageIdType))));
    }

    public final void q(boolean z) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 30010) {
            agnc.t("is_hidden", intValue);
        }
        U(new agoi("messages.is_hidden", 1, Integer.valueOf(z ? 1 : 0)));
    }

    public final void r(int i) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 13020) {
            agnc.t("message_report_status", intValue);
        }
        U(new agoi("messages.message_report_status", 1, Integer.valueOf(i)));
    }

    public final void s() {
        U(new agoi("messages.seen", 1, 0));
    }

    public final void t(agpj agpjVar) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 35030) {
            agnc.t("original_rcs_message_id", intValue);
        }
        U(new agme("messages.original_rcs_message_id", 3, agpjVar));
    }

    public final void u(tqp tqpVar) {
        Integer valueOf;
        int ordinal;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 58720) {
            agnc.t("outgoing_delivery_report_status", intValue);
        }
        if (tqpVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqpVar.ordinal();
        }
        U(new agoi("messages.outgoing_delivery_report_status", 1, Integer.valueOf(ordinal)));
    }

    public final void v(tqp tqpVar) {
        Integer valueOf;
        int ordinal;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 58720) {
            agnc.t("outgoing_read_report_status", intValue);
        }
        if (tqpVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqpVar.ordinal();
        }
        U(new agoi("messages.outgoing_read_report_status", 1, Integer.valueOf(ordinal)));
    }

    public final void w(int i) {
        U(new agoi("messages.message_protocol", 1, Integer.valueOf(i)));
    }

    public final void x(int... iArr) {
        U(new agmf("messages.message_protocol", 3, Y(iArr), true));
    }

    public final void y(int i) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 29060) {
            agnc.t("etouffee_status", intValue);
        }
        U(new agoi("messages.etouffee_status", 1, Integer.valueOf(i)));
    }

    public final void z(rve rveVar) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 41040) {
            agnc.t("rcs_message_id_with_text_type", intValue);
        }
        U(new agmd("messages.rcs_message_id_with_text_type", 1, rve.d(rveVar)));
    }
}
