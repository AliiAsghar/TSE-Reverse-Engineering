package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sbi {
    public static final String[] a = {"messages._id", "messages.conversation_id", "messages.sender_id", "messages.sent_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.message_report_status", "messages.seen", "messages.read", "messages.sms_message_uri", "messages.sms_priority", "messages.sms_message_size", "messages.mms_subject", "messages.mms_expiry", "messages.rcs_expiry", "messages.mms_retrieve_text", "messages.raw_status", "messages.self_id", "messages.rcs_message_id_with_text_type", "messages.etouffee_status", "messages.verification_status", "messages.is_hidden", "messages.rcs_file_transfer_session_id", "messages.sms_error_code", "messages.sms_error_desc_map_name", "messages.cms_id", "messages.web_id", "messages.usage_stats_logging_id", "messages.original_rcs_message_id", "messages.result_code", "messages.cms_life_cycle", "messages.fallback_reason", "messages.trace_id", "messages.xms_transport", "(count(parts._id)) AS parts_count", "group_concat(quote(parts._id), '|')", "parts.message_id", "group_concat(quote(parts.text), '|')", "group_concat(quote(parts.uri), '|')", "group_concat(quote(parts.content_type), '|')", "group_concat(quote(parts.original_uri), '|')", "group_concat(quote(parts.storage_uri), '|')", "group_concat(quote(parts.width), '|')", "group_concat(quote(parts.height), '|')", "parts.timestamp", "parts.output_uri", "group_concat(quote(parts.target_size), '|')", "parts.processing_status", "group_concat(quote(parts.cms_attachment_processing_status), '|')", "parts.conversation_id", "parts.sticker_set_id", "parts.sticker_id", "parts.media_modified_timestamp", "parts.longitude", "parts.latitude", "group_concat(quote(parts.preview_content_uri), '|')", "parts.preview_content_type", "group_concat(quote(parts.fallback_uri), '|')", "group_concat(quote(parts.source), '|')", "group_concat(quote(parts.bundle_index), '|')", "group_concat(quote(parts.blob_id), '|')", "group_concat(quote(parts.blob_gaia_email), '|')", "parts.cms_full_size_blob_id", "parts.cms_media_encryption_key", "parts.cms_compressed_media_encryption_key", "group_concat(quote(parts.blob_upload_permanent_failure), '|')", "group_concat(quote(parts.blob_upload_timestamp), '|')", "group_concat(quote(parts.expressive_sticker_name), '|')", "group_concat(quote(parts.file_name), '|')", "group_concat(quote(parts.duration), '|')", "group_concat(quote(parts.compressed_blob_id), '|')", "parts.cms_compressed_blob_id", "group_concat(quote(parts.compressed_blob_upload_permanent_failure), '|')", "group_concat(quote(parts.compressed_blob_upload_timestamp), '|')", "group_concat(quote(parts.media_encryption_key), '|')", "group_concat(quote(parts.compressed_media_encryption_key), '|')", "group_concat(quote(parts.missing_entry_in_telephony), '|')", "parts.awaiting_reverse_sync", "parts.file_size_bytes", "parts.local_cache_path", "group_concat(quote(parts.media_send_type), '|')", "parts.voice_metadata", "parts.validation_status", "parts.processing_id", "parts.rich_card_media_download_failure_reason", "parts.image_display_state", "group_concat(quote(parts.rowid), '|') AS parts__ROWID", "participants.normalized_destination", "participants.send_destination", "participants.display_destination", "participants.full_name", "participants.first_name", "participants.profile_photo_uri", "participants.contact_id", "participants.lookup_key", "participants.color_palette_index", "participants.color_type", "participants.extended_color", "participants.blocked", "participants.participant_type", "participants.is_spam", "participants.latest_verification_status", "participants.directory_id", "participants.name_source", "participants.photo_source", "reports_concat_view._id_read_reports", "reports_concat_view.message_id_read_reports", "reports_concat_view.participant_id_read_reports", "reports_concat_view.receive_time_read_reports", "reports_concat_view.read_time_read_reports", "reports_concat_view.ftd_time_read_reports", "reports_concat_view.read_reports__ROWID_read_reports", "user_refs_concat_view.message_id_user_references", "user_refs_concat_view.participant_id_user_references", "user_refs_concat_view.user_ref_datetime_user_references", "user_refs_concat_view.user_references__ROWID_user_references", "user_refs_concat_view.user_ref_display_name", "user_refs_concat_view.user_ref_profile_photo_uri", "user_refs_concat_view.user_ref_full_name", "user_refs_concat_view.user_ref_lookup_key", "user_refs_concat_view.normalized_destination_participants", "user_refs_concat_view.color_palette_index_participants", "user_refs_concat_view.color_type_participants", "user_refs_concat_view.extended_color_participants", "user_refs_concat_view.participants__ROWID_participants", "link_preview.message_id", "link_preview.trigger_url", "link_preview.expiration_time_millis", "link_preview.link_title", "link_preview.link_description", "link_preview.link_image_url", "link_preview.link_domain", "link_preview.link_canonical_url", "link_preview.link_preview_prevented", "link_preview.link_preview_failed", "verified_sms_brands.name", "verified_sms_brands.description", "verified_sms_brands.logo_uri", "conversations.participant_normalized_destination", "conversations.conv_type", "conversations.has_ea2p_bot_recipient", "conversations.rcs_group_id", "conversations.rcs_session_allows_revocation", "conversations.recipient_offline_timestamp_ms", "message_reactions.reactions_data", "file_transfer.transfer_id", "message_star.message_id", "message_photos_sharing.sharing_state", "group_concat(quote(vmt.part_id), '|')", "group_concat(quote(vmt.vmt_status), '|')", "group_concat(quote(vmt.text), '|')", "group_concat(quote(vmt.locale), '|')", "group_concat(quote(vmt.rowid), '|') AS vmt__ROWID", "message_replies_view.message_id_message_replies", "message_replies_view._id_messages", "message_replies_view.received_timestamp_messages", "message_replies_view._id_participants", "message_replies_view.sub_id_participants", "message_replies_view.normalized_destination_participants", "message_replies_view.display_destination_participants", "message_replies_view.full_name_participants", "message_replies_view.first_name_participants", "message_replies_view._id_parts", "message_replies_view.text_parts", "message_replies_view.uri_parts", "message_replies_view.content_type_parts", "message_replies_view.file_name_parts", "message_replies_view.duration_parts", "message_replies_view.parts__ROWID_parts", "message_replies_view.trigger_url_link_preview", "message_replies_view.expiration_time_millis_link_preview", "message_replies_view.link_title_link_preview", "message_replies_view.link_image_url_link_preview", "message_replies_view.link_preview_failed_link_preview", "profiles_table.display_name", "message_captions.caption"};
    public static final alor b;
    public static final vid c;

    static {
        alok alokVar = new alok();
        alokVar.h("messages.message_report_status", 13020);
        alokVar.h("messages.rcs_expiry", 59890);
        alokVar.h("messages.mms_retrieve_text", 9030);
        alokVar.h("messages.rcs_message_id_with_text_type", 41040);
        alokVar.h("messages.etouffee_status", 29060);
        alokVar.h("messages.verification_status", 29090);
        alokVar.h("messages.is_hidden", 30010);
        alokVar.h("messages.rcs_file_transfer_session_id", 10004);
        alokVar.h("messages.sms_error_code", 9000);
        alokVar.h("messages.sms_error_desc_map_name", 9000);
        alokVar.h("messages.cms_id", 31010);
        alokVar.h("messages.web_id", 19020);
        alokVar.h("messages.usage_stats_logging_id", 29100);
        alokVar.h("messages.original_rcs_message_id", 35030);
        alokVar.h("messages.result_code", 58040);
        alokVar.h("messages.cms_life_cycle", 58210);
        alokVar.h("messages.fallback_reason", 58710);
        alokVar.h("messages.trace_id", 58680);
        alokVar.h("messages.xms_transport", 59310);
        alokVar.h("(count(parts._id)) AS parts_count", 0);
        alokVar.h("group_concat(quote(parts.original_uri), '|')", 10021);
        alokVar.h("group_concat(quote(parts.storage_uri), '|')", 29060);
        alokVar.h("parts.timestamp", 3010);
        alokVar.h("parts.output_uri", 4020);
        alokVar.h("group_concat(quote(parts.target_size), '|')", 4020);
        alokVar.h("parts.processing_status", 4020);
        alokVar.h("group_concat(quote(parts.cms_attachment_processing_status), '|')", 44010);
        alokVar.h("parts.sticker_set_id", 5020);
        alokVar.h("parts.sticker_id", 5020);
        alokVar.h("parts.media_modified_timestamp", 7000);
        alokVar.h("parts.longitude", 10005);
        alokVar.h("parts.latitude", 10005);
        alokVar.h("group_concat(quote(parts.preview_content_uri), '|')", 10017);
        alokVar.h("parts.preview_content_type", 10017);
        alokVar.h("group_concat(quote(parts.fallback_uri), '|')", 13000);
        alokVar.h("group_concat(quote(parts.source), '|')", 14010);
        alokVar.h("group_concat(quote(parts.bundle_index), '|')", 17010);
        alokVar.h("group_concat(quote(parts.blob_id), '|')", 17020);
        alokVar.h("group_concat(quote(parts.blob_gaia_email), '|')", 59570);
        alokVar.h("parts.cms_full_size_blob_id", 40040);
        alokVar.h("parts.cms_media_encryption_key", 42010);
        alokVar.h("parts.cms_compressed_media_encryption_key", 42070);
        alokVar.h("group_concat(quote(parts.blob_upload_permanent_failure), '|')", 18000);
        alokVar.h("group_concat(quote(parts.blob_upload_timestamp), '|')", 19030);
        alokVar.h("group_concat(quote(parts.expressive_sticker_name), '|')", 22060);
        alokVar.h("group_concat(quote(parts.file_name), '|')", 26000);
        alokVar.h("group_concat(quote(parts.duration), '|')", 26040);
        alokVar.h("group_concat(quote(parts.compressed_blob_id), '|')", 27000);
        alokVar.h("parts.cms_compressed_blob_id", 40040);
        alokVar.h("group_concat(quote(parts.compressed_blob_upload_permanent_failure), '|')", 27000);
        alokVar.h("group_concat(quote(parts.compressed_blob_upload_timestamp), '|')", 27000);
        alokVar.h("group_concat(quote(parts.media_encryption_key), '|')", 30040);
        alokVar.h("group_concat(quote(parts.compressed_media_encryption_key), '|')", 30040);
        alokVar.h("group_concat(quote(parts.missing_entry_in_telephony), '|')", 52030);
        alokVar.h("parts.awaiting_reverse_sync", 53040);
        alokVar.h("parts.file_size_bytes", 52050);
        alokVar.h("parts.local_cache_path", 52050);
        alokVar.h("group_concat(quote(parts.media_send_type), '|')", 58150);
        alokVar.h("parts.voice_metadata", 59470);
        alokVar.h("parts.validation_status", 58770);
        alokVar.h("parts.processing_id", 60080);
        alokVar.h("parts.rich_card_media_download_failure_reason", 60230);
        alokVar.h("parts.image_display_state", 60240);
        alokVar.h("participants.color_type", 1000);
        alokVar.h("participants.extended_color", 10027);
        alokVar.h("participants.participant_type", 12001);
        alokVar.h("participants.is_spam", 24060);
        alokVar.h("participants.latest_verification_status", 31030);
        alokVar.h("participants.directory_id", 35010);
        alokVar.h("participants.name_source", 59550);
        alokVar.h("participants.photo_source", 59550);
        alokVar.h("reports_concat_view._id_read_reports", 0);
        alokVar.h("reports_concat_view.message_id_read_reports", 0);
        alokVar.h("reports_concat_view.participant_id_read_reports", 0);
        alokVar.h("reports_concat_view.receive_time_read_reports", 0);
        alokVar.h("reports_concat_view.read_time_read_reports", 0);
        alokVar.h("reports_concat_view.ftd_time_read_reports", 0);
        alokVar.h("user_refs_concat_view.message_id_user_references", 0);
        alokVar.h("user_refs_concat_view.participant_id_user_references", 0);
        alokVar.h("user_refs_concat_view.user_ref_datetime_user_references", 0);
        alokVar.h("user_refs_concat_view.user_ref_display_name", 0);
        alokVar.h("user_refs_concat_view.user_ref_profile_photo_uri", 0);
        alokVar.h("user_refs_concat_view.user_ref_full_name", 0);
        alokVar.h("user_refs_concat_view.user_ref_lookup_key", 0);
        alokVar.h("user_refs_concat_view.normalized_destination_participants", 0);
        alokVar.h("user_refs_concat_view.color_palette_index_participants", 0);
        alokVar.h("user_refs_concat_view.color_type_participants", 0);
        alokVar.h("user_refs_concat_view.extended_color_participants", 0);
        alokVar.h("link_preview.link_preview_prevented", 21010);
        alokVar.h("link_preview.link_preview_failed", 22020);
        alokVar.h("conversations.conv_type", 10007);
        alokVar.h("conversations.has_ea2p_bot_recipient", 12001);
        alokVar.h("conversations.rcs_group_id", 40050);
        alokVar.h("conversations.rcs_session_allows_revocation", 48040);
        alokVar.h("conversations.recipient_offline_timestamp_ms", 58750);
        alokVar.h("message_replies_view.message_id_message_replies", 0);
        alokVar.h("message_replies_view._id_messages", 0);
        alokVar.h("message_replies_view.received_timestamp_messages", 0);
        alokVar.h("message_replies_view._id_participants", 0);
        alokVar.h("message_replies_view.sub_id_participants", 0);
        alokVar.h("message_replies_view.normalized_destination_participants", 0);
        alokVar.h("message_replies_view.display_destination_participants", 0);
        alokVar.h("message_replies_view.full_name_participants", 0);
        alokVar.h("message_replies_view.first_name_participants", 0);
        alokVar.h("message_replies_view._id_parts", 0);
        alokVar.h("message_replies_view.text_parts", 0);
        alokVar.h("message_replies_view.uri_parts", 0);
        alokVar.h("message_replies_view.content_type_parts", 0);
        alokVar.h("message_replies_view.file_name_parts", 0);
        alokVar.h("message_replies_view.duration_parts", 0);
        alokVar.h("message_replies_view.trigger_url_link_preview", 0);
        alokVar.h("message_replies_view.expiration_time_millis_link_preview", 0);
        alokVar.h("message_replies_view.link_title_link_preview", 0);
        alokVar.h("message_replies_view.link_image_url_link_preview", 0);
        alokVar.h("message_replies_view.link_preview_failed_link_preview", 0);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("sender_id", "index_null_sender_id");
        alokVar2.h("sent_timestamp", "index_null_sent_timestamp");
        alokVar2.h("read", "index_messages_read_0");
        alokVar2.h("sms_message_uri", "index_null_sms_message_uri");
        alokVar2.h("rcs_expiry", "index_null_rcs_expiry");
        alokVar2.h("self_id", "index_null_self_id");
        alokVar2.h(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, "index_null_verification_status");
        alokVar2.h("cms_id", "index_null_cms_id");
        alokVar2.h("web_id", "index_null_web_id");
        alokVar2.h("original_rcs_message_id", "index_null_original_rcs_message_id");
        alokVar2.b();
        c = new vid((char[]) null);
    }

    public static sba a() {
        int i = sap.a;
        return new sba();
    }

    public static final sbf b() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("messages._id");
            alobVar.h("messages.conversation_id");
            alobVar.h("messages.sender_id");
            alobVar.h("messages.sent_timestamp");
            alobVar.h("messages.received_timestamp");
            alobVar.h("messages.message_protocol");
            alobVar.h("messages.message_status");
            if (valueOf.intValue() >= 13020) {
                alobVar.h("messages.message_report_status");
            }
            alobVar.h("messages.seen");
            alobVar.h("messages.read");
            alobVar.h("messages.sms_message_uri");
            alobVar.h("messages.sms_priority");
            alobVar.h("messages.sms_message_size");
            alobVar.h("messages.mms_subject");
            alobVar.h("messages.mms_expiry");
            if (valueOf.intValue() >= 59890) {
                alobVar.h("messages.rcs_expiry");
            }
            if (valueOf.intValue() >= 9030) {
                alobVar.h("messages.mms_retrieve_text");
            }
            alobVar.h("messages.raw_status");
            alobVar.h("messages.self_id");
            if (valueOf.intValue() >= 41040) {
                alobVar.h("messages.rcs_message_id_with_text_type");
            }
            if (valueOf.intValue() >= 29060) {
                alobVar.h("messages.etouffee_status");
            }
            if (valueOf.intValue() >= 29090) {
                alobVar.h("messages.verification_status");
            }
            if (valueOf.intValue() >= 30010) {
                alobVar.h("messages.is_hidden");
            }
            if (valueOf.intValue() >= 10004) {
                alobVar.h("messages.rcs_file_transfer_session_id");
            }
            if (valueOf.intValue() >= 9000) {
                alobVar.h("messages.sms_error_code");
            }
            if (valueOf.intValue() >= 9000) {
                alobVar.h("messages.sms_error_desc_map_name");
            }
            if (valueOf.intValue() >= 31010) {
                alobVar.h("messages.cms_id");
            }
            if (valueOf.intValue() >= 19020) {
                alobVar.h("messages.web_id");
            }
            if (valueOf.intValue() >= 29100) {
                alobVar.h("messages.usage_stats_logging_id");
            }
            if (valueOf.intValue() >= 35030) {
                alobVar.h("messages.original_rcs_message_id");
            }
            if (valueOf.intValue() >= 58040) {
                alobVar.h("messages.result_code");
            }
            if (valueOf.intValue() >= 58210) {
                alobVar.h("messages.cms_life_cycle");
            }
            if (valueOf.intValue() >= 58710) {
                alobVar.h("messages.fallback_reason");
            }
            if (valueOf.intValue() >= 58680) {
                alobVar.h("messages.trace_id");
            }
            if (valueOf.intValue() >= 59310) {
                alobVar.h("messages.xms_transport");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("(count(parts._id)) AS parts_count");
            }
            alobVar.h("group_concat(quote(parts._id), '|')");
            alobVar.h("parts.message_id");
            alobVar.h("group_concat(quote(parts.text), '|')");
            alobVar.h("group_concat(quote(parts.uri), '|')");
            alobVar.h("group_concat(quote(parts.content_type), '|')");
            if (valueOf.intValue() >= 10021) {
                alobVar.h("group_concat(quote(parts.original_uri), '|')");
            }
            if (valueOf.intValue() >= 29060) {
                alobVar.h("group_concat(quote(parts.storage_uri), '|')");
            }
            alobVar.h("group_concat(quote(parts.width), '|')");
            alobVar.h("group_concat(quote(parts.height), '|')");
            if (valueOf.intValue() >= 3010) {
                alobVar.h("parts.timestamp");
            }
            if (valueOf.intValue() >= 4020) {
                alobVar.h("parts.output_uri");
            }
            if (valueOf.intValue() >= 4020) {
                alobVar.h("group_concat(quote(parts.target_size), '|')");
            }
            if (valueOf.intValue() >= 4020) {
                alobVar.h("parts.processing_status");
            }
            if (valueOf.intValue() >= 44010) {
                alobVar.h("group_concat(quote(parts.cms_attachment_processing_status), '|')");
            }
            alobVar.h("parts.conversation_id");
            if (valueOf.intValue() >= 5020) {
                alobVar.h("parts.sticker_set_id");
            }
            if (valueOf.intValue() >= 5020) {
                alobVar.h("parts.sticker_id");
            }
            if (valueOf.intValue() >= 7000) {
                alobVar.h("parts.media_modified_timestamp");
            }
            if (valueOf.intValue() >= 10005) {
                alobVar.h("parts.longitude");
            }
            if (valueOf.intValue() >= 10005) {
                alobVar.h("parts.latitude");
            }
            if (valueOf.intValue() >= 10017) {
                alobVar.h("group_concat(quote(parts.preview_content_uri), '|')");
            }
            if (valueOf.intValue() >= 10017) {
                alobVar.h("parts.preview_content_type");
            }
            if (valueOf.intValue() >= 13000) {
                alobVar.h("group_concat(quote(parts.fallback_uri), '|')");
            }
            if (valueOf.intValue() >= 14010) {
                alobVar.h("group_concat(quote(parts.source), '|')");
            }
            if (valueOf.intValue() >= 17010) {
                alobVar.h("group_concat(quote(parts.bundle_index), '|')");
            }
            if (valueOf.intValue() >= 17020) {
                alobVar.h("group_concat(quote(parts.blob_id), '|')");
            }
            if (valueOf.intValue() >= 59570) {
                alobVar.h("group_concat(quote(parts.blob_gaia_email), '|')");
            }
            if (valueOf.intValue() >= 40040) {
                alobVar.h("parts.cms_full_size_blob_id");
            }
            if (valueOf.intValue() >= 42010) {
                alobVar.h("parts.cms_media_encryption_key");
            }
            if (valueOf.intValue() >= 42070) {
                alobVar.h("parts.cms_compressed_media_encryption_key");
            }
            if (valueOf.intValue() >= 18000) {
                alobVar.h("group_concat(quote(parts.blob_upload_permanent_failure), '|')");
            }
            if (valueOf.intValue() >= 19030) {
                alobVar.h("group_concat(quote(parts.blob_upload_timestamp), '|')");
            }
            if (valueOf.intValue() >= 22060) {
                alobVar.h("group_concat(quote(parts.expressive_sticker_name), '|')");
            }
            if (valueOf.intValue() >= 26000) {
                alobVar.h("group_concat(quote(parts.file_name), '|')");
            }
            if (valueOf.intValue() >= 26040) {
                alobVar.h("group_concat(quote(parts.duration), '|')");
            }
            if (valueOf.intValue() >= 27000) {
                alobVar.h("group_concat(quote(parts.compressed_blob_id), '|')");
            }
            if (valueOf.intValue() >= 40040) {
                alobVar.h("parts.cms_compressed_blob_id");
            }
            if (valueOf.intValue() >= 27000) {
                alobVar.h("group_concat(quote(parts.compressed_blob_upload_permanent_failure), '|')");
            }
            if (valueOf.intValue() >= 27000) {
                alobVar.h("group_concat(quote(parts.compressed_blob_upload_timestamp), '|')");
            }
            if (valueOf.intValue() >= 30040) {
                alobVar.h("group_concat(quote(parts.media_encryption_key), '|')");
            }
            if (valueOf.intValue() >= 30040) {
                alobVar.h("group_concat(quote(parts.compressed_media_encryption_key), '|')");
            }
            if (valueOf.intValue() >= 52030) {
                alobVar.h("group_concat(quote(parts.missing_entry_in_telephony), '|')");
            }
            if (valueOf.intValue() >= 53040) {
                alobVar.h("parts.awaiting_reverse_sync");
            }
            if (valueOf.intValue() >= 52050) {
                alobVar.h("parts.file_size_bytes");
            }
            if (valueOf.intValue() >= 52050) {
                alobVar.h("parts.local_cache_path");
            }
            if (valueOf.intValue() >= 58150) {
                alobVar.h("group_concat(quote(parts.media_send_type), '|')");
            }
            if (valueOf.intValue() >= 59470) {
                alobVar.h("parts.voice_metadata");
            }
            if (valueOf.intValue() >= 58770) {
                alobVar.h("parts.validation_status");
            }
            if (valueOf.intValue() >= 60080) {
                alobVar.h("parts.processing_id");
            }
            if (valueOf.intValue() >= 60230) {
                alobVar.h("parts.rich_card_media_download_failure_reason");
            }
            if (valueOf.intValue() >= 60240) {
                alobVar.h("parts.image_display_state");
            }
            alobVar.h("participants.normalized_destination");
            alobVar.h("participants.send_destination");
            alobVar.h("participants.display_destination");
            alobVar.h("participants.full_name");
            alobVar.h("participants.first_name");
            alobVar.h("participants.profile_photo_uri");
            alobVar.h("participants.contact_id");
            alobVar.h("participants.lookup_key");
            alobVar.h("participants.color_palette_index");
            if (valueOf.intValue() >= 1000) {
                alobVar.h("participants.color_type");
            }
            if (valueOf.intValue() >= 10027) {
                alobVar.h("participants.extended_color");
            }
            alobVar.h("participants.blocked");
            if (valueOf.intValue() >= 12001) {
                alobVar.h("participants.participant_type");
            }
            if (valueOf.intValue() >= 24060) {
                alobVar.h("participants.is_spam");
            }
            if (valueOf.intValue() >= 31030) {
                alobVar.h("participants.latest_verification_status");
            }
            if (valueOf.intValue() >= 35010) {
                alobVar.h("participants.directory_id");
            }
            if (valueOf.intValue() >= 59550) {
                alobVar.h("participants.name_source");
            }
            if (valueOf.intValue() >= 59550) {
                alobVar.h("participants.photo_source");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("reports_concat_view._id_read_reports");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("reports_concat_view.message_id_read_reports");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("reports_concat_view.participant_id_read_reports");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("reports_concat_view.receive_time_read_reports");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("reports_concat_view.read_time_read_reports");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("reports_concat_view.ftd_time_read_reports");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("user_refs_concat_view.message_id_user_references");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("user_refs_concat_view.participant_id_user_references");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("user_refs_concat_view.user_ref_datetime_user_references");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("user_refs_concat_view.user_ref_display_name");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("user_refs_concat_view.user_ref_profile_photo_uri");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("user_refs_concat_view.user_ref_full_name");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("user_refs_concat_view.user_ref_lookup_key");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("user_refs_concat_view.normalized_destination_participants");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("user_refs_concat_view.color_palette_index_participants");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("user_refs_concat_view.color_type_participants");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("user_refs_concat_view.extended_color_participants");
            }
            alobVar.h("link_preview.message_id");
            alobVar.h("link_preview.trigger_url");
            alobVar.h("link_preview.expiration_time_millis");
            alobVar.h("link_preview.link_title");
            alobVar.h("link_preview.link_description");
            alobVar.h("link_preview.link_image_url");
            alobVar.h("link_preview.link_domain");
            alobVar.h("link_preview.link_canonical_url");
            if (valueOf.intValue() >= 21010) {
                alobVar.h("link_preview.link_preview_prevented");
            }
            if (valueOf.intValue() >= 22020) {
                alobVar.h("link_preview.link_preview_failed");
            }
            alobVar.h("verified_sms_brands.name");
            alobVar.h("verified_sms_brands.description");
            alobVar.h("verified_sms_brands.logo_uri");
            alobVar.h("conversations.participant_normalized_destination");
            if (valueOf.intValue() >= 10007) {
                alobVar.h("conversations.conv_type");
            }
            if (valueOf.intValue() >= 12001) {
                alobVar.h("conversations.has_ea2p_bot_recipient");
            }
            if (valueOf.intValue() >= 40050) {
                alobVar.h("conversations.rcs_group_id");
            }
            if (valueOf.intValue() >= 48040) {
                alobVar.h("conversations.rcs_session_allows_revocation");
            }
            if (valueOf.intValue() >= 58750) {
                alobVar.h("conversations.recipient_offline_timestamp_ms");
            }
            alobVar.h("message_reactions.reactions_data");
            alobVar.h("file_transfer.transfer_id");
            alobVar.h("message_star.message_id");
            alobVar.h("message_photos_sharing.sharing_state");
            alobVar.h("group_concat(quote(vmt.part_id), '|')");
            alobVar.h("group_concat(quote(vmt.vmt_status), '|')");
            alobVar.h("group_concat(quote(vmt.text), '|')");
            alobVar.h("group_concat(quote(vmt.locale), '|')");
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.message_id_message_replies");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view._id_messages");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.received_timestamp_messages");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view._id_participants");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.sub_id_participants");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.normalized_destination_participants");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.display_destination_participants");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.full_name_participants");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.first_name_participants");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view._id_parts");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.text_parts");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.uri_parts");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.content_type_parts");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.file_name_parts");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.duration_parts");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.trigger_url_link_preview");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.expiration_time_millis_link_preview");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.link_title_link_preview");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.link_image_url_link_preview");
            }
            if (valueOf.intValue() >= 0) {
                alobVar.h("message_replies_view.link_preview_failed_link_preview");
            }
            alobVar.h("profiles_table.display_name");
            alobVar.h("message_captions.caption");
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new sbf(strArr);
    }
}
