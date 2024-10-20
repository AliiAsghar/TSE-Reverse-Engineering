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
public final class sbz extends aglz {
    public String A;
    public String B;
    public long C;
    public String D;
    public boolean E;
    public long F;
    public byte[] G;
    public byte[] H;
    public long I;
    public tqq J;
    private String M;
    private String N;
    private String O;
    private String P;
    private Uri Y;
    public String a;
    private String aC;
    private byte[] aD;
    private apwq aF;
    private String aG;
    private String aH;
    private Uri aK;
    private atok aR;
    private tqp aS;
    private tqp aT;
    private tqu aU;
    private int aV;
    private ruz aW;
    private utk aX;
    private Optional aY;
    private Uri aZ;
    private String ab;
    private String ac;
    private String ad;
    private String ag;
    private String ai;
    private String al;
    private String ar;
    private String au;
    private String av;
    private String aw;
    private long ax;
    public MessageIdType b;
    private tqd ba;
    private int bb;
    private String bc;
    private byte[] bd;
    private byte[] be;
    private String bf;
    private boolean bg;
    private boolean bh;
    private String bi;
    private tqj bj;
    private aggp bk;
    private tqw bl;
    private pyz bm;
    private tqi bn;
    public String c;
    public Uri d;
    public String e;
    public Uri f;
    public int g;
    public int h;
    public long i;
    public Uri j;
    public long k;
    public tql l;
    public ConversationIdType m;
    public tqa n;
    public tqa o;
    public long p;
    public double q;
    public double r;
    public Uri s;
    public String t;
    public Uri u;
    public int v;
    public String w;
    public String x;
    public boolean y;
    public long z;
    private MessageIdType K = rvc.a;
    private ConversationIdType L = ruy.a;
    private long Q = 0;
    private Instant R = uzz.l(0);
    private long S = 0;
    private int T = 0;
    private int U = 0;
    private int V = 0;
    private boolean W = false;
    private boolean X = false;
    private int Z = 0;
    private long aa = 0;
    private long ae = 0;
    private long af = 0;
    private int ah = 0;
    private qwe aj = null;
    private long ak = 0;
    private rve am = rve.a;
    private int an = 0;
    private tqr ao = tqr.VERIFICATION_NA;
    private int ap = 0;
    private boolean aq = false;
    private long as = -1;
    private int at = -1;
    private String ay = "";
    private long az = 0;
    private long aA = 1;
    private rve aB = rve.a;
    private long aE = 0;
    private MessageIdType aI = rvc.a;
    private boolean aJ = false;
    private Optional aL = rvg.a;
    private int aM = -2;
    private xxw aN = xxw.UNKNOWN;
    private tqf aO = tqf.UNKNOWN;
    private int aP = 0;
    private boolean aQ = false;

    public sbz() {
        tqp tqpVar = tqp.UNKNOWN;
        this.aS = tqpVar;
        this.aT = tqpVar;
        this.aU = tqu.UNKNOWN;
        this.aV = -1;
        this.aW = ruz.a;
        this.aX = utk.a;
        this.aY = uzz.j();
        this.b = rvc.a;
        this.g = -1;
        this.h = -1;
        this.k = 0L;
        this.l = tql.SUCCEEDED;
        this.ba = tqd.NOT_FROM_CMS;
        this.m = ruy.a;
        this.n = new tqa(-1);
        this.o = new tqa(-1);
        this.p = -1L;
        this.q = 0.0d;
        this.r = 0.0d;
        this.v = 13;
        this.bb = 0;
        this.y = false;
        this.z = 0L;
        this.E = false;
        this.F = 0L;
        this.bh = false;
        this.bj = tqj.STANDARD;
        this.bl = tqw.UNKNOWN;
        this.bm = null;
        this.J = tqq.NONE;
        this.bn = tqi.DEFAULT_NO_VERDICT;
    }

    @Override // defpackage.aglz
    public final String a() {
        String str;
        String str2;
        String str3;
        String str4;
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.K);
        String valueOf2 = String.valueOf(this.L);
        String valueOf3 = String.valueOf(this.M);
        String valueOf4 = String.valueOf(this.N);
        String valueOf5 = String.valueOf(this.O);
        String valueOf6 = String.valueOf(this.P);
        String valueOf7 = String.valueOf(this.Q);
        String valueOf8 = String.valueOf(this.R);
        String valueOf9 = String.valueOf(this.S);
        String valueOf10 = String.valueOf(this.T);
        String valueOf11 = String.valueOf(this.U);
        String valueOf12 = String.valueOf(this.V);
        String valueOf13 = String.valueOf(this.W);
        String valueOf14 = String.valueOf(this.X);
        String valueOf15 = String.valueOf(this.Y);
        String valueOf16 = String.valueOf(this.Z);
        String valueOf17 = String.valueOf(this.aa);
        String valueOf18 = String.valueOf(this.ab);
        String valueOf19 = String.valueOf(this.ac);
        String valueOf20 = String.valueOf(this.ad);
        String valueOf21 = String.valueOf(this.ae);
        String valueOf22 = String.valueOf(this.af);
        String valueOf23 = String.valueOf(this.ag);
        String valueOf24 = String.valueOf(this.ah);
        String valueOf25 = String.valueOf(this.ai);
        String valueOf26 = String.valueOf(this.aj);
        String valueOf27 = String.valueOf(this.ak);
        String valueOf28 = String.valueOf(this.al);
        String valueOf29 = String.valueOf(this.am);
        String valueOf30 = String.valueOf(this.an);
        String valueOf31 = String.valueOf(this.ao);
        String valueOf32 = String.valueOf(this.ap);
        String valueOf33 = String.valueOf(this.aq);
        String valueOf34 = String.valueOf(this.ar);
        String valueOf35 = String.valueOf(this.as);
        String valueOf36 = String.valueOf(this.at);
        String valueOf37 = String.valueOf(this.au);
        String valueOf38 = String.valueOf(this.av);
        String valueOf39 = String.valueOf(this.aw);
        String valueOf40 = String.valueOf(this.ax);
        String valueOf41 = String.valueOf(this.ay);
        String valueOf42 = String.valueOf(this.az);
        String valueOf43 = String.valueOf(this.aA);
        String valueOf44 = String.valueOf(this.aB);
        String valueOf45 = String.valueOf(this.aC);
        byte[] bArr = this.aD;
        String str5 = "NULL";
        if (bArr == null) {
            str = "NULL";
        } else {
            str = String.valueOf(bArr.length);
        }
        String concat = "BLOB".concat(String.valueOf(str));
        String valueOf46 = String.valueOf(this.aE);
        String valueOf47 = String.valueOf(this.aF);
        String valueOf48 = String.valueOf(this.aG);
        String valueOf49 = String.valueOf(this.aH);
        String valueOf50 = String.valueOf(this.aI);
        String valueOf51 = String.valueOf(this.aJ);
        String valueOf52 = String.valueOf(this.aK);
        String valueOf53 = String.valueOf(this.aL);
        String valueOf54 = String.valueOf(this.aM);
        String valueOf55 = String.valueOf(this.aN);
        String valueOf56 = String.valueOf(this.aO);
        String valueOf57 = String.valueOf(this.aP);
        String valueOf58 = String.valueOf(this.aQ);
        String valueOf59 = String.valueOf(this.aR);
        String valueOf60 = String.valueOf(this.aS);
        String valueOf61 = String.valueOf(this.aT);
        String valueOf62 = String.valueOf(this.aU);
        String valueOf63 = String.valueOf(this.aV);
        String valueOf64 = String.valueOf(this.aW);
        String valueOf65 = String.valueOf(this.aX);
        String valueOf66 = String.valueOf(this.aY);
        String valueOf67 = String.valueOf(this.a);
        String valueOf68 = String.valueOf(this.b);
        String valueOf69 = String.valueOf(this.c);
        String valueOf70 = String.valueOf(this.d);
        String valueOf71 = String.valueOf(this.e);
        String valueOf72 = String.valueOf(this.f);
        String valueOf73 = String.valueOf(this.aZ);
        String valueOf74 = String.valueOf(this.g);
        String valueOf75 = String.valueOf(this.h);
        String valueOf76 = String.valueOf(this.i);
        String valueOf77 = String.valueOf(this.j);
        String valueOf78 = String.valueOf(this.k);
        String valueOf79 = String.valueOf(this.l);
        String valueOf80 = String.valueOf(this.ba);
        String valueOf81 = String.valueOf(this.m);
        String valueOf82 = String.valueOf(this.n);
        String valueOf83 = String.valueOf(this.o);
        String valueOf84 = String.valueOf(this.p);
        String valueOf85 = String.valueOf(this.q);
        String valueOf86 = String.valueOf(this.r);
        String valueOf87 = String.valueOf(this.s);
        String valueOf88 = String.valueOf(this.t);
        String valueOf89 = String.valueOf(this.u);
        String valueOf90 = String.valueOf(this.v);
        String valueOf91 = String.valueOf(this.bb);
        String valueOf92 = String.valueOf(this.w);
        String valueOf93 = String.valueOf(this.bc);
        byte[] bArr2 = this.bd;
        if (bArr2 == null) {
            str2 = "NULL";
        } else {
            str2 = String.valueOf(bArr2.length);
        }
        String concat2 = "BLOB".concat(String.valueOf(str2));
        byte[] bArr3 = this.be;
        if (bArr3 == null) {
            str3 = "NULL";
        } else {
            str3 = String.valueOf(bArr3.length);
        }
        String concat3 = "BLOB".concat(String.valueOf(str3));
        String valueOf94 = String.valueOf(this.y);
        String valueOf95 = String.valueOf(this.z);
        String valueOf96 = String.valueOf(this.A);
        String valueOf97 = String.valueOf(this.B);
        String valueOf98 = String.valueOf(this.C);
        String valueOf99 = String.valueOf(this.D);
        String valueOf100 = String.valueOf(this.bf);
        String valueOf101 = String.valueOf(this.E);
        String valueOf102 = String.valueOf(this.F);
        byte[] bArr4 = this.G;
        if (bArr4 == null) {
            str4 = "NULL";
        } else {
            str4 = String.valueOf(bArr4.length);
        }
        String concat4 = "BLOB".concat(String.valueOf(str4));
        byte[] bArr5 = this.H;
        if (bArr5 != null) {
            str5 = String.valueOf(bArr5.length);
        }
        return String.format(locale, "DraftsView [messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_sender_send_destination: %s,\n  messages.messages_msisdn_receiving_rcs_message: %s,\n  messages.messages_receiving_network_country: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_queue_insert_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_message_report_status: %s,\n  messages.messages_seen: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_message_uri: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_sms_message_size: %s,\n  messages.messages_mms_subject: %s,\n  messages.messages_mms_transaction_id: %s,\n  messages.messages_mms_content_location: %s,\n  messages.messages_mms_expiry: %s,\n  messages.messages_rcs_expiry: %s,\n  messages.messages_mms_retrieve_text: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_self_id: %s,\n  messages.messages_my_identity_foreign_key: %s,\n  messages.messages_retry_start_timestamp: %s,\n  messages.messages_cloud_sync_id: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_etouffee_status: %s,\n  messages.messages_verification_status: %s,\n  messages.messages_rcs_ui_status: %s,\n  messages.messages_is_hidden: %s,\n  messages.messages_rcs_remote_instance: %s,\n  messages.messages_rcs_file_transfer_session_id: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  messages.messages_correlation_id: %s,\n  messages.messages_cms_id: %s,\n  messages.messages_cms_last_mod_seq: %s,\n  messages.messages_web_id: %s,\n  messages.messages_usage_stats_logging_id: %s,\n  messages.messages_send_counter: %s,\n  messages.messages_original_rcs_message_id: %s,\n  messages.messages_custom_delivery_receipt_mime_type: %s,\n  messages.messages_custom_delivery_receipt_content: %s,\n  messages.messages_report_attempt_acounter: %s,\n  messages.messages_custom_headers: %s,\n  messages.messages_cms_correlation_id: %s,\n  messages.messages_group_private_participant: %s,\n  messages.messages_original_message_id: %s,\n  messages.messages_awaiting_reverse_sync: %s,\n  messages.messages_old_sms_message_uri: %s,\n  messages.messages_draft_id: %s,\n  messages.messages_result_code: %s,\n  messages.messages_cms_life_cycle: %s,\n  messages.messages_fallback_reason: %s,\n  messages.messages_auto_retry_counter: %s,\n  messages.messages_can_revoke_before_delivered_with_rcs: %s,\n  messages.messages_trace_id: %s,\n  messages.messages_outgoing_delivery_report_status: %s,\n  messages.messages_outgoing_read_report_status: %s,\n  messages.messages_xms_transport: %s,\n  messages.messages_message_original_protocol: %s,\n  messages.messages_satellite_datagram_id: %s,\n  messages.messages_encryption_protocol: %s,\n  messages.messages_message_persistence_id: %s,\n  parts.parts__id: %s,\n  parts.parts_message_id: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_original_uri: %s,\n  parts.parts_storage_uri: %s,\n  parts.parts_width: %s,\n  parts.parts_height: %s,\n  parts.parts_timestamp: %s,\n  parts.parts_output_uri: %s,\n  parts.parts_target_size: %s,\n  parts.parts_processing_status: %s,\n  parts.parts_cms_attachment_processing_status: %s,\n  parts.parts_conversation_id: %s,\n  parts.parts_sticker_set_id: %s,\n  parts.parts_sticker_id: %s,\n  parts.parts_media_modified_timestamp: %s,\n  parts.parts_longitude: %s,\n  parts.parts_latitude: %s,\n  parts.parts_preview_content_uri: %s,\n  parts.parts_preview_content_type: %s,\n  parts.parts_fallback_uri: %s,\n  parts.parts_source: %s,\n  parts.parts_bundle_index: %s,\n  parts.parts_blob_id: %s,\n  parts.parts_blob_gaia_email: %s,\n  parts.parts_cms_full_size_blob_id: %s,\n  parts.parts_cms_media_encryption_key: %s,\n  parts.parts_cms_compressed_media_encryption_key: %s,\n  parts.parts_blob_upload_permanent_failure: %s,\n  parts.parts_blob_upload_timestamp: %s,\n  parts.parts_expressive_sticker_name: %s,\n  parts.parts_file_name: %s,\n  parts.parts_duration: %s,\n  parts.parts_compressed_blob_id: %s,\n  parts.parts_cms_compressed_blob_id: %s,\n  parts.parts_compressed_blob_upload_permanent_failure: %s,\n  parts.parts_compressed_blob_upload_timestamp: %s,\n  parts.parts_media_encryption_key: %s,\n  parts.parts_compressed_media_encryption_key: %s,\n  parts.parts_missing_entry_in_telephony: %s,\n  parts.parts_awaiting_reverse_sync: %s,\n  parts.parts_file_size_bytes: %s,\n  parts.parts_local_cache_path: %s,\n  parts.parts_media_send_type: %s,\n  parts.parts_voice_metadata: %s,\n  parts.parts_validation_status: %s,\n  parts.parts_processing_id: %s,\n  parts.parts_rich_card_media_download_failure_reason: %s,\n  parts.parts_image_display_state: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, concat, valueOf46, valueOf47, valueOf48, valueOf49, valueOf50, valueOf51, valueOf52, valueOf53, valueOf54, valueOf55, valueOf56, valueOf57, valueOf58, valueOf59, valueOf60, valueOf61, valueOf62, valueOf63, valueOf64, valueOf65, valueOf66, valueOf67, valueOf68, valueOf69, valueOf70, valueOf71, valueOf72, valueOf73, valueOf74, valueOf75, valueOf76, valueOf77, valueOf78, valueOf79, valueOf80, valueOf81, valueOf82, valueOf83, valueOf84, valueOf85, valueOf86, valueOf87, valueOf88, valueOf89, valueOf90, valueOf91, valueOf92, "REDACTED", valueOf93, concat2, concat3, valueOf94, valueOf95, valueOf96, valueOf97, valueOf98, valueOf99, valueOf100, valueOf101, valueOf102, concat4, "BLOB".concat(String.valueOf(str5)), String.valueOf(this.bg), String.valueOf(this.bh), String.valueOf(this.I), String.valueOf(this.bi), String.valueOf(this.bj), String.valueOf(this.bk), String.valueOf(this.bl), String.valueOf(this.bm), String.valueOf(this.J), String.valueOf(this.bn));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        valueOf.intValue();
    }

    @Override // defpackage.aglz
    public final /* synthetic */ void c(agmq agmqVar) {
        boolean z;
        boolean z2;
        boolean z3;
        Uri parse;
        Uri parse2;
        Uri parse3;
        Uri parse4;
        Uri parse5;
        Uri parse6;
        atok atokVar;
        boolean z4;
        Uri parse7;
        boolean z5;
        apwq apwqVar;
        boolean z6;
        Uri parse8;
        boolean z7;
        boolean z8;
        lbz lbzVar = (lbz) agmqVar;
        aq();
        this.cJ = lbzVar.dx();
        boolean z9 = false;
        if (lbzVar.db(0)) {
            this.K = new MessageIdType(lbzVar.getLong(lbzVar.cI(0, scd.a)));
            fE(0);
        }
        if (lbzVar.db(1)) {
            this.L = new ConversationIdType(lbzVar.getLong(lbzVar.cI(1, scd.a)));
            fE(1);
        }
        if (lbzVar.db(2)) {
            this.M = lbzVar.getString(lbzVar.cI(2, scd.a));
            fE(2);
        }
        if (lbzVar.db(3)) {
            this.N = lbzVar.getString(lbzVar.cI(3, scd.a));
            fE(3);
        }
        if (lbzVar.db(4)) {
            this.O = lbzVar.getString(lbzVar.cI(4, scd.a));
            fE(4);
        }
        if (lbzVar.db(5)) {
            this.P = lbzVar.getString(lbzVar.cI(5, scd.a));
            fE(5);
        }
        if (lbzVar.db(6)) {
            this.Q = lbzVar.getLong(lbzVar.cI(6, scd.a));
            fE(6);
        }
        if (lbzVar.db(7)) {
            this.R = uzz.l(lbzVar.getLong(lbzVar.cI(7, scd.a)));
            fE(7);
        }
        if (lbzVar.db(8)) {
            this.S = lbzVar.getLong(lbzVar.cI(8, scd.a));
            fE(8);
        }
        if (lbzVar.db(9)) {
            this.T = lbzVar.getInt(lbzVar.cI(9, scd.a));
            fE(9);
        }
        if (lbzVar.db(10)) {
            this.U = lbzVar.getInt(lbzVar.cI(10, scd.a));
            fE(10);
        }
        if (lbzVar.db(11)) {
            this.V = lbzVar.getInt(lbzVar.cI(11, scd.a));
            fE(11);
        }
        if (lbzVar.db(12)) {
            if (lbzVar.getInt(lbzVar.cI(12, scd.a)) == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.W = z8;
            fE(12);
        }
        if (lbzVar.db(13)) {
            if (lbzVar.getInt(lbzVar.cI(13, scd.a)) == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.X = z7;
            fE(13);
        }
        aggp aggpVar = null;
        if (lbzVar.db(14)) {
            String string = lbzVar.getString(lbzVar.cI(14, scd.a));
            if (string == null) {
                parse8 = null;
            } else {
                parse8 = Uri.parse(string);
            }
            this.Y = parse8;
            fE(14);
        }
        if (lbzVar.db(15)) {
            this.Z = lbzVar.getInt(lbzVar.cI(15, scd.a));
            fE(15);
        }
        if (lbzVar.db(16)) {
            this.aa = lbzVar.getLong(lbzVar.cI(16, scd.a));
            fE(16);
        }
        if (lbzVar.db(17)) {
            this.ab = yta.a(lbzVar.getString(lbzVar.cI(17, scd.a)));
            fE(17);
        }
        if (lbzVar.db(18)) {
            this.ac = lbzVar.getString(lbzVar.cI(18, scd.a));
            fE(18);
        }
        if (lbzVar.db(19)) {
            this.ad = lbzVar.getString(lbzVar.cI(19, scd.a));
            fE(19);
        }
        if (lbzVar.db(20)) {
            this.ae = lbzVar.getLong(lbzVar.cI(20, scd.a));
            fE(20);
        }
        if (lbzVar.db(21)) {
            this.af = lbzVar.getLong(lbzVar.cI(21, scd.a));
            fE(21);
        }
        if (lbzVar.db(22)) {
            this.ag = lbzVar.getString(lbzVar.cI(22, scd.a));
            fE(22);
        }
        if (lbzVar.db(23)) {
            this.ah = lbzVar.getInt(lbzVar.cI(23, scd.a));
            fE(23);
        }
        if (lbzVar.db(24)) {
            this.ai = lbzVar.getString(lbzVar.cI(24, scd.a));
            fE(24);
        }
        if (lbzVar.db(25)) {
            this.aj = riw.m(lbzVar.getString(lbzVar.cI(25, scd.a)));
            fE(25);
        }
        if (lbzVar.db(26)) {
            this.ak = lbzVar.getLong(lbzVar.cI(26, scd.a));
            fE(26);
        }
        if (lbzVar.db(27)) {
            this.al = lbzVar.getString(lbzVar.cI(27, scd.a));
            fE(27);
        }
        if (lbzVar.db(28)) {
            this.am = rve.a(lbzVar.getString(lbzVar.cI(28, scd.a)));
            fE(28);
        }
        if (lbzVar.db(29)) {
            this.an = lbzVar.getInt(lbzVar.cI(29, scd.a));
            fE(29);
        }
        if (lbzVar.db(30)) {
            tqr[] values = tqr.values();
            int i = lbzVar.getInt(lbzVar.cI(30, scd.a));
            if (i < values.length) {
                this.ao = values[i];
                fE(30);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(31)) {
            this.ap = lbzVar.getInt(lbzVar.cI(31, scd.a));
            fE(31);
        }
        if (lbzVar.db(32)) {
            if (lbzVar.getInt(lbzVar.cI(32, scd.a)) == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.aq = z6;
            fE(32);
        }
        if (lbzVar.db(33)) {
            this.ar = lbzVar.getString(lbzVar.cI(33, scd.a));
            fE(33);
        }
        if (lbzVar.db(34)) {
            this.as = lbzVar.getLong(lbzVar.cI(34, scd.a));
            fE(34);
        }
        if (lbzVar.db(35)) {
            this.at = lbzVar.getInt(lbzVar.cI(35, scd.a));
            fE(35);
        }
        if (lbzVar.db(36)) {
            this.au = lbzVar.getString(lbzVar.cI(36, scd.a));
            fE(36);
        }
        if (lbzVar.db(37)) {
            this.av = lbzVar.getString(lbzVar.cI(37, scd.a));
            fE(37);
        }
        if (lbzVar.db(38)) {
            this.aw = lbzVar.getString(lbzVar.cI(38, scd.a));
            fE(38);
        }
        if (lbzVar.db(39)) {
            this.ax = lbzVar.getLong(lbzVar.cI(39, scd.a));
            fE(39);
        }
        if (lbzVar.db(40)) {
            this.ay = lbzVar.getString(lbzVar.cI(40, scd.a));
            fE(40);
        }
        if (lbzVar.db(41)) {
            this.az = lbzVar.getLong(lbzVar.cI(41, scd.a));
            fE(41);
        }
        if (lbzVar.db(42)) {
            this.aA = lbzVar.getLong(lbzVar.cI(42, scd.a));
            fE(42);
        }
        if (lbzVar.db(43)) {
            this.aB = rve.a(lbzVar.getString(lbzVar.cI(43, scd.a)));
            fE(43);
        }
        if (lbzVar.db(44)) {
            this.aC = lbzVar.getString(lbzVar.cI(44, scd.a));
            fE(44);
        }
        if (lbzVar.db(45)) {
            this.aD = lbzVar.getBlob(lbzVar.cI(45, scd.a));
            fE(45);
        }
        if (lbzVar.db(46)) {
            this.aE = lbzVar.getLong(lbzVar.cI(46, scd.a));
            fE(46);
        }
        if (lbzVar.db(47)) {
            byte[] blob = lbzVar.getBlob(lbzVar.cI(47, scd.a));
            if (blob == null) {
                apwqVar = null;
            } else {
                try {
                    apwqVar = (apwq) apag.parseFrom(apwq.a, blob, aozs.a());
                } catch (Throwable unused) {
                    apwqVar = apwq.a;
                }
            }
            this.aF = apwqVar;
            fE(47);
        }
        if (lbzVar.db(48)) {
            this.aG = lbzVar.getString(lbzVar.cI(48, scd.a));
            fE(48);
        }
        if (lbzVar.db(49)) {
            this.aH = lbzVar.getString(lbzVar.cI(49, scd.a));
            fE(49);
        }
        if (lbzVar.db(50)) {
            this.aI = new MessageIdType(lbzVar.getLong(lbzVar.cI(50, scd.a)));
            fE(50);
        }
        if (lbzVar.db(51)) {
            if (lbzVar.getInt(lbzVar.cI(51, scd.a)) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.aJ = z5;
            fE(51);
        }
        if (lbzVar.db(52)) {
            String string2 = lbzVar.getString(lbzVar.cI(52, scd.a));
            if (string2 == null) {
                parse7 = null;
            } else {
                parse7 = Uri.parse(string2);
            }
            this.aK = parse7;
            fE(52);
        }
        if (lbzVar.db(53)) {
            this.aL = rvg.a(lbzVar.getString(lbzVar.cI(53, scd.a)));
            fE(53);
        }
        if (lbzVar.db(54)) {
            this.aM = lbzVar.getInt(lbzVar.cI(54, scd.a));
            fE(54);
        }
        if (lbzVar.db(55)) {
            xxw[] values2 = xxw.values();
            int i2 = lbzVar.getInt(lbzVar.cI(55, scd.a));
            if (i2 < values2.length) {
                this.aN = values2[i2];
                fE(55);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(56)) {
            tqf[] values3 = tqf.values();
            int i3 = lbzVar.getInt(lbzVar.cI(56, scd.a));
            if (i3 < values3.length) {
                this.aO = values3[i3];
                fE(56);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(57)) {
            this.aP = lbzVar.getInt(lbzVar.cI(57, scd.a));
            fE(57);
        }
        if (lbzVar.db(58)) {
            if (lbzVar.getInt(lbzVar.cI(58, scd.a)) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.aQ = z4;
            fE(58);
        }
        if (lbzVar.db(59)) {
            byte[] blob2 = lbzVar.getBlob(lbzVar.cI(59, scd.a));
            if (blob2 == null) {
                atokVar = null;
            } else {
                try {
                    atokVar = (atok) apag.parseFrom(atok.a, blob2, aozs.a());
                } catch (Throwable unused2) {
                    atokVar = atok.a;
                }
            }
            this.aR = atokVar;
            fE(59);
        }
        if (lbzVar.db(60)) {
            tqp[] values4 = tqp.values();
            int i4 = lbzVar.getInt(lbzVar.cI(60, scd.a));
            if (i4 < values4.length) {
                this.aS = values4[i4];
                fE(60);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(61)) {
            tqp[] values5 = tqp.values();
            int i5 = lbzVar.getInt(lbzVar.cI(61, scd.a));
            if (i5 < values5.length) {
                this.aT = values5[i5];
                fE(61);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(62)) {
            tqu[] values6 = tqu.values();
            int i6 = lbzVar.getInt(lbzVar.cI(62, scd.a));
            if (i6 < values6.length) {
                this.aU = values6[i6];
                fE(62);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(63)) {
            this.aV = lbzVar.getInt(lbzVar.cI(63, scd.a));
            fE(63);
        }
        if (lbzVar.db(64)) {
            this.aW = new ruz(lbzVar.getString(lbzVar.cI(64, scd.a)));
            fE(64);
        }
        if (lbzVar.db(65)) {
            utk[] values7 = utk.values();
            int i7 = lbzVar.getInt(lbzVar.cI(65, scd.a));
            if (i7 < values7.length) {
                this.aX = values7[i7];
                fE(65);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(66)) {
            this.aY = rvg.a(lbzVar.getString(lbzVar.cI(66, scd.a)));
            fE(66);
        }
        if (lbzVar.db(67)) {
            this.a = lbzVar.getString(lbzVar.cI(67, scd.a));
            fE(67);
        }
        if (lbzVar.db(68)) {
            this.b = new MessageIdType(lbzVar.getLong(lbzVar.cI(68, scd.a)));
            fE(68);
        }
        if (lbzVar.db(69)) {
            this.c = yta.a(lbzVar.getString(lbzVar.cI(69, scd.a)));
            fE(69);
        }
        if (lbzVar.db(70)) {
            String string3 = lbzVar.getString(lbzVar.cI(70, scd.a));
            if (string3 == null) {
                parse6 = null;
            } else {
                parse6 = Uri.parse(string3);
            }
            this.d = parse6;
            fE(70);
        }
        if (lbzVar.db(71)) {
            this.e = lbzVar.getString(lbzVar.cI(71, scd.a));
            fE(71);
        }
        if (lbzVar.db(72)) {
            String string4 = lbzVar.getString(lbzVar.cI(72, scd.a));
            if (string4 == null) {
                parse5 = null;
            } else {
                parse5 = Uri.parse(string4);
            }
            this.f = parse5;
            fE(72);
        }
        if (lbzVar.db(73)) {
            String string5 = lbzVar.getString(lbzVar.cI(73, scd.a));
            if (string5 == null) {
                parse4 = null;
            } else {
                parse4 = Uri.parse(string5);
            }
            this.aZ = parse4;
            fE(73);
        }
        if (lbzVar.db(74)) {
            this.g = lbzVar.getInt(lbzVar.cI(74, scd.a));
            fE(74);
        }
        if (lbzVar.db(75)) {
            this.h = lbzVar.getInt(lbzVar.cI(75, scd.a));
            fE(75);
        }
        if (lbzVar.db(76)) {
            this.i = lbzVar.getLong(lbzVar.cI(76, scd.a));
            fE(76);
        }
        if (lbzVar.db(77)) {
            String string6 = lbzVar.getString(lbzVar.cI(77, scd.a));
            if (string6 == null) {
                parse3 = null;
            } else {
                parse3 = Uri.parse(string6);
            }
            this.j = parse3;
            fE(77);
        }
        if (lbzVar.db(78)) {
            this.k = lbzVar.getLong(lbzVar.cI(78, scd.a));
            fE(78);
        }
        if (lbzVar.db(79)) {
            tql[] values8 = tql.values();
            int i8 = lbzVar.getInt(lbzVar.cI(79, scd.a));
            if (i8 < values8.length) {
                this.l = values8[i8];
                fE(79);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(80)) {
            tqd[] values9 = tqd.values();
            int i9 = lbzVar.getInt(lbzVar.cI(80, scd.a));
            if (i9 < values9.length) {
                this.ba = values9[i9];
                fE(80);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(81)) {
            this.m = new ConversationIdType(lbzVar.getLong(lbzVar.cI(81, scd.a)));
            fE(81);
        }
        if (lbzVar.db(82)) {
            this.n = wch.I(lbzVar.getString(lbzVar.cI(82, scd.a)));
            fE(82);
        }
        if (lbzVar.db(83)) {
            this.o = wch.I(lbzVar.getString(lbzVar.cI(83, scd.a)));
            fE(83);
        }
        if (lbzVar.db(84)) {
            this.p = lbzVar.getLong(lbzVar.cI(84, scd.a));
            fE(84);
        }
        if (lbzVar.db(85)) {
            this.q = lbzVar.getDouble(lbzVar.cI(85, scd.a));
            fE(85);
        }
        if (lbzVar.db(86)) {
            this.r = lbzVar.getDouble(lbzVar.cI(86, scd.a));
            fE(86);
        }
        if (lbzVar.db(87)) {
            String string7 = lbzVar.getString(lbzVar.cI(87, scd.a));
            if (string7 == null) {
                parse2 = null;
            } else {
                parse2 = Uri.parse(string7);
            }
            this.s = parse2;
            fE(87);
        }
        if (lbzVar.db(88)) {
            this.t = lbzVar.getString(lbzVar.cI(88, scd.a));
            fE(88);
        }
        if (lbzVar.db(89)) {
            String string8 = lbzVar.getString(lbzVar.cI(89, scd.a));
            if (string8 == null) {
                parse = null;
            } else {
                parse = Uri.parse(string8);
            }
            this.u = parse;
            fE(89);
        }
        if (lbzVar.db(90)) {
            this.v = lbzVar.getInt(lbzVar.cI(90, scd.a));
            fE(90);
        }
        if (lbzVar.db(91)) {
            this.bb = lbzVar.getInt(lbzVar.cI(91, scd.a));
            fE(91);
        }
        if (lbzVar.db(92)) {
            this.w = lbzVar.getString(lbzVar.cI(92, scd.a));
            fE(92);
        }
        if (lbzVar.db(93)) {
            this.x = lbzVar.getString(lbzVar.cI(93, scd.a));
            fE(93);
        }
        if (lbzVar.db(94)) {
            this.bc = lbzVar.getString(lbzVar.cI(94, scd.a));
            fE(94);
        }
        if (lbzVar.db(95)) {
            this.bd = lbzVar.getBlob(lbzVar.cI(95, scd.a));
            fE(95);
        }
        if (lbzVar.db(96)) {
            this.be = lbzVar.getBlob(lbzVar.cI(96, scd.a));
            fE(96);
        }
        if (lbzVar.db(97)) {
            if (lbzVar.getInt(lbzVar.cI(97, scd.a)) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.y = z3;
            fE(97);
        }
        if (lbzVar.db(98)) {
            this.z = lbzVar.getLong(lbzVar.cI(98, scd.a));
            fE(98);
        }
        if (lbzVar.db(99)) {
            this.A = lbzVar.getString(lbzVar.cI(99, scd.a));
            fE(99);
        }
        if (lbzVar.db(100)) {
            this.B = lbzVar.getString(lbzVar.cI(100, scd.a));
            fE(100);
        }
        if (lbzVar.db(101)) {
            this.C = lbzVar.getLong(lbzVar.cI(101, scd.a));
            fE(101);
        }
        if (lbzVar.db(102)) {
            this.D = lbzVar.getString(lbzVar.cI(102, scd.a));
            fE(102);
        }
        if (lbzVar.db(103)) {
            this.bf = lbzVar.getString(lbzVar.cI(103, scd.a));
            fE(103);
        }
        if (lbzVar.db(104)) {
            if (lbzVar.getInt(lbzVar.cI(104, scd.a)) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.E = z2;
            fE(104);
        }
        if (lbzVar.db(105)) {
            this.F = lbzVar.getLong(lbzVar.cI(105, scd.a));
            fE(105);
        }
        if (lbzVar.db(106)) {
            this.G = lbzVar.getBlob(lbzVar.cI(106, scd.a));
            fE(106);
        }
        if (lbzVar.db(107)) {
            this.H = lbzVar.getBlob(lbzVar.cI(107, scd.a));
            fE(107);
        }
        if (lbzVar.db(108)) {
            if (lbzVar.getInt(lbzVar.cI(108, scd.a)) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.bg = z;
            fE(108);
        }
        if (lbzVar.db(109)) {
            if (lbzVar.getInt(lbzVar.cI(109, scd.a)) == 1) {
                z9 = true;
            }
            this.bh = z9;
            fE(109);
        }
        if (lbzVar.db(110)) {
            this.I = lbzVar.getLong(lbzVar.cI(110, scd.a));
            fE(110);
        }
        if (lbzVar.db(111)) {
            this.bi = lbzVar.getString(lbzVar.cI(111, scd.a));
            fE(111);
        }
        if (lbzVar.db(112)) {
            tqj[] values10 = tqj.values();
            int i10 = lbzVar.getInt(lbzVar.cI(112, scd.a));
            if (i10 < values10.length) {
                this.bj = values10[i10];
                fE(112);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(113)) {
            byte[] blob3 = lbzVar.getBlob(lbzVar.cI(113, scd.a));
            if (blob3 != null) {
                try {
                    aggpVar = (aggp) apag.parseFrom(aggp.a, blob3, aozs.a());
                } catch (Throwable unused3) {
                    aggpVar = aggp.a;
                }
            }
            this.bk = aggpVar;
            fE(113);
        }
        if (lbzVar.db(114)) {
            tqw[] values11 = tqw.values();
            int i11 = lbzVar.getInt(lbzVar.cI(114, scd.a));
            if (i11 < values11.length) {
                this.bl = values11[i11];
                fE(114);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(115)) {
            this.bm = pzm.a(lbzVar.getString(lbzVar.cI(115, scd.a)));
            fE(115);
        }
        if (lbzVar.db(116)) {
            tqq[] values12 = tqq.values();
            int i12 = lbzVar.getInt(lbzVar.cI(116, scd.a));
            if (i12 < values12.length) {
                this.J = values12[i12];
                fE(116);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(117)) {
            tqi[] values13 = tqi.values();
            int i13 = lbzVar.getInt(lbzVar.cI(117, scd.a));
            if (i13 < values13.length) {
                this.bn = values13[i13];
                fE(117);
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sbz)) {
            return false;
        }
        sbz sbzVar = (sbz) obj;
        if (super.aC(sbzVar.cJ) && Objects.equals(this.K, sbzVar.K) && Objects.equals(this.L, sbzVar.L) && Objects.equals(this.M, sbzVar.M) && Objects.equals(this.N, sbzVar.N) && Objects.equals(this.O, sbzVar.O) && Objects.equals(this.P, sbzVar.P) && this.Q == sbzVar.Q && Objects.equals(this.R, sbzVar.R) && this.S == sbzVar.S && this.T == sbzVar.T && this.U == sbzVar.U && this.V == sbzVar.V && this.W == sbzVar.W && this.X == sbzVar.X && Objects.equals(this.Y, sbzVar.Y) && this.Z == sbzVar.Z && this.aa == sbzVar.aa && Objects.equals(this.ab, sbzVar.ab) && Objects.equals(this.ac, sbzVar.ac) && Objects.equals(this.ad, sbzVar.ad) && this.ae == sbzVar.ae && this.af == sbzVar.af && Objects.equals(this.ag, sbzVar.ag) && this.ah == sbzVar.ah && Objects.equals(this.ai, sbzVar.ai) && Objects.equals(this.aj, sbzVar.aj) && this.ak == sbzVar.ak && Objects.equals(this.al, sbzVar.al) && Objects.equals(this.am, sbzVar.am) && this.an == sbzVar.an && this.ao == sbzVar.ao && this.ap == sbzVar.ap && this.aq == sbzVar.aq && Objects.equals(this.ar, sbzVar.ar) && this.as == sbzVar.as && this.at == sbzVar.at && Objects.equals(this.au, sbzVar.au) && Objects.equals(this.av, sbzVar.av) && Objects.equals(this.aw, sbzVar.aw) && this.ax == sbzVar.ax && Objects.equals(this.ay, sbzVar.ay) && this.az == sbzVar.az && this.aA == sbzVar.aA && Objects.equals(this.aB, sbzVar.aB) && Objects.equals(this.aC, sbzVar.aC) && Arrays.equals(this.aD, sbzVar.aD) && this.aE == sbzVar.aE && Objects.equals(this.aF, sbzVar.aF) && Objects.equals(this.aG, sbzVar.aG) && Objects.equals(this.aH, sbzVar.aH) && Objects.equals(this.aI, sbzVar.aI) && this.aJ == sbzVar.aJ && Objects.equals(this.aK, sbzVar.aK) && Objects.equals(this.aL, sbzVar.aL) && this.aM == sbzVar.aM && this.aN == sbzVar.aN && this.aO == sbzVar.aO && this.aP == sbzVar.aP && this.aQ == sbzVar.aQ && Objects.equals(this.aR, sbzVar.aR) && this.aS == sbzVar.aS && this.aT == sbzVar.aT && this.aU == sbzVar.aU && this.aV == sbzVar.aV && Objects.equals(this.aW, sbzVar.aW) && this.aX == sbzVar.aX && Objects.equals(this.aY, sbzVar.aY) && Objects.equals(this.a, sbzVar.a) && Objects.equals(this.b, sbzVar.b) && Objects.equals(this.c, sbzVar.c) && Objects.equals(this.d, sbzVar.d) && Objects.equals(this.e, sbzVar.e) && Objects.equals(this.f, sbzVar.f) && Objects.equals(this.aZ, sbzVar.aZ) && this.g == sbzVar.g && this.h == sbzVar.h && this.i == sbzVar.i && Objects.equals(this.j, sbzVar.j) && this.k == sbzVar.k && this.l == sbzVar.l && this.ba == sbzVar.ba && Objects.equals(this.m, sbzVar.m) && Objects.equals(this.n, sbzVar.n) && Objects.equals(this.o, sbzVar.o) && this.p == sbzVar.p && this.q == sbzVar.q && this.r == sbzVar.r && Objects.equals(this.s, sbzVar.s) && Objects.equals(this.t, sbzVar.t) && Objects.equals(this.u, sbzVar.u) && this.v == sbzVar.v && this.bb == sbzVar.bb && Objects.equals(this.w, sbzVar.w) && Objects.equals(this.x, sbzVar.x) && Objects.equals(this.bc, sbzVar.bc) && Arrays.equals(this.bd, sbzVar.bd) && Arrays.equals(this.be, sbzVar.be) && this.y == sbzVar.y && this.z == sbzVar.z && Objects.equals(this.A, sbzVar.A) && Objects.equals(this.B, sbzVar.B) && this.C == sbzVar.C && Objects.equals(this.D, sbzVar.D) && Objects.equals(this.bf, sbzVar.bf) && this.E == sbzVar.E && this.F == sbzVar.F && Arrays.equals(this.G, sbzVar.G) && Arrays.equals(this.H, sbzVar.H) && this.bg == sbzVar.bg && this.bh == sbzVar.bh && this.I == sbzVar.I && Objects.equals(this.bi, sbzVar.bi) && this.bj == sbzVar.bj && Objects.equals(this.bk, sbzVar.bk) && this.bl == sbzVar.bl && Objects.equals(this.bm, sbzVar.bm) && this.J == sbzVar.J && this.bn == sbzVar.bn) {
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
        MessageIdType messageIdType = this.K;
        ConversationIdType conversationIdType = this.L;
        String str = this.M;
        String str2 = this.N;
        String str3 = this.O;
        String str4 = this.P;
        Long valueOf = Long.valueOf(this.Q);
        Instant instant = this.R;
        Long valueOf2 = Long.valueOf(this.S);
        Integer valueOf3 = Integer.valueOf(this.T);
        Integer valueOf4 = Integer.valueOf(this.U);
        Integer valueOf5 = Integer.valueOf(this.V);
        Boolean valueOf6 = Boolean.valueOf(this.W);
        Boolean valueOf7 = Boolean.valueOf(this.X);
        Uri uri = this.Y;
        Integer valueOf8 = Integer.valueOf(this.Z);
        Long valueOf9 = Long.valueOf(this.aa);
        String str5 = this.ab;
        String str6 = this.ac;
        String str7 = this.ad;
        Long valueOf10 = Long.valueOf(this.ae);
        Long valueOf11 = Long.valueOf(this.af);
        String str8 = this.ag;
        Integer valueOf12 = Integer.valueOf(this.ah);
        String str9 = this.ai;
        qwe qweVar = this.aj;
        Long valueOf13 = Long.valueOf(this.ak);
        String str10 = this.al;
        rve rveVar = this.am;
        Integer valueOf14 = Integer.valueOf(this.an);
        tqr tqrVar = this.ao;
        if (tqrVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqrVar.ordinal();
        }
        Integer valueOf15 = Integer.valueOf(ordinal);
        Integer valueOf16 = Integer.valueOf(this.ap);
        Boolean valueOf17 = Boolean.valueOf(this.aq);
        String str11 = this.ar;
        Long valueOf18 = Long.valueOf(this.as);
        Integer valueOf19 = Integer.valueOf(this.at);
        String str12 = this.au;
        String str13 = this.av;
        String str14 = this.aw;
        Long valueOf20 = Long.valueOf(this.ax);
        String str15 = this.ay;
        Long valueOf21 = Long.valueOf(this.az);
        Long valueOf22 = Long.valueOf(this.aA);
        rve rveVar2 = this.aB;
        String str16 = this.aC;
        Integer valueOf23 = Integer.valueOf(Arrays.hashCode(this.aD));
        Long valueOf24 = Long.valueOf(this.aE);
        apwq apwqVar = this.aF;
        String str17 = this.aG;
        String str18 = this.aH;
        MessageIdType messageIdType2 = this.aI;
        Boolean valueOf25 = Boolean.valueOf(this.aJ);
        Uri uri2 = this.aK;
        Optional optional = this.aL;
        Integer valueOf26 = Integer.valueOf(this.aM);
        xxw xxwVar = this.aN;
        if (xxwVar == null) {
            ordinal2 = 0;
        } else {
            ordinal2 = xxwVar.ordinal();
        }
        Integer valueOf27 = Integer.valueOf(ordinal2);
        tqf tqfVar = this.aO;
        if (tqfVar == null) {
            ordinal3 = 0;
        } else {
            ordinal3 = tqfVar.ordinal();
        }
        Integer valueOf28 = Integer.valueOf(ordinal3);
        Integer valueOf29 = Integer.valueOf(this.aP);
        Boolean valueOf30 = Boolean.valueOf(this.aQ);
        atok atokVar = this.aR;
        tqp tqpVar = this.aS;
        if (tqpVar == null) {
            ordinal4 = 0;
        } else {
            ordinal4 = tqpVar.ordinal();
        }
        Integer valueOf31 = Integer.valueOf(ordinal4);
        tqp tqpVar2 = this.aT;
        if (tqpVar2 == null) {
            ordinal5 = 0;
        } else {
            ordinal5 = tqpVar2.ordinal();
        }
        Integer valueOf32 = Integer.valueOf(ordinal5);
        tqu tquVar = this.aU;
        if (tquVar == null) {
            ordinal6 = 0;
        } else {
            ordinal6 = tquVar.ordinal();
        }
        Integer valueOf33 = Integer.valueOf(ordinal6);
        Integer valueOf34 = Integer.valueOf(this.aV);
        ruz ruzVar = this.aW;
        utk utkVar = this.aX;
        if (utkVar == null) {
            ordinal7 = 0;
        } else {
            ordinal7 = utkVar.ordinal();
        }
        Integer valueOf35 = Integer.valueOf(ordinal7);
        Optional optional2 = this.aY;
        String str19 = this.a;
        MessageIdType messageIdType3 = this.b;
        String str20 = this.c;
        Uri uri3 = this.d;
        String str21 = this.e;
        Uri uri4 = this.f;
        Uri uri5 = this.aZ;
        Integer valueOf36 = Integer.valueOf(this.g);
        Integer valueOf37 = Integer.valueOf(this.h);
        Long valueOf38 = Long.valueOf(this.i);
        Uri uri6 = this.j;
        Long valueOf39 = Long.valueOf(this.k);
        tql tqlVar = this.l;
        if (tqlVar == null) {
            ordinal8 = 0;
        } else {
            ordinal8 = tqlVar.ordinal();
        }
        Integer valueOf40 = Integer.valueOf(ordinal8);
        tqd tqdVar = this.ba;
        if (tqdVar == null) {
            ordinal9 = 0;
        } else {
            ordinal9 = tqdVar.ordinal();
        }
        Integer valueOf41 = Integer.valueOf(ordinal9);
        ConversationIdType conversationIdType2 = this.m;
        tqa tqaVar = this.n;
        tqa tqaVar2 = this.o;
        Long valueOf42 = Long.valueOf(this.p);
        Double valueOf43 = Double.valueOf(this.q);
        Double valueOf44 = Double.valueOf(this.r);
        Uri uri7 = this.s;
        String str22 = this.t;
        Uri uri8 = this.u;
        Integer valueOf45 = Integer.valueOf(this.v);
        Integer valueOf46 = Integer.valueOf(this.bb);
        String str23 = this.w;
        String str24 = this.x;
        String str25 = this.bc;
        Integer valueOf47 = Integer.valueOf(Arrays.hashCode(this.bd));
        Integer valueOf48 = Integer.valueOf(Arrays.hashCode(this.be));
        Boolean valueOf49 = Boolean.valueOf(this.y);
        Long valueOf50 = Long.valueOf(this.z);
        String str26 = this.A;
        String str27 = this.B;
        Long valueOf51 = Long.valueOf(this.C);
        String str28 = this.D;
        String str29 = this.bf;
        Boolean valueOf52 = Boolean.valueOf(this.E);
        Long valueOf53 = Long.valueOf(this.F);
        Integer valueOf54 = Integer.valueOf(Arrays.hashCode(this.G));
        Integer valueOf55 = Integer.valueOf(Arrays.hashCode(this.H));
        Boolean valueOf56 = Boolean.valueOf(this.bg);
        Boolean valueOf57 = Boolean.valueOf(this.bh);
        Long valueOf58 = Long.valueOf(this.I);
        String str30 = this.bi;
        tqj tqjVar = this.bj;
        if (tqjVar == null) {
            ordinal10 = 0;
        } else {
            ordinal10 = tqjVar.ordinal();
        }
        Integer valueOf59 = Integer.valueOf(ordinal10);
        aggp aggpVar = this.bk;
        tqw tqwVar = this.bl;
        if (tqwVar == null) {
            ordinal11 = 0;
        } else {
            ordinal11 = tqwVar.ordinal();
        }
        Integer valueOf60 = Integer.valueOf(ordinal11);
        pyz pyzVar = this.bm;
        tqq tqqVar = this.J;
        if (tqqVar == null) {
            ordinal12 = 0;
        } else {
            ordinal12 = tqqVar.ordinal();
        }
        Integer valueOf61 = Integer.valueOf(ordinal12);
        tqi tqiVar = this.bn;
        if (tqiVar == null) {
            ordinal13 = 0;
        } else {
            ordinal13 = tqiVar.ordinal();
        }
        return Objects.hash(adayVar, messageIdType, conversationIdType, str, str2, str3, str4, valueOf, instant, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, uri, valueOf8, valueOf9, str5, str6, str7, valueOf10, valueOf11, str8, valueOf12, str9, qweVar, valueOf13, str10, rveVar, valueOf14, valueOf15, valueOf16, valueOf17, str11, valueOf18, valueOf19, str12, str13, str14, valueOf20, str15, valueOf21, valueOf22, rveVar2, str16, valueOf23, valueOf24, apwqVar, str17, str18, messageIdType2, valueOf25, uri2, optional, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, atokVar, valueOf31, valueOf32, valueOf33, valueOf34, ruzVar, valueOf35, optional2, str19, messageIdType3, str20, uri3, str21, uri4, uri5, valueOf36, valueOf37, valueOf38, uri6, valueOf39, valueOf40, valueOf41, conversationIdType2, tqaVar, tqaVar2, valueOf42, valueOf43, valueOf44, uri7, str22, uri8, valueOf45, valueOf46, str23, str24, str25, valueOf47, valueOf48, valueOf49, valueOf50, str26, str27, valueOf51, str28, str29, valueOf52, valueOf53, valueOf54, valueOf55, valueOf56, valueOf57, valueOf58, str30, valueOf59, aggpVar, valueOf60, pyzVar, valueOf61, Integer.valueOf(ordinal13), null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "DraftsView -- REDACTED");
        }
        return a();
    }
}
