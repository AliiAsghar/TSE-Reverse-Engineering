package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sni extends aglo {
    public static final String[] a = {"conversations._id", "conversations.sms_thread_id", "conversations.name", "conversations.name_is_automatic", "conversations.subtitle", "conversations.latest_message_id", "conversations.snippet_text", "conversations.subject_text", "conversations.preview_uri", "conversations.preview_content_type", "conversations.show_draft", "conversations.draft_snippet_text", "conversations.draft_subject_text", "conversations.draft_preview_uri", "conversations.draft_preview_content_type", "conversations.etouffee_default", "conversations.archive_status", "conversations.sort_timestamp", "conversations.last_read_timestamp", "conversations.icon", "conversations.participant_contact_id", "conversations.normalized_participant_contact_id", "conversations.participant_lookup_key", "conversations.normalized_participant_lookup_key", "conversations.participant_normalized_destination", "conversations.participant_comparable_destination", "conversations.current_self_id", "conversations.current_my_identity_foreign_key", "conversations.destination_token", "conversations.participant_count", "conversations.notification_enabled", "conversations.notification_sound_uri", "conversations.notification_vibration", "conversations.include_email_addr", "conversations.sms_service_center", "conversations.participant_id_list", "conversations.normalized_participant_id_list", "conversations.source_type", "conversations.rcs_session_id", "conversations.join_state", "conversations.conv_type", "conversations.send_mode", "conversations.IS_ENTERPRISE", "conversations.has_ea2p_bot_recipient", "conversations.last_interactive_event_timestamp", "conversations.participant_display_destination", "conversations.normalized_participant_display_destination", "conversations.spam_warning_dismiss_status", "conversations.open_count", "conversations.last_logged_scooby_metadata_timestamp", "conversations.delete_timestamp", "conversations.cms_id", "conversations.rcs_group_id", "conversations.rcs_conference_uri", "conversations.tachygram_group_routing_info_token", "conversations.cms_most_recent_read_message_timestamp_ms", "conversations.rcs_subject_change_timestamp_ms", "conversations.rcs_session_allows_revocation", "conversations.rcs_group_capabilities", "conversations.awaiting_reverse_sync", "conversations.duplicate_of", "conversations.new_duplicate_of", "conversations.error_state", "conversations.cms_life_cycle", "conversations.rcs_group_self_msisdn", "conversations.recipient_offline_timestamp_ms", "conversations.rcs_group_last_sync_timestamp", "conversations.has_been_e2ee", "conversations.marked_as_unread", "conversations.custom_theme", "conversations.mms_group_upgrade_status", "conversations.mms_group_upgrade_retries", "conversations.encryption_protocol", "conversations.encryption_id", "conversations.cms_correlation_id"};
    public static final alor b;
    public static final smu c;
    public static final int[] d;
    public static final int[] e;

    static {
        alok alokVar = new alok();
        alokVar.h("conversations.name_is_automatic", 10012);
        alokVar.h("conversations.subtitle", 59760);
        alokVar.h("conversations.etouffee_default", 29060);
        alokVar.h("conversations.normalized_participant_contact_id", 58090);
        alokVar.h("conversations.normalized_participant_lookup_key", 58090);
        alokVar.h("conversations.participant_comparable_destination", 58090);
        alokVar.h("conversations.current_my_identity_foreign_key", 60160);
        alokVar.h("conversations.destination_token", 60360);
        alokVar.h("conversations.participant_id_list", 8500);
        alokVar.h("conversations.normalized_participant_id_list", 58090);
        alokVar.h("conversations.source_type", 8500);
        alokVar.h("conversations.rcs_session_id", 10000);
        alokVar.h("conversations.join_state", 10006);
        alokVar.h("conversations.conv_type", 10007);
        alokVar.h("conversations.send_mode", 10016);
        alokVar.h("conversations.IS_ENTERPRISE", 10018);
        alokVar.h("conversations.has_ea2p_bot_recipient", 12001);
        alokVar.h("conversations.last_interactive_event_timestamp", 15000);
        alokVar.h("conversations.participant_display_destination", 15010);
        alokVar.h("conversations.normalized_participant_display_destination", 58090);
        alokVar.h("conversations.spam_warning_dismiss_status", 23000);
        alokVar.h("conversations.open_count", 26020);
        alokVar.h("conversations.last_logged_scooby_metadata_timestamp", 28010);
        alokVar.h("conversations.delete_timestamp", 29020);
        alokVar.h("conversations.cms_id", 32000);
        alokVar.h("conversations.rcs_group_id", 40050);
        alokVar.h("conversations.rcs_conference_uri", 40050);
        alokVar.h("conversations.tachygram_group_routing_info_token", 58120);
        alokVar.h("conversations.cms_most_recent_read_message_timestamp_ms", 53030);
        alokVar.h("conversations.rcs_subject_change_timestamp_ms", 46050);
        alokVar.h("conversations.rcs_session_allows_revocation", 48040);
        alokVar.h("conversations.rcs_group_capabilities", 49020);
        alokVar.h("conversations.awaiting_reverse_sync", 49060);
        alokVar.h("conversations.duplicate_of", 58090);
        alokVar.h("conversations.new_duplicate_of", 59130);
        alokVar.h("conversations.error_state", 58140);
        alokVar.h("conversations.cms_life_cycle", 58210);
        alokVar.h("conversations.rcs_group_self_msisdn", 58540);
        alokVar.h("conversations.recipient_offline_timestamp_ms", 58750);
        alokVar.h("conversations.rcs_group_last_sync_timestamp", 58910);
        alokVar.h("conversations.has_been_e2ee", 59210);
        alokVar.h("conversations.marked_as_unread", 59220);
        alokVar.h("conversations.custom_theme", 59820);
        alokVar.h("conversations.mms_group_upgrade_status", 60050);
        alokVar.h("conversations.mms_group_upgrade_retries", 60050);
        alokVar.h("conversations.encryption_protocol", 60180);
        alokVar.h("conversations.encryption_id", 60210);
        alokVar.h("conversations.cms_correlation_id", 60250);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("sms_thread_id", "index_conversations_sms_thread_id");
        alokVar2.h("archive_status", "index_conversations_archive_status");
        alokVar2.h("sort_timestamp", "index_conversations_sort_timestamp");
        alokVar2.h("participant_normalized_destination", "index_conversations_participant_normalized_destination");
        alokVar2.h("participant_comparable_destination", "index_conversations_participant_comparable_destination");
        alokVar2.h("current_my_identity_foreign_key", "index_conversations_current_my_identity_foreign_key");
        alokVar2.h("destination_token", "index_conversations_destination_token");
        alokVar2.h("normalized_participant_id_list", "index_conversations_normalized_participant_id_list");
        alokVar2.h("rcs_session_id", "index_conversations_rcs_session_id");
        alokVar2.h("delete_timestamp", "index_conversations_delete_timestamp");
        alokVar2.h("cms_id", "index_conversations_cms_id");
        alokVar2.h("rcs_group_id", "index_conversations_rcs_group_id");
        alokVar2.h("awaiting_reverse_sync", "index_conversations_awaiting_reverse_sync");
        alokVar2.h("duplicate_of", "index_conversations_duplicate_of");
        alokVar2.h("new_duplicate_of", "index_conversations_new_duplicate_of");
        alokVar2.h("marked_as_unread", "index_conversations_marked_as_unread");
        alokVar2.h("cms_correlation_id", "index_conversations_cms_correlation_id");
        alokVar2.b();
        c = new smu();
        d = new int[]{8500, 10000, 10006, 10007, 10012, 10016, 10018, 12001, 15000, 15010, 23000, 26020, 28010, 29020, 29060, 32000, 40050, 46050, 48040, 49020, 49060, 53030, 58090, 58120, 58140, 58210, 58370, 58390, 58540, 58750, 58910, 59130, 59180, 59210, 59220, 59260, 59760, 59810, 59820, 60050, 60160, 60180, 60210, 60250, 60310, 60360};
        e = new int[]{57040};
    }

    public static smr a(ConversationIdType conversationIdType) {
        snf e2 = e();
        e2.w("conversations.queryOnId");
        snh snhVar = new snh();
        snhVar.j(conversationIdType);
        e2.g(snhVar);
        return (smr) agnc.b(e2.b());
    }

    public static smr b(ConversationIdType conversationIdType) {
        return (smr) h(conversationIdType, new sho(3));
    }

    public static smt c() {
        int i = ske.a;
        return new smt();
    }

    public static smt d() {
        int i = ske.a;
        smt smtVar = new smt();
        smtVar.aD();
        return smtVar;
    }

    public static final snf e() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("conversations._id");
            alobVar.h("conversations.sms_thread_id");
            alobVar.h("conversations.name");
            if (valueOf.intValue() >= 10012) {
                alobVar.h("conversations.name_is_automatic");
            }
            if (valueOf.intValue() >= 59760) {
                alobVar.h("conversations.subtitle");
            }
            alobVar.h("conversations.latest_message_id");
            alobVar.h("conversations.snippet_text");
            alobVar.h("conversations.subject_text");
            alobVar.h("conversations.preview_uri");
            alobVar.h("conversations.preview_content_type");
            alobVar.h("conversations.show_draft");
            alobVar.h("conversations.draft_snippet_text");
            alobVar.h("conversations.draft_subject_text");
            alobVar.h("conversations.draft_preview_uri");
            alobVar.h("conversations.draft_preview_content_type");
            if (valueOf.intValue() >= 29060) {
                alobVar.h("conversations.etouffee_default");
            }
            alobVar.h("conversations.archive_status");
            alobVar.h("conversations.sort_timestamp");
            alobVar.h("conversations.last_read_timestamp");
            alobVar.h("conversations.icon");
            alobVar.h("conversations.participant_contact_id");
            if (valueOf.intValue() >= 58090) {
                alobVar.h("conversations.normalized_participant_contact_id");
            }
            alobVar.h("conversations.participant_lookup_key");
            if (valueOf.intValue() >= 58090) {
                alobVar.h("conversations.normalized_participant_lookup_key");
            }
            alobVar.h("conversations.participant_normalized_destination");
            if (valueOf.intValue() >= 58090) {
                alobVar.h("conversations.participant_comparable_destination");
            }
            alobVar.h("conversations.current_self_id");
            if (valueOf.intValue() >= 60160) {
                alobVar.h("conversations.current_my_identity_foreign_key");
            }
            if (valueOf.intValue() >= 60360) {
                alobVar.h("conversations.destination_token");
            }
            alobVar.h("conversations.participant_count");
            alobVar.h("conversations.notification_enabled");
            alobVar.h("conversations.notification_sound_uri");
            alobVar.h("conversations.notification_vibration");
            alobVar.h("conversations.include_email_addr");
            alobVar.h("conversations.sms_service_center");
            if (valueOf.intValue() >= 8500) {
                alobVar.h("conversations.participant_id_list");
            }
            if (valueOf.intValue() >= 58090) {
                alobVar.h("conversations.normalized_participant_id_list");
            }
            if (valueOf.intValue() >= 8500) {
                alobVar.h("conversations.source_type");
            }
            if (valueOf.intValue() >= 10000) {
                alobVar.h("conversations.rcs_session_id");
            }
            if (valueOf.intValue() >= 10006) {
                alobVar.h("conversations.join_state");
            }
            if (valueOf.intValue() >= 10007) {
                alobVar.h("conversations.conv_type");
            }
            if (valueOf.intValue() >= 10016) {
                alobVar.h("conversations.send_mode");
            }
            if (valueOf.intValue() >= 10018) {
                alobVar.h("conversations.IS_ENTERPRISE");
            }
            if (valueOf.intValue() >= 12001) {
                alobVar.h("conversations.has_ea2p_bot_recipient");
            }
            if (valueOf.intValue() >= 15000) {
                alobVar.h("conversations.last_interactive_event_timestamp");
            }
            if (valueOf.intValue() >= 15010) {
                alobVar.h("conversations.participant_display_destination");
            }
            if (valueOf.intValue() >= 58090) {
                alobVar.h("conversations.normalized_participant_display_destination");
            }
            if (valueOf.intValue() >= 23000) {
                alobVar.h("conversations.spam_warning_dismiss_status");
            }
            if (valueOf.intValue() >= 26020) {
                alobVar.h("conversations.open_count");
            }
            if (valueOf.intValue() >= 28010) {
                alobVar.h("conversations.last_logged_scooby_metadata_timestamp");
            }
            if (valueOf.intValue() >= 29020) {
                alobVar.h("conversations.delete_timestamp");
            }
            if (valueOf.intValue() >= 32000) {
                alobVar.h("conversations.cms_id");
            }
            if (valueOf.intValue() >= 40050) {
                alobVar.h("conversations.rcs_group_id");
            }
            if (valueOf.intValue() >= 40050) {
                alobVar.h("conversations.rcs_conference_uri");
            }
            if (valueOf.intValue() >= 58120) {
                alobVar.h("conversations.tachygram_group_routing_info_token");
            }
            if (valueOf.intValue() >= 53030) {
                alobVar.h("conversations.cms_most_recent_read_message_timestamp_ms");
            }
            if (valueOf.intValue() >= 46050) {
                alobVar.h("conversations.rcs_subject_change_timestamp_ms");
            }
            if (valueOf.intValue() >= 48040) {
                alobVar.h("conversations.rcs_session_allows_revocation");
            }
            if (valueOf.intValue() >= 49020) {
                alobVar.h("conversations.rcs_group_capabilities");
            }
            if (valueOf.intValue() >= 49060) {
                alobVar.h("conversations.awaiting_reverse_sync");
            }
            if (valueOf.intValue() >= 58090) {
                alobVar.h("conversations.duplicate_of");
            }
            if (valueOf.intValue() >= 59130) {
                alobVar.h("conversations.new_duplicate_of");
            }
            if (valueOf.intValue() >= 58140) {
                alobVar.h("conversations.error_state");
            }
            if (valueOf.intValue() >= 58210) {
                alobVar.h("conversations.cms_life_cycle");
            }
            if (valueOf.intValue() >= 58540) {
                alobVar.h("conversations.rcs_group_self_msisdn");
            }
            if (valueOf.intValue() >= 58750) {
                alobVar.h("conversations.recipient_offline_timestamp_ms");
            }
            if (valueOf.intValue() >= 58910) {
                alobVar.h("conversations.rcs_group_last_sync_timestamp");
            }
            if (valueOf.intValue() >= 59210) {
                alobVar.h("conversations.has_been_e2ee");
            }
            if (valueOf.intValue() >= 59220) {
                alobVar.h("conversations.marked_as_unread");
            }
            if (valueOf.intValue() >= 59820) {
                alobVar.h("conversations.custom_theme");
            }
            if (valueOf.intValue() >= 60050) {
                alobVar.h("conversations.mms_group_upgrade_status");
            }
            if (valueOf.intValue() >= 60050) {
                alobVar.h("conversations.mms_group_upgrade_retries");
            }
            if (valueOf.intValue() >= 60180) {
                alobVar.h("conversations.encryption_protocol");
            }
            if (valueOf.intValue() >= 60210) {
                alobVar.h("conversations.encryption_id");
            }
            if (valueOf.intValue() >= 60250) {
                alobVar.h("conversations.cms_correlation_id");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new snf(strArr);
    }

    public static Object f(ConversationIdType conversationIdType, Function function, Supplier supplier) {
        Object obj;
        Object apply;
        smr a2 = a(conversationIdType);
        if (a2 != null) {
            apply = function.apply(a2);
            return apply;
        }
        obj = supplier.get();
        return obj;
    }

    public static Object g(ConversationIdType conversationIdType, Function function) {
        Object apply;
        smr a2 = a(conversationIdType);
        if (a2 == null) {
            return null;
        }
        apply = function.apply(a2);
        return apply;
    }

    public static Object h(ConversationIdType conversationIdType, Function function) {
        Object apply;
        smr a2 = a(conversationIdType);
        if (a2 != null) {
            apply = function.apply(a2);
            return apply;
        }
        throw new IllegalStateException("row not found");
    }

    public static String i(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sms_thread_id INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name_is_automatic INTEGER DEFAULT(1)");
        if (i >= 59760) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("subtitle TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("latest_message_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("snippet_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subject_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_content_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("show_draft INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("draft_snippet_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("draft_subject_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("draft_preview_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("draft_preview_content_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("etouffee_default INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("archive_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sort_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_read_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("icon TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_contact_id INT DEFAULT(-1)");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("normalized_participant_contact_id INT DEFAULT(-1)");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_lookup_key TEXT");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("normalized_participant_lookup_key TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_normalized_destination TEXT");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("participant_comparable_destination TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("current_self_id TEXT");
        if (i >= 59810) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("current_my_identity TEXT");
        }
        if (i >= 60160) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("current_my_identity_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        }
        if (i >= 60360) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("destination_token TEXT REFERENCES destinations(token) ON DELETE RESTRICT ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_count INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("notification_enabled INT DEFAULT(1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("notification_sound_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("notification_vibration INT DEFAULT(1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("include_email_addr INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sms_service_center TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id_list TEXT");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("normalized_participant_id_list TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("source_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_session_id INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("join_state INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conv_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("send_mode INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("IS_ENTERPRISE INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("has_ea2p_bot_recipient INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_interactive_event_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_display_destination TEXT");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("normalized_participant_display_destination TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("spam_warning_dismiss_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("open_count INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_logged_scooby_metadata_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("delete_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_conference_uri TEXT");
        if (i >= 58120) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("tachygram_group_routing_info_token BLOB");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_most_recent_read_message_timestamp_ms INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_subject_change_timestamp_ms INTEGER DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_session_allows_revocation INT DEFAULT(1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_capabilities INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("awaiting_reverse_sync INT DEFAULT(0)");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("duplicate_of INTEGER REFERENCES conversations(_id)  ");
        }
        if (i >= 59130) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("new_duplicate_of INTEGER REFERENCES conversations(_id) ON DELETE SET NULL ");
        }
        if (i >= 58140) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("error_state INT");
        }
        if (i >= 58210) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_life_cycle INT DEFAULT(0)");
        }
        if (i >= 58540) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("rcs_group_self_msisdn TEXT");
        }
        if (i >= 58750) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("recipient_offline_timestamp_ms INTEGER DEFAULT(-1)");
        }
        if (i >= 58910) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("rcs_group_last_sync_timestamp INTEGER DEFAULT(-1)");
        }
        if (i >= 59210) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("has_been_e2ee INT DEFAULT(0)");
        }
        if (i >= 59220) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("marked_as_unread INT DEFAULT(0)");
        }
        if (i >= 59820) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("custom_theme BLOB");
        }
        if (i >= 60050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("mms_group_upgrade_status INTEGER DEFAULT(0)");
        }
        if (i >= 60050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("mms_group_upgrade_retries INTEGER DEFAULT(0)");
        }
        if (i >= 60180) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("encryption_protocol INTEGER DEFAULT(0)");
        }
        if (i >= 60210) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("encryption_id TEXT");
        }
        if (i >= 60250) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_correlation_id TEXT");
        }
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void j(ConversationIdType conversationIdType, Consumer consumer) {
        smr a2 = a(conversationIdType);
        if (a2 != null) {
            consumer.accept(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] k(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversations_sms_thread_id");
        arrayList.add("CREATE INDEX index_conversations_sms_thread_id ON conversations(sms_thread_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_archive_status");
        arrayList.add("CREATE INDEX index_conversations_archive_status ON conversations(archive_status);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_sort_timestamp");
        arrayList.add("CREATE INDEX index_conversations_sort_timestamp ON conversations(sort_timestamp);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_rcs_session_id");
        arrayList.add("CREATE INDEX index_conversations_rcs_session_id ON conversations(rcs_session_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_delete_timestamp");
        arrayList.add("CREATE INDEX index_conversations_delete_timestamp ON conversations(delete_timestamp);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_cms_id");
        arrayList.add("CREATE UNIQUE INDEX index_conversations_cms_id ON conversations(cms_id);");
        if (i >= 58090) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_participant_comparable_destination");
            arrayList.add("CREATE UNIQUE INDEX index_conversations_participant_comparable_destination ON conversations(participant_comparable_destination);");
        }
        if (i >= 58090) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_normalized_participant_id_list");
            arrayList.add("CREATE UNIQUE INDEX index_conversations_normalized_participant_id_list ON conversations(normalized_participant_id_list);");
        }
        if (i >= 58120) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_rcs_group_id");
            arrayList.add("CREATE INDEX index_conversations_rcs_group_id ON conversations(rcs_group_id) WHERE rcs_group_id NOT NULL;");
        }
        if (i >= 58370) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_awaiting_reverse_sync");
            arrayList.add("CREATE INDEX index_conversations_awaiting_reverse_sync ON conversations(awaiting_reverse_sync) WHERE awaiting_reverse_sync = 1;");
        }
        if (i >= 58390) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_participant_normalized_destination");
            arrayList.add("CREATE INDEX index_conversations_participant_normalized_destination ON conversations(participant_normalized_destination);");
        }
        if (i >= 59180) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_duplicate_of");
            arrayList.add("CREATE INDEX index_conversations_duplicate_of ON conversations(duplicate_of) WHERE duplicate_of NOT NULL;");
        }
        if (i >= 59180) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_new_duplicate_of");
            arrayList.add("CREATE INDEX index_conversations_new_duplicate_of ON conversations(new_duplicate_of) WHERE new_duplicate_of NOT NULL;");
        }
        if (i >= 59260) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_marked_as_unread");
            arrayList.add("CREATE INDEX index_conversations_marked_as_unread ON conversations(marked_as_unread) WHERE marked_as_unread = 1;");
        }
        if (i >= 60160) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_current_my_identity_foreign_key");
            arrayList.add("CREATE INDEX index_conversations_current_my_identity_foreign_key ON conversations(current_my_identity_foreign_key);");
        }
        if (i >= 60310) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_cms_correlation_id");
            arrayList.add("CREATE UNIQUE INDEX index_conversations_cms_correlation_id ON conversations(cms_correlation_id);");
        }
        if (i >= 60360) {
            arrayList.add("DROP INDEX IF EXISTS index_conversations_destination_token");
            arrayList.add("CREATE INDEX index_conversations_destination_token ON conversations(destination_token);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
