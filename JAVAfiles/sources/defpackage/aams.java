package defpackage;

import android.content.Intent;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aams extends arrp implements arqr {
    private final /* synthetic */ int u;
    public static final aams t = new aams(20);
    public static final aams s = new aams(19);
    public static final aams r = new aams(17);
    public static final aams q = new aams(16);
    public static final aams p = new aams(15);
    public static final aams o = new aams(14);
    public static final aams n = new aams(13);
    public static final aams m = new aams(12);
    public static final aams l = new aams(11);
    public static final aams k = new aams(10);
    public static final aams j = new aams(9);
    public static final aams i = new aams(8);
    public static final aams h = new aams(7);
    public static final aams g = new aams(6);
    public static final aams f = new aams(5);
    public static final aams e = new aams(4);
    public static final aams d = new aams(3);
    public static final aams c = new aams(2);
    public static final aams b = new aams(1);
    public static final aams a = new aams(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aams(int i2) {
        super(1);
        this.u = i2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        String str;
        switch (this.u) {
            case 0:
                Intent intent = (Intent) obj;
                intent.getClass();
                return Integer.valueOf(intent.getIntExtra("messages_offset", 0));
            case 1:
                Intent intent2 = (Intent) obj;
                intent2.getClass();
                return Integer.valueOf(intent2.getIntExtra("num_messages", 1000));
            case 2:
                abac abacVar = (abac) obj;
                abacVar.getClass();
                abacVar.j("index_recent_expressive_stickers_last_used_timestamp", "11 1");
                abacVar.j("sqlite_autoindex_recent_expressive_stickers_1", "11 1");
                return arnb.a;
            case 3:
                abac abacVar2 = (abac) obj;
                abacVar2.getClass();
                abacVar2.k("2");
                return arnb.a;
            case 4:
                abac abacVar3 = (abac) obj;
                abacVar3.getClass();
                abacVar3.k("384");
                return arnb.a;
            case 5:
                abac abacVar4 = (abac) obj;
                abacVar4.getClass();
                abacVar4.k("300");
                return arnb.a;
            case 6:
                abac abacVar5 = (abac) obj;
                abacVar5.getClass();
                abacVar5.k("3");
                return arnb.a;
            case 7:
                abac abacVar6 = (abac) obj;
                abacVar6.getClass();
                abacVar6.j("index_participants_my_identity_token_foreign_key", "2520, 2520");
                abacVar6.j("index_participants_my_identity_token", "2520 630");
                abacVar6.j("index_participants_sub_id", "2520 630");
                abacVar6.j("index_participants_blocked_is_one", "1 1");
                abacVar6.j("index_participants_recipient_id", "2520 2520");
                abacVar6.j("index_participants_comparable_destination", "2520 2520");
                abacVar6.j("index_participants_cms_id", "2520 1");
                abacVar6.j("sqlite_autoindex_participants_1", "2520 1 1");
                return arnb.a;
            case 8:
                abac abacVar7 = (abac) obj;
                abacVar7.getClass();
                abacVar7.j("index_messages_my_identity_foreign_key", "182440 182440");
                abacVar7.j("index_messages_rcs_expiry", "182440 182440");
                abacVar7.j("index_messages_my_identity", "182440 182440");
                abacVar7.j("index_messages_original_rcs_message_id", "21 1");
                abacVar7.j("index_messages_satellite_datagram_id", "182440 182440");
                abacVar7.j("index_messages_self_id", "182440 91220");
                abacVar7.j("index_messages_original_message_id", "182440 182440");
                abacVar7.j("index_messages_is_hidden", "182440 91220");
                abacVar7.j("index_messages_cloud_sync_id", "182440 182440");
                abacVar7.j("index_messages_received_timestamp", "182440 1");
                abacVar7.j("index_messages_sent_timestamp", "182440 1");
                abacVar7.j("index_messages_sender_id", "182440 192");
                abacVar7.j("index_messages_sms_message_uri", "182440 2");
                abacVar7.j("index_messages_cms_correlation_id", "182440 1");
                abacVar7.j("rcs_message_id_and_seen_index", "182440 8293 8293");
                abacVar7.j("index_messages_cms_id", "182440 1");
                abacVar7.j("index_messages_web_id", "182440 182440");
                abacVar7.j("index_messages_read_0", "4 4");
                abacVar7.j("index_messages_ui_sort", "182440 73 1");
                abacVar7.j("index_messages_rcs_message_id", "182440 182440 182440");
                abacVar7.j("index_messages_sort", "182440 73 53 1");
                abacVar7.j("index_messages_status_seen", "182440 12163 12163");
                return arnb.a;
            case 9:
                abac abacVar8 = (abac) obj;
                abacVar8.getClass();
                abacVar8.j("index_parts_local_cache_path", "40 1");
                abacVar8.j("index_parts_file_size_bytes", "440 220");
                abacVar8.j("index_parts_conversation_id", "200369 80");
                abacVar8.j("index_parts_content_type", "200369 50093");
                abacVar8.j("index_parts_message_id", "200369 1");
                return arnb.a;
            case 10:
                abac abacVar9 = (abac) obj;
                abacVar9.getClass();
                abacVar9.j("index_conversations_destination_token", "2512 2512");
                abacVar9.j("index_conversations_cms_correlation_id", "2512 2512");
                abacVar9.j("index_conversations_current_my_identity_foreign_key", "2512 2512");
                abacVar9.j("index_conversations_participant_normalized_destination", "2512 1");
                abacVar9.j("index_conversations_rcs_group_id", "2 1");
                abacVar9.j("index_conversations_normalized_participant_id_list", "2512 2512");
                abacVar9.j("index_conversations_participant_comparable_destination", "2512 2512");
                abacVar9.j("index_conversations_cms_id", "2512 1");
                abacVar9.j("index_conversations_delete_timestamp", "2512 2512");
                abacVar9.j("index_conversations_rcs_session_id", "2512 2512");
                abacVar9.j("index_conversations_sort_timestamp", "2512 2");
                abacVar9.j("index_conversations_archive_status", "2512 838");
                abacVar9.j("index_conversations_sms_thread_id", "2512 628");
                return arnb.a;
            case 11:
                abac abacVar10 = (abac) obj;
                abacVar10.getClass();
                abacVar10.j("index_conversation_participants_participant_id", "2520 1");
                abacVar10.j("index_conversation_participants_conversation_id", "2520 1");
                abacVar10.j("sqlite_autoindex_conversation_participants_1", "2520 1 1 1");
                return arnb.a;
            case 12:
                abac abacVar11 = (abac) obj;
                abacVar11.getClass();
                abacVar11.j("index_conversation_to_participants_participant_id", "2522 1");
                abacVar11.j("index_conversation_to_participants_conversation_id", "2522 1");
                abacVar11.j("sqlite_autoindex_conversation_to_participants_1", "2522 1 1");
                return arnb.a;
            case 13:
                abac abacVar12 = (abac) obj;
                abacVar12.getClass();
                abacVar12.j("index_contacts_phonebook_label", "98 5");
                abacVar12.j("contacts_sort", "98 5 2");
                abacVar12.j("index_contacts_phone_number", "98 1");
                abacVar12.j("index_contacts_lookup_key", "98 2");
                abacVar12.j("index_contacts_contact_id", "98 2");
                abacVar12.j("index_contacts_cp2_id", "98 1");
                return arnb.a;
            case 14:
                abac abacVar13 = (abac) obj;
                abacVar13.getClass();
                abacVar13.j("index_read_reports_message_id", "6 1");
                abacVar13.j("sqlite_autoindex_read_reports_1", "6 1 1");
                return arnb.a;
            case 15:
                abac abacVar14 = (abac) obj;
                abacVar14.getClass();
                abacVar14.j("index_subscriptions_my_identity_token_with_foreign_key", "3 3");
                abacVar14.j("index_subscriptions_my_identity_token", "3 1");
                abacVar14.j("sqlite_autoindex_subscriptions_1", "3 1 1");
                return arnb.a;
            case 16:
                return Boolean.valueOf(((lxw) obj).c());
            case 17:
                return Boolean.valueOf(((lxw) obj).b());
            case 18:
                adjf adjfVar = (adjf) obj;
                adjfVar.getClass();
                return adji.p(adjfVar);
            case 19:
                aech aechVar = (aech) obj;
                aechVar.getClass();
                Object obj2 = aechVar.a.get("/internal/moirai_default/1");
                obj2.getClass();
                iad iadVar = ((hzh) obj2).e;
                if (iadVar == null) {
                    iadVar = iad.a;
                }
                hzz hzzVar = iadVar.c;
                if (hzzVar == null) {
                    hzzVar = hzz.a;
                }
                if (1 != (hzzVar.b & 1)) {
                    hzzVar = null;
                }
                if (hzzVar != null) {
                    str = hzzVar.c;
                } else {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    return null;
                }
                return str;
            default:
                ((Map.Entry) obj).getClass();
                return Boolean.valueOf(!d.F((String) r5.getKey(), "device_tier"));
        }
    }
}
