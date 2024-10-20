package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class swa implements apxw {
    public static agns a() {
        return new agnf(svz.c, "message_replies", new sth(10));
    }

    public static agmh[] c() {
        return twj.f();
    }

    public static agmh[] d() {
        return (agmh[]) swk.c.e;
    }

    public static agns e() {
        return new agnf(swk.b, "message_send_receive_attempt", new sth(11));
    }

    public static agmh[] f() {
        return (agmh[]) sww.c.e;
    }

    public static agns g() {
        return new agnf(sww.b, "message_spam", new sth(12));
    }

    public static agmh[] h() {
        return tze.d();
    }

    public static agns i() {
        return new agnf(sxc.c, "message_star", new sth(13));
    }

    public static agmh[] j() {
        return (agmh[]) sxl.d.a;
    }

    public static agns k() {
        return new agnf(sxl.c, "message_status", new sth(14));
    }

    public static agmh[] l() {
        return tzx.d();
    }

    public static agns m() {
        return new agnf(MessagesTable.d, "messages", new agne() { // from class: sxv
            @Override // defpackage.agne
            public final void a(int i, agnw agnwVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = MessagesTable.a;
                valueOf.getClass();
                switch (i) {
                    case 8500:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN cloud_sync_id TEXT;");
                        return;
                    case 9000:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN sms_error_code INT DEFAULT(-1);");
                        agnwVar.z("ALTER TABLE messages ADD COLUMN sms_error_desc_map_name TEXT;");
                        return;
                    case 9010:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN correlation_id TEXT;");
                        return;
                    case 9030:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN mms_retrieve_text TEXT;");
                        return;
                    case 10000:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN rcs_message_id STRING;");
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_rcs_message_id");
                        agnwVar.z("CREATE UNIQUE INDEX index_messages_rcs_message_id ON messages(rcs_message_id, seen);");
                        return;
                    case 10002:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN rcs_remote_instance STRING;");
                        return;
                    case 10004:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN rcs_file_transfer_session_id INT DEFAULT(-1);");
                        return;
                    case 13020:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN message_report_status INT DEFAULT(0);");
                        return;
                    case 17030:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN queue_insert_timestamp INT DEFAULT(0);");
                        return;
                    case 19020:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN web_id TEXT DEFAULT('');");
                        return;
                    case 22080:
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_ui_sort");
                        agnwVar.z("CREATE INDEX index_messages_ui_sort ON messages(conversation_id, received_timestamp);");
                        return;
                    case 24090:
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_read_0");
                        agnwVar.z("CREATE INDEX IF NOT EXISTS index_messages_read_0 ON messages(read) WHERE read == 0;");
                        return;
                    case 25010:
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_web_id");
                        agnwVar.z("CREATE INDEX IF NOT EXISTS index_messages_web_id ON messages(web_id);");
                        return;
                    case 29060:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN etouffee_status INT DEFAULT(0);");
                        return;
                    case 29090:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN verification_status INT DEFAULT(0);");
                        return;
                    case 29100:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN usage_stats_logging_id INT DEFAULT(0);");
                        return;
                    case 30010:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN is_hidden INT DEFAULT(0);");
                        return;
                    case 31010:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN cms_id TEXT;");
                        agnwVar.z("CREATE UNIQUE INDEX index_messages_cms_id ON messages(cms_id);");
                        return;
                    case 32050:
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_verification_status");
                        agnwVar.z("CREATE INDEX index_messages_verification_status ON messages(verification_status) WHERE verification_status <> 0;");
                        return;
                    case 35030:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN send_counter INT DEFAULT(1);");
                        agnwVar.z("ALTER TABLE messages ADD COLUMN original_rcs_message_id TEXT;");
                        return;
                    case 36000:
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_seen_0");
                        agnwVar.z("CREATE INDEX IF NOT EXISTS index_messages_seen_0 ON messages(seen) WHERE seen == 0;");
                        return;
                    case 37020:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN custom_delivery_receipt_mime_type TEXT;");
                        agnwVar.z("ALTER TABLE messages ADD COLUMN custom_delivery_receipt_content BLOB;");
                        return;
                    case 37030:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN report_attempt_acounter INT DEFAULT(0);");
                        return;
                    case 37040:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN cms_last_mod_seq INTEGER;");
                        return;
                    case 39000:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN rcs_ui_status INT DEFAULT(0);");
                        return;
                    case 41040:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN rcs_message_id_with_text_type TEXT;");
                        agnwVar.z("DROP INDEX IF EXISTS rcs_message_id_and_seen_index");
                        agnwVar.z("CREATE UNIQUE INDEX rcs_message_id_and_seen_index ON messages(rcs_message_id_with_text_type, seen);");
                        return;
                    case 45020:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN custom_headers BLOB;");
                        return;
                    case 46010:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN cms_correlation_id TEXT;");
                        agnwVar.z("CREATE UNIQUE INDEX index_messages_cms_correlation_id ON messages(cms_correlation_id);");
                        return;
                    case 48030:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN group_private_participant INT REFERENCES participants(_id) ON DELETE CASCADE ;");
                        agnwVar.z("ALTER TABLE messages ADD COLUMN original_message_id INT REFERENCES messages(_id) ON DELETE CASCADE ;");
                        return;
                    case 49060:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN awaiting_reverse_sync INT DEFAULT(0);");
                        agnwVar.z("ALTER TABLE messages ADD COLUMN old_sms_message_uri TEXT;");
                        return;
                    case 54040:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN sender_send_destination TEXT;");
                        agnwVar.z("ALTER TABLE messages ADD COLUMN receiving_network_country TEXT;");
                        return;
                    case 54070:
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_is_hidden_0");
                        agnwVar.z("CREATE INDEX index_messages_is_hidden_0 ON messages(is_hidden) WHERE is_hidden = 0;");
                        return;
                    case 56000:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN draft_id TEXT;");
                        agnwVar.z("CREATE UNIQUE INDEX index_messages_draft_id ON messages(draft_id) WHERE draft_id NOT NULL;");
                        return;
                    case 58040:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN result_code INT DEFAULT(-2);");
                        return;
                    case 58060:
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_sms_message_uri");
                        agnwVar.z("CREATE INDEX index_messages_sms_message_uri ON messages(sms_message_uri);");
                        return;
                    case 58210:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN cms_life_cycle INT DEFAULT(0);");
                        return;
                    case 58230:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN auto_retry_counter INT DEFAULT(0);");
                        return;
                    case 58280:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN can_revoke_before_delivered_with_rcs INTEGER DEFAULT(0);");
                        return;
                    case 58360:
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_sender_id");
                        agnwVar.z("CREATE INDEX index_messages_sender_id ON messages(sender_id);");
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_sent_timestamp");
                        agnwVar.z("CREATE INDEX index_messages_sent_timestamp ON messages(sent_timestamp);");
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_received_timestamp");
                        agnwVar.z("CREATE INDEX index_messages_received_timestamp ON messages(received_timestamp);");
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_cloud_sync_id");
                        agnwVar.z("CREATE INDEX index_messages_cloud_sync_id ON messages(cloud_sync_id);");
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_is_hidden_0");
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_is_hidden");
                        agnwVar.z("CREATE INDEX index_messages_is_hidden ON messages(is_hidden);");
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_awaiting_reverse_sync");
                        agnwVar.z("CREATE INDEX index_messages_awaiting_reverse_sync ON messages(awaiting_reverse_sync) WHERE awaiting_reverse_sync = 1;");
                        return;
                    case 58680:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN trace_id BLOB;");
                        return;
                    case 58710:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN fallback_reason INT DEFAULT(0);");
                        return;
                    case 58720:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN outgoing_delivery_report_status INT DEFAULT(0);");
                        agnwVar.z("ALTER TABLE messages ADD COLUMN outgoing_read_report_status INT DEFAULT(0);");
                        return;
                    case 58740:
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_original_message_id");
                        agnwVar.z("CREATE INDEX index_messages_original_message_id ON messages(original_message_id);");
                        return;
                    case 59160:
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_self_id");
                        agnwVar.z("CREATE INDEX index_messages_self_id ON messages(self_id) WHERE self_id NOT NULL;");
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_group_private_participant");
                        agnwVar.z("CREATE INDEX index_messages_group_private_participant ON messages(group_private_participant) WHERE group_private_participant NOT NULL;");
                        return;
                    case 59310:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN xms_transport INT DEFAULT(0);");
                        return;
                    case 59340:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN msisdn_receiving_rcs_message TEXT;");
                        return;
                    case 59430:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN message_original_protocol INT DEFAULT(-1);");
                        return;
                    case 59490:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN satellite_datagram_id TEXT;");
                        return;
                    case 59510:
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_satellite_datagram_id");
                        agnwVar.z("CREATE UNIQUE INDEX index_messages_satellite_datagram_id ON messages(satellite_datagram_id);");
                        return;
                    case 59530:
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_original_rcs_message_id");
                        agnwVar.z("CREATE INDEX index_messages_original_rcs_message_id ON messages(original_rcs_message_id) WHERE original_rcs_message_id NOT NULL;");
                        return;
                    case 59810:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN my_identity TEXT;");
                        agnwVar.z("CREATE INDEX index_messages_my_identity ON messages(my_identity);");
                        return;
                    case 59890:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN rcs_expiry INT DEFAULT(0);");
                        agnwVar.z("CREATE INDEX index_messages_rcs_expiry ON messages(rcs_expiry) WHERE rcs_expiry NOT NULL;");
                        return;
                    case 60160:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN my_identity_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                        agnwVar.z("CREATE INDEX index_messages_my_identity_foreign_key ON messages(my_identity_foreign_key);");
                        return;
                    case 60190:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN encryption_protocol INT DEFAULT(0);");
                        return;
                    case 60370:
                        agnwVar.z("ALTER TABLE messages ADD COLUMN message_persistence_id TEXT;");
                        agnwVar.z("CREATE UNIQUE INDEX index_messages_message_persistence_id ON messages(message_persistence_id) WHERE message_persistence_id NOT NULL;");
                        return;
                    default:
                        return;
                }
            }
        });
    }

    public static agmh[] n() {
        return (agmh[]) syj.d.a;
    }

    public static agns o() {
        return new agnf(syj.b, "modified_by", new sth(15));
    }

    public static agns p() {
        return new agnf(syj.c, true, "modified_by", new sth(16));
    }

    public static agmh[] q() {
        return (agmh[]) syr.c.b;
    }

    public static agns r() {
        return new agnf(syr.b, "smarts_personalization_decayed_feature_values", new sth(17));
    }

    public static agmh[] s() {
        return (agmh[]) syx.c.a;
    }

    public static agns t() {
        return new agnf(syx.b, "smarts_personalization_features", new sth(18));
    }

    public static agmh[] u() {
        return (agmh[]) szd.c.c;
    }

    public static agns v() {
        return new agnf(szd.b, "smarts_personalization_normalized_feature_values", new sth(19));
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        throw null;
    }
}
