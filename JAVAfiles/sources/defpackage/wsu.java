package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wsu {
    public static final String[] a = {"scheduled_send._id", "scheduled_send.message_id", "scheduled_send.conversation_id", "scheduled_send.scheduled_time", "scheduled_send.status", "scheduled_send.creation_time", "messages._id", "messages.conversation_id", "messages.sender_id", "messages.sender_send_destination", "messages.msisdn_receiving_rcs_message", "messages.receiving_network_country", "messages.sent_timestamp", "messages.queue_insert_timestamp", "messages.received_timestamp", "messages.message_protocol", "messages.message_status", "messages.message_report_status", "messages.seen", "messages.read", "messages.sms_message_uri", "messages.sms_priority", "messages.sms_message_size", "messages.mms_subject", "messages.mms_transaction_id", "messages.mms_content_location", "messages.mms_expiry", "messages.rcs_expiry", "messages.mms_retrieve_text", "messages.raw_status", "messages.self_id", "messages.my_identity_foreign_key", "messages.retry_start_timestamp", "messages.cloud_sync_id", "messages.rcs_message_id_with_text_type", "messages.etouffee_status", "messages.verification_status", "messages.rcs_ui_status", "messages.is_hidden", "messages.rcs_remote_instance", "messages.rcs_file_transfer_session_id", "messages.sms_error_code", "messages.sms_error_desc_map_name", "messages.correlation_id", "messages.cms_id", "messages.cms_last_mod_seq", "messages.web_id", "messages.usage_stats_logging_id", "messages.send_counter", "messages.original_rcs_message_id", "messages.custom_delivery_receipt_mime_type", "messages.custom_delivery_receipt_content", "messages.report_attempt_acounter", "messages.custom_headers", "messages.cms_correlation_id", "messages.group_private_participant", "messages.original_message_id", "messages.awaiting_reverse_sync", "messages.old_sms_message_uri", "messages.draft_id", "messages.result_code", "messages.cms_life_cycle", "messages.fallback_reason", "messages.auto_retry_counter", "messages.can_revoke_before_delivered_with_rcs", "messages.trace_id", "messages.outgoing_delivery_report_status", "messages.outgoing_read_report_status", "messages.xms_transport", "messages.message_original_protocol", "messages.satellite_datagram_id", "messages.encryption_protocol", "messages.message_persistence_id", "group_concat(quote(parts._id), '|')", "parts.message_id", "group_concat(quote(parts.text), '|')", "group_concat(quote(parts.uri), '|')", "group_concat(quote(parts.content_type), '|')", "group_concat(quote(parts.original_uri), '|')", "group_concat(quote(parts.storage_uri), '|')", "group_concat(quote(parts.width), '|')", "group_concat(quote(parts.height), '|')", "parts.timestamp", "parts.output_uri", "group_concat(quote(parts.target_size), '|')", "parts.processing_status", "group_concat(quote(parts.cms_attachment_processing_status), '|')", "parts.conversation_id", "parts.sticker_set_id", "parts.sticker_id", "parts.media_modified_timestamp", "parts.longitude", "parts.latitude", "group_concat(quote(parts.preview_content_uri), '|')", "parts.preview_content_type", "group_concat(quote(parts.fallback_uri), '|')", "group_concat(quote(parts.source), '|')", "group_concat(quote(parts.bundle_index), '|')", "group_concat(quote(parts.blob_id), '|')", "parts.blob_gaia_email", "parts.cms_full_size_blob_id", "parts.cms_media_encryption_key", "parts.cms_compressed_media_encryption_key", "group_concat(quote(parts.blob_upload_permanent_failure), '|')", "group_concat(quote(parts.blob_upload_timestamp), '|')", "group_concat(quote(parts.expressive_sticker_name), '|')", "group_concat(quote(parts.file_name), '|')", "group_concat(quote(parts.duration), '|')", "group_concat(quote(parts.compressed_blob_id), '|')", "parts.cms_compressed_blob_id", "group_concat(quote(parts.compressed_blob_upload_permanent_failure), '|')", "group_concat(quote(parts.compressed_blob_upload_timestamp), '|')", "group_concat(quote(parts.media_encryption_key), '|')", "group_concat(quote(parts.compressed_media_encryption_key), '|')", "group_concat(quote(parts.missing_entry_in_telephony), '|')", "parts.awaiting_reverse_sync", "parts.file_size_bytes", "parts.local_cache_path", "parts.media_send_type", "parts.voice_metadata", "parts.validation_status", "parts.processing_id", "parts.rich_card_media_download_failure_reason", "parts.image_display_state", "group_concat(quote(parts.rowid), '|') AS parts__ROWID", "message_captions.caption"};
    public static final znj b;

    static {
        alok alokVar = new alok();
        alokVar.h("scheduled_send.creation_time", 58020);
        alokVar.h("messages.sender_send_destination", 54040);
        alokVar.h("messages.msisdn_receiving_rcs_message", 59340);
        alokVar.h("messages.receiving_network_country", 54040);
        alokVar.h("messages.queue_insert_timestamp", 17030);
        alokVar.h("messages.message_report_status", 13020);
        alokVar.h("messages.rcs_expiry", 59890);
        alokVar.h("messages.mms_retrieve_text", 9030);
        alokVar.h("messages.my_identity_foreign_key", 60160);
        alokVar.h("messages.cloud_sync_id", 8500);
        alokVar.h("messages.rcs_message_id_with_text_type", 41040);
        alokVar.h("messages.etouffee_status", 29060);
        alokVar.h("messages.verification_status", 29090);
        alokVar.h("messages.rcs_ui_status", 39000);
        alokVar.h("messages.is_hidden", 30010);
        alokVar.h("messages.rcs_remote_instance", 10002);
        alokVar.h("messages.rcs_file_transfer_session_id", 10004);
        alokVar.h("messages.sms_error_code", 9000);
        alokVar.h("messages.sms_error_desc_map_name", 9000);
        alokVar.h("messages.correlation_id", 9010);
        alokVar.h("messages.cms_id", 31010);
        alokVar.h("messages.cms_last_mod_seq", 37040);
        alokVar.h("messages.web_id", 19020);
        alokVar.h("messages.usage_stats_logging_id", 29100);
        alokVar.h("messages.send_counter", 35030);
        alokVar.h("messages.original_rcs_message_id", 35030);
        alokVar.h("messages.custom_delivery_receipt_mime_type", 37020);
        alokVar.h("messages.custom_delivery_receipt_content", 37020);
        alokVar.h("messages.report_attempt_acounter", 37030);
        alokVar.h("messages.custom_headers", 45020);
        alokVar.h("messages.cms_correlation_id", 46010);
        alokVar.h("messages.group_private_participant", 48030);
        alokVar.h("messages.original_message_id", 48030);
        alokVar.h("messages.awaiting_reverse_sync", 49060);
        alokVar.h("messages.old_sms_message_uri", 49060);
        alokVar.h("messages.draft_id", 56000);
        alokVar.h("messages.result_code", 58040);
        alokVar.h("messages.cms_life_cycle", 58210);
        alokVar.h("messages.fallback_reason", 58710);
        alokVar.h("messages.auto_retry_counter", 58230);
        alokVar.h("messages.can_revoke_before_delivered_with_rcs", 58280);
        alokVar.h("messages.trace_id", 58680);
        alokVar.h("messages.outgoing_delivery_report_status", 58720);
        alokVar.h("messages.outgoing_read_report_status", 58720);
        alokVar.h("messages.xms_transport", 59310);
        alokVar.h("messages.message_original_protocol", 59430);
        alokVar.h("messages.satellite_datagram_id", 59490);
        alokVar.h("messages.encryption_protocol", 60190);
        alokVar.h("messages.message_persistence_id", 60370);
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
        alokVar.h("parts.blob_gaia_email", 59570);
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
        alokVar.h("parts.media_send_type", 58150);
        alokVar.h("parts.voice_metadata", 59470);
        alokVar.h("parts.validation_status", 58770);
        alokVar.h("parts.processing_id", 60080);
        alokVar.h("parts.rich_card_media_download_failure_reason", 60230);
        alokVar.h("parts.image_display_state", 60240);
        alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("conversation_id", "index_null_conversation_id");
        alokVar2.b();
        b = new znj((char[]) null);
    }

    public static final wss a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(d.P().W().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("scheduled_send._id");
            alobVar.h("scheduled_send.message_id");
            alobVar.h("scheduled_send.conversation_id");
            alobVar.h("scheduled_send.scheduled_time");
            alobVar.h("scheduled_send.status");
            if (valueOf.intValue() >= 58020) {
                alobVar.h("scheduled_send.creation_time");
            }
            alobVar.h("messages._id");
            alobVar.h("messages.conversation_id");
            alobVar.h("messages.sender_id");
            if (valueOf.intValue() >= 54040) {
                alobVar.h("messages.sender_send_destination");
            }
            if (valueOf.intValue() >= 59340) {
                alobVar.h("messages.msisdn_receiving_rcs_message");
            }
            if (valueOf.intValue() >= 54040) {
                alobVar.h("messages.receiving_network_country");
            }
            alobVar.h("messages.sent_timestamp");
            if (valueOf.intValue() >= 17030) {
                alobVar.h("messages.queue_insert_timestamp");
            }
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
            alobVar.h("messages.mms_transaction_id");
            alobVar.h("messages.mms_content_location");
            alobVar.h("messages.mms_expiry");
            if (valueOf.intValue() >= 59890) {
                alobVar.h("messages.rcs_expiry");
            }
            if (valueOf.intValue() >= 9030) {
                alobVar.h("messages.mms_retrieve_text");
            }
            alobVar.h("messages.raw_status");
            alobVar.h("messages.self_id");
            if (valueOf.intValue() >= 60160) {
                alobVar.h("messages.my_identity_foreign_key");
            }
            alobVar.h("messages.retry_start_timestamp");
            if (valueOf.intValue() >= 8500) {
                alobVar.h("messages.cloud_sync_id");
            }
            if (valueOf.intValue() >= 41040) {
                alobVar.h("messages.rcs_message_id_with_text_type");
            }
            if (valueOf.intValue() >= 29060) {
                alobVar.h("messages.etouffee_status");
            }
            if (valueOf.intValue() >= 29090) {
                alobVar.h("messages.verification_status");
            }
            if (valueOf.intValue() >= 39000) {
                alobVar.h("messages.rcs_ui_status");
            }
            if (valueOf.intValue() >= 30010) {
                alobVar.h("messages.is_hidden");
            }
            if (valueOf.intValue() >= 10002) {
                alobVar.h("messages.rcs_remote_instance");
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
            if (valueOf.intValue() >= 9010) {
                alobVar.h("messages.correlation_id");
            }
            if (valueOf.intValue() >= 31010) {
                alobVar.h("messages.cms_id");
            }
            if (valueOf.intValue() >= 37040) {
                alobVar.h("messages.cms_last_mod_seq");
            }
            if (valueOf.intValue() >= 19020) {
                alobVar.h("messages.web_id");
            }
            if (valueOf.intValue() >= 29100) {
                alobVar.h("messages.usage_stats_logging_id");
            }
            if (valueOf.intValue() >= 35030) {
                alobVar.h("messages.send_counter");
            }
            if (valueOf.intValue() >= 35030) {
                alobVar.h("messages.original_rcs_message_id");
            }
            if (valueOf.intValue() >= 37020) {
                alobVar.h("messages.custom_delivery_receipt_mime_type");
            }
            if (valueOf.intValue() >= 37020) {
                alobVar.h("messages.custom_delivery_receipt_content");
            }
            if (valueOf.intValue() >= 37030) {
                alobVar.h("messages.report_attempt_acounter");
            }
            if (valueOf.intValue() >= 45020) {
                alobVar.h("messages.custom_headers");
            }
            if (valueOf.intValue() >= 46010) {
                alobVar.h("messages.cms_correlation_id");
            }
            if (valueOf.intValue() >= 48030) {
                alobVar.h("messages.group_private_participant");
            }
            if (valueOf.intValue() >= 48030) {
                alobVar.h("messages.original_message_id");
            }
            if (valueOf.intValue() >= 49060) {
                alobVar.h("messages.awaiting_reverse_sync");
            }
            if (valueOf.intValue() >= 49060) {
                alobVar.h("messages.old_sms_message_uri");
            }
            if (valueOf.intValue() >= 56000) {
                alobVar.h("messages.draft_id");
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
            if (valueOf.intValue() >= 58230) {
                alobVar.h("messages.auto_retry_counter");
            }
            if (valueOf.intValue() >= 58280) {
                alobVar.h("messages.can_revoke_before_delivered_with_rcs");
            }
            if (valueOf.intValue() >= 58680) {
                alobVar.h("messages.trace_id");
            }
            if (valueOf.intValue() >= 58720) {
                alobVar.h("messages.outgoing_delivery_report_status");
            }
            if (valueOf.intValue() >= 58720) {
                alobVar.h("messages.outgoing_read_report_status");
            }
            if (valueOf.intValue() >= 59310) {
                alobVar.h("messages.xms_transport");
            }
            if (valueOf.intValue() >= 59430) {
                alobVar.h("messages.message_original_protocol");
            }
            if (valueOf.intValue() >= 59490) {
                alobVar.h("messages.satellite_datagram_id");
            }
            if (valueOf.intValue() >= 60190) {
                alobVar.h("messages.encryption_protocol");
            }
            if (valueOf.intValue() >= 60370) {
                alobVar.h("messages.message_persistence_id");
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
                alobVar.h("parts.blob_gaia_email");
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
                alobVar.h("parts.media_send_type");
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
            alobVar.h("message_captions.caption");
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new wss(strArr);
    }
}
