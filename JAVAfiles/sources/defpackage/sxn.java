package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.time.Instant;
import j$.util.Optional;
import java.util.BitSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sxn extends agmb {
    public long A;
    public String B;
    public rve C;
    public int D;
    public tqr E;
    public int F;
    public boolean G;
    public String H;
    public long I;
    public int J;
    public String K;
    public String L;
    public String M;
    public long N;
    public String O;
    public long P;
    public long Q;
    public rve R;
    public String S;
    public byte[] T;
    public long U;
    public apwq V;
    public String W;
    public String X;
    public MessageIdType Y;
    public boolean Z;
    public MessageIdType a;
    public Uri aa;
    public Optional ab;
    public int ac;
    public xxw ad;
    public tqf ae;
    public int af;
    public boolean ag;
    public atok ah;
    public tqp ai;
    public tqp aj;
    public tqu ak;
    public int al;
    public ruz am;
    public utk an;
    public Optional ao;
    public ConversationIdType b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public Instant h;
    public long i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public Uri o;
    public int p;
    public long q;
    public String r;
    public String s;
    public String t;
    public long u;
    public long v;
    public String w;
    public int x;
    public String y;
    public qwe z;

    public sxn() {
        super(a.bp());
        this.a = rvc.a;
        this.b = ruy.a;
        this.g = 0L;
        this.h = uzz.l(0L);
        this.i = 0L;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.p = 0;
        this.q = 0L;
        this.u = 0L;
        this.v = 0L;
        this.x = 0;
        this.z = null;
        this.A = 0L;
        this.C = rve.a;
        this.D = 0;
        this.E = tqr.VERIFICATION_NA;
        this.F = 0;
        this.G = false;
        this.I = -1L;
        this.J = -1;
        this.O = "";
        this.P = 0L;
        this.Q = 1L;
        this.R = rve.a;
        this.U = 0L;
        this.Y = rvc.a;
        this.Z = false;
        this.ab = rvg.a;
        this.ac = -2;
        this.ad = xxw.UNKNOWN;
        this.ae = tqf.UNKNOWN;
        this.af = 0;
        this.ag = false;
        tqp tqpVar = tqp.UNKNOWN;
        this.ai = tqpVar;
        this.aj = tqpVar;
        this.ak = tqu.UNKNOWN;
        this.al = -1;
        this.am = ruz.a;
        this.an = utk.a;
        this.ao = uzz.j();
    }

    public final void A(long j) {
        aC(20);
        this.u = j;
    }

    public final void B(String str) {
        int i = this.az;
        if (i < 9030) {
            agnc.t("mms_retrieve_text", i);
        }
        aC(22);
        this.w = str;
    }

    public final void C(String str) {
        aC(17);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.r = str;
    }

    public final void D(String str) {
        aC(18);
        this.s = str;
    }

    public final void E(String str) {
        int i = this.az;
        if (i < 59340) {
            agnc.t("msisdn_receiving_rcs_message", i);
        }
        aC(4);
        this.e = str;
    }

    public final void F(qwe qweVar) {
        int i = this.az;
        if (i < 60160) {
            agnc.t("my_identity_foreign_key", i);
        }
        aC(25);
        this.z = qweVar;
    }

    public final void G(boolean z) {
        aC(12);
        this.m = z;
    }

    public final void H(Uri uri) {
        int i = this.az;
        if (i < 49060) {
            agnc.t("old_sms_message_uri", i);
        }
        aC(52);
        this.aa = uri;
    }

    public final void I(MessageIdType messageIdType) {
        int i = this.az;
        if (i < 48030) {
            agnc.t("original_message_id", i);
        }
        aC(50);
        this.Y = messageIdType;
    }

    public final void J(int i) {
        int i2 = this.az;
        if (i2 < 59430) {
            agnc.t("message_original_protocol", i2);
        }
        aC(63);
        this.al = i;
    }

    public final void K(rve rveVar) {
        int i = this.az;
        if (i < 35030) {
            agnc.t("original_rcs_message_id", i);
        }
        aC(43);
        this.R = rveVar;
    }

    public final void L(tqp tqpVar) {
        int i = this.az;
        if (i < 58720) {
            agnc.t("outgoing_delivery_report_status", i);
        }
        aC(60);
        this.ai = tqpVar;
    }

    public final void M(tqp tqpVar) {
        int i = this.az;
        if (i < 58720) {
            agnc.t("outgoing_read_report_status", i);
        }
        aC(61);
        this.aj = tqpVar;
    }

    public final void N(int i) {
        aC(9);
        this.j = i;
    }

    public final void O(Instant instant) {
        int i = this.az;
        if (i < 17030) {
            agnc.t("queue_insert_timestamp", i);
        }
        aC(7);
        this.h = instant;
    }

    public final void P(int i) {
        aC(23);
        this.x = i;
    }

    public final void Q(int i) {
        int i2 = this.az;
        if (i2 < 29060) {
            agnc.t("etouffee_status", i2);
        }
        aC(29);
        this.D = i;
    }

    public final void R(long j) {
        int i = this.az;
        if (i < 59890) {
            agnc.t("rcs_expiry", i);
        }
        aC(21);
        this.v = j;
    }

    public final void S(long j) {
        int i = this.az;
        if (i < 10004) {
            agnc.t("rcs_file_transfer_session_id", i);
        }
        aC(34);
        this.I = j;
    }

    public final void T(rve rveVar) {
        int i = this.az;
        if (i < 41040) {
            agnc.t("rcs_message_id_with_text_type", i);
        }
        aC(28);
        this.C = rveVar;
    }

    public final void U(String str) {
        int i = this.az;
        if (i < 10002) {
            agnc.t("rcs_remote_instance", i);
        }
        aC(33);
        this.H = str;
    }

    public final void V(int i) {
        int i2 = this.az;
        if (i2 < 39000) {
            agnc.t("rcs_ui_status", i2);
        }
        aC(31);
        this.F = i;
    }

    public final void W(boolean z) {
        aC(13);
        this.n = z;
    }

    public final void X(long j) {
        aC(8);
        this.i = j;
    }

    public final void Y(String str) {
        int i = this.az;
        if (i < 54040) {
            agnc.t("receiving_network_country", i);
        }
        aC(5);
        this.f = str;
    }

    public final void Z(long j) {
        int i = this.az;
        if (i < 37030) {
            agnc.t("report_attempt_acounter", i);
        }
        aC(46);
        this.U = j;
    }

    public final MessagesTable.BindData a() {
        return b(new swm(14));
    }

    public final void aa(int i) {
        int i2 = this.az;
        if (i2 < 58040) {
            agnc.t("result_code", i2);
        }
        aC(54);
        this.ac = i;
    }

    public final void ab(long j) {
        aC(26);
        this.A = j;
    }

    public final void ac(ruz ruzVar) {
        int i = this.az;
        if (i < 59490) {
            agnc.t("satellite_datagram_id", i);
        }
        aC(64);
        this.am = ruzVar;
    }

    public final void ad(String str) {
        aC(24);
        this.y = str;
    }

    public final void ae(long j) {
        int i = this.az;
        if (i < 35030) {
            agnc.t("send_counter", i);
        }
        aC(42);
        this.Q = j;
    }

    public final void af(String str) {
        aC(2);
        this.c = str;
    }

    public final void ag(String str) {
        int i = this.az;
        if (i < 54040) {
            agnc.t("sender_send_destination", i);
        }
        aC(3);
        this.d = str;
    }

    public final void ah(long j) {
        aC(6);
        this.g = j;
    }

    public final void ai(int i) {
        int i2 = this.az;
        if (i2 < 9000) {
            agnc.t("sms_error_code", i2);
        }
        aC(35);
        this.J = i;
    }

    public final void aj(String str) {
        int i = this.az;
        if (i < 9000) {
            agnc.t("sms_error_desc_map_name", i);
        }
        aC(36);
        this.K = str;
    }

    public final void ak(long j) {
        aC(16);
        this.q = j;
    }

    public final void al(Uri uri) {
        aC(14);
        this.o = uri;
    }

    public final void am(int i) {
        aC(15);
        this.p = i;
    }

    public final void an(int i) {
        aC(10);
        this.k = i;
    }

    public final void ao(atok atokVar) {
        int i = this.az;
        if (i < 58680) {
            agnc.t("trace_id", i);
        }
        aC(59);
        this.ah = atokVar;
    }

    public final void ap(long j) {
        int i = this.az;
        if (i < 29100) {
            agnc.t("usage_stats_logging_id", i);
        }
        aC(41);
        this.P = j;
    }

    public final void aq(tqr tqrVar) {
        int i = this.az;
        if (i < 29090) {
            agnc.t(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, i);
        }
        aC(30);
        this.E = tqrVar;
    }

    public final void ar(String str) {
        int i = this.az;
        if (i < 19020) {
            agnc.t("web_id", i);
        }
        aC(40);
        this.O = str;
    }

    public final void as(tqu tquVar) {
        int i = this.az;
        if (i < 59310) {
            agnc.t("xms_transport", i);
        }
        aC(62);
        this.ak = tquVar;
    }

    public final MessagesTable.BindData b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        MessagesTable.BindData bindData = (MessagesTable.BindData) obj;
        bindData.ar(az());
        bindData.a = this.a;
        bindData.b = this.b;
        bindData.c = this.c;
        bindData.d = this.d;
        bindData.e = this.e;
        bindData.f = this.f;
        bindData.g = this.g;
        bindData.h = this.h;
        bindData.i = this.i;
        bindData.j = this.j;
        bindData.k = this.k;
        bindData.l = this.l;
        bindData.m = this.m;
        bindData.n = this.n;
        bindData.o = this.o;
        bindData.p = this.p;
        bindData.q = this.q;
        bindData.r = this.r;
        bindData.s = this.s;
        bindData.t = this.t;
        bindData.u = this.u;
        bindData.v = this.v;
        bindData.w = this.w;
        bindData.x = this.x;
        bindData.y = this.y;
        bindData.z = this.z;
        bindData.A = this.A;
        bindData.B = this.B;
        bindData.C = this.C;
        bindData.D = this.D;
        bindData.E = this.E;
        bindData.F = this.F;
        bindData.G = this.G;
        bindData.H = this.H;
        bindData.I = this.I;
        bindData.J = this.J;
        bindData.K = this.K;
        bindData.L = this.L;
        bindData.M = this.M;
        bindData.N = this.N;
        bindData.O = this.O;
        bindData.P = this.P;
        bindData.Q = this.Q;
        bindData.R = this.R;
        bindData.S = this.S;
        bindData.T = this.T;
        bindData.U = this.U;
        bindData.V = this.V;
        bindData.W = this.W;
        bindData.X = this.X;
        bindData.Y = this.Y;
        bindData.Z = this.Z;
        bindData.aa = this.aa;
        bindData.ab = this.ab;
        bindData.ac = this.ac;
        bindData.ad = this.ad;
        bindData.ae = this.ae;
        bindData.af = this.af;
        bindData.ag = this.ag;
        bindData.ah = this.ah;
        bindData.ai = this.ai;
        bindData.aj = this.aj;
        bindData.ak = this.ak;
        bindData.al = this.al;
        bindData.am = this.am;
        bindData.an = this.an;
        bindData.ao = this.ao;
        bindData.cF = aA();
        return bindData;
    }

    public final MessagesTable.BindData c() {
        MessagesTable.BindData b = b(new swm(15));
        b.B();
        return b;
    }

    public final void d(MessagesTable.BindData bindData, boolean z, BitSet bitSet) {
        BitSet bitSet2;
        if (bitSet == null) {
            bitSet2 = null;
        } else {
            bitSet2 = (BitSet) bitSet.clone();
        }
        this.ax = bitSet2;
        if (z) {
            BitSet bitSet3 = this.ax;
            if (bitSet3 != null) {
                bitSet3.clear(0);
            }
        } else {
            BitSet bitSet4 = this.ax;
            if (bitSet4 == null || bitSet4.get(0)) {
                this.a = bindData.A();
            }
        }
        BitSet bitSet5 = this.ax;
        if (bitSet5 == null || bitSet5.get(1)) {
            this.b = bindData.z();
        }
        BitSet bitSet6 = this.ax;
        if (bitSet6 == null || bitSet6.get(2)) {
            this.c = bindData.P();
        }
        BitSet bitSet7 = this.ax;
        if (bitSet7 == null || bitSet7.get(3)) {
            bindData.ao(3, "sender_send_destination");
            this.d = bindData.d;
        }
        BitSet bitSet8 = this.ax;
        if (bitSet8 == null || bitSet8.get(4)) {
            bindData.ao(4, "msisdn_receiving_rcs_message");
            this.e = bindData.e;
        }
        BitSet bitSet9 = this.ax;
        if (bitSet9 == null || bitSet9.get(5)) {
            bindData.ao(5, "receiving_network_country");
            this.f = bindData.f;
        }
        BitSet bitSet10 = this.ax;
        if (bitSet10 == null || bitSet10.get(6)) {
            this.g = bindData.v();
        }
        BitSet bitSet11 = this.ax;
        if (bitSet11 == null || bitSet11.get(7)) {
            bindData.ao(7, "queue_insert_timestamp");
            this.h = bindData.h;
        }
        BitSet bitSet12 = this.ax;
        if (bitSet12 == null || bitSet12.get(8)) {
            this.i = bindData.t();
        }
        BitSet bitSet13 = this.ax;
        if (bitSet13 == null || bitSet13.get(9)) {
            this.j = bindData.k();
        }
        BitSet bitSet14 = this.ax;
        if (bitSet14 == null || bitSet14.get(10)) {
            this.k = bindData.q();
        }
        BitSet bitSet15 = this.ax;
        if (bitSet15 == null || bitSet15.get(11)) {
            this.l = bindData.h();
        }
        BitSet bitSet16 = this.ax;
        if (bitSet16 == null || bitSet16.get(12)) {
            bindData.ao(12, "seen");
            this.m = bindData.m;
        }
        BitSet bitSet17 = this.ax;
        if (bitSet17 == null || bitSet17.get(13)) {
            this.n = bindData.U();
        }
        BitSet bitSet18 = this.ax;
        if (bitSet18 == null || bitSet18.get(14)) {
            this.o = bindData.y();
        }
        BitSet bitSet19 = this.ax;
        if (bitSet19 == null || bitSet19.get(15)) {
            this.p = bindData.p();
        }
        BitSet bitSet20 = this.ax;
        if (bitSet20 == null || bitSet20.get(16)) {
            this.q = bindData.w();
        }
        BitSet bitSet21 = this.ax;
        if (bitSet21 == null || bitSet21.get(17)) {
            this.r = bindData.N();
        }
        BitSet bitSet22 = this.ax;
        if (bitSet22 == null || bitSet22.get(18)) {
            bindData.ao(18, "mms_transaction_id");
            this.s = bindData.s;
        }
        BitSet bitSet23 = this.ax;
        if (bitSet23 == null || bitSet23.get(19)) {
            bindData.ao(19, "mms_content_location");
            this.t = bindData.t;
        }
        BitSet bitSet24 = this.ax;
        if (bitSet24 == null || bitSet24.get(20)) {
            this.u = bindData.r();
        }
        BitSet bitSet25 = this.ax;
        if (bitSet25 == null || bitSet25.get(21)) {
            bindData.ao(21, "rcs_expiry");
            this.v = bindData.v;
        }
        BitSet bitSet26 = this.ax;
        if (bitSet26 == null || bitSet26.get(22)) {
            this.w = bindData.M();
        }
        BitSet bitSet27 = this.ax;
        if (bitSet27 == null || bitSet27.get(23)) {
            this.x = bindData.l();
        }
        BitSet bitSet28 = this.ax;
        if (bitSet28 == null || bitSet28.get(24)) {
            this.y = bindData.O();
        }
        BitSet bitSet29 = this.ax;
        if (bitSet29 == null || bitSet29.get(25)) {
            bindData.ao(25, "my_identity_foreign_key");
            this.z = bindData.z;
        }
        BitSet bitSet30 = this.ax;
        if (bitSet30 == null || bitSet30.get(26)) {
            this.A = bindData.u();
        }
        BitSet bitSet31 = this.ax;
        if (bitSet31 == null || bitSet31.get(27)) {
            bindData.ao(27, "cloud_sync_id");
            this.B = bindData.B;
        }
        BitSet bitSet32 = this.ax;
        if (bitSet32 == null || bitSet32.get(28)) {
            this.C = bindData.D();
        }
        BitSet bitSet33 = this.ax;
        if (bitSet33 == null || bitSet33.get(29)) {
            this.D = bindData.m();
        }
        BitSet bitSet34 = this.ax;
        if (bitSet34 == null || bitSet34.get(30)) {
            this.E = bindData.H();
        }
        BitSet bitSet35 = this.ax;
        if (bitSet35 == null || bitSet35.get(31)) {
            bindData.ao(31, "rcs_ui_status");
            this.F = bindData.F;
        }
        BitSet bitSet36 = this.ax;
        if (bitSet36 == null || bitSet36.get(32)) {
            this.G = bindData.T();
        }
        BitSet bitSet37 = this.ax;
        if (bitSet37 == null || bitSet37.get(33)) {
            bindData.ao(33, "rcs_remote_instance");
            this.H = bindData.H;
        }
        BitSet bitSet38 = this.ax;
        if (bitSet38 == null || bitSet38.get(34)) {
            this.I = bindData.s();
        }
        BitSet bitSet39 = this.ax;
        if (bitSet39 == null || bitSet39.get(35)) {
            this.J = bindData.o();
        }
        BitSet bitSet40 = this.ax;
        if (bitSet40 == null || bitSet40.get(36)) {
            this.K = bindData.Q();
        }
        BitSet bitSet41 = this.ax;
        if (bitSet41 == null || bitSet41.get(37)) {
            bindData.ao(37, "correlation_id");
            this.L = bindData.L;
        }
        BitSet bitSet42 = this.ax;
        if (bitSet42 == null || bitSet42.get(38)) {
            this.M = bindData.L();
        }
        BitSet bitSet43 = this.ax;
        if (bitSet43 == null || bitSet43.get(39)) {
            bindData.ao(39, "cms_last_mod_seq");
            this.N = bindData.N;
        }
        BitSet bitSet44 = this.ax;
        if (bitSet44 == null || bitSet44.get(40)) {
            this.O = bindData.R();
        }
        BitSet bitSet45 = this.ax;
        if (bitSet45 == null || bitSet45.get(41)) {
            this.P = bindData.x();
        }
        BitSet bitSet46 = this.ax;
        if (bitSet46 == null || bitSet46.get(42)) {
            bindData.ao(42, "send_counter");
            this.Q = bindData.Q;
        }
        BitSet bitSet47 = this.ax;
        if (bitSet47 == null || bitSet47.get(43)) {
            this.R = bindData.C();
        }
        BitSet bitSet48 = this.ax;
        if (bitSet48 == null || bitSet48.get(44)) {
            bindData.ao(44, "custom_delivery_receipt_mime_type");
            this.S = bindData.S;
        }
        BitSet bitSet49 = this.ax;
        if (bitSet49 == null || bitSet49.get(45)) {
            bindData.ao(45, "custom_delivery_receipt_content");
            this.T = bindData.T;
        }
        BitSet bitSet50 = this.ax;
        if (bitSet50 == null || bitSet50.get(46)) {
            bindData.ao(46, "report_attempt_acounter");
            this.U = bindData.U;
        }
        BitSet bitSet51 = this.ax;
        if (bitSet51 == null || bitSet51.get(47)) {
            this.V = bindData.K();
        }
        BitSet bitSet52 = this.ax;
        if (bitSet52 == null || bitSet52.get(48)) {
            bindData.ao(48, "cms_correlation_id");
            this.W = bindData.W;
        }
        BitSet bitSet53 = this.ax;
        if (bitSet53 == null || bitSet53.get(49)) {
            bindData.ao(49, "group_private_participant");
            this.X = bindData.X;
        }
        BitSet bitSet54 = this.ax;
        if (bitSet54 == null || bitSet54.get(50)) {
            bindData.ao(50, "original_message_id");
            this.Y = bindData.Y;
        }
        BitSet bitSet55 = this.ax;
        if (bitSet55 == null || bitSet55.get(51)) {
            bindData.ao(51, "awaiting_reverse_sync");
            this.Z = bindData.Z;
        }
        BitSet bitSet56 = this.ax;
        if (bitSet56 == null || bitSet56.get(52)) {
            bindData.ao(52, "old_sms_message_uri");
            this.aa = bindData.aa;
        }
        BitSet bitSet57 = this.ax;
        if (bitSet57 == null || bitSet57.get(53)) {
            bindData.ao(53, "draft_id");
            this.ab = bindData.ab;
        }
        BitSet bitSet58 = this.ax;
        if (bitSet58 == null || bitSet58.get(54)) {
            this.ac = bindData.n();
        }
        BitSet bitSet59 = this.ax;
        if (bitSet59 == null || bitSet59.get(55)) {
            this.ad = bindData.J();
        }
        BitSet bitSet60 = this.ax;
        if (bitSet60 == null || bitSet60.get(56)) {
            this.ae = bindData.G();
        }
        BitSet bitSet61 = this.ax;
        if (bitSet61 == null || bitSet61.get(57)) {
            bindData.ao(57, "auto_retry_counter");
            this.af = bindData.af;
        }
        BitSet bitSet62 = this.ax;
        if (bitSet62 == null || bitSet62.get(58)) {
            bindData.ao(58, "can_revoke_before_delivered_with_rcs");
            this.ag = bindData.ag;
        }
        BitSet bitSet63 = this.ax;
        if (bitSet63 == null || bitSet63.get(59)) {
            this.ah = bindData.S();
        }
        BitSet bitSet64 = this.ax;
        if (bitSet64 == null || bitSet64.get(60)) {
            bindData.ao(60, "outgoing_delivery_report_status");
            this.ai = bindData.ai;
        }
        BitSet bitSet65 = this.ax;
        if (bitSet65 == null || bitSet65.get(61)) {
            bindData.ao(61, "outgoing_read_report_status");
            this.aj = bindData.aj;
        }
        BitSet bitSet66 = this.ax;
        if (bitSet66 == null || bitSet66.get(62)) {
            this.ak = bindData.I();
        }
        BitSet bitSet67 = this.ax;
        if (bitSet67 == null || bitSet67.get(63)) {
            bindData.ao(63, "message_original_protocol");
            this.al = bindData.al;
        }
        BitSet bitSet68 = this.ax;
        if (bitSet68 == null || bitSet68.get(64)) {
            bindData.ao(64, "satellite_datagram_id");
            this.am = bindData.am;
        }
        BitSet bitSet69 = this.ax;
        if (bitSet69 == null || bitSet69.get(65)) {
            bindData.ao(65, "encryption_protocol");
            this.an = bindData.an;
        }
        BitSet bitSet70 = this.ax;
        if (bitSet70 != null && !bitSet70.get(66)) {
            return;
        }
        bindData.ao(66, "message_persistence_id");
        this.ao = bindData.ao;
    }

    public final void e(int i) {
        int i2 = this.az;
        if (i2 < 58230) {
            agnc.t("auto_retry_counter", i2);
        }
        aC(57);
        this.af = i;
    }

    public final void f(boolean z) {
        int i = this.az;
        if (i < 49060) {
            agnc.t("awaiting_reverse_sync", i);
        }
        aC(51);
        this.Z = z;
    }

    public final void g(boolean z) {
        int i = this.az;
        if (i < 58280) {
            agnc.t("can_revoke_before_delivered_with_rcs", i);
        }
        aC(58);
        this.ag = z;
    }

    public final void h(String str) {
        int i = this.az;
        if (i < 8500) {
            agnc.t("cloud_sync_id", i);
        }
        aC(27);
        this.B = str;
    }

    public final void i(String str) {
        int i = this.az;
        if (i < 46010) {
            agnc.t("cms_correlation_id", i);
        }
        aC(48);
        this.W = str;
    }

    public final void j(String str) {
        int i = this.az;
        if (i < 31010) {
            agnc.t("cms_id", i);
        }
        aC(38);
        this.M = str;
    }

    public final void k(long j) {
        int i = this.az;
        if (i < 37040) {
            agnc.t("cms_last_mod_seq", i);
        }
        aC(39);
        this.N = j;
    }

    public final void l(xxw xxwVar) {
        int i = this.az;
        if (i < 58210) {
            agnc.t("cms_life_cycle", i);
        }
        aC(55);
        this.ad = xxwVar;
    }

    public final void m(ConversationIdType conversationIdType) {
        aC(1);
        this.b = conversationIdType;
    }

    public final void n(String str) {
        int i = this.az;
        if (i < 9010) {
            agnc.t("correlation_id", i);
        }
        aC(37);
        this.L = str;
    }

    public final void o(byte[] bArr) {
        int i = this.az;
        if (i < 37020) {
            agnc.t("custom_delivery_receipt_content", i);
        }
        aC(45);
        this.T = bArr;
    }

    public final void p(String str) {
        int i = this.az;
        if (i < 37020) {
            agnc.t("custom_delivery_receipt_mime_type", i);
        }
        aC(44);
        this.S = str;
    }

    public final void q(apwq apwqVar) {
        int i = this.az;
        if (i < 45020) {
            agnc.t("custom_headers", i);
        }
        aC(47);
        this.V = apwqVar;
    }

    public final void r(Optional optional) {
        int i = this.az;
        if (i < 56000) {
            agnc.t("draft_id", i);
        }
        aC(53);
        this.ab = optional;
    }

    public final void s(utk utkVar) {
        int i = this.az;
        if (i < 60190) {
            agnc.t("encryption_protocol", i);
        }
        aC(65);
        this.an = utkVar;
    }

    public final void t(tqf tqfVar) {
        int i = this.az;
        if (i < 58710) {
            agnc.t("fallback_reason", i);
        }
        aC(56);
        this.ae = tqfVar;
    }

    public final void u(String str) {
        int i = this.az;
        if (i < 48030) {
            agnc.t("group_private_participant", i);
        }
        aC(49);
        this.X = str;
    }

    public final void v(MessageIdType messageIdType) {
        aC(0);
        this.a = messageIdType;
    }

    public final void w(boolean z) {
        int i = this.az;
        if (i < 30010) {
            agnc.t("is_hidden", i);
        }
        aC(32);
        this.G = z;
    }

    public final void x(Optional optional) {
        int i = this.az;
        if (i < 60370) {
            agnc.t("message_persistence_id", i);
        }
        aC(66);
        this.ao = optional;
    }

    public final void y(int i) {
        int i2 = this.az;
        if (i2 < 13020) {
            agnc.t("message_report_status", i2);
        }
        aC(11);
        this.l = i;
    }

    public final void z(String str) {
        aC(19);
        this.t = str;
    }
}
