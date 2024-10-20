package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbw extends aglz {
    public String I;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public boolean S;
    public String T;
    public boolean V;
    public uyf W;
    public String a;
    private String aa;
    private long ac;
    public String b;
    public String c;
    public Uri d;
    public String e;
    public String g;
    public String h;
    public Uri i;
    public String j;
    public String l;
    public String m;
    public String v;
    private ConversationIdType Y = ruy.a;
    public boolean f = false;
    public tqc k = tqc.UNARCHIVED;
    private long Z = 0;
    public int n = 0;
    public boolean o = true;
    public boolean p = false;
    private int ab = 0;
    public long q = -1;
    public int r = 0;
    public int s = 0;
    public boolean t = false;
    public boolean u = false;
    public boolean w = true;
    public boolean x = false;
    public vvh y = vvh.a;
    public MessageIdType z = rvc.a;
    public long A = 0;
    public long B = 0;
    public int C = 0;
    public int D = 0;
    public boolean E = false;
    public int F = 0;
    public int G = 0;
    public int H = -1;
    public int J = -2;
    public long R = 0;
    public boolean U = true;
    public long X = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "HomeScreenQuery [conversations.conversations__id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_snippet_text: %s,\n  conversations.conversations_subject_text: %s,\n  conversations.conversations_preview_uri: %s,\n  conversations.conversations_preview_content_type: %s,\n  conversations.conversations_show_draft: %s,\n  conversations.conversations_draft_snippet_text: %s,\n  conversations.conversations_draft_subject_text: %s,\n  conversations.conversations_draft_preview_uri: %s,\n  conversations.conversations_draft_preview_content_type: %s,\n  conversations.conversations_archive_status: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_icon: %s,\n  conversations.conversations_participant_lookup_key: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_participant_count: %s,\n  conversations.conversations_notification_enabled: %s,\n  conversations.conversations_include_email_addr: %s,\n  conversations.conversations_source_type: %s,\n  conversations.conversations_rcs_session_id: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_IS_ENTERPRISE: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_participant_display_destination: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_marked_as_unread: %s,\n  conversations.conversations_mms_group_upgrade_status: %s,\n  messages.messages__id: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  conversation_to_participants.conversation_to_participants_participant_id: %s,\n  one_on_one_participant.one_on_one_participant_full_name: %s,\n  one_on_one_participant.one_on_one_participant_first_name: %s,\n  profiles_table.profiles_table_display_name: %s,\n  parts.parts_content_type: %s,\n  reminders.reminders_trigger_time: %s,\n  conversation_pin.conversation_pin_pin_status: %s,\n  lighter_conversations_table.lighter_conversations_table_lighter_conversation_id_json: %s,\n  lighter_conversations_table.lighter_conversations_table_read: %s,\n  lighter_conversations_table.lighter_conversations_table_is_last_message_outgoing: %s,\n  lighter_conversations_table.lighter_conversations_table_conversation_status: %s,\n  lighter_conversations_table.lighter_conversations_table_last_action_timestamp: %s\n]\n", String.valueOf(this.Y), String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.Z), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.aa), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.ab), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.w), String.valueOf(this.x), String.valueOf(this.y), String.valueOf(this.z), String.valueOf(this.A), String.valueOf(this.B), String.valueOf(this.C), String.valueOf(this.D), String.valueOf(this.E), String.valueOf(this.F), String.valueOf(this.G), String.valueOf(this.H), String.valueOf(this.I), String.valueOf(this.J), String.valueOf(this.K), String.valueOf(this.L), String.valueOf(this.M), String.valueOf(this.ac), String.valueOf(this.N), String.valueOf(this.O), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T), String.valueOf(this.U), String.valueOf(this.V), String.valueOf(this.W), String.valueOf(this.X));
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
        lbz lbzVar = (lbz) agmqVar;
        aq();
        this.cJ = lbzVar.dx();
        boolean z11 = false;
        if (lbzVar.db(0)) {
            this.Y = new ConversationIdType(lbzVar.getLong(lbzVar.cI(0, lcd.a)));
            fE(0);
        }
        if (lbzVar.db(1)) {
            this.a = lbzVar.getString(lbzVar.cI(1, lcd.a));
            fE(1);
        }
        if (lbzVar.db(2)) {
            this.b = yta.a(lbzVar.getString(lbzVar.cI(2, lcd.a)));
            fE(2);
        }
        if (lbzVar.db(3)) {
            this.c = yta.a(lbzVar.getString(lbzVar.cI(3, lcd.a)));
            fE(3);
        }
        if (lbzVar.db(4)) {
            String string = lbzVar.getString(lbzVar.cI(4, lcd.a));
            if (string == null) {
                parse2 = null;
            } else {
                parse2 = Uri.parse(string);
            }
            this.d = parse2;
            fE(4);
        }
        if (lbzVar.db(5)) {
            this.e = lbzVar.getString(lbzVar.cI(5, lcd.a));
            fE(5);
        }
        if (lbzVar.db(6)) {
            if (lbzVar.getInt(lbzVar.cI(6, lcd.a)) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f = z10;
            fE(6);
        }
        if (lbzVar.db(7)) {
            this.g = yta.a(lbzVar.getString(lbzVar.cI(7, lcd.a)));
            fE(7);
        }
        if (lbzVar.db(8)) {
            this.h = yta.a(lbzVar.getString(lbzVar.cI(8, lcd.a)));
            fE(8);
        }
        if (lbzVar.db(9)) {
            String string2 = lbzVar.getString(lbzVar.cI(9, lcd.a));
            if (string2 == null) {
                parse = null;
            } else {
                parse = Uri.parse(string2);
            }
            this.i = parse;
            fE(9);
        }
        if (lbzVar.db(10)) {
            this.j = lbzVar.getString(lbzVar.cI(10, lcd.a));
            fE(10);
        }
        if (lbzVar.db(11)) {
            this.k = tqc.a(lbzVar.getInt(lbzVar.cI(11, lcd.a)));
            fE(11);
        }
        if (lbzVar.db(12)) {
            this.Z = lbzVar.getLong(lbzVar.cI(12, lcd.a));
            fE(12);
        }
        if (lbzVar.db(13)) {
            this.l = lbzVar.getString(lbzVar.cI(13, lcd.a));
            fE(13);
        }
        if (lbzVar.db(14)) {
            this.m = lbzVar.getString(lbzVar.cI(14, lcd.a));
            fE(14);
        }
        if (lbzVar.db(15)) {
            this.aa = lbzVar.getString(lbzVar.cI(15, lcd.a));
            fE(15);
        }
        if (lbzVar.db(16)) {
            this.n = lbzVar.getInt(lbzVar.cI(16, lcd.a));
            fE(16);
        }
        if (lbzVar.db(17)) {
            if (lbzVar.getInt(lbzVar.cI(17, lcd.a)) == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.o = z9;
            fE(17);
        }
        if (lbzVar.db(18)) {
            if (lbzVar.getInt(lbzVar.cI(18, lcd.a)) == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.p = z8;
            fE(18);
        }
        if (lbzVar.db(19)) {
            this.ab = lbzVar.getInt(lbzVar.cI(19, lcd.a));
            fE(19);
        }
        if (lbzVar.db(20)) {
            this.q = lbzVar.getLong(lbzVar.cI(20, lcd.a));
            fE(20);
        }
        if (lbzVar.db(21)) {
            this.r = lbzVar.getInt(lbzVar.cI(21, lcd.a));
            fE(21);
        }
        if (lbzVar.db(22)) {
            this.s = lbzVar.getInt(lbzVar.cI(22, lcd.a));
            fE(22);
        }
        if (lbzVar.db(23)) {
            if (lbzVar.getInt(lbzVar.cI(23, lcd.a)) == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.t = z7;
            fE(23);
        }
        if (lbzVar.db(24)) {
            if (lbzVar.getInt(lbzVar.cI(24, lcd.a)) == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.u = z6;
            fE(24);
        }
        if (lbzVar.db(25)) {
            this.v = yta.a(lbzVar.getString(lbzVar.cI(25, lcd.a)));
            fE(25);
        }
        if (lbzVar.db(26)) {
            if (lbzVar.getInt(lbzVar.cI(26, lcd.a)) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.w = z5;
            fE(26);
        }
        if (lbzVar.db(27)) {
            if (lbzVar.getInt(lbzVar.cI(27, lcd.a)) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.x = z4;
            fE(27);
        }
        if (lbzVar.db(28)) {
            vvh[] values = vvh.values();
            int i = lbzVar.getInt(lbzVar.cI(28, lcd.a));
            if (i < values.length) {
                this.y = values[i];
                fE(28);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(29)) {
            this.z = new MessageIdType(lbzVar.getLong(lbzVar.cI(29, lcd.a)));
            fE(29);
        }
        if (lbzVar.db(30)) {
            this.A = lbzVar.getLong(lbzVar.cI(30, lcd.a));
            fE(30);
        }
        if (lbzVar.db(31)) {
            this.B = lbzVar.getLong(lbzVar.cI(31, lcd.a));
            fE(31);
        }
        if (lbzVar.db(32)) {
            this.C = lbzVar.getInt(lbzVar.cI(32, lcd.a));
            fE(32);
        }
        if (lbzVar.db(33)) {
            this.D = lbzVar.getInt(lbzVar.cI(33, lcd.a));
            fE(33);
        }
        if (lbzVar.db(34)) {
            if (lbzVar.getInt(lbzVar.cI(34, lcd.a)) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.E = z3;
            fE(34);
        }
        if (lbzVar.db(35)) {
            this.F = lbzVar.getInt(lbzVar.cI(35, lcd.a));
            fE(35);
        }
        if (lbzVar.db(36)) {
            this.G = lbzVar.getInt(lbzVar.cI(36, lcd.a));
            fE(36);
        }
        if (lbzVar.db(37)) {
            this.H = lbzVar.getInt(lbzVar.cI(37, lcd.a));
            fE(37);
        }
        if (lbzVar.db(38)) {
            this.I = lbzVar.getString(lbzVar.cI(38, lcd.a));
            fE(38);
        }
        if (lbzVar.db(39)) {
            this.J = lbzVar.getInt(lbzVar.cI(39, lcd.a));
            fE(39);
        }
        if (lbzVar.db(40)) {
            this.K = aabr.bb(lbzVar.getString(lbzVar.cI(40, lcd.a)));
            fE(40);
        }
        if (lbzVar.db(41)) {
            this.L = yta.a(lbzVar.getString(lbzVar.cI(41, lcd.a)));
            fE(41);
        }
        if (lbzVar.db(42)) {
            this.M = yta.a(lbzVar.getString(lbzVar.cI(42, lcd.a)));
            fE(42);
        }
        if (lbzVar.db(43)) {
            this.ac = lbzVar.getLong(lbzVar.cI(43, lcd.a));
            fE(43);
        }
        if (lbzVar.db(44)) {
            this.N = yta.a(lbzVar.getString(lbzVar.cI(44, lcd.a)));
            fE(44);
        }
        if (lbzVar.db(45)) {
            this.O = yta.a(lbzVar.getString(lbzVar.cI(45, lcd.a)));
            fE(45);
        }
        if (lbzVar.db(46)) {
            this.P = lbzVar.getString(lbzVar.cI(46, lcd.a));
            fE(46);
        }
        if (lbzVar.db(47)) {
            this.Q = lbzVar.getString(lbzVar.cI(47, lcd.a));
            fE(47);
        }
        if (lbzVar.db(48)) {
            this.R = lbzVar.getLong(lbzVar.cI(48, lcd.a));
            fE(48);
        }
        if (lbzVar.db(49)) {
            if (lbzVar.getInt(lbzVar.cI(49, lcd.a)) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.S = z2;
            fE(49);
        }
        if (lbzVar.db(50)) {
            this.T = lbzVar.getString(lbzVar.cI(50, lcd.a));
            fE(50);
        }
        if (lbzVar.db(51)) {
            if (lbzVar.getInt(lbzVar.cI(51, lcd.a)) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.U = z;
            fE(51);
        }
        if (lbzVar.db(52)) {
            if (lbzVar.getInt(lbzVar.cI(52, lcd.a)) == 1) {
                z11 = true;
            }
            this.V = z11;
            fE(52);
        }
        if (lbzVar.db(53)) {
            uyf[] values2 = uyf.values();
            int i2 = lbzVar.getInt(lbzVar.cI(53, lcd.a));
            if (i2 < values2.length) {
                this.W = values2[i2];
                fE(53);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(54)) {
            this.X = lbzVar.getLong(lbzVar.cI(54, lcd.a));
            fE(54);
        }
    }

    public final int d() {
        ao(19, "source_type");
        return this.ab;
    }

    public final long e() {
        ao(12, "sort_timestamp");
        return this.Z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lbw)) {
            return false;
        }
        lbw lbwVar = (lbw) obj;
        if (super.aC(lbwVar.cJ) && Objects.equals(this.Y, lbwVar.Y) && Objects.equals(this.a, lbwVar.a) && Objects.equals(this.b, lbwVar.b) && Objects.equals(this.c, lbwVar.c) && Objects.equals(this.d, lbwVar.d) && Objects.equals(this.e, lbwVar.e) && this.f == lbwVar.f && Objects.equals(this.g, lbwVar.g) && Objects.equals(this.h, lbwVar.h) && Objects.equals(this.i, lbwVar.i) && Objects.equals(this.j, lbwVar.j) && this.k == lbwVar.k && this.Z == lbwVar.Z && Objects.equals(this.l, lbwVar.l) && Objects.equals(this.m, lbwVar.m) && Objects.equals(this.aa, lbwVar.aa) && this.n == lbwVar.n && this.o == lbwVar.o && this.p == lbwVar.p && this.ab == lbwVar.ab && this.q == lbwVar.q && this.r == lbwVar.r && this.s == lbwVar.s && this.t == lbwVar.t && this.u == lbwVar.u && Objects.equals(this.v, lbwVar.v) && this.w == lbwVar.w && this.x == lbwVar.x && this.y == lbwVar.y && Objects.equals(this.z, lbwVar.z) && this.A == lbwVar.A && this.B == lbwVar.B && this.C == lbwVar.C && this.D == lbwVar.D && this.E == lbwVar.E && this.F == lbwVar.F && this.G == lbwVar.G && this.H == lbwVar.H && Objects.equals(this.I, lbwVar.I) && this.J == lbwVar.J && Objects.equals(this.K, lbwVar.K) && Objects.equals(this.L, lbwVar.L) && Objects.equals(this.M, lbwVar.M) && this.ac == lbwVar.ac && Objects.equals(this.N, lbwVar.N) && Objects.equals(this.O, lbwVar.O) && Objects.equals(this.P, lbwVar.P) && Objects.equals(this.Q, lbwVar.Q) && this.R == lbwVar.R && this.S == lbwVar.S && Objects.equals(this.T, lbwVar.T) && this.U == lbwVar.U && this.V == lbwVar.V && this.W == lbwVar.W && this.X == lbwVar.X) {
            return true;
        }
        return false;
    }

    public final ConversationIdType f() {
        ao(0, "_id");
        return this.Y;
    }

    public final String g() {
        ao(15, "participant_normalized_destination");
        return this.aa;
    }

    public final int hashCode() {
        aday adayVar;
        int ordinal;
        int ordinal2;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        ConversationIdType conversationIdType = this.Y;
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        Uri uri = this.d;
        String str4 = this.e;
        Boolean valueOf = Boolean.valueOf(this.f);
        String str5 = this.g;
        String str6 = this.h;
        Uri uri2 = this.i;
        String str7 = this.j;
        tqc tqcVar = this.k;
        Long valueOf2 = Long.valueOf(this.Z);
        String str8 = this.l;
        String str9 = this.m;
        String str10 = this.aa;
        Integer valueOf3 = Integer.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(this.o);
        Boolean valueOf5 = Boolean.valueOf(this.p);
        Integer valueOf6 = Integer.valueOf(this.ab);
        Long valueOf7 = Long.valueOf(this.q);
        Integer valueOf8 = Integer.valueOf(this.r);
        Integer valueOf9 = Integer.valueOf(this.s);
        Boolean valueOf10 = Boolean.valueOf(this.t);
        Boolean valueOf11 = Boolean.valueOf(this.u);
        String str11 = this.v;
        Boolean valueOf12 = Boolean.valueOf(this.w);
        Boolean valueOf13 = Boolean.valueOf(this.x);
        vvh vvhVar = this.y;
        if (vvhVar == null) {
            ordinal = 0;
        } else {
            ordinal = vvhVar.ordinal();
        }
        Integer valueOf14 = Integer.valueOf(ordinal);
        MessageIdType messageIdType = this.z;
        Long valueOf15 = Long.valueOf(this.A);
        Long valueOf16 = Long.valueOf(this.B);
        Integer valueOf17 = Integer.valueOf(this.C);
        Integer valueOf18 = Integer.valueOf(this.D);
        Boolean valueOf19 = Boolean.valueOf(this.E);
        Integer valueOf20 = Integer.valueOf(this.F);
        Integer valueOf21 = Integer.valueOf(this.G);
        Integer valueOf22 = Integer.valueOf(this.H);
        String str12 = this.I;
        Integer valueOf23 = Integer.valueOf(this.J);
        String str13 = this.K;
        String str14 = this.L;
        String str15 = this.M;
        Long valueOf24 = Long.valueOf(this.ac);
        String str16 = this.N;
        String str17 = this.O;
        String str18 = this.P;
        String str19 = this.Q;
        Long valueOf25 = Long.valueOf(this.R);
        Boolean valueOf26 = Boolean.valueOf(this.S);
        String str20 = this.T;
        Boolean valueOf27 = Boolean.valueOf(this.U);
        Boolean valueOf28 = Boolean.valueOf(this.V);
        uyf uyfVar = this.W;
        if (uyfVar == null) {
            ordinal2 = 0;
        } else {
            ordinal2 = uyfVar.ordinal();
        }
        return Objects.hash(adayVar, conversationIdType, str, str2, str3, uri, str4, valueOf, str5, str6, uri2, str7, tqcVar, valueOf2, str8, str9, str10, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, str11, valueOf12, valueOf13, valueOf14, messageIdType, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, str12, valueOf23, str13, str14, str15, valueOf24, str16, str17, str18, str19, valueOf25, valueOf26, str20, valueOf27, valueOf28, Integer.valueOf(ordinal2), Long.valueOf(this.X), null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "HomeScreenQuery -- REDACTED");
        }
        return a();
    }
}
