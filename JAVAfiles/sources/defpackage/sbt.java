package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.aglz;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sbt extends aglz {
    private String A;
    private String D;
    private String J;
    private String M;
    private String N;
    private String O;
    private long P;
    private String U;
    private byte[] V;
    private apwq X;
    private String Y;
    private String Z;
    public sdj a;
    private String[] aA;
    private String[] aB;
    private Uri[] aC;
    private String[] aD;
    private String[] aE;
    private long[] aF;
    private long[] aG;
    private String aH;
    private long aI;
    private String aJ;
    private String aK;
    private boolean aL;
    private Uri ac;
    private atok aj;
    private tqp ak;
    private tqp al;
    private tqu am;
    private int an;
    private ruz ao;
    private utk ap;
    private Optional aq;
    private MessageIdType ar;
    private MessageIdType as;
    private long at;
    private String au;
    private int av;
    private String aw;
    private String ax;
    private String ay;
    private String az;
    public MessagesTable.BindData b;
    private String e;
    private String f;
    private String g;
    private String h;
    private Uri q;
    private String t;
    private String u;
    private String v;
    private String y;
    private MessageIdType c = rvc.a;
    private ConversationIdType d = ruy.a;
    private long i = 0;
    private Instant j = uzz.l(0);
    private long k = 0;
    private int l = 0;
    private int m = 0;
    private int n = 0;
    private boolean o = false;
    private boolean p = false;
    private int r = 0;
    private long s = 0;
    private long w = 0;
    private long x = 0;
    private int z = 0;
    private qwe B = null;
    private long C = 0;
    private rve E = rve.a;
    private int F = 0;
    private tqr G = tqr.VERIFICATION_NA;
    private int H = 0;
    private boolean I = false;
    private long K = -1;
    private int L = -1;
    private String Q = "";
    private long R = 0;
    private long S = 1;
    private rve T = rve.a;
    private long W = 0;
    private MessageIdType aa = rvc.a;
    private boolean ab = false;
    private Optional ad = rvg.a;
    private int ae = -2;
    private xxw af = xxw.UNKNOWN;
    private tqf ag = tqf.UNKNOWN;
    private int ah = 0;
    private boolean ai = false;

    public sbt() {
        tqp tqpVar = tqp.UNKNOWN;
        this.ak = tqpVar;
        this.al = tqpVar;
        this.am = tqu.UNKNOWN;
        this.an = -1;
        this.ao = ruz.a;
        this.ap = utk.a;
        this.aq = uzz.j();
        MessageIdType messageIdType = rvc.a;
        this.ar = messageIdType;
        this.as = messageIdType;
    }

    private final MessagesTable.BindData f(int i) {
        sxn c = MessagesTable.c();
        ao(0, "_id");
        c.v(this.c);
        ao(1, "conversation_id");
        c.m(this.d);
        ao(2, "sender_id");
        c.af(this.e);
        if (i >= 54040) {
            ao(3, "sender_send_destination");
            c.ag(this.f);
        }
        if (i >= 59340) {
            ao(4, "msisdn_receiving_rcs_message");
            c.E(this.g);
        }
        if (i >= 54040) {
            ao(5, "receiving_network_country");
            c.Y(this.h);
        }
        ao(6, "sent_timestamp");
        c.ah(this.i);
        if (i >= 17030) {
            ao(7, "queue_insert_timestamp");
            c.O(this.j);
        }
        ao(8, "received_timestamp");
        c.X(this.k);
        ao(9, "message_protocol");
        c.N(this.l);
        ao(10, "message_status");
        c.an(this.m);
        if (i >= 13020) {
            ao(11, "message_report_status");
            c.y(this.n);
        }
        ao(12, "seen");
        c.G(this.o);
        ao(13, "read");
        c.W(this.p);
        ao(14, "sms_message_uri");
        c.al(this.q);
        ao(15, "sms_priority");
        c.am(this.r);
        ao(16, "sms_message_size");
        c.ak(this.s);
        ao(17, "mms_subject");
        c.C(this.t);
        ao(18, "mms_transaction_id");
        c.D(this.u);
        ao(19, "mms_content_location");
        c.z(this.v);
        ao(20, "mms_expiry");
        c.A(this.w);
        if (i >= 59890) {
            ao(21, "rcs_expiry");
            c.R(this.x);
        }
        if (i >= 9030) {
            ao(22, "mms_retrieve_text");
            c.B(this.y);
        }
        ao(23, "raw_status");
        c.P(this.z);
        ao(24, "self_id");
        c.ad(this.A);
        if (i >= 60160) {
            ao(25, "my_identity_foreign_key");
            c.F(this.B);
        }
        ao(26, "retry_start_timestamp");
        c.ab(this.C);
        if (i >= 8500) {
            ao(27, "cloud_sync_id");
            c.h(this.D);
        }
        if (i >= 41040) {
            ao(28, "rcs_message_id_with_text_type");
            c.T(this.E);
        }
        if (i >= 29060) {
            ao(29, "etouffee_status");
            c.Q(this.F);
        }
        if (i >= 29090) {
            ao(30, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
            c.aq(this.G);
        }
        if (i >= 39000) {
            ao(31, "rcs_ui_status");
            c.V(this.H);
        }
        if (i >= 30010) {
            ao(32, "is_hidden");
            c.w(this.I);
        }
        if (i >= 10002) {
            ao(33, "rcs_remote_instance");
            c.U(this.J);
        }
        if (i >= 10004) {
            ao(34, "rcs_file_transfer_session_id");
            c.S(this.K);
        }
        if (i >= 9000) {
            ao(35, "sms_error_code");
            c.ai(this.L);
        }
        if (i >= 9000) {
            ao(36, "sms_error_desc_map_name");
            c.aj(this.M);
        }
        if (i >= 9010) {
            ao(37, "correlation_id");
            c.n(this.N);
        }
        if (i >= 31010) {
            ao(38, "cms_id");
            c.j(this.O);
        }
        if (i >= 37040) {
            ao(39, "cms_last_mod_seq");
            c.k(this.P);
        }
        if (i >= 19020) {
            ao(40, "web_id");
            c.ar(this.Q);
        }
        if (i >= 29100) {
            ao(41, "usage_stats_logging_id");
            c.ap(this.R);
        }
        if (i >= 35030) {
            ao(42, "send_counter");
            c.ae(this.S);
        }
        if (i >= 35030) {
            ao(43, "original_rcs_message_id");
            c.K(this.T);
        }
        if (i >= 37020) {
            ao(44, "custom_delivery_receipt_mime_type");
            c.p(this.U);
        }
        if (i >= 37020) {
            ao(45, "custom_delivery_receipt_content");
            c.o(this.V);
        }
        if (i >= 37030) {
            ao(46, "report_attempt_acounter");
            c.Z(this.W);
        }
        if (i >= 45020) {
            ao(47, "custom_headers");
            c.q(this.X);
        }
        if (i >= 46010) {
            ao(48, "cms_correlation_id");
            c.i(this.Y);
        }
        if (i >= 48030) {
            ao(49, "group_private_participant");
            c.u(this.Z);
        }
        if (i >= 48030) {
            ao(50, "original_message_id");
            c.I(this.aa);
        }
        if (i >= 49060) {
            ao(51, "awaiting_reverse_sync");
            c.f(this.ab);
        }
        if (i >= 49060) {
            ao(52, "old_sms_message_uri");
            c.H(this.ac);
        }
        if (i >= 56000) {
            ao(53, "draft_id");
            c.r(this.ad);
        }
        if (i >= 58040) {
            ao(54, "result_code");
            c.aa(this.ae);
        }
        if (i >= 58210) {
            ao(55, "cms_life_cycle");
            c.l(this.af);
        }
        if (i >= 58710) {
            ao(56, "fallback_reason");
            c.t(this.ag);
        }
        if (i >= 58230) {
            ao(57, "auto_retry_counter");
            c.e(this.ah);
        }
        if (i >= 58280) {
            ao(58, "can_revoke_before_delivered_with_rcs");
            c.g(this.ai);
        }
        if (i >= 58680) {
            ao(59, "trace_id");
            c.ao(this.aj);
        }
        if (i >= 58720) {
            ao(60, "outgoing_delivery_report_status");
            c.L(this.ak);
        }
        if (i >= 58720) {
            ao(61, "outgoing_read_report_status");
            c.M(this.al);
        }
        if (i >= 59310) {
            ao(62, "xms_transport");
            c.as(this.am);
        }
        if (i >= 59430) {
            ao(63, "message_original_protocol");
            c.J(this.an);
        }
        if (i >= 59490) {
            ao(64, "satellite_datagram_id");
            c.ac(this.ao);
        }
        if (i >= 60190) {
            ao(65, "encryption_protocol");
            c.s(this.ap);
        }
        if (i >= 60370) {
            ao(66, "message_persistence_id");
            c.x(this.aq);
        }
        return c.a();
    }

    @Override // defpackage.aglz
    public final String a() {
        String str;
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        String valueOf9 = String.valueOf(this.k);
        String valueOf10 = String.valueOf(this.l);
        String valueOf11 = String.valueOf(this.m);
        String valueOf12 = String.valueOf(this.n);
        String valueOf13 = String.valueOf(this.o);
        String valueOf14 = String.valueOf(this.p);
        String valueOf15 = String.valueOf(this.q);
        String valueOf16 = String.valueOf(this.r);
        String valueOf17 = String.valueOf(this.s);
        String valueOf18 = String.valueOf(this.t);
        String valueOf19 = String.valueOf(this.u);
        String valueOf20 = String.valueOf(this.v);
        String valueOf21 = String.valueOf(this.w);
        String valueOf22 = String.valueOf(this.x);
        String valueOf23 = String.valueOf(this.y);
        String valueOf24 = String.valueOf(this.z);
        String valueOf25 = String.valueOf(this.A);
        String valueOf26 = String.valueOf(this.B);
        String valueOf27 = String.valueOf(this.C);
        String valueOf28 = String.valueOf(this.D);
        String valueOf29 = String.valueOf(this.E);
        String valueOf30 = String.valueOf(this.F);
        String valueOf31 = String.valueOf(this.G);
        String valueOf32 = String.valueOf(this.H);
        String valueOf33 = String.valueOf(this.I);
        String valueOf34 = String.valueOf(this.J);
        String valueOf35 = String.valueOf(this.K);
        String valueOf36 = String.valueOf(this.L);
        String valueOf37 = String.valueOf(this.M);
        String valueOf38 = String.valueOf(this.N);
        String valueOf39 = String.valueOf(this.O);
        String valueOf40 = String.valueOf(this.P);
        String valueOf41 = String.valueOf(this.Q);
        String valueOf42 = String.valueOf(this.R);
        String valueOf43 = String.valueOf(this.S);
        String valueOf44 = String.valueOf(this.T);
        String valueOf45 = String.valueOf(this.U);
        byte[] bArr = this.V;
        if (bArr != null) {
            str = String.valueOf(bArr.length);
        } else {
            str = "NULL";
        }
        return String.format(locale, "DraftDataServiceQuery [messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_sender_send_destination: %s,\n  messages.messages_msisdn_receiving_rcs_message: %s,\n  messages.messages_receiving_network_country: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_queue_insert_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_message_report_status: %s,\n  messages.messages_seen: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_message_uri: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_sms_message_size: %s,\n  messages.messages_mms_subject: %s,\n  messages.messages_mms_transaction_id: %s,\n  messages.messages_mms_content_location: %s,\n  messages.messages_mms_expiry: %s,\n  messages.messages_rcs_expiry: %s,\n  messages.messages_mms_retrieve_text: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_self_id: %s,\n  messages.messages_my_identity_foreign_key: %s,\n  messages.messages_retry_start_timestamp: %s,\n  messages.messages_cloud_sync_id: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_etouffee_status: %s,\n  messages.messages_verification_status: %s,\n  messages.messages_rcs_ui_status: %s,\n  messages.messages_is_hidden: %s,\n  messages.messages_rcs_remote_instance: %s,\n  messages.messages_rcs_file_transfer_session_id: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  messages.messages_correlation_id: %s,\n  messages.messages_cms_id: %s,\n  messages.messages_cms_last_mod_seq: %s,\n  messages.messages_web_id: %s,\n  messages.messages_usage_stats_logging_id: %s,\n  messages.messages_send_counter: %s,\n  messages.messages_original_rcs_message_id: %s,\n  messages.messages_custom_delivery_receipt_mime_type: %s,\n  messages.messages_custom_delivery_receipt_content: %s,\n  messages.messages_report_attempt_acounter: %s,\n  messages.messages_custom_headers: %s,\n  messages.messages_cms_correlation_id: %s,\n  messages.messages_group_private_participant: %s,\n  messages.messages_original_message_id: %s,\n  messages.messages_awaiting_reverse_sync: %s,\n  messages.messages_old_sms_message_uri: %s,\n  messages.messages_draft_id: %s,\n  messages.messages_result_code: %s,\n  messages.messages_cms_life_cycle: %s,\n  messages.messages_fallback_reason: %s,\n  messages.messages_auto_retry_counter: %s,\n  messages.messages_can_revoke_before_delivered_with_rcs: %s,\n  messages.messages_trace_id: %s,\n  messages.messages_outgoing_delivery_report_status: %s,\n  messages.messages_outgoing_read_report_status: %s,\n  messages.messages_xms_transport: %s,\n  messages.messages_message_original_protocol: %s,\n  messages.messages_satellite_datagram_id: %s,\n  messages.messages_encryption_protocol: %s,\n  messages.messages_message_persistence_id: %s,\n  message_replies_view.message_replies_view_message_replies_message_id: %s,\n  message_replies_view.message_replies_view_messages__id: %s,\n  message_replies_view.message_replies_view_messages_received_timestamp: %s,\n  message_replies_view.message_replies_view_participants__id: %s,\n  message_replies_view.message_replies_view_participants_sub_id: %s,\n  message_replies_view.message_replies_view_participants_normalized_destination: %s,\n  message_replies_view.message_replies_view_participants_display_destination: %s,\n  message_replies_view.message_replies_view_participants_full_name: %s,\n  message_replies_view.message_replies_view_participants_first_name: %s,\n  message_replies_view.message_replies_view_parts__id: %s,\n  message_replies_view.message_replies_view_parts_text: %s,\n  message_replies_view.message_replies_view_parts_uri: %s,\n  message_replies_view.message_replies_view_parts_content_type: %s,\n  message_replies_view.message_replies_view_parts_file_name: %s,\n  message_replies_view.message_replies_view_parts_duration: %s,\n  message_replies_view.message_replies_view_parts_parts__ROWID: %s,\n  message_replies_view.message_replies_view_link_preview_trigger_url: %s,\n  message_replies_view.message_replies_view_link_preview_expiration_time_millis: %s,\n  message_replies_view.message_replies_view_link_preview_link_title: %s,\n  message_replies_view.message_replies_view_link_preview_link_image_url: %s,\n  message_replies_view.message_replies_view_link_preview_link_preview_failed: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, "BLOB".concat(String.valueOf(str)), String.valueOf(this.W), String.valueOf(this.X), String.valueOf(this.Y), String.valueOf(this.Z), String.valueOf(this.aa), String.valueOf(this.ab), String.valueOf(this.ac), String.valueOf(this.ad), String.valueOf(this.ae), String.valueOf(this.af), String.valueOf(this.ag), String.valueOf(this.ah), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar), String.valueOf(this.as), String.valueOf(this.at), String.valueOf(this.au), String.valueOf(this.av), String.valueOf(this.aw), String.valueOf(this.ax), String.valueOf(this.ay), String.valueOf(this.az), aA(this.aA), aA(this.aB), az(this.aC), aA(this.aD), aA(this.aE), ay(this.aF), ay(this.aG), String.valueOf(this.aH), String.valueOf(this.aI), String.valueOf(this.aJ), String.valueOf(this.aK), String.valueOf(this.aL));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        valueOf.intValue();
    }

    @Override // defpackage.aglz
    public final /* synthetic */ void c(agmq agmqVar) {
        Integer valueOf;
        Uri uri;
        atok atokVar;
        boolean z;
        Uri parse;
        boolean z2;
        apwq apwqVar;
        boolean z3;
        Uri parse2;
        boolean z4;
        boolean z5;
        lbz lbzVar = (lbz) agmqVar;
        aq();
        this.cJ = lbzVar.dx();
        if (lbzVar.db(0)) {
            this.c = new MessageIdType(lbzVar.getLong(lbzVar.cI(0, sbx.a)));
            fE(0);
        }
        boolean z6 = true;
        if (lbzVar.db(1)) {
            this.d = new ConversationIdType(lbzVar.getLong(lbzVar.cI(1, sbx.a)));
            fE(1);
        }
        if (lbzVar.db(2)) {
            this.e = lbzVar.getString(lbzVar.cI(2, sbx.a));
            fE(2);
        }
        if (lbzVar.db(3)) {
            this.f = lbzVar.getString(lbzVar.cI(3, sbx.a));
            fE(3);
        }
        if (lbzVar.db(4)) {
            this.g = lbzVar.getString(lbzVar.cI(4, sbx.a));
            fE(4);
        }
        if (lbzVar.db(5)) {
            this.h = lbzVar.getString(lbzVar.cI(5, sbx.a));
            fE(5);
        }
        if (lbzVar.db(6)) {
            this.i = lbzVar.getLong(lbzVar.cI(6, sbx.a));
            fE(6);
        }
        if (lbzVar.db(7)) {
            this.j = uzz.l(lbzVar.getLong(lbzVar.cI(7, sbx.a)));
            fE(7);
        }
        if (lbzVar.db(8)) {
            this.k = lbzVar.getLong(lbzVar.cI(8, sbx.a));
            fE(8);
        }
        if (lbzVar.db(9)) {
            this.l = lbzVar.getInt(lbzVar.cI(9, sbx.a));
            fE(9);
        }
        if (lbzVar.db(10)) {
            this.m = lbzVar.getInt(lbzVar.cI(10, sbx.a));
            fE(10);
        }
        if (lbzVar.db(11)) {
            this.n = lbzVar.getInt(lbzVar.cI(11, sbx.a));
            fE(11);
        }
        if (lbzVar.db(12)) {
            if (lbzVar.getInt(lbzVar.cI(12, sbx.a)) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.o = z5;
            fE(12);
        }
        if (lbzVar.db(13)) {
            if (lbzVar.getInt(lbzVar.cI(13, sbx.a)) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.p = z4;
            fE(13);
        }
        if (lbzVar.db(14)) {
            String string = lbzVar.getString(lbzVar.cI(14, sbx.a));
            if (string == null) {
                parse2 = null;
            } else {
                parse2 = Uri.parse(string);
            }
            this.q = parse2;
            fE(14);
        }
        if (lbzVar.db(15)) {
            this.r = lbzVar.getInt(lbzVar.cI(15, sbx.a));
            fE(15);
        }
        if (lbzVar.db(16)) {
            this.s = lbzVar.getLong(lbzVar.cI(16, sbx.a));
            fE(16);
        }
        if (lbzVar.db(17)) {
            this.t = yta.a(lbzVar.getString(lbzVar.cI(17, sbx.a)));
            fE(17);
        }
        if (lbzVar.db(18)) {
            this.u = lbzVar.getString(lbzVar.cI(18, sbx.a));
            fE(18);
        }
        if (lbzVar.db(19)) {
            this.v = lbzVar.getString(lbzVar.cI(19, sbx.a));
            fE(19);
        }
        if (lbzVar.db(20)) {
            this.w = lbzVar.getLong(lbzVar.cI(20, sbx.a));
            fE(20);
        }
        if (lbzVar.db(21)) {
            this.x = lbzVar.getLong(lbzVar.cI(21, sbx.a));
            fE(21);
        }
        if (lbzVar.db(22)) {
            this.y = lbzVar.getString(lbzVar.cI(22, sbx.a));
            fE(22);
        }
        if (lbzVar.db(23)) {
            this.z = lbzVar.getInt(lbzVar.cI(23, sbx.a));
            fE(23);
        }
        if (lbzVar.db(24)) {
            this.A = lbzVar.getString(lbzVar.cI(24, sbx.a));
            fE(24);
        }
        if (lbzVar.db(25)) {
            this.B = riw.m(lbzVar.getString(lbzVar.cI(25, sbx.a)));
            fE(25);
        }
        if (lbzVar.db(26)) {
            this.C = lbzVar.getLong(lbzVar.cI(26, sbx.a));
            fE(26);
        }
        if (lbzVar.db(27)) {
            this.D = lbzVar.getString(lbzVar.cI(27, sbx.a));
            fE(27);
        }
        if (lbzVar.db(28)) {
            this.E = rve.a(lbzVar.getString(lbzVar.cI(28, sbx.a)));
            fE(28);
        }
        if (lbzVar.db(29)) {
            this.F = lbzVar.getInt(lbzVar.cI(29, sbx.a));
            fE(29);
        }
        if (lbzVar.db(30)) {
            tqr[] values = tqr.values();
            int i = lbzVar.getInt(lbzVar.cI(30, sbx.a));
            if (i < values.length) {
                this.G = values[i];
                fE(30);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(31)) {
            this.H = lbzVar.getInt(lbzVar.cI(31, sbx.a));
            fE(31);
        }
        if (lbzVar.db(32)) {
            if (lbzVar.getInt(lbzVar.cI(32, sbx.a)) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.I = z3;
            fE(32);
        }
        if (lbzVar.db(33)) {
            this.J = lbzVar.getString(lbzVar.cI(33, sbx.a));
            fE(33);
        }
        if (lbzVar.db(34)) {
            this.K = lbzVar.getLong(lbzVar.cI(34, sbx.a));
            fE(34);
        }
        if (lbzVar.db(35)) {
            this.L = lbzVar.getInt(lbzVar.cI(35, sbx.a));
            fE(35);
        }
        if (lbzVar.db(36)) {
            this.M = lbzVar.getString(lbzVar.cI(36, sbx.a));
            fE(36);
        }
        if (lbzVar.db(37)) {
            this.N = lbzVar.getString(lbzVar.cI(37, sbx.a));
            fE(37);
        }
        if (lbzVar.db(38)) {
            this.O = lbzVar.getString(lbzVar.cI(38, sbx.a));
            fE(38);
        }
        if (lbzVar.db(39)) {
            this.P = lbzVar.getLong(lbzVar.cI(39, sbx.a));
            fE(39);
        }
        if (lbzVar.db(40)) {
            this.Q = lbzVar.getString(lbzVar.cI(40, sbx.a));
            fE(40);
        }
        if (lbzVar.db(41)) {
            this.R = lbzVar.getLong(lbzVar.cI(41, sbx.a));
            fE(41);
        }
        if (lbzVar.db(42)) {
            this.S = lbzVar.getLong(lbzVar.cI(42, sbx.a));
            fE(42);
        }
        if (lbzVar.db(43)) {
            this.T = rve.a(lbzVar.getString(lbzVar.cI(43, sbx.a)));
            fE(43);
        }
        if (lbzVar.db(44)) {
            this.U = lbzVar.getString(lbzVar.cI(44, sbx.a));
            fE(44);
        }
        if (lbzVar.db(45)) {
            this.V = lbzVar.getBlob(lbzVar.cI(45, sbx.a));
            fE(45);
        }
        if (lbzVar.db(46)) {
            this.W = lbzVar.getLong(lbzVar.cI(46, sbx.a));
            fE(46);
        }
        if (lbzVar.db(47)) {
            byte[] blob = lbzVar.getBlob(lbzVar.cI(47, sbx.a));
            if (blob == null) {
                apwqVar = null;
            } else {
                try {
                    apwqVar = (apwq) apag.parseFrom(apwq.a, blob, aozs.a());
                } catch (Throwable unused) {
                    apwqVar = apwq.a;
                }
            }
            this.X = apwqVar;
            fE(47);
        }
        if (lbzVar.db(48)) {
            this.Y = lbzVar.getString(lbzVar.cI(48, sbx.a));
            fE(48);
        }
        if (lbzVar.db(49)) {
            this.Z = lbzVar.getString(lbzVar.cI(49, sbx.a));
            fE(49);
        }
        if (lbzVar.db(50)) {
            this.aa = new MessageIdType(lbzVar.getLong(lbzVar.cI(50, sbx.a)));
            fE(50);
        }
        if (lbzVar.db(51)) {
            if (lbzVar.getInt(lbzVar.cI(51, sbx.a)) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.ab = z2;
            fE(51);
        }
        if (lbzVar.db(52)) {
            String string2 = lbzVar.getString(lbzVar.cI(52, sbx.a));
            if (string2 == null) {
                parse = null;
            } else {
                parse = Uri.parse(string2);
            }
            this.ac = parse;
            fE(52);
        }
        if (lbzVar.db(53)) {
            this.ad = rvg.a(lbzVar.getString(lbzVar.cI(53, sbx.a)));
            fE(53);
        }
        if (lbzVar.db(54)) {
            this.ae = lbzVar.getInt(lbzVar.cI(54, sbx.a));
            fE(54);
        }
        if (lbzVar.db(55)) {
            xxw[] values2 = xxw.values();
            int i2 = lbzVar.getInt(lbzVar.cI(55, sbx.a));
            if (i2 < values2.length) {
                this.af = values2[i2];
                fE(55);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(56)) {
            tqf[] values3 = tqf.values();
            int i3 = lbzVar.getInt(lbzVar.cI(56, sbx.a));
            if (i3 < values3.length) {
                this.ag = values3[i3];
                fE(56);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(57)) {
            this.ah = lbzVar.getInt(lbzVar.cI(57, sbx.a));
            fE(57);
        }
        if (lbzVar.db(58)) {
            if (lbzVar.getInt(lbzVar.cI(58, sbx.a)) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.ai = z;
            fE(58);
        }
        if (lbzVar.db(59)) {
            byte[] blob2 = lbzVar.getBlob(lbzVar.cI(59, sbx.a));
            if (blob2 == null) {
                atokVar = null;
            } else {
                try {
                    atokVar = (atok) apag.parseFrom(atok.a, blob2, aozs.a());
                } catch (Throwable unused2) {
                    atokVar = atok.a;
                }
            }
            this.aj = atokVar;
            fE(59);
        }
        if (lbzVar.db(60)) {
            tqp[] values4 = tqp.values();
            int i4 = lbzVar.getInt(lbzVar.cI(60, sbx.a));
            if (i4 < values4.length) {
                this.ak = values4[i4];
                fE(60);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(61)) {
            tqp[] values5 = tqp.values();
            int i5 = lbzVar.getInt(lbzVar.cI(61, sbx.a));
            if (i5 < values5.length) {
                this.al = values5[i5];
                fE(61);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(62)) {
            tqu[] values6 = tqu.values();
            int i6 = lbzVar.getInt(lbzVar.cI(62, sbx.a));
            if (i6 < values6.length) {
                this.am = values6[i6];
                fE(62);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(63)) {
            this.an = lbzVar.getInt(lbzVar.cI(63, sbx.a));
            fE(63);
        }
        if (lbzVar.db(64)) {
            this.ao = new ruz(lbzVar.getString(lbzVar.cI(64, sbx.a)));
            fE(64);
        }
        if (lbzVar.db(65)) {
            utk[] values7 = utk.values();
            int i7 = lbzVar.getInt(lbzVar.cI(65, sbx.a));
            if (i7 < values7.length) {
                this.ap = values7[i7];
                fE(65);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(66)) {
            this.aq = rvg.a(lbzVar.getString(lbzVar.cI(66, sbx.a)));
            fE(66);
        }
        if (lbzVar.db(67)) {
            this.ar = new MessageIdType(lbzVar.getLong(lbzVar.cI(67, sbx.a)));
            fE(67);
        }
        if (lbzVar.db(68)) {
            this.as = new MessageIdType(lbzVar.getLong(lbzVar.cI(68, sbx.a)));
            fE(68);
        }
        if (lbzVar.db(69)) {
            this.at = lbzVar.getLong(lbzVar.cI(69, sbx.a));
            fE(69);
        }
        if (lbzVar.db(70)) {
            this.au = lbzVar.getString(lbzVar.cI(70, sbx.a));
            fE(70);
        }
        if (lbzVar.db(71)) {
            this.av = lbzVar.getInt(lbzVar.cI(71, sbx.a));
            fE(71);
        }
        if (lbzVar.db(72)) {
            this.aw = aabr.bb(lbzVar.getString(lbzVar.cI(72, sbx.a)));
            fE(72);
        }
        if (lbzVar.db(73)) {
            this.ax = aabr.bb(lbzVar.getString(lbzVar.cI(73, sbx.a)));
            fE(73);
        }
        if (lbzVar.db(74)) {
            this.ay = yta.a(lbzVar.getString(lbzVar.cI(74, sbx.a)));
            fE(74);
        }
        if (lbzVar.db(75)) {
            this.az = yta.a(lbzVar.getString(lbzVar.cI(75, sbx.a)));
            fE(75);
        }
        if (lbzVar.db(76)) {
            this.aA = (String[]) agnc.z(null, lbz.dm(lbzVar.getString(lbzVar.cI(76, sbx.a))), new String[0]);
            fE(76);
        }
        if (lbzVar.db(77)) {
            String[] dm = lbz.dm(lbzVar.getString(lbzVar.cI(77, sbx.a)));
            for (int i8 = 0; i8 < dm.length; i8++) {
                dm[i8] = yta.a(dm[i8]);
            }
            this.aB = (String[]) agnc.z(null, dm, new String[0]);
            fE(77);
        }
        if (lbzVar.db(78)) {
            String[] dm2 = lbz.dm(lbzVar.getString(lbzVar.cI(78, sbx.a)));
            int length = dm2.length;
            Uri[] uriArr = new Uri[length];
            int i9 = 0;
            int i10 = 0;
            while (i9 < length) {
                String str = dm2[i9];
                int i11 = i10 + 1;
                if (str != null && str.length() != 0) {
                    uri = Uri.parse(str);
                } else {
                    uri = null;
                }
                uriArr[i10] = uri;
                i9++;
                i10 = i11;
            }
            this.aC = (Uri[]) agnc.z(null, uriArr, new Uri[0]);
            fE(78);
        }
        if (lbzVar.db(79)) {
            this.aD = (String[]) agnc.z(null, lbz.dm(lbzVar.getString(lbzVar.cI(79, sbx.a))), new String[0]);
            fE(79);
        }
        if (lbzVar.db(80)) {
            this.aE = (String[]) agnc.z(null, lbz.dm(lbzVar.getString(lbzVar.cI(80, sbx.a))), new String[0]);
            fE(80);
        }
        if (lbzVar.db(81)) {
            this.aF = agnc.y(null, lbz.dl(lbzVar.getString(lbzVar.cI(81, sbx.a))));
            fE(81);
        }
        if (lbzVar.db(82)) {
            this.aG = agnc.y(null, lbz.dl(lbzVar.getString(lbzVar.cI(82, sbx.a))));
            fE(82);
        }
        if (lbzVar.db(83)) {
            this.aH = lbzVar.getString(lbzVar.cI(83, sbx.a));
            fE(83);
        }
        if (lbzVar.db(84)) {
            this.aI = lbzVar.getLong(lbzVar.cI(84, sbx.a));
            fE(84);
        }
        if (lbzVar.db(85)) {
            this.aJ = yta.a(lbzVar.getString(lbzVar.cI(85, sbx.a)));
            fE(85);
        }
        if (lbzVar.db(86)) {
            this.aK = lbzVar.getString(lbzVar.cI(86, sbx.a));
            fE(86);
        }
        if (lbzVar.db(87)) {
            if (lbzVar.getInt(lbzVar.cI(87, sbx.a)) != 1) {
                z6 = false;
            }
            this.aL = z6;
            fE(87);
        }
        valueOf = Integer.valueOf(d.P().W().c());
        this.b = f(valueOf.intValue());
        sdk a = sdp.a();
        ao(67, "message_id");
        a.o(this.ar);
        ao(68, "_id");
        a.i(this.as);
        ao(69, "received_timestamp");
        a.r(this.at);
        ao(70, "_id");
        a.j(this.au);
        ao(71, "sub_id");
        a.s(this.av);
        ao(72, "normalized_destination");
        a.p(this.aw);
        ao(73, "display_destination");
        a.c(this.ax);
        ao(74, "full_name");
        a.h(this.ay);
        ao(75, "first_name");
        a.g(this.az);
        ao(76, "_id");
        a.k(this.aA);
        ao(77, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        a.t(this.aB);
        ao(78, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        a.v(this.aC);
        ao(79, "content_type");
        a.b(this.aD);
        ao(80, "file_name");
        a.f(this.aE);
        ao(81, "duration");
        a.d(this.aF);
        ao(82, "parts__ROWID");
        a.q(this.aG);
        ao(83, "trigger_url");
        a.u(this.aH);
        ao(84, "expiration_time_millis");
        a.e(this.aI);
        ao(85, "link_title");
        a.n(this.aJ);
        ao(86, "link_image_url");
        a.l(this.aK);
        ao(87, "link_preview_failed");
        a.m(this.aL);
        this.a = a.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sbt)) {
            return false;
        }
        sbt sbtVar = (sbt) obj;
        if (super.aC(sbtVar.cJ) && Objects.equals(this.c, sbtVar.c) && Objects.equals(this.d, sbtVar.d) && Objects.equals(this.e, sbtVar.e) && Objects.equals(this.f, sbtVar.f) && Objects.equals(this.g, sbtVar.g) && Objects.equals(this.h, sbtVar.h) && this.i == sbtVar.i && Objects.equals(this.j, sbtVar.j) && this.k == sbtVar.k && this.l == sbtVar.l && this.m == sbtVar.m && this.n == sbtVar.n && this.o == sbtVar.o && this.p == sbtVar.p && Objects.equals(this.q, sbtVar.q) && this.r == sbtVar.r && this.s == sbtVar.s && Objects.equals(this.t, sbtVar.t) && Objects.equals(this.u, sbtVar.u) && Objects.equals(this.v, sbtVar.v) && this.w == sbtVar.w && this.x == sbtVar.x && Objects.equals(this.y, sbtVar.y) && this.z == sbtVar.z && Objects.equals(this.A, sbtVar.A) && Objects.equals(this.B, sbtVar.B) && this.C == sbtVar.C && Objects.equals(this.D, sbtVar.D) && Objects.equals(this.E, sbtVar.E) && this.F == sbtVar.F && this.G == sbtVar.G && this.H == sbtVar.H && this.I == sbtVar.I && Objects.equals(this.J, sbtVar.J) && this.K == sbtVar.K && this.L == sbtVar.L && Objects.equals(this.M, sbtVar.M) && Objects.equals(this.N, sbtVar.N) && Objects.equals(this.O, sbtVar.O) && this.P == sbtVar.P && Objects.equals(this.Q, sbtVar.Q) && this.R == sbtVar.R && this.S == sbtVar.S && Objects.equals(this.T, sbtVar.T) && Objects.equals(this.U, sbtVar.U) && Arrays.equals(this.V, sbtVar.V) && this.W == sbtVar.W && Objects.equals(this.X, sbtVar.X) && Objects.equals(this.Y, sbtVar.Y) && Objects.equals(this.Z, sbtVar.Z) && Objects.equals(this.aa, sbtVar.aa) && this.ab == sbtVar.ab && Objects.equals(this.ac, sbtVar.ac) && Objects.equals(this.ad, sbtVar.ad) && this.ae == sbtVar.ae && this.af == sbtVar.af && this.ag == sbtVar.ag && this.ah == sbtVar.ah && this.ai == sbtVar.ai && Objects.equals(this.aj, sbtVar.aj) && this.ak == sbtVar.ak && this.al == sbtVar.al && this.am == sbtVar.am && this.an == sbtVar.an && Objects.equals(this.ao, sbtVar.ao) && this.ap == sbtVar.ap && Objects.equals(this.aq, sbtVar.aq) && Objects.equals(this.ar, sbtVar.ar) && Objects.equals(this.as, sbtVar.as) && this.at == sbtVar.at && Objects.equals(this.au, sbtVar.au) && this.av == sbtVar.av && Objects.equals(this.aw, sbtVar.aw) && Objects.equals(this.ax, sbtVar.ax) && Objects.equals(this.ay, sbtVar.ay) && Objects.equals(this.az, sbtVar.az) && Arrays.equals(this.aA, sbtVar.aA) && Arrays.equals(this.aB, sbtVar.aB) && Arrays.equals(this.aC, sbtVar.aC) && Arrays.equals(this.aD, sbtVar.aD) && Arrays.equals(this.aE, sbtVar.aE) && Arrays.equals(this.aF, sbtVar.aF) && Arrays.equals(this.aG, sbtVar.aG) && Objects.equals(this.aH, sbtVar.aH) && this.aI == sbtVar.aI && Objects.equals(this.aJ, sbtVar.aJ) && Objects.equals(this.aK, sbtVar.aK) && this.aL == sbtVar.aL) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        aday adayVar;
        int ordinal;
        int ordinal2;
        int ordinal3;
        int ordinal4;
        int ordinal5;
        int ordinal6;
        int ordinal7;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        MessageIdType messageIdType = this.c;
        ConversationIdType conversationIdType = this.d;
        String str = this.e;
        String str2 = this.f;
        String str3 = this.g;
        String str4 = this.h;
        Long valueOf = Long.valueOf(this.i);
        Instant instant = this.j;
        Long valueOf2 = Long.valueOf(this.k);
        Integer valueOf3 = Integer.valueOf(this.l);
        Integer valueOf4 = Integer.valueOf(this.m);
        Integer valueOf5 = Integer.valueOf(this.n);
        Boolean valueOf6 = Boolean.valueOf(this.o);
        Boolean valueOf7 = Boolean.valueOf(this.p);
        Uri uri = this.q;
        Integer valueOf8 = Integer.valueOf(this.r);
        Long valueOf9 = Long.valueOf(this.s);
        String str5 = this.t;
        String str6 = this.u;
        String str7 = this.v;
        Long valueOf10 = Long.valueOf(this.w);
        Long valueOf11 = Long.valueOf(this.x);
        String str8 = this.y;
        Integer valueOf12 = Integer.valueOf(this.z);
        String str9 = this.A;
        qwe qweVar = this.B;
        Long valueOf13 = Long.valueOf(this.C);
        String str10 = this.D;
        rve rveVar = this.E;
        Integer valueOf14 = Integer.valueOf(this.F);
        tqr tqrVar = this.G;
        if (tqrVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqrVar.ordinal();
        }
        Integer valueOf15 = Integer.valueOf(ordinal);
        Integer valueOf16 = Integer.valueOf(this.H);
        Boolean valueOf17 = Boolean.valueOf(this.I);
        String str11 = this.J;
        Long valueOf18 = Long.valueOf(this.K);
        Integer valueOf19 = Integer.valueOf(this.L);
        String str12 = this.M;
        String str13 = this.N;
        String str14 = this.O;
        Long valueOf20 = Long.valueOf(this.P);
        String str15 = this.Q;
        Long valueOf21 = Long.valueOf(this.R);
        Long valueOf22 = Long.valueOf(this.S);
        rve rveVar2 = this.T;
        String str16 = this.U;
        Integer valueOf23 = Integer.valueOf(Arrays.hashCode(this.V));
        Long valueOf24 = Long.valueOf(this.W);
        apwq apwqVar = this.X;
        String str17 = this.Y;
        String str18 = this.Z;
        MessageIdType messageIdType2 = this.aa;
        Boolean valueOf25 = Boolean.valueOf(this.ab);
        Uri uri2 = this.ac;
        Optional optional = this.ad;
        Integer valueOf26 = Integer.valueOf(this.ae);
        xxw xxwVar = this.af;
        if (xxwVar == null) {
            ordinal2 = 0;
        } else {
            ordinal2 = xxwVar.ordinal();
        }
        Integer valueOf27 = Integer.valueOf(ordinal2);
        tqf tqfVar = this.ag;
        if (tqfVar == null) {
            ordinal3 = 0;
        } else {
            ordinal3 = tqfVar.ordinal();
        }
        Integer valueOf28 = Integer.valueOf(ordinal3);
        Integer valueOf29 = Integer.valueOf(this.ah);
        Boolean valueOf30 = Boolean.valueOf(this.ai);
        atok atokVar = this.aj;
        tqp tqpVar = this.ak;
        if (tqpVar == null) {
            ordinal4 = 0;
        } else {
            ordinal4 = tqpVar.ordinal();
        }
        Integer valueOf31 = Integer.valueOf(ordinal4);
        tqp tqpVar2 = this.al;
        if (tqpVar2 == null) {
            ordinal5 = 0;
        } else {
            ordinal5 = tqpVar2.ordinal();
        }
        Integer valueOf32 = Integer.valueOf(ordinal5);
        tqu tquVar = this.am;
        if (tquVar == null) {
            ordinal6 = 0;
        } else {
            ordinal6 = tquVar.ordinal();
        }
        Integer valueOf33 = Integer.valueOf(ordinal6);
        Integer valueOf34 = Integer.valueOf(this.an);
        ruz ruzVar = this.ao;
        utk utkVar = this.ap;
        if (utkVar == null) {
            ordinal7 = 0;
        } else {
            ordinal7 = utkVar.ordinal();
        }
        return Objects.hash(adayVar, messageIdType, conversationIdType, str, str2, str3, str4, valueOf, instant, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, uri, valueOf8, valueOf9, str5, str6, str7, valueOf10, valueOf11, str8, valueOf12, str9, qweVar, valueOf13, str10, rveVar, valueOf14, valueOf15, valueOf16, valueOf17, str11, valueOf18, valueOf19, str12, str13, str14, valueOf20, str15, valueOf21, valueOf22, rveVar2, str16, valueOf23, valueOf24, apwqVar, str17, str18, messageIdType2, valueOf25, uri2, optional, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, atokVar, valueOf31, valueOf32, valueOf33, valueOf34, ruzVar, Integer.valueOf(ordinal7), this.aq, this.ar, this.as, Long.valueOf(this.at), this.au, Integer.valueOf(this.av), this.aw, this.ax, this.ay, this.az, Integer.valueOf(Arrays.hashCode(this.aA)), Integer.valueOf(Arrays.hashCode(this.aB)), Integer.valueOf(Arrays.hashCode(this.aC)), Integer.valueOf(Arrays.hashCode(this.aD)), Integer.valueOf(Arrays.hashCode(this.aE)), Integer.valueOf(Arrays.hashCode(this.aF)), Integer.valueOf(Arrays.hashCode(this.aG)), this.aH, Long.valueOf(this.aI), this.aJ, this.aK, Boolean.valueOf(this.aL), null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "DraftDataServiceQuery -- REDACTED");
        }
        return a();
    }
}
