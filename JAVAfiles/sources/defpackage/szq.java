package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class szq implements agne {
    private final /* synthetic */ int a;

    @Override // defpackage.agne
    public final void a(int i, agnw agnwVar) {
        switch (this.a) {
            case 0:
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = szu.a;
                valueOf.getClass();
                if (i != 42020) {
                    if (i != 53080) {
                        if (i != 58510) {
                            return;
                        }
                        agnwVar.z("DROP INDEX IF EXISTS index_p2p_suggestions_generated_timestamp");
                        agnwVar.z("CREATE INDEX index_p2p_suggestions_generated_timestamp ON p2p_suggestions(generated_timestamp);");
                        return;
                    }
                    agnwVar.z("ALTER TABLE p2p_suggestions ADD COLUMN consumption_state INTEGER DEFAULT(1);");
                    return;
                }
                szu.b(agnwVar, 42020);
                return;
            case 1:
                Integer valueOf2 = Integer.valueOf(i);
                String[] strArr2 = szl.a;
                valueOf2.getClass();
                if (i != 57010) {
                    return;
                }
                agnc.F(agnwVar, "p2p_conversation_suggestion_event", szl.a(57010, "TEMP___p2p_conversation_suggestion_event"), szl.a, szl.c(57010));
                return;
            case 2:
                Integer valueOf3 = Integer.valueOf(i);
                String[] strArr3 = tac.a;
                valueOf3.getClass();
                if (i != 59780) {
                    return;
                }
                tac.a(agnwVar);
                return;
            case 3:
                Integer valueOf4 = Integer.valueOf(i);
                String[] strArr4 = tan.a;
                valueOf4.getClass();
                switch (i) {
                    case 59440:
                        agnwVar.z("ALTER TABLE participants_audit_log ADD COLUMN last_modified_by_key TEXT;");
                        return;
                    case 59550:
                        agnwVar.z("ALTER TABLE participants_audit_log ADD COLUMN name_source INT;");
                        agnwVar.z("ALTER TABLE participants_audit_log ADD COLUMN photo_source INT;");
                        return;
                    case 59850:
                        agnwVar.z("ALTER TABLE participants_audit_log ADD COLUMN contact_photo_uri TEXT;");
                        return;
                    case 59930:
                        agnwVar.z("ALTER TABLE participants_audit_log ADD COLUMN my_identity_token TEXT;");
                        return;
                    case 60060:
                        agnwVar.z("ALTER TABLE participants_audit_log ADD COLUMN profile_photo_user_preference INT;");
                        return;
                    case 60070:
                        agnwVar.z("ALTER TABLE participants_audit_log ADD COLUMN contact_metadata BLOB;");
                        return;
                    case 60160:
                        agnwVar.z("ALTER TABLE participants_audit_log ADD COLUMN my_identity_token_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                        agnwVar.z("CREATE INDEX index_participants_audit_log_my_identity_token_foreign_key ON participants_audit_log(my_identity_token_foreign_key);");
                        return;
                    default:
                        return;
                }
            case 4:
                Integer valueOf5 = Integer.valueOf(i);
                String[] strArr5 = tan.a;
                valueOf5.getClass();
                if (i != 59380) {
                    return;
                }
                agnc.F(agnwVar, "participants_audit_log", tan.b(59380, "TEMP___participants_audit_log"), tan.a, tan.c(59380));
                return;
            case 5:
                Integer valueOf6 = Integer.valueOf(i);
                String[] strArr6 = ParticipantsTable.a;
                valueOf6.getClass();
                if (i != 57070) {
                    return;
                }
                ParticipantsTable.j(agnwVar, 57070);
                return;
            case 6:
                Integer valueOf7 = Integer.valueOf(i);
                String[] strArr7 = tcf.a;
                valueOf7.getClass();
                switch (i) {
                    case 39050:
                        tcf.c(agnwVar, 39050);
                        return;
                    case 44020:
                        agnwVar.z("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN custom_headers BLOB;");
                        return;
                    case 58820:
                        agnwVar.z("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN is_group INTEGER;");
                        agnwVar.z("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN conversation_id TEXT;");
                        agnwVar.z("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN conference_uri TEXT;");
                        return;
                    case 58870:
                        agnwVar.z("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN is_delivery_report_requested INTEGER DEFAULT(0) NOT NULL;");
                        agnwVar.z("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN is_display_report_requested INTEGER DEFAULT(0) NOT NULL;");
                        return;
                    case 59270:
                        agnwVar.z("DROP INDEX IF EXISTS index_pending_incoming_message_rcs_table_received_timestamp");
                        agnwVar.z("CREATE INDEX IF NOT EXISTS index_pending_incoming_message_rcs_table_received_timestamp ON pending_incoming_message_rcs_table(received_timestamp);");
                        return;
                    case 59410:
                        agnwVar.z("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN self_identity TEXT;");
                        return;
                    default:
                        return;
                }
            case 7:
                Integer valueOf8 = Integer.valueOf(i);
                String[] strArr8 = tcq.a;
                valueOf8.getClass();
                if (i != 58080) {
                    return;
                }
                tcq.a(agnwVar);
                return;
            case 8:
                Integer valueOf9 = Integer.valueOf(i);
                String[] strArr9 = tcz.a;
                valueOf9.getClass();
                if (i != 57080) {
                    return;
                }
                tcz.a(agnwVar);
                return;
            case 9:
                Integer valueOf10 = Integer.valueOf(i);
                String[] strArr10 = ProfilesTable.a;
                valueOf10.getClass();
                switch (i) {
                    case 59710:
                        ProfilesTable.b(agnwVar, 59710);
                        return;
                    case 59730:
                        agnwVar.z("DROP INDEX IF EXISTS index_profiles_table_participant_id");
                        agnwVar.z("CREATE INDEX index_profiles_table_participant_id ON profiles_table(participant_id) WHERE participant_id NOT NULL;");
                        return;
                    case 59940:
                        agnwVar.z("ALTER TABLE profiles_table ADD COLUMN belongs_to_self_gaia INT DEFAULT(0);");
                        agnwVar.z("ALTER TABLE profiles_table ADD COLUMN gaia_update_timestamp INT DEFAULT(0);");
                        return;
                    case 60170:
                        agnwVar.z("ALTER TABLE profiles_table ADD COLUMN person_id TEXT;");
                        agnwVar.z("ALTER TABLE profiles_table ADD COLUMN profile_access_token TEXT;");
                        agnwVar.z("ALTER TABLE profiles_table ADD COLUMN sender_last_updated_time TEXT;");
                        agnwVar.z("ALTER TABLE profiles_table ADD COLUMN has_shared_access_token_with_user INTEGER DEFAULT(0);");
                        return;
                    case 60200:
                        agnwVar.z("ALTER TABLE profiles_table ADD COLUMN sending_self_profile_interaction_state INTEGER DEFAULT(0);");
                        agnwVar.z("ALTER TABLE profiles_table ADD COLUMN sender_last_updated_time_from_rcs TEXT;");
                        return;
                    case 60340:
                        agnwVar.z("ALTER TABLE profiles_table ADD COLUMN self_profile_sharing_metadata BLOB;");
                        return;
                    case 60400:
                        agnwVar.z("ALTER TABLE profiles_table ADD COLUMN is_self_profile_shareable INT DEFAULT(1);");
                        return;
                    default:
                        return;
                }
            case 10:
                Integer valueOf11 = Integer.valueOf(i);
                String[] strArr11 = tdv.a;
                valueOf11.getClass();
                if (i != 51020) {
                    if (i != 58410) {
                        if (i != 59830) {
                            return;
                        }
                        agnwVar.z("DROP INDEX IF EXISTS index_rbm_business_info_properties_rbm_short_codes");
                        agnwVar.z("CREATE INDEX index_rbm_business_info_properties_rbm_short_codes ON rbm_business_info_properties(type, property_value) WHERE type = 10;");
                        return;
                    }
                    agnwVar.z("DROP INDEX IF EXISTS index_rbm_business_info_properties_rbm_bot_id");
                    agnwVar.z("CREATE INDEX index_rbm_business_info_properties_rbm_bot_id ON rbm_business_info_properties(rbm_bot_id);");
                    return;
                }
                agnwVar.z("ALTER TABLE rbm_business_info_properties ADD COLUMN rbm_bot_id TEXT REFERENCES rbm_business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE;");
                tdv.b(agnwVar, 51020);
                return;
            case 11:
                Integer valueOf12 = Integer.valueOf(i);
                String[] strArr12 = teh.a;
                valueOf12.getClass();
                if (i != 49030) {
                    if (i != 59140) {
                        return;
                    }
                    agnwVar.z("ALTER TABLE rbm_business_info ADD COLUMN agent_use_case_category INT DEFAULT(0);");
                    return;
                }
                teh.e(agnwVar, 49030);
                return;
            case 12:
                Integer valueOf13 = Integer.valueOf(i);
                String[] strArr13 = teq.a;
                valueOf13.getClass();
                if (i != 49050) {
                    return;
                }
                teq.b(agnwVar);
                return;
            case 13:
                Integer valueOf14 = Integer.valueOf(i);
                String[] strArr14 = tfa.a;
                valueOf14.getClass();
                if (i != 10008) {
                    if (i != 58880) {
                        return;
                    }
                    agnwVar.z("ALTER TABLE read_reports ADD COLUMN ftd_time INTEGER DEFAULT(-1);");
                    return;
                }
                tfa.c(agnwVar, 10008);
                return;
            case 14:
                Integer valueOf15 = Integer.valueOf(i);
                String[] strArr15 = tfg.a;
                valueOf15.getClass();
                if (i != 40020) {
                    return;
                }
                tfg.a(agnwVar);
                return;
            case 15:
                Integer valueOf16 = Integer.valueOf(i);
                String[] strArr16 = tfp.a;
                valueOf16.getClass();
                if (i != 22050) {
                    if (i != 58440) {
                        return;
                    }
                    agnwVar.z("DROP INDEX IF EXISTS index_recent_expressive_stickers_last_used_timestamp");
                    agnwVar.z("CREATE INDEX index_recent_expressive_stickers_last_used_timestamp ON recent_expressive_stickers(last_used_timestamp);");
                    return;
                }
                tfp.a(agnwVar, 22050);
                return;
            case 16:
                Integer valueOf17 = Integer.valueOf(i);
                String[] strArr17 = tgb.a;
                valueOf17.getClass();
                if (i != 22010) {
                    if (i != 58520) {
                        return;
                    }
                    agnwVar.z("DROP INDEX IF EXISTS index_recent_gifs_last_used_timestamp");
                    agnwVar.z("CREATE INDEX index_recent_gifs_last_used_timestamp ON recent_gifs(last_used_timestamp);");
                    return;
                }
                tgb.a(agnwVar, 22010);
                return;
            case 17:
                Integer valueOf18 = Integer.valueOf(i);
                String[] strArr18 = tgi.a;
                valueOf18.getClass();
                if (i == 4010) {
                    StringBuilder sb = new StringBuilder();
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append("sticker_id TEXT");
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append("last_used_timestamp INT DEFAULT(0)");
                    sb.insert(0, "CREATE TABLE recent_stickers (");
                    sb.append(", UNIQUE(sticker_id) ON CONFLICT FAIL);");
                    agnwVar.z(sb.toString());
                    for (String str : d.at()) {
                        agnwVar.z(str);
                    }
                    return;
                }
                return;
            case 18:
                Integer valueOf19 = Integer.valueOf(i);
                String[] strArr19 = tgr.a;
                valueOf19.getClass();
                if (i != 33070) {
                    if (i != 35070) {
                        if (i != 58470) {
                            return;
                        }
                        agnwVar.z("DROP INDEX IF EXISTS index_reminders_conversation_id");
                        agnwVar.z("CREATE INDEX index_reminders_conversation_id ON reminders(conversation_id);");
                        agnwVar.z("DROP INDEX IF EXISTS index_reminders_trigger_time");
                        agnwVar.z("CREATE INDEX index_reminders_trigger_time ON reminders(trigger_time);");
                        return;
                    }
                    agnwVar.z("ALTER TABLE reminders ADD COLUMN conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ;");
                    return;
                }
                tgr.b(agnwVar, 33070);
                return;
            case 19:
                Integer valueOf20 = Integer.valueOf(i);
                String[] strArr20 = thb.a;
                valueOf20.getClass();
                switch (i) {
                    case 34010:
                        thb.b(agnwVar, 34010);
                        return;
                    case 35040:
                        agnwVar.z("ALTER TABLE remote_instances ADD COLUMN last_modified_timestamp INTEGER DEFAULT(0);");
                        return;
                    case 38010:
                        agnwVar.z("ALTER TABLE remote_instances ADD COLUMN identity_key BLOB;");
                        return;
                    case 39040:
                        agnwVar.z("ALTER TABLE remote_instances ADD COLUMN updated_at_hash INTEGER DEFAULT(0);");
                        return;
                    case 40010:
                        agnwVar.z("ALTER TABLE remote_instances ADD COLUMN guaranteed_fresh_as_of_timestamp INTEGER DEFAULT(0);");
                        return;
                    case 40030:
                        agnwVar.z("ALTER TABLE remote_instances ADD COLUMN is_updated_at_hash_valid INTEGER DEFAULT(0);");
                        return;
                    default:
                        return;
                }
            default:
                Integer valueOf21 = Integer.valueOf(i);
                String[] strArr21 = thk.a;
                valueOf21.getClass();
                if (i != 45000) {
                    if (i != 46000) {
                        if (i != 58800) {
                            return;
                        }
                        agnwVar.z("ALTER TABLE remote_registrations_table ADD COLUMN messages_feature_hash INTEGER DEFAULT(0);");
                        return;
                    }
                    agnwVar.z("ALTER TABLE remote_registrations_table ADD COLUMN better_etouffee INT DEFAULT(0);");
                    return;
                }
                thk.c(agnwVar, 45000);
                return;
        }
    }
}
