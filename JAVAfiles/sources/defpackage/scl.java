package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class scl extends aglz {
    private long A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private qwe G;
    private qss H;
    private int I;
    private boolean J;
    private String K;
    private boolean L;
    private boolean M;
    private String N;
    private String O;
    private String P;
    private int Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private long X;
    private String Y;
    private String Z;
    private String a;
    private utj aA;
    private String aB;
    private boolean aa;
    private int ab;
    private long ac;
    private long ad;
    private String ae;
    private String af;
    private String ag;
    private byte[] ah;
    private long ai;
    private long aj;
    private boolean ak;
    private vtm al;
    private boolean am;
    private ConversationIdType an;
    private ConversationIdType ao;
    private qpd ap;
    private xxw aq;
    private String ar;
    private Optional as;
    private Optional at;
    private boolean au;
    private boolean av;
    private vst aw;
    private vvh ax;
    private int ay;
    private utk az;
    private ConversationIdType b;
    private MessageIdType c;
    private int d;
    private aqby e;
    private ConversationIdType f;
    private xhv g;
    private String h;
    private tqh i;
    private String j;
    private MessageIdType k;
    private String l;
    private String m;
    private Uri n;
    private String o;
    private boolean p;
    private String q;
    private String r;
    private Uri s;
    private String t;
    private int u;
    private tqc v;
    private long w;
    private long x;
    private String y;
    private long z;

    public scl() {
        ConversationIdType conversationIdType = ruy.a;
        this.b = conversationIdType;
        this.c = rvc.a;
        this.d = 0;
        this.f = conversationIdType;
        this.g = new xhv();
        this.i = tqh.NAME_IS_AUTOMATIC;
        this.k = rvc.a;
        this.p = false;
        this.u = 0;
        this.v = tqc.UNARCHIVED;
        this.w = 0L;
        this.x = 0L;
        this.z = -1L;
        this.A = -1L;
        this.G = null;
        this.H = null;
        this.I = 0;
        this.J = true;
        this.L = true;
        this.M = false;
        this.Q = 0;
        this.R = -1L;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = 0L;
        this.aa = false;
        this.ab = 0;
        this.ac = 0L;
        this.ad = 0L;
        this.ai = 0L;
        this.aj = -1L;
        this.ak = true;
        this.al = new vtm(0L);
        this.am = false;
        ConversationIdType conversationIdType2 = ruy.a;
        this.an = conversationIdType2;
        this.ao = conversationIdType2;
        this.ap = qpd.b(0);
        this.aq = xxw.UNKNOWN;
        this.as = uxi.g(-1L);
        this.at = uxi.g(-1L);
        this.au = false;
        this.av = false;
        this.ax = vvh.a;
        this.ay = 0;
        this.az = utk.a;
        this.aA = null;
    }

    @Override // defpackage.aglz
    public final String a() {
        String str;
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        String valueOf10 = String.valueOf(this.j);
        String valueOf11 = String.valueOf(this.k);
        String valueOf12 = String.valueOf(this.l);
        String valueOf13 = String.valueOf(this.m);
        String valueOf14 = String.valueOf(this.n);
        String valueOf15 = String.valueOf(this.o);
        String valueOf16 = String.valueOf(this.p);
        String valueOf17 = String.valueOf(this.q);
        String valueOf18 = String.valueOf(this.r);
        String valueOf19 = String.valueOf(this.s);
        String valueOf20 = String.valueOf(this.t);
        String valueOf21 = String.valueOf(this.u);
        String valueOf22 = String.valueOf(this.v);
        String valueOf23 = String.valueOf(this.w);
        String valueOf24 = String.valueOf(this.x);
        String valueOf25 = String.valueOf(this.y);
        String valueOf26 = String.valueOf(this.z);
        String valueOf27 = String.valueOf(this.A);
        String valueOf28 = String.valueOf(this.B);
        String valueOf29 = String.valueOf(this.C);
        String valueOf30 = String.valueOf(this.D);
        String valueOf31 = String.valueOf(this.E);
        String valueOf32 = String.valueOf(this.F);
        String valueOf33 = String.valueOf(this.G);
        String valueOf34 = String.valueOf(this.H);
        String valueOf35 = String.valueOf(this.I);
        String valueOf36 = String.valueOf(this.J);
        String valueOf37 = String.valueOf(this.K);
        String valueOf38 = String.valueOf(this.L);
        String valueOf39 = String.valueOf(this.M);
        String valueOf40 = String.valueOf(this.N);
        String valueOf41 = String.valueOf(this.O);
        String valueOf42 = String.valueOf(this.P);
        String valueOf43 = String.valueOf(this.Q);
        String valueOf44 = String.valueOf(this.R);
        String valueOf45 = String.valueOf(this.S);
        String valueOf46 = String.valueOf(this.T);
        String valueOf47 = String.valueOf(this.U);
        String valueOf48 = String.valueOf(this.V);
        String valueOf49 = String.valueOf(this.W);
        String valueOf50 = String.valueOf(this.X);
        String valueOf51 = String.valueOf(this.Y);
        String valueOf52 = String.valueOf(this.Z);
        String valueOf53 = String.valueOf(this.aa);
        String valueOf54 = String.valueOf(this.ab);
        String valueOf55 = String.valueOf(this.ac);
        String valueOf56 = String.valueOf(this.ad);
        String valueOf57 = String.valueOf(this.ae);
        String valueOf58 = String.valueOf(this.af);
        String valueOf59 = String.valueOf(this.ag);
        byte[] bArr = this.ah;
        if (bArr != null) {
            str = String.valueOf(bArr.length);
        } else {
            str = "NULL";
        }
        return String.format(locale, "MessageAnnotationJoinConversations [messages_annotations.messages_annotations__id: %s,\n  messages_annotations.messages_annotations_conversation_id: %s,\n  messages_annotations.messages_annotations_message_id: %s,\n  messages_annotations.messages_annotations_annotation_type: %s,\n  messages_annotations.messages_annotations_annotation_details: %s,\n  conversations.conversations__id: %s,\n  conversations.conversations_sms_thread_id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_name_is_automatic: %s,\n  conversations.conversations_subtitle: %s,\n  conversations.conversations_latest_message_id: %s,\n  conversations.conversations_snippet_text: %s,\n  conversations.conversations_subject_text: %s,\n  conversations.conversations_preview_uri: %s,\n  conversations.conversations_preview_content_type: %s,\n  conversations.conversations_show_draft: %s,\n  conversations.conversations_draft_snippet_text: %s,\n  conversations.conversations_draft_subject_text: %s,\n  conversations.conversations_draft_preview_uri: %s,\n  conversations.conversations_draft_preview_content_type: %s,\n  conversations.conversations_etouffee_default: %s,\n  conversations.conversations_archive_status: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_last_read_timestamp: %s,\n  conversations.conversations_icon: %s,\n  conversations.conversations_participant_contact_id: %s,\n  conversations.conversations_normalized_participant_contact_id: %s,\n  conversations.conversations_participant_lookup_key: %s,\n  conversations.conversations_normalized_participant_lookup_key: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_participant_comparable_destination: %s,\n  conversations.conversations_current_self_id: %s,\n  conversations.conversations_current_my_identity_foreign_key: %s,\n  conversations.conversations_destination_token: %s,\n  conversations.conversations_participant_count: %s,\n  conversations.conversations_notification_enabled: %s,\n  conversations.conversations_notification_sound_uri: %s,\n  conversations.conversations_notification_vibration: %s,\n  conversations.conversations_include_email_addr: %s,\n  conversations.conversations_sms_service_center: %s,\n  conversations.conversations_participant_id_list: %s,\n  conversations.conversations_normalized_participant_id_list: %s,\n  conversations.conversations_source_type: %s,\n  conversations.conversations_rcs_session_id: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_send_mode: %s,\n  conversations.conversations_IS_ENTERPRISE: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_last_interactive_event_timestamp: %s,\n  conversations.conversations_participant_display_destination: %s,\n  conversations.conversations_normalized_participant_display_destination: %s,\n  conversations.conversations_spam_warning_dismiss_status: %s,\n  conversations.conversations_open_count: %s,\n  conversations.conversations_last_logged_scooby_metadata_timestamp: %s,\n  conversations.conversations_delete_timestamp: %s,\n  conversations.conversations_cms_id: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_conference_uri: %s,\n  conversations.conversations_tachygram_group_routing_info_token: %s,\n  conversations.conversations_cms_most_recent_read_message_timestamp_ms: %s,\n  conversations.conversations_rcs_subject_change_timestamp_ms: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_rcs_group_capabilities: %s,\n  conversations.conversations_awaiting_reverse_sync: %s,\n  conversations.conversations_duplicate_of: %s,\n  conversations.conversations_new_duplicate_of: %s,\n  conversations.conversations_error_state: %s,\n  conversations.conversations_cms_life_cycle: %s,\n  conversations.conversations_rcs_group_self_msisdn: %s,\n  conversations.conversations_recipient_offline_timestamp_ms: %s,\n  conversations.conversations_rcs_group_last_sync_timestamp: %s,\n  conversations.conversations_has_been_e2ee: %s,\n  conversations.conversations_marked_as_unread: %s,\n  conversations.conversations_custom_theme: %s,\n  conversations.conversations_mms_group_upgrade_status: %s,\n  conversations.conversations_mms_group_upgrade_retries: %s,\n  conversations.conversations_encryption_protocol: %s,\n  conversations.conversations_encryption_id: %s,\n  conversations.conversations_cms_correlation_id: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, valueOf46, valueOf47, valueOf48, valueOf49, valueOf50, valueOf51, valueOf52, valueOf53, valueOf54, valueOf55, valueOf56, valueOf57, valueOf58, valueOf59, "BLOB".concat(String.valueOf(str)), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar), String.valueOf(this.as), String.valueOf(this.at), String.valueOf(this.au), String.valueOf(this.av), String.valueOf(this.aw), String.valueOf(this.ax), String.valueOf(this.ay), String.valueOf(this.az), String.valueOf(this.aA), String.valueOf(this.aB));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        valueOf.intValue();
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Uri parse;
        boolean z10;
        Uri parse2;
        aqby aqbyVar;
        lbz lbzVar = (lbz) agmqVar;
        aq();
        this.cJ = lbzVar.dx();
        boolean z11 = false;
        if (lbzVar.db(0)) {
            this.a = lbzVar.getString(lbzVar.cI(0, scp.a));
            fE(0);
        }
        if (lbzVar.db(1)) {
            this.b = ruy.b(lbzVar.getString(lbzVar.cI(1, scp.a)));
            fE(1);
        }
        if (lbzVar.db(2)) {
            this.c = new MessageIdType(lbzVar.getLong(lbzVar.cI(2, scp.a)));
            fE(2);
        }
        if (lbzVar.db(3)) {
            this.d = lbzVar.getInt(lbzVar.cI(3, scp.a));
            fE(3);
        }
        vst vstVar = null;
        if (lbzVar.db(4)) {
            byte[] blob = lbzVar.getBlob(lbzVar.cI(4, scp.a));
            if (blob == null) {
                aqbyVar = null;
            } else {
                try {
                    aqbyVar = (aqby) apag.parseFrom(aqby.a, blob, aozs.a());
                } catch (Throwable unused) {
                    aqbyVar = aqby.a;
                }
            }
            this.e = aqbyVar;
            fE(4);
        }
        if (lbzVar.db(5)) {
            this.f = new ConversationIdType(lbzVar.getLong(lbzVar.cI(5, scp.a)));
            fE(5);
        }
        if (lbzVar.db(6)) {
            this.g = xhv.b(lbzVar.getLong(lbzVar.cI(6, scp.a)));
            fE(6);
        }
        if (lbzVar.db(7)) {
            this.h = lbzVar.getString(lbzVar.cI(7, scp.a));
            fE(7);
        }
        if (lbzVar.db(8)) {
            tqh[] values = tqh.values();
            int i = lbzVar.getInt(lbzVar.cI(8, scp.a));
            if (i < values.length) {
                this.i = values[i];
                fE(8);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(9)) {
            this.j = lbzVar.getString(lbzVar.cI(9, scp.a));
            fE(9);
        }
        if (lbzVar.db(10)) {
            this.k = new MessageIdType(lbzVar.getLong(lbzVar.cI(10, scp.a)));
            fE(10);
        }
        if (lbzVar.db(11)) {
            this.l = yta.a(lbzVar.getString(lbzVar.cI(11, scp.a)));
            fE(11);
        }
        if (lbzVar.db(12)) {
            this.m = yta.a(lbzVar.getString(lbzVar.cI(12, scp.a)));
            fE(12);
        }
        if (lbzVar.db(13)) {
            String string = lbzVar.getString(lbzVar.cI(13, scp.a));
            if (string == null) {
                parse2 = null;
            } else {
                parse2 = Uri.parse(string);
            }
            this.n = parse2;
            fE(13);
        }
        if (lbzVar.db(14)) {
            this.o = lbzVar.getString(lbzVar.cI(14, scp.a));
            fE(14);
        }
        if (lbzVar.db(15)) {
            if (lbzVar.getInt(lbzVar.cI(15, scp.a)) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.p = z10;
            fE(15);
        }
        if (lbzVar.db(16)) {
            this.q = yta.a(lbzVar.getString(lbzVar.cI(16, scp.a)));
            fE(16);
        }
        if (lbzVar.db(17)) {
            this.r = yta.a(lbzVar.getString(lbzVar.cI(17, scp.a)));
            fE(17);
        }
        if (lbzVar.db(18)) {
            String string2 = lbzVar.getString(lbzVar.cI(18, scp.a));
            if (string2 == null) {
                parse = null;
            } else {
                parse = Uri.parse(string2);
            }
            this.s = parse;
            fE(18);
        }
        if (lbzVar.db(19)) {
            this.t = lbzVar.getString(lbzVar.cI(19, scp.a));
            fE(19);
        }
        if (lbzVar.db(20)) {
            this.u = lbzVar.getInt(lbzVar.cI(20, scp.a));
            fE(20);
        }
        if (lbzVar.db(21)) {
            this.v = tqc.a(lbzVar.getInt(lbzVar.cI(21, scp.a)));
            fE(21);
        }
        if (lbzVar.db(22)) {
            this.w = lbzVar.getLong(lbzVar.cI(22, scp.a));
            fE(22);
        }
        if (lbzVar.db(23)) {
            this.x = lbzVar.getLong(lbzVar.cI(23, scp.a));
            fE(23);
        }
        if (lbzVar.db(24)) {
            this.y = lbzVar.getString(lbzVar.cI(24, scp.a));
            fE(24);
        }
        if (lbzVar.db(25)) {
            this.z = lbzVar.getLong(lbzVar.cI(25, scp.a));
            fE(25);
        }
        if (lbzVar.db(26)) {
            this.A = lbzVar.getLong(lbzVar.cI(26, scp.a));
            fE(26);
        }
        if (lbzVar.db(27)) {
            this.B = lbzVar.getString(lbzVar.cI(27, scp.a));
            fE(27);
        }
        if (lbzVar.db(28)) {
            this.C = lbzVar.getString(lbzVar.cI(28, scp.a));
            fE(28);
        }
        if (lbzVar.db(29)) {
            this.D = lbzVar.getString(lbzVar.cI(29, scp.a));
            fE(29);
        }
        if (lbzVar.db(30)) {
            this.E = lbzVar.getString(lbzVar.cI(30, scp.a));
            fE(30);
        }
        if (lbzVar.db(31)) {
            this.F = lbzVar.getString(lbzVar.cI(31, scp.a));
            fE(31);
        }
        if (lbzVar.db(32)) {
            this.G = riw.m(lbzVar.getString(lbzVar.cI(32, scp.a)));
            fE(32);
        }
        if (lbzVar.db(33)) {
            this.H = qta.d(lbzVar.getString(lbzVar.cI(33, scp.a)));
            fE(33);
        }
        if (lbzVar.db(34)) {
            this.I = lbzVar.getInt(lbzVar.cI(34, scp.a));
            fE(34);
        }
        if (lbzVar.db(35)) {
            if (lbzVar.getInt(lbzVar.cI(35, scp.a)) == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.J = z9;
            fE(35);
        }
        if (lbzVar.db(36)) {
            this.K = lbzVar.getString(lbzVar.cI(36, scp.a));
            fE(36);
        }
        if (lbzVar.db(37)) {
            if (lbzVar.getInt(lbzVar.cI(37, scp.a)) == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.L = z8;
            fE(37);
        }
        if (lbzVar.db(38)) {
            if (lbzVar.getInt(lbzVar.cI(38, scp.a)) == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.M = z7;
            fE(38);
        }
        if (lbzVar.db(39)) {
            this.N = lbzVar.getString(lbzVar.cI(39, scp.a));
            fE(39);
        }
        if (lbzVar.db(40)) {
            this.O = lbzVar.getString(lbzVar.cI(40, scp.a));
            fE(40);
        }
        if (lbzVar.db(41)) {
            this.P = lbzVar.getString(lbzVar.cI(41, scp.a));
            fE(41);
        }
        if (lbzVar.db(42)) {
            this.Q = lbzVar.getInt(lbzVar.cI(42, scp.a));
            fE(42);
        }
        if (lbzVar.db(43)) {
            this.R = lbzVar.getLong(lbzVar.cI(43, scp.a));
            fE(43);
        }
        if (lbzVar.db(44)) {
            this.S = lbzVar.getInt(lbzVar.cI(44, scp.a));
            fE(44);
        }
        if (lbzVar.db(45)) {
            this.T = lbzVar.getInt(lbzVar.cI(45, scp.a));
            fE(45);
        }
        if (lbzVar.db(46)) {
            this.U = lbzVar.getInt(lbzVar.cI(46, scp.a));
            fE(46);
        }
        if (lbzVar.db(47)) {
            if (lbzVar.getInt(lbzVar.cI(47, scp.a)) == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.V = z6;
            fE(47);
        }
        if (lbzVar.db(48)) {
            if (lbzVar.getInt(lbzVar.cI(48, scp.a)) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.W = z5;
            fE(48);
        }
        if (lbzVar.db(49)) {
            this.X = lbzVar.getLong(lbzVar.cI(49, scp.a));
            fE(49);
        }
        if (lbzVar.db(50)) {
            this.Y = yta.a(lbzVar.getString(lbzVar.cI(50, scp.a)));
            fE(50);
        }
        if (lbzVar.db(51)) {
            this.Z = yta.a(lbzVar.getString(lbzVar.cI(51, scp.a)));
            fE(51);
        }
        if (lbzVar.db(52)) {
            if (lbzVar.getInt(lbzVar.cI(52, scp.a)) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.aa = z4;
            fE(52);
        }
        if (lbzVar.db(53)) {
            this.ab = lbzVar.getInt(lbzVar.cI(53, scp.a));
            fE(53);
        }
        if (lbzVar.db(54)) {
            this.ac = lbzVar.getLong(lbzVar.cI(54, scp.a));
            fE(54);
        }
        if (lbzVar.db(55)) {
            this.ad = lbzVar.getLong(lbzVar.cI(55, scp.a));
            fE(55);
        }
        if (lbzVar.db(56)) {
            this.ae = lbzVar.getString(lbzVar.cI(56, scp.a));
            fE(56);
        }
        if (lbzVar.db(57)) {
            this.af = lbzVar.getString(lbzVar.cI(57, scp.a));
            fE(57);
        }
        if (lbzVar.db(58)) {
            this.ag = yyb.j(lbzVar.getString(lbzVar.cI(58, scp.a)));
            fE(58);
        }
        if (lbzVar.db(59)) {
            this.ah = lbzVar.getBlob(lbzVar.cI(59, scp.a));
            fE(59);
        }
        if (lbzVar.db(60)) {
            this.ai = lbzVar.getLong(lbzVar.cI(60, scp.a));
            fE(60);
        }
        if (lbzVar.db(61)) {
            this.aj = lbzVar.getLong(lbzVar.cI(61, scp.a));
            fE(61);
        }
        if (lbzVar.db(62)) {
            if (lbzVar.getInt(lbzVar.cI(62, scp.a)) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.ak = z3;
            fE(62);
        }
        if (lbzVar.db(63)) {
            this.al = new vtm(lbzVar.getLong(lbzVar.cI(63, scp.a)));
            fE(63);
        }
        if (lbzVar.db(64)) {
            if (lbzVar.getInt(lbzVar.cI(64, scp.a)) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.am = z2;
            fE(64);
        }
        if (lbzVar.db(65)) {
            this.an = new ConversationIdType(lbzVar.getLong(lbzVar.cI(65, scp.a)));
            fE(65);
        }
        if (lbzVar.db(66)) {
            this.ao = new ConversationIdType(lbzVar.getLong(lbzVar.cI(66, scp.a)));
            fE(66);
        }
        if (lbzVar.db(67)) {
            this.ap = qpd.b(lbzVar.getInt(lbzVar.cI(67, scp.a)));
            fE(67);
        }
        if (lbzVar.db(68)) {
            xxw[] values2 = xxw.values();
            int i2 = lbzVar.getInt(lbzVar.cI(68, scp.a));
            if (i2 < values2.length) {
                this.aq = values2[i2];
                fE(68);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(69)) {
            this.ar = lbzVar.getString(lbzVar.cI(69, scp.a));
            fE(69);
        }
        if (lbzVar.db(70)) {
            this.as = uxi.g(lbzVar.getLong(lbzVar.cI(70, scp.a)));
            fE(70);
        }
        if (lbzVar.db(71)) {
            this.at = uxi.g(lbzVar.getLong(lbzVar.cI(71, scp.a)));
            fE(71);
        }
        if (lbzVar.db(72)) {
            if (lbzVar.getInt(lbzVar.cI(72, scp.a)) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.au = z;
            fE(72);
        }
        if (lbzVar.db(73)) {
            if (lbzVar.getInt(lbzVar.cI(73, scp.a)) == 1) {
                z11 = true;
            }
            this.av = z11;
            fE(73);
        }
        if (lbzVar.db(74)) {
            byte[] blob2 = lbzVar.getBlob(lbzVar.cI(74, scp.a));
            if (blob2 != null) {
                try {
                    vstVar = (vst) apag.parseFrom(vst.a, blob2, aozs.a());
                } catch (Throwable unused2) {
                    vstVar = vst.a;
                }
            }
            this.aw = vstVar;
            fE(74);
        }
        if (lbzVar.db(75)) {
            vvh[] values3 = vvh.values();
            int i3 = lbzVar.getInt(lbzVar.cI(75, scp.a));
            if (i3 < values3.length) {
                this.ax = values3[i3];
                fE(75);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(76)) {
            this.ay = lbzVar.getInt(lbzVar.cI(76, scp.a));
            fE(76);
        }
        if (lbzVar.db(77)) {
            utk[] values4 = utk.values();
            int i4 = lbzVar.getInt(lbzVar.cI(77, scp.a));
            if (i4 < values4.length) {
                this.az = values4[i4];
                fE(77);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(78)) {
            this.aA = utj.a(lbzVar.getString(lbzVar.cI(78, scp.a)));
            fE(78);
        }
        if (lbzVar.db(79)) {
            this.aB = lbzVar.getString(lbzVar.cI(79, scp.a));
            fE(79);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof scl)) {
            return false;
        }
        scl sclVar = (scl) obj;
        if (super.aC(sclVar.cJ) && Objects.equals(this.a, sclVar.a) && Objects.equals(this.b, sclVar.b) && Objects.equals(this.c, sclVar.c) && this.d == sclVar.d && Objects.equals(this.e, sclVar.e) && Objects.equals(this.f, sclVar.f) && Objects.equals(this.g, sclVar.g) && Objects.equals(this.h, sclVar.h) && this.i == sclVar.i && Objects.equals(this.j, sclVar.j) && Objects.equals(this.k, sclVar.k) && Objects.equals(this.l, sclVar.l) && Objects.equals(this.m, sclVar.m) && Objects.equals(this.n, sclVar.n) && Objects.equals(this.o, sclVar.o) && this.p == sclVar.p && Objects.equals(this.q, sclVar.q) && Objects.equals(this.r, sclVar.r) && Objects.equals(this.s, sclVar.s) && Objects.equals(this.t, sclVar.t) && this.u == sclVar.u && this.v == sclVar.v && this.w == sclVar.w && this.x == sclVar.x && Objects.equals(this.y, sclVar.y) && this.z == sclVar.z && this.A == sclVar.A && Objects.equals(this.B, sclVar.B) && Objects.equals(this.C, sclVar.C) && Objects.equals(this.D, sclVar.D) && Objects.equals(this.E, sclVar.E) && Objects.equals(this.F, sclVar.F) && Objects.equals(this.G, sclVar.G) && Objects.equals(this.H, sclVar.H) && this.I == sclVar.I && this.J == sclVar.J && Objects.equals(this.K, sclVar.K) && this.L == sclVar.L && this.M == sclVar.M && Objects.equals(this.N, sclVar.N) && Objects.equals(this.O, sclVar.O) && Objects.equals(this.P, sclVar.P) && this.Q == sclVar.Q && this.R == sclVar.R && this.S == sclVar.S && this.T == sclVar.T && this.U == sclVar.U && this.V == sclVar.V && this.W == sclVar.W && this.X == sclVar.X && Objects.equals(this.Y, sclVar.Y) && Objects.equals(this.Z, sclVar.Z) && this.aa == sclVar.aa && this.ab == sclVar.ab && this.ac == sclVar.ac && this.ad == sclVar.ad && Objects.equals(this.ae, sclVar.ae) && Objects.equals(this.af, sclVar.af) && Objects.equals(this.ag, sclVar.ag) && Arrays.equals(this.ah, sclVar.ah) && this.ai == sclVar.ai && this.aj == sclVar.aj && this.ak == sclVar.ak && Objects.equals(this.al, sclVar.al) && this.am == sclVar.am && Objects.equals(this.an, sclVar.an) && Objects.equals(this.ao, sclVar.ao) && this.ap == sclVar.ap && this.aq == sclVar.aq && Objects.equals(this.ar, sclVar.ar) && Objects.equals(this.as, sclVar.as) && Objects.equals(this.at, sclVar.at) && this.au == sclVar.au && this.av == sclVar.av && Objects.equals(this.aw, sclVar.aw) && this.ax == sclVar.ax && this.ay == sclVar.ay && this.az == sclVar.az && Objects.equals(this.aA, sclVar.aA) && Objects.equals(this.aB, sclVar.aB)) {
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
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        String str = this.a;
        ConversationIdType conversationIdType = this.b;
        MessageIdType messageIdType = this.c;
        Integer valueOf = Integer.valueOf(this.d);
        aqby aqbyVar = this.e;
        ConversationIdType conversationIdType2 = this.f;
        xhv xhvVar = this.g;
        String str2 = this.h;
        tqh tqhVar = this.i;
        if (tqhVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqhVar.ordinal();
        }
        Integer valueOf2 = Integer.valueOf(ordinal);
        String str3 = this.j;
        MessageIdType messageIdType2 = this.k;
        String str4 = this.l;
        String str5 = this.m;
        Uri uri = this.n;
        String str6 = this.o;
        Boolean valueOf3 = Boolean.valueOf(this.p);
        String str7 = this.q;
        String str8 = this.r;
        Uri uri2 = this.s;
        String str9 = this.t;
        Integer valueOf4 = Integer.valueOf(this.u);
        tqc tqcVar = this.v;
        Long valueOf5 = Long.valueOf(this.w);
        Long valueOf6 = Long.valueOf(this.x);
        String str10 = this.y;
        Long valueOf7 = Long.valueOf(this.z);
        Long valueOf8 = Long.valueOf(this.A);
        String str11 = this.B;
        String str12 = this.C;
        String str13 = this.D;
        String str14 = this.E;
        String str15 = this.F;
        qwe qweVar = this.G;
        qss qssVar = this.H;
        Integer valueOf9 = Integer.valueOf(this.I);
        Boolean valueOf10 = Boolean.valueOf(this.J);
        String str16 = this.K;
        Boolean valueOf11 = Boolean.valueOf(this.L);
        Boolean valueOf12 = Boolean.valueOf(this.M);
        String str17 = this.N;
        String str18 = this.O;
        String str19 = this.P;
        Integer valueOf13 = Integer.valueOf(this.Q);
        Long valueOf14 = Long.valueOf(this.R);
        Integer valueOf15 = Integer.valueOf(this.S);
        Integer valueOf16 = Integer.valueOf(this.T);
        Integer valueOf17 = Integer.valueOf(this.U);
        Boolean valueOf18 = Boolean.valueOf(this.V);
        Boolean valueOf19 = Boolean.valueOf(this.W);
        Long valueOf20 = Long.valueOf(this.X);
        String str20 = this.Y;
        String str21 = this.Z;
        Boolean valueOf21 = Boolean.valueOf(this.aa);
        Integer valueOf22 = Integer.valueOf(this.ab);
        Long valueOf23 = Long.valueOf(this.ac);
        Long valueOf24 = Long.valueOf(this.ad);
        String str22 = this.ae;
        String str23 = this.af;
        String str24 = this.ag;
        Integer valueOf25 = Integer.valueOf(Arrays.hashCode(this.ah));
        Long valueOf26 = Long.valueOf(this.ai);
        Long valueOf27 = Long.valueOf(this.aj);
        Boolean valueOf28 = Boolean.valueOf(this.ak);
        vtm vtmVar = this.al;
        Boolean valueOf29 = Boolean.valueOf(this.am);
        ConversationIdType conversationIdType3 = this.an;
        ConversationIdType conversationIdType4 = this.ao;
        qpd qpdVar = this.ap;
        xxw xxwVar = this.aq;
        if (xxwVar == null) {
            ordinal2 = 0;
        } else {
            ordinal2 = xxwVar.ordinal();
        }
        Integer valueOf30 = Integer.valueOf(ordinal2);
        String str25 = this.ar;
        Optional optional = this.as;
        Optional optional2 = this.at;
        Boolean valueOf31 = Boolean.valueOf(this.au);
        Boolean valueOf32 = Boolean.valueOf(this.av);
        vst vstVar = this.aw;
        vvh vvhVar = this.ax;
        if (vvhVar == null) {
            ordinal3 = 0;
        } else {
            ordinal3 = vvhVar.ordinal();
        }
        Integer valueOf33 = Integer.valueOf(ordinal3);
        Integer valueOf34 = Integer.valueOf(this.ay);
        utk utkVar = this.az;
        if (utkVar == null) {
            ordinal4 = 0;
        } else {
            ordinal4 = utkVar.ordinal();
        }
        return Objects.hash(adayVar, str, conversationIdType, messageIdType, valueOf, aqbyVar, conversationIdType2, xhvVar, str2, valueOf2, str3, messageIdType2, str4, str5, uri, str6, valueOf3, str7, str8, uri2, str9, valueOf4, tqcVar, valueOf5, valueOf6, str10, valueOf7, valueOf8, str11, str12, str13, str14, str15, qweVar, qssVar, valueOf9, valueOf10, str16, valueOf11, valueOf12, str17, str18, str19, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, str20, str21, valueOf21, valueOf22, valueOf23, valueOf24, str22, str23, str24, valueOf25, valueOf26, valueOf27, valueOf28, vtmVar, valueOf29, conversationIdType3, conversationIdType4, qpdVar, valueOf30, str25, optional, optional2, valueOf31, valueOf32, vstVar, valueOf33, valueOf34, Integer.valueOf(ordinal4), this.aA, this.aB, null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "MessageAnnotationJoinConversations -- REDACTED");
        }
        return a();
    }
}
