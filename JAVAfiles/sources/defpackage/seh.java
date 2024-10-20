package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class seh extends aglz {
    private String B;
    private String H;
    private String K;
    private String L;
    private String M;
    private long N;
    private String S;
    private byte[] T;
    private apwq V;
    private String W;
    private String X;
    private String aA;
    private String aB;
    private String aC;
    private Uri aD;
    private Uri aE;
    private long aF;
    private String aG;
    private int aH;
    private int aI;
    private int aJ;
    private boolean aK;
    private String aL;
    private int aM;
    private String aN;
    private int aO;
    private int aP;
    private String aQ;
    private boolean aR;
    private int aS;
    private String aT;
    private tqr aU;
    private String aV;
    private byte[] aW;
    private long aX;
    private boolean aY;
    private boolean aZ;
    private Uri aa;
    private atok ah;
    private tqp ai;
    private tqp aj;
    private tqu ak;
    private int al;
    private ruz am;
    private utk an;
    private Optional ao;
    private String ap;
    private qwe aq;
    private qwe ar;
    private int as;
    private int at;
    private String au;
    private String av;
    private String aw;
    private String ax;
    private String ay;
    private long az;
    private long bA;
    private String bB;
    private long bC;
    private long bD;
    private String bE;
    private String bF;
    private String bG;
    private String bH;
    private String bI;
    private qwe bJ;
    private qss bK;
    private int bL;
    private boolean bM;
    private String bN;
    private boolean bO;
    private boolean bP;
    private String bQ;
    private String bR;
    private String bS;
    private int bT;
    private long bU;
    private int bV;
    private int bW;
    private int bX;
    private boolean bY;
    private boolean bZ;
    private String ba;
    private xxw bb;
    private mta bc;
    private rxg bd;
    private vox be;
    private vox bf;
    private vov bg;
    private ndp bh;
    private ConversationIdType bi;
    private xhv bj;
    private String bk;
    private tqh bl;
    private String bm;
    private MessageIdType bn;
    private String bo;
    private String bp;
    private Uri bq;
    private String br;
    private boolean bs;
    private String bt;
    private String bu;
    private Uri bv;
    private String bw;
    private int bx;
    private tqc by;
    private long bz;
    private String c;
    private vvh cA;
    private int cB;
    private utk cC;
    private utj cD;
    private String cK;
    private long ca;
    private String cb;
    private String cc;
    private boolean cd;
    private int ce;
    private long cf;
    private long cg;
    private String ch;
    private String ci;
    private String cj;
    private byte[] ck;
    private long cl;
    private long cm;
    private boolean cn;
    private vtm co;
    private boolean cp;
    private ConversationIdType cq;
    private ConversationIdType cr;
    private qpd cs;
    private xxw ct;
    private String cu;
    private Optional cv;
    private Optional cw;
    private boolean cx;
    private boolean cy;
    private vst cz;
    private String d;
    private String e;
    private String f;
    private Uri o;
    private String r;
    private String s;
    private String t;
    private String w;
    private String y;
    private MessageIdType a = rvc.a;
    private ConversationIdType b = ruy.a;
    private long g = 0;
    private Instant h = uzz.l(0);
    private long i = 0;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private boolean m = false;
    private boolean n = false;
    private int p = 0;
    private long q = 0;
    private long u = 0;
    private long v = 0;
    private int x = 0;
    private qwe z = null;
    private long A = 0;
    private rve C = rve.a;
    private int D = 0;
    private tqr E = tqr.VERIFICATION_NA;
    private int F = 0;
    private boolean G = false;
    private long I = -1;
    private int J = -1;
    private String O = "";
    private long P = 0;
    private long Q = 1;
    private rve R = rve.a;
    private long U = 0;
    private MessageIdType Y = rvc.a;
    private boolean Z = false;
    private Optional ab = rvg.a;
    private int ac = -2;
    private xxw ad = xxw.UNKNOWN;
    private tqf ae = tqf.UNKNOWN;
    private int af = 0;
    private boolean ag = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public seh() {
        tqp tqpVar = tqp.UNKNOWN;
        this.ai = tqpVar;
        this.aj = tqpVar;
        this.ak = tqu.UNKNOWN;
        this.al = -1;
        this.am = ruz.a;
        this.an = utk.a;
        this.ao = uzz.j();
        this.aq = null;
        this.ar = null;
        this.as = -2;
        this.at = -1;
        this.aF = -1L;
        this.aH = -1;
        this.aI = 0;
        this.aJ = 0;
        this.aK = false;
        this.aM = 0;
        this.aO = 0;
        this.aP = 0;
        this.aR = false;
        this.aS = 0;
        this.aU = tqr.VERIFICATION_NA;
        this.aX = -1L;
        this.aY = riw.j();
        this.aZ = true;
        this.bb = xxw.UNKNOWN;
        this.bc = mta.NOT_MODIFIED;
        this.bd = rxi.a();
        vox voxVar = vox.PROFILE_CONTACT_SOURCE;
        this.be = voxVar;
        this.bf = voxVar;
        this.bg = vov.PREFER_PROFILE_PHOTO;
        this.bi = ruy.a;
        this.bj = new xhv();
        this.bl = tqh.NAME_IS_AUTOMATIC;
        this.bn = rvc.a;
        this.bs = false;
        this.bx = 0;
        this.by = tqc.UNARCHIVED;
        this.bz = 0L;
        this.bA = 0L;
        this.bC = -1L;
        this.bD = -1L;
        this.bJ = null;
        this.bK = null;
        this.bL = 0;
        this.bM = true;
        this.bO = true;
        this.bP = false;
        this.bT = 0;
        this.bU = -1L;
        this.bV = 0;
        this.bW = 0;
        this.bX = 0;
        this.bY = false;
        this.bZ = false;
        this.ca = 0L;
        this.cd = false;
        this.ce = 0;
        this.cf = 0L;
        this.cg = 0L;
        this.cl = 0L;
        this.cm = -1L;
        this.cn = true;
        this.co = new vtm(0L);
        this.cp = false;
        ConversationIdType conversationIdType = ruy.a;
        this.cq = conversationIdType;
        this.cr = conversationIdType;
        this.cs = qpd.b(0);
        this.ct = xxw.UNKNOWN;
        this.cv = uxi.g(-1L);
        this.cw = uxi.g(-1L);
        this.cx = false;
        this.cy = false;
        this.cA = vvh.a;
        this.cB = 0;
        this.cC = utk.a;
        this.cD = null;
    }

    @Override // defpackage.aglz
    public final String a() {
        String str;
        String str2;
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
        byte[] bArr = this.T;
        String str3 = "NULL";
        if (bArr == null) {
            str = "NULL";
        } else {
            str = String.valueOf(bArr.length);
        }
        String concat = "BLOB".concat(String.valueOf(str));
        String valueOf46 = String.valueOf(this.U);
        String valueOf47 = String.valueOf(this.V);
        String valueOf48 = String.valueOf(this.W);
        String valueOf49 = String.valueOf(this.X);
        String valueOf50 = String.valueOf(this.Y);
        String valueOf51 = String.valueOf(this.Z);
        String valueOf52 = String.valueOf(this.aa);
        String valueOf53 = String.valueOf(this.ab);
        String valueOf54 = String.valueOf(this.ac);
        String valueOf55 = String.valueOf(this.ad);
        String valueOf56 = String.valueOf(this.ae);
        String valueOf57 = String.valueOf(this.af);
        String valueOf58 = String.valueOf(this.ag);
        String valueOf59 = String.valueOf(this.ah);
        String valueOf60 = String.valueOf(this.ai);
        String valueOf61 = String.valueOf(this.aj);
        String valueOf62 = String.valueOf(this.ak);
        String valueOf63 = String.valueOf(this.al);
        String valueOf64 = String.valueOf(this.am);
        String valueOf65 = String.valueOf(this.an);
        String valueOf66 = String.valueOf(this.ao);
        String valueOf67 = String.valueOf(this.ap);
        String valueOf68 = String.valueOf(this.aq);
        String valueOf69 = String.valueOf(this.ar);
        String valueOf70 = String.valueOf(this.as);
        String valueOf71 = String.valueOf(this.at);
        String valueOf72 = String.valueOf(this.au);
        String valueOf73 = String.valueOf(this.av);
        String valueOf74 = String.valueOf(this.aw);
        String valueOf75 = String.valueOf(this.ax);
        String valueOf76 = String.valueOf(this.ay);
        String valueOf77 = String.valueOf(this.az);
        String valueOf78 = String.valueOf(this.aA);
        String valueOf79 = String.valueOf(this.aB);
        String valueOf80 = String.valueOf(this.aC);
        String valueOf81 = String.valueOf(this.aD);
        String valueOf82 = String.valueOf(this.aE);
        String valueOf83 = String.valueOf(this.aF);
        String valueOf84 = String.valueOf(this.aG);
        String valueOf85 = String.valueOf(this.aH);
        String valueOf86 = String.valueOf(this.aI);
        String valueOf87 = String.valueOf(this.aJ);
        String valueOf88 = String.valueOf(this.aK);
        String valueOf89 = String.valueOf(this.aL);
        String valueOf90 = String.valueOf(this.aM);
        String valueOf91 = String.valueOf(this.aN);
        String valueOf92 = String.valueOf(this.aO);
        String valueOf93 = String.valueOf(this.aP);
        String valueOf94 = String.valueOf(this.aQ);
        String valueOf95 = String.valueOf(this.aR);
        String valueOf96 = String.valueOf(this.aS);
        String valueOf97 = String.valueOf(this.aT);
        String valueOf98 = String.valueOf(this.aU);
        String valueOf99 = String.valueOf(this.aV);
        byte[] bArr2 = this.aW;
        if (bArr2 == null) {
            str2 = "NULL";
        } else {
            str2 = String.valueOf(bArr2.length);
        }
        String concat2 = "BLOB".concat(String.valueOf(str2));
        String valueOf100 = String.valueOf(this.aX);
        String valueOf101 = String.valueOf(this.aY);
        String valueOf102 = String.valueOf(this.aZ);
        String valueOf103 = String.valueOf(this.ba);
        String valueOf104 = String.valueOf(this.bb);
        String valueOf105 = String.valueOf(this.bc);
        String valueOf106 = String.valueOf(this.bd);
        String valueOf107 = String.valueOf(this.be);
        String valueOf108 = String.valueOf(this.bf);
        String valueOf109 = String.valueOf(this.bg);
        String valueOf110 = String.valueOf(this.bh);
        String valueOf111 = String.valueOf(this.bi);
        String valueOf112 = String.valueOf(this.bj);
        String valueOf113 = String.valueOf(this.bk);
        String valueOf114 = String.valueOf(this.bl);
        String valueOf115 = String.valueOf(this.bm);
        String valueOf116 = String.valueOf(this.bn);
        String valueOf117 = String.valueOf(this.bo);
        String valueOf118 = String.valueOf(this.bp);
        String valueOf119 = String.valueOf(this.bq);
        String valueOf120 = String.valueOf(this.br);
        String valueOf121 = String.valueOf(this.bs);
        String valueOf122 = String.valueOf(this.bt);
        String valueOf123 = String.valueOf(this.bu);
        String valueOf124 = String.valueOf(this.bv);
        String valueOf125 = String.valueOf(this.bw);
        String valueOf126 = String.valueOf(this.bx);
        String valueOf127 = String.valueOf(this.by);
        String valueOf128 = String.valueOf(this.bz);
        String valueOf129 = String.valueOf(this.bA);
        String valueOf130 = String.valueOf(this.bB);
        String valueOf131 = String.valueOf(this.bC);
        String valueOf132 = String.valueOf(this.bD);
        String valueOf133 = String.valueOf(this.bE);
        String valueOf134 = String.valueOf(this.bF);
        String valueOf135 = String.valueOf(this.bG);
        String valueOf136 = String.valueOf(this.bH);
        String valueOf137 = String.valueOf(this.bI);
        String valueOf138 = String.valueOf(this.bJ);
        String valueOf139 = String.valueOf(this.bK);
        String valueOf140 = String.valueOf(this.bL);
        String valueOf141 = String.valueOf(this.bM);
        String valueOf142 = String.valueOf(this.bN);
        String valueOf143 = String.valueOf(this.bO);
        String valueOf144 = String.valueOf(this.bP);
        String valueOf145 = String.valueOf(this.bQ);
        String valueOf146 = String.valueOf(this.bR);
        String valueOf147 = String.valueOf(this.bS);
        String valueOf148 = String.valueOf(this.bT);
        String valueOf149 = String.valueOf(this.bU);
        String valueOf150 = String.valueOf(this.bV);
        String valueOf151 = String.valueOf(this.bW);
        String valueOf152 = String.valueOf(this.bX);
        String valueOf153 = String.valueOf(this.bY);
        String valueOf154 = String.valueOf(this.bZ);
        String valueOf155 = String.valueOf(this.ca);
        String valueOf156 = String.valueOf(this.cb);
        String valueOf157 = String.valueOf(this.cc);
        String valueOf158 = String.valueOf(this.cd);
        String valueOf159 = String.valueOf(this.ce);
        String valueOf160 = String.valueOf(this.cf);
        String valueOf161 = String.valueOf(this.cg);
        String valueOf162 = String.valueOf(this.ch);
        String valueOf163 = String.valueOf(this.ci);
        String valueOf164 = String.valueOf(this.cj);
        byte[] bArr3 = this.ck;
        if (bArr3 != null) {
            str3 = String.valueOf(bArr3.length);
        }
        return String.format(locale, "UnreadQuery [messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_sender_send_destination: %s,\n  messages.messages_msisdn_receiving_rcs_message: %s,\n  messages.messages_receiving_network_country: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_queue_insert_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_message_report_status: %s,\n  messages.messages_seen: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_message_uri: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_sms_message_size: %s,\n  messages.messages_mms_subject: %s,\n  messages.messages_mms_transaction_id: %s,\n  messages.messages_mms_content_location: %s,\n  messages.messages_mms_expiry: %s,\n  messages.messages_rcs_expiry: %s,\n  messages.messages_mms_retrieve_text: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_self_id: %s,\n  messages.messages_my_identity_foreign_key: %s,\n  messages.messages_retry_start_timestamp: %s,\n  messages.messages_cloud_sync_id: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_etouffee_status: %s,\n  messages.messages_verification_status: %s,\n  messages.messages_rcs_ui_status: %s,\n  messages.messages_is_hidden: %s,\n  messages.messages_rcs_remote_instance: %s,\n  messages.messages_rcs_file_transfer_session_id: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  messages.messages_correlation_id: %s,\n  messages.messages_cms_id: %s,\n  messages.messages_cms_last_mod_seq: %s,\n  messages.messages_web_id: %s,\n  messages.messages_usage_stats_logging_id: %s,\n  messages.messages_send_counter: %s,\n  messages.messages_original_rcs_message_id: %s,\n  messages.messages_custom_delivery_receipt_mime_type: %s,\n  messages.messages_custom_delivery_receipt_content: %s,\n  messages.messages_report_attempt_acounter: %s,\n  messages.messages_custom_headers: %s,\n  messages.messages_cms_correlation_id: %s,\n  messages.messages_group_private_participant: %s,\n  messages.messages_original_message_id: %s,\n  messages.messages_awaiting_reverse_sync: %s,\n  messages.messages_old_sms_message_uri: %s,\n  messages.messages_draft_id: %s,\n  messages.messages_result_code: %s,\n  messages.messages_cms_life_cycle: %s,\n  messages.messages_fallback_reason: %s,\n  messages.messages_auto_retry_counter: %s,\n  messages.messages_can_revoke_before_delivered_with_rcs: %s,\n  messages.messages_trace_id: %s,\n  messages.messages_outgoing_delivery_report_status: %s,\n  messages.messages_outgoing_read_report_status: %s,\n  messages.messages_xms_transport: %s,\n  messages.messages_message_original_protocol: %s,\n  messages.messages_satellite_datagram_id: %s,\n  messages.messages_encryption_protocol: %s,\n  messages.messages_message_persistence_id: %s,\n  participants.participants__id: %s,\n  participants.participants_my_identity_token: %s,\n  participants.participants_my_identity_token_foreign_key: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_sim_slot_id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_send_destination: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_comparable_destination: %s,\n  participants.participants_country_code: %s,\n  participants.participants_recipient_id: %s,\n  participants.participants_recipient_canonical_address: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  participants.participants_profile_photo_uri: %s,\n  participants.participants_contact_photo_uri: %s,\n  participants.participants_contact_id: %s,\n  participants.participants_lookup_key: %s,\n  participants.participants_color_palette_index: %s,\n  participants.participants_color_type: %s,\n  participants.participants_extended_color: %s,\n  participants.participants_blocked: %s,\n  participants.participants_subscription_name: %s,\n  participants.participants_subscription_color: %s,\n  participants.participants_contact_destination: %s,\n  participants.participants_participant_type: %s,\n  participants.participants_video_reachability: %s,\n  participants.participants_alias: %s,\n  participants.participants_is_spam: %s,\n  participants.participants_is_spam_source: %s,\n  participants.participants_cms_id: %s,\n  participants.participants_latest_verification_status: %s,\n  participants.participants_profile_photo_blob_id: %s,\n  participants.participants_profile_photo_encryption_key: %s,\n  participants.participants_directory_id: %s,\n  participants.participants_is_check_constraint_enabled_via_phenotype: %s,\n  participants.participants_is_valid_phone_number_data: %s,\n  participants.participants_duplicate_of: %s,\n  participants.participants_cms_life_cycle: %s,\n  participants.participants_norm_ui_status: %s,\n  participants.participants_last_modified_by_key: %s,\n  participants.participants_name_source: %s,\n  participants.participants_photo_source: %s,\n  participants.participants_profile_photo_user_preference: %s,\n  participants.participants_contact_metadata: %s,\n  conversations.conversations__id: %s,\n  conversations.conversations_sms_thread_id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_name_is_automatic: %s,\n  conversations.conversations_subtitle: %s,\n  conversations.conversations_latest_message_id: %s,\n  conversations.conversations_snippet_text: %s,\n  conversations.conversations_subject_text: %s,\n  conversations.conversations_preview_uri: %s,\n  conversations.conversations_preview_content_type: %s,\n  conversations.conversations_show_draft: %s,\n  conversations.conversations_draft_snippet_text: %s,\n  conversations.conversations_draft_subject_text: %s,\n  conversations.conversations_draft_preview_uri: %s,\n  conversations.conversations_draft_preview_content_type: %s,\n  conversations.conversations_etouffee_default: %s,\n  conversations.conversations_archive_status: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_last_read_timestamp: %s,\n  conversations.conversations_icon: %s,\n  conversations.conversations_participant_contact_id: %s,\n  conversations.conversations_normalized_participant_contact_id: %s,\n  conversations.conversations_participant_lookup_key: %s,\n  conversations.conversations_normalized_participant_lookup_key: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_participant_comparable_destination: %s,\n  conversations.conversations_current_self_id: %s,\n  conversations.conversations_current_my_identity_foreign_key: %s,\n  conversations.conversations_destination_token: %s,\n  conversations.conversations_participant_count: %s,\n  conversations.conversations_notification_enabled: %s,\n  conversations.conversations_notification_sound_uri: %s,\n  conversations.conversations_notification_vibration: %s,\n  conversations.conversations_include_email_addr: %s,\n  conversations.conversations_sms_service_center: %s,\n  conversations.conversations_participant_id_list: %s,\n  conversations.conversations_normalized_participant_id_list: %s,\n  conversations.conversations_source_type: %s,\n  conversations.conversations_rcs_session_id: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_send_mode: %s,\n  conversations.conversations_IS_ENTERPRISE: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_last_interactive_event_timestamp: %s,\n  conversations.conversations_participant_display_destination: %s,\n  conversations.conversations_normalized_participant_display_destination: %s,\n  conversations.conversations_spam_warning_dismiss_status: %s,\n  conversations.conversations_open_count: %s,\n  conversations.conversations_last_logged_scooby_metadata_timestamp: %s,\n  conversations.conversations_delete_timestamp: %s,\n  conversations.conversations_cms_id: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_conference_uri: %s,\n  conversations.conversations_tachygram_group_routing_info_token: %s,\n  conversations.conversations_cms_most_recent_read_message_timestamp_ms: %s,\n  conversations.conversations_rcs_subject_change_timestamp_ms: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_rcs_group_capabilities: %s,\n  conversations.conversations_awaiting_reverse_sync: %s,\n  conversations.conversations_duplicate_of: %s,\n  conversations.conversations_new_duplicate_of: %s,\n  conversations.conversations_error_state: %s,\n  conversations.conversations_cms_life_cycle: %s,\n  conversations.conversations_rcs_group_self_msisdn: %s,\n  conversations.conversations_recipient_offline_timestamp_ms: %s,\n  conversations.conversations_rcs_group_last_sync_timestamp: %s,\n  conversations.conversations_has_been_e2ee: %s,\n  conversations.conversations_marked_as_unread: %s,\n  conversations.conversations_custom_theme: %s,\n  conversations.conversations_mms_group_upgrade_status: %s,\n  conversations.conversations_mms_group_upgrade_retries: %s,\n  conversations.conversations_encryption_protocol: %s,\n  conversations.conversations_encryption_id: %s,\n  conversations.conversations_cms_correlation_id: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, concat, valueOf46, valueOf47, valueOf48, valueOf49, valueOf50, valueOf51, valueOf52, valueOf53, valueOf54, valueOf55, valueOf56, valueOf57, valueOf58, valueOf59, valueOf60, valueOf61, valueOf62, valueOf63, valueOf64, valueOf65, valueOf66, valueOf67, valueOf68, valueOf69, valueOf70, valueOf71, valueOf72, valueOf73, valueOf74, valueOf75, valueOf76, valueOf77, valueOf78, valueOf79, valueOf80, valueOf81, valueOf82, valueOf83, valueOf84, valueOf85, valueOf86, valueOf87, valueOf88, valueOf89, valueOf90, valueOf91, valueOf92, valueOf93, valueOf94, valueOf95, valueOf96, valueOf97, valueOf98, valueOf99, concat2, valueOf100, valueOf101, valueOf102, valueOf103, valueOf104, valueOf105, valueOf106, valueOf107, valueOf108, valueOf109, valueOf110, valueOf111, valueOf112, valueOf113, valueOf114, valueOf115, valueOf116, valueOf117, valueOf118, valueOf119, valueOf120, valueOf121, valueOf122, valueOf123, valueOf124, valueOf125, valueOf126, valueOf127, valueOf128, valueOf129, valueOf130, valueOf131, valueOf132, valueOf133, valueOf134, valueOf135, valueOf136, valueOf137, valueOf138, valueOf139, valueOf140, valueOf141, valueOf142, valueOf143, valueOf144, valueOf145, valueOf146, valueOf147, valueOf148, valueOf149, valueOf150, valueOf151, valueOf152, valueOf153, valueOf154, valueOf155, valueOf156, valueOf157, valueOf158, valueOf159, valueOf160, valueOf161, valueOf162, valueOf163, valueOf164, "BLOB".concat(String.valueOf(str3)), String.valueOf(this.cl), String.valueOf(this.cm), String.valueOf(this.cn), String.valueOf(this.co), String.valueOf(this.cp), String.valueOf(this.cq), String.valueOf(this.cr), String.valueOf(this.cs), String.valueOf(this.ct), String.valueOf(this.cu), String.valueOf(this.cv), String.valueOf(this.cw), String.valueOf(this.cx), String.valueOf(this.cy), String.valueOf(this.cz), String.valueOf(this.cA), String.valueOf(this.cB), String.valueOf(this.cC), String.valueOf(this.cD), String.valueOf(this.cK));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        valueOf.intValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof seh)) {
            return false;
        }
        seh sehVar = (seh) obj;
        if (super.aC(sehVar.cJ) && Objects.equals(this.a, sehVar.a) && Objects.equals(this.b, sehVar.b) && Objects.equals(this.c, sehVar.c) && Objects.equals(this.d, sehVar.d) && Objects.equals(this.e, sehVar.e) && Objects.equals(this.f, sehVar.f) && this.g == sehVar.g && Objects.equals(this.h, sehVar.h) && this.i == sehVar.i && this.j == sehVar.j && this.k == sehVar.k && this.l == sehVar.l && this.m == sehVar.m && this.n == sehVar.n && Objects.equals(this.o, sehVar.o) && this.p == sehVar.p && this.q == sehVar.q && Objects.equals(this.r, sehVar.r) && Objects.equals(this.s, sehVar.s) && Objects.equals(this.t, sehVar.t) && this.u == sehVar.u && this.v == sehVar.v && Objects.equals(this.w, sehVar.w) && this.x == sehVar.x && Objects.equals(this.y, sehVar.y) && Objects.equals(this.z, sehVar.z) && this.A == sehVar.A && Objects.equals(this.B, sehVar.B) && Objects.equals(this.C, sehVar.C) && this.D == sehVar.D && this.E == sehVar.E && this.F == sehVar.F && this.G == sehVar.G && Objects.equals(this.H, sehVar.H) && this.I == sehVar.I && this.J == sehVar.J && Objects.equals(this.K, sehVar.K) && Objects.equals(this.L, sehVar.L) && Objects.equals(this.M, sehVar.M) && this.N == sehVar.N && Objects.equals(this.O, sehVar.O) && this.P == sehVar.P && this.Q == sehVar.Q && Objects.equals(this.R, sehVar.R) && Objects.equals(this.S, sehVar.S) && Arrays.equals(this.T, sehVar.T) && this.U == sehVar.U && Objects.equals(this.V, sehVar.V) && Objects.equals(this.W, sehVar.W) && Objects.equals(this.X, sehVar.X) && Objects.equals(this.Y, sehVar.Y) && this.Z == sehVar.Z && Objects.equals(this.aa, sehVar.aa) && Objects.equals(this.ab, sehVar.ab) && this.ac == sehVar.ac && this.ad == sehVar.ad && this.ae == sehVar.ae && this.af == sehVar.af && this.ag == sehVar.ag && Objects.equals(this.ah, sehVar.ah) && this.ai == sehVar.ai && this.aj == sehVar.aj && this.ak == sehVar.ak && this.al == sehVar.al && Objects.equals(this.am, sehVar.am) && this.an == sehVar.an && Objects.equals(this.ao, sehVar.ao) && Objects.equals(this.ap, sehVar.ap) && Objects.equals(this.aq, sehVar.aq) && Objects.equals(this.ar, sehVar.ar) && this.as == sehVar.as && this.at == sehVar.at && Objects.equals(this.au, sehVar.au) && Objects.equals(this.av, sehVar.av) && Objects.equals(this.aw, sehVar.aw) && Objects.equals(this.ax, sehVar.ax) && Objects.equals(this.ay, sehVar.ay) && this.az == sehVar.az && Objects.equals(this.aA, sehVar.aA) && Objects.equals(this.aB, sehVar.aB) && Objects.equals(this.aC, sehVar.aC) && Objects.equals(this.aD, sehVar.aD) && Objects.equals(this.aE, sehVar.aE) && this.aF == sehVar.aF && Objects.equals(this.aG, sehVar.aG) && this.aH == sehVar.aH && this.aI == sehVar.aI && this.aJ == sehVar.aJ && this.aK == sehVar.aK && Objects.equals(this.aL, sehVar.aL) && this.aM == sehVar.aM && Objects.equals(this.aN, sehVar.aN) && this.aO == sehVar.aO && this.aP == sehVar.aP && Objects.equals(this.aQ, sehVar.aQ) && this.aR == sehVar.aR && this.aS == sehVar.aS && Objects.equals(this.aT, sehVar.aT) && this.aU == sehVar.aU && Objects.equals(this.aV, sehVar.aV) && Arrays.equals(this.aW, sehVar.aW) && this.aX == sehVar.aX && this.aY == sehVar.aY && this.aZ == sehVar.aZ && Objects.equals(this.ba, sehVar.ba) && this.bb == sehVar.bb && this.bc == sehVar.bc && Objects.equals(this.bd, sehVar.bd) && this.be == sehVar.be && this.bf == sehVar.bf && this.bg == sehVar.bg && Objects.equals(this.bh, sehVar.bh) && Objects.equals(this.bi, sehVar.bi) && Objects.equals(this.bj, sehVar.bj) && Objects.equals(this.bk, sehVar.bk) && this.bl == sehVar.bl && Objects.equals(this.bm, sehVar.bm) && Objects.equals(this.bn, sehVar.bn) && Objects.equals(this.bo, sehVar.bo) && Objects.equals(this.bp, sehVar.bp) && Objects.equals(this.bq, sehVar.bq) && Objects.equals(this.br, sehVar.br) && this.bs == sehVar.bs && Objects.equals(this.bt, sehVar.bt) && Objects.equals(this.bu, sehVar.bu) && Objects.equals(this.bv, sehVar.bv) && Objects.equals(this.bw, sehVar.bw) && this.bx == sehVar.bx && this.by == sehVar.by && this.bz == sehVar.bz && this.bA == sehVar.bA && Objects.equals(this.bB, sehVar.bB) && this.bC == sehVar.bC && this.bD == sehVar.bD && Objects.equals(this.bE, sehVar.bE) && Objects.equals(this.bF, sehVar.bF) && Objects.equals(this.bG, sehVar.bG) && Objects.equals(this.bH, sehVar.bH) && Objects.equals(this.bI, sehVar.bI) && Objects.equals(this.bJ, sehVar.bJ) && Objects.equals(this.bK, sehVar.bK) && this.bL == sehVar.bL && this.bM == sehVar.bM && Objects.equals(this.bN, sehVar.bN) && this.bO == sehVar.bO && this.bP == sehVar.bP && Objects.equals(this.bQ, sehVar.bQ) && Objects.equals(this.bR, sehVar.bR) && Objects.equals(this.bS, sehVar.bS) && this.bT == sehVar.bT && this.bU == sehVar.bU && this.bV == sehVar.bV && this.bW == sehVar.bW && this.bX == sehVar.bX && this.bY == sehVar.bY && this.bZ == sehVar.bZ && this.ca == sehVar.ca && Objects.equals(this.cb, sehVar.cb) && Objects.equals(this.cc, sehVar.cc) && this.cd == sehVar.cd && this.ce == sehVar.ce && this.cf == sehVar.cf && this.cg == sehVar.cg && Objects.equals(this.ch, sehVar.ch) && Objects.equals(this.ci, sehVar.ci) && Objects.equals(this.cj, sehVar.cj) && Arrays.equals(this.ck, sehVar.ck) && this.cl == sehVar.cl && this.cm == sehVar.cm && this.cn == sehVar.cn && Objects.equals(this.co, sehVar.co) && this.cp == sehVar.cp && Objects.equals(this.cq, sehVar.cq) && Objects.equals(this.cr, sehVar.cr) && this.cs == sehVar.cs && this.ct == sehVar.ct && Objects.equals(this.cu, sehVar.cu) && Objects.equals(this.cv, sehVar.cv) && Objects.equals(this.cw, sehVar.cw) && this.cx == sehVar.cx && this.cy == sehVar.cy && Objects.equals(this.cz, sehVar.cz) && this.cA == sehVar.cA && this.cB == sehVar.cB && this.cC == sehVar.cC && Objects.equals(this.cD, sehVar.cD) && Objects.equals(this.cK, sehVar.cK)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aglz
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void c(sei seiVar) {
        aq();
        this.cJ = seiVar.dx();
        if (aw(seiVar, 0)) {
            this.a = seiVar.aw();
            fE(0);
        }
        if (aw(seiVar, 1)) {
            this.b = seiVar.ar();
            fE(1);
        }
        if (aw(seiVar, 2)) {
            this.c = seiVar.cb();
            fE(2);
        }
        if (aw(seiVar, 3)) {
            this.d = seiVar.cc();
            fE(3);
        }
        if (aw(seiVar, 4)) {
            this.e = seiVar.bF();
            fE(4);
        }
        if (aw(seiVar, 5)) {
            this.f = seiVar.bX();
            fE(5);
        }
        if (aw(seiVar, 6)) {
            this.g = seiVar.Z();
            fE(6);
        }
        if (aw(seiVar, 7)) {
            this.h = seiVar.aY();
            fE(7);
        }
        if (aw(seiVar, 8)) {
            this.i = seiVar.U();
            fE(8);
        }
        if (aw(seiVar, 9)) {
            this.j = seiVar.r();
            fE(9);
        }
        if (aw(seiVar, 10)) {
            this.k = seiVar.B();
            fE(10);
        }
        if (aw(seiVar, 11)) {
            this.l = seiVar.l();
            fE(11);
        }
        if (aw(seiVar, 12)) {
            this.m = seiVar.cA();
            fE(12);
        }
        if (aw(seiVar, 13)) {
            this.n = seiVar.cC();
            fE(13);
        }
        if (aw(seiVar, 14)) {
            this.o = seiVar.ai();
            fE(14);
        }
        if (aw(seiVar, 15)) {
            this.p = seiVar.z();
            fE(15);
        }
        if (aw(seiVar, 16)) {
            this.q = seiVar.aa();
            fE(16);
        }
        if (aw(seiVar, 17)) {
            this.r = seiVar.bD();
            fE(17);
        }
        if (aw(seiVar, 18)) {
            this.s = seiVar.bE();
            fE(18);
        }
        if (aw(seiVar, 19)) {
            this.t = seiVar.bB();
            fE(19);
        }
        if (aw(seiVar, 20)) {
            this.u = seiVar.N();
            fE(20);
        }
        if (aw(seiVar, 21)) {
            this.v = seiVar.Q();
            fE(21);
        }
        if (aw(seiVar, 22)) {
            this.w = seiVar.bC();
            fE(22);
        }
        if (aw(seiVar, 23)) {
            this.x = seiVar.s();
            fE(23);
        }
        if (aw(seiVar, 24)) {
            this.y = seiVar.bZ();
            fE(24);
        }
        if (aw(seiVar, 25)) {
            this.z = seiVar.ao();
            fE(25);
        }
        if (aw(seiVar, 26)) {
            this.A = seiVar.X();
            fE(26);
        }
        if (aw(seiVar, 27)) {
            this.B = seiVar.be();
            fE(27);
        }
        if (aw(seiVar, 28)) {
            this.C = seiVar.aA();
            fE(28);
        }
        if (aw(seiVar, 29)) {
            this.D = seiVar.t();
            fE(29);
        }
        if (aw(seiVar, 30)) {
            this.E = seiVar.aI();
            fE(30);
        }
        if (aw(seiVar, 31)) {
            this.F = seiVar.u();
            fE(31);
        }
        if (aw(seiVar, 32)) {
            this.G = seiVar.cu();
            fE(32);
        }
        if (aw(seiVar, 33)) {
            this.H = seiVar.bW();
            fE(33);
        }
        if (aw(seiVar, 34)) {
            this.I = seiVar.R();
            fE(34);
        }
        if (aw(seiVar, 35)) {
            this.J = seiVar.y();
            fE(35);
        }
        if (aw(seiVar, 36)) {
            this.K = seiVar.cd();
            fE(36);
        }
        if (aw(seiVar, 37)) {
            this.L = seiVar.bm();
            fE(37);
        }
        if (aw(seiVar, 38)) {
            this.M = seiVar.bi();
            fE(38);
        }
        if (aw(seiVar, 39)) {
            this.N = seiVar.F();
            fE(39);
        }
        if (aw(seiVar, 40)) {
            this.O = seiVar.cj();
            fE(40);
        }
        if (aw(seiVar, 41)) {
            this.P = seiVar.ac();
            fE(41);
        }
        if (aw(seiVar, 42)) {
            this.Q = seiVar.Y();
            fE(42);
        }
        if (aw(seiVar, 43)) {
            this.R = seiVar.az();
            fE(43);
        }
        if (aw(seiVar, 44)) {
            this.S = seiVar.bp();
            fE(44);
        }
        if (aw(seiVar, 45)) {
            this.T = seiVar.cF();
            fE(45);
        }
        if (aw(seiVar, 46)) {
            this.U = seiVar.W();
            fE(46);
        }
        if (aw(seiVar, 47)) {
            this.V = seiVar.aX();
            fE(47);
        }
        if (aw(seiVar, 48)) {
            this.W = seiVar.bg();
            fE(48);
        }
        if (aw(seiVar, 49)) {
            this.X = seiVar.bx();
            fE(49);
        }
        if (aw(seiVar, 50)) {
            this.Y = seiVar.ay();
            fE(50);
        }
        if (aw(seiVar, 51)) {
            this.Z = seiVar.cm();
            fE(51);
        }
        if (aw(seiVar, 52)) {
            this.aa = seiVar.af();
            fE(52);
        }
        if (aw(seiVar, 53)) {
            this.ab = seiVar.aZ();
            fE(53);
        }
        if (aw(seiVar, 54)) {
            this.ac = seiVar.v();
            fE(54);
        }
        if (aw(seiVar, 55)) {
            this.ad = seiVar.aV();
            fE(55);
        }
        if (aw(seiVar, 56)) {
            this.ae = seiVar.aD();
            fE(56);
        }
        if (aw(seiVar, 57)) {
            this.af = seiVar.c();
            fE(57);
        }
        if (aw(seiVar, 58)) {
            this.ag = seiVar.co();
            fE(58);
        }
        if (aw(seiVar, 59)) {
            this.ah = seiVar.ck();
            fE(59);
        }
        if (aw(seiVar, 60)) {
            this.ai = seiVar.aF();
            fE(60);
        }
        if (aw(seiVar, 61)) {
            this.aj = seiVar.aG();
            fE(61);
        }
        if (aw(seiVar, 62)) {
            this.ak = seiVar.aJ();
            fE(62);
        }
        if (aw(seiVar, 63)) {
            this.al = seiVar.o();
            fE(63);
        }
        if (aw(seiVar, 64)) {
            this.am = seiVar.av();
            fE(64);
        }
        if (aw(seiVar, 65)) {
            this.an = seiVar.aM();
            fE(65);
        }
        if (aw(seiVar, 66)) {
            this.ao = seiVar.ba();
            fE(66);
        }
        if (aw(seiVar, 67)) {
            this.ap = seiVar.bz();
            fE(67);
        }
        if (aw(seiVar, 68)) {
            this.aq = seiVar.ap();
            fE(68);
        }
        if (aw(seiVar, 69)) {
            this.ar = seiVar.aq();
            fE(69);
        }
        if (aw(seiVar, 70)) {
            this.as = seiVar.C();
            fE(70);
        }
        if (aw(seiVar, 71)) {
            this.at = seiVar.x();
            fE(71);
        }
        if (aw(seiVar, 72)) {
            this.au = seiVar.bH();
            fE(72);
        }
        if (aw(seiVar, 73)) {
            this.av = seiVar.ca();
            fE(73);
        }
        if (aw(seiVar, 74)) {
            this.aw = seiVar.bq();
            fE(74);
        }
        if (aw(seiVar, 75)) {
            this.ax = seiVar.bk();
            fE(75);
        }
        if (aw(seiVar, 76)) {
            this.ay = seiVar.bn();
            fE(76);
        }
        if (aw(seiVar, 77)) {
            this.az = seiVar.V();
            fE(77);
        }
        if (aw(seiVar, 78)) {
            this.aA = seiVar.bY();
            fE(78);
        }
        if (aw(seiVar, 79)) {
            this.aB = seiVar.bw();
            fE(79);
        }
        if (aw(seiVar, 80)) {
            this.aC = seiVar.bv();
            fE(80);
        }
        if (aw(seiVar, 81)) {
            this.aD = seiVar.ah();
            fE(81);
        }
        if (aw(seiVar, 82)) {
            this.aE = seiVar.ad();
            fE(82);
        }
        if (aw(seiVar, 83)) {
            this.aF = seiVar.H();
            fE(83);
        }
        if (aw(seiVar, 84)) {
            this.aG = seiVar.bA();
            fE(84);
        }
        if (aw(seiVar, 85)) {
            this.aH = seiVar.e();
            fE(85);
        }
        if (aw(seiVar, 86)) {
            this.aI = seiVar.f();
            fE(86);
        }
        if (aw(seiVar, 87)) {
            this.aJ = seiVar.i();
            fE(87);
        }
        if (aw(seiVar, 88)) {
            this.aK = seiVar.cn();
            fE(88);
        }
        if (aw(seiVar, 89)) {
            this.aL = seiVar.ch();
            fE(89);
        }
        if (aw(seiVar, 90)) {
            this.aM = seiVar.D();
            fE(90);
        }
        if (aw(seiVar, 91)) {
            this.aN = seiVar.bl();
            fE(91);
        }
        if (aw(seiVar, 92)) {
            this.aO = seiVar.q();
            fE(92);
        }
        if (aw(seiVar, 93)) {
            this.aP = seiVar.E();
            fE(93);
        }
        if (aw(seiVar, 94)) {
            this.aQ = seiVar.bd();
            fE(94);
        }
        if (aw(seiVar, 95)) {
            this.aR = seiVar.cv();
            fE(95);
        }
        if (aw(seiVar, 96)) {
            this.aS = seiVar.j();
            fE(96);
        }
        if (aw(seiVar, 97)) {
            this.aT = seiVar.bj();
            fE(97);
        }
        if (aw(seiVar, 98)) {
            this.aU = seiVar.aH();
            fE(98);
        }
        if (aw(seiVar, 99)) {
            this.aV = seiVar.bS();
            fE(99);
        }
        if (aw(seiVar, 100)) {
            this.aW = seiVar.cG();
            fE(100);
        }
        if (aw(seiVar, 101)) {
            this.aX = seiVar.J();
            fE(101);
        }
        if (aw(seiVar, 102)) {
            this.aY = seiVar.cs();
            fE(102);
        }
        if (aw(seiVar, 103)) {
            this.aZ = seiVar.cw();
            fE(103);
        }
        if (aw(seiVar, 104)) {
            this.ba = seiVar.bu();
            fE(104);
        }
        if (aw(seiVar, 105)) {
            this.bb = seiVar.aW();
            fE(105);
        }
        if (aw(seiVar, 106)) {
            this.bc = seiVar.aj();
            fE(106);
        }
        if (aw(seiVar, 107)) {
            this.bd = seiVar.aB();
            fE(107);
        }
        if (aw(seiVar, 108)) {
            this.be = seiVar.aO();
            fE(108);
        }
        if (aw(seiVar, 109)) {
            this.bf = seiVar.aP();
            fE(109);
        }
        if (aw(seiVar, 110)) {
            this.bg = seiVar.aN();
            fE(110);
        }
        if (aw(seiVar, 111)) {
            this.bh = seiVar.ak();
            fE(111);
        }
        if (aw(seiVar, 112)) {
            this.bi = seiVar.au();
            fE(112);
        }
        if (aw(seiVar, 113)) {
            this.bj = seiVar.aT();
            fE(113);
        }
        if (aw(seiVar, 114)) {
            this.bk = seiVar.bG();
            fE(114);
        }
        if (aw(seiVar, 115)) {
            this.bl = seiVar.aE();
            fE(115);
        }
        if (aw(seiVar, 116)) {
            this.bm = seiVar.ci();
            fE(116);
        }
        if (aw(seiVar, 117)) {
            this.bn = seiVar.ax();
            fE(117);
        }
        if (aw(seiVar, 118)) {
            this.bo = seiVar.cf();
            fE(118);
        }
        if (aw(seiVar, 119)) {
            this.bp = seiVar.cg();
            fE(119);
        }
        if (aw(seiVar, 120)) {
            this.bq = seiVar.ag();
            fE(120);
        }
        if (aw(seiVar, 121)) {
            this.br = seiVar.bR();
            fE(121);
        }
        if (aw(seiVar, 122)) {
            this.bs = seiVar.cD();
            fE(122);
        }
        if (aw(seiVar, 123)) {
            this.bt = seiVar.bs();
            fE(123);
        }
        if (aw(seiVar, 124)) {
            this.bu = seiVar.bt();
            fE(124);
        }
        if (aw(seiVar, 125)) {
            this.bv = seiVar.ae();
            fE(125);
        }
        if (aw(seiVar, 126)) {
            this.bw = seiVar.br();
            fE(126);
        }
        if (aw(seiVar, 127)) {
            this.bx = seiVar.h();
            fE(127);
        }
        if (aw(seiVar, 128)) {
            this.by = seiVar.aC();
            fE(128);
        }
        if (aw(seiVar, 129)) {
            this.bz = seiVar.ab();
            fE(129);
        }
        if (aw(seiVar, 130)) {
            this.bA = seiVar.M();
            fE(130);
        }
        if (aw(seiVar, 131)) {
            this.bB = seiVar.by();
            fE(131);
        }
        if (aw(seiVar, 132)) {
            this.bC = seiVar.P();
            fE(132);
        }
        if (aw(seiVar, 133)) {
            this.bD = seiVar.O();
            fE(133);
        }
        if (aw(seiVar, 134)) {
            this.bE = seiVar.bP();
            fE(134);
        }
        if (aw(seiVar, 135)) {
            this.bF = seiVar.bK();
            fE(135);
        }
        if (aw(seiVar, 136)) {
            this.bG = seiVar.bQ();
            fE(136);
        }
        if (aw(seiVar, 137)) {
            this.bH = seiVar.bM();
            fE(137);
        }
        if (aw(seiVar, 138)) {
            this.bI = seiVar.bo();
            fE(138);
        }
        if (aw(seiVar, 139)) {
            this.bJ = seiVar.an();
            fE(139);
        }
        if (aw(seiVar, 140)) {
            this.bK = seiVar.am();
            fE(140);
        }
        if (aw(seiVar, 141)) {
            this.bL = seiVar.p();
            fE(141);
        }
        if (aw(seiVar, 142)) {
            this.bM = seiVar.cy();
            fE(142);
        }
        if (aw(seiVar, 143)) {
            this.bN = seiVar.bL();
            fE(143);
        }
        if (aw(seiVar, 144)) {
            this.bO = seiVar.cz();
            fE(144);
        }
        if (aw(seiVar, 145)) {
            this.bP = seiVar.cr();
            fE(145);
        }
        if (aw(seiVar, 146)) {
            this.bQ = seiVar.ce();
            fE(146);
        }
        if (aw(seiVar, 147)) {
            this.bR = seiVar.bO();
            fE(147);
        }
        if (aw(seiVar, 148)) {
            this.bS = seiVar.bJ();
            fE(148);
        }
        if (aw(seiVar, 149)) {
            this.bT = seiVar.A();
            fE(149);
        }
        if (aw(seiVar, 150)) {
            this.bU = seiVar.S();
            fE(150);
        }
        if (aw(seiVar, 151)) {
            this.bV = seiVar.k();
            fE(151);
        }
        if (aw(seiVar, 152)) {
            this.bW = seiVar.g();
            fE(152);
        }
        if (aw(seiVar, 153)) {
            this.bX = seiVar.w();
            fE(153);
        }
        if (aw(seiVar, 154)) {
            this.bY = seiVar.ct();
            fE(154);
        }
        if (aw(seiVar, 155)) {
            this.bZ = seiVar.cq();
            fE(155);
        }
        if (aw(seiVar, 156)) {
            this.ca = seiVar.K();
            fE(156);
        }
        if (aw(seiVar, 157)) {
            this.cb = seiVar.bN();
            fE(157);
        }
        if (aw(seiVar, 158)) {
            this.cc = seiVar.bI();
            fE(158);
        }
        if (aw(seiVar, 159)) {
            this.cd = seiVar.cE();
            fE(159);
        }
        if (aw(seiVar, 160)) {
            this.ce = seiVar.n();
            fE(160);
        }
        if (aw(seiVar, 161)) {
            this.cf = seiVar.L();
            fE(161);
        }
        if (aw(seiVar, 162)) {
            this.cg = seiVar.I();
            fE(162);
        }
        if (aw(seiVar, 163)) {
            this.ch = seiVar.bh();
            fE(163);
        }
        if (aw(seiVar, 164)) {
            this.ci = seiVar.bU();
            fE(164);
        }
        if (aw(seiVar, 165)) {
            this.cj = seiVar.bT();
            fE(165);
        }
        if (aw(seiVar, 166)) {
            this.ck = seiVar.cH();
            fE(166);
        }
        if (aw(seiVar, 167)) {
            this.cl = seiVar.G();
            fE(167);
        }
        if (aw(seiVar, 168)) {
            this.cm = seiVar.T();
            fE(168);
        }
        if (aw(seiVar, 169)) {
            this.cn = seiVar.cB();
            fE(169);
        }
        if (aw(seiVar, 170)) {
            this.co = seiVar.aR();
            fE(170);
        }
        if (aw(seiVar, 171)) {
            this.cp = seiVar.cl();
            fE(171);
        }
        if (aw(seiVar, 172)) {
            this.cq = seiVar.as();
            fE(172);
        }
        if (aw(seiVar, 173)) {
            this.cr = seiVar.at();
            fE(173);
        }
        if (aw(seiVar, 174)) {
            this.cs = seiVar.al();
            fE(174);
        }
        if (aw(seiVar, 175)) {
            this.ct = seiVar.aU();
            fE(175);
        }
        if (aw(seiVar, 176)) {
            this.cu = seiVar.bV();
            fE(176);
        }
        if (aw(seiVar, 177)) {
            this.cv = seiVar.bc();
            fE(177);
        }
        if (aw(seiVar, 178)) {
            this.cw = seiVar.bb();
            fE(178);
        }
        if (aw(seiVar, 179)) {
            this.cx = seiVar.cp();
            fE(179);
        }
        if (aw(seiVar, 180)) {
            this.cy = seiVar.cx();
            fE(180);
        }
        if (aw(seiVar, 181)) {
            this.cz = seiVar.aQ();
            fE(181);
        }
        if (aw(seiVar, 182)) {
            this.cA = seiVar.aS();
            fE(182);
        }
        if (aw(seiVar, 183)) {
            this.cB = seiVar.m();
            fE(183);
        }
        if (aw(seiVar, 184)) {
            this.cC = seiVar.aL();
            fE(184);
        }
        if (aw(seiVar, 185)) {
            this.cD = seiVar.aK();
            fE(185);
        }
        if (aw(seiVar, 186)) {
            this.cK = seiVar.bf();
            fE(186);
        }
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
        int ordinal8;
        int ordinal9;
        int ordinal10;
        int ordinal11;
        int ordinal12;
        int ordinal13;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        MessageIdType messageIdType = this.a;
        ConversationIdType conversationIdType = this.b;
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        Long valueOf = Long.valueOf(this.g);
        Instant instant = this.h;
        Long valueOf2 = Long.valueOf(this.i);
        Integer valueOf3 = Integer.valueOf(this.j);
        Integer valueOf4 = Integer.valueOf(this.k);
        Integer valueOf5 = Integer.valueOf(this.l);
        Boolean valueOf6 = Boolean.valueOf(this.m);
        Boolean valueOf7 = Boolean.valueOf(this.n);
        Uri uri = this.o;
        Integer valueOf8 = Integer.valueOf(this.p);
        Long valueOf9 = Long.valueOf(this.q);
        String str5 = this.r;
        String str6 = this.s;
        String str7 = this.t;
        Long valueOf10 = Long.valueOf(this.u);
        Long valueOf11 = Long.valueOf(this.v);
        String str8 = this.w;
        Integer valueOf12 = Integer.valueOf(this.x);
        String str9 = this.y;
        qwe qweVar = this.z;
        Long valueOf13 = Long.valueOf(this.A);
        String str10 = this.B;
        rve rveVar = this.C;
        Integer valueOf14 = Integer.valueOf(this.D);
        tqr tqrVar = this.E;
        if (tqrVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqrVar.ordinal();
        }
        Integer valueOf15 = Integer.valueOf(ordinal);
        Integer valueOf16 = Integer.valueOf(this.F);
        Boolean valueOf17 = Boolean.valueOf(this.G);
        String str11 = this.H;
        Long valueOf18 = Long.valueOf(this.I);
        Integer valueOf19 = Integer.valueOf(this.J);
        String str12 = this.K;
        String str13 = this.L;
        String str14 = this.M;
        Long valueOf20 = Long.valueOf(this.N);
        String str15 = this.O;
        Long valueOf21 = Long.valueOf(this.P);
        Long valueOf22 = Long.valueOf(this.Q);
        rve rveVar2 = this.R;
        String str16 = this.S;
        Integer valueOf23 = Integer.valueOf(Arrays.hashCode(this.T));
        Long valueOf24 = Long.valueOf(this.U);
        apwq apwqVar = this.V;
        String str17 = this.W;
        String str18 = this.X;
        MessageIdType messageIdType2 = this.Y;
        Boolean valueOf25 = Boolean.valueOf(this.Z);
        Uri uri2 = this.aa;
        Optional optional = this.ab;
        Integer valueOf26 = Integer.valueOf(this.ac);
        xxw xxwVar = this.ad;
        if (xxwVar == null) {
            ordinal2 = 0;
        } else {
            ordinal2 = xxwVar.ordinal();
        }
        Integer valueOf27 = Integer.valueOf(ordinal2);
        tqf tqfVar = this.ae;
        if (tqfVar == null) {
            ordinal3 = 0;
        } else {
            ordinal3 = tqfVar.ordinal();
        }
        Integer valueOf28 = Integer.valueOf(ordinal3);
        Integer valueOf29 = Integer.valueOf(this.af);
        Boolean valueOf30 = Boolean.valueOf(this.ag);
        atok atokVar = this.ah;
        tqp tqpVar = this.ai;
        if (tqpVar == null) {
            ordinal4 = 0;
        } else {
            ordinal4 = tqpVar.ordinal();
        }
        Integer valueOf31 = Integer.valueOf(ordinal4);
        tqp tqpVar2 = this.aj;
        if (tqpVar2 == null) {
            ordinal5 = 0;
        } else {
            ordinal5 = tqpVar2.ordinal();
        }
        Integer valueOf32 = Integer.valueOf(ordinal5);
        tqu tquVar = this.ak;
        if (tquVar == null) {
            ordinal6 = 0;
        } else {
            ordinal6 = tquVar.ordinal();
        }
        Integer valueOf33 = Integer.valueOf(ordinal6);
        Integer valueOf34 = Integer.valueOf(this.al);
        ruz ruzVar = this.am;
        utk utkVar = this.an;
        if (utkVar == null) {
            ordinal7 = 0;
        } else {
            ordinal7 = utkVar.ordinal();
        }
        Integer valueOf35 = Integer.valueOf(ordinal7);
        Optional optional2 = this.ao;
        String str19 = this.ap;
        qwe qweVar2 = this.aq;
        qwe qweVar3 = this.ar;
        Integer valueOf36 = Integer.valueOf(this.as);
        Integer valueOf37 = Integer.valueOf(this.at);
        String str20 = this.au;
        String str21 = this.av;
        String str22 = this.aw;
        String str23 = this.ax;
        String str24 = this.ay;
        Long valueOf38 = Long.valueOf(this.az);
        String str25 = this.aA;
        String str26 = this.aB;
        String str27 = this.aC;
        Uri uri3 = this.aD;
        Uri uri4 = this.aE;
        Long valueOf39 = Long.valueOf(this.aF);
        String str28 = this.aG;
        Integer valueOf40 = Integer.valueOf(this.aH);
        Integer valueOf41 = Integer.valueOf(this.aI);
        Integer valueOf42 = Integer.valueOf(this.aJ);
        Boolean valueOf43 = Boolean.valueOf(this.aK);
        String str29 = this.aL;
        Integer valueOf44 = Integer.valueOf(this.aM);
        String str30 = this.aN;
        Integer valueOf45 = Integer.valueOf(this.aO);
        Integer valueOf46 = Integer.valueOf(this.aP);
        String str31 = this.aQ;
        Boolean valueOf47 = Boolean.valueOf(this.aR);
        Integer valueOf48 = Integer.valueOf(this.aS);
        String str32 = this.aT;
        tqr tqrVar2 = this.aU;
        if (tqrVar2 == null) {
            ordinal8 = 0;
        } else {
            ordinal8 = tqrVar2.ordinal();
        }
        Integer valueOf49 = Integer.valueOf(ordinal8);
        String str33 = this.aV;
        Integer valueOf50 = Integer.valueOf(Arrays.hashCode(this.aW));
        Long valueOf51 = Long.valueOf(this.aX);
        Boolean valueOf52 = Boolean.valueOf(this.aY);
        Boolean valueOf53 = Boolean.valueOf(this.aZ);
        String str34 = this.ba;
        xxw xxwVar2 = this.bb;
        if (xxwVar2 == null) {
            ordinal9 = 0;
        } else {
            ordinal9 = xxwVar2.ordinal();
        }
        Integer valueOf54 = Integer.valueOf(ordinal9);
        mta mtaVar = this.bc;
        rxg rxgVar = this.bd;
        vox voxVar = this.be;
        vox voxVar2 = this.bf;
        vov vovVar = this.bg;
        ndp ndpVar = this.bh;
        ConversationIdType conversationIdType2 = this.bi;
        xhv xhvVar = this.bj;
        String str35 = this.bk;
        tqh tqhVar = this.bl;
        if (tqhVar == null) {
            ordinal10 = 0;
        } else {
            ordinal10 = tqhVar.ordinal();
        }
        Integer valueOf55 = Integer.valueOf(ordinal10);
        String str36 = this.bm;
        MessageIdType messageIdType3 = this.bn;
        String str37 = this.bo;
        String str38 = this.bp;
        Uri uri5 = this.bq;
        String str39 = this.br;
        Boolean valueOf56 = Boolean.valueOf(this.bs);
        String str40 = this.bt;
        String str41 = this.bu;
        Uri uri6 = this.bv;
        String str42 = this.bw;
        Integer valueOf57 = Integer.valueOf(this.bx);
        tqc tqcVar = this.by;
        Long valueOf58 = Long.valueOf(this.bz);
        Long valueOf59 = Long.valueOf(this.bA);
        String str43 = this.bB;
        Long valueOf60 = Long.valueOf(this.bC);
        Long valueOf61 = Long.valueOf(this.bD);
        String str44 = this.bE;
        String str45 = this.bF;
        String str46 = this.bG;
        String str47 = this.bH;
        String str48 = this.bI;
        qwe qweVar4 = this.bJ;
        qss qssVar = this.bK;
        Integer valueOf62 = Integer.valueOf(this.bL);
        Boolean valueOf63 = Boolean.valueOf(this.bM);
        String str49 = this.bN;
        Boolean valueOf64 = Boolean.valueOf(this.bO);
        Boolean valueOf65 = Boolean.valueOf(this.bP);
        String str50 = this.bQ;
        String str51 = this.bR;
        String str52 = this.bS;
        Integer valueOf66 = Integer.valueOf(this.bT);
        Long valueOf67 = Long.valueOf(this.bU);
        Integer valueOf68 = Integer.valueOf(this.bV);
        Integer valueOf69 = Integer.valueOf(this.bW);
        Integer valueOf70 = Integer.valueOf(this.bX);
        Boolean valueOf71 = Boolean.valueOf(this.bY);
        Boolean valueOf72 = Boolean.valueOf(this.bZ);
        Long valueOf73 = Long.valueOf(this.ca);
        String str53 = this.cb;
        String str54 = this.cc;
        Boolean valueOf74 = Boolean.valueOf(this.cd);
        Integer valueOf75 = Integer.valueOf(this.ce);
        Long valueOf76 = Long.valueOf(this.cf);
        Long valueOf77 = Long.valueOf(this.cg);
        String str55 = this.ch;
        String str56 = this.ci;
        String str57 = this.cj;
        Integer valueOf78 = Integer.valueOf(Arrays.hashCode(this.ck));
        Long valueOf79 = Long.valueOf(this.cl);
        Long valueOf80 = Long.valueOf(this.cm);
        Boolean valueOf81 = Boolean.valueOf(this.cn);
        vtm vtmVar = this.co;
        Boolean valueOf82 = Boolean.valueOf(this.cp);
        ConversationIdType conversationIdType3 = this.cq;
        ConversationIdType conversationIdType4 = this.cr;
        qpd qpdVar = this.cs;
        xxw xxwVar3 = this.ct;
        if (xxwVar3 == null) {
            ordinal11 = 0;
        } else {
            ordinal11 = xxwVar3.ordinal();
        }
        Integer valueOf83 = Integer.valueOf(ordinal11);
        String str58 = this.cu;
        Optional optional3 = this.cv;
        Optional optional4 = this.cw;
        Boolean valueOf84 = Boolean.valueOf(this.cx);
        Boolean valueOf85 = Boolean.valueOf(this.cy);
        vst vstVar = this.cz;
        vvh vvhVar = this.cA;
        if (vvhVar == null) {
            ordinal12 = 0;
        } else {
            ordinal12 = vvhVar.ordinal();
        }
        Integer valueOf86 = Integer.valueOf(ordinal12);
        Integer valueOf87 = Integer.valueOf(this.cB);
        utk utkVar2 = this.cC;
        if (utkVar2 == null) {
            ordinal13 = 0;
        } else {
            ordinal13 = utkVar2.ordinal();
        }
        return Objects.hash(adayVar, messageIdType, conversationIdType, str, str2, str3, str4, valueOf, instant, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, uri, valueOf8, valueOf9, str5, str6, str7, valueOf10, valueOf11, str8, valueOf12, str9, qweVar, valueOf13, str10, rveVar, valueOf14, valueOf15, valueOf16, valueOf17, str11, valueOf18, valueOf19, str12, str13, str14, valueOf20, str15, valueOf21, valueOf22, rveVar2, str16, valueOf23, valueOf24, apwqVar, str17, str18, messageIdType2, valueOf25, uri2, optional, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, atokVar, valueOf31, valueOf32, valueOf33, valueOf34, ruzVar, valueOf35, optional2, str19, qweVar2, qweVar3, valueOf36, valueOf37, str20, str21, str22, str23, str24, valueOf38, str25, str26, str27, uri3, uri4, valueOf39, str28, valueOf40, valueOf41, valueOf42, valueOf43, str29, valueOf44, str30, valueOf45, valueOf46, str31, valueOf47, valueOf48, str32, valueOf49, str33, valueOf50, valueOf51, valueOf52, valueOf53, str34, valueOf54, mtaVar, rxgVar, voxVar, voxVar2, vovVar, ndpVar, conversationIdType2, xhvVar, str35, valueOf55, str36, messageIdType3, str37, str38, uri5, str39, valueOf56, str40, str41, uri6, str42, valueOf57, tqcVar, valueOf58, valueOf59, str43, valueOf60, valueOf61, str44, str45, str46, str47, str48, qweVar4, qssVar, valueOf62, valueOf63, str49, valueOf64, valueOf65, str50, str51, str52, valueOf66, valueOf67, valueOf68, valueOf69, valueOf70, valueOf71, valueOf72, valueOf73, str53, str54, valueOf74, valueOf75, valueOf76, valueOf77, str55, str56, str57, valueOf78, valueOf79, valueOf80, valueOf81, vtmVar, valueOf82, conversationIdType3, conversationIdType4, qpdVar, valueOf83, str58, optional3, optional4, valueOf84, valueOf85, vstVar, valueOf86, valueOf87, Integer.valueOf(ordinal13), this.cD, this.cK, null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "UnreadQuery -- REDACTED");
        }
        return a();
    }
}
