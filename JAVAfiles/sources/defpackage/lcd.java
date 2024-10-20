package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcd {
    public static final String[] a = {"conversations._id", "conversations.name", "conversations.snippet_text", "conversations.subject_text", "conversations.preview_uri", "conversations.preview_content_type", "conversations.show_draft", "conversations.draft_snippet_text", "conversations.draft_subject_text", "conversations.draft_preview_uri", "conversations.draft_preview_content_type", "conversations.archive_status", "conversations.sort_timestamp", "conversations.icon", "conversations.participant_lookup_key", "conversations.participant_normalized_destination", "conversations.participant_count", "conversations.notification_enabled", "conversations.include_email_addr", "conversations.source_type", "conversations.rcs_session_id", "conversations.join_state", "conversations.conv_type", "conversations.IS_ENTERPRISE", "conversations.has_ea2p_bot_recipient", "conversations.participant_display_destination", "conversations.rcs_session_allows_revocation", "conversations.marked_as_unread", "conversations.mms_group_upgrade_status", "messages._id", "messages.sent_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.read", "messages.sms_priority", "messages.raw_status", "messages.sms_error_code", "messages.sms_error_desc_map_name", "participants.sub_id", "participants.display_destination", "participants.full_name", "participants.first_name", "conversation_to_participants.participant_id", "one_on_one_participant.full_name", "one_on_one_participant.first_name", "profiles_table.display_name", "parts.content_type", "reminders.trigger_time", "conversation_pin.pin_status", "lighter_conversations_table.lighter_conversation_id_json", "lighter_conversations_table.read", "lighter_conversations_table.is_last_message_outgoing", "lighter_conversations_table.conversation_status", "lighter_conversations_table.last_action_timestamp"};
    public static final nei b;

    static {
        lga.z();
        lga.A();
        b = new nei();
    }

    public static final lcb a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(d.P().W().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("conversations._id");
            alobVar.h("conversations.name");
            alobVar.h("conversations.snippet_text");
            alobVar.h("conversations.subject_text");
            alobVar.h("conversations.preview_uri");
            alobVar.h("conversations.preview_content_type");
            alobVar.h("conversations.show_draft");
            alobVar.h("conversations.draft_snippet_text");
            alobVar.h("conversations.draft_subject_text");
            alobVar.h("conversations.draft_preview_uri");
            alobVar.h("conversations.draft_preview_content_type");
            alobVar.h("conversations.archive_status");
            alobVar.h("conversations.sort_timestamp");
            alobVar.h("conversations.icon");
            alobVar.h("conversations.participant_lookup_key");
            alobVar.h("conversations.participant_normalized_destination");
            alobVar.h("conversations.participant_count");
            alobVar.h("conversations.notification_enabled");
            alobVar.h("conversations.include_email_addr");
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
            if (valueOf.intValue() >= 10018) {
                alobVar.h("conversations.IS_ENTERPRISE");
            }
            if (valueOf.intValue() >= 12001) {
                alobVar.h("conversations.has_ea2p_bot_recipient");
            }
            if (valueOf.intValue() >= 15010) {
                alobVar.h("conversations.participant_display_destination");
            }
            if (valueOf.intValue() >= 48040) {
                alobVar.h("conversations.rcs_session_allows_revocation");
            }
            if (valueOf.intValue() >= 59220) {
                alobVar.h("conversations.marked_as_unread");
            }
            if (valueOf.intValue() >= 60050) {
                alobVar.h("conversations.mms_group_upgrade_status");
            }
            alobVar.h("messages._id");
            alobVar.h("messages.sent_timestamp");
            alobVar.h("messages.received_timestamp");
            alobVar.h("messages.message_protocol");
            alobVar.h("messages.message_status");
            alobVar.h("messages.read");
            alobVar.h("messages.sms_priority");
            alobVar.h("messages.raw_status");
            if (valueOf.intValue() >= 9000) {
                alobVar.h("messages.sms_error_code");
            }
            if (valueOf.intValue() >= 9000) {
                alobVar.h("messages.sms_error_desc_map_name");
            }
            alobVar.h("participants.sub_id");
            alobVar.h("participants.display_destination");
            alobVar.h("participants.full_name");
            alobVar.h("participants.first_name");
            alobVar.h("conversation_to_participants.participant_id");
            alobVar.h("one_on_one_participant.full_name");
            alobVar.h("one_on_one_participant.first_name");
            alobVar.h("profiles_table.display_name");
            alobVar.h("parts.content_type");
            alobVar.h("reminders.trigger_time");
            alobVar.h("conversation_pin.pin_status");
            alobVar.h("lighter_conversations_table.lighter_conversation_id_json");
            if (valueOf.intValue() >= 58700) {
                alobVar.h("lighter_conversations_table.read");
            }
            if (valueOf.intValue() >= 58810) {
                alobVar.h("lighter_conversations_table.is_last_message_outgoing");
            }
            if (valueOf.intValue() >= 59030) {
                alobVar.h("lighter_conversations_table.conversation_status");
            }
            if (valueOf.intValue() >= 59040) {
                alobVar.h("lighter_conversations_table.last_action_timestamp");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new lcb(strArr);
    }
}
