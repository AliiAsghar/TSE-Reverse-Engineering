package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class szm implements apxw {
    public static agns a() {
        return new agnf(szl.b, "p2p_conversation_suggestion_event", new sth(20));
    }

    public static agmh[] c() {
        return (agmh[]) szl.d.l;
    }

    public static agns d() {
        return new agnf(szl.c, true, "p2p_conversation_suggestion_event", new szq(1));
    }

    public static agmh[] e() {
        return (agmh[]) szu.c.a;
    }

    public static agns f() {
        return new agnf(szu.b, "p2p_suggestions", new szq(0));
    }

    public static agmh[] g() {
        return (agmh[]) tac.d.b;
    }

    public static agns h() {
        return new agnf(tac.c, "parent_disallowed_conversations", new szq(2));
    }

    public static agmh[] i() {
        return tan.c.W;
    }

    public static agns j() {
        return new agnf(tan.d, "participants_audit_log", new szq(3));
    }

    public static agns k() {
        return new agnf(tan.e, true, "participants_audit_log", new szq(4));
    }

    public static agmh[] l() {
        return ubh.e();
    }

    public static agns m() {
        return new agnf(ParticipantsTable.d, "participants", new agne() { // from class: tax
            @Override // defpackage.agne
            public final void a(int i, agnw agnwVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = ParticipantsTable.a;
                valueOf.getClass();
                switch (i) {
                    case 1000:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN color_type INT DEFAULT(0);");
                        return;
                    case 2000:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN sim_slot_id INT DEFAULT(-1);");
                        agnwVar.z("ALTER TABLE participants ADD COLUMN subscription_name TEXT;");
                        agnwVar.z("ALTER TABLE participants ADD COLUMN subscription_color INT DEFAULT(0);");
                        return;
                    case 4000:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN contact_destination TEXT;");
                        return;
                    case 10027:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN extended_color INT DEFAULT(0);");
                        return;
                    case 12001:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN participant_type INT DEFAULT(0);");
                        return;
                    case 13050:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN video_reachability INT DEFAULT(0);");
                        return;
                    case 20060:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN alias TEXT;");
                        return;
                    case 24060:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN is_spam INT DEFAULT(0);");
                        return;
                    case 29030:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN is_rcs_available INT DEFAULT(0);");
                        return;
                    case 30000:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN is_spam_source INT DEFAULT(0);");
                        return;
                    case 31020:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN cms_id TEXT;");
                        agnwVar.z("CREATE UNIQUE INDEX index_participants_cms_id ON participants(cms_id);");
                        return;
                    case 31030:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN latest_verification_status INT DEFAULT(0);");
                        return;
                    case 33000:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN profile_photo_blob_id TEXT;");
                        return;
                    case 33060:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN profile_photo_encryption_key BLOB;");
                        return;
                    case 35010:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN directory_id INT DEFAULT(-1);");
                        return;
                    case 54040:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN comparable_destination TEXT;");
                        agnwVar.z("ALTER TABLE participants ADD COLUMN country_code TEXT;");
                        return;
                    case 55010:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN is_check_constraint_enabled_via_phenotype INT;");
                        agnwVar.z("ALTER TABLE participants ADD COLUMN is_valid_phone_number_data INT DEFAULT(1);");
                        return;
                    case 58090:
                        agnwVar.z("DROP INDEX IF EXISTS index_participants_comparable_destination");
                        agnwVar.z("CREATE UNIQUE INDEX index_participants_comparable_destination ON participants(comparable_destination);");
                        agnwVar.z("ALTER TABLE participants ADD COLUMN recipient_id INTEGER;");
                        agnwVar.z("CREATE UNIQUE INDEX index_participants_recipient_id ON participants(recipient_id);");
                        agnwVar.z("ALTER TABLE participants ADD COLUMN recipient_canonical_address TEXT;");
                        agnwVar.z("ALTER TABLE participants ADD COLUMN duplicate_of INTEGER REFERENCES participants(_id)  ;");
                        return;
                    case 58190:
                        agnwVar.z("DROP INDEX IF EXISTS index_participants_latest_verification_status_is_not_zero");
                        agnwVar.z("CREATE INDEX index_participants_latest_verification_status_is_not_zero ON participants(latest_verification_status) WHERE latest_verification_status <> 0;");
                        return;
                    case 58200:
                        agnwVar.z("DROP INDEX IF EXISTS index_participants_blocked_is_one");
                        agnwVar.z("CREATE INDEX index_participants_blocked_is_one ON participants(blocked) WHERE blocked = 1;");
                        return;
                    case 58210:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN cms_life_cycle INT DEFAULT(0);");
                        return;
                    case 58620:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN norm_ui_status INT DEFAULT(1);");
                        return;
                    case 59160:
                        agnwVar.z("DROP INDEX IF EXISTS index_participants_duplicate_of");
                        agnwVar.z("CREATE INDEX index_participants_duplicate_of ON participants(duplicate_of) WHERE duplicate_of NOT NULL;");
                        return;
                    case 59300:
                        agnwVar.z("DROP INDEX IF EXISTS index_participants_sub_id");
                        agnwVar.z("CREATE INDEX index_participants_sub_id ON participants(sub_id);");
                        return;
                    case 59440:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN last_modified_by_key TEXT;");
                        return;
                    case 59550:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN name_source INT DEFAULT(1);");
                        agnwVar.z("ALTER TABLE participants ADD COLUMN photo_source INT DEFAULT(1);");
                        return;
                    case 59850:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN contact_photo_uri TEXT;");
                        return;
                    case 59930:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN my_identity_token TEXT;");
                        agnwVar.z("CREATE INDEX index_participants_my_identity_token ON participants(my_identity_token);");
                        return;
                    case 60060:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN profile_photo_user_preference INT DEFAULT(1);");
                        return;
                    case 60070:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN contact_metadata BLOB;");
                        return;
                    case 60160:
                        agnwVar.z("ALTER TABLE participants ADD COLUMN my_identity_token_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                        agnwVar.z("CREATE INDEX index_participants_my_identity_token_foreign_key ON participants(my_identity_token_foreign_key);");
                        return;
                    default:
                        return;
                }
            }
        });
    }

    public static agns n() {
        return new agnf(ParticipantsTable.e, true, "participants", new szq(5));
    }

    public static agmh[] o() {
        return ucm.d();
    }

    public static agns p() {
        return new agnf(PartsTable.e, "parts", new agne() { // from class: tbp
            @Override // defpackage.agne
            public final void a(int i, agnw agnwVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = PartsTable.a;
                valueOf.getClass();
                switch (i) {
                    case 3010:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN timestamp INT;");
                        return;
                    case 4020:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN output_uri TEXT;");
                        agnwVar.z("ALTER TABLE parts ADD COLUMN target_size INT DEFAULT(0);");
                        agnwVar.z("ALTER TABLE parts ADD COLUMN processing_status INT DEFAULT(0);");
                        return;
                    case 5020:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN sticker_set_id INT DEFAULT(-1);");
                        agnwVar.z("ALTER TABLE parts ADD COLUMN sticker_id INT DEFAULT(-1);");
                        return;
                    case 7000:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN media_modified_timestamp INT DEFAULT(-1);");
                        return;
                    case 10005:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN longitude REAL DEFAULT(0);");
                        agnwVar.z("ALTER TABLE parts ADD COLUMN latitude REAL DEFAULT(0);");
                        return;
                    case 10017:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN preview_content_uri TEXT;");
                        agnwVar.z("ALTER TABLE parts ADD COLUMN preview_content_type TEXT;");
                        return;
                    case 10021:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN original_uri TEXT;");
                        return;
                    case 13000:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN fallback_uri TEXT;");
                        return;
                    case 14010:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN source INT DEFAULT(13);");
                        return;
                    case 17010:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN bundle_index INT DEFAULT(0);");
                        return;
                    case 17020:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN blob_id TEXT;");
                        return;
                    case 18000:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN blob_upload_permanent_failure INT DEFAULT(0);");
                        return;
                    case 19030:
                        PartsTable.e(agnwVar);
                        return;
                    case 22060:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN expressive_sticker_name TEXT;");
                        return;
                    case 26000:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN file_name TEXT;");
                        return;
                    case 26040:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN duration INT;");
                        return;
                    case 27000:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN compressed_blob_id TEXT;");
                        agnwVar.z("ALTER TABLE parts ADD COLUMN compressed_blob_upload_permanent_failure INT DEFAULT(0);");
                        agnwVar.z("ALTER TABLE parts ADD COLUMN compressed_blob_upload_timestamp INT DEFAULT(0);");
                        return;
                    case 29060:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN storage_uri TEXT;");
                        return;
                    case 30040:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN media_encryption_key BLOB;");
                        agnwVar.z("ALTER TABLE parts ADD COLUMN compressed_media_encryption_key BLOB;");
                        return;
                    case 40040:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN cms_full_size_blob_id TEXT;");
                        agnwVar.z("ALTER TABLE parts ADD COLUMN cms_compressed_blob_id TEXT;");
                        return;
                    case 42010:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN cms_media_encryption_key BLOB;");
                        return;
                    case 42070:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN cms_compressed_media_encryption_key BLOB;");
                        return;
                    case 44010:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN cms_attachment_processing_status INT DEFAULT(0);");
                        return;
                    case 49010:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN attachment_upload_response BLOB;");
                        return;
                    case 52030:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN missing_entry_in_telephony INT;");
                        return;
                    case 52050:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN file_size_bytes INT;");
                        agnwVar.z("ALTER TABLE parts ADD COLUMN local_cache_path TEXT;");
                        return;
                    case 53040:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN awaiting_reverse_sync INT DEFAULT(0);");
                        return;
                    case 58150:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN media_send_type INT DEFAULT(0);");
                        return;
                    case 58380:
                        agnwVar.z("DROP INDEX IF EXISTS index_parts_content_type");
                        agnwVar.z("CREATE INDEX index_parts_content_type ON parts(content_type);");
                        agnwVar.z("DROP INDEX IF EXISTS index_parts_output_uri");
                        agnwVar.z("CREATE INDEX index_parts_output_uri ON parts(output_uri) WHERE output_uri NOT NULL;");
                        agnwVar.z("DROP INDEX IF EXISTS index_parts_conversation_id");
                        agnwVar.z("CREATE INDEX index_parts_conversation_id ON parts(conversation_id);");
                        agnwVar.z("DROP INDEX IF EXISTS index_parts_preview_content_type");
                        agnwVar.z("CREATE INDEX index_parts_preview_content_type ON parts(preview_content_type) WHERE preview_content_type NOT NULL;");
                        agnwVar.z("DROP INDEX IF EXISTS index_parts_file_size_bytes");
                        agnwVar.z("CREATE INDEX index_parts_file_size_bytes ON parts(file_size_bytes) WHERE file_size_bytes <> 0;");
                        agnwVar.z("DROP INDEX IF EXISTS index_parts_local_cache_path");
                        agnwVar.z("CREATE INDEX index_parts_local_cache_path ON parts(local_cache_path) WHERE local_cache_path NOT NULL;");
                        return;
                    case 58770:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN validation_status INT DEFAULT(0);");
                        return;
                    case 59470:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN voice_metadata BLOB;");
                        return;
                    case 59570:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN blob_gaia_email TEXT;");
                        return;
                    case 60080:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN processing_id TEXT;");
                        return;
                    case 60230:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN rich_card_media_download_failure_reason INT DEFAULT(0);");
                        return;
                    case 60240:
                        agnwVar.z("ALTER TABLE parts ADD COLUMN image_display_state INT DEFAULT(0);");
                        return;
                    default:
                        return;
                }
            }
        });
    }

    public static agmh[] q() {
        return (agmh[]) tcf.c.s;
    }

    public static agns r() {
        return new agnf(tcf.d, "pending_incoming_message_rcs_table", new szq(6));
    }

    public static agmh[] s() {
        return (agmh[]) tcq.c.b;
    }

    public static agns t() {
        return new agnf(tcq.b, "phone_number_min_match_guesser", new szq(7));
    }

    public static agmh[] u() {
        return (agmh[]) tcz.d.e;
    }

    public static agns v() {
        return new agnf(tcz.c, "pii_hash", new szq(8));
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        throw null;
    }
}
