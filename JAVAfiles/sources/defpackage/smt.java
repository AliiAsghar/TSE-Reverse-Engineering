package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class smt extends agmb {
    public String A;
    public qwe B;
    public qss C;
    public int D;
    public boolean E;
    public String F;
    public boolean G;
    public boolean H;
    public String I;
    public String J;
    public String K;
    public int L;
    public long M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public long S;
    public String T;
    public String U;
    public boolean V;
    public int W;
    public long X;
    public long Y;
    public String Z;
    public ConversationIdType a;
    public String aa;
    public String ab;
    public byte[] ac;
    public long ad;
    public long ae;
    public boolean af;
    public vtm ag;
    public boolean ah;
    public ConversationIdType ai;
    public ConversationIdType aj;
    public qpd ak;
    public xxw al;
    public String am;
    public Optional an;
    public Optional ao;
    public boolean ap;
    public boolean aq;
    public vst ar;
    public vvh as;
    public int at;
    public utk au;
    public utj av;
    public String aw;
    public xhv b;
    public String c;
    public tqh d;
    public String e;
    public MessageIdType f;
    public String g;
    public String h;
    public Uri i;
    public String j;
    public boolean k;
    public String l;
    public String m;
    public Uri n;
    public String o;
    public int p;
    public tqc q;
    public long r;
    public long s;
    public String t;
    public long u;
    public long v;
    public String w;
    public String x;
    public String y;
    public String z;

    public smt() {
        super(a.bp());
        this.a = ruy.a;
        this.b = new xhv();
        this.d = tqh.NAME_IS_AUTOMATIC;
        this.f = rvc.a;
        this.k = false;
        this.p = 0;
        this.q = tqc.UNARCHIVED;
        this.r = 0L;
        this.s = 0L;
        this.u = -1L;
        this.v = -1L;
        this.B = null;
        this.C = null;
        this.D = 0;
        this.E = true;
        this.G = true;
        this.H = false;
        this.L = 0;
        this.M = -1L;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = false;
        this.R = false;
        this.S = 0L;
        this.V = false;
        this.W = 0;
        this.X = 0L;
        this.Y = 0L;
        this.ad = 0L;
        this.ae = -1L;
        this.af = true;
        this.ag = new vtm(0L);
        this.ah = false;
        ConversationIdType conversationIdType = ruy.a;
        this.ai = conversationIdType;
        this.aj = conversationIdType;
        this.ak = qpd.b(0);
        this.al = xxw.UNKNOWN;
        this.an = uxi.g(-1L);
        this.ao = uxi.g(-1L);
        this.ap = false;
        this.aq = false;
        this.as = vvh.a;
        this.at = 0;
        this.au = utk.a;
        this.av = null;
    }

    public final void A(String str) {
        aC(19);
        this.t = str;
    }

    public final void B(ConversationIdType conversationIdType) {
        aC(0);
        this.a = conversationIdType;
    }

    public final void C(boolean z) {
        aC(33);
        this.H = z;
    }

    public final void D(boolean z) {
        int i = this.az;
        if (i < 10018) {
            agnc.t("IS_ENTERPRISE", i);
        }
        aC(42);
        this.Q = z;
    }

    public final void E(int i) {
        int i2 = this.az;
        if (i2 < 10006) {
            agnc.t("join_state", i2);
        }
        aC(39);
        this.N = i;
    }

    public final void F(long j) {
        int i = this.az;
        if (i < 15000) {
            agnc.t("last_interactive_event_timestamp", i);
        }
        aC(44);
        this.S = j;
    }

    public final void G(long j) {
        int i = this.az;
        if (i < 28010) {
            agnc.t("last_logged_scooby_metadata_timestamp", i);
        }
        aC(49);
        this.X = j;
    }

    public final void H(long j) {
        aC(18);
        this.s = j;
    }

    public final void I(MessageIdType messageIdType) {
        aC(5);
        this.f = messageIdType;
    }

    public final void J(boolean z) {
        int i = this.az;
        if (i < 59220) {
            agnc.t("marked_as_unread", i);
        }
        aC(68);
        this.aq = z;
    }

    public final void K(int i) {
        int i2 = this.az;
        if (i2 < 60050) {
            agnc.t("mms_group_upgrade_retries", i2);
        }
        aC(71);
        this.at = i;
    }

    public final void L(vvh vvhVar) {
        int i = this.az;
        if (i < 60050) {
            agnc.t("mms_group_upgrade_status", i);
        }
        aC(70);
        this.as = vvhVar;
    }

    public final void M(String str) {
        aC(2);
        if (!this.aA) {
            str = ysw.a(str);
        }
        this.c = str;
    }

    public final void N(tqh tqhVar) {
        int i = this.az;
        if (i < 10012) {
            agnc.t("name_is_automatic", i);
        }
        aC(3);
        this.d = tqhVar;
    }

    public final void O(long j) {
        int i = this.az;
        if (i < 58090) {
            agnc.t("normalized_participant_contact_id", i);
        }
        aC(21);
        this.v = j;
    }

    public final void P(String str) {
        int i = this.az;
        if (i < 58090) {
            agnc.t("normalized_participant_display_destination", i);
        }
        aC(46);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.U = str;
    }

    public final void Q(String str) {
        int i = this.az;
        if (i < 58090) {
            agnc.t("normalized_participant_id_list", i);
        }
        aC(36);
        this.K = str;
    }

    public final void R(String str) {
        int i = this.az;
        if (i < 58090) {
            agnc.t("normalized_participant_lookup_key", i);
        }
        aC(23);
        this.x = str;
    }

    public final void S(boolean z) {
        aC(30);
        this.E = z;
    }

    public final void T(String str) {
        aC(31);
        this.F = str;
    }

    public final void U(boolean z) {
        aC(32);
        this.G = z;
    }

    public final void V(int i) {
        int i2 = this.az;
        if (i2 < 26020) {
            agnc.t("open_count", i2);
        }
        aC(48);
        this.W = i;
    }

    public final void W(String str) {
        int i = this.az;
        if (i < 58090) {
            agnc.t("participant_comparable_destination", i);
        }
        aC(25);
        this.z = str;
    }

    public final void X(long j) {
        aC(20);
        this.u = j;
    }

    public final void Y(int i) {
        aC(29);
        this.D = i;
    }

    public final void Z(String str) {
        int i = this.az;
        if (i < 15010) {
            agnc.t("participant_display_destination", i);
        }
        aC(45);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.T = str;
    }

    public final smr a() {
        return b(new sms(0));
    }

    public final void aa(String str) {
        int i = this.az;
        if (i < 8500) {
            agnc.t("participant_id_list", i);
        }
        aC(35);
        this.J = str;
    }

    public final void ab(String str) {
        aC(22);
        this.w = str;
    }

    public final void ac(String str) {
        aC(24);
        this.y = str;
    }

    public final void ad(String str) {
        aC(9);
        this.j = str;
    }

    public final void ae(Uri uri) {
        aC(8);
        this.i = uri;
    }

    public final void af(String str) {
        int i = this.az;
        if (i < 40050) {
            agnc.t("rcs_conference_uri", i);
        }
        aC(53);
        if (!this.aA) {
            str = yzc.h(str);
        }
        this.ab = str;
    }

    public final void ag(vtm vtmVar) {
        int i = this.az;
        if (i < 49020) {
            agnc.t("rcs_group_capabilities", i);
        }
        aC(58);
        this.ag = vtmVar;
    }

    public final void ah(String str) {
        int i = this.az;
        if (i < 40050) {
            agnc.t("rcs_group_id", i);
        }
        aC(52);
        this.aa = str;
    }

    public final void ai(Optional optional) {
        int i = this.az;
        if (i < 58910) {
            agnc.t("rcs_group_last_sync_timestamp", i);
        }
        aC(66);
        this.ao = optional;
    }

    public final void aj(String str) {
        int i = this.az;
        if (i < 58540) {
            agnc.t("rcs_group_self_msisdn", i);
        }
        aC(64);
        this.am = str;
    }

    public final void ak(boolean z) {
        int i = this.az;
        if (i < 48040) {
            agnc.t("rcs_session_allows_revocation", i);
        }
        aC(57);
        this.af = z;
    }

    public final void al(long j) {
        int i = this.az;
        if (i < 10000) {
            agnc.t("rcs_session_id", i);
        }
        aC(38);
        this.M = j;
    }

    public final void am(long j) {
        int i = this.az;
        if (i < 46050) {
            agnc.t("rcs_subject_change_timestamp_ms", i);
        }
        aC(56);
        this.ae = j;
    }

    public final void an(Optional optional) {
        int i = this.az;
        if (i < 58750) {
            agnc.t("recipient_offline_timestamp_ms", i);
        }
        aC(65);
        this.an = optional;
    }

    public final void ao(int i) {
        int i2 = this.az;
        if (i2 < 10016) {
            agnc.t("send_mode", i2);
        }
        aC(41);
        this.P = i;
    }

    public final void ap(boolean z) {
        aC(10);
        this.k = z;
    }

    public final void aq(String str) {
        aC(34);
        this.I = str;
    }

    public final void ar(xhv xhvVar) {
        aC(1);
        this.b = xhvVar;
    }

    public final void as(String str) {
        aC(6);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.g = str;
    }

    public final void at(long j) {
        aC(17);
        this.r = j;
    }

    public final void au(int i) {
        int i2 = this.az;
        if (i2 < 8500) {
            agnc.t("source_type", i2);
        }
        aC(37);
        this.L = i;
    }

    public final void av(boolean z) {
        int i = this.az;
        if (i < 23000) {
            agnc.t("spam_warning_dismiss_status", i);
        }
        aC(47);
        this.V = z;
    }

    public final void aw(String str) {
        aC(7);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.h = str;
    }

    public final void ax(String str) {
        int i = this.az;
        if (i < 59760) {
            agnc.t("subtitle", i);
        }
        aC(4);
        this.e = str;
    }

    public final void ay(byte[] bArr) {
        int i = this.az;
        if (i < 58120) {
            agnc.t("tachygram_group_routing_info_token", i);
        }
        aC(54);
        this.ac = bArr;
    }

    public final smr b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        smr smrVar = (smr) obj;
        smrVar.ar(az());
        smrVar.a = this.a;
        smrVar.b = this.b;
        smrVar.c = this.c;
        smrVar.d = this.d;
        smrVar.e = this.e;
        smrVar.f = this.f;
        smrVar.g = this.g;
        smrVar.h = this.h;
        smrVar.i = this.i;
        smrVar.j = this.j;
        smrVar.k = this.k;
        smrVar.l = this.l;
        smrVar.m = this.m;
        smrVar.n = this.n;
        smrVar.o = this.o;
        smrVar.p = this.p;
        smrVar.q = this.q;
        smrVar.r = this.r;
        smrVar.s = this.s;
        smrVar.t = this.t;
        smrVar.u = this.u;
        smrVar.v = this.v;
        smrVar.w = this.w;
        smrVar.x = this.x;
        smrVar.y = this.y;
        smrVar.z = this.z;
        smrVar.A = this.A;
        smrVar.B = this.B;
        smrVar.C = this.C;
        smrVar.D = this.D;
        smrVar.E = this.E;
        smrVar.F = this.F;
        smrVar.G = this.G;
        smrVar.H = this.H;
        smrVar.I = this.I;
        smrVar.J = this.J;
        smrVar.K = this.K;
        smrVar.L = this.L;
        smrVar.M = this.M;
        smrVar.N = this.N;
        smrVar.O = this.O;
        smrVar.P = this.P;
        smrVar.Q = this.Q;
        smrVar.R = this.R;
        smrVar.S = this.S;
        smrVar.T = this.T;
        smrVar.U = this.U;
        smrVar.V = this.V;
        smrVar.W = this.W;
        smrVar.X = this.X;
        smrVar.Y = this.Y;
        smrVar.Z = this.Z;
        smrVar.aa = this.aa;
        smrVar.ab = this.ab;
        smrVar.ac = this.ac;
        smrVar.ad = this.ad;
        smrVar.ae = this.ae;
        smrVar.af = this.af;
        smrVar.ag = this.ag;
        smrVar.ah = this.ah;
        smrVar.ai = this.ai;
        smrVar.aj = this.aj;
        smrVar.ak = this.ak;
        smrVar.al = this.al;
        smrVar.am = this.am;
        smrVar.an = this.an;
        smrVar.ao = this.ao;
        smrVar.ap = this.ap;
        smrVar.aq = this.aq;
        smrVar.ar = this.ar;
        smrVar.as = this.as;
        smrVar.at = this.at;
        smrVar.au = this.au;
        smrVar.av = this.av;
        smrVar.aw = this.aw;
        smrVar.cF = aA();
        return smrVar;
    }

    public final void c(tqc tqcVar) {
        aC(16);
        this.q = tqcVar;
    }

    public final void d(boolean z) {
        int i = this.az;
        if (i < 49060) {
            agnc.t("awaiting_reverse_sync", i);
        }
        aC(59);
        this.ah = z;
    }

    public final void e(String str) {
        int i = this.az;
        if (i < 60250) {
            agnc.t("cms_correlation_id", i);
        }
        aC(74);
        this.aw = str;
    }

    public final void f(String str) {
        int i = this.az;
        if (i < 32000) {
            agnc.t("cms_id", i);
        }
        aC(51);
        this.Z = str;
    }

    public final void g(xxw xxwVar) {
        int i = this.az;
        if (i < 58210) {
            agnc.t("cms_life_cycle", i);
        }
        aC(63);
        this.al = xxwVar;
    }

    public final void h(long j) {
        int i = this.az;
        if (i < 53030) {
            agnc.t("cms_most_recent_read_message_timestamp_ms", i);
        }
        aC(55);
        this.ad = j;
    }

    public final void i(int i) {
        int i2 = this.az;
        if (i2 < 10007) {
            agnc.t("conv_type", i2);
        }
        aC(40);
        this.O = i;
    }

    public final void j(qwe qweVar) {
        int i = this.az;
        if (i < 60160) {
            agnc.t("current_my_identity_foreign_key", i);
        }
        aC(27);
        this.B = qweVar;
    }

    public final void k(String str) {
        aC(26);
        this.A = str;
    }

    public final void l(vst vstVar) {
        int i = this.az;
        if (i < 59820) {
            agnc.t("custom_theme", i);
        }
        aC(69);
        this.ar = vstVar;
    }

    public final void m(long j) {
        int i = this.az;
        if (i < 29020) {
            agnc.t("delete_timestamp", i);
        }
        aC(50);
        this.Y = j;
    }

    public final void n(ConversationIdType conversationIdType) {
        int i = this.az;
        if (i < 58090) {
            agnc.t("duplicate_of", i);
        }
        aC(60);
        this.ai = conversationIdType;
    }

    public final void o(qss qssVar) {
        int i = this.az;
        if (i < 60360) {
            agnc.t("destination_token", i);
        }
        aC(28);
        this.C = qssVar;
    }

    public final void p(int i) {
        int i2 = this.az;
        if (i2 < 29060) {
            agnc.t("etouffee_default", i2);
        }
        aC(15);
        this.p = i;
    }

    public final void q(String str) {
        aC(14);
        this.o = str;
    }

    public final void r(Uri uri) {
        aC(13);
        this.n = uri;
    }

    public final void s(String str) {
        aC(11);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.l = str;
    }

    public final void t(String str) {
        aC(12);
        if (!this.aA) {
            str = yta.a(str);
        }
        this.m = str;
    }

    public final void u(ConversationIdType conversationIdType) {
        int i = this.az;
        if (i < 59130) {
            agnc.t("new_duplicate_of", i);
        }
        aC(61);
        this.aj = conversationIdType;
    }

    public final void v(utj utjVar) {
        int i = this.az;
        if (i < 60210) {
            agnc.t("encryption_id", i);
        }
        aC(73);
        this.av = utjVar;
    }

    public final void w(utk utkVar) {
        int i = this.az;
        if (i < 60180) {
            agnc.t("encryption_protocol", i);
        }
        aC(72);
        this.au = utkVar;
    }

    public final void x(qpd qpdVar) {
        int i = this.az;
        if (i < 58140) {
            agnc.t("error_state", i);
        }
        aC(62);
        this.ak = qpdVar;
    }

    public final void y(boolean z) {
        int i = this.az;
        if (i < 59210) {
            agnc.t("has_been_e2ee", i);
        }
        aC(67);
        this.ap = z;
    }

    public final void z(boolean z) {
        int i = this.az;
        if (i < 12001) {
            agnc.t("has_ea2p_bot_recipient", i);
        }
        aC(43);
        this.R = z;
    }
}
