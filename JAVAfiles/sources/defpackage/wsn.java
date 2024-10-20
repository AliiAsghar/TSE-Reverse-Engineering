package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.aglz;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wsn extends aglz {
    private String B;
    private String C;
    private String D;
    private String G;
    private String I;
    private String L;
    private String R;
    private String U;
    private String V;
    private String W;
    private long X;
    public MessagesTable.BindData a;
    private MessageIdType aA;
    private String[] aB;
    private Uri[] aC;
    private String[] aD;
    private Uri[] aE;
    private Uri[] aF;
    private int[] aG;
    private int[] aH;
    private long aI;
    private Uri aJ;
    private long[] aK;
    private tql aL;
    private tqd[] aM;
    private ConversationIdType aN;
    private tqa aO;
    private tqa aP;
    private long aQ;
    private double aR;
    private double aS;
    private Uri[] aT;
    private String aU;
    private Uri[] aV;
    private int[] aW;
    private int[] aX;
    private String[] aY;
    private String aZ;
    private String ac;
    private byte[] ad;
    private apwq af;
    private String ag;
    private String ah;
    private Uri ak;
    private atok ar;
    private tqp as;
    private tqp at;
    private tqu au;
    private int av;
    private ruz aw;
    private utk ax;
    private Optional ay;
    private String[] az;
    public PartsTable.BindData[] b;
    private String ba;
    private byte[] bb;
    private byte[] bc;
    private boolean[] bd;
    private long[] be;
    private String[] bf;
    private String[] bg;
    private long[] bh;
    private String[] bi;
    private String bj;
    private boolean[] bk;
    private long[] bl;
    private byte[][] bm;
    private byte[][] bn;
    private boolean[] bo;
    private boolean bp;
    private long bq;
    private String br;
    private tqj bs;
    private aggp bt;
    private tqw bu;
    private pyz bv;
    private tqq bw;
    private tqi bx;
    private long[] by;
    public String c;
    public ScheduledSendTable.BindData d;
    private String e;
    private String m;
    private String n;
    private String o;
    private String p;
    private Uri y;
    private MessageIdType f = rvc.a;
    private ConversationIdType g = ruy.a;
    private Instant h = uzz.l(0);
    private wtf i = wtf.SCHEDULED;
    private Instant j = uzz.l(0);
    private MessageIdType k = rvc.a;
    private ConversationIdType l = ruy.a;
    private long q = 0;
    private Instant r = uzz.l(0);
    private long s = 0;
    private int t = 0;
    private int u = 0;
    private int v = 0;
    private boolean w = false;
    private boolean x = false;
    private int z = 0;
    private long A = 0;
    private long E = 0;
    private long F = 0;
    private int H = 0;
    private qwe J = null;
    private long K = 0;
    private rve M = rve.a;
    private int N = 0;
    private tqr O = tqr.VERIFICATION_NA;
    private int P = 0;
    private boolean Q = false;
    private long S = -1;
    private int T = -1;
    private String Y = "";
    private long Z = 0;
    private long aa = 1;
    private rve ab = rve.a;
    private long ae = 0;
    private MessageIdType ai = rvc.a;
    private boolean aj = false;
    private Optional al = rvg.a;
    private int am = -2;
    private xxw an = xxw.UNKNOWN;
    private tqf ao = tqf.UNKNOWN;
    private int ap = 0;
    private boolean aq = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public wsn() {
        tqp tqpVar = tqp.UNKNOWN;
        this.as = tqpVar;
        this.at = tqpVar;
        this.au = tqu.UNKNOWN;
        this.av = -1;
        this.aw = ruz.a;
        this.ax = utk.a;
        this.ay = uzz.j();
        this.aA = rvc.a;
        this.aL = tql.SUCCEEDED;
        this.aN = ruy.a;
        this.aO = new tqa(-1);
        this.aP = new tqa(-1);
        this.aQ = -1L;
        this.aR = 0.0d;
        this.aS = 0.0d;
        this.bp = false;
        this.bs = tqj.STANDARD;
        this.bu = tqw.UNKNOWN;
        this.bv = null;
        this.bw = tqq.NONE;
        this.bx = tqi.DEFAULT_NO_VERDICT;
    }

    private final void f() {
        Integer valueOf;
        int length;
        valueOf = Integer.valueOf(d.P().W().c());
        int intValue = valueOf.intValue();
        wsx a = ScheduledSendTable.a();
        ao(0, "_id");
        a.d(this.e);
        ao(1, "message_id");
        a.e(this.f);
        ao(2, "conversation_id");
        a.b(this.g);
        ao(3, "scheduled_time");
        a.f(this.h);
        ao(4, "status");
        a.g(this.i);
        if (intValue >= 58020) {
            ao(5, "creation_time");
            a.c(this.j);
        }
        this.d = a.a();
        sxn c = MessagesTable.c();
        ao(6, "_id");
        c.v(this.k);
        ao(7, "conversation_id");
        c.m(this.l);
        ao(8, "sender_id");
        c.af(this.m);
        if (intValue >= 54040) {
            ao(9, "sender_send_destination");
            c.ag(this.n);
        }
        if (intValue >= 59340) {
            ao(10, "msisdn_receiving_rcs_message");
            c.E(this.o);
        }
        if (intValue >= 54040) {
            ao(11, "receiving_network_country");
            c.Y(this.p);
        }
        ao(12, "sent_timestamp");
        c.ah(this.q);
        if (intValue >= 17030) {
            ao(13, "queue_insert_timestamp");
            c.O(this.r);
        }
        ao(14, "received_timestamp");
        c.X(this.s);
        ao(15, "message_protocol");
        c.N(this.t);
        ao(16, "message_status");
        c.an(this.u);
        if (intValue >= 13020) {
            ao(17, "message_report_status");
            c.y(this.v);
        }
        ao(18, "seen");
        c.G(this.w);
        ao(19, "read");
        c.W(this.x);
        ao(20, "sms_message_uri");
        c.al(this.y);
        ao(21, "sms_priority");
        c.am(this.z);
        ao(22, "sms_message_size");
        c.ak(this.A);
        ao(23, "mms_subject");
        c.C(this.B);
        ao(24, "mms_transaction_id");
        c.D(this.C);
        ao(25, "mms_content_location");
        c.z(this.D);
        ao(26, "mms_expiry");
        c.A(this.E);
        if (intValue >= 59890) {
            ao(27, "rcs_expiry");
            c.R(this.F);
        }
        if (intValue >= 9030) {
            ao(28, "mms_retrieve_text");
            c.B(this.G);
        }
        ao(29, "raw_status");
        c.P(this.H);
        ao(30, "self_id");
        c.ad(this.I);
        if (intValue >= 60160) {
            ao(31, "my_identity_foreign_key");
            c.F(this.J);
        }
        ao(32, "retry_start_timestamp");
        c.ab(this.K);
        if (intValue >= 8500) {
            ao(33, "cloud_sync_id");
            c.h(this.L);
        }
        if (intValue >= 41040) {
            ao(34, "rcs_message_id_with_text_type");
            c.T(this.M);
        }
        if (intValue >= 29060) {
            ao(35, "etouffee_status");
            c.Q(this.N);
        }
        if (intValue >= 29090) {
            ao(36, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
            c.aq(this.O);
        }
        if (intValue >= 39000) {
            ao(37, "rcs_ui_status");
            c.V(this.P);
        }
        if (intValue >= 30010) {
            ao(38, "is_hidden");
            c.w(this.Q);
        }
        if (intValue >= 10002) {
            ao(39, "rcs_remote_instance");
            c.U(this.R);
        }
        if (intValue >= 10004) {
            ao(40, "rcs_file_transfer_session_id");
            c.S(this.S);
        }
        if (intValue >= 9000) {
            ao(41, "sms_error_code");
            c.ai(this.T);
        }
        if (intValue >= 9000) {
            ao(42, "sms_error_desc_map_name");
            c.aj(this.U);
        }
        if (intValue >= 9010) {
            ao(43, "correlation_id");
            c.n(this.V);
        }
        if (intValue >= 31010) {
            ao(44, "cms_id");
            c.j(this.W);
        }
        if (intValue >= 37040) {
            ao(45, "cms_last_mod_seq");
            c.k(this.X);
        }
        if (intValue >= 19020) {
            ao(46, "web_id");
            c.ar(this.Y);
        }
        if (intValue >= 29100) {
            ao(47, "usage_stats_logging_id");
            c.ap(this.Z);
        }
        if (intValue >= 35030) {
            ao(48, "send_counter");
            c.ae(this.aa);
        }
        if (intValue >= 35030) {
            ao(49, "original_rcs_message_id");
            c.K(this.ab);
        }
        if (intValue >= 37020) {
            ao(50, "custom_delivery_receipt_mime_type");
            c.p(this.ac);
        }
        if (intValue >= 37020) {
            ao(51, "custom_delivery_receipt_content");
            c.o(this.ad);
        }
        if (intValue >= 37030) {
            ao(52, "report_attempt_acounter");
            c.Z(this.ae);
        }
        if (intValue >= 45020) {
            ao(53, "custom_headers");
            c.q(this.af);
        }
        if (intValue >= 46010) {
            ao(54, "cms_correlation_id");
            c.i(this.ag);
        }
        if (intValue >= 48030) {
            ao(55, "group_private_participant");
            c.u(this.ah);
        }
        if (intValue >= 48030) {
            ao(56, "original_message_id");
            c.I(this.ai);
        }
        if (intValue >= 49060) {
            ao(57, "awaiting_reverse_sync");
            c.f(this.aj);
        }
        if (intValue >= 49060) {
            ao(58, "old_sms_message_uri");
            c.H(this.ak);
        }
        if (intValue >= 56000) {
            ao(59, "draft_id");
            c.r(this.al);
        }
        if (intValue >= 58040) {
            ao(60, "result_code");
            c.aa(this.am);
        }
        if (intValue >= 58210) {
            ao(61, "cms_life_cycle");
            c.l(this.an);
        }
        if (intValue >= 58710) {
            ao(62, "fallback_reason");
            c.t(this.ao);
        }
        if (intValue >= 58230) {
            ao(63, "auto_retry_counter");
            c.e(this.ap);
        }
        if (intValue >= 58280) {
            ao(64, "can_revoke_before_delivered_with_rcs");
            c.g(this.aq);
        }
        if (intValue >= 58680) {
            ao(65, "trace_id");
            c.ao(this.ar);
        }
        if (intValue >= 58720) {
            ao(66, "outgoing_delivery_report_status");
            c.L(this.as);
        }
        if (intValue >= 58720) {
            ao(67, "outgoing_read_report_status");
            c.M(this.at);
        }
        if (intValue >= 59310) {
            ao(68, "xms_transport");
            c.as(this.au);
        }
        if (intValue >= 59430) {
            ao(69, "message_original_protocol");
            c.J(this.av);
        }
        if (intValue >= 59490) {
            ao(70, "satellite_datagram_id");
            c.ac(this.aw);
        }
        if (intValue >= 60190) {
            ao(71, "encryption_protocol");
            c.s(this.ax);
        }
        if (intValue >= 60370) {
            ao(72, "message_persistence_id");
            c.x(this.ay);
        }
        this.a = c.a();
        ArrayList arrayList = new ArrayList();
        if (g() == null) {
            length = 0;
        } else {
            length = g().length;
        }
        new HashSet();
        for (int i = 0; i < length; i++) {
            tbg c2 = PartsTable.c();
            c2.B(g()[i]);
            ao(74, "message_id");
            c2.J(this.aA);
            ao(75, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
            c2.X(this.aB[i]);
            ao(76, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            c2.Z(this.aC[i]);
            ao(77, "content_type");
            c2.t(this.aD[i]);
            if (intValue >= 10021) {
                ao(78, "original_uri");
                c2.L(this.aE[i]);
            }
            if (intValue >= 29060) {
                ao(79, "storage_uri");
                c2.V(this.aF[i]);
            }
            ao(80, "width");
            c2.ac(this.aG[i]);
            ao(81, "height");
            c2.A(this.aH[i]);
            if (intValue >= 3010) {
                ao(82, "timestamp");
                c2.Y(this.aI);
            }
            if (intValue >= 4020) {
                ao(83, "output_uri");
                c2.P(this.aJ);
            }
            if (intValue >= 4020) {
                ao(84, "target_size");
                c2.W(this.aK[i]);
            }
            if (intValue >= 4020) {
                ao(85, "processing_status");
                c2.Q(this.aL);
            }
            if (intValue >= 44010) {
                ao(86, "cms_attachment_processing_status");
                c2.k(this.aM[i]);
            }
            ao(87, "conversation_id");
            c2.u(this.aN);
            if (intValue >= 5020) {
                ao(88, "sticker_set_id");
                c2.U(this.aO);
            }
            if (intValue >= 5020) {
                ao(89, "sticker_id");
                c2.T(this.aP);
            }
            if (intValue >= 7000) {
                ao(90, "media_modified_timestamp");
                c2.H(this.aQ);
            }
            if (intValue >= 10005) {
                ao(91, "longitude");
                c2.F(this.aR);
            }
            if (intValue >= 10005) {
                ao(92, "latitude");
                c2.D(this.aS);
            }
            if (intValue >= 10017) {
                ao(93, "preview_content_uri");
                c2.N(this.aT[i]);
            }
            if (intValue >= 10017) {
                ao(94, "preview_content_type");
                c2.M(this.aU);
            }
            if (intValue >= 13000) {
                ao(95, "fallback_uri");
                c2.x(this.aV[i]);
            }
            if (intValue >= 14010) {
                ao(96, "source");
                c2.S(this.aW[i]);
            }
            if (intValue >= 17010) {
                ao(97, "bundle_index");
                c2.j(this.aX[i]);
            }
            if (intValue >= 17020) {
                ao(98, "blob_id");
                c2.g(this.aY[i]);
            }
            if (intValue >= 59570) {
                ao(99, "blob_gaia_email");
                c2.f(this.aZ);
            }
            if (intValue >= 40040) {
                ao(100, "cms_full_size_blob_id");
                c2.n(this.ba);
            }
            if (intValue >= 42010) {
                ao(101, "cms_media_encryption_key");
                c2.o(this.bb);
            }
            if (intValue >= 42070) {
                ao(102, "cms_compressed_media_encryption_key");
                c2.m(this.bc);
            }
            if (intValue >= 18000) {
                ao(103, "blob_upload_permanent_failure");
                c2.h(this.bd[i]);
            }
            if (intValue >= 19030) {
                ao(104, "blob_upload_timestamp");
                c2.i(this.be[i]);
            }
            if (intValue >= 22060) {
                ao(105, "expressive_sticker_name");
                c2.w(this.bf[i]);
            }
            if (intValue >= 26000) {
                ao(106, "file_name");
                c2.y(this.bg[i]);
            }
            if (intValue >= 26040) {
                ao(107, "duration");
                c2.v(this.bh[i]);
            }
            if (intValue >= 27000) {
                ao(108, "compressed_blob_id");
                c2.p(this.bi[i]);
            }
            if (intValue >= 40040) {
                ao(109, "cms_compressed_blob_id");
                c2.l(this.bj);
            }
            if (intValue >= 27000) {
                ao(110, "compressed_blob_upload_permanent_failure");
                c2.q(this.bk[i]);
            }
            if (intValue >= 27000) {
                ao(111, "compressed_blob_upload_timestamp");
                c2.r(this.bl[i]);
            }
            if (intValue >= 30040) {
                ao(112, "media_encryption_key");
                c2.G(this.bm[i]);
            }
            if (intValue >= 30040) {
                ao(113, "compressed_media_encryption_key");
                c2.s(this.bn[i]);
            }
            if (intValue >= 52030) {
                ao(114, "missing_entry_in_telephony");
                c2.K(this.bo[i]);
            }
            if (intValue >= 53040) {
                ao(115, "awaiting_reverse_sync");
                c2.e(this.bp);
            }
            if (intValue >= 52050) {
                ao(116, "file_size_bytes");
                c2.z(this.bq);
            }
            if (intValue >= 52050) {
                ao(117, "local_cache_path");
                c2.E(this.br);
            }
            if (intValue >= 58150) {
                ao(118, "media_send_type");
                c2.I(this.bs);
            }
            if (intValue >= 59470) {
                ao(119, "voice_metadata");
                c2.ab(this.bt);
            }
            if (intValue >= 58770) {
                ao(120, "validation_status");
                c2.aa(this.bu);
            }
            if (intValue >= 60080) {
                ao(121, "processing_id");
                c2.O(this.bv);
            }
            if (intValue >= 60230) {
                ao(122, "rich_card_media_download_failure_reason");
                c2.R(this.bw);
            }
            if (intValue >= 60240) {
                ao(123, "image_display_state");
                c2.C(this.bx);
            }
            arrayList.add(c2.a());
        }
        this.b = (PartsTable.BindData[]) arrayList.toArray(new PartsTable.BindData[0]);
    }

    private final String[] g() {
        ao(73, "_id");
        return this.az;
    }

    @Override // defpackage.aglz
    public final String a() {
        String str;
        String str2;
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.h);
        String valueOf5 = String.valueOf(this.i);
        String valueOf6 = String.valueOf(this.j);
        String valueOf7 = String.valueOf(this.k);
        String valueOf8 = String.valueOf(this.l);
        String valueOf9 = String.valueOf(this.m);
        String valueOf10 = String.valueOf(this.n);
        String valueOf11 = String.valueOf(this.o);
        String valueOf12 = String.valueOf(this.p);
        String valueOf13 = String.valueOf(this.q);
        String valueOf14 = String.valueOf(this.r);
        String valueOf15 = String.valueOf(this.s);
        String valueOf16 = String.valueOf(this.t);
        String valueOf17 = String.valueOf(this.u);
        String valueOf18 = String.valueOf(this.v);
        String valueOf19 = String.valueOf(this.w);
        String valueOf20 = String.valueOf(this.x);
        String valueOf21 = String.valueOf(this.y);
        String valueOf22 = String.valueOf(this.z);
        String valueOf23 = String.valueOf(this.A);
        String valueOf24 = String.valueOf(this.B);
        String valueOf25 = String.valueOf(this.C);
        String valueOf26 = String.valueOf(this.D);
        String valueOf27 = String.valueOf(this.E);
        String valueOf28 = String.valueOf(this.F);
        String valueOf29 = String.valueOf(this.G);
        String valueOf30 = String.valueOf(this.H);
        String valueOf31 = String.valueOf(this.I);
        String valueOf32 = String.valueOf(this.J);
        String valueOf33 = String.valueOf(this.K);
        String valueOf34 = String.valueOf(this.L);
        String valueOf35 = String.valueOf(this.M);
        String valueOf36 = String.valueOf(this.N);
        String valueOf37 = String.valueOf(this.O);
        String valueOf38 = String.valueOf(this.P);
        String valueOf39 = String.valueOf(this.Q);
        String valueOf40 = String.valueOf(this.R);
        String valueOf41 = String.valueOf(this.S);
        String valueOf42 = String.valueOf(this.T);
        String valueOf43 = String.valueOf(this.U);
        String valueOf44 = String.valueOf(this.V);
        String valueOf45 = String.valueOf(this.W);
        String valueOf46 = String.valueOf(this.X);
        String valueOf47 = String.valueOf(this.Y);
        String valueOf48 = String.valueOf(this.Z);
        String valueOf49 = String.valueOf(this.aa);
        String valueOf50 = String.valueOf(this.ab);
        String valueOf51 = String.valueOf(this.ac);
        byte[] bArr = this.ad;
        String str3 = "NULL";
        if (bArr == null) {
            str = "NULL";
        } else {
            str = String.valueOf(bArr.length);
        }
        String concat = "BLOB".concat(String.valueOf(str));
        String valueOf52 = String.valueOf(this.ae);
        String valueOf53 = String.valueOf(this.af);
        String valueOf54 = String.valueOf(this.ag);
        String valueOf55 = String.valueOf(this.ah);
        String valueOf56 = String.valueOf(this.ai);
        String valueOf57 = String.valueOf(this.aj);
        String valueOf58 = String.valueOf(this.ak);
        String valueOf59 = String.valueOf(this.al);
        String valueOf60 = String.valueOf(this.am);
        String valueOf61 = String.valueOf(this.an);
        String valueOf62 = String.valueOf(this.ao);
        String valueOf63 = String.valueOf(this.ap);
        String valueOf64 = String.valueOf(this.aq);
        String valueOf65 = String.valueOf(this.ar);
        String valueOf66 = String.valueOf(this.as);
        String valueOf67 = String.valueOf(this.at);
        String valueOf68 = String.valueOf(this.au);
        String valueOf69 = String.valueOf(this.av);
        String valueOf70 = String.valueOf(this.aw);
        String valueOf71 = String.valueOf(this.ax);
        String valueOf72 = String.valueOf(this.ay);
        String aA = aA(this.az);
        String valueOf73 = String.valueOf(this.aA);
        String aA2 = aA(this.aB);
        String az = az(this.aC);
        String aA3 = aA(this.aD);
        String az2 = az(this.aE);
        String az3 = az(this.aF);
        String ax = ax(this.aG);
        String ax2 = ax(this.aH);
        String valueOf74 = String.valueOf(this.aI);
        String valueOf75 = String.valueOf(this.aJ);
        String ay = ay(this.aK);
        String valueOf76 = String.valueOf(this.aL);
        String az4 = az(this.aM);
        String valueOf77 = String.valueOf(this.aN);
        String valueOf78 = String.valueOf(this.aO);
        String valueOf79 = String.valueOf(this.aP);
        String valueOf80 = String.valueOf(this.aQ);
        String valueOf81 = String.valueOf(this.aR);
        String valueOf82 = String.valueOf(this.aS);
        String az5 = az(this.aT);
        String valueOf83 = String.valueOf(this.aU);
        String az6 = az(this.aV);
        String ax3 = ax(this.aW);
        String ax4 = ax(this.aX);
        String aA4 = aA(this.aY);
        String valueOf84 = String.valueOf(this.ba);
        byte[] bArr2 = this.bb;
        if (bArr2 == null) {
            str2 = "NULL";
        } else {
            str2 = String.valueOf(bArr2.length);
        }
        String concat2 = "BLOB".concat(String.valueOf(str2));
        byte[] bArr3 = this.bc;
        if (bArr3 != null) {
            str3 = String.valueOf(bArr3.length);
        }
        return String.format(locale, "ScheduledMessagesQuery [scheduled_send.scheduled_send__id: %s,\n  scheduled_send.scheduled_send_message_id: %s,\n  scheduled_send.scheduled_send_conversation_id: %s,\n  scheduled_send.scheduled_send_scheduled_time: %s,\n  scheduled_send.scheduled_send_status: %s,\n  scheduled_send.scheduled_send_creation_time: %s,\n  messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_sender_send_destination: %s,\n  messages.messages_msisdn_receiving_rcs_message: %s,\n  messages.messages_receiving_network_country: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_queue_insert_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_message_report_status: %s,\n  messages.messages_seen: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_message_uri: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_sms_message_size: %s,\n  messages.messages_mms_subject: %s,\n  messages.messages_mms_transaction_id: %s,\n  messages.messages_mms_content_location: %s,\n  messages.messages_mms_expiry: %s,\n  messages.messages_rcs_expiry: %s,\n  messages.messages_mms_retrieve_text: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_self_id: %s,\n  messages.messages_my_identity_foreign_key: %s,\n  messages.messages_retry_start_timestamp: %s,\n  messages.messages_cloud_sync_id: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_etouffee_status: %s,\n  messages.messages_verification_status: %s,\n  messages.messages_rcs_ui_status: %s,\n  messages.messages_is_hidden: %s,\n  messages.messages_rcs_remote_instance: %s,\n  messages.messages_rcs_file_transfer_session_id: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  messages.messages_correlation_id: %s,\n  messages.messages_cms_id: %s,\n  messages.messages_cms_last_mod_seq: %s,\n  messages.messages_web_id: %s,\n  messages.messages_usage_stats_logging_id: %s,\n  messages.messages_send_counter: %s,\n  messages.messages_original_rcs_message_id: %s,\n  messages.messages_custom_delivery_receipt_mime_type: %s,\n  messages.messages_custom_delivery_receipt_content: %s,\n  messages.messages_report_attempt_acounter: %s,\n  messages.messages_custom_headers: %s,\n  messages.messages_cms_correlation_id: %s,\n  messages.messages_group_private_participant: %s,\n  messages.messages_original_message_id: %s,\n  messages.messages_awaiting_reverse_sync: %s,\n  messages.messages_old_sms_message_uri: %s,\n  messages.messages_draft_id: %s,\n  messages.messages_result_code: %s,\n  messages.messages_cms_life_cycle: %s,\n  messages.messages_fallback_reason: %s,\n  messages.messages_auto_retry_counter: %s,\n  messages.messages_can_revoke_before_delivered_with_rcs: %s,\n  messages.messages_trace_id: %s,\n  messages.messages_outgoing_delivery_report_status: %s,\n  messages.messages_outgoing_read_report_status: %s,\n  messages.messages_xms_transport: %s,\n  messages.messages_message_original_protocol: %s,\n  messages.messages_satellite_datagram_id: %s,\n  messages.messages_encryption_protocol: %s,\n  messages.messages_message_persistence_id: %s,\n  parts.parts__id: %s,\n  parts.parts_message_id: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_original_uri: %s,\n  parts.parts_storage_uri: %s,\n  parts.parts_width: %s,\n  parts.parts_height: %s,\n  parts.parts_timestamp: %s,\n  parts.parts_output_uri: %s,\n  parts.parts_target_size: %s,\n  parts.parts_processing_status: %s,\n  parts.parts_cms_attachment_processing_status: %s,\n  parts.parts_conversation_id: %s,\n  parts.parts_sticker_set_id: %s,\n  parts.parts_sticker_id: %s,\n  parts.parts_media_modified_timestamp: %s,\n  parts.parts_longitude: %s,\n  parts.parts_latitude: %s,\n  parts.parts_preview_content_uri: %s,\n  parts.parts_preview_content_type: %s,\n  parts.parts_fallback_uri: %s,\n  parts.parts_source: %s,\n  parts.parts_bundle_index: %s,\n  parts.parts_blob_id: %s,\n  parts.parts_blob_gaia_email: %s,\n  parts.parts_cms_full_size_blob_id: %s,\n  parts.parts_cms_media_encryption_key: %s,\n  parts.parts_cms_compressed_media_encryption_key: %s,\n  parts.parts_blob_upload_permanent_failure: %s,\n  parts.parts_blob_upload_timestamp: %s,\n  parts.parts_expressive_sticker_name: %s,\n  parts.parts_file_name: %s,\n  parts.parts_duration: %s,\n  parts.parts_compressed_blob_id: %s,\n  parts.parts_cms_compressed_blob_id: %s,\n  parts.parts_compressed_blob_upload_permanent_failure: %s,\n  parts.parts_compressed_blob_upload_timestamp: %s,\n  parts.parts_media_encryption_key: %s,\n  parts.parts_compressed_media_encryption_key: %s,\n  parts.parts_missing_entry_in_telephony: %s,\n  parts.parts_awaiting_reverse_sync: %s,\n  parts.parts_file_size_bytes: %s,\n  parts.parts_local_cache_path: %s,\n  parts.parts_media_send_type: %s,\n  parts.parts_voice_metadata: %s,\n  parts.parts_validation_status: %s,\n  parts.parts_processing_id: %s,\n  parts.parts_rich_card_media_download_failure_reason: %s,\n  parts.parts_image_display_state: %s,\n  parts.parts_rowid: %s,\n  message_captions.message_captions_caption: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, valueOf46, valueOf47, valueOf48, valueOf49, valueOf50, valueOf51, concat, valueOf52, valueOf53, valueOf54, valueOf55, valueOf56, valueOf57, valueOf58, valueOf59, valueOf60, valueOf61, valueOf62, valueOf63, valueOf64, valueOf65, valueOf66, valueOf67, valueOf68, valueOf69, valueOf70, valueOf71, valueOf72, aA, valueOf73, aA2, az, aA3, az2, az3, ax, ax2, valueOf74, valueOf75, ay, valueOf76, az4, valueOf77, valueOf78, valueOf79, valueOf80, valueOf81, valueOf82, az5, valueOf83, az6, ax3, ax4, aA4, "REDACTED", valueOf84, concat2, "BLOB".concat(String.valueOf(str3)), aB(this.bd), ay(this.be), aA(this.bf), aA(this.bg), ay(this.bh), aA(this.bi), String.valueOf(this.bj), aB(this.bk), ay(this.bl), az(this.bm), az(this.bn), aB(this.bo), String.valueOf(this.bp), String.valueOf(this.bq), String.valueOf(this.br), String.valueOf(this.bs), String.valueOf(this.bt), String.valueOf(this.bu), String.valueOf(this.bv), String.valueOf(this.bw), String.valueOf(this.bx), ay(this.by), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        valueOf.intValue();
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        aggp aggpVar;
        Uri uri;
        Uri uri2;
        Uri parse;
        Uri uri3;
        Uri uri4;
        Uri uri5;
        atok atokVar;
        Uri parse2;
        Uri parse3;
        boolean z;
        boolean z2;
        wsq wsqVar = (wsq) agmqVar;
        aq();
        this.cJ = wsqVar.dx();
        if (wsqVar.db(0)) {
            this.e = wsqVar.getString(wsqVar.cI(0, wsu.a));
            fE(0);
        }
        boolean z3 = true;
        if (wsqVar.db(1)) {
            this.f = new MessageIdType(wsqVar.getLong(wsqVar.cI(1, wsu.a)));
            fE(1);
        }
        if (wsqVar.db(2)) {
            this.g = wsqVar.h();
            fE(2);
        }
        if (wsqVar.db(3)) {
            this.h = uzz.l(wsqVar.getLong(wsqVar.cI(3, wsu.a)));
            fE(3);
        }
        if (wsqVar.db(4)) {
            wtf[] values = wtf.values();
            int i = wsqVar.getInt(wsqVar.cI(4, wsu.a));
            if (i < values.length) {
                this.i = values[i];
                fE(4);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (wsqVar.db(5)) {
            this.j = wsqVar.l();
            fE(5);
        }
        if (wsqVar.db(6)) {
            this.k = new MessageIdType(wsqVar.getLong(wsqVar.cI(6, wsu.a)));
            fE(6);
        }
        if (wsqVar.db(7)) {
            this.l = wsqVar.f();
            fE(7);
        }
        if (wsqVar.db(8)) {
            this.m = wsqVar.getString(wsqVar.cI(8, wsu.a));
            fE(8);
        }
        if (wsqVar.db(9)) {
            this.n = wsqVar.getString(wsqVar.cI(9, wsu.a));
            fE(9);
        }
        if (wsqVar.db(10)) {
            this.o = wsqVar.getString(wsqVar.cI(10, wsu.a));
            fE(10);
        }
        if (wsqVar.db(11)) {
            this.p = wsqVar.getString(wsqVar.cI(11, wsu.a));
            fE(11);
        }
        if (wsqVar.db(12)) {
            this.q = wsqVar.getLong(wsqVar.cI(12, wsu.a));
            fE(12);
        }
        if (wsqVar.db(13)) {
            this.r = uzz.l(wsqVar.getLong(wsqVar.cI(13, wsu.a)));
            fE(13);
        }
        if (wsqVar.db(14)) {
            this.s = wsqVar.getLong(wsqVar.cI(14, wsu.a));
            fE(14);
        }
        if (wsqVar.db(15)) {
            this.t = wsqVar.getInt(wsqVar.cI(15, wsu.a));
            fE(15);
        }
        if (wsqVar.db(16)) {
            this.u = wsqVar.getInt(wsqVar.cI(16, wsu.a));
            fE(16);
        }
        if (wsqVar.db(17)) {
            this.v = wsqVar.getInt(wsqVar.cI(17, wsu.a));
            fE(17);
        }
        if (wsqVar.db(18)) {
            if (wsqVar.getInt(wsqVar.cI(18, wsu.a)) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.w = z2;
            fE(18);
        }
        if (wsqVar.db(19)) {
            if (wsqVar.getInt(wsqVar.cI(19, wsu.a)) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.x = z;
            fE(19);
        }
        if (wsqVar.db(20)) {
            String string = wsqVar.getString(wsqVar.cI(20, wsu.a));
            if (string == null) {
                parse3 = null;
            } else {
                parse3 = Uri.parse(string);
            }
            this.y = parse3;
            fE(20);
        }
        if (wsqVar.db(21)) {
            this.z = wsqVar.getInt(wsqVar.cI(21, wsu.a));
            fE(21);
        }
        if (wsqVar.db(22)) {
            this.A = wsqVar.getLong(wsqVar.cI(22, wsu.a));
            fE(22);
        }
        if (wsqVar.db(23)) {
            this.B = yta.a(wsqVar.getString(wsqVar.cI(23, wsu.a)));
            fE(23);
        }
        if (wsqVar.db(24)) {
            this.C = wsqVar.getString(wsqVar.cI(24, wsu.a));
            fE(24);
        }
        if (wsqVar.db(25)) {
            this.D = wsqVar.getString(wsqVar.cI(25, wsu.a));
            fE(25);
        }
        if (wsqVar.db(26)) {
            this.E = wsqVar.getLong(wsqVar.cI(26, wsu.a));
            fE(26);
        }
        if (wsqVar.db(27)) {
            this.F = wsqVar.getLong(wsqVar.cI(27, wsu.a));
            fE(27);
        }
        if (wsqVar.db(28)) {
            this.G = wsqVar.getString(wsqVar.cI(28, wsu.a));
            fE(28);
        }
        if (wsqVar.db(29)) {
            this.H = wsqVar.getInt(wsqVar.cI(29, wsu.a));
            fE(29);
        }
        if (wsqVar.db(30)) {
            this.I = wsqVar.getString(wsqVar.cI(30, wsu.a));
            fE(30);
        }
        if (wsqVar.db(31)) {
            this.J = riw.m(wsqVar.getString(wsqVar.cI(31, wsu.a)));
            fE(31);
        }
        if (wsqVar.db(32)) {
            this.K = wsqVar.getLong(wsqVar.cI(32, wsu.a));
            fE(32);
        }
        if (wsqVar.db(33)) {
            this.L = wsqVar.p();
            fE(33);
        }
        if (wsqVar.db(34)) {
            this.M = rve.a(wsqVar.getString(wsqVar.cI(34, wsu.a)));
            fE(34);
        }
        if (wsqVar.db(35)) {
            this.N = wsqVar.getInt(wsqVar.cI(35, wsu.a));
            fE(35);
        }
        if (wsqVar.db(36)) {
            tqr[] values2 = tqr.values();
            int i2 = wsqVar.getInt(wsqVar.cI(36, wsu.a));
            if (i2 < values2.length) {
                this.O = values2[i2];
                fE(36);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (wsqVar.db(37)) {
            this.P = wsqVar.getInt(wsqVar.cI(37, wsu.a));
            fE(37);
        }
        if (wsqVar.db(38)) {
            if (wsqVar.getInt(wsqVar.cI(38, wsu.a)) != 1) {
                z3 = false;
            }
            this.Q = z3;
            fE(38);
        }
        if (wsqVar.db(39)) {
            this.R = wsqVar.getString(wsqVar.cI(39, wsu.a));
            fE(39);
        }
        if (wsqVar.db(40)) {
            this.S = wsqVar.getLong(wsqVar.cI(40, wsu.a));
            fE(40);
        }
        if (wsqVar.db(41)) {
            this.T = wsqVar.getInt(wsqVar.cI(41, wsu.a));
            fE(41);
        }
        if (wsqVar.db(42)) {
            this.U = wsqVar.getString(wsqVar.cI(42, wsu.a));
            fE(42);
        }
        if (wsqVar.db(43)) {
            this.V = wsqVar.u();
            fE(43);
        }
        if (wsqVar.db(44)) {
            this.W = wsqVar.t();
            fE(44);
        }
        if (wsqVar.db(45)) {
            this.X = wsqVar.e();
            fE(45);
        }
        if (wsqVar.db(46)) {
            this.Y = wsqVar.getString(wsqVar.cI(46, wsu.a));
            fE(46);
        }
        if (wsqVar.db(47)) {
            this.Z = wsqVar.getLong(wsqVar.cI(47, wsu.a));
            fE(47);
        }
        if (wsqVar.db(48)) {
            this.aa = wsqVar.getLong(wsqVar.cI(48, wsu.a));
            fE(48);
        }
        if (wsqVar.db(49)) {
            this.ab = rve.a(wsqVar.getString(wsqVar.cI(49, wsu.a)));
            fE(49);
        }
        if (wsqVar.db(50)) {
            this.ac = wsqVar.v();
            fE(50);
        }
        if (wsqVar.db(51)) {
            this.ad = wsqVar.B();
            fE(51);
        }
        if (wsqVar.db(52)) {
            this.ae = wsqVar.getLong(wsqVar.cI(52, wsu.a));
            fE(52);
        }
        if (wsqVar.db(53)) {
            this.af = wsqVar.k();
            fE(53);
        }
        if (wsqVar.db(54)) {
            this.ag = wsqVar.r();
            fE(54);
        }
        if (wsqVar.db(55)) {
            this.ah = wsqVar.getString(wsqVar.cI(55, wsu.a));
            fE(55);
        }
        if (wsqVar.db(56)) {
            this.ai = new MessageIdType(wsqVar.getLong(wsqVar.cI(56, wsu.a)));
            fE(56);
        }
        if (wsqVar.db(57)) {
            this.aj = wsqVar.w();
            fE(57);
        }
        if (wsqVar.db(58)) {
            String string2 = wsqVar.getString(wsqVar.cI(58, wsu.a));
            if (string2 == null) {
                parse2 = null;
            } else {
                parse2 = Uri.parse(string2);
            }
            this.ak = parse2;
            fE(58);
        }
        if (wsqVar.db(59)) {
            this.al = wsqVar.m();
            fE(59);
        }
        if (wsqVar.db(60)) {
            this.am = wsqVar.getInt(wsqVar.cI(60, wsu.a));
            fE(60);
        }
        if (wsqVar.db(61)) {
            this.an = wsqVar.j();
            fE(61);
        }
        if (wsqVar.db(62)) {
            tqf[] values3 = tqf.values();
            int i3 = wsqVar.getInt(wsqVar.cI(62, wsu.a));
            if (i3 < values3.length) {
                this.ao = values3[i3];
                fE(62);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (wsqVar.db(63)) {
            this.ap = wsqVar.c();
            fE(63);
        }
        if (wsqVar.db(64)) {
            this.aq = wsqVar.y();
            fE(64);
        }
        if (wsqVar.db(65)) {
            byte[] blob = wsqVar.getBlob(wsqVar.cI(65, wsu.a));
            if (blob == null) {
                atokVar = null;
            } else {
                try {
                    atokVar = (atok) apag.parseFrom(atok.a, blob, aozs.a());
                } catch (Throwable unused) {
                    atokVar = atok.a;
                }
            }
            this.ar = atokVar;
            fE(65);
        }
        if (wsqVar.db(66)) {
            tqp[] values4 = tqp.values();
            int i4 = wsqVar.getInt(wsqVar.cI(66, wsu.a));
            if (i4 < values4.length) {
                this.as = values4[i4];
                fE(66);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (wsqVar.db(67)) {
            tqp[] values5 = tqp.values();
            int i5 = wsqVar.getInt(wsqVar.cI(67, wsu.a));
            if (i5 < values5.length) {
                this.at = values5[i5];
                fE(67);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (wsqVar.db(68)) {
            tqu[] values6 = tqu.values();
            int i6 = wsqVar.getInt(wsqVar.cI(68, wsu.a));
            if (i6 < values6.length) {
                this.au = values6[i6];
                fE(68);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (wsqVar.db(69)) {
            this.av = wsqVar.getInt(wsqVar.cI(69, wsu.a));
            fE(69);
        }
        if (wsqVar.db(70)) {
            this.aw = new ruz(wsqVar.getString(wsqVar.cI(70, wsu.a)));
            fE(70);
        }
        if (wsqVar.db(71)) {
            this.ax = wsqVar.i();
            fE(71);
        }
        if (wsqVar.db(72)) {
            this.ay = rvg.a(wsqVar.getString(wsqVar.cI(72, wsu.a)));
            fE(72);
        }
        if (wsqVar.db(73)) {
            this.az = (String[]) agnc.z(null, wsq.dm(wsqVar.getString(wsqVar.cI(73, wsu.a))), new String[0]);
            fE(73);
        }
        if (wsqVar.db(74)) {
            this.aA = new MessageIdType(wsqVar.getLong(wsqVar.cI(74, wsu.a)));
            fE(74);
        }
        if (wsqVar.db(75)) {
            String[] dm = wsq.dm(wsqVar.getString(wsqVar.cI(75, wsu.a)));
            for (int i7 = 0; i7 < dm.length; i7++) {
                dm[i7] = yta.a(dm[i7]);
            }
            this.aB = (String[]) agnc.z(null, dm, new String[0]);
            fE(75);
        }
        if (wsqVar.db(76)) {
            String[] dm2 = wsq.dm(wsqVar.getString(wsqVar.cI(76, wsu.a)));
            int length = dm2.length;
            Uri[] uriArr = new Uri[length];
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                String str = dm2[i8];
                int i10 = i9 + 1;
                if (str != null && str.length() != 0) {
                    uri5 = Uri.parse(str);
                } else {
                    uri5 = null;
                }
                uriArr[i9] = uri5;
                i8++;
                i9 = i10;
            }
            this.aC = (Uri[]) agnc.z(null, uriArr, new Uri[0]);
            fE(76);
        }
        if (wsqVar.db(77)) {
            this.aD = wsqVar.J();
            fE(77);
        }
        if (wsqVar.db(78)) {
            String[] dm3 = wsq.dm(wsqVar.getString(wsqVar.cI(78, wsu.a)));
            int length2 = dm3.length;
            Uri[] uriArr2 = new Uri[length2];
            int i11 = 0;
            int i12 = 0;
            while (i11 < length2) {
                String str2 = dm3[i11];
                int i13 = i12 + 1;
                if (str2 != null && str2.length() != 0) {
                    uri4 = Uri.parse(str2);
                } else {
                    uri4 = null;
                }
                uriArr2[i12] = uri4;
                i11++;
                i12 = i13;
            }
            this.aE = (Uri[]) agnc.z(null, uriArr2, new Uri[0]);
            fE(78);
        }
        if (wsqVar.db(79)) {
            String[] dm4 = wsq.dm(wsqVar.getString(wsqVar.cI(79, wsu.a)));
            int length3 = dm4.length;
            Uri[] uriArr3 = new Uri[length3];
            int i14 = 0;
            int i15 = 0;
            while (i14 < length3) {
                String str3 = dm4[i14];
                int i16 = i15 + 1;
                if (str3 != null && str3.length() != 0) {
                    uri3 = Uri.parse(str3);
                } else {
                    uri3 = null;
                }
                uriArr3[i15] = uri3;
                i14++;
                i15 = i16;
            }
            this.aF = (Uri[]) agnc.z(null, uriArr3, new Uri[0]);
            fE(79);
        }
        if (wsqVar.db(80)) {
            this.aG = agnc.w(null, wsq.dk(wsqVar.getString(wsqVar.cI(80, wsu.a))));
            fE(80);
        }
        if (wsqVar.db(81)) {
            this.aH = agnc.w(null, wsq.dk(wsqVar.getString(wsqVar.cI(81, wsu.a))));
            fE(81);
        }
        if (wsqVar.db(82)) {
            this.aI = wsqVar.getLong(wsqVar.cI(82, wsu.a));
            fE(82);
        }
        if (wsqVar.db(83)) {
            String string3 = wsqVar.getString(wsqVar.cI(83, wsu.a));
            if (string3 == null) {
                parse = null;
            } else {
                parse = Uri.parse(string3);
            }
            this.aJ = parse;
            fE(83);
        }
        if (wsqVar.db(84)) {
            this.aK = agnc.y(null, wsq.dl(wsqVar.getString(wsqVar.cI(84, wsu.a))));
            fE(84);
        }
        if (wsqVar.db(85)) {
            tql[] values7 = tql.values();
            int i17 = wsqVar.getInt(wsqVar.cI(85, wsu.a));
            if (i17 < values7.length) {
                this.aL = values7[i17];
                fE(85);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (wsqVar.db(86)) {
            this.aM = wsqVar.G();
            fE(86);
        }
        if (wsqVar.db(87)) {
            this.aN = wsqVar.g();
            fE(87);
        }
        if (wsqVar.db(88)) {
            this.aO = wch.I(wsqVar.getString(wsqVar.cI(88, wsu.a)));
            fE(88);
        }
        if (wsqVar.db(89)) {
            this.aP = wch.I(wsqVar.getString(wsqVar.cI(89, wsu.a)));
            fE(89);
        }
        if (wsqVar.db(90)) {
            this.aQ = wsqVar.getLong(wsqVar.cI(90, wsu.a));
            fE(90);
        }
        if (wsqVar.db(91)) {
            this.aR = wsqVar.getDouble(wsqVar.cI(91, wsu.a));
            fE(91);
        }
        if (wsqVar.db(92)) {
            this.aS = wsqVar.getDouble(wsqVar.cI(92, wsu.a));
            fE(92);
        }
        if (wsqVar.db(93)) {
            String[] dm5 = wsq.dm(wsqVar.getString(wsqVar.cI(93, wsu.a)));
            int length4 = dm5.length;
            Uri[] uriArr4 = new Uri[length4];
            int i18 = 0;
            int i19 = 0;
            while (i18 < length4) {
                String str4 = dm5[i18];
                int i20 = i19 + 1;
                if (str4 != null && str4.length() != 0) {
                    uri2 = Uri.parse(str4);
                } else {
                    uri2 = null;
                }
                uriArr4[i19] = uri2;
                i18++;
                i19 = i20;
            }
            this.aT = (Uri[]) agnc.z(null, uriArr4, new Uri[0]);
            fE(93);
        }
        if (wsqVar.db(94)) {
            this.aU = wsqVar.getString(wsqVar.cI(94, wsu.a));
            fE(94);
        }
        if (wsqVar.db(95)) {
            String[] dm6 = wsq.dm(wsqVar.getString(wsqVar.cI(95, wsu.a)));
            int length5 = dm6.length;
            Uri[] uriArr5 = new Uri[length5];
            int i21 = 0;
            int i22 = 0;
            while (i21 < length5) {
                String str5 = dm6[i21];
                int i23 = i22 + 1;
                if (str5 != null && str5.length() != 0) {
                    uri = Uri.parse(str5);
                } else {
                    uri = null;
                }
                uriArr5[i22] = uri;
                i21++;
                i22 = i23;
            }
            this.aV = (Uri[]) agnc.z(null, uriArr5, new Uri[0]);
            fE(95);
        }
        if (wsqVar.db(96)) {
            this.aW = agnc.w(null, wsq.dk(wsqVar.getString(wsqVar.cI(96, wsu.a))));
            fE(96);
        }
        if (wsqVar.db(97)) {
            this.aX = wsqVar.C();
            fE(97);
        }
        if (wsqVar.db(98)) {
            this.aY = wsqVar.H();
            fE(98);
        }
        if (wsqVar.db(99)) {
            this.aZ = wsqVar.n();
            fE(99);
        }
        if (wsqVar.db(100)) {
            this.ba = wsqVar.s();
            fE(100);
        }
        if (wsqVar.db(101)) {
            this.bb = wsqVar.A();
            fE(101);
        }
        if (wsqVar.db(102)) {
            this.bc = wsqVar.z();
            fE(102);
        }
        if (wsqVar.db(103)) {
            this.bd = wsqVar.L();
            fE(103);
        }
        if (wsqVar.db(104)) {
            this.be = wsqVar.D();
            fE(104);
        }
        if (wsqVar.db(105)) {
            this.bf = wsqVar.K();
            fE(105);
        }
        if (wsqVar.db(106)) {
            this.bg = (String[]) agnc.z(null, wsq.dm(wsqVar.getString(wsqVar.cI(106, wsu.a))), new String[0]);
            fE(106);
        }
        if (wsqVar.db(107)) {
            this.bh = wsqVar.F();
            fE(107);
        }
        if (wsqVar.db(108)) {
            this.bi = wsqVar.I();
            fE(108);
        }
        if (wsqVar.db(109)) {
            this.bj = wsqVar.q();
            fE(109);
        }
        if (wsqVar.db(110)) {
            this.bk = wsqVar.M();
            fE(110);
        }
        if (wsqVar.db(111)) {
            this.bl = wsqVar.E();
            fE(111);
        }
        if (wsqVar.db(112)) {
            this.bm = agnc.B(null, wsq.dv(wsqVar.getString(wsqVar.cI(112, wsu.a))));
            fE(112);
        }
        if (wsqVar.db(113)) {
            this.bn = wsqVar.N();
            fE(113);
        }
        if (wsqVar.db(114)) {
            this.bo = agnc.A(null, wsq.dn(wsqVar.getString(wsqVar.cI(114, wsu.a))));
            fE(114);
        }
        if (wsqVar.db(115)) {
            this.bp = wsqVar.x();
            fE(115);
        }
        if (wsqVar.db(116)) {
            this.bq = wsqVar.getLong(wsqVar.cI(116, wsu.a));
            fE(116);
        }
        if (wsqVar.db(117)) {
            this.br = wsqVar.getString(wsqVar.cI(117, wsu.a));
            fE(117);
        }
        if (wsqVar.db(118)) {
            tqj[] values8 = tqj.values();
            int i24 = wsqVar.getInt(wsqVar.cI(118, wsu.a));
            if (i24 < values8.length) {
                this.bs = values8[i24];
                fE(118);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (wsqVar.db(119)) {
            byte[] blob2 = wsqVar.getBlob(wsqVar.cI(119, wsu.a));
            if (blob2 == null) {
                aggpVar = null;
            } else {
                try {
                    aggpVar = (aggp) apag.parseFrom(aggp.a, blob2, aozs.a());
                } catch (Throwable unused2) {
                    aggpVar = aggp.a;
                }
            }
            this.bt = aggpVar;
            fE(119);
        }
        if (wsqVar.db(120)) {
            tqw[] values9 = tqw.values();
            int i25 = wsqVar.getInt(wsqVar.cI(120, wsu.a));
            if (i25 < values9.length) {
                this.bu = values9[i25];
                fE(120);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (wsqVar.db(121)) {
            this.bv = pzm.a(wsqVar.getString(wsqVar.cI(121, wsu.a)));
            fE(121);
        }
        if (wsqVar.db(122)) {
            tqq[] values10 = tqq.values();
            int i26 = wsqVar.getInt(wsqVar.cI(122, wsu.a));
            if (i26 < values10.length) {
                this.bw = values10[i26];
                fE(122);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (wsqVar.db(123)) {
            tqi[] values11 = tqi.values();
            int i27 = wsqVar.getInt(wsqVar.cI(123, wsu.a));
            if (i27 < values11.length) {
                this.bx = values11[i27];
                fE(123);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (wsqVar.db(124)) {
            this.by = agnc.y(null, wsq.dl(wsqVar.getString(wsqVar.cI(124, wsu.a))));
            fE(124);
        }
        if (wsqVar.db(125)) {
            this.c = wsqVar.o();
            fE(125);
        }
        f();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wsn)) {
            return false;
        }
        wsn wsnVar = (wsn) obj;
        if (super.aC(wsnVar.cJ) && Objects.equals(this.e, wsnVar.e) && Objects.equals(this.f, wsnVar.f) && Objects.equals(this.g, wsnVar.g) && Objects.equals(this.h, wsnVar.h) && this.i == wsnVar.i && Objects.equals(this.j, wsnVar.j) && Objects.equals(this.k, wsnVar.k) && Objects.equals(this.l, wsnVar.l) && Objects.equals(this.m, wsnVar.m) && Objects.equals(this.n, wsnVar.n) && Objects.equals(this.o, wsnVar.o) && Objects.equals(this.p, wsnVar.p) && this.q == wsnVar.q && Objects.equals(this.r, wsnVar.r) && this.s == wsnVar.s && this.t == wsnVar.t && this.u == wsnVar.u && this.v == wsnVar.v && this.w == wsnVar.w && this.x == wsnVar.x && Objects.equals(this.y, wsnVar.y) && this.z == wsnVar.z && this.A == wsnVar.A && Objects.equals(this.B, wsnVar.B) && Objects.equals(this.C, wsnVar.C) && Objects.equals(this.D, wsnVar.D) && this.E == wsnVar.E && this.F == wsnVar.F && Objects.equals(this.G, wsnVar.G) && this.H == wsnVar.H && Objects.equals(this.I, wsnVar.I) && Objects.equals(this.J, wsnVar.J) && this.K == wsnVar.K && Objects.equals(this.L, wsnVar.L) && Objects.equals(this.M, wsnVar.M) && this.N == wsnVar.N && this.O == wsnVar.O && this.P == wsnVar.P && this.Q == wsnVar.Q && Objects.equals(this.R, wsnVar.R) && this.S == wsnVar.S && this.T == wsnVar.T && Objects.equals(this.U, wsnVar.U) && Objects.equals(this.V, wsnVar.V) && Objects.equals(this.W, wsnVar.W) && this.X == wsnVar.X && Objects.equals(this.Y, wsnVar.Y) && this.Z == wsnVar.Z && this.aa == wsnVar.aa && Objects.equals(this.ab, wsnVar.ab) && Objects.equals(this.ac, wsnVar.ac) && Arrays.equals(this.ad, wsnVar.ad) && this.ae == wsnVar.ae && Objects.equals(this.af, wsnVar.af) && Objects.equals(this.ag, wsnVar.ag) && Objects.equals(this.ah, wsnVar.ah) && Objects.equals(this.ai, wsnVar.ai) && this.aj == wsnVar.aj && Objects.equals(this.ak, wsnVar.ak) && Objects.equals(this.al, wsnVar.al) && this.am == wsnVar.am && this.an == wsnVar.an && this.ao == wsnVar.ao && this.ap == wsnVar.ap && this.aq == wsnVar.aq && Objects.equals(this.ar, wsnVar.ar) && this.as == wsnVar.as && this.at == wsnVar.at && this.au == wsnVar.au && this.av == wsnVar.av && Objects.equals(this.aw, wsnVar.aw) && this.ax == wsnVar.ax && Objects.equals(this.ay, wsnVar.ay) && Arrays.equals(this.az, wsnVar.az) && Objects.equals(this.aA, wsnVar.aA) && Arrays.equals(this.aB, wsnVar.aB) && Arrays.equals(this.aC, wsnVar.aC) && Arrays.equals(this.aD, wsnVar.aD) && Arrays.equals(this.aE, wsnVar.aE) && Arrays.equals(this.aF, wsnVar.aF) && Arrays.equals(this.aG, wsnVar.aG) && Arrays.equals(this.aH, wsnVar.aH) && this.aI == wsnVar.aI && Objects.equals(this.aJ, wsnVar.aJ) && Arrays.equals(this.aK, wsnVar.aK) && this.aL == wsnVar.aL && Arrays.equals(this.aM, wsnVar.aM) && Objects.equals(this.aN, wsnVar.aN) && Objects.equals(this.aO, wsnVar.aO) && Objects.equals(this.aP, wsnVar.aP) && this.aQ == wsnVar.aQ && this.aR == wsnVar.aR && this.aS == wsnVar.aS && Arrays.equals(this.aT, wsnVar.aT) && Objects.equals(this.aU, wsnVar.aU) && Arrays.equals(this.aV, wsnVar.aV) && Arrays.equals(this.aW, wsnVar.aW) && Arrays.equals(this.aX, wsnVar.aX) && Arrays.equals(this.aY, wsnVar.aY) && Objects.equals(this.aZ, wsnVar.aZ) && Objects.equals(this.ba, wsnVar.ba) && Arrays.equals(this.bb, wsnVar.bb) && Arrays.equals(this.bc, wsnVar.bc) && Arrays.equals(this.bd, wsnVar.bd) && Arrays.equals(this.be, wsnVar.be) && Arrays.equals(this.bf, wsnVar.bf) && Arrays.equals(this.bg, wsnVar.bg) && Arrays.equals(this.bh, wsnVar.bh) && Arrays.equals(this.bi, wsnVar.bi) && Objects.equals(this.bj, wsnVar.bj) && Arrays.equals(this.bk, wsnVar.bk) && Arrays.equals(this.bl, wsnVar.bl) && Arrays.deepEquals(this.bm, wsnVar.bm) && Arrays.deepEquals(this.bn, wsnVar.bn) && Arrays.equals(this.bo, wsnVar.bo) && this.bp == wsnVar.bp && this.bq == wsnVar.bq && Objects.equals(this.br, wsnVar.br) && this.bs == wsnVar.bs && Objects.equals(this.bt, wsnVar.bt) && this.bu == wsnVar.bu && Objects.equals(this.bv, wsnVar.bv) && this.bw == wsnVar.bw && this.bx == wsnVar.bx && Arrays.equals(this.by, wsnVar.by) && Objects.equals(this.c, wsnVar.c)) {
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
        String str = this.e;
        MessageIdType messageIdType = this.f;
        ConversationIdType conversationIdType = this.g;
        Instant instant = this.h;
        wtf wtfVar = this.i;
        if (wtfVar == null) {
            ordinal = 0;
        } else {
            ordinal = wtfVar.ordinal();
        }
        Integer valueOf = Integer.valueOf(ordinal);
        Instant instant2 = this.j;
        MessageIdType messageIdType2 = this.k;
        ConversationIdType conversationIdType2 = this.l;
        String str2 = this.m;
        String str3 = this.n;
        String str4 = this.o;
        String str5 = this.p;
        Long valueOf2 = Long.valueOf(this.q);
        Instant instant3 = this.r;
        Long valueOf3 = Long.valueOf(this.s);
        Integer valueOf4 = Integer.valueOf(this.t);
        Integer valueOf5 = Integer.valueOf(this.u);
        Integer valueOf6 = Integer.valueOf(this.v);
        Boolean valueOf7 = Boolean.valueOf(this.w);
        Boolean valueOf8 = Boolean.valueOf(this.x);
        Uri uri = this.y;
        Integer valueOf9 = Integer.valueOf(this.z);
        Long valueOf10 = Long.valueOf(this.A);
        String str6 = this.B;
        String str7 = this.C;
        String str8 = this.D;
        Long valueOf11 = Long.valueOf(this.E);
        Long valueOf12 = Long.valueOf(this.F);
        String str9 = this.G;
        Integer valueOf13 = Integer.valueOf(this.H);
        String str10 = this.I;
        qwe qweVar = this.J;
        Long valueOf14 = Long.valueOf(this.K);
        String str11 = this.L;
        rve rveVar = this.M;
        Integer valueOf15 = Integer.valueOf(this.N);
        tqr tqrVar = this.O;
        if (tqrVar == null) {
            ordinal2 = 0;
        } else {
            ordinal2 = tqrVar.ordinal();
        }
        Integer valueOf16 = Integer.valueOf(ordinal2);
        Integer valueOf17 = Integer.valueOf(this.P);
        Boolean valueOf18 = Boolean.valueOf(this.Q);
        String str12 = this.R;
        Long valueOf19 = Long.valueOf(this.S);
        Integer valueOf20 = Integer.valueOf(this.T);
        String str13 = this.U;
        String str14 = this.V;
        String str15 = this.W;
        Long valueOf21 = Long.valueOf(this.X);
        String str16 = this.Y;
        Long valueOf22 = Long.valueOf(this.Z);
        Long valueOf23 = Long.valueOf(this.aa);
        rve rveVar2 = this.ab;
        String str17 = this.ac;
        Integer valueOf24 = Integer.valueOf(Arrays.hashCode(this.ad));
        Long valueOf25 = Long.valueOf(this.ae);
        apwq apwqVar = this.af;
        String str18 = this.ag;
        String str19 = this.ah;
        MessageIdType messageIdType3 = this.ai;
        Boolean valueOf26 = Boolean.valueOf(this.aj);
        Uri uri2 = this.ak;
        Optional optional = this.al;
        Integer valueOf27 = Integer.valueOf(this.am);
        xxw xxwVar = this.an;
        if (xxwVar == null) {
            ordinal3 = 0;
        } else {
            ordinal3 = xxwVar.ordinal();
        }
        Integer valueOf28 = Integer.valueOf(ordinal3);
        tqf tqfVar = this.ao;
        if (tqfVar == null) {
            ordinal4 = 0;
        } else {
            ordinal4 = tqfVar.ordinal();
        }
        Integer valueOf29 = Integer.valueOf(ordinal4);
        Integer valueOf30 = Integer.valueOf(this.ap);
        Boolean valueOf31 = Boolean.valueOf(this.aq);
        atok atokVar = this.ar;
        tqp tqpVar = this.as;
        if (tqpVar == null) {
            ordinal5 = 0;
        } else {
            ordinal5 = tqpVar.ordinal();
        }
        Integer valueOf32 = Integer.valueOf(ordinal5);
        tqp tqpVar2 = this.at;
        if (tqpVar2 == null) {
            ordinal6 = 0;
        } else {
            ordinal6 = tqpVar2.ordinal();
        }
        Integer valueOf33 = Integer.valueOf(ordinal6);
        tqu tquVar = this.au;
        if (tquVar == null) {
            ordinal7 = 0;
        } else {
            ordinal7 = tquVar.ordinal();
        }
        Integer valueOf34 = Integer.valueOf(ordinal7);
        Integer valueOf35 = Integer.valueOf(this.av);
        ruz ruzVar = this.aw;
        utk utkVar = this.ax;
        if (utkVar == null) {
            ordinal8 = 0;
        } else {
            ordinal8 = utkVar.ordinal();
        }
        Integer valueOf36 = Integer.valueOf(ordinal8);
        Optional optional2 = this.ay;
        Integer valueOf37 = Integer.valueOf(Arrays.hashCode(this.az));
        MessageIdType messageIdType4 = this.aA;
        Integer valueOf38 = Integer.valueOf(Arrays.hashCode(this.aB));
        Integer valueOf39 = Integer.valueOf(Arrays.hashCode(this.aC));
        Integer valueOf40 = Integer.valueOf(Arrays.hashCode(this.aD));
        Integer valueOf41 = Integer.valueOf(Arrays.hashCode(this.aE));
        Integer valueOf42 = Integer.valueOf(Arrays.hashCode(this.aF));
        Integer valueOf43 = Integer.valueOf(Arrays.hashCode(this.aG));
        Integer valueOf44 = Integer.valueOf(Arrays.hashCode(this.aH));
        Long valueOf45 = Long.valueOf(this.aI);
        Uri uri3 = this.aJ;
        Integer valueOf46 = Integer.valueOf(Arrays.hashCode(this.aK));
        tql tqlVar = this.aL;
        if (tqlVar == null) {
            ordinal9 = 0;
        } else {
            ordinal9 = tqlVar.ordinal();
        }
        Integer valueOf47 = Integer.valueOf(ordinal9);
        Integer valueOf48 = Integer.valueOf(Arrays.hashCode(this.aM));
        ConversationIdType conversationIdType3 = this.aN;
        tqa tqaVar = this.aO;
        tqa tqaVar2 = this.aP;
        Long valueOf49 = Long.valueOf(this.aQ);
        Double valueOf50 = Double.valueOf(this.aR);
        Double valueOf51 = Double.valueOf(this.aS);
        Integer valueOf52 = Integer.valueOf(Arrays.hashCode(this.aT));
        String str20 = this.aU;
        Integer valueOf53 = Integer.valueOf(Arrays.hashCode(this.aV));
        Integer valueOf54 = Integer.valueOf(Arrays.hashCode(this.aW));
        Integer valueOf55 = Integer.valueOf(Arrays.hashCode(this.aX));
        Integer valueOf56 = Integer.valueOf(Arrays.hashCode(this.aY));
        String str21 = this.aZ;
        String str22 = this.ba;
        Integer valueOf57 = Integer.valueOf(Arrays.hashCode(this.bb));
        Integer valueOf58 = Integer.valueOf(Arrays.hashCode(this.bc));
        Integer valueOf59 = Integer.valueOf(Arrays.hashCode(this.bd));
        Integer valueOf60 = Integer.valueOf(Arrays.hashCode(this.be));
        Integer valueOf61 = Integer.valueOf(Arrays.hashCode(this.bf));
        Integer valueOf62 = Integer.valueOf(Arrays.hashCode(this.bg));
        Integer valueOf63 = Integer.valueOf(Arrays.hashCode(this.bh));
        Integer valueOf64 = Integer.valueOf(Arrays.hashCode(this.bi));
        String str23 = this.bj;
        Integer valueOf65 = Integer.valueOf(Arrays.hashCode(this.bk));
        Integer valueOf66 = Integer.valueOf(Arrays.hashCode(this.bl));
        Integer valueOf67 = Integer.valueOf(Arrays.hashCode(this.bm));
        Integer valueOf68 = Integer.valueOf(Arrays.hashCode(this.bn));
        Integer valueOf69 = Integer.valueOf(Arrays.hashCode(this.bo));
        Boolean valueOf70 = Boolean.valueOf(this.bp);
        Long valueOf71 = Long.valueOf(this.bq);
        String str24 = this.br;
        tqj tqjVar = this.bs;
        if (tqjVar == null) {
            ordinal10 = 0;
        } else {
            ordinal10 = tqjVar.ordinal();
        }
        Integer valueOf72 = Integer.valueOf(ordinal10);
        aggp aggpVar = this.bt;
        tqw tqwVar = this.bu;
        if (tqwVar == null) {
            ordinal11 = 0;
        } else {
            ordinal11 = tqwVar.ordinal();
        }
        Integer valueOf73 = Integer.valueOf(ordinal11);
        pyz pyzVar = this.bv;
        tqq tqqVar = this.bw;
        if (tqqVar == null) {
            ordinal12 = 0;
        } else {
            ordinal12 = tqqVar.ordinal();
        }
        Integer valueOf74 = Integer.valueOf(ordinal12);
        tqi tqiVar = this.bx;
        if (tqiVar == null) {
            ordinal13 = 0;
        } else {
            ordinal13 = tqiVar.ordinal();
        }
        return Objects.hash(adayVar, str, messageIdType, conversationIdType, instant, valueOf, instant2, messageIdType2, conversationIdType2, str2, str3, str4, str5, valueOf2, instant3, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, uri, valueOf9, valueOf10, str6, str7, str8, valueOf11, valueOf12, str9, valueOf13, str10, qweVar, valueOf14, str11, rveVar, valueOf15, valueOf16, valueOf17, valueOf18, str12, valueOf19, valueOf20, str13, str14, str15, valueOf21, str16, valueOf22, valueOf23, rveVar2, str17, valueOf24, valueOf25, apwqVar, str18, str19, messageIdType3, valueOf26, uri2, optional, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, atokVar, valueOf32, valueOf33, valueOf34, valueOf35, ruzVar, valueOf36, optional2, valueOf37, messageIdType4, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, uri3, valueOf46, valueOf47, valueOf48, conversationIdType3, tqaVar, tqaVar2, valueOf49, valueOf50, valueOf51, valueOf52, str20, valueOf53, valueOf54, valueOf55, valueOf56, str21, str22, valueOf57, valueOf58, valueOf59, valueOf60, valueOf61, valueOf62, valueOf63, valueOf64, str23, valueOf65, valueOf66, valueOf67, valueOf68, valueOf69, valueOf70, valueOf71, str24, valueOf72, aggpVar, valueOf73, pyzVar, valueOf74, Integer.valueOf(ordinal13), Integer.valueOf(Arrays.hashCode(this.by)), this.c, null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ScheduledMessagesQuery -- REDACTED");
        }
        return a();
    }
}
