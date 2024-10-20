package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rmd implements agne {
    private final /* synthetic */ int a;

    @Override // defpackage.agne
    public final void a(int i, agnw agnwVar) {
        switch (this.a) {
            case 0:
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = rmh.a;
                valueOf.getClass();
                if (i != 40) {
                    return;
                }
                rmh.c(agnwVar);
                return;
            case 1:
                Integer valueOf2 = Integer.valueOf(i);
                String[] strArr2 = rmh.a;
                valueOf2.getClass();
                if (i != 90) {
                    return;
                }
                agnc.F(agnwVar, "message_reactions_backup", rmh.a("TEMP___message_reactions_backup"), rmh.a, rmh.b());
                return;
            case 2:
                Integer valueOf3 = Integer.valueOf(i);
                String[] strArr3 = rmq.a;
                valueOf3.getClass();
                if (i != 60) {
                    return;
                }
                rmq.c(agnwVar);
                return;
            case 3:
                Integer valueOf4 = Integer.valueOf(i);
                String[] strArr4 = rmq.a;
                valueOf4.getClass();
                if (i != 90) {
                    return;
                }
                agnc.F(agnwVar, "message_replies_backup", rmq.a("TEMP___message_replies_backup"), rmq.a, rmq.b());
                return;
            case 4:
                Integer valueOf5 = Integer.valueOf(i);
                String[] strArr5 = rmz.a;
                valueOf5.getClass();
                if (i != 20) {
                    return;
                }
                rmz.c(agnwVar);
                return;
            case 5:
                Integer valueOf6 = Integer.valueOf(i);
                String[] strArr6 = rmz.a;
                valueOf6.getClass();
                if (i != 90) {
                    return;
                }
                agnc.F(agnwVar, "message_star_backup", rmz.a("TEMP___message_star_backup"), rmz.a, rmz.b());
                return;
            case 6:
                Integer valueOf7 = Integer.valueOf(i);
                String[] strArr7 = rnm.a;
                valueOf7.getClass();
                if (i != 0) {
                    if (i != 50) {
                        if (i != 80) {
                            if (i != 110) {
                                if (i != 120) {
                                    return;
                                }
                                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN message_persistence_id TEXT;");
                                agnwVar.z("CREATE UNIQUE INDEX index_messages_backup_message_persistence_id ON messages_backup(message_persistence_id) WHERE message_persistence_id NOT NULL;");
                                return;
                            }
                            agnwVar.z("ALTER TABLE messages_backup ADD COLUMN my_identity TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                            agnwVar.z("CREATE INDEX index_messages_backup_my_identity ON messages_backup(my_identity);");
                            return;
                        }
                        agnwVar.z("ALTER TABLE messages_backup ADD COLUMN sender_send_destination TEXT;");
                        agnwVar.z("ALTER TABLE messages_backup ADD COLUMN msisdn_receiving_rcs_message TEXT;");
                        return;
                    }
                    agnwVar.z("ALTER TABLE messages_backup ADD COLUMN custom_headers BLOB;");
                    agnwVar.z("CREATE INDEX index_messages_backup_custom_headers ON messages_backup(custom_headers);");
                    return;
                }
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN message_status INT;");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN seen INT;");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN read INT;");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN conversation_id INT REFERENCES conversations_backup(_id) ON DELETE CASCADE ;");
                agnwVar.z("CREATE INDEX index_messages_backup_conversation_id ON messages_backup(conversation_id);");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN sender_participant_id INT REFERENCES participants_backup(_id) ON DELETE CASCADE ;");
                agnwVar.z("CREATE INDEX index_messages_backup_sender_participant_id ON messages_backup(sender_participant_id);");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN self_participant_id INT REFERENCES participants_backup(_id) ON DELETE CASCADE ;");
                agnwVar.z("CREATE INDEX index_messages_backup_self_participant_id ON messages_backup(self_participant_id);");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN mms_subject TEXT;");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN received_timestamp INT;");
                agnwVar.z("CREATE INDEX index_messages_backup_received_timestamp ON messages_backup(received_timestamp);");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN sent_timestamp INT;");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN protocol INT;");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN message_priority INT;");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN rcs_encryption_status INT;");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN cloud_sync_id TEXT;");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN correlation_id TEXT;");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN sms_error_code INT DEFAULT(-1);");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN sms_error_desc_map_name TEXT;");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN is_hidden INT;");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN rcs_message_id TEXT;");
                agnwVar.z("CREATE INDEX index_messages_backup_rcs_message_id ON messages_backup(rcs_message_id);");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN cms_id TEXT;");
                agnwVar.z("CREATE INDEX index_messages_backup_cms_id ON messages_backup(cms_id);");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN cms_life_cycle INT;");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN cms_correlation_id TEXT;");
                agnwVar.z("CREATE INDEX index_messages_backup_cms_correlation_id ON messages_backup(cms_correlation_id);");
                agnwVar.z("ALTER TABLE messages_backup ADD COLUMN cms_last_mod_seq INTEGER;");
                return;
            case 7:
                Integer valueOf8 = Integer.valueOf(i);
                String[] strArr8 = rnm.a;
                valueOf8.getClass();
                if (i != 90) {
                    if (i != 110) {
                        return;
                    }
                    rnm.d(agnwVar, 110);
                    return;
                }
                rnm.d(agnwVar, 90);
                return;
            case 8:
                Integer valueOf9 = Integer.valueOf(i);
                String[] strArr9 = rnx.a;
                valueOf9.getClass();
                if (i != 0) {
                    if (i != 10) {
                        if (i != 100) {
                            return;
                        }
                        agnwVar.z("ALTER TABLE parts_backup ADD COLUMN file_name TEXT;");
                        return;
                    }
                    agnwVar.z("ALTER TABLE parts_backup ADD COLUMN source INT DEFAULT(13);");
                    return;
                }
                agnwVar.z("ALTER TABLE parts_backup ADD COLUMN message_id INT REFERENCES messages_backup(_id) ON DELETE CASCADE ;");
                agnwVar.z("CREATE INDEX index_parts_backup_message_id ON parts_backup(message_id);");
                agnwVar.z("ALTER TABLE parts_backup ADD COLUMN content_type TEXT;");
                agnwVar.z("ALTER TABLE parts_backup ADD COLUMN text TEXT;");
                agnwVar.z("ALTER TABLE parts_backup ADD COLUMN width INT DEFAULT(-1);");
                agnwVar.z("ALTER TABLE parts_backup ADD COLUMN height INT DEFAULT(-1);");
                agnwVar.z("ALTER TABLE parts_backup ADD COLUMN longitude REAL;");
                agnwVar.z("ALTER TABLE parts_backup ADD COLUMN latitude REAL;");
                agnwVar.z("ALTER TABLE parts_backup ADD COLUMN cms_full_size_blob_id TEXT;");
                agnwVar.z("ALTER TABLE parts_backup ADD COLUMN cms_media_encryption_key BLOB;");
                agnwVar.z("ALTER TABLE parts_backup ADD COLUMN cms_compressed_media_encryption_key BLOB;");
                agnwVar.z("ALTER TABLE parts_backup ADD COLUMN cms_compressed_blob_id TEXT;");
                return;
            case 9:
                Integer valueOf10 = Integer.valueOf(i);
                String[] strArr10 = rnx.a;
                valueOf10.getClass();
                if (i != 90) {
                    return;
                }
                agnc.F(agnwVar, "parts_backup", rnx.c(90, "TEMP___parts_backup"), rnx.a, rnx.d());
                return;
            case 10:
                Integer valueOf11 = Integer.valueOf(i);
                String[] strArr11 = rog.a;
                valueOf11.getClass();
                if (i != 0) {
                    return;
                }
                agnwVar.z("ALTER TABLE backup_metadata ADD COLUMN created_timestamp INT;");
                agnwVar.z("ALTER TABLE backup_metadata ADD COLUMN schema_version INT;");
                agnwVar.z("ALTER TABLE backup_metadata ADD COLUMN backup_id TEXT;");
                return;
            case 11:
                Integer valueOf12 = Integer.valueOf(i);
                String[] strArr12 = roq.a;
                valueOf12.getClass();
                if (i != 110) {
                    return;
                }
                roq.a(agnwVar);
                return;
            case 12:
                Integer valueOf13 = Integer.valueOf(i);
                String[] strArr13 = rpb.a;
                valueOf13.getClass();
                if (i != 110) {
                    return;
                }
                agnc.F(agnwVar, "participants_backup", rpb.c("TEMP___participants_backup"), rpb.a, rpb.d());
                return;
            case 13:
                Integer valueOf14 = Integer.valueOf(i);
                String[] strArr14 = rpb.a;
                valueOf14.getClass();
                if (i != 0) {
                    if (i != 110) {
                        return;
                    }
                    agnwVar.z("ALTER TABLE participants_backup ADD COLUMN my_identity_token_foreign_key TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                    agnwVar.z("CREATE INDEX index_participants_backup_my_identity_token_foreign_key ON participants_backup(my_identity_token_foreign_key);");
                    return;
                }
                agnwVar.z("ALTER TABLE participants_backup ADD COLUMN normalized_destination TEXT;");
                agnwVar.z("CREATE INDEX index_participants_backup_normalized_destination ON participants_backup(normalized_destination);");
                agnwVar.z("ALTER TABLE participants_backup ADD COLUMN send_destination TEXT;");
                agnwVar.z("ALTER TABLE participants_backup ADD COLUMN display_destination TEXT;");
                agnwVar.z("ALTER TABLE participants_backup ADD COLUMN first_name TEXT;");
                agnwVar.z("ALTER TABLE participants_backup ADD COLUMN full_name TEXT;");
                agnwVar.z("ALTER TABLE participants_backup ADD COLUMN is_self INT;");
                agnwVar.z("ALTER TABLE participants_backup ADD COLUMN blocked INT;");
                agnwVar.z("ALTER TABLE participants_backup ADD COLUMN participant_type INT;");
                agnwVar.z("ALTER TABLE participants_backup ADD COLUMN is_spam INT;");
                agnwVar.z("ALTER TABLE participants_backup ADD COLUMN is_spam_source INT;");
                agnwVar.z("ALTER TABLE participants_backup ADD COLUMN country_code TEXT;");
                agnwVar.z("ALTER TABLE participants_backup ADD COLUMN color_palette_index INT DEFAULT(-1);");
                agnwVar.z("ALTER TABLE participants_backup ADD COLUMN color_type INT DEFAULT(0);");
                agnwVar.z("ALTER TABLE participants_backup ADD COLUMN extended_color INT DEFAULT(0);");
                agnwVar.z("ALTER TABLE participants_backup ADD COLUMN cms_id TEXT;");
                agnwVar.z("CREATE INDEX index_participants_backup_cms_id ON participants_backup(cms_id);");
                agnwVar.z("ALTER TABLE participants_backup ADD COLUMN cms_life_cycle INT;");
                return;
            case 14:
                Integer valueOf15 = Integer.valueOf(i);
                String[] strArr15 = sfe.a;
                valueOf15.getClass();
                if (i != 60410) {
                    return;
                }
                sfe.a(agnwVar);
                return;
            case 15:
                Integer valueOf16 = Integer.valueOf(i);
                String[] strArr16 = sfp.a;
                valueOf16.getClass();
                if (i != 26020) {
                    return;
                }
                sfp.b(agnwVar);
                return;
            case 16:
                Integer valueOf17 = Integer.valueOf(i);
                String[] strArr17 = sfp.a;
                valueOf17.getClass();
                if (i != 58160) {
                    return;
                }
                agnc.F(agnwVar, "add_contact_banner", sfp.a("TEMP___add_contact_banner"), sfp.a, d.at());
                return;
            case 17:
                Integer valueOf18 = Integer.valueOf(i);
                String[] strArr18 = sfz.a;
                valueOf18.getClass();
                if (i != 60020) {
                    if (i != 60040) {
                        return;
                    }
                    agnwVar.z("DROP INDEX IF EXISTS index_backup_id_map_bugle_id");
                    agnwVar.z("CREATE INDEX index_backup_id_map_bugle_id ON backup_id_map(bugle_id);");
                    return;
                }
                sfz.a(agnwVar, 60020);
                return;
            case 18:
                Integer valueOf19 = Integer.valueOf(i);
                String[] strArr19 = sgh.a;
                valueOf19.getClass();
                if (i != 58070) {
                    if (i != 59010) {
                        if (i != 59050) {
                            return;
                        }
                        agnwVar.z("ALTER TABLE business_conversations_metadata ADD COLUMN conversation_toolstone_state INTEGER;");
                        agnwVar.z("ALTER TABLE business_conversations_metadata ADD COLUMN conversation_toolstone_timestamp_ms INTEGER;");
                        return;
                    }
                    agnwVar.z("ALTER TABLE business_conversations_metadata ADD COLUMN conversation_stop_state INTEGER;");
                    return;
                }
                sgh.b(agnwVar, 58070);
                return;
            case 19:
                Integer valueOf20 = Integer.valueOf(i);
                String[] strArr20 = sgo.a;
                valueOf20.getClass();
                if (i != 59580) {
                    if (i != 59620) {
                        return;
                    }
                    agnwVar.z("DROP INDEX IF EXISTS index_cms_backup_dependency_cache_table_dependent_id");
                    agnwVar.z("CREATE INDEX index_cms_backup_dependency_cache_table_dependent_id ON cms_backup_dependency_cache_table(dependent_id);");
                    agnwVar.z("DROP INDEX IF EXISTS index_cms_backup_dependency_cache_table_inserted_at_timestamp");
                    agnwVar.z("CREATE INDEX index_cms_backup_dependency_cache_table_inserted_at_timestamp ON cms_backup_dependency_cache_table(inserted_at_timestamp);");
                    return;
                }
                sgo.a(agnwVar, 59580);
                return;
            default:
                Integer valueOf21 = Integer.valueOf(i);
                String[] strArr21 = sgv.a;
                valueOf21.getClass();
                if (i != 44030) {
                    return;
                }
                sgv.a(agnwVar);
                return;
        }
    }
}
