package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vom {
    public vom() {
    }

    public static boolean a(String str) {
        if (str != null && str.startsWith("proto:")) {
            return true;
        }
        return false;
    }

    public static final String b(String str) {
        str.getClass();
        return "~".concat(str);
    }

    public static /* synthetic */ String c(String str, String str2, vox voxVar) {
        voxVar.getClass();
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
        } else {
            str = str2;
        }
        if (str != null && voxVar == vox.PROFILE_PEOPLE_SHARING_SOURCE) {
            return "~".concat(str);
        }
        return str;
    }

    public static final voq d(vos vosVar) {
        String str = vosVar.c;
        String str2 = vosVar.d;
        String str3 = vosVar.e;
        vox b = vox.b(vosVar.f);
        if (b == null) {
            b = vox.UNRECOGNIZED;
        }
        vox voxVar = b;
        voxVar.getClass();
        return new voq(str, str2, str3, voxVar, false, 16);
    }

    public static final vor e(vot votVar) {
        Uri parse;
        String str = votVar.c;
        str.getClass();
        if (str.length() == 0) {
            parse = null;
        } else {
            parse = Uri.parse(votVar.c);
        }
        vox b = vox.b(votVar.d);
        if (b == null) {
            b = vox.UNRECOGNIZED;
        }
        b.getClass();
        return new vor(parse, b, false, 4);
    }

    public static final boolean f(qei qeiVar, apwq apwqVar) {
        qeiVar.getClass();
        if (apwqVar == null || !d.F(qeiVar.d, "+18339913448") || !d.F((Boolean) wam.i(apwqVar, vxt.RCS_PENPAL_NAMESPACE, "jakgvfknopmmo").map(new viu(vnk.a, 5)).orElse(false), true) || g(apwqVar) == null) {
            return false;
        }
        return true;
    }

    public static final xwb g(apwq apwqVar) {
        String str;
        if (apwqVar != null && (str = (String) arsd.k(wam.i(apwqVar, vxt.RCS_PENPAL_NAMESPACE, "zxmckmnbniuoip"))) != null && str.length() != 0) {
            return new xwb(str);
        }
        return null;
    }

    public static final apwq h(apwq apwqVar) {
        vxu b = vxu.b(apwqVar);
        b.d(vxt.RCS_PENPAL_NAMESPACE, "jakgvfknopmmo", "true");
        apwq c = b.c();
        c.getClass();
        return c;
    }

    public static final apwq i(apwq apwqVar, xwb xwbVar) {
        vxu b = vxu.b(apwqVar);
        b.d(vxt.RCS_PENPAL_NAMESPACE, "zxmckmnbniuoip", (String) xwbVar.a);
        apwq c = b.c();
        c.getClass();
        return c;
    }

    public static final void j(Context context, String str) {
        aiut.e(new ung(context, str, 10));
    }

    public static /* synthetic */ String k(int i) {
        if (i != 1) {
            if (i != 2) {
                return "RCS_DELIVERY";
            }
            return "DOWNLOAD";
        }
        return "SEND";
    }

    public static int l(vhv vhvVar) {
        return vhvVar.c().F;
    }

    public static sas m(ConversationIdType conversationIdType) {
        sat n = n();
        n.d(new ryu(conversationIdType, 13));
        return n.b();
    }

    public static sat n() {
        String str;
        sat b = sav.b();
        b.w("+ConversationListQueries#makeBuilder");
        b.t((agmh) sav.b.b);
        b.n(sni.c.g, "SNIPPET_TO_USE");
        b.n(sam.h, "unread_conversations");
        b.n(sam.f, "conversation_contains_vsms_participant");
        b.n(sam.g, "earliest_reminder_trigger_time");
        b.o(sam.e, sam.d);
        String str2 = sam.c;
        if (((Boolean) ((utz) ier.i.get()).e()).booleanValue()) {
            str = sam.a;
        } else {
            str = "0";
        }
        b.o(str2, str);
        b.q();
        b.n(ugz.b, "unread_message_count");
        if (uzz.d()) {
            b.n(uze.a, "conversation_contains_matrix_participant");
        }
        return b;
    }

    public static sag o(ConversationIdType conversationIdType) {
        sah p = p();
        p.d(new ryu(conversationIdType, 12));
        return p.b();
    }

    public static sah p() {
        String str;
        sah a = saj.a();
        a.w("+ConversationListFromConversationToParticipantsQueries#makeBuilder");
        a.t((agmh) saj.b.b);
        a.n(sni.c.g, "SNIPPET_TO_USE");
        a.n(sam.h, "unread_conversations");
        a.n(sam.f, "conversation_contains_vsms_participant");
        a.n(sam.g, "earliest_reminder_trigger_time");
        a.o(sam.e, sam.d);
        String str2 = sam.c;
        if (((Boolean) ((utz) ier.i.get()).e()).booleanValue()) {
            str = sam.b;
        } else {
            str = "0";
        }
        a.o(str2, str);
        a.q();
        a.n(ugz.b, "unread_message_count");
        if (uzz.d()) {
            a.n(uze.a, "conversation_contains_matrix_participant");
        }
        return a;
    }

    public static /* synthetic */ void q() {
        alok alokVar = new alok();
        alokVar.h("conversations.name_is_automatic", 10012);
        alokVar.h("conversations.etouffee_default", 29060);
        alokVar.h("conversations.current_my_identity_foreign_key", 60160);
        alokVar.h("conversations.source_type", 8500);
        alokVar.h("conversations.rcs_session_id", 10000);
        alokVar.h("conversations.join_state", 10006);
        alokVar.h("conversations.conv_type", 10007);
        alokVar.h("conversations.send_mode", 10016);
        alokVar.h("conversations.IS_ENTERPRISE", 10018);
        alokVar.h("conversations.has_ea2p_bot_recipient", 12001);
        alokVar.h("conversations.participant_display_destination", 15010);
        alokVar.h("conversations.delete_timestamp", 29020);
        alokVar.h("conversations.cms_id", 32000);
        alokVar.h("conversations.rcs_group_id", 40050);
        alokVar.h("conversations.rcs_conference_uri", 40050);
        alokVar.h("conversations.rcs_session_allows_revocation", 48040);
        alokVar.h("conversations.awaiting_reverse_sync", 49060);
        alokVar.h("conversations.error_state", 58140);
        alokVar.h("conversations.rcs_group_last_sync_timestamp", 58910);
        alokVar.h("conversations.has_been_e2ee", 59210);
        alokVar.h("conversations.marked_as_unread", 59220);
        alokVar.h("messages.sms_error_code", 9000);
        alokVar.h("messages.sms_error_desc_map_name", 9000);
        alokVar.h("participants.directory_id", 35010);
        alokVar.b();
    }

    public static /* synthetic */ void r() {
        alok alokVar = new alok();
        alokVar.h("sms_thread_id", "index_null_sms_thread_id");
        alokVar.h("archive_status", "index_null_archive_status");
        alokVar.h("sort_timestamp", "index_null_sort_timestamp");
        alokVar.h("participant_normalized_destination", "index_null_participant_normalized_destination");
        alokVar.h("current_my_identity_foreign_key", "index_null_current_my_identity_foreign_key");
        alokVar.h("rcs_session_id", "index_null_rcs_session_id");
        alokVar.h("delete_timestamp", "index_null_delete_timestamp");
        alokVar.h("cms_id", "index_null_cms_id");
        alokVar.h("rcs_group_id", "index_null_rcs_group_id");
        alokVar.h("awaiting_reverse_sync", "index_null_awaiting_reverse_sync");
        alokVar.h("marked_as_unread", "index_null_marked_as_unread");
        alokVar.b();
    }

    public static /* synthetic */ void s() {
        alok alokVar = new alok();
        alokVar.h("sender_id", "index_null_sender_id");
        alokVar.h("sent_timestamp", "index_null_sent_timestamp");
        alokVar.h("read", "index_messages_read_0");
        alokVar.h("sms_message_uri", "index_null_sms_message_uri");
        alokVar.h("rcs_expiry", "index_null_rcs_expiry");
        alokVar.h("self_id", "index_null_self_id");
        alokVar.h("my_identity", "index_null_my_identity");
        alokVar.h("my_identity_foreign_key", "index_null_my_identity_foreign_key");
        alokVar.h("cloud_sync_id", "index_null_cloud_sync_id");
        alokVar.h(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, "index_null_verification_status");
        alokVar.h("cms_id", "index_null_cms_id");
        alokVar.h("web_id", "index_null_web_id");
        alokVar.h("original_rcs_message_id", "index_null_original_rcs_message_id");
        alokVar.h("cms_correlation_id", "index_null_cms_correlation_id");
        alokVar.h("group_private_participant", "index_null_group_private_participant");
        alokVar.h("original_message_id", "index_null_original_message_id");
        alokVar.h("awaiting_reverse_sync", "index_null_awaiting_reverse_sync");
        alokVar.h("draft_id", "index_null_draft_id");
        alokVar.h("satellite_datagram_id", "index_null_satellite_datagram_id");
        alokVar.h("message_persistence_id", "index_null_message_persistence_id");
        alokVar.b();
    }

    public static /* synthetic */ String t(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "null";
                }
                return "DELETE";
            }
            return "UPDATE";
        }
        return "INSERT";
    }

    public static final int u(agpc agpcVar, rpo rpoVar, long j, int i) {
        rpoVar.getClass();
        agpcVar.n(rpoVar.b, "table_name");
        agpcVar.n(new agpk("$V", new Object[]{Long.valueOf(j)}), "status");
        return v(agpcVar.b(), i);
    }

    public static final int v(agpj agpjVar, int i) {
        agpjVar.getClass();
        String g = agnc.g(i);
        String[] strArr = sfz.a;
        agpk agpkVar = new agpk("INSERT $R INTO $V ($V,$V,$V,$V) SELECT backup_id, bugle_id, table_name, status FROM ($V)", new Object[]{g, "backup_id_map", ((agmh) sfz.d.e).d(), ((agmh) sfz.d.f).d(), ((agmh) sfz.d.d).d(), ((agmh) sfz.d.a).d(), agpjVar});
        agnw d = agnc.d("$primary");
        SQLiteStatement compileStatement = d.j().compileStatement(agpkVar.ad(new agpo(null, agpf.a().b(), true, null)));
        compileStatement.getClass();
        return d.c(compileStatement, new agni("BackupIdMapTable-insert"));
    }

    public static /* synthetic */ agog w(agmh agmhVar, rpo rpoVar, String str, boolean z, int i) {
        rpoVar.getClass();
        sfw sfwVar = new sfw(sfz.a);
        boolean z2 = false;
        int i2 = 1;
        if ((i & 8) != 0) {
            sfwVar.c((sfs) sfz.d.f);
        } else {
            sfwVar.s();
        }
        if ((i & 16) == 0) {
            z2 = true;
        }
        if (z & z2) {
            sfwVar.d(new rbw(rpoVar, 20));
        } else {
            sfwVar.d(new rpf(rpoVar, i2));
        }
        if ((i & 4) != 0) {
            str = null;
        }
        agog b = agoh.b(sfwVar.b(), (agmh) sfz.d.e, agmhVar);
        if (str != null) {
            b.f = str;
        }
        return b;
    }

    public static agmh[] z() {
        return (agmh[]) rkz.e.b;
    }

    public vom(qdx qdxVar) {
        qdxVar.getClass();
    }

    public vom(byte[] bArr) {
        int i = arsc.a;
        new arrh(vom.class);
    }
}
