package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sav {
    public static final String[] a = {"conversations._id", "conversations.sms_thread_id", "conversations.name", "conversations.name_is_automatic", "conversations.snippet_text", "conversations.subject_text", "conversations.preview_uri", "conversations.preview_content_type", "conversations.show_draft", "conversations.draft_snippet_text", "conversations.draft_subject_text", "conversations.draft_preview_uri", "conversations.draft_preview_content_type", "conversations.etouffee_default", "conversations.archive_status", "conversations.sort_timestamp", "conversations.icon", "conversations.participant_contact_id", "conversations.participant_lookup_key", "conversations.participant_normalized_destination", "conversations.current_self_id", "conversations.current_my_identity_foreign_key", "conversations.participant_count", "conversations.notification_enabled", "conversations.notification_sound_uri", "conversations.notification_vibration", "conversations.include_email_addr", "conversations.source_type", "conversations.rcs_session_id", "conversations.join_state", "conversations.conv_type", "conversations.send_mode", "conversations.IS_ENTERPRISE", "conversations.has_ea2p_bot_recipient", "conversations.participant_display_destination", "conversations.delete_timestamp", "conversations.cms_id", "conversations.rcs_group_id", "conversations.rcs_conference_uri", "conversations.rcs_session_allows_revocation", "conversations.awaiting_reverse_sync", "conversations.error_state", "conversations.rcs_group_last_sync_timestamp", "conversations.has_been_e2ee", "conversations.marked_as_unread", "messages._id", "messages.sent_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.read", "messages.sms_priority", "messages.raw_status", "messages.sms_error_code", "messages.sms_error_desc_map_name", "participants.sub_id", "participants.display_destination", "participants.full_name", "participants.first_name", "participants.directory_id", "conversation_participants.participant_id", "one_on_one_participant.full_name", "one_on_one_participant.first_name", "profiles_table.display_name", "parts.text", "parts.uri", "parts.content_type", "vmt.vmt_status", "vmt.text", "reminders.trigger_time", "messages_annotations.annotation_type", "messages_annotations.annotation_details", "message_star._id", "parent_disallowed_conversations.conversation_id"};
    public static final uie b;

    static {
        vom.q();
        vom.r();
        b = new uie((char[]) null);
    }

    public static sao a() {
        int i = sad.a;
        return new sao();
    }

    public static final sat b() {
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
            alobVar.h("conversations.icon");
            alobVar.h("conversations.participant_contact_id");
            alobVar.h("conversations.participant_lookup_key");
            alobVar.h("conversations.participant_normalized_destination");
            alobVar.h("conversations.current_self_id");
            if (valueOf.intValue() >= 60160) {
                alobVar.h("conversations.current_my_identity_foreign_key");
            }
            alobVar.h("conversations.participant_count");
            alobVar.h("conversations.notification_enabled");
            alobVar.h("conversations.notification_sound_uri");
            alobVar.h("conversations.notification_vibration");
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
            if (valueOf.intValue() >= 10016) {
                alobVar.h("conversations.send_mode");
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
            if (valueOf.intValue() >= 48040) {
                alobVar.h("conversations.rcs_session_allows_revocation");
            }
            if (valueOf.intValue() >= 49060) {
                alobVar.h("conversations.awaiting_reverse_sync");
            }
            if (valueOf.intValue() >= 58140) {
                alobVar.h("conversations.error_state");
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
            if (valueOf.intValue() >= 35010) {
                alobVar.h("participants.directory_id");
            }
            alobVar.h("conversation_participants.participant_id");
            alobVar.h("one_on_one_participant.full_name");
            alobVar.h("one_on_one_participant.first_name");
            alobVar.h("profiles_table.display_name");
            alobVar.h("parts.text");
            alobVar.h("parts.uri");
            alobVar.h("parts.content_type");
            alobVar.h("vmt.vmt_status");
            alobVar.h("vmt.text");
            alobVar.h("reminders.trigger_time");
            alobVar.h("messages_annotations.annotation_type");
            alobVar.h("messages_annotations.annotation_details");
            alobVar.h("message_star._id");
            alobVar.h("parent_disallowed_conversations.conversation_id");
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new sat(strArr);
    }
}
