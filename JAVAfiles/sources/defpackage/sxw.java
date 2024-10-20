package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sxw implements agnn {
    @Override // defpackage.agnn
    public final String a() {
        return "messages";
    }

    @Override // defpackage.agnn
    public final void b(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sender_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sender_send_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("msisdn_receiving_rcs_message TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("receiving_network_country TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sent_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("queue_insert_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("received_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_protocol INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_report_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("seen INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("read INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sms_message_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sms_priority INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sms_message_size INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("mms_subject TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("mms_transaction_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("mms_content_location TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("mms_expiry INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_expiry INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("mms_retrieve_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("raw_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("self_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("my_identity TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("my_identity_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("retry_start_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cloud_sync_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_message_id STRING");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_message_id_with_text_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("etouffee_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("verification_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_ui_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_hidden INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_remote_instance STRING");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_file_transfer_session_id INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sms_error_code INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sms_error_desc_map_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("correlation_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_last_mod_seq INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("web_id TEXT DEFAULT('')");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("usage_stats_logging_id INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("send_counter INT DEFAULT(1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("original_rcs_message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("custom_delivery_receipt_mime_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("custom_delivery_receipt_content BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("report_attempt_acounter INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("custom_headers BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_correlation_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("group_private_participant INT REFERENCES participants(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("original_message_id INT REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("awaiting_reverse_sync INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("old_sms_message_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("draft_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("result_code INT DEFAULT(-2)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_life_cycle INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("fallback_reason INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("auto_retry_counter INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("can_revoke_before_delivered_with_rcs INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("trace_id BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("outgoing_delivery_report_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("outgoing_read_report_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("xms_transport INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_original_protocol INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("satellite_datagram_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("encryption_protocol INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_persistence_id TEXT");
        sb.insert(0, "CREATE TABLE messages (");
        sb.append(", FOREIGN KEY (conversation_id) REFERENCES conversations (_id) ON DELETE CASCADE FOREIGN KEY (sender_id) REFERENCES participants (_id) ON DELETE SET NULL FOREIGN KEY (self_id) REFERENCES participants (_id) ON DELETE SET NULL);");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_messages_status_seen");
        arrayList.add("CREATE INDEX index_messages_status_seen ON messages(message_status, seen);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_sort");
        arrayList.add("CREATE INDEX index_messages_sort ON messages(conversation_id, message_status, received_timestamp);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_rcs_message_id");
        arrayList.add("CREATE UNIQUE INDEX index_messages_rcs_message_id ON messages(rcs_message_id, seen);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_ui_sort");
        arrayList.add("CREATE INDEX index_messages_ui_sort ON messages(conversation_id, received_timestamp);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_read_0");
        arrayList.add("CREATE INDEX IF NOT EXISTS index_messages_read_0 ON messages(read) WHERE read == 0;");
        arrayList.add("DROP INDEX IF EXISTS index_messages_web_id");
        arrayList.add("CREATE INDEX IF NOT EXISTS index_messages_web_id ON messages(web_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_cms_id");
        arrayList.add("CREATE UNIQUE INDEX index_messages_cms_id ON messages(cms_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_verification_status");
        arrayList.add("CREATE INDEX index_messages_verification_status ON messages(verification_status) WHERE verification_status <> 0;");
        arrayList.add("DROP INDEX IF EXISTS index_messages_seen_0");
        arrayList.add("CREATE INDEX IF NOT EXISTS index_messages_seen_0 ON messages(seen) WHERE seen == 0;");
        arrayList.add("DROP INDEX IF EXISTS rcs_message_id_and_seen_index");
        arrayList.add("CREATE UNIQUE INDEX rcs_message_id_and_seen_index ON messages(rcs_message_id_with_text_type, seen);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_cms_correlation_id");
        arrayList.add("CREATE UNIQUE INDEX index_messages_cms_correlation_id ON messages(cms_correlation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_is_hidden_0");
        arrayList.add("CREATE INDEX index_messages_is_hidden_0 ON messages(is_hidden) WHERE is_hidden = 0;");
        arrayList.add("DROP INDEX IF EXISTS index_messages_draft_id");
        arrayList.add("CREATE UNIQUE INDEX index_messages_draft_id ON messages(draft_id) WHERE draft_id NOT NULL;");
        arrayList.add("DROP INDEX IF EXISTS index_messages_sms_message_uri");
        arrayList.add("CREATE INDEX index_messages_sms_message_uri ON messages(sms_message_uri);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_sender_id");
        arrayList.add("CREATE INDEX index_messages_sender_id ON messages(sender_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_sent_timestamp");
        arrayList.add("CREATE INDEX index_messages_sent_timestamp ON messages(sent_timestamp);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_received_timestamp");
        arrayList.add("CREATE INDEX index_messages_received_timestamp ON messages(received_timestamp);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_cloud_sync_id");
        arrayList.add("CREATE INDEX index_messages_cloud_sync_id ON messages(cloud_sync_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_is_hidden_0");
        arrayList.add("DROP INDEX IF EXISTS index_messages_is_hidden_0");
        arrayList.add("DROP INDEX IF EXISTS index_messages_is_hidden");
        arrayList.add("CREATE INDEX index_messages_is_hidden ON messages(is_hidden);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_awaiting_reverse_sync");
        arrayList.add("CREATE INDEX index_messages_awaiting_reverse_sync ON messages(awaiting_reverse_sync) WHERE awaiting_reverse_sync = 1;");
        arrayList.add("DROP INDEX IF EXISTS index_messages_original_message_id");
        arrayList.add("CREATE INDEX index_messages_original_message_id ON messages(original_message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_self_id");
        arrayList.add("CREATE INDEX index_messages_self_id ON messages(self_id) WHERE self_id NOT NULL;");
        arrayList.add("DROP INDEX IF EXISTS index_messages_group_private_participant");
        arrayList.add("CREATE INDEX index_messages_group_private_participant ON messages(group_private_participant) WHERE group_private_participant NOT NULL;");
        arrayList.add("DROP INDEX IF EXISTS index_messages_satellite_datagram_id");
        arrayList.add("CREATE UNIQUE INDEX index_messages_satellite_datagram_id ON messages(satellite_datagram_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_original_rcs_message_id");
        arrayList.add("CREATE INDEX index_messages_original_rcs_message_id ON messages(original_rcs_message_id) WHERE original_rcs_message_id NOT NULL;");
        arrayList.add("DROP INDEX IF EXISTS index_messages_my_identity");
        arrayList.add("CREATE INDEX index_messages_my_identity ON messages(my_identity);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_rcs_expiry");
        arrayList.add("CREATE INDEX index_messages_rcs_expiry ON messages(rcs_expiry) WHERE rcs_expiry NOT NULL;");
        arrayList.add("DROP INDEX IF EXISTS index_messages_my_identity_foreign_key");
        arrayList.add("CREATE INDEX index_messages_my_identity_foreign_key ON messages(my_identity_foreign_key);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_message_persistence_id");
        arrayList.add("CREATE UNIQUE INDEX index_messages_message_persistence_id ON messages(message_persistence_id) WHERE message_persistence_id NOT NULL;");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
