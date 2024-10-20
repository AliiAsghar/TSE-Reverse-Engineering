package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qxq {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String[] e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String[] j;
    public static final xze k;
    private static final uuf n;
    public final armf l;
    public final qif m;
    private final armf o;
    private final armf p;
    private final Map q;
    private final armf r;
    private final qyd s;

    static {
        String[] strArr = PartsTable.a;
        String str = "CREATE TRIGGER parts_TRIGGER AFTER INSERT ON parts FOR EACH ROW  BEGIN UPDATE parts SET timestamp= (SELECT received_timestamp FROM messages WHERE " + MessagesTable.c.a.toString() + "=NEW.message_id) WHERE " + PartsTable.d.a.toString() + "=NEW._id; END";
        a = str;
        String str2 = "CREATE TRIGGER parts_BLOB_TRIGGER AFTER UPDATE OF blob_id ON parts FOR EACH ROW  BEGIN UPDATE parts SET blob_upload_timestamp=1000*strftime('%s','now') WHERE " + PartsTable.d.a.toString() + "=NEW._id; END";
        b = str2;
        String str3 = "CREATE TRIGGER parts_COMPRESSED_BLOB_TRIGGER AFTER UPDATE OF compressed_blob_id ON parts FOR EACH ROW  BEGIN UPDATE parts SET compressed_blob_upload_timestamp=1000*strftime('%s','now') WHERE " + PartsTable.d.a.toString() + "=NEW._id; END";
        c = str3;
        String str4 = "CREATE TRIGGER messages_TRIGGER AFTER UPDATE OF received_timestamp ON messages FOR EACH ROW BEGIN UPDATE parts SET timestamp = NEW.received_timestamp WHERE " + PartsTable.d.b.toString() + " = NEW._id; END;";
        d = str4;
        e = new String[]{str, str4, str2, str3, rzx.b(2), rzx.b(1), rzx.b(3), rzx.b(4), rzx.c(2), rzx.c(3), rzx.c(4), rzx.a(2), rzx.a(1), rzx.a(3), rzx.a(4), "CREATE TRIGGER participants_IS_NOT_EMPTY_TRIGER AFTER UPDATE ON participants WHEN NOT( OLD.is_valid_phone_number_data ) AND NEW.send_destination IS NOT NULL AND NEW.display_destination IS NOT NULL AND NEW.normalized_destination IS NOT NULL AND length(NEW.send_destination ) > 0  AND length(NEW.display_destination ) > 0  AND length(NEW.normalized_destination) > 0  BEGIN UPDATE participants  SET is_valid_phone_number_data = 1  WHERE rowid=NEW.rowid; END;"};
        String[] strArr2 = sss.a;
        f = "index_link_preview_message_id ON link_preview(message_id)";
        g = "CREATE INDEX IF NOT EXISTS ".concat(String.valueOf("index_link_preview_message_id ON link_preview(message_id)"));
        h = "CREATE INDEX ".concat(String.valueOf("index_link_preview_message_id ON link_preview(message_id)"));
        String[] strArr3 = tnc.a;
        i = "CREATE INDEX index_stickers_sticker_set_id ON stickers(sticker_set_id)";
        String[] strArr4 = skb.a;
        String[] strArr5 = scd.a;
        String str5 = qxh.b;
        String[] strArr6 = seb.a;
        String[] strArr7 = toc.a;
        String[] strArr8 = sdp.a;
        j = new String[]{"CREATE VIEW conversation_image_parts_view AS SELECT messages.conversation_id AS conversation_id_messages,messages.received_timestamp AS received_timestamp_messages,messages.message_status AS status_messages,parts.uri AS uri_parts,parts.content_type AS content_type_parts,parts.original_uri AS original_uri_parts,participants.display_destination AS display_destination_participants,participants.full_name AS full_name_participants FROM messages LEFT JOIN parts ON (parts.message_id=messages._id) LEFT JOIN participants ON (participants._id=messages.sender_id) WHERE ((parts.content_type like 'image/%' OR parts.content_type = 'application/vnd.gsma.rcspushlocation+xml') AND parts.source <> 19 AND (parts.image_display_state = 0 OR parts.image_display_state = 1 OR parts.image_display_state = 3)) ORDER BY received_timestamp ASC, parts._id ASC;", "CREATE VIEW draft_parts_view AS SELECT messages._id AS _id_messages,messages.conversation_id AS conversation_id_messages,messages.sender_id AS sender_participant_id_messages,messages.sender_send_destination AS sender_send_destination_messages,messages.msisdn_receiving_rcs_message AS msisdn_receiving_rcs_message_messages,messages.receiving_network_country AS receiving_network_country_messages,messages.sent_timestamp AS sent_timestamp_messages,messages.queue_insert_timestamp AS queue_insert_timestamp_messages,messages.received_timestamp AS received_timestamp_messages,messages.message_protocol AS protocol_messages,messages.message_status AS status_messages,messages.message_report_status AS message_report_status_messages,messages.seen AS notified_messages,messages.read AS read_messages,messages.sms_message_uri AS sms_message_uri_messages,messages.sms_priority AS sms_priority_messages,messages.sms_message_size AS sms_message_size_messages,messages.mms_subject AS mms_subject_messages,messages.mms_transaction_id AS mms_transaction_id_messages,messages.mms_content_location AS mms_content_location_messages,messages.mms_expiry AS mms_expiry_messages,messages.rcs_expiry AS rcs_expiry_messages,messages.mms_retrieve_text AS mms_retrieve_text_messages,messages.raw_status AS raw_telephony_status_messages,messages.self_id AS self_id_messages,messages.my_identity_foreign_key AS my_identity_messages,messages.retry_start_timestamp AS retry_start_timestamp_messages,messages.cloud_sync_id AS cloud_sync_id_messages,messages.rcs_message_id_with_text_type AS rcs_message_id_messages,messages.etouffee_status AS rcs_encryption_status_messages,messages.verification_status AS verification_status_messages,messages.rcs_ui_status AS rcs_ui_status_messages,messages.is_hidden AS is_hidden_messages,messages.rcs_remote_instance AS rcs_remote_instance_messages,messages.rcs_file_transfer_session_id AS rcs_file_transfer_session_id_messages,messages.sms_error_code AS sms_error_code_messages,messages.sms_error_desc_map_name AS sms_error_desc_map_name_messages,messages.correlation_id AS correlation_id_messages,messages.cms_id AS cms_id_messages,messages.cms_last_mod_seq AS cms_last_mod_seq_messages,messages.web_id AS web_id_messages,messages.usage_stats_logging_id AS usage_stats_logging_id_messages,messages.send_counter AS send_counter_messages,messages.original_rcs_message_id AS original_rcs_message_id_messages,messages.custom_delivery_receipt_mime_type AS custom_delivery_receipt_mime_type_messages,messages.custom_delivery_receipt_content AS custom_delivery_receipt_content_messages,messages.report_attempt_acounter AS report_attempt_counter_messages,messages.custom_headers AS custom_headers_messages,messages.cms_correlation_id AS cms_correlation_id_messages,messages.group_private_participant AS group_private_participant_messages,messages.original_message_id AS original_message_id_messages,messages.awaiting_reverse_sync AS awaiting_reverse_sync_messages,messages.old_sms_message_uri AS old_sms_message_uri_messages,messages.draft_id AS draft_id_messages,messages.result_code AS result_code_messages,messages.cms_life_cycle AS cms_life_cycle_messages,messages.fallback_reason AS fallback_reason_messages,messages.auto_retry_counter AS auto_retry_counter_messages,messages.can_revoke_before_delivered_with_rcs AS can_revoke_before_delivered_with_rcs_messages,messages.trace_id AS trace_id_messages,messages.outgoing_delivery_report_status AS outgoing_delivery_report_status_messages,messages.outgoing_read_report_status AS outgoing_read_report_status_messages,messages.xms_transport AS xms_transport_messages,messages.message_original_protocol AS original_protocol_messages,messages.satellite_datagram_id AS satellite_datagram_id_messages,messages.encryption_protocol AS encryption_protocol_messages,messages.message_persistence_id AS message_persistence_id_messages,parts._id AS _id_parts,parts.message_id AS message_id_parts,parts.text AS text_parts,parts.uri AS uri_parts,parts.content_type AS content_type_parts,parts.original_uri AS original_uri_parts,parts.storage_uri AS storage_uri_parts,parts.width AS width_parts,parts.height AS height_parts,parts.timestamp AS timestamp_parts,parts.output_uri AS processing_output_uri_parts,parts.target_size AS target_size_parts,parts.processing_status AS processing_status_parts,parts.cms_attachment_processing_status AS cms_attachment_processing_status_parts,parts.conversation_id AS conversation_id_parts,parts.sticker_set_id AS sticker_set_id_parts,parts.sticker_id AS sticker_id_parts,parts.media_modified_timestamp AS media_modified_timestamp_parts,parts.longitude AS longitude_parts,parts.latitude AS latitude_parts,parts.preview_content_uri AS preview_content_uri_parts,parts.preview_content_type AS preview_content_type_parts,parts.fallback_uri AS fallback_uri_parts,parts.source AS source_parts,parts.bundle_index AS bundle_index_parts,parts.blob_id AS blob_id_parts,parts.blob_gaia_email AS blob_gaia_email_parts,parts.cms_full_size_blob_id AS cms_full_size_blob_id_parts,parts.cms_media_encryption_key AS cms_media_encryption_key_parts,parts.cms_compressed_media_encryption_key AS cms_compressed_media_encryption_key_parts,parts.blob_upload_permanent_failure AS blob_upload_permanent_failure_parts,parts.blob_upload_timestamp AS blob_upload_timestamp_parts,parts.expressive_sticker_name AS expressive_sticker_name_parts,parts.file_name AS file_name_parts,parts.duration AS duration_parts,parts.compressed_blob_id AS compressed_blob_id_parts,parts.cms_compressed_blob_id AS cms_compressed_blob_id_parts,parts.compressed_blob_upload_permanent_failure AS compressed_blob_upload_permanent_failure_parts,parts.compressed_blob_upload_timestamp AS compressed_blob_upload_timestamp_parts,parts.media_encryption_key AS media_encryption_key_parts,parts.compressed_media_encryption_key AS compressed_media_encryption_key_parts,parts.missing_entry_in_telephony AS missing_entry_in_telephony_parts,parts.awaiting_reverse_sync AS awaiting_reverse_sync_parts,parts.file_size_bytes AS file_size_bytes_parts,parts.local_cache_path AS local_cache_path_parts,parts.media_send_type AS media_send_type_parts,parts.voice_metadata AS voice_metadata_parts,parts.validation_status AS validation_status_parts,parts.processing_id AS processing_id_parts,parts.rich_card_media_download_failure_reason AS rich_card_media_download_failure_reason_parts,parts.image_display_state AS image_display_state_parts FROM messages JOIN parts ON (parts.message_id=messages._id) WHERE message_status = 3;", str5, "CREATE VIEW reports_concat_view AS SELECT read_reports._id AS _id_read_reports,read_reports.message_id AS message_id_read_reports,group_concat(quote(read_reports.participant_id), '|') AS participant_id_read_reports,group_concat(quote(read_reports.receive_time), '|') AS receive_time_read_reports,group_concat(quote(read_reports.read_time), '|') AS read_time_read_reports,group_concat(quote(read_reports.ftd_time), '|') AS ftd_time_read_reports,group_concat(quote(read_reports.rowid), '|') AS read_reports__ROWID_read_reports FROM read_reports GROUP BY message_id;", "CREATE VIEW user_refs_concat_view AS SELECT user_references.message_id AS message_id_user_references,group_concat(quote(user_references.user_ref_id), '|') AS participant_id_user_references,group_concat(quote(user_references.user_ref_datetime), '|') AS user_ref_datetime_user_references,group_concat(quote(user_references.rowid), '|') AS user_references__ROWID_user_references,group_concat(quote((coalesce(participants.first_name,participants.full_name,participants.display_destination))), '|') AS user_ref_display_name,group_concat(quote((ifnull(participants.profile_photo_uri,\"\"))), '|') AS user_ref_profile_photo_uri,group_concat(quote((ifnull(participants.full_name,\"\"))), '|') AS user_ref_full_name,group_concat(quote((ifnull(participants.lookup_key,\"\"))), '|') AS user_ref_lookup_key,group_concat(quote(participants.normalized_destination), '|') AS normalized_destination_participants,group_concat(quote(participants.color_palette_index), '|') AS color_palette_index_participants,group_concat(quote(participants.color_type), '|') AS color_type_participants,group_concat(quote(participants.extended_color), '|') AS extended_color_participants,group_concat(quote(participants.rowid), '|') AS participants__ROWID_participants FROM user_references LEFT JOIN participants ON (participants._id=user_references.user_ref_id) GROUP BY user_references.message_id;", "CREATE VIEW message_replies_view AS SELECT message_replies.message_id AS message_id_message_replies,messages._id AS _id_messages,messages.received_timestamp AS received_timestamp_messages,participants._id AS _id_participants,participants.sub_id AS sub_id_participants,participants.normalized_destination AS normalized_destination_participants,participants.display_destination AS display_destination_participants,participants.full_name AS full_name_participants,participants.first_name AS first_name_participants,group_concat(quote(parts._id), '|') AS _id_parts,group_concat(quote(parts.text), '|') AS text_parts,group_concat(quote(parts.uri), '|') AS uri_parts,group_concat(quote(parts.content_type), '|') AS content_type_parts,group_concat(quote(parts.file_name), '|') AS file_name_parts,group_concat(quote(parts.duration), '|') AS duration_parts,group_concat(quote(parts.rowid), '|') AS parts__ROWID_parts,link_preview.trigger_url AS trigger_url_link_preview,link_preview.expiration_time_millis AS expiration_time_millis_link_preview,link_preview.link_title AS link_title_link_preview,link_preview.link_image_url AS link_image_url_link_preview,link_preview.link_preview_failed AS link_preview_failed_link_preview FROM message_replies LEFT JOIN messages ON (messages._id=message_replies.replied_to_message_id) LEFT JOIN participants ON (participants._id=messages.sender_id) LEFT JOIN parts ON (parts.message_id=messages._id) LEFT JOIN link_preview ON (link_preview.message_id=messages._id) WHERE (message_replies.replied_to_message_id NOTNULL AND (messages._id NOTNULL AND participants._id NOTNULL AND parts._id NOTNULL) AND (messages.message_status IN (100, 1, 2, 11) AND messages.is_hidden = 0)) OR (message_replies.replied_to_message_id ISNULL AND message_replies.replied_to_message_id_null_reason = 0) GROUP BY message_replies.message_id;"};
        k = xze.g("BugleDataModel", "DatabaseHelperUtils");
        n = uuh.i(uuh.b, "useTriggersForParticipantsAuditLog", true);
    }

    public qxq(armf armfVar, armf armfVar2, Map map, armf armfVar3, armf armfVar4, qif qifVar, qyd qydVar) {
        this.o = armfVar;
        this.p = armfVar2;
        this.q = map;
        this.r = armfVar3;
        this.l = armfVar4;
        this.m = qifVar;
        this.s = qydVar;
    }

    public static int a(int i2) {
        return i2 + 1;
    }

    public static int b(agna agnaVar) {
        return a(agnaVar.c);
    }

    public static String c(String str) {
        Iterator it = anna.e('.').a(str).iterator();
        it.next();
        return (String) it.next();
    }

    public static void e(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("sqlite_master", k(), "type='trigger'", null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    String string = query.getString(0);
                    if (!string.startsWith("android_") && !string.startsWith("sqlite_")) {
                        try {
                            sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS " + string);
                        } catch (SQLException e2) {
                            xyo a2 = k.a();
                            a2.H("unable to drop trigger.");
                            a2.z("triggerName", string);
                            a2.r(e2);
                        }
                    }
                } finally {
                    query.close();
                }
            }
        }
    }

    public static void f(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("sqlite_master", k(), "type='view'", null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    l(sQLiteDatabase, query.getString(0));
                } finally {
                    query.close();
                }
            }
        }
    }

    public static void g(agnw agnwVar) {
        if (agnwVar.n().b.equals("$primary")) {
            String[] strArr = j;
            int length = strArr.length;
            for (int i2 = 0; i2 < 6; i2++) {
                agnwVar.z(strArr[i2]);
            }
        }
    }

    public static void h(agnw agnwVar) {
        if (agnwVar.n().b.equals("$primary") && ((Boolean) n.e()).booleanValue()) {
            String str = (String) DesugarArrays.stream(sld.a).map(new qxo(2)).collect(Collectors.joining(", "));
            String str2 = (String) DesugarArrays.stream(sld.a).map(new qxo(3)).collect(Collectors.joining(", "));
            q(sld.a, sks.a);
            agnwVar.z(o(str, "conversation_participants_insert_audit_log", "conversation_participants_audit_log", "conversation_participants"));
            agnwVar.z(p(str, "conversation_participants_update_audit_log", "conversation_participants_audit_log", "conversation_participants"));
            agnwVar.z(n(str2, "conversation_participants_delete_audit_log", "conversation_participants_audit_log", "conversation_participants"));
            int i2 = 1;
            String str3 = (String) DesugarArrays.stream(smp.a).map(new qxo(i2)).collect(Collectors.joining(", "));
            int i3 = 0;
            String str4 = (String) DesugarArrays.stream(smp.a).map(new qxo(i3)).collect(Collectors.joining(", "));
            q(smp.a, smf.a);
            agnwVar.z(o(str3, "conversation_to_participants_insert_audit_log", "conversation_to_participants_audit_log", "conversation_to_participants"));
            agnwVar.z(p(str3, "conversation_to_participants_update_audit_log", "conversation_to_participants_audit_log", "conversation_to_participants"));
            agnwVar.z(n(str4, "conversation_to_participants_delete_audit_log", "conversation_to_participants_audit_log", "conversation_to_participants"));
            alog t = alog.t("_id", "operation_datetime", "operation_type");
            List list = (List) DesugarArrays.stream(ParticipantsTable.a).map(new qxo(5)).map(new qxo(6)).sorted().map(new qxo(7)).collect(Collectors.toCollection(new qxs(i2)));
            List list2 = (List) DesugarArrays.stream(tan.a).map(new qxo(8)).filter(new qxp(t, i2)).filter(new qxp(list, i3)).sorted().collect(Collectors.toUnmodifiableList());
            String str5 = (String) Collection.EL.stream(list).map(new qxo(9)).collect(Collectors.joining(", "));
            String str6 = (String) Collection.EL.stream(list).map(new qxo(10)).collect(Collectors.joining(", "));
            String d2 = ParticipantsTable.c.i.d();
            albo.C(d2);
            String d3 = ParticipantsTable.c.h.d();
            albo.C(d3);
            String d4 = ParticipantsTable.c.y.d();
            albo.C(d4);
            String d5 = ParticipantsTable.c.f.d();
            albo.C(d5);
            String d6 = ParticipantsTable.c.g.d();
            albo.C(d6);
            String d7 = ParticipantsTable.c.m.d();
            albo.C(d7);
            String d8 = ParticipantsTable.c.q.d();
            albo.C(d8);
            String d9 = ParticipantsTable.c.d.d();
            albo.C(d9);
            String d10 = ParticipantsTable.c.e.d();
            albo.C(d10);
            String str7 = (String) DesugarArrays.stream(new String[]{d2, d3, d4, d5, d6, d7, d8, d9, d10}).map(new qvm(20)).collect(Collectors.joining(" OR "));
            q(ParticipantsTable.a, tan.a);
            agnwVar.z("CREATE TRIGGER participants_insert_audit_log AFTER INSERT ON participants FOR EACH ROW  WHEN NEW.sub_id = -2 BEGIN INSERT INTO participants_audit_log (operation_datetime, operation_type, " + d.I(list2) + ") VALUES (CAST(((julianday('now') - 2440587.5) * 86400.0 * 1000) AS INT), 1, " + str5 + "); END");
            agnwVar.z("CREATE TRIGGER participants_update_audit_log AFTER UPDATE ON participants  FOR EACH ROW  WHEN (OLD.sub_id = -2 OR NEW.sub_id = -2) AND ( " + str7 + " ) BEGIN INSERT INTO participants_audit_log (operation_datetime, operation_type, " + d.I(list2) + ") VALUES (CAST(((julianday('now') - 2440587.5) * 86400.0 * 1000) AS INT), 2, " + str5 + "); END");
            String I = d.I(list2);
            StringBuilder sb = new StringBuilder("CREATE TRIGGER participants_delete_audit_log AFTER DELETE ON participants  FOR EACH ROW  WHEN OLD.sub_id = -2 BEGIN INSERT INTO participants_audit_log (operation_datetime, operation_type, ");
            sb.append(I);
            sb.append(") VALUES (CAST(((julianday('now') - 2440587.5) * 86400.0 * 1000) AS INT), 3, ");
            sb.append(str6);
            sb.append("); END");
            agnwVar.z(sb.toString());
        }
    }

    public static boolean i(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("pragma foreign_keys", null);
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToFirst()) {
                    if (rawQuery.getInt(0) == 1) {
                        rawQuery.close();
                        return true;
                    }
                }
            } catch (Throwable th) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return false;
    }

    public static boolean j(agnw agnwVar) {
        return i(agnwVar.j());
    }

    public static String[] k() {
        return new String[]{"name"};
    }

    static void l(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL("DROP VIEW IF EXISTS " + str);
        } catch (SQLException e2) {
            xyo a2 = k.a();
            a2.H("unable to drop view.");
            a2.z("viewName", str);
            a2.r(e2);
        }
    }

    public static void m(Cursor cursor) {
        if (cursor != null) {
            cursor.getCount();
        }
    }

    private static String n(String str, String str2, String str3, String str4) {
        return "CREATE TRIGGER " + str2 + " AFTER DELETE ON " + str4 + "  FOR EACH ROW BEGIN INSERT INTO " + str3 + " VALUES (NULL, CAST(((julianday('now') - 2440587.5) * 86400.0 * 1000) AS INT), 3, " + str + "); END";
    }

    private static String o(String str, String str2, String str3, String str4) {
        return "CREATE TRIGGER " + str2 + " AFTER INSERT ON " + str4 + " FOR EACH ROW BEGIN INSERT INTO " + str3 + " VALUES (NULL, CAST(((julianday('now') - 2440587.5) * 86400.0 * 1000) AS INT), 1, " + str + "); END";
    }

    private static String p(String str, String str2, String str3, String str4) {
        return "CREATE TRIGGER " + str2 + " AFTER UPDATE ON " + str4 + "  FOR EACH ROW BEGIN INSERT INTO " + str3 + " VALUES (NULL, CAST(((julianday('now') - 2440587.5) * 86400.0 * 1000) AS INT), 2, " + str + "); END";
    }

    private static void q(String[] strArr, String[] strArr2) {
        if (strArr.length + 3 == strArr2.length) {
            for (int i2 = 1; i2 < strArr.length; i2++) {
                String c2 = c(strArr[i2]);
                String c3 = c(strArr2[i2 + 3]);
                if (!c3.equals(c2)) {
                    throw new IllegalStateException(a.cg(c3, c2, "The original and audit tables must be kept in the same order and with the same names. Different column names: ", " != "));
                }
            }
            return;
        }
        throw new IllegalStateException("Ensure that the audit table has the same columns as the original table columns in the same order (plus some metadata in the first 3 columns).");
    }

    public final void d(agnw agnwVar) {
        Collection.EL.forEach((ArrayList) Collection.EL.stream(this.q.entrySet()).filter(new ncc(agnwVar, 20)).map(new qxo(4)).sorted(new lvh(8)).collect(Collectors.toCollection(new qxs(1))), new qdm(agnwVar, 9));
        uci uciVar = (uci) agnwVar;
        if (uciVar.f.b.equals("$primary")) {
            ArrayList arrayList = new ArrayList();
            if (uciVar.f.b.equals("$primary")) {
                String[] strArr = srm.a;
                Collections.addAll(arrayList, "CREATE INDEX index_generic_worker_queue_inflight_retries ON generic_worker_queue(in_flight,retry_count)", "CREATE INDEX index_generic_worker_queue_worker_table_itemId ON generic_worker_queue(worker_type,item_table_type,item_id)");
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                agnwVar.z((String) it.next());
            }
            g(agnwVar);
            String[] strArr2 = e;
            int length = strArr2.length;
            for (int i2 = 0; i2 < 16; i2++) {
                agnwVar.z(strArr2[i2]);
            }
            h(agnwVar);
            qyd qydVar = this.s;
            tap c2 = ParticipantsTable.c();
            c2.S(-1);
            String M = qydVar.c(c2, Optional.empty()).M();
            tki a2 = tkr.a();
            a2.h(-1);
            a2.d(String.valueOf(M));
            String k2 = a2.c().k();
            xyo c3 = k.c();
            c3.H("insertSelfParticipant.");
            c3.z("participantId", M);
            c3.z("selfParticipantId", k2);
            c3.x("subId", -1);
            c3.q();
            ((yep) this.o.b()).h();
            ((mbl) this.p.b()).c("Bugle.DataModel.DatabaseHelperUtils.RefreshGmsCore");
        }
        Iterator it2 = ((Set) this.r.b()).iterator();
        while (it2.hasNext()) {
            ((rzf) it2.next()).a(agnwVar);
        }
    }
}
