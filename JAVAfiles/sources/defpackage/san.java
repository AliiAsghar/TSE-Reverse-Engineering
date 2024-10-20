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
public final class san extends aglz<sar, sas, sat, san, saq> {
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
        return String.format(Locale.US, "ConversationListQuery [conversations.conversations__id: %s,\n  conversations.conversations_sms_thread_id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_name_is_automatic: %s,\n  conversations.conversations_snippet_text: %s,\n  conversations.conversations_subject_text: %s,\n  conversations.conversations_preview_uri: %s,\n  conversations.conversations_preview_content_type: %s,\n  conversations.conversations_show_draft: %s,\n  conversations.conversations_draft_snippet_text: %s,\n  conversations.conversations_draft_subject_text: %s,\n  conversations.conversations_draft_preview_uri: %s,\n  conversations.conversations_draft_preview_content_type: %s,\n  conversations.conversations_etouffee_default: %s,\n  conversations.conversations_archive_status: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_icon: %s,\n  conversations.conversations_participant_contact_id: %s,\n  conversations.conversations_participant_lookup_key: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_current_self_id: %s,\n  conversations.conversations_current_my_identity_foreign_key: %s,\n  conversations.conversations_participant_count: %s,\n  conversations.conversations_notification_enabled: %s,\n  conversations.conversations_notification_sound_uri: %s,\n  conversations.conversations_notification_vibration: %s,\n  conversations.conversations_include_email_addr: %s,\n  conversations.conversations_source_type: %s,\n  conversations.conversations_rcs_session_id: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_send_mode: %s,\n  conversations.conversations_IS_ENTERPRISE: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_participant_display_destination: %s,\n  conversations.conversations_delete_timestamp: %s,\n  conversations.conversations_cms_id: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_conference_uri: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_awaiting_reverse_sync: %s,\n  conversations.conversations_error_state: %s,\n  conversations.conversations_rcs_group_last_sync_timestamp: %s,\n  conversations.conversations_has_been_e2ee: %s,\n  conversations.conversations_marked_as_unread: %s,\n  messages.messages__id: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  participants.participants_directory_id: %s,\n  conversation_participants.conversation_participants_participant_id: %s,\n  one_on_one_participant.one_on_one_participant_full_name: %s,\n  one_on_one_participant.one_on_one_participant_first_name: %s,\n  profiles_table.profiles_table_display_name: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  vmt.vmt_vmt_status: %s,\n  vmt.vmt_text: %s,\n  reminders.reminders_trigger_time: %s,\n  messages_annotations.messages_annotations_annotation_type: %s,\n  messages_annotations.messages_annotations_annotation_details: %s,\n  message_star.message_star__id: %s,\n  parent_disallowed_conversations.parent_disallowed_conversations_conversation_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.w), String.valueOf(this.x), String.valueOf(this.y), String.valueOf(this.z), String.valueOf(this.A), String.valueOf(this.B), String.valueOf(this.C), String.valueOf(this.D), String.valueOf(this.E), String.valueOf(this.F), String.valueOf(this.G), String.valueOf(this.H), String.valueOf(this.I), String.valueOf(this.J), String.valueOf(this.K), String.valueOf(this.L), String.valueOf(this.M), String.valueOf(this.N), String.valueOf(this.O), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T), String.valueOf(this.U), String.valueOf(this.V), String.valueOf(this.W), String.valueOf(this.X), String.valueOf(this.Y), String.valueOf(this.Z), String.valueOf(this.aa), String.valueOf(this.ab), String.valueOf(this.ac), String.valueOf(this.ad), String.valueOf(this.ae), String.valueOf(this.af), String.valueOf(this.ag), String.valueOf(this.ah), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar), String.valueOf(this.as), String.valueOf(this.at), String.valueOf(this.au), String.valueOf(this.av));
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
        sar sarVar = (sar) agmqVar;
        aq();
        this.cJ = sarVar.dx();
        boolean z11 = false;
        if (sarVar.db(0)) {
            this.a = sarVar.c();
            fE(0);
        }
        if (sarVar.db(1)) {
            this.b = xhv.b(sarVar.getLong(sarVar.cI(1, sav.a)));
            fE(1);
        }
        if (sarVar.db(2)) {
            this.c = sarVar.getString(sarVar.cI(2, sav.a));
            fE(2);
        }
        if (sarVar.db(3)) {
            tqh[] values = tqh.values();
            int i = sarVar.getInt(sarVar.cI(3, sav.a));
            if (i < values.length) {
                this.d = values[i];
                fE(3);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (sarVar.db(4)) {
            this.e = yta.a(sarVar.getString(sarVar.cI(4, sav.a)));
            fE(4);
        }
        if (sarVar.db(5)) {
            this.f = yta.a(sarVar.getString(sarVar.cI(5, sav.a)));
            fE(5);
        }
        aqby aqbyVar = null;
        if (sarVar.db(6)) {
            String string = sarVar.getString(sarVar.cI(6, sav.a));
            if (string == null) {
                parse3 = null;
            } else {
                parse3 = Uri.parse(string);
            }
            this.g = parse3;
            fE(6);
        }
        if (sarVar.db(7)) {
            this.h = sarVar.getString(sarVar.cI(7, sav.a));
            fE(7);
        }
        if (sarVar.db(8)) {
            if (sarVar.getInt(sarVar.cI(8, sav.a)) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.i = z10;
            fE(8);
        }
        if (sarVar.db(9)) {
            this.j = yta.a(sarVar.getString(sarVar.cI(9, sav.a)));
            fE(9);
        }
        if (sarVar.db(10)) {
            this.k = yta.a(sarVar.getString(sarVar.cI(10, sav.a)));
            fE(10);
        }
        if (sarVar.db(11)) {
            String string2 = sarVar.getString(sarVar.cI(11, sav.a));
            if (string2 == null) {
                parse2 = null;
            } else {
                parse2 = Uri.parse(string2);
            }
            this.l = parse2;
            fE(11);
        }
        if (sarVar.db(12)) {
            this.m = sarVar.getString(sarVar.cI(12, sav.a));
            fE(12);
        }
        if (sarVar.db(13)) {
            this.n = sarVar.getInt(sarVar.cI(13, sav.a));
            fE(13);
        }
        if (sarVar.db(14)) {
            this.o = tqc.a(sarVar.getInt(sarVar.cI(14, sav.a)));
            fE(14);
        }
        if (sarVar.db(15)) {
            this.p = sarVar.getLong(sarVar.cI(15, sav.a));
            fE(15);
        }
        if (sarVar.db(16)) {
            this.q = sarVar.getString(sarVar.cI(16, sav.a));
            fE(16);
        }
        if (sarVar.db(17)) {
            this.r = sarVar.getLong(sarVar.cI(17, sav.a));
            fE(17);
        }
        if (sarVar.db(18)) {
            this.s = sarVar.getString(sarVar.cI(18, sav.a));
            fE(18);
        }
        if (sarVar.db(19)) {
            this.t = sarVar.getString(sarVar.cI(19, sav.a));
            fE(19);
        }
        if (sarVar.db(20)) {
            this.u = sarVar.getString(sarVar.cI(20, sav.a));
            fE(20);
        }
        if (sarVar.db(21)) {
            this.v = riw.m(sarVar.getString(sarVar.cI(21, sav.a)));
            fE(21);
        }
        if (sarVar.db(22)) {
            this.w = sarVar.getInt(sarVar.cI(22, sav.a));
            fE(22);
        }
        if (sarVar.db(23)) {
            if (sarVar.getInt(sarVar.cI(23, sav.a)) == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.x = z9;
            fE(23);
        }
        if (sarVar.db(24)) {
            this.y = sarVar.getString(sarVar.cI(24, sav.a));
            fE(24);
        }
        if (sarVar.db(25)) {
            if (sarVar.getInt(sarVar.cI(25, sav.a)) == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.z = z8;
            fE(25);
        }
        if (sarVar.db(26)) {
            if (sarVar.getInt(sarVar.cI(26, sav.a)) == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.A = z7;
            fE(26);
        }
        if (sarVar.db(27)) {
            this.B = sarVar.getInt(sarVar.cI(27, sav.a));
            fE(27);
        }
        if (sarVar.db(28)) {
            this.C = sarVar.getLong(sarVar.cI(28, sav.a));
            fE(28);
        }
        if (sarVar.db(29)) {
            this.D = sarVar.getInt(sarVar.cI(29, sav.a));
            fE(29);
        }
        if (sarVar.db(30)) {
            this.E = sarVar.getInt(sarVar.cI(30, sav.a));
            fE(30);
        }
        if (sarVar.db(31)) {
            this.F = sarVar.getInt(sarVar.cI(31, sav.a));
            fE(31);
        }
        if (sarVar.db(32)) {
            if (sarVar.getInt(sarVar.cI(32, sav.a)) == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.G = z6;
            fE(32);
        }
        if (sarVar.db(33)) {
            if (sarVar.getInt(sarVar.cI(33, sav.a)) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.H = z5;
            fE(33);
        }
        if (sarVar.db(34)) {
            this.I = yta.a(sarVar.getString(sarVar.cI(34, sav.a)));
            fE(34);
        }
        if (sarVar.db(35)) {
            this.J = sarVar.getLong(sarVar.cI(35, sav.a));
            fE(35);
        }
        if (sarVar.db(36)) {
            this.K = sarVar.getString(sarVar.cI(36, sav.a));
            fE(36);
        }
        if (sarVar.db(37)) {
            this.L = sarVar.getString(sarVar.cI(37, sav.a));
            fE(37);
        }
        if (sarVar.db(38)) {
            this.M = yyb.j(sarVar.getString(sarVar.cI(38, sav.a)));
            fE(38);
        }
        if (sarVar.db(39)) {
            if (sarVar.getInt(sarVar.cI(39, sav.a)) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.N = z4;
            fE(39);
        }
        if (sarVar.db(40)) {
            if (sarVar.getInt(sarVar.cI(40, sav.a)) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.O = z3;
            fE(40);
        }
        if (sarVar.db(41)) {
            this.P = qpd.b(sarVar.getInt(sarVar.cI(41, sav.a)));
            fE(41);
        }
        if (sarVar.db(42)) {
            this.Q = uxi.g(sarVar.getLong(sarVar.cI(42, sav.a)));
            fE(42);
        }
        if (sarVar.db(43)) {
            if (sarVar.getInt(sarVar.cI(43, sav.a)) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.R = z2;
            fE(43);
        }
        if (sarVar.db(44)) {
            if (sarVar.getInt(sarVar.cI(44, sav.a)) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.S = z;
            fE(44);
        }
        if (sarVar.db(45)) {
            this.T = new MessageIdType(sarVar.getLong(sarVar.cI(45, sav.a)));
            fE(45);
        }
        if (sarVar.db(46)) {
            this.U = sarVar.getLong(sarVar.cI(46, sav.a));
            fE(46);
        }
        if (sarVar.db(47)) {
            this.V = sarVar.getLong(sarVar.cI(47, sav.a));
            fE(47);
        }
        if (sarVar.db(48)) {
            this.W = sarVar.getInt(sarVar.cI(48, sav.a));
            fE(48);
        }
        if (sarVar.db(49)) {
            this.X = sarVar.getInt(sarVar.cI(49, sav.a));
            fE(49);
        }
        if (sarVar.db(50)) {
            if (sarVar.getInt(sarVar.cI(50, sav.a)) == 1) {
                z11 = true;
            }
            this.Y = z11;
            fE(50);
        }
        if (sarVar.db(51)) {
            this.Z = sarVar.getInt(sarVar.cI(51, sav.a));
            fE(51);
        }
        if (sarVar.db(52)) {
            this.aa = sarVar.getInt(sarVar.cI(52, sav.a));
            fE(52);
        }
        if (sarVar.db(53)) {
            this.ab = sarVar.getInt(sarVar.cI(53, sav.a));
            fE(53);
        }
        if (sarVar.db(54)) {
            this.ac = sarVar.getString(sarVar.cI(54, sav.a));
            fE(54);
        }
        if (sarVar.db(55)) {
            this.ad = sarVar.getInt(sarVar.cI(55, sav.a));
            fE(55);
        }
        if (sarVar.db(56)) {
            this.ae = aabr.bb(sarVar.getString(sarVar.cI(56, sav.a)));
            fE(56);
        }
        if (sarVar.db(57)) {
            this.af = yta.a(sarVar.getString(sarVar.cI(57, sav.a)));
            fE(57);
        }
        if (sarVar.db(58)) {
            this.ag = yta.a(sarVar.getString(sarVar.cI(58, sav.a)));
            fE(58);
        }
        if (sarVar.db(59)) {
            this.ah = sarVar.getLong(sarVar.cI(59, sav.a));
            fE(59);
        }
        if (sarVar.db(60)) {
            this.ai = sarVar.getLong(sarVar.cI(60, sav.a));
            fE(60);
        }
        if (sarVar.db(61)) {
            this.aj = yta.a(sarVar.getString(sarVar.cI(61, sav.a)));
            fE(61);
        }
        if (sarVar.db(62)) {
            this.ak = yta.a(sarVar.getString(sarVar.cI(62, sav.a)));
            fE(62);
        }
        if (sarVar.db(63)) {
            this.al = sarVar.getString(sarVar.cI(63, sav.a));
            fE(63);
        }
        if (sarVar.db(64)) {
            this.am = yta.a(sarVar.getString(sarVar.cI(64, sav.a)));
            fE(64);
        }
        if (sarVar.db(65)) {
            String string3 = sarVar.getString(sarVar.cI(65, sav.a));
            if (string3 == null) {
                parse = null;
            } else {
                parse = Uri.parse(string3);
            }
            this.an = parse;
            fE(65);
        }
        if (sarVar.db(66)) {
            this.ao = sarVar.getString(sarVar.cI(66, sav.a));
            fE(66);
        }
        if (sarVar.db(67)) {
            this.ap = nht.b(sarVar.getInt(sarVar.cI(67, sav.a)));
            fE(67);
        }
        if (sarVar.db(68)) {
            this.aq = sarVar.getString(sarVar.cI(68, sav.a));
            fE(68);
        }
        if (sarVar.db(69)) {
            this.ar = sarVar.getLong(sarVar.cI(69, sav.a));
            fE(69);
        }
        if (sarVar.db(70)) {
            this.as = sarVar.getInt(sarVar.cI(70, sav.a));
            fE(70);
        }
        if (sarVar.db(71)) {
            byte[] blob = sarVar.getBlob(sarVar.cI(71, sav.a));
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
        if (sarVar.db(72)) {
            this.au = sarVar.getLong(sarVar.cI(72, sav.a));
            fE(72);
        }
        if (sarVar.db(73)) {
            this.av = new ConversationIdType(sarVar.getLong(sarVar.cI(73, sav.a)));
            fE(73);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof san)) {
            return false;
        }
        san sanVar = (san) obj;
        if (super.aC(sanVar.cJ) && Objects.equals(this.a, sanVar.a) && Objects.equals(this.b, sanVar.b) && Objects.equals(this.c, sanVar.c) && this.d == sanVar.d && Objects.equals(this.e, sanVar.e) && Objects.equals(this.f, sanVar.f) && Objects.equals(this.g, sanVar.g) && Objects.equals(this.h, sanVar.h) && this.i == sanVar.i && Objects.equals(this.j, sanVar.j) && Objects.equals(this.k, sanVar.k) && Objects.equals(this.l, sanVar.l) && Objects.equals(this.m, sanVar.m) && this.n == sanVar.n && this.o == sanVar.o && this.p == sanVar.p && Objects.equals(this.q, sanVar.q) && this.r == sanVar.r && Objects.equals(this.s, sanVar.s) && Objects.equals(this.t, sanVar.t) && Objects.equals(this.u, sanVar.u) && Objects.equals(this.v, sanVar.v) && this.w == sanVar.w && this.x == sanVar.x && Objects.equals(this.y, sanVar.y) && this.z == sanVar.z && this.A == sanVar.A && this.B == sanVar.B && this.C == sanVar.C && this.D == sanVar.D && this.E == sanVar.E && this.F == sanVar.F && this.G == sanVar.G && this.H == sanVar.H && Objects.equals(this.I, sanVar.I) && this.J == sanVar.J && Objects.equals(this.K, sanVar.K) && Objects.equals(this.L, sanVar.L) && Objects.equals(this.M, sanVar.M) && this.N == sanVar.N && this.O == sanVar.O && this.P == sanVar.P && Objects.equals(this.Q, sanVar.Q) && this.R == sanVar.R && this.S == sanVar.S && Objects.equals(this.T, sanVar.T) && this.U == sanVar.U && this.V == sanVar.V && this.W == sanVar.W && this.X == sanVar.X && this.Y == sanVar.Y && this.Z == sanVar.Z && this.aa == sanVar.aa && this.ab == sanVar.ab && Objects.equals(this.ac, sanVar.ac) && this.ad == sanVar.ad && Objects.equals(this.ae, sanVar.ae) && Objects.equals(this.af, sanVar.af) && Objects.equals(this.ag, sanVar.ag) && this.ah == sanVar.ah && this.ai == sanVar.ai && Objects.equals(this.aj, sanVar.aj) && Objects.equals(this.ak, sanVar.ak) && Objects.equals(this.al, sanVar.al) && Objects.equals(this.am, sanVar.am) && Objects.equals(this.an, sanVar.an) && Objects.equals(this.ao, sanVar.ao) && this.ap == sanVar.ap && Objects.equals(this.aq, sanVar.aq) && this.ar == sanVar.ar && this.as == sanVar.as && Objects.equals(this.at, sanVar.at) && this.au == sanVar.au && Objects.equals(this.av, sanVar.av)) {
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
            return String.format(Locale.US, "%s", "ConversationListQuery -- REDACTED");
        }
        return a();
    }
}
