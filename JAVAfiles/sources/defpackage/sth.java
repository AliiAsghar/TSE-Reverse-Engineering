package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class sth implements agne {
    private final /* synthetic */ int a;

    @Override // defpackage.agne
    public final void a(int i, agnw agnwVar) {
        switch (this.a) {
            case 0:
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = stl.a;
                valueOf.getClass();
                if (i != 20030) {
                    if (i != 20040) {
                        if (i != 20070) {
                            if (i != 58530) {
                                return;
                            }
                            agnwVar.z("DROP INDEX IF EXISTS index_messages_annotations_annotation_type");
                            agnwVar.z("CREATE INDEX index_messages_annotations_annotation_type ON messages_annotations(annotation_type);");
                            return;
                        }
                        agnwVar.z("DROP INDEX IF EXISTS index_messages_annotations_conversation_id");
                        agnwVar.z("CREATE INDEX index_messages_annotations_conversation_id ON messages_annotations(conversation_id);");
                        return;
                    }
                    agnwVar.z("ALTER TABLE messages_annotations ADD COLUMN message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE;");
                    agnwVar.z("CREATE INDEX index_messages_annotations_message_id ON messages_annotations(message_id);");
                    return;
                }
                stl.c(agnwVar, 20030);
                return;
            case 1:
                Integer valueOf2 = Integer.valueOf(i);
                String[] strArr2 = stb.a;
                valueOf2.getClass();
                if (i != 35080) {
                    return;
                }
                stb.a(agnwVar);
                return;
            case 2:
                Integer valueOf3 = Integer.valueOf(i);
                String[] strArr3 = stl.a;
                valueOf3.getClass();
                if (i != 57020) {
                    return;
                }
                agnc.F(agnwVar, "messages_annotations", stl.b(57020, "TEMP___messages_annotations"), stl.a, stl.d(57020));
                return;
            case 3:
                Integer valueOf4 = Integer.valueOf(i);
                String[] strArr4 = stt.a;
                valueOf4.getClass();
                if (i != 59880) {
                    return;
                }
                stt.a(agnwVar);
                return;
            case 4:
                Integer valueOf5 = Integer.valueOf(i);
                String[] strArr5 = sub.a;
                valueOf5.getClass();
                if (i != 58400) {
                    if (i != 58480) {
                        if (i != 59350) {
                            return;
                        }
                        agnwVar.z("DROP INDEX IF EXISTS index_message_classifications_table_classification_type");
                        agnwVar.z("CREATE INDEX index_message_classifications_table_classification_type ON message_classifications_table(classification_type);");
                        return;
                    }
                    agnwVar.z("ALTER TABLE message_classifications_table ADD COLUMN classification_details BLOB;");
                    return;
                }
                sub.b(agnwVar, 58400);
                return;
            case 5:
                Integer valueOf6 = Integer.valueOf(i);
                String[] strArr6 = sui.a;
                valueOf6.getClass();
                if (i != 59360) {
                    return;
                }
                sui.a(agnwVar);
                return;
            case 6:
                Integer valueOf7 = Integer.valueOf(i);
                String[] strArr7 = sur.a;
                valueOf7.getClass();
                if (i != 59860) {
                    return;
                }
                sur.a(agnwVar);
                return;
            case 7:
                Integer valueOf8 = Integer.valueOf(i);
                String[] strArr8 = suz.a;
                valueOf8.getClass();
                switch (i) {
                    case 53050:
                        suz.b(agnwVar, 53050);
                        agnwVar.z("DROP INDEX IF EXISTS unique_idx_message_label");
                        agnwVar.z("CREATE UNIQUE INDEX unique_idx_message_label ON message_labels(message_id, label);");
                        return;
                    case 53060:
                        agnwVar.z("ALTER TABLE message_labels ADD COLUMN confidence INTEGER;");
                        return;
                    case 58550:
                        agnwVar.z("DROP INDEX IF EXISTS index_message_labels_label");
                        agnwVar.z("CREATE INDEX index_message_labels_label ON message_labels(label);");
                        return;
                    case 58590:
                        agnwVar.z("ALTER TABLE message_labels ADD COLUMN intent TEXT DEFAULT('');");
                        return;
                    case 59240:
                        agnwVar.z("DROP INDEX IF EXISTS index_message_labels_intent");
                        agnwVar.z("CREATE INDEX index_message_labels_intent ON message_labels(intent) WHERE intent = 'Otp';");
                        return;
                    default:
                        return;
                }
            case 8:
                Integer valueOf9 = Integer.valueOf(i);
                String[] strArr9 = svi.a;
                valueOf9.getClass();
                if (i != 58320) {
                    if (i != 58610) {
                        return;
                    }
                    agnwVar.z("DROP INDEX IF EXISTS index_message_photos_sharing_message_id");
                    agnwVar.z("CREATE UNIQUE INDEX index_message_photos_sharing_message_id ON message_photos_sharing(message_id);");
                    return;
                }
                svi.a(agnwVar, 58320);
                return;
            case 9:
                Integer valueOf10 = Integer.valueOf(i);
                String[] strArr10 = svq.a;
                valueOf10.getClass();
                switch (i) {
                    case 42000:
                        svq.c(agnwVar, 42000);
                        return;
                    case 46020:
                        agnwVar.z("ALTER TABLE message_reactions ADD COLUMN reacted_message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ;");
                        agnwVar.z("CREATE INDEX index_message_reactions_reacted_message_id ON message_reactions(reacted_message_id);");
                        return;
                    case 48000:
                        agnwVar.z("ALTER TABLE message_reactions ADD COLUMN reaction INTEGER;");
                        return;
                    case 59060:
                        agnwVar.z("ALTER TABLE message_reactions ADD COLUMN applied_reaction BLOB;");
                        return;
                    case 59520:
                        agnwVar.z("ALTER TABLE message_reactions ADD COLUMN animation_effect BLOB;");
                        agnwVar.z("CREATE INDEX index_message_reactions_animation_effect ON message_reactions(animation_effect) WHERE animation_effect NOT NULL;");
                        return;
                    default:
                        return;
                }
            case 10:
                Integer valueOf11 = Integer.valueOf(i);
                String[] strArr11 = svz.a;
                valueOf11.getClass();
                if (i != 58330) {
                    if (i != 58900) {
                        return;
                    }
                    agnwVar.z("DROP INDEX IF EXISTS index_message_replies_replied_to_rcs_message_id");
                    agnwVar.z("CREATE INDEX index_message_replies_replied_to_rcs_message_id ON message_replies(replied_to_rcs_message_id);");
                    agnwVar.z("DROP INDEX IF EXISTS index_replied_to_message_id");
                    agnwVar.z("CREATE INDEX index_replied_to_message_id ON message_replies(replied_to_message_id, replied_to_message_id_null_reason);");
                    return;
                }
                svz.a(agnwVar, 58330);
                return;
            case 11:
                Integer valueOf12 = Integer.valueOf(i);
                String[] strArr12 = swk.a;
                valueOf12.getClass();
                if (i != 59360) {
                    return;
                }
                swk.a(agnwVar);
                agnwVar.z("DROP INDEX IF EXISTS message_id_and_message_sending_attempt_index");
                agnwVar.z("CREATE UNIQUE INDEX message_id_and_message_sending_attempt_index ON message_send_receive_attempt(message_id, message_sending_attempt);");
                return;
            case 12:
                Integer valueOf13 = Integer.valueOf(i);
                String[] strArr13 = sww.a;
                valueOf13.getClass();
                switch (i) {
                    case 30000:
                        sww.c(agnwVar, 30000);
                        return;
                    case 45040:
                        agnwVar.z("ALTER TABLE message_spam ADD COLUMN score REAL DEFAULT(0.0);");
                        return;
                    case 58030:
                        agnwVar.z("ALTER TABLE message_spam ADD COLUMN outcome INT DEFAULT(1);");
                        return;
                    case 58100:
                        agnwVar.z("ALTER TABLE message_spam ADD COLUMN ares_initiated_by TEXT DEFAULT('');");
                        return;
                    case 58350:
                        agnwVar.z("DROP INDEX IF EXISTS index_message_spam_message_id");
                        agnwVar.z("CREATE INDEX index_message_spam_message_id ON message_spam(message_id);");
                        return;
                    case 59190:
                        agnwVar.z("ALTER TABLE message_spam ADD COLUMN classification_timestamp INTEGER DEFAULT(0);");
                        return;
                    case 59200:
                        agnwVar.z("DROP INDEX IF EXISTS index_message_spam_classification_timestamp");
                        agnwVar.z("CREATE INDEX index_message_spam_classification_timestamp ON message_spam(classification_timestamp);");
                        return;
                    case 59460:
                        agnwVar.z("ALTER TABLE message_spam ADD COLUMN conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE;");
                        agnwVar.z("CREATE INDEX index_message_spam_conversation_id ON message_spam(conversation_id);");
                        agnwVar.z("ALTER TABLE message_spam ADD COLUMN trigger INT DEFAULT(0);");
                        agnwVar.z("ALTER TABLE message_spam ADD COLUMN action_type INT DEFAULT(0);");
                        agnwVar.z("ALTER TABLE message_spam ADD COLUMN action_contributors INT DEFAULT(0);");
                        agnwVar.z("ALTER TABLE message_spam ADD COLUMN error_code INT DEFAULT(0);");
                        agnwVar.z("ALTER TABLE message_spam ADD COLUMN reclassification_index INT DEFAULT(0);");
                        return;
                    default:
                        return;
                }
            case 13:
                Integer valueOf14 = Integer.valueOf(i);
                String[] strArr14 = sxc.a;
                valueOf14.getClass();
                if (i != 58180) {
                    return;
                }
                sxc.a(agnwVar);
                return;
            case 14:
                Integer valueOf15 = Integer.valueOf(i);
                String[] strArr15 = sxl.a;
                valueOf15.getClass();
                if (i != 33010) {
                    return;
                }
                sxl.b(agnwVar);
                return;
            case 15:
                Integer valueOf16 = Integer.valueOf(i);
                String[] strArr16 = syj.a;
                valueOf16.getClass();
                return;
            case 16:
                Integer valueOf17 = Integer.valueOf(i);
                String[] strArr17 = syj.a;
                valueOf17.getClass();
                if (i != 59440) {
                    return;
                }
                agnc.F(agnwVar, "modified_by", syj.a("TEMP___modified_by"), syj.a, syj.b());
                return;
            case 17:
                Integer valueOf18 = Integer.valueOf(i);
                String[] strArr18 = syr.a;
                valueOf18.getClass();
                if (i != 54010) {
                    if (i != 58490) {
                        if (i != 58950) {
                            return;
                        }
                        agnwVar.z("DROP INDEX IF EXISTS index_smarts_personalization_decayed_feature_values_feature_id");
                        agnwVar.z("CREATE INDEX index_smarts_personalization_decayed_feature_values_feature_id ON smarts_personalization_decayed_feature_values(feature_id);");
                        return;
                    }
                    agnwVar.z("DROP INDEX IF EXISTS index_smarts_personalization_decayed_feature_values_date");
                    agnwVar.z("CREATE INDEX index_smarts_personalization_decayed_feature_values_date ON smarts_personalization_decayed_feature_values(date);");
                    return;
                }
                syr.a(agnwVar, 54010);
                return;
            case 18:
                Integer valueOf19 = Integer.valueOf(i);
                String[] strArr19 = syx.a;
                valueOf19.getClass();
                if (i != 54000) {
                    if (i != 54060) {
                        return;
                    }
                    agnwVar.z("ALTER TABLE smarts_personalization_features ADD COLUMN feature TEXT;");
                    agnwVar.z("CREATE UNIQUE INDEX index_smarts_personalization_features_feature ON smarts_personalization_features(feature);");
                    return;
                }
                syx.b(agnwVar, 54000);
                return;
            case 19:
                Integer valueOf20 = Integer.valueOf(i);
                String[] strArr20 = szd.a;
                valueOf20.getClass();
                if (i != 54020) {
                    return;
                }
                szd.a(agnwVar);
                return;
            default:
                Integer valueOf21 = Integer.valueOf(i);
                String[] strArr21 = szl.a;
                valueOf21.getClass();
                switch (i) {
                    case 37000:
                        szl.b(agnwVar, 37000);
                        return;
                    case 42030:
                        agnwVar.z("ALTER TABLE p2p_conversation_suggestion_event ADD COLUMN model_output_label TEXT;");
                        return;
                    case 51030:
                        agnwVar.z("ALTER TABLE p2p_conversation_suggestion_event ADD COLUMN message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ;");
                        return;
                    case 58940:
                        agnwVar.z("DROP INDEX IF EXISTS index_p2p_conversation_suggestion_event_message_id");
                        agnwVar.z("CREATE INDEX index_p2p_conversation_suggestion_event_message_id ON p2p_conversation_suggestion_event(message_id);");
                        return;
                    default:
                        return;
                }
        }
    }
}
