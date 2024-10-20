package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sac extends aglz<saf, sag, sah, sac, sae> {
    public String I;
    public String K;
    public String L;
    public String M;
    public String ac;
    public String ae;
    public String af;
    public String ag;
    public long ai;
    public String aj;
    public String ak;
    public String al;
    public String am;
    public Uri an;
    public String ao;
    public String aq;
    public aqby at;
    public long au;
    public String c;
    public String e;
    public String f;
    public Uri g;
    public String h;
    public String j;
    public String k;
    public Uri l;
    public String m;
    public String q;
    public String s;
    public String t;
    public String u;
    public String y;
    public ConversationIdType a = ruy.a;
    public xhv b = new xhv();
    public tqh d = tqh.NAME_IS_AUTOMATIC;
    public boolean i = false;
    public int n = 0;
    public tqc o = tqc.UNARCHIVED;
    public long p = 0;
    public long r = -1;
    public qwe v = null;
    public int w = 0;
    public boolean x = true;
    public boolean z = true;
    public boolean A = false;
    public int B = 0;
    public long C = -1;
    public int D = 0;
    public int E = 0;
    public int F = 0;
    public boolean G = false;
    public boolean H = false;
    public long J = 0;
    public boolean N = true;
    public boolean O = false;
    public qpd P = qpd.b(0);
    public Optional Q = uxi.g(-1);
    public boolean R = false;
    public boolean S = false;
    public MessageIdType T = rvc.a;
    public long U = 0;
    public long V = 0;
    public int W = 0;
    public int X = 0;
    public boolean Y = false;
    public int Z = 0;
    public int aa = 0;
    public int ab = -1;
    public int ad = -2;
    public long ah = -1;
    public nht ap = nht.VMT_STATUS_UNKNOWN;
    public long ar = 0;
    public int as = 0;
    public ConversationIdType av = ruy.a;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ConversationListFromConversationToParticipantsQuery [conversations.conversations__id: %s,\n  conversations.conversations_sms_thread_id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_name_is_automatic: %s,\n  conversations.conversations_snippet_text: %s,\n  conversations.conversations_subject_text: %s,\n  conversations.conversations_preview_uri: %s,\n  conversations.conversations_preview_content_type: %s,\n  conversations.conversations_show_draft: %s,\n  conversations.conversations_draft_snippet_text: %s,\n  conversations.conversations_draft_subject_text: %s,\n  conversations.conversations_draft_preview_uri: %s,\n  conversations.conversations_draft_preview_content_type: %s,\n  conversations.conversations_etouffee_default: %s,\n  conversations.conversations_archive_status: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_icon: %s,\n  conversations.conversations_participant_contact_id: %s,\n  conversations.conversations_participant_lookup_key: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_current_self_id: %s,\n  conversations.conversations_current_my_identity_foreign_key: %s,\n  conversations.conversations_participant_count: %s,\n  conversations.conversations_notification_enabled: %s,\n  conversations.conversations_notification_sound_uri: %s,\n  conversations.conversations_notification_vibration: %s,\n  conversations.conversations_include_email_addr: %s,\n  conversations.conversations_source_type: %s,\n  conversations.conversations_rcs_session_id: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_send_mode: %s,\n  conversations.conversations_IS_ENTERPRISE: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_participant_display_destination: %s,\n  conversations.conversations_delete_timestamp: %s,\n  conversations.conversations_cms_id: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_conference_uri: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_awaiting_reverse_sync: %s,\n  conversations.conversations_error_state: %s,\n  conversations.conversations_rcs_group_last_sync_timestamp: %s,\n  conversations.conversations_has_been_e2ee: %s,\n  conversations.conversations_marked_as_unread: %s,\n  messages.messages__id: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  participants.participants_directory_id: %s,\n  conversation_to_participants.conversation_to_participants_participant_id: %s,\n  one_on_one_participant.one_on_one_participant_full_name: %s,\n  one_on_one_participant.one_on_one_participant_first_name: %s,\n  profiles_table.profiles_table_display_name: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  vmt.vmt_vmt_status: %s,\n  vmt.vmt_text: %s,\n  reminders.reminders_trigger_time: %s,\n  messages_annotations.messages_annotations_annotation_type: %s,\n  messages_annotations.messages_annotations_annotation_details: %s,\n  message_star.message_star__id: %s,\n  parent_disallowed_conversations.parent_disallowed_conversations_conversation_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.w), String.valueOf(this.x), String.valueOf(this.y), String.valueOf(this.z), String.valueOf(this.A), String.valueOf(this.B), String.valueOf(this.C), String.valueOf(this.D), String.valueOf(this.E), String.valueOf(this.F), String.valueOf(this.G), String.valueOf(this.H), String.valueOf(this.I), String.valueOf(this.J), String.valueOf(this.K), String.valueOf(this.L), String.valueOf(this.M), String.valueOf(this.N), String.valueOf(this.O), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T), String.valueOf(this.U), String.valueOf(this.V), String.valueOf(this.W), String.valueOf(this.X), String.valueOf(this.Y), String.valueOf(this.Z), String.valueOf(this.aa), String.valueOf(this.ab), String.valueOf(this.ac), String.valueOf(this.ad), String.valueOf(this.ae), String.valueOf(this.af), String.valueOf(this.ag), String.valueOf(this.ah), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar), String.valueOf(this.as), String.valueOf(this.at), String.valueOf(this.au), String.valueOf(this.av));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        valueOf.intValue();
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        Uri parse;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Uri parse2;
        boolean z10;
        Uri parse3;
        saf safVar = (saf) agmqVar;
        aq();
        this.cJ = safVar.dx();
        boolean z11 = false;
        if (safVar.db(0)) {
            this.a = safVar.c();
            fE(0);
        }
        if (safVar.db(1)) {
            this.b = xhv.b(safVar.getLong(safVar.cI(1, saj.a)));
            fE(1);
        }
        if (safVar.db(2)) {
            this.c = safVar.getString(safVar.cI(2, saj.a));
            fE(2);
        }
        if (safVar.db(3)) {
            tqh[] values = tqh.values();
            int i = safVar.getInt(safVar.cI(3, saj.a));
            if (i < values.length) {
                this.d = values[i];
                fE(3);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (safVar.db(4)) {
            this.e = yta.a(safVar.getString(safVar.cI(4, saj.a)));
            fE(4);
        }
        if (safVar.db(5)) {
            this.f = yta.a(safVar.getString(safVar.cI(5, saj.a)));
            fE(5);
        }
        aqby aqbyVar = null;
        if (safVar.db(6)) {
            String string = safVar.getString(safVar.cI(6, saj.a));
            if (string == null) {
                parse3 = null;
            } else {
                parse3 = Uri.parse(string);
            }
            this.g = parse3;
            fE(6);
        }
        if (safVar.db(7)) {
            this.h = safVar.getString(safVar.cI(7, saj.a));
            fE(7);
        }
        if (safVar.db(8)) {
            if (safVar.getInt(safVar.cI(8, saj.a)) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.i = z10;
            fE(8);
        }
        if (safVar.db(9)) {
            this.j = yta.a(safVar.getString(safVar.cI(9, saj.a)));
            fE(9);
        }
        if (safVar.db(10)) {
            this.k = yta.a(safVar.getString(safVar.cI(10, saj.a)));
            fE(10);
        }
        if (safVar.db(11)) {
            String string2 = safVar.getString(safVar.cI(11, saj.a));
            if (string2 == null) {
                parse2 = null;
            } else {
                parse2 = Uri.parse(string2);
            }
            this.l = parse2;
            fE(11);
        }
        if (safVar.db(12)) {
            this.m = safVar.getString(safVar.cI(12, saj.a));
            fE(12);
        }
        if (safVar.db(13)) {
            this.n = safVar.getInt(safVar.cI(13, saj.a));
            fE(13);
        }
        if (safVar.db(14)) {
            this.o = tqc.a(safVar.getInt(safVar.cI(14, saj.a)));
            fE(14);
        }
        if (safVar.db(15)) {
            this.p = safVar.getLong(safVar.cI(15, saj.a));
            fE(15);
        }
        if (safVar.db(16)) {
            this.q = safVar.getString(safVar.cI(16, saj.a));
            fE(16);
        }
        if (safVar.db(17)) {
            this.r = safVar.getLong(safVar.cI(17, saj.a));
            fE(17);
        }
        if (safVar.db(18)) {
            this.s = safVar.getString(safVar.cI(18, saj.a));
            fE(18);
        }
        if (safVar.db(19)) {
            this.t = safVar.getString(safVar.cI(19, saj.a));
            fE(19);
        }
        if (safVar.db(20)) {
            this.u = safVar.getString(safVar.cI(20, saj.a));
            fE(20);
        }
        if (safVar.db(21)) {
            this.v = riw.m(safVar.getString(safVar.cI(21, saj.a)));
            fE(21);
        }
        if (safVar.db(22)) {
            this.w = safVar.getInt(safVar.cI(22, saj.a));
            fE(22);
        }
        if (safVar.db(23)) {
            if (safVar.getInt(safVar.cI(23, saj.a)) == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.x = z9;
            fE(23);
        }
        if (safVar.db(24)) {
            this.y = safVar.getString(safVar.cI(24, saj.a));
            fE(24);
        }
        if (safVar.db(25)) {
            if (safVar.getInt(safVar.cI(25, saj.a)) == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.z = z8;
            fE(25);
        }
        if (safVar.db(26)) {
            if (safVar.getInt(safVar.cI(26, saj.a)) == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.A = z7;
            fE(26);
        }
        if (safVar.db(27)) {
            this.B = safVar.getInt(safVar.cI(27, saj.a));
            fE(27);
        }
        if (safVar.db(28)) {
            this.C = safVar.getLong(safVar.cI(28, saj.a));
            fE(28);
        }
        if (safVar.db(29)) {
            this.D = safVar.getInt(safVar.cI(29, saj.a));
            fE(29);
        }
        if (safVar.db(30)) {
            this.E = safVar.getInt(safVar.cI(30, saj.a));
            fE(30);
        }
        if (safVar.db(31)) {
            this.F = safVar.getInt(safVar.cI(31, saj.a));
            fE(31);
        }
        if (safVar.db(32)) {
            if (safVar.getInt(safVar.cI(32, saj.a)) == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.G = z6;
            fE(32);
        }
        if (safVar.db(33)) {
            if (safVar.getInt(safVar.cI(33, saj.a)) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.H = z5;
            fE(33);
        }
        if (safVar.db(34)) {
            this.I = yta.a(safVar.getString(safVar.cI(34, saj.a)));
            fE(34);
        }
        if (safVar.db(35)) {
            this.J = safVar.getLong(safVar.cI(35, saj.a));
            fE(35);
        }
        if (safVar.db(36)) {
            this.K = safVar.getString(safVar.cI(36, saj.a));
            fE(36);
        }
        if (safVar.db(37)) {
            this.L = safVar.getString(safVar.cI(37, saj.a));
            fE(37);
        }
        if (safVar.db(38)) {
            this.M = yyb.j(safVar.getString(safVar.cI(38, saj.a)));
            fE(38);
        }
        if (safVar.db(39)) {
            if (safVar.getInt(safVar.cI(39, saj.a)) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.N = z4;
            fE(39);
        }
        if (safVar.db(40)) {
            if (safVar.getInt(safVar.cI(40, saj.a)) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.O = z3;
            fE(40);
        }
        if (safVar.db(41)) {
            this.P = qpd.b(safVar.getInt(safVar.cI(41, saj.a)));
            fE(41);
        }
        if (safVar.db(42)) {
            this.Q = uxi.g(safVar.getLong(safVar.cI(42, saj.a)));
            fE(42);
        }
        if (safVar.db(43)) {
            if (safVar.getInt(safVar.cI(43, saj.a)) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.R = z2;
            fE(43);
        }
        if (safVar.db(44)) {
            if (safVar.getInt(safVar.cI(44, saj.a)) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.S = z;
            fE(44);
        }
        if (safVar.db(45)) {
            this.T = new MessageIdType(safVar.getLong(safVar.cI(45, saj.a)));
            fE(45);
        }
        if (safVar.db(46)) {
            this.U = safVar.getLong(safVar.cI(46, saj.a));
            fE(46);
        }
        if (safVar.db(47)) {
            this.V = safVar.getLong(safVar.cI(47, saj.a));
            fE(47);
        }
        if (safVar.db(48)) {
            this.W = safVar.getInt(safVar.cI(48, saj.a));
            fE(48);
        }
        if (safVar.db(49)) {
            this.X = safVar.getInt(safVar.cI(49, saj.a));
            fE(49);
        }
        if (safVar.db(50)) {
            if (safVar.getInt(safVar.cI(50, saj.a)) == 1) {
                z11 = true;
            }
            this.Y = z11;
            fE(50);
        }
        if (safVar.db(51)) {
            this.Z = safVar.getInt(safVar.cI(51, saj.a));
            fE(51);
        }
        if (safVar.db(52)) {
            this.aa = safVar.getInt(safVar.cI(52, saj.a));
            fE(52);
        }
        if (safVar.db(53)) {
            this.ab = safVar.getInt(safVar.cI(53, saj.a));
            fE(53);
        }
        if (safVar.db(54)) {
            this.ac = safVar.getString(safVar.cI(54, saj.a));
            fE(54);
        }
        if (safVar.db(55)) {
            this.ad = safVar.getInt(safVar.cI(55, saj.a));
            fE(55);
        }
        if (safVar.db(56)) {
            this.ae = aabr.bb(safVar.getString(safVar.cI(56, saj.a)));
            fE(56);
        }
        if (safVar.db(57)) {
            this.af = yta.a(safVar.getString(safVar.cI(57, saj.a)));
            fE(57);
        }
        if (safVar.db(58)) {
            this.ag = yta.a(safVar.getString(safVar.cI(58, saj.a)));
            fE(58);
        }
        if (safVar.db(59)) {
            this.ah = safVar.getLong(safVar.cI(59, saj.a));
            fE(59);
        }
        if (safVar.db(60)) {
            this.ai = safVar.getLong(safVar.cI(60, saj.a));
            fE(60);
        }
        if (safVar.db(61)) {
            this.aj = yta.a(safVar.getString(safVar.cI(61, saj.a)));
            fE(61);
        }
        if (safVar.db(62)) {
            this.ak = yta.a(safVar.getString(safVar.cI(62, saj.a)));
            fE(62);
        }
        if (safVar.db(63)) {
            this.al = safVar.getString(safVar.cI(63, saj.a));
            fE(63);
        }
        if (safVar.db(64)) {
            this.am = yta.a(safVar.getString(safVar.cI(64, saj.a)));
            fE(64);
        }
        if (safVar.db(65)) {
            String string3 = safVar.getString(safVar.cI(65, saj.a));
            if (string3 == null) {
                parse = null;
            } else {
                parse = Uri.parse(string3);
            }
            this.an = parse;
            fE(65);
        }
        if (safVar.db(66)) {
            this.ao = safVar.getString(safVar.cI(66, saj.a));
            fE(66);
        }
        if (safVar.db(67)) {
            this.ap = nht.b(safVar.getInt(safVar.cI(67, saj.a)));
            fE(67);
        }
        if (safVar.db(68)) {
            this.aq = safVar.getString(safVar.cI(68, saj.a));
            fE(68);
        }
        if (safVar.db(69)) {
            this.ar = safVar.getLong(safVar.cI(69, saj.a));
            fE(69);
        }
        if (safVar.db(70)) {
            this.as = safVar.getInt(safVar.cI(70, saj.a));
            fE(70);
        }
        if (safVar.db(71)) {
            byte[] blob = safVar.getBlob(safVar.cI(71, saj.a));
            if (blob != null) {
                try {
                    aqbyVar = (aqby) apag.parseFrom(aqby.a, blob, aozs.a());
                } catch (Throwable unused) {
                    aqbyVar = aqby.a;
                }
            }
            this.at = aqbyVar;
            fE(71);
        }
        if (safVar.db(72)) {
            this.au = safVar.getLong(safVar.cI(72, saj.a));
            fE(72);
        }
        if (safVar.db(73)) {
            this.av = new ConversationIdType(safVar.getLong(safVar.cI(73, saj.a)));
            fE(73);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sac)) {
            return false;
        }
        sac sacVar = (sac) obj;
        if (super.aC(sacVar.cJ) && Objects.equals(this.a, sacVar.a) && Objects.equals(this.b, sacVar.b) && Objects.equals(this.c, sacVar.c) && this.d == sacVar.d && Objects.equals(this.e, sacVar.e) && Objects.equals(this.f, sacVar.f) && Objects.equals(this.g, sacVar.g) && Objects.equals(this.h, sacVar.h) && this.i == sacVar.i && Objects.equals(this.j, sacVar.j) && Objects.equals(this.k, sacVar.k) && Objects.equals(this.l, sacVar.l) && Objects.equals(this.m, sacVar.m) && this.n == sacVar.n && this.o == sacVar.o && this.p == sacVar.p && Objects.equals(this.q, sacVar.q) && this.r == sacVar.r && Objects.equals(this.s, sacVar.s) && Objects.equals(this.t, sacVar.t) && Objects.equals(this.u, sacVar.u) && Objects.equals(this.v, sacVar.v) && this.w == sacVar.w && this.x == sacVar.x && Objects.equals(this.y, sacVar.y) && this.z == sacVar.z && this.A == sacVar.A && this.B == sacVar.B && this.C == sacVar.C && this.D == sacVar.D && this.E == sacVar.E && this.F == sacVar.F && this.G == sacVar.G && this.H == sacVar.H && Objects.equals(this.I, sacVar.I) && this.J == sacVar.J && Objects.equals(this.K, sacVar.K) && Objects.equals(this.L, sacVar.L) && Objects.equals(this.M, sacVar.M) && this.N == sacVar.N && this.O == sacVar.O && this.P == sacVar.P && Objects.equals(this.Q, sacVar.Q) && this.R == sacVar.R && this.S == sacVar.S && Objects.equals(this.T, sacVar.T) && this.U == sacVar.U && this.V == sacVar.V && this.W == sacVar.W && this.X == sacVar.X && this.Y == sacVar.Y && this.Z == sacVar.Z && this.aa == sacVar.aa && this.ab == sacVar.ab && Objects.equals(this.ac, sacVar.ac) && this.ad == sacVar.ad && Objects.equals(this.ae, sacVar.ae) && Objects.equals(this.af, sacVar.af) && Objects.equals(this.ag, sacVar.ag) && this.ah == sacVar.ah && this.ai == sacVar.ai && Objects.equals(this.aj, sacVar.aj) && Objects.equals(this.ak, sacVar.ak) && Objects.equals(this.al, sacVar.al) && Objects.equals(this.am, sacVar.am) && Objects.equals(this.an, sacVar.an) && Objects.equals(this.ao, sacVar.ao) && this.ap == sacVar.ap && Objects.equals(this.aq, sacVar.aq) && this.ar == sacVar.ar && this.as == sacVar.as && Objects.equals(this.at, sacVar.at) && this.au == sacVar.au && Objects.equals(this.av, sacVar.av)) {
            return true;
        }
        return false;
    }

    public final int f() {
        ao(30, "conv_type");
        return this.E;
    }

    public final int g() {
        ao(13, "etouffee_default");
        return this.n;
    }

    public final int h() {
        ao(27, "source_type");
        return this.B;
    }

    public final int hashCode() {
        aday adayVar;
        int ordinal;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        ConversationIdType conversationIdType = this.a;
        xhv xhvVar = this.b;
        String str = this.c;
        tqh tqhVar = this.d;
        if (tqhVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqhVar.ordinal();
        }
        return Objects.hash(adayVar, conversationIdType, xhvVar, str, Integer.valueOf(ordinal), this.e, this.f, this.g, this.h, Boolean.valueOf(this.i), this.j, this.k, this.l, this.m, Integer.valueOf(this.n), this.o, Long.valueOf(this.p), this.q, Long.valueOf(this.r), this.s, this.t, this.u, this.v, Integer.valueOf(this.w), Boolean.valueOf(this.x), this.y, Boolean.valueOf(this.z), Boolean.valueOf(this.A), Integer.valueOf(this.B), Long.valueOf(this.C), Integer.valueOf(this.D), Integer.valueOf(this.E), Integer.valueOf(this.F), Boolean.valueOf(this.G), Boolean.valueOf(this.H), this.I, Long.valueOf(this.J), this.K, this.L, this.M, Boolean.valueOf(this.N), Boolean.valueOf(this.O), this.P, this.Q, Boolean.valueOf(this.R), Boolean.valueOf(this.S), this.T, Long.valueOf(this.U), Long.valueOf(this.V), Integer.valueOf(this.W), Integer.valueOf(this.X), Boolean.valueOf(this.Y), Integer.valueOf(this.Z), Integer.valueOf(this.aa), Integer.valueOf(this.ab), this.ac, Integer.valueOf(this.ad), this.ae, this.af, this.ag, Long.valueOf(this.ah), Long.valueOf(this.ai), this.aj, this.ak, this.al, this.am, this.an, this.ao, this.ap, this.aq, Long.valueOf(this.ar), Integer.valueOf(this.as), this.at, Long.valueOf(this.au), this.av, null);
    }

    public final int i() {
        ao(49, "message_status");
        return this.X;
    }

    public final int j() {
        ao(55, "sub_id");
        return this.ad;
    }

    public final long k() {
        ao(28, "rcs_session_id");
        return this.C;
    }

    public final ConversationIdType l() {
        ao(0, "_id");
        return this.a;
    }

    public final MessageIdType m() {
        ao(45, "_id");
        return this.T;
    }

    public final String n() {
        ao(20, "current_self_id");
        return this.u;
    }

    public final String o() {
        ao(2, "name");
        return this.c;
    }

    public final String p() {
        ao(19, "participant_normalized_destination");
        return this.t;
    }

    public final boolean q() {
        ao(33, "has_ea2p_bot_recipient");
        return this.H;
    }

    public final boolean r() {
        ao(8, "show_draft");
        return this.i;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ConversationListFromConversationToParticipantsQuery -- REDACTED");
        }
        return a();
    }
}
