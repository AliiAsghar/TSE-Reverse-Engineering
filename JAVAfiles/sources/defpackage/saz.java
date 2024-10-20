package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.aglz;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class saz extends aglz {
    public String A;
    public atok H;
    public String J;
    public String[] K;
    public MessageIdType L;
    public String[] M;
    public Uri[] N;
    public String[] O;
    public Uri[] P;
    public Uri[] Q;
    public int[] R;
    public int[] S;
    public long T;
    public Uri U;
    public long[] V;
    public tql W;
    public tqd[] X;
    public ConversationIdType Y;
    public tqa Z;
    public boolean aA;
    public long aB;
    public String aC;
    public tqj[] aD;
    public aggp aE;
    public tqw aF;
    public pyz aG;
    public tqq aH;
    public tqi aI;
    public long[] aJ;
    public PartsTable.BindData[] aK;
    public String aL;
    public String aM;
    public String aN;
    public String aO;
    public String aP;
    public Uri aQ;
    public long aR;
    public String aS;
    public int aT;
    public int aU;
    public int aV;
    public boolean aW;
    public int aX;
    public boolean aY;
    public tqr aZ;
    public tqa aa;
    public long ab;
    public double ac;
    public double ad;
    public Uri[] ae;
    public String af;
    public Uri[] ag;
    public int[] ah;
    public int[] ai;
    public String[] aj;
    public String[] ak;
    public String al;
    public byte[] am;
    public byte[] an;
    public boolean[] ao;
    public long[] ap;
    public String[] aq;
    public String[] ar;
    public long[] as;
    public String[] at;
    public String au;
    public boolean[] av;
    public long[] aw;
    public byte[][] ax;
    public byte[][] ay;
    public boolean[] az;
    public MessageIdType bA;
    public String bB;
    public long bC;
    public String bD;
    public String bE;
    public String bF;
    public String bG;
    public String bH;
    public boolean bI;
    public boolean bJ;
    public ssi bK;
    public String bL;
    public String bM;
    public Uri bN;
    public tox bO;
    public String bP;
    public int bQ;
    public boolean bR;
    public String bS;
    public boolean bT;
    public Optional bU;
    public wks bV;
    public String bW;
    public MessageIdType bX;
    public voe bY;
    public String[] bZ;
    public long ba;
    public vox bb;
    public vox bc;
    public ParticipantsTable.BindData bd;
    public String be;
    public MessageIdType bf;
    public long[] bg;
    public long[] bh;
    public long[] bi;
    public Optional[] bj;
    public long[] bk;
    public sdy bl;
    public MessageIdType bm;
    public long[] bn;
    public long[] bo;
    public long[] bp;
    public String[] bq;
    public String[] br;
    public String[] bs;
    public String[] bt;
    public String[] bu;
    public int[] bv;
    public int[] bw;
    public int[] bx;
    public long[] by;
    public toa bz;
    public String c;
    public sdj cA;
    public String cB;
    public String cC;
    public MessagesTable.BindData cD;
    public nht[] ca;
    public String[] cb;
    public String[] cc;
    public long[] cd;
    public VmtTable.BindData[] ce;
    public MessageIdType cf;
    public MessageIdType cg;
    public long ch;
    public String ci;
    public int cj;
    public String ck;
    public String cl;
    public String cm;
    public String cn;
    public String[] co;
    public String[] cp;
    public Uri[] cq;
    public String[] cr;
    public String[] cs;
    public long[] ct;
    public long[] cu;
    public String cv;
    public long cw;
    public String cx;
    public String cy;
    public boolean cz;
    public Uri k;
    public String n;
    public String q;
    public String s;
    public String z;
    public MessageIdType a = rvc.a;
    public ConversationIdType b = ruy.a;
    public long d = 0;
    public long e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public boolean i = false;
    public boolean j = false;
    public int l = 0;
    public long m = 0;
    public long o = 0;
    public long p = 0;
    public int r = 0;
    public rve t = rve.a;
    public int u = 0;
    public tqr v = tqr.VERIFICATION_NA;
    public boolean w = false;
    public long x = -1;
    public int y = -1;
    public String B = "";
    public long C = 0;
    public rve D = rve.a;
    public int E = -2;
    public xxw F = xxw.UNKNOWN;
    public tqf G = tqf.UNKNOWN;
    public tqu I = tqu.UNKNOWN;

    /* JADX INFO: Access modifiers changed from: protected */
    public saz() {
        MessageIdType messageIdType = rvc.a;
        this.L = messageIdType;
        this.W = tql.SUCCEEDED;
        this.Y = ruy.a;
        this.Z = new tqa(-1);
        this.aa = new tqa(-1);
        this.ab = -1L;
        this.ac = 0.0d;
        this.ad = 0.0d;
        this.aA = false;
        this.aF = tqw.UNKNOWN;
        this.aG = null;
        this.aH = tqq.NONE;
        this.aI = tqi.DEFAULT_NO_VERDICT;
        this.aR = -1L;
        this.aT = -1;
        this.aU = 0;
        this.aV = 0;
        this.aW = false;
        this.aX = 0;
        this.aY = false;
        this.aZ = tqr.VERIFICATION_NA;
        this.ba = -1L;
        vox voxVar = vox.PROFILE_CONTACT_SOURCE;
        this.bb = voxVar;
        this.bc = voxVar;
        this.bf = messageIdType;
        this.bm = messageIdType;
        this.bA = messageIdType;
        this.bC = 0L;
        this.bI = false;
        this.bJ = false;
        this.bQ = 0;
        this.bR = false;
        this.bT = true;
        this.bU = uxi.g(-1L);
        MessageIdType messageIdType2 = rvc.a;
        this.bX = messageIdType2;
        this.cf = messageIdType2;
        this.cg = messageIdType2;
    }

    private final String[] k() {
        ao(36, "_id");
        return this.K;
    }

    private final String[] l() {
        ao(149, "part_id");
        return this.bZ;
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
        String aA = aA(this.K);
        String valueOf36 = String.valueOf(this.L);
        String aA2 = aA(this.M);
        String az = az(this.N);
        String aA3 = aA(this.O);
        String az2 = az(this.P);
        String az3 = az(this.Q);
        String ax = ax(this.R);
        String ax2 = ax(this.S);
        String valueOf37 = String.valueOf(this.T);
        String valueOf38 = String.valueOf(this.U);
        String ay = ay(this.V);
        String valueOf39 = String.valueOf(this.W);
        String az4 = az(this.X);
        String valueOf40 = String.valueOf(this.Y);
        String valueOf41 = String.valueOf(this.Z);
        String valueOf42 = String.valueOf(this.aa);
        String valueOf43 = String.valueOf(this.ab);
        String valueOf44 = String.valueOf(this.ac);
        String valueOf45 = String.valueOf(this.ad);
        String az5 = az(this.ae);
        String valueOf46 = String.valueOf(this.af);
        String az6 = az(this.ag);
        String ax3 = ax(this.ah);
        String ax4 = ax(this.ai);
        String aA4 = aA(this.aj);
        String valueOf47 = String.valueOf(this.al);
        byte[] bArr = this.am;
        String str2 = "NULL";
        if (bArr == null) {
            str = "NULL";
        } else {
            str = String.valueOf(bArr.length);
        }
        String concat = "BLOB".concat(String.valueOf(str));
        byte[] bArr2 = this.an;
        if (bArr2 != null) {
            str2 = String.valueOf(bArr2.length);
        }
        return String.format(locale, "ConversationMessagesQuery [messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_message_report_status: %s,\n  messages.messages_seen: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_message_uri: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_sms_message_size: %s,\n  messages.messages_mms_subject: %s,\n  messages.messages_mms_expiry: %s,\n  messages.messages_rcs_expiry: %s,\n  messages.messages_mms_retrieve_text: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_self_id: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_etouffee_status: %s,\n  messages.messages_verification_status: %s,\n  messages.messages_is_hidden: %s,\n  messages.messages_rcs_file_transfer_session_id: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  messages.messages_cms_id: %s,\n  messages.messages_web_id: %s,\n  messages.messages_usage_stats_logging_id: %s,\n  messages.messages_original_rcs_message_id: %s,\n  messages.messages_result_code: %s,\n  messages.messages_cms_life_cycle: %s,\n  messages.messages_fallback_reason: %s,\n  messages.messages_trace_id: %s,\n  messages.messages_xms_transport: %s,\n  null.parts_count: %s,\n  parts.parts__id: %s,\n  parts.parts_message_id: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_original_uri: %s,\n  parts.parts_storage_uri: %s,\n  parts.parts_width: %s,\n  parts.parts_height: %s,\n  parts.parts_timestamp: %s,\n  parts.parts_output_uri: %s,\n  parts.parts_target_size: %s,\n  parts.parts_processing_status: %s,\n  parts.parts_cms_attachment_processing_status: %s,\n  parts.parts_conversation_id: %s,\n  parts.parts_sticker_set_id: %s,\n  parts.parts_sticker_id: %s,\n  parts.parts_media_modified_timestamp: %s,\n  parts.parts_longitude: %s,\n  parts.parts_latitude: %s,\n  parts.parts_preview_content_uri: %s,\n  parts.parts_preview_content_type: %s,\n  parts.parts_fallback_uri: %s,\n  parts.parts_source: %s,\n  parts.parts_bundle_index: %s,\n  parts.parts_blob_id: %s,\n  parts.parts_blob_gaia_email: %s,\n  parts.parts_cms_full_size_blob_id: %s,\n  parts.parts_cms_media_encryption_key: %s,\n  parts.parts_cms_compressed_media_encryption_key: %s,\n  parts.parts_blob_upload_permanent_failure: %s,\n  parts.parts_blob_upload_timestamp: %s,\n  parts.parts_expressive_sticker_name: %s,\n  parts.parts_file_name: %s,\n  parts.parts_duration: %s,\n  parts.parts_compressed_blob_id: %s,\n  parts.parts_cms_compressed_blob_id: %s,\n  parts.parts_compressed_blob_upload_permanent_failure: %s,\n  parts.parts_compressed_blob_upload_timestamp: %s,\n  parts.parts_media_encryption_key: %s,\n  parts.parts_compressed_media_encryption_key: %s,\n  parts.parts_missing_entry_in_telephony: %s,\n  parts.parts_awaiting_reverse_sync: %s,\n  parts.parts_file_size_bytes: %s,\n  parts.parts_local_cache_path: %s,\n  parts.parts_media_send_type: %s,\n  parts.parts_voice_metadata: %s,\n  parts.parts_validation_status: %s,\n  parts.parts_processing_id: %s,\n  parts.parts_rich_card_media_download_failure_reason: %s,\n  parts.parts_image_display_state: %s,\n  parts.parts_rowid: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_send_destination: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  participants.participants_profile_photo_uri: %s,\n  participants.participants_contact_id: %s,\n  participants.participants_lookup_key: %s,\n  participants.participants_color_palette_index: %s,\n  participants.participants_color_type: %s,\n  participants.participants_extended_color: %s,\n  participants.participants_blocked: %s,\n  participants.participants_participant_type: %s,\n  participants.participants_is_spam: %s,\n  participants.participants_latest_verification_status: %s,\n  participants.participants_directory_id: %s,\n  participants.participants_name_source: %s,\n  participants.participants_photo_source: %s,\n  reports_concat_view.reports_concat_view_read_reports__id: %s,\n  reports_concat_view.reports_concat_view_read_reports_message_id: %s,\n  reports_concat_view.reports_concat_view_read_reports_participant_id: %s,\n  reports_concat_view.reports_concat_view_read_reports_receive_time: %s,\n  reports_concat_view.reports_concat_view_read_reports_read_time: %s,\n  reports_concat_view.reports_concat_view_read_reports_ftd_time: %s,\n  reports_concat_view.reports_concat_view_read_reports_read_reports__ROWID: %s,\n  user_refs_concat_view.user_refs_concat_view_user_references_message_id: %s,\n  user_refs_concat_view.user_refs_concat_view_user_references_participant_id: %s,\n  user_refs_concat_view.user_refs_concat_view_user_references_user_ref_datetime: %s,\n  user_refs_concat_view.user_refs_concat_view_user_references_user_references__ROWID: %s,\n  user_refs_concat_view.user_refs_concat_view_user_ref_display_name: %s,\n  user_refs_concat_view.user_refs_concat_view_user_ref_profile_photo_uri: %s,\n  user_refs_concat_view.user_refs_concat_view_user_ref_full_name: %s,\n  user_refs_concat_view.user_refs_concat_view_user_ref_lookup_key: %s,\n  user_refs_concat_view.user_refs_concat_view_participants_normalized_destination: %s,\n  user_refs_concat_view.user_refs_concat_view_participants_color_palette_index: %s,\n  user_refs_concat_view.user_refs_concat_view_participants_color_type: %s,\n  user_refs_concat_view.user_refs_concat_view_participants_extended_color: %s,\n  user_refs_concat_view.user_refs_concat_view_participants_participants__ROWID: %s,\n  link_preview.link_preview_message_id: %s,\n  link_preview.link_preview_trigger_url: %s,\n  link_preview.link_preview_expiration_time_millis: %s,\n  link_preview.link_preview_link_title: %s,\n  link_preview.link_preview_link_description: %s,\n  link_preview.link_preview_link_image_url: %s,\n  link_preview.link_preview_link_domain: %s,\n  link_preview.link_preview_link_canonical_url: %s,\n  link_preview.link_preview_link_preview_prevented: %s,\n  link_preview.link_preview_link_preview_failed: %s,\n  verified_sms_brands.verified_sms_brands_name: %s,\n  verified_sms_brands.verified_sms_brands_description: %s,\n  verified_sms_brands.verified_sms_brands_logo_uri: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_recipient_offline_timestamp_ms: %s,\n  message_reactions.message_reactions_reactions_data: %s,\n  file_transfer.file_transfer_transfer_id: %s,\n  message_star.message_star_message_id: %s,\n  message_photos_sharing.message_photos_sharing_sharing_state: %s,\n  vmt.vmt_part_id: %s,\n  vmt.vmt_vmt_status: %s,\n  vmt.vmt_text: %s,\n  vmt.vmt_locale: %s,\n  vmt.vmt_rowid: %s,\n  message_replies_view.message_replies_view_message_replies_message_id: %s,\n  message_replies_view.message_replies_view_messages__id: %s,\n  message_replies_view.message_replies_view_messages_received_timestamp: %s,\n  message_replies_view.message_replies_view_participants__id: %s,\n  message_replies_view.message_replies_view_participants_sub_id: %s,\n  message_replies_view.message_replies_view_participants_normalized_destination: %s,\n  message_replies_view.message_replies_view_participants_display_destination: %s,\n  message_replies_view.message_replies_view_participants_full_name: %s,\n  message_replies_view.message_replies_view_participants_first_name: %s,\n  message_replies_view.message_replies_view_parts__id: %s,\n  message_replies_view.message_replies_view_parts_text: %s,\n  message_replies_view.message_replies_view_parts_uri: %s,\n  message_replies_view.message_replies_view_parts_content_type: %s,\n  message_replies_view.message_replies_view_parts_file_name: %s,\n  message_replies_view.message_replies_view_parts_duration: %s,\n  message_replies_view.message_replies_view_parts_parts__ROWID: %s,\n  message_replies_view.message_replies_view_link_preview_trigger_url: %s,\n  message_replies_view.message_replies_view_link_preview_expiration_time_millis: %s,\n  message_replies_view.message_replies_view_link_preview_link_title: %s,\n  message_replies_view.message_replies_view_link_preview_link_image_url: %s,\n  message_replies_view.message_replies_view_link_preview_link_preview_failed: %s,\n  profiles_table.profiles_table_display_name: %s,\n  message_captions.message_captions_caption: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, "REDACTED", aA, valueOf36, aA2, az, aA3, az2, az3, ax, ax2, valueOf37, valueOf38, ay, valueOf39, az4, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, az5, valueOf46, az6, ax3, ax4, aA4, "REDACTED", valueOf47, concat, "BLOB".concat(String.valueOf(str2)), aB(this.ao), ay(this.ap), aA(this.aq), aA(this.ar), ay(this.as), aA(this.at), String.valueOf(this.au), aB(this.av), ay(this.aw), az(this.ax), az(this.ay), aB(this.az), String.valueOf(this.aA), String.valueOf(this.aB), String.valueOf(this.aC), az(this.aD), String.valueOf(this.aE), String.valueOf(this.aF), String.valueOf(this.aG), String.valueOf(this.aH), String.valueOf(this.aI), ay(this.aJ), String.valueOf(this.aL), String.valueOf(this.aM), String.valueOf(this.aN), String.valueOf(this.aO), String.valueOf(this.aP), String.valueOf(this.aQ), String.valueOf(this.aR), String.valueOf(this.aS), String.valueOf(this.aT), String.valueOf(this.aU), String.valueOf(this.aV), String.valueOf(this.aW), String.valueOf(this.aX), String.valueOf(this.aY), String.valueOf(this.aZ), String.valueOf(this.ba), String.valueOf(this.bb), String.valueOf(this.bc), String.valueOf(this.be), String.valueOf(this.bf), ay(this.bg), ay(this.bh), ay(this.bi), az(this.bj), ay(this.bk), String.valueOf(this.bm), ay(this.bn), ay(this.bo), ay(this.bp), aA(this.bq), aA(this.br), aA(this.bs), aA(this.bt), aA(this.bu), ax(this.bv), ax(this.bw), ax(this.bx), ay(this.by), String.valueOf(this.bA), String.valueOf(this.bB), String.valueOf(this.bC), String.valueOf(this.bD), String.valueOf(this.bE), String.valueOf(this.bF), String.valueOf(this.bG), String.valueOf(this.bH), String.valueOf(this.bI), String.valueOf(this.bJ), String.valueOf(this.bL), String.valueOf(this.bM), String.valueOf(this.bN), String.valueOf(this.bP), String.valueOf(this.bQ), String.valueOf(this.bR), String.valueOf(this.bS), String.valueOf(this.bT), String.valueOf(this.bU), String.valueOf(this.bV), String.valueOf(this.bW), String.valueOf(this.bX), String.valueOf(this.bY), aA(this.bZ), az(this.ca), aA(this.cb), aA(this.cc), ay(this.cd), String.valueOf(this.cf), String.valueOf(this.cg), String.valueOf(this.ch), String.valueOf(this.ci), String.valueOf(this.cj), String.valueOf(this.ck), String.valueOf(this.cl), String.valueOf(this.cm), String.valueOf(this.cn), aA(this.co), aA(this.cp), az(this.cq), aA(this.cr), aA(this.cs), ay(this.ct), ay(this.cu), String.valueOf(this.cv), String.valueOf(this.cw), String.valueOf(this.cx), String.valueOf(this.cy), String.valueOf(this.cz), String.valueOf(this.cB), String.valueOf(this.cC));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        valueOf.intValue();
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        aggp aggpVar;
        sbd sbdVar = (sbd) agmqVar;
        aq();
        this.cJ = sbdVar.dx();
        if (sbdVar.db(0)) {
            this.a = sbdVar.O();
            fE(0);
        }
        if (sbdVar.db(1)) {
            this.b = sbdVar.M();
            fE(1);
        }
        if (sbdVar.db(2)) {
            this.c = sbdVar.aU();
            fE(2);
        }
        if (sbdVar.db(3)) {
            this.d = sbdVar.E();
            fE(3);
        }
        if (sbdVar.db(4)) {
            this.e = sbdVar.C();
            fE(4);
        }
        if (sbdVar.db(5)) {
            this.f = sbdVar.l();
            fE(5);
        }
        if (sbdVar.db(6)) {
            this.g = sbdVar.r();
            fE(6);
        }
        if (sbdVar.db(7)) {
            this.h = sbdVar.j();
            fE(7);
        }
        if (sbdVar.db(8)) {
            this.i = sbdVar.bi();
            fE(8);
        }
        if (sbdVar.db(9)) {
            this.j = sbdVar.bk();
            fE(9);
        }
        if (sbdVar.db(10)) {
            this.k = sbdVar.K();
            fE(10);
        }
        if (sbdVar.db(11)) {
            this.l = sbdVar.q();
            fE(11);
        }
        if (sbdVar.db(12)) {
            this.m = sbdVar.F();
            fE(12);
        }
        if (sbdVar.db(13)) {
            this.n = sbdVar.aK();
            fE(13);
        }
        if (sbdVar.db(14)) {
            this.o = sbdVar.z();
            fE(14);
        }
        if (sbdVar.db(15)) {
            this.p = sbdVar.A();
            fE(15);
        }
        if (sbdVar.db(16)) {
            this.q = sbdVar.aJ();
            fE(16);
        }
        if (sbdVar.db(17)) {
            this.r = sbdVar.m();
            fE(17);
        }
        if (sbdVar.db(18)) {
            this.s = sbdVar.aS();
            fE(18);
        }
        if (sbdVar.db(19)) {
            this.t = sbdVar.X();
            fE(19);
        }
        if (sbdVar.db(20)) {
            this.u = sbdVar.n();
            fE(20);
        }
        if (sbdVar.db(21)) {
            this.v = sbdVar.af();
            fE(21);
        }
        if (sbdVar.db(22)) {
            this.w = sbdVar.bd();
            fE(22);
        }
        if (sbdVar.db(23)) {
            this.x = sbdVar.B();
            fE(23);
        }
        if (sbdVar.db(24)) {
            this.y = sbdVar.p();
            fE(24);
        }
        if (sbdVar.db(25)) {
            this.z = sbdVar.aV();
            fE(25);
        }
        if (sbdVar.db(26)) {
            this.A = sbdVar.ap();
            fE(26);
        }
        if (sbdVar.db(27)) {
            this.B = sbdVar.getString(sbdVar.cI(27, sbi.a));
            fE(27);
        }
        if (sbdVar.db(28)) {
            this.C = sbdVar.getLong(sbdVar.cI(28, sbi.a));
            fE(28);
        }
        if (sbdVar.db(29)) {
            this.D = sbdVar.W();
            fE(29);
        }
        if (sbdVar.db(30)) {
            this.E = sbdVar.o();
            fE(30);
        }
        if (sbdVar.db(31)) {
            this.F = sbdVar.ak();
            fE(31);
        }
        if (sbdVar.db(32)) {
            this.G = sbdVar.aa();
            fE(32);
        }
        if (sbdVar.db(33)) {
            this.H = sbdVar.aZ();
            fE(33);
        }
        if (sbdVar.db(34)) {
            tqu[] values = tqu.values();
            int i = sbdVar.getInt(sbdVar.cI(34, sbi.a));
            if (i < values.length) {
                this.I = values[i];
                fE(34);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (sbdVar.db(35)) {
            this.J = sbdVar.aP();
            fE(35);
        }
        if (sbdVar.db(36)) {
            this.K = sbdVar.bY();
            fE(36);
        }
        if (sbdVar.db(37)) {
            this.L = sbdVar.T();
            fE(37);
        }
        if (sbdVar.db(38)) {
            this.M = sbdVar.cd();
            fE(38);
        }
        if (sbdVar.db(39)) {
            this.N = sbdVar.bK();
            fE(39);
        }
        if (sbdVar.db(40)) {
            this.O = sbdVar.bT();
            fE(40);
        }
        if (sbdVar.db(41)) {
            this.P = sbdVar.bH();
            fE(41);
        }
        if (sbdVar.db(42)) {
            this.Q = sbdVar.bJ();
            fE(42);
        }
        if (sbdVar.db(43)) {
            this.R = agnc.w(sbd.dl(sbdVar.getString(87)), sbd.dk(sbdVar.getString(sbdVar.cI(43, sbi.a))));
            fE(43);
        }
        if (sbdVar.db(44)) {
            this.S = sbdVar.br();
            fE(44);
        }
        if (sbdVar.db(45)) {
            this.T = sbdVar.G();
            fE(45);
        }
        if (sbdVar.db(46)) {
            this.U = sbdVar.I();
            fE(46);
        }
        if (sbdVar.db(47)) {
            this.V = sbdVar.bF();
            fE(47);
        }
        if (sbdVar.db(48)) {
            this.W = sbdVar.ac();
            fE(48);
        }
        if (sbdVar.db(49)) {
            this.X = sbdVar.bN();
            fE(49);
        }
        if (sbdVar.db(50)) {
            this.Y = sbdVar.N();
            fE(50);
        }
        if (sbdVar.db(51)) {
            this.Z = sbdVar.Z();
            fE(51);
        }
        if (sbdVar.db(52)) {
            this.aa = sbdVar.Y();
            fE(52);
        }
        if (sbdVar.db(53)) {
            this.ab = sbdVar.y();
            fE(53);
        }
        if (sbdVar.db(54)) {
            this.ac = sbdVar.e();
            fE(54);
        }
        if (sbdVar.db(55)) {
            this.ad = sbdVar.c();
            fE(55);
        }
        if (sbdVar.db(56)) {
            this.ae = sbdVar.bI();
            fE(56);
        }
        if (sbdVar.db(57)) {
            this.af = sbdVar.aQ();
            fE(57);
        }
        if (sbdVar.db(58)) {
            this.ag = sbdVar.bG();
            fE(58);
        }
        if (sbdVar.db(59)) {
            this.ah = sbdVar.bs();
            fE(59);
        }
        if (sbdVar.db(60)) {
            this.ai = sbdVar.bn();
            fE(60);
        }
        if (sbdVar.db(61)) {
            this.aj = sbdVar.bR();
            fE(61);
        }
        if (sbdVar.db(62)) {
            this.ak = sbdVar.bQ();
            fE(62);
        }
        if (sbdVar.db(63)) {
            this.al = sbdVar.ao();
            fE(63);
        }
        if (sbdVar.db(64)) {
            this.am = sbdVar.bm();
            fE(64);
        }
        if (sbdVar.db(65)) {
            this.an = sbdVar.bl();
            fE(65);
        }
        if (sbdVar.db(66)) {
            this.ao = sbdVar.cj();
            fE(66);
        }
        if (sbdVar.db(67)) {
            this.ap = sbdVar.bt();
            fE(67);
        }
        if (sbdVar.db(68)) {
            this.aq = sbdVar.bV();
            fE(68);
        }
        if (sbdVar.db(69)) {
            this.ar = sbdVar.bW();
            fE(69);
        }
        if (sbdVar.db(70)) {
            this.as = sbdVar.bv();
            fE(70);
        }
        if (sbdVar.db(71)) {
            this.at = sbdVar.bS();
            fE(71);
        }
        if (sbdVar.db(72)) {
            this.au = sbdVar.an();
            fE(72);
        }
        if (sbdVar.db(73)) {
            this.av = sbdVar.ck();
            fE(73);
        }
        if (sbdVar.db(74)) {
            this.aw = sbdVar.bu();
            fE(74);
        }
        if (sbdVar.db(75)) {
            this.ax = sbdVar.cn();
            fE(75);
        }
        if (sbdVar.db(76)) {
            this.ay = sbdVar.cm();
            fE(76);
        }
        if (sbdVar.db(77)) {
            this.az = sbdVar.cl();
            fE(77);
        }
        if (sbdVar.db(78)) {
            this.aA = sbdVar.ba();
            fE(78);
        }
        if (sbdVar.db(79)) {
            this.aB = sbdVar.x();
            fE(79);
        }
        if (sbdVar.db(80)) {
            this.aC = sbdVar.aH();
            fE(80);
        }
        if (sbdVar.db(81)) {
            this.aD = sbdVar.bO();
            fE(81);
        }
        if (sbdVar.db(82)) {
            byte[] blob = sbdVar.getBlob(sbdVar.cI(82, sbi.a));
            if (blob == null) {
                aggpVar = null;
            } else {
                try {
                    aggpVar = (aggp) apag.parseFrom(aggp.a, blob, aozs.a());
                } catch (Throwable unused) {
                    aggpVar = aggp.a;
                }
            }
            this.aE = aggpVar;
            fE(82);
        }
        if (sbdVar.db(83)) {
            tqw[] values2 = tqw.values();
            int i2 = sbdVar.getInt(sbdVar.cI(83, sbi.a));
            if (i2 < values2.length) {
                this.aF = values2[i2];
                fE(83);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (sbdVar.db(84)) {
            this.aG = sbdVar.L();
            fE(84);
        }
        if (sbdVar.db(85)) {
            this.aH = sbdVar.ad();
            fE(85);
        }
        if (sbdVar.db(86)) {
            this.aI = sbdVar.ab();
            fE(86);
        }
        if (sbdVar.db(87)) {
            this.aJ = sbdVar.bA();
            fE(87);
        }
        if (sbdVar.db(88)) {
            this.aL = sbdVar.aM();
            fE(88);
        }
        if (sbdVar.db(89)) {
            this.aM = sbdVar.aT();
            fE(89);
        }
        if (sbdVar.db(90)) {
            this.aN = sbdVar.ar();
            fE(90);
        }
        if (sbdVar.db(91)) {
            this.aO = sbdVar.aw();
            fE(91);
        }
        if (sbdVar.db(92)) {
            this.aP = sbdVar.au();
            fE(92);
        }
        if (sbdVar.db(93)) {
            this.aQ = sbdVar.J();
            fE(93);
        }
        if (sbdVar.db(94)) {
            this.aR = sbdVar.t();
            fE(94);
        }
        if (sbdVar.db(95)) {
            this.aS = sbdVar.aI();
            fE(95);
        }
        if (sbdVar.db(96)) {
            this.aT = sbdVar.f();
            fE(96);
        }
        if (sbdVar.db(97)) {
            this.aU = sbdVar.g();
            fE(97);
        }
        if (sbdVar.db(98)) {
            this.aV = sbdVar.i();
            fE(98);
        }
        if (sbdVar.db(99)) {
            this.aW = sbdVar.bb();
            fE(99);
        }
        if (sbdVar.db(100)) {
            this.aX = sbdVar.k();
            fE(100);
        }
        if (sbdVar.db(101)) {
            this.aY = sbdVar.be();
            fE(101);
        }
        if (sbdVar.db(102)) {
            this.aZ = sbdVar.ae();
            fE(102);
        }
        if (sbdVar.db(103)) {
            this.ba = sbdVar.u();
            fE(103);
        }
        if (sbdVar.db(104)) {
            this.bb = sbdVar.ah();
            fE(104);
        }
        if (sbdVar.db(105)) {
            this.bc = sbdVar.ai();
            fE(105);
        }
        if (sbdVar.db(106)) {
            this.be = sbdVar.az();
            fE(106);
        }
        if (sbdVar.db(107)) {
            this.bf = sbdVar.U();
            fE(107);
        }
        if (sbdVar.db(108)) {
            this.bg = sbdVar.bx();
            fE(108);
        }
        if (sbdVar.db(109)) {
            this.bh = sbdVar.bE();
            fE(109);
        }
        if (sbdVar.db(110)) {
            this.bi = sbdVar.bD();
            fE(110);
        }
        if (sbdVar.db(111)) {
            this.bj = sbdVar.bP();
            fE(111);
        }
        if (sbdVar.db(112)) {
            this.bk = sbdVar.bC();
            fE(112);
        }
        if (sbdVar.db(113)) {
            this.bm = sbdVar.V();
            fE(113);
        }
        if (sbdVar.db(114)) {
            this.bn = sbdVar.by();
            fE(114);
        }
        if (sbdVar.db(115)) {
            this.bo = agnc.y(null, sbd.dl(sbdVar.getString(sbdVar.cI(115, sbi.a))));
            fE(115);
        }
        if (sbdVar.db(116)) {
            this.bp = agnc.y(null, sbd.dl(sbdVar.getString(sbdVar.cI(116, sbi.a))));
            fE(116);
        }
        if (sbdVar.db(117)) {
            this.bq = sbdVar.cg();
            fE(117);
        }
        if (sbdVar.db(118)) {
            this.br = (String[]) agnc.z(null, sbd.dm(sbdVar.getString(sbdVar.cI(118, sbi.a))), new String[0]);
            fE(118);
        }
        if (sbdVar.db(119)) {
            this.bs = sbdVar.ch();
            fE(119);
        }
        if (sbdVar.db(120)) {
            this.bt = sbdVar.ci();
            fE(120);
        }
        if (sbdVar.db(121)) {
            this.bu = sbdVar.cb();
            fE(121);
        }
        if (sbdVar.db(122)) {
            this.bv = sbdVar.bo();
            fE(122);
        }
        if (sbdVar.db(123)) {
            this.bw = sbdVar.bp();
            fE(123);
        }
        if (sbdVar.db(124)) {
            this.bx = sbdVar.bq();
            fE(124);
        }
        if (sbdVar.db(125)) {
            this.by = sbdVar.bz();
            fE(125);
        }
        if (sbdVar.db(126)) {
            this.bA = sbdVar.Q();
            fE(126);
        }
        if (sbdVar.db(127)) {
            this.bB = sbdVar.aX();
            fE(127);
        }
        if (sbdVar.db(128)) {
            this.bC = sbdVar.v();
            fE(128);
        }
        if (sbdVar.db(129)) {
            this.bD = sbdVar.aF();
            fE(129);
        }
        if (sbdVar.db(130)) {
            this.bE = sbdVar.aB();
            fE(130);
        }
        if (sbdVar.db(131)) {
            this.bF = sbdVar.aD();
            fE(131);
        }
        if (sbdVar.db(132)) {
            this.bG = sbdVar.aC();
            fE(132);
        }
        if (sbdVar.db(133)) {
            this.bH = sbdVar.aA();
            fE(133);
        }
        if (sbdVar.db(134)) {
            this.bI = sbdVar.bh();
            fE(134);
        }
        if (sbdVar.db(135)) {
            this.bJ = sbdVar.bf();
            fE(135);
        }
        if (sbdVar.db(136)) {
            this.bL = sbdVar.aL();
            fE(136);
        }
        if (sbdVar.db(137)) {
            this.bM = sbdVar.aq();
            fE(137);
        }
        if (sbdVar.db(138)) {
            this.bN = sbdVar.H();
            fE(138);
        }
        if (sbdVar.db(139)) {
            this.bP = sbdVar.aO();
            fE(139);
        }
        if (sbdVar.db(140)) {
            this.bQ = sbdVar.h();
            fE(140);
        }
        if (sbdVar.db(141)) {
            this.bR = sbdVar.bc();
            fE(141);
        }
        if (sbdVar.db(142)) {
            this.bS = sbdVar.aR();
            fE(142);
        }
        if (sbdVar.db(143)) {
            this.bT = sbdVar.bj();
            fE(143);
        }
        if (sbdVar.db(144)) {
            this.bU = sbdVar.al();
            fE(144);
        }
        if (sbdVar.db(145)) {
            this.bV = sbdVar.aj();
            fE(145);
        }
        if (sbdVar.db(146)) {
            this.bW = sbdVar.aW();
            fE(146);
        }
        if (sbdVar.db(147)) {
            this.bX = sbdVar.S();
            fE(147);
        }
        if (sbdVar.db(148)) {
            this.bY = sbdVar.ag();
            fE(148);
        }
        if (sbdVar.db(149)) {
            this.bZ = sbdVar.cc();
            fE(149);
        }
        if (sbdVar.db(150)) {
            this.ca = sbdVar.bM();
            fE(150);
        }
        if (sbdVar.db(151)) {
            this.cb = sbdVar.cf();
            fE(151);
        }
        if (sbdVar.db(152)) {
            this.cc = sbdVar.ca();
            fE(152);
        }
        if (sbdVar.db(153)) {
            this.cd = agnc.y(sbd.dl(sbdVar.getString(153)), sbd.dl(sbdVar.getString(sbdVar.cI(153, sbi.a))));
            fE(153);
        }
        if (sbdVar.db(154)) {
            this.cf = sbdVar.R();
            fE(154);
        }
        if (sbdVar.db(155)) {
            this.cg = sbdVar.P();
            fE(155);
        }
        if (sbdVar.db(156)) {
            this.ch = sbdVar.D();
            fE(156);
        }
        if (sbdVar.db(157)) {
            this.ci = sbdVar.ay();
            fE(157);
        }
        if (sbdVar.db(158)) {
            this.cj = sbdVar.s();
            fE(158);
        }
        if (sbdVar.db(159)) {
            this.ck = sbdVar.aN();
            fE(159);
        }
        if (sbdVar.db(160)) {
            this.cl = sbdVar.as();
            fE(160);
        }
        if (sbdVar.db(161)) {
            this.cm = sbdVar.ax();
            fE(161);
        }
        if (sbdVar.db(162)) {
            this.cn = sbdVar.av();
            fE(162);
        }
        if (sbdVar.db(163)) {
            this.co = sbdVar.bZ();
            fE(163);
        }
        if (sbdVar.db(164)) {
            this.cp = sbdVar.ce();
            fE(164);
        }
        if (sbdVar.db(165)) {
            this.cq = sbdVar.bL();
            fE(165);
        }
        if (sbdVar.db(166)) {
            this.cr = sbdVar.bU();
            fE(166);
        }
        if (sbdVar.db(167)) {
            this.cs = sbdVar.bX();
            fE(167);
        }
        if (sbdVar.db(168)) {
            this.ct = sbdVar.bw();
            fE(168);
        }
        if (sbdVar.db(169)) {
            this.cu = sbdVar.bB();
            fE(169);
        }
        if (sbdVar.db(170)) {
            this.cv = sbdVar.aY();
            fE(170);
        }
        if (sbdVar.db(171)) {
            this.cw = sbdVar.w();
            fE(171);
        }
        if (sbdVar.db(172)) {
            this.cx = sbdVar.aG();
            fE(172);
        }
        if (sbdVar.db(173)) {
            this.cy = sbdVar.aE();
            fE(173);
        }
        if (sbdVar.db(174)) {
            this.cz = sbdVar.bg();
            fE(174);
        }
        if (sbdVar.db(175)) {
            this.cB = sbdVar.at();
            fE(175);
        }
        if (sbdVar.db(176)) {
            this.cC = sbdVar.am();
            fE(176);
        }
        h();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof saz)) {
            return false;
        }
        saz sazVar = (saz) obj;
        if (super.aC(sazVar.cJ) && Objects.equals(this.a, sazVar.a) && Objects.equals(this.b, sazVar.b) && Objects.equals(this.c, sazVar.c) && this.d == sazVar.d && this.e == sazVar.e && this.f == sazVar.f && this.g == sazVar.g && this.h == sazVar.h && this.i == sazVar.i && this.j == sazVar.j && Objects.equals(this.k, sazVar.k) && this.l == sazVar.l && this.m == sazVar.m && Objects.equals(this.n, sazVar.n) && this.o == sazVar.o && this.p == sazVar.p && Objects.equals(this.q, sazVar.q) && this.r == sazVar.r && Objects.equals(this.s, sazVar.s) && Objects.equals(this.t, sazVar.t) && this.u == sazVar.u && this.v == sazVar.v && this.w == sazVar.w && this.x == sazVar.x && this.y == sazVar.y && Objects.equals(this.z, sazVar.z) && Objects.equals(this.A, sazVar.A) && Objects.equals(this.B, sazVar.B) && this.C == sazVar.C && Objects.equals(this.D, sazVar.D) && this.E == sazVar.E && this.F == sazVar.F && this.G == sazVar.G && Objects.equals(this.H, sazVar.H) && this.I == sazVar.I && Objects.equals(this.J, sazVar.J) && Arrays.equals(this.K, sazVar.K) && Objects.equals(this.L, sazVar.L) && Arrays.equals(this.M, sazVar.M) && Arrays.equals(this.N, sazVar.N) && Arrays.equals(this.O, sazVar.O) && Arrays.equals(this.P, sazVar.P) && Arrays.equals(this.Q, sazVar.Q) && Arrays.equals(this.R, sazVar.R) && Arrays.equals(this.S, sazVar.S) && this.T == sazVar.T && Objects.equals(this.U, sazVar.U) && Arrays.equals(this.V, sazVar.V) && this.W == sazVar.W && Arrays.equals(this.X, sazVar.X) && Objects.equals(this.Y, sazVar.Y) && Objects.equals(this.Z, sazVar.Z) && Objects.equals(this.aa, sazVar.aa) && this.ab == sazVar.ab && this.ac == sazVar.ac && this.ad == sazVar.ad && Arrays.equals(this.ae, sazVar.ae) && Objects.equals(this.af, sazVar.af) && Arrays.equals(this.ag, sazVar.ag) && Arrays.equals(this.ah, sazVar.ah) && Arrays.equals(this.ai, sazVar.ai) && Arrays.equals(this.aj, sazVar.aj) && Arrays.equals(this.ak, sazVar.ak) && Objects.equals(this.al, sazVar.al) && Arrays.equals(this.am, sazVar.am) && Arrays.equals(this.an, sazVar.an) && Arrays.equals(this.ao, sazVar.ao) && Arrays.equals(this.ap, sazVar.ap) && Arrays.equals(this.aq, sazVar.aq) && Arrays.equals(this.ar, sazVar.ar) && Arrays.equals(this.as, sazVar.as) && Arrays.equals(this.at, sazVar.at) && Objects.equals(this.au, sazVar.au) && Arrays.equals(this.av, sazVar.av) && Arrays.equals(this.aw, sazVar.aw) && Arrays.deepEquals(this.ax, sazVar.ax) && Arrays.deepEquals(this.ay, sazVar.ay) && Arrays.equals(this.az, sazVar.az) && this.aA == sazVar.aA && this.aB == sazVar.aB && Objects.equals(this.aC, sazVar.aC) && Arrays.equals(this.aD, sazVar.aD) && Objects.equals(this.aE, sazVar.aE) && this.aF == sazVar.aF && Objects.equals(this.aG, sazVar.aG) && this.aH == sazVar.aH && this.aI == sazVar.aI && Arrays.equals(this.aJ, sazVar.aJ) && Objects.equals(this.aL, sazVar.aL) && Objects.equals(this.aM, sazVar.aM) && Objects.equals(this.aN, sazVar.aN) && Objects.equals(this.aO, sazVar.aO) && Objects.equals(this.aP, sazVar.aP) && Objects.equals(this.aQ, sazVar.aQ) && this.aR == sazVar.aR && Objects.equals(this.aS, sazVar.aS) && this.aT == sazVar.aT && this.aU == sazVar.aU && this.aV == sazVar.aV && this.aW == sazVar.aW && this.aX == sazVar.aX && this.aY == sazVar.aY && this.aZ == sazVar.aZ && this.ba == sazVar.ba && this.bb == sazVar.bb && this.bc == sazVar.bc && Objects.equals(this.be, sazVar.be) && Objects.equals(this.bf, sazVar.bf) && Arrays.equals(this.bg, sazVar.bg) && Arrays.equals(this.bh, sazVar.bh) && Arrays.equals(this.bi, sazVar.bi) && Arrays.equals(this.bj, sazVar.bj) && Arrays.equals(this.bk, sazVar.bk) && Objects.equals(this.bm, sazVar.bm) && Arrays.equals(this.bn, sazVar.bn) && Arrays.equals(this.bo, sazVar.bo) && Arrays.equals(this.bp, sazVar.bp) && Arrays.equals(this.bq, sazVar.bq) && Arrays.equals(this.br, sazVar.br) && Arrays.equals(this.bs, sazVar.bs) && Arrays.equals(this.bt, sazVar.bt) && Arrays.equals(this.bu, sazVar.bu) && Arrays.equals(this.bv, sazVar.bv) && Arrays.equals(this.bw, sazVar.bw) && Arrays.equals(this.bx, sazVar.bx) && Arrays.equals(this.by, sazVar.by) && Objects.equals(this.bA, sazVar.bA) && Objects.equals(this.bB, sazVar.bB) && this.bC == sazVar.bC && Objects.equals(this.bD, sazVar.bD) && Objects.equals(this.bE, sazVar.bE) && Objects.equals(this.bF, sazVar.bF) && Objects.equals(this.bG, sazVar.bG) && Objects.equals(this.bH, sazVar.bH) && this.bI == sazVar.bI && this.bJ == sazVar.bJ && Objects.equals(this.bL, sazVar.bL) && Objects.equals(this.bM, sazVar.bM) && Objects.equals(this.bN, sazVar.bN) && Objects.equals(this.bP, sazVar.bP) && this.bQ == sazVar.bQ && this.bR == sazVar.bR && Objects.equals(this.bS, sazVar.bS) && this.bT == sazVar.bT && Objects.equals(this.bU, sazVar.bU) && Objects.equals(this.bV, sazVar.bV) && Objects.equals(this.bW, sazVar.bW) && Objects.equals(this.bX, sazVar.bX) && Objects.equals(this.bY, sazVar.bY) && Arrays.equals(this.bZ, sazVar.bZ) && Arrays.equals(this.ca, sazVar.ca) && Arrays.equals(this.cb, sazVar.cb) && Arrays.equals(this.cc, sazVar.cc) && Arrays.equals(this.cd, sazVar.cd) && Objects.equals(this.cf, sazVar.cf) && Objects.equals(this.cg, sazVar.cg) && this.ch == sazVar.ch && Objects.equals(this.ci, sazVar.ci) && this.cj == sazVar.cj && Objects.equals(this.ck, sazVar.ck) && Objects.equals(this.cl, sazVar.cl) && Objects.equals(this.cm, sazVar.cm) && Objects.equals(this.cn, sazVar.cn) && Arrays.equals(this.co, sazVar.co) && Arrays.equals(this.cp, sazVar.cp) && Arrays.equals(this.cq, sazVar.cq) && Arrays.equals(this.cr, sazVar.cr) && Arrays.equals(this.cs, sazVar.cs) && Arrays.equals(this.ct, sazVar.ct) && Arrays.equals(this.cu, sazVar.cu) && Objects.equals(this.cv, sazVar.cv) && this.cw == sazVar.cw && Objects.equals(this.cx, sazVar.cx) && Objects.equals(this.cy, sazVar.cy) && this.cz == sazVar.cz && Objects.equals(this.cB, sazVar.cB) && Objects.equals(this.cC, sazVar.cC)) {
            return true;
        }
        return false;
    }

    public final int f() {
        ao(140, "conv_type");
        return this.bQ;
    }

    public final String g() {
        ao(175, "display_name");
        return this.cB;
    }

    public final void h() {
        Integer valueOf;
        int i;
        int i2;
        int length;
        String str;
        int length2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        sxn c = MessagesTable.c();
        int i3 = 0;
        String str2 = "_id";
        ao(0, "_id");
        c.v(this.a);
        ao(1, "conversation_id");
        c.m(this.b);
        ao(2, "sender_id");
        c.af(this.c);
        ao(3, "sent_timestamp");
        c.ah(this.d);
        ao(4, "received_timestamp");
        c.X(this.e);
        ao(5, "message_protocol");
        c.N(this.f);
        ao(6, "message_status");
        c.an(this.g);
        if (intValue >= 13020) {
            ao(7, "message_report_status");
            c.y(this.h);
        }
        ao(8, "seen");
        c.G(this.i);
        ao(9, "read");
        c.W(this.j);
        ao(10, "sms_message_uri");
        c.al(this.k);
        ao(11, "sms_priority");
        c.am(this.l);
        ao(12, "sms_message_size");
        c.ak(this.m);
        ao(13, "mms_subject");
        c.C(this.n);
        ao(14, "mms_expiry");
        c.A(this.o);
        if (intValue >= 59890) {
            ao(15, "rcs_expiry");
            c.R(this.p);
        }
        if (intValue >= 9030) {
            ao(16, "mms_retrieve_text");
            c.B(this.q);
        }
        ao(17, "raw_status");
        c.P(this.r);
        ao(18, "self_id");
        c.ad(this.s);
        if (intValue >= 41040) {
            ao(19, "rcs_message_id_with_text_type");
            c.T(this.t);
        }
        if (intValue >= 29060) {
            ao(20, "etouffee_status");
            c.Q(this.u);
        }
        if (intValue >= 29090) {
            ao(21, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
            c.aq(this.v);
        }
        if (intValue >= 30010) {
            ao(22, "is_hidden");
            c.w(this.w);
        }
        if (intValue >= 10004) {
            ao(23, "rcs_file_transfer_session_id");
            c.S(this.x);
        }
        if (intValue >= 9000) {
            ao(24, "sms_error_code");
            c.ai(this.y);
        }
        if (intValue >= 9000) {
            ao(25, "sms_error_desc_map_name");
            c.aj(this.z);
        }
        if (intValue >= 31010) {
            ao(26, "cms_id");
            c.j(this.A);
        }
        if (intValue >= 19020) {
            ao(27, "web_id");
            c.ar(this.B);
        }
        if (intValue >= 29100) {
            ao(28, "usage_stats_logging_id");
            c.ap(this.C);
        }
        if (intValue >= 35030) {
            ao(29, "original_rcs_message_id");
            c.K(this.D);
        }
        if (intValue >= 58040) {
            ao(30, "result_code");
            c.aa(this.E);
        }
        if (intValue >= 58210) {
            ao(31, "cms_life_cycle");
            c.l(this.F);
        }
        if (intValue >= 58710) {
            ao(32, "fallback_reason");
            c.t(this.G);
        }
        if (intValue >= 58680) {
            ao(33, "trace_id");
            c.ao(this.H);
        }
        if (intValue >= 59310) {
            ao(34, "xms_transport");
            c.as(this.I);
        }
        this.cD = c.a();
        ArrayList arrayList = new ArrayList();
        long[] jArr = this.aJ;
        if (jArr != null && (length2 = jArr.length) != 0 && (length2 != 1 || jArr[0] != 0)) {
            i = k().length;
        } else {
            i = 0;
        }
        HashSet hashSet = new HashSet();
        int i4 = 0;
        while (i4 < i) {
            long j = jArr[i4];
            if (j != 0) {
                Long valueOf2 = Long.valueOf(j);
                if (!hashSet.contains(valueOf2)) {
                    hashSet.add(valueOf2);
                    tbg c2 = PartsTable.c();
                    c2.B(k()[i4]);
                    ao(37, "message_id");
                    c2.J(this.L);
                    ao(38, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
                    c2.X(this.M[i4]);
                    ao(39, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                    c2.Z(this.N[i4]);
                    ao(40, "content_type");
                    c2.t(this.O[i4]);
                    if (intValue >= 10021) {
                        ao(41, "original_uri");
                        c2.L(this.P[i4]);
                    }
                    if (intValue >= 29060) {
                        ao(42, "storage_uri");
                        c2.V(this.Q[i4]);
                    }
                    ao(43, "width");
                    c2.ac(this.R[i4]);
                    ao(44, "height");
                    c2.A(this.S[i4]);
                    if (intValue >= 3010) {
                        ao(45, "timestamp");
                        c2.Y(this.T);
                    }
                    if (intValue >= 4020) {
                        ao(46, "output_uri");
                        c2.P(this.U);
                    }
                    if (intValue >= 4020) {
                        ao(47, "target_size");
                        str = str2;
                        c2.W(this.V[i4]);
                    } else {
                        str = str2;
                    }
                    if (intValue >= 4020) {
                        ao(48, "processing_status");
                        c2.Q(this.W);
                    }
                    if (intValue >= 44010) {
                        ao(49, "cms_attachment_processing_status");
                        c2.k(this.X[i4]);
                    }
                    ao(50, "conversation_id");
                    c2.u(this.Y);
                    if (intValue >= 5020) {
                        ao(51, "sticker_set_id");
                        c2.U(this.Z);
                    }
                    if (intValue >= 5020) {
                        ao(52, "sticker_id");
                        c2.T(this.aa);
                    }
                    if (intValue >= 7000) {
                        ao(53, "media_modified_timestamp");
                        c2.H(this.ab);
                    }
                    if (intValue >= 10005) {
                        ao(54, "longitude");
                        c2.F(this.ac);
                    }
                    if (intValue >= 10005) {
                        ao(55, "latitude");
                        c2.D(this.ad);
                    }
                    if (intValue >= 10017) {
                        ao(56, "preview_content_uri");
                        c2.N(this.ae[i4]);
                    }
                    if (intValue >= 10017) {
                        ao(57, "preview_content_type");
                        c2.M(this.af);
                    }
                    if (intValue >= 13000) {
                        ao(58, "fallback_uri");
                        c2.x(this.ag[i4]);
                    }
                    if (intValue >= 14010) {
                        ao(59, "source");
                        c2.S(this.ah[i4]);
                    }
                    if (intValue >= 17010) {
                        ao(60, "bundle_index");
                        c2.j(this.ai[i4]);
                    }
                    if (intValue >= 17020) {
                        ao(61, "blob_id");
                        c2.g(this.aj[i4]);
                    }
                    if (intValue >= 59570) {
                        ao(62, "blob_gaia_email");
                        c2.f(this.ak[i4]);
                    }
                    if (intValue >= 40040) {
                        ao(63, "cms_full_size_blob_id");
                        c2.n(this.al);
                    }
                    if (intValue >= 42010) {
                        ao(64, "cms_media_encryption_key");
                        c2.o(this.am);
                    }
                    if (intValue >= 42070) {
                        ao(65, "cms_compressed_media_encryption_key");
                        c2.m(this.an);
                    }
                    if (intValue >= 18000) {
                        ao(66, "blob_upload_permanent_failure");
                        c2.h(this.ao[i4]);
                    }
                    if (intValue >= 19030) {
                        ao(67, "blob_upload_timestamp");
                        c2.i(this.ap[i4]);
                    }
                    if (intValue >= 22060) {
                        ao(68, "expressive_sticker_name");
                        c2.w(this.aq[i4]);
                    }
                    if (intValue >= 26000) {
                        ao(69, "file_name");
                        c2.y(this.ar[i4]);
                    }
                    if (intValue >= 26040) {
                        ao(70, "duration");
                        c2.v(this.as[i4]);
                    }
                    if (intValue >= 27000) {
                        ao(71, "compressed_blob_id");
                        c2.p(this.at[i4]);
                    }
                    if (intValue >= 40040) {
                        ao(72, "cms_compressed_blob_id");
                        c2.l(this.au);
                    }
                    if (intValue >= 27000) {
                        ao(73, "compressed_blob_upload_permanent_failure");
                        c2.q(this.av[i4]);
                    }
                    if (intValue >= 27000) {
                        ao(74, "compressed_blob_upload_timestamp");
                        c2.r(this.aw[i4]);
                    }
                    if (intValue >= 30040) {
                        ao(75, "media_encryption_key");
                        c2.G(this.ax[i4]);
                    }
                    if (intValue >= 30040) {
                        ao(76, "compressed_media_encryption_key");
                        c2.s(this.ay[i4]);
                    }
                    if (intValue >= 52030) {
                        ao(77, "missing_entry_in_telephony");
                        c2.K(this.az[i4]);
                    }
                    if (intValue >= 53040) {
                        ao(78, "awaiting_reverse_sync");
                        c2.e(this.aA);
                    }
                    if (intValue >= 52050) {
                        ao(79, "file_size_bytes");
                        c2.z(this.aB);
                    }
                    if (intValue >= 52050) {
                        ao(80, "local_cache_path");
                        c2.E(this.aC);
                    }
                    if (intValue >= 58150) {
                        ao(81, "media_send_type");
                        c2.I(this.aD[i4]);
                    }
                    if (intValue >= 59470) {
                        ao(82, "voice_metadata");
                        c2.ab(this.aE);
                    }
                    if (intValue >= 58770) {
                        ao(83, "validation_status");
                        c2.aa(this.aF);
                    }
                    if (intValue >= 60080) {
                        ao(84, "processing_id");
                        c2.O(this.aG);
                    }
                    if (intValue >= 60230) {
                        ao(85, "rich_card_media_download_failure_reason");
                        c2.R(this.aH);
                    }
                    if (intValue >= 60240) {
                        ao(86, "image_display_state");
                        c2.C(this.aI);
                    }
                    arrayList.add(c2.a());
                    i4++;
                    str2 = str;
                    i3 = 0;
                }
            }
            str = str2;
            i4++;
            str2 = str;
            i3 = 0;
        }
        String str3 = str2;
        this.aK = (PartsTable.BindData[]) arrayList.toArray(new PartsTable.BindData[i3]);
        tap d = ParticipantsTable.d();
        ao(88, "normalized_destination");
        d.H(this.aL);
        ao(89, "send_destination");
        d.Q(this.aM);
        ao(90, "display_destination");
        d.q(this.aN);
        ao(91, "full_name");
        d.u(this.aO);
        ao(92, "first_name");
        d.t(this.aP);
        ao(93, "profile_photo_uri");
        d.M(this.aQ);
        ao(94, "contact_id");
        d.l(this.aR);
        ao(95, "lookup_key");
        d.C(this.aS);
        ao(96, "color_palette_index");
        d.h(this.aT);
        if (intValue >= 1000) {
            ao(97, "color_type");
            d.i(this.aU);
        }
        if (intValue >= 10027) {
            ao(98, "extended_color");
            d.s(this.aV);
        }
        ao(99, "blocked");
        d.e(this.aW);
        if (intValue >= 12001) {
            ao(100, "participant_type");
            d.I(this.aX);
        }
        if (intValue >= 24060) {
            ao(101, "is_spam");
            d.x(this.aY);
        }
        if (intValue >= 31030) {
            ao(102, "latest_verification_status");
            d.B(this.aZ);
        }
        if (intValue >= 35010) {
            ao(103, "directory_id");
            d.p(this.ba);
        }
        if (intValue >= 59550) {
            ao(104, "name_source");
            d.F(this.bb);
        }
        if (intValue >= 59550) {
            ao(105, "photo_source");
            d.J(this.bc);
        }
        this.bd = d.a();
        String[] strArr = seb.a;
        int i5 = sdl.a;
        sdz sdzVar = new sdz();
        sdzVar.aD();
        ao(106, str3);
        String str4 = this.be;
        sdzVar.aC(0);
        sdzVar.a = str4;
        ao(107, "message_id");
        MessageIdType messageIdType = this.bf;
        sdzVar.aC(1);
        sdzVar.b = messageIdType;
        ao(108, "participant_id");
        long[] jArr2 = this.bg;
        sdzVar.aC(2);
        sdzVar.c = jArr2;
        ao(109, "receive_time");
        long[] jArr3 = this.bh;
        sdzVar.aC(3);
        sdzVar.d = jArr3;
        ao(110, "read_time");
        long[] jArr4 = this.bi;
        sdzVar.aC(4);
        sdzVar.e = jArr4;
        ao(111, "ftd_time");
        Optional[] optionalArr = this.bj;
        int i6 = sdzVar.az;
        if (i6 < 58880) {
            agnc.t("ftd_time", i6);
        }
        sdzVar.aC(5);
        sdzVar.f = optionalArr;
        ao(112, "read_reports__ROWID");
        long[] jArr5 = this.bk;
        int i7 = sdzVar.az;
        if (i7 < 0) {
            agnc.t("read_reports.rowid", i7);
        }
        sdzVar.aC(6);
        sdzVar.g = jArr5;
        sdy sdyVar = new sdy();
        sdyVar.ar(sdzVar.az());
        sdyVar.a = (String) sdzVar.a;
        sdyVar.b = (MessageIdType) sdzVar.b;
        sdyVar.c = (long[]) sdzVar.c;
        sdyVar.d = (long[]) sdzVar.d;
        sdyVar.e = (long[]) sdzVar.e;
        sdyVar.f = (Optional[]) sdzVar.f;
        sdyVar.g = (long[]) sdzVar.g;
        sdyVar.cF = sdzVar.aA();
        this.bl = sdyVar;
        tob tobVar = new tob();
        tobVar.aD();
        ao(113, "message_id");
        MessageIdType messageIdType2 = this.bm;
        tobVar.aC(0);
        tobVar.a = messageIdType2;
        ao(114, "participant_id");
        long[] jArr6 = this.bn;
        tobVar.aC(1);
        tobVar.b = jArr6;
        ao(115, "user_ref_datetime");
        long[] jArr7 = this.bo;
        tobVar.aC(2);
        tobVar.c = jArr7;
        ao(116, "user_references__ROWID");
        long[] jArr8 = this.bp;
        int i8 = tobVar.az;
        if (i8 < 0) {
            agnc.t("user_references.rowid", i8);
        }
        tobVar.aC(3);
        tobVar.d = jArr8;
        ao(117, "user_ref_display_name");
        String[] strArr2 = this.bq;
        int i9 = tobVar.az;
        if (i9 < 0) {
            agnc.t("(coalesce(participants.first_name,participants.full_name,participants.display_destination))", i9);
        }
        tobVar.aC(4);
        tobVar.e = strArr2;
        ao(118, "user_ref_profile_photo_uri");
        String[] strArr3 = this.br;
        int i10 = tobVar.az;
        if (i10 < 0) {
            agnc.t("(ifnull(participants.profile_photo_uri,\"\"))", i10);
        }
        tobVar.aC(5);
        tobVar.f = strArr3;
        ao(119, "user_ref_full_name");
        String[] strArr4 = this.bs;
        int i11 = tobVar.az;
        if (i11 < 0) {
            agnc.t("(ifnull(participants.full_name,\"\"))", i11);
        }
        tobVar.aC(6);
        tobVar.g = strArr4;
        ao(120, "user_ref_lookup_key");
        String[] strArr5 = this.bt;
        int i12 = tobVar.az;
        if (i12 < 0) {
            agnc.t("(ifnull(participants.lookup_key,\"\"))", i12);
        }
        tobVar.aC(7);
        tobVar.h = strArr5;
        ao(121, "normalized_destination");
        String[] strArr6 = this.bu;
        tobVar.aC(8);
        tobVar.i = strArr6;
        ao(122, "color_palette_index");
        int[] iArr = this.bv;
        tobVar.aC(9);
        tobVar.j = iArr;
        ao(123, "color_type");
        int[] iArr2 = this.bw;
        int i13 = tobVar.az;
        if (i13 < 1000) {
            agnc.t("color_type", i13);
        }
        tobVar.aC(10);
        tobVar.k = iArr2;
        ao(124, "extended_color");
        int[] iArr3 = this.bx;
        int i14 = tobVar.az;
        if (i14 < 10027) {
            agnc.t("extended_color", i14);
        }
        tobVar.aC(11);
        tobVar.l = iArr3;
        ao(125, "participants__ROWID");
        long[] jArr9 = this.by;
        int i15 = tobVar.az;
        if (i15 < 0) {
            agnc.t("participants.rowid", i15);
        }
        tobVar.aC(12);
        tobVar.m = jArr9;
        toa toaVar = new toa();
        toaVar.ar(tobVar.az());
        toaVar.a = tobVar.a;
        toaVar.b = tobVar.b;
        toaVar.c = tobVar.c;
        toaVar.d = tobVar.d;
        toaVar.e = tobVar.e;
        toaVar.f = tobVar.f;
        toaVar.g = tobVar.g;
        toaVar.h = tobVar.h;
        toaVar.i = tobVar.i;
        toaVar.j = tobVar.j;
        toaVar.k = tobVar.k;
        toaVar.l = tobVar.l;
        toaVar.m = tobVar.m;
        toaVar.cF = tobVar.aA();
        this.bz = toaVar;
        ssj b = sss.b();
        ao(126, "message_id");
        b.l(this.bA);
        ao(127, "trigger_url");
        b.m(this.bB);
        ao(128, "expiration_time_millis");
        b.d(this.bC);
        ao(129, "link_title");
        b.k(this.bD);
        ao(130, "link_description");
        b.f(this.bE);
        ao(131, "link_image_url");
        b.h(this.bF);
        ao(132, "link_domain");
        b.g(this.bG);
        ao(133, "link_canonical_url");
        b.e(this.bH);
        if (intValue >= 21010) {
            ao(134, "link_preview_prevented");
            b.j(this.bI);
        }
        if (intValue >= 22020) {
            ao(135, "link_preview_failed");
            b.i(this.bJ);
        }
        this.bK = b.a();
        tps.a().a();
        toy a = tpi.a();
        ao(136, "name");
        a.g(this.bL);
        ao(137, "description");
        a.c(this.bM);
        ao(138, "logo_uri");
        a.e(this.bN);
        this.bO = a.a();
        ArrayList arrayList2 = new ArrayList();
        long[] jArr10 = this.cd;
        if (jArr10 != null && (length = jArr10.length) != 0 && (length != 1 || jArr10[0] != 0)) {
            i2 = l().length;
        } else {
            i2 = 0;
        }
        HashSet hashSet2 = new HashSet();
        for (int i16 = 0; i16 < i2; i16++) {
            long j2 = jArr10[i16];
            if (j2 != 0) {
                Long valueOf3 = Long.valueOf(j2);
                if (!hashSet2.contains(valueOf3)) {
                    hashSet2.add(valueOf3);
                    tpu a2 = VmtTable.a();
                    a2.c(l()[i16]);
                    ao(150, "vmt_status");
                    a2.e(this.ca[i16]);
                    ao(151, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
                    a2.d(this.cb[i16]);
                    ao(152, "locale");
                    a2.b(this.cc[i16]);
                    arrayList2.add(a2.a());
                }
            }
        }
        this.ce = (VmtTable.BindData[]) arrayList2.toArray(new VmtTable.BindData[0]);
        sdk a3 = sdp.a();
        ao(154, "message_id");
        a3.o(this.cf);
        ao(155, str3);
        a3.i(this.cg);
        ao(156, "received_timestamp");
        a3.r(this.ch);
        ao(157, str3);
        a3.j(this.ci);
        ao(158, "sub_id");
        a3.s(this.cj);
        ao(159, "normalized_destination");
        a3.p(this.ck);
        ao(160, "display_destination");
        a3.c(this.cl);
        ao(161, "full_name");
        a3.h(this.cm);
        ao(162, "first_name");
        a3.g(this.cn);
        ao(163, str3);
        a3.k(this.co);
        ao(164, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        a3.t(this.cp);
        ao(165, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        a3.v(this.cq);
        ao(166, "content_type");
        a3.b(this.cr);
        ao(167, "file_name");
        a3.f(this.cs);
        ao(168, "duration");
        a3.d(this.ct);
        ao(169, "parts__ROWID");
        a3.q(this.cu);
        ao(170, "trigger_url");
        a3.u(this.cv);
        ao(171, "expiration_time_millis");
        a3.e(this.cw);
        ao(172, "link_title");
        a3.n(this.cx);
        ao(173, "link_image_url");
        a3.l(this.cy);
        ao(174, "link_preview_failed");
        a3.m(this.cz);
        this.cA = a3.a();
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
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        MessageIdType messageIdType = this.a;
        ConversationIdType conversationIdType = this.b;
        String str = this.c;
        Long valueOf = Long.valueOf(this.d);
        Long valueOf2 = Long.valueOf(this.e);
        Integer valueOf3 = Integer.valueOf(this.f);
        Integer valueOf4 = Integer.valueOf(this.g);
        Integer valueOf5 = Integer.valueOf(this.h);
        Boolean valueOf6 = Boolean.valueOf(this.i);
        Boolean valueOf7 = Boolean.valueOf(this.j);
        Uri uri = this.k;
        Integer valueOf8 = Integer.valueOf(this.l);
        Long valueOf9 = Long.valueOf(this.m);
        String str2 = this.n;
        Long valueOf10 = Long.valueOf(this.o);
        Long valueOf11 = Long.valueOf(this.p);
        String str3 = this.q;
        Integer valueOf12 = Integer.valueOf(this.r);
        String str4 = this.s;
        rve rveVar = this.t;
        Integer valueOf13 = Integer.valueOf(this.u);
        tqr tqrVar = this.v;
        if (tqrVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqrVar.ordinal();
        }
        Integer valueOf14 = Integer.valueOf(ordinal);
        Boolean valueOf15 = Boolean.valueOf(this.w);
        Long valueOf16 = Long.valueOf(this.x);
        Integer valueOf17 = Integer.valueOf(this.y);
        String str5 = this.z;
        String str6 = this.A;
        String str7 = this.B;
        Long valueOf18 = Long.valueOf(this.C);
        rve rveVar2 = this.D;
        Integer valueOf19 = Integer.valueOf(this.E);
        xxw xxwVar = this.F;
        if (xxwVar == null) {
            ordinal2 = 0;
        } else {
            ordinal2 = xxwVar.ordinal();
        }
        Integer valueOf20 = Integer.valueOf(ordinal2);
        tqf tqfVar = this.G;
        if (tqfVar == null) {
            ordinal3 = 0;
        } else {
            ordinal3 = tqfVar.ordinal();
        }
        Integer valueOf21 = Integer.valueOf(ordinal3);
        atok atokVar = this.H;
        tqu tquVar = this.I;
        if (tquVar == null) {
            ordinal4 = 0;
        } else {
            ordinal4 = tquVar.ordinal();
        }
        Integer valueOf22 = Integer.valueOf(ordinal4);
        String str8 = this.J;
        Integer valueOf23 = Integer.valueOf(Arrays.hashCode(this.K));
        MessageIdType messageIdType2 = this.L;
        Integer valueOf24 = Integer.valueOf(Arrays.hashCode(this.M));
        Integer valueOf25 = Integer.valueOf(Arrays.hashCode(this.N));
        Integer valueOf26 = Integer.valueOf(Arrays.hashCode(this.O));
        Integer valueOf27 = Integer.valueOf(Arrays.hashCode(this.P));
        Integer valueOf28 = Integer.valueOf(Arrays.hashCode(this.Q));
        Integer valueOf29 = Integer.valueOf(Arrays.hashCode(this.R));
        Integer valueOf30 = Integer.valueOf(Arrays.hashCode(this.S));
        Long valueOf31 = Long.valueOf(this.T);
        Uri uri2 = this.U;
        Integer valueOf32 = Integer.valueOf(Arrays.hashCode(this.V));
        tql tqlVar = this.W;
        if (tqlVar == null) {
            ordinal5 = 0;
        } else {
            ordinal5 = tqlVar.ordinal();
        }
        Integer valueOf33 = Integer.valueOf(ordinal5);
        Integer valueOf34 = Integer.valueOf(Arrays.hashCode(this.X));
        ConversationIdType conversationIdType2 = this.Y;
        tqa tqaVar = this.Z;
        tqa tqaVar2 = this.aa;
        Long valueOf35 = Long.valueOf(this.ab);
        Double valueOf36 = Double.valueOf(this.ac);
        Double valueOf37 = Double.valueOf(this.ad);
        Integer valueOf38 = Integer.valueOf(Arrays.hashCode(this.ae));
        String str9 = this.af;
        Integer valueOf39 = Integer.valueOf(Arrays.hashCode(this.ag));
        Integer valueOf40 = Integer.valueOf(Arrays.hashCode(this.ah));
        Integer valueOf41 = Integer.valueOf(Arrays.hashCode(this.ai));
        Integer valueOf42 = Integer.valueOf(Arrays.hashCode(this.aj));
        Integer valueOf43 = Integer.valueOf(Arrays.hashCode(this.ak));
        String str10 = this.al;
        Integer valueOf44 = Integer.valueOf(Arrays.hashCode(this.am));
        Integer valueOf45 = Integer.valueOf(Arrays.hashCode(this.an));
        Integer valueOf46 = Integer.valueOf(Arrays.hashCode(this.ao));
        Integer valueOf47 = Integer.valueOf(Arrays.hashCode(this.ap));
        Integer valueOf48 = Integer.valueOf(Arrays.hashCode(this.aq));
        Integer valueOf49 = Integer.valueOf(Arrays.hashCode(this.ar));
        Integer valueOf50 = Integer.valueOf(Arrays.hashCode(this.as));
        Integer valueOf51 = Integer.valueOf(Arrays.hashCode(this.at));
        String str11 = this.au;
        Integer valueOf52 = Integer.valueOf(Arrays.hashCode(this.av));
        Integer valueOf53 = Integer.valueOf(Arrays.hashCode(this.aw));
        Integer valueOf54 = Integer.valueOf(Arrays.hashCode(this.ax));
        Integer valueOf55 = Integer.valueOf(Arrays.hashCode(this.ay));
        Integer valueOf56 = Integer.valueOf(Arrays.hashCode(this.az));
        Boolean valueOf57 = Boolean.valueOf(this.aA);
        Long valueOf58 = Long.valueOf(this.aB);
        String str12 = this.aC;
        Integer valueOf59 = Integer.valueOf(Arrays.hashCode(this.aD));
        aggp aggpVar = this.aE;
        tqw tqwVar = this.aF;
        if (tqwVar == null) {
            ordinal6 = 0;
        } else {
            ordinal6 = tqwVar.ordinal();
        }
        Integer valueOf60 = Integer.valueOf(ordinal6);
        pyz pyzVar = this.aG;
        tqq tqqVar = this.aH;
        if (tqqVar == null) {
            ordinal7 = 0;
        } else {
            ordinal7 = tqqVar.ordinal();
        }
        Integer valueOf61 = Integer.valueOf(ordinal7);
        tqi tqiVar = this.aI;
        if (tqiVar == null) {
            ordinal8 = 0;
        } else {
            ordinal8 = tqiVar.ordinal();
        }
        Integer valueOf62 = Integer.valueOf(ordinal8);
        Integer valueOf63 = Integer.valueOf(Arrays.hashCode(this.aJ));
        String str13 = this.aL;
        String str14 = this.aM;
        String str15 = this.aN;
        String str16 = this.aO;
        String str17 = this.aP;
        Uri uri3 = this.aQ;
        Long valueOf64 = Long.valueOf(this.aR);
        String str18 = this.aS;
        Integer valueOf65 = Integer.valueOf(this.aT);
        Integer valueOf66 = Integer.valueOf(this.aU);
        Integer valueOf67 = Integer.valueOf(this.aV);
        Boolean valueOf68 = Boolean.valueOf(this.aW);
        Integer valueOf69 = Integer.valueOf(this.aX);
        Boolean valueOf70 = Boolean.valueOf(this.aY);
        tqr tqrVar2 = this.aZ;
        if (tqrVar2 == null) {
            ordinal9 = 0;
        } else {
            ordinal9 = tqrVar2.ordinal();
        }
        return Objects.hash(adayVar, messageIdType, conversationIdType, str, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, uri, valueOf8, valueOf9, str2, valueOf10, valueOf11, str3, valueOf12, str4, rveVar, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, str5, str6, str7, valueOf18, rveVar2, valueOf19, valueOf20, valueOf21, atokVar, valueOf22, str8, valueOf23, messageIdType2, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, uri2, valueOf32, valueOf33, valueOf34, conversationIdType2, tqaVar, tqaVar2, valueOf35, valueOf36, valueOf37, valueOf38, str9, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, str10, valueOf44, valueOf45, valueOf46, valueOf47, valueOf48, valueOf49, valueOf50, valueOf51, str11, valueOf52, valueOf53, valueOf54, valueOf55, valueOf56, valueOf57, valueOf58, str12, valueOf59, aggpVar, valueOf60, pyzVar, valueOf61, valueOf62, valueOf63, str13, str14, str15, str16, str17, uri3, valueOf64, str18, valueOf65, valueOf66, valueOf67, valueOf68, valueOf69, valueOf70, Integer.valueOf(ordinal9), Long.valueOf(this.ba), this.bb, this.bc, this.be, this.bf, Integer.valueOf(Arrays.hashCode(this.bg)), Integer.valueOf(Arrays.hashCode(this.bh)), Integer.valueOf(Arrays.hashCode(this.bi)), Integer.valueOf(Arrays.hashCode(this.bj)), Integer.valueOf(Arrays.hashCode(this.bk)), this.bm, Integer.valueOf(Arrays.hashCode(this.bn)), Integer.valueOf(Arrays.hashCode(this.bo)), Integer.valueOf(Arrays.hashCode(this.bp)), Integer.valueOf(Arrays.hashCode(this.bq)), Integer.valueOf(Arrays.hashCode(this.br)), Integer.valueOf(Arrays.hashCode(this.bs)), Integer.valueOf(Arrays.hashCode(this.bt)), Integer.valueOf(Arrays.hashCode(this.bu)), Integer.valueOf(Arrays.hashCode(this.bv)), Integer.valueOf(Arrays.hashCode(this.bw)), Integer.valueOf(Arrays.hashCode(this.bx)), Integer.valueOf(Arrays.hashCode(this.by)), this.bA, this.bB, Long.valueOf(this.bC), this.bD, this.bE, this.bF, this.bG, this.bH, Boolean.valueOf(this.bI), Boolean.valueOf(this.bJ), this.bL, this.bM, this.bN, this.bP, Integer.valueOf(this.bQ), Boolean.valueOf(this.bR), this.bS, Boolean.valueOf(this.bT), this.bU, this.bV, this.bW, this.bX, this.bY, Integer.valueOf(Arrays.hashCode(this.bZ)), Integer.valueOf(Arrays.hashCode(this.ca)), Integer.valueOf(Arrays.hashCode(this.cb)), Integer.valueOf(Arrays.hashCode(this.cc)), Integer.valueOf(Arrays.hashCode(this.cd)), this.cf, this.cg, Long.valueOf(this.ch), this.ci, Integer.valueOf(this.cj), this.ck, this.cl, this.cm, this.cn, Integer.valueOf(Arrays.hashCode(this.co)), Integer.valueOf(Arrays.hashCode(this.cp)), Integer.valueOf(Arrays.hashCode(this.cq)), Integer.valueOf(Arrays.hashCode(this.cr)), Integer.valueOf(Arrays.hashCode(this.cs)), Integer.valueOf(Arrays.hashCode(this.ct)), Integer.valueOf(Arrays.hashCode(this.cu)), this.cv, Long.valueOf(this.cw), this.cx, this.cy, Boolean.valueOf(this.cz), this.cB, this.cC, null);
    }

    public final boolean i() {
        ao(141, "has_ea2p_bot_recipient");
        return this.bR;
    }

    public final boolean j() {
        ao(143, "rcs_session_allows_revocation");
        return this.bT;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ConversationMessagesQuery -- REDACTED");
        }
        return a();
    }
}
