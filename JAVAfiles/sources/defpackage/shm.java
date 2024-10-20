package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class shm implements agne {
    private final /* synthetic */ int a;

    @Override // defpackage.agne
    public final void a(int i, agnw agnwVar) {
        switch (this.a) {
            case 0:
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = shr.a;
                valueOf.getClass();
                if (i != 59670) {
                    return;
                }
                shr.a(agnwVar);
                return;
            case 1:
                Integer valueOf2 = Integer.valueOf(i);
                String[] strArr2 = shd.a;
                valueOf2.getClass();
                switch (i) {
                    case 51040:
                        shd.a(agnwVar, 51040);
                        return;
                    case 57090:
                        agnwVar.z("ALTER TABLE cms_dead_letter_queue ADD COLUMN bugle_table_type INTEGER DEFAULT(-1);");
                        agnwVar.z("ALTER TABLE cms_dead_letter_queue ADD COLUMN bugle_id INTEGER DEFAULT('-1');");
                        agnwVar.z("ALTER TABLE cms_dead_letter_queue ADD COLUMN cms_backup_parameters BLOB;");
                        agnwVar.z("ALTER TABLE cms_dead_letter_queue ADD COLUMN backup_flags INTEGER;");
                        agnwVar.z("ALTER TABLE cms_dead_letter_queue ADD COLUMN backup_dependency_table_type INTEGER DEFAULT(-1);");
                        agnwVar.z("ALTER TABLE cms_dead_letter_queue ADD COLUMN backup_dependency_bugle_id INTEGER DEFAULT('-1');");
                        return;
                    case 58050:
                        agnwVar.z("DROP INDEX IF EXISTS index_cms_dead_letter_queue_cms_id");
                        agnwVar.z("CREATE INDEX index_cms_dead_letter_queue_cms_id ON cms_dead_letter_queue(cms_id);");
                        agnwVar.z("DROP INDEX IF EXISTS index_cms_dead_letter_queue_bugle_id");
                        agnwVar.z("CREATE INDEX index_cms_dead_letter_queue_bugle_id ON cms_dead_letter_queue(bugle_id);");
                        return;
                    case 58300:
                        agnwVar.z("DROP INDEX IF EXISTS index_cms_dead_letter_queue_abandoned_action");
                        agnwVar.z("CREATE INDEX index_cms_dead_letter_queue_abandoned_action ON cms_dead_letter_queue(abandoned_action);");
                        return;
                    default:
                        return;
                }
            case 2:
                Integer valueOf3 = Integer.valueOf(i);
                String[] strArr3 = shy.a;
                valueOf3.getClass();
                if (i != 45010) {
                    return;
                }
                shy.a(agnwVar);
                return;
            case 3:
                Integer valueOf4 = Integer.valueOf(i);
                String[] strArr4 = sig.a;
                valueOf4.getClass();
                if (i != 38000) {
                    if (i != 46040) {
                        return;
                    }
                    agnwVar.z("ALTER TABLE cms_notifications ADD COLUMN message_received_timestamp INTEGER DEFAULT(0);");
                    return;
                }
                sig.a(agnwVar, 38000);
                return;
            case 4:
                Integer valueOf5 = Integer.valueOf(i);
                String[] strArr5 = sim.a;
                valueOf5.getClass();
                if (i != 59650) {
                    if (i != 59660) {
                        return;
                    }
                    agnwVar.z("ALTER TABLE cms_restore_dependency_cache_table ADD COLUMN cms_data_provider_type INT DEFAULT(0) NOT NULL;");
                    return;
                }
                sim.a(agnwVar, 59650);
                return;
            case 5:
                Integer valueOf6 = Integer.valueOf(i);
                String[] strArr6 = siu.a;
                valueOf6.getClass();
                if (i != 44000) {
                    return;
                }
                siu.a(agnwVar);
                return;
            case 6:
                Integer valueOf7 = Integer.valueOf(i);
                String[] strArr7 = sjc.a;
                valueOf7.getClass();
                if (i != 32030) {
                    if (i != 35020) {
                        if (i != 42060) {
                            return;
                        }
                        agnwVar.z("ALTER TABLE cms ADD COLUMN cms_correlation_id TEXT;");
                        agnwVar.z("CREATE UNIQUE INDEX index_cms_cms_correlation_id ON cms(cms_correlation_id);");
                        return;
                    }
                    agnwVar.z("ALTER TABLE cms ADD COLUMN cms_id TEXT;");
                    agnwVar.z("CREATE UNIQUE INDEX index_cms_cms_id ON cms(cms_id);");
                    return;
                }
                sjc.a(agnwVar, 32030);
                return;
            case 7:
                Integer valueOf8 = Integer.valueOf(i);
                String[] strArr8 = sjm.a;
                valueOf8.getClass();
                if (i != 59070) {
                    if (i != 59080) {
                        if (i != 59120) {
                            return;
                        }
                        agnc.o(agnwVar, "contacts");
                        sjm.d(agnwVar, 59120);
                        return;
                    }
                    agnc.o(agnwVar, "contacts");
                    sjm.d(agnwVar, 59080);
                    return;
                }
                agnc.o(agnwVar, "contacts");
                sjm.d(agnwVar, 59070);
                return;
            case 8:
                Integer valueOf9 = Integer.valueOf(i);
                String[] strArr9 = sjm.a;
                valueOf9.getClass();
                switch (i) {
                    case 58630:
                        sjm.c(agnwVar, 58630);
                        return;
                    case 59070:
                        agnwVar.z("ALTER TABLE contacts ADD COLUMN sort_key TEXT NOT NULL;");
                        agnwVar.z("ALTER TABLE contacts ADD COLUMN phonebook_label TEXT NOT NULL;");
                        agnwVar.z("ALTER TABLE contacts ADD COLUMN phonebook_bucket INTEGER;");
                        agnwVar.z("DROP INDEX IF EXISTS contacts_sort");
                        agnwVar.z("CREATE INDEX contacts_sort ON contacts(phonebook_bucket, sort_key);");
                        return;
                    case 59080:
                        agnwVar.z("DROP INDEX IF EXISTS index_contacts_phonebook_label");
                        agnwVar.z("CREATE INDEX index_contacts_phonebook_label ON contacts(phonebook_label);");
                        agnwVar.z("ALTER TABLE contacts ADD COLUMN contact_type INTEGER;");
                        return;
                    case 59120:
                        agnwVar.z("ALTER TABLE contacts ADD COLUMN display_destination TEXT NOT NULL;");
                        return;
                    case 60150:
                        agnwVar.z("ALTER TABLE contacts ADD COLUMN type_label TEXT;");
                        return;
                    default:
                        return;
                }
            case 9:
                Integer valueOf10 = Integer.valueOf(i);
                String[] strArr10 = sjv.a;
                valueOf10.getClass();
                switch (i) {
                    case 58670:
                        sjv.b(agnwVar, 58670);
                        return;
                    case 58690:
                        agnwVar.z("ALTER TABLE conversation_classifications_table ADD COLUMN classification_state INTEGER DEFAULT(0) NOT NULL;");
                        return;
                    case 58790:
                        agnwVar.z("DROP INDEX IF EXISTS index_conversation_classifications_table_date");
                        agnwVar.z("CREATE INDEX index_conversation_classifications_table_date ON conversation_classifications_table(date);");
                        return;
                    case 58840:
                        agnwVar.z("ALTER TABLE conversation_classifications_table ADD COLUMN impression_count INTEGER DEFAULT(0);");
                        agnwVar.z("ALTER TABLE conversation_classifications_table ADD COLUMN generated_timestamp INTEGER DEFAULT(0);");
                        return;
                    case 59350:
                        agnwVar.z("DROP INDEX IF EXISTS index_conversation_classifications_table_classification_type");
                        agnwVar.z("CREATE INDEX index_conversation_classifications_table_classification_type ON conversation_classifications_table(classification_type);");
                        return;
                    default:
                        return;
                }
            case 10:
                Integer valueOf11 = Integer.valueOf(i);
                String[] strArr11 = skk.a;
                valueOf11.getClass();
                switch (i) {
                    case 51000:
                        skk.b(agnwVar, 51000);
                        return;
                    case 53010:
                        agnwVar.z("ALTER TABLE conversation_labels ADD COLUMN snippet_text TEXT;");
                        return;
                    case 53020:
                        agnwVar.z("ALTER TABLE conversation_labels ADD COLUMN label INTEGER REFERENCES supersort_labels(_id) ON DELETE CASCADE ON UPDATE CASCADE;");
                        agnwVar.z("DROP INDEX IF EXISTS unique_idx_conversation_label");
                        agnwVar.z("CREATE UNIQUE INDEX unique_idx_conversation_label ON conversation_labels(conversation_id, label);");
                        return;
                    case 55040:
                        agnwVar.z("ALTER TABLE conversation_labels ADD COLUMN preview_uri TEXT;");
                        agnwVar.z("ALTER TABLE conversation_labels ADD COLUMN preview_content_type TEXT;");
                        return;
                    case 57050:
                        agnwVar.z("ALTER TABLE conversation_labels ADD COLUMN message_status INTEGER DEFAULT(0);");
                        agnwVar.z("ALTER TABLE conversation_labels ADD COLUMN read INTEGER DEFAULT(0);");
                        agnwVar.z("ALTER TABLE conversation_labels ADD COLUMN received_timestamp INTEGER DEFAULT(0);");
                        agnwVar.z("ALTER TABLE conversation_labels ADD COLUMN message_protocol INTEGER DEFAULT(0);");
                        agnwVar.z("ALTER TABLE conversation_labels ADD COLUMN raw_telephony_status INTEGER DEFAULT(0);");
                        return;
                    case 58430:
                        agnwVar.z("DROP INDEX IF EXISTS index_conversation_labels_label");
                        agnwVar.z("CREATE INDEX index_conversation_labels_label ON conversation_labels(label);");
                        return;
                    case 58920:
                        agnwVar.z("DROP INDEX IF EXISTS index_conversation_labels_message_id");
                        agnwVar.z("CREATE INDEX index_conversation_labels_message_id ON conversation_labels(message_id);");
                        return;
                    default:
                        return;
                }
            case 11:
                Integer valueOf12 = Integer.valueOf(i);
                String[] strArr12 = sks.a;
                valueOf12.getClass();
                if (i != 59370) {
                    if (i != 59440) {
                        return;
                    }
                    agnwVar.z("ALTER TABLE conversation_participants_audit_log ADD COLUMN last_modified_by_key TEXT;");
                    return;
                }
                sks.b(agnwVar, 59370);
                return;
            case 12:
                Integer valueOf13 = Integer.valueOf(i);
                String[] strArr13 = sld.a;
                valueOf13.getClass();
                switch (i) {
                    case 58090:
                        agnwVar.z("ALTER TABLE conversation_participants ADD COLUMN is_normalized INT DEFAULT(0);");
                        return;
                    case 58460:
                        agnwVar.z("DROP INDEX IF EXISTS index_conversation_participants_participant_id");
                        agnwVar.z("CREATE INDEX index_conversation_participants_participant_id ON conversation_participants(participant_id);");
                        return;
                    case 58570:
                        agnwVar.z("ALTER TABLE conversation_participants ADD COLUMN rcs_group_join_status INT DEFAULT(0);");
                        return;
                    case 59440:
                        agnwVar.z("ALTER TABLE conversation_participants ADD COLUMN last_modified_by_key TEXT;");
                        return;
                    default:
                        return;
                }
            case 13:
                Integer valueOf14 = Integer.valueOf(i);
                String[] strArr14 = sld.a;
                valueOf14.getClass();
                if (i != 58600) {
                    return;
                }
                agnc.F(agnwVar, "conversation_participants", sld.c(58600, "TEMP___conversation_participants"), sld.a, sld.d());
                return;
            case 14:
                Integer valueOf15 = Integer.valueOf(i);
                String[] strArr15 = slm.a;
                valueOf15.getClass();
                if (i != 58250) {
                    return;
                }
                slm.a(agnwVar);
                return;
            case 15:
                Integer valueOf16 = Integer.valueOf(i);
                String[] strArr16 = sly.a;
                valueOf16.getClass();
                if (i != 11001) {
                    if (i != 12000) {
                        if (i != 17000) {
                            return;
                        }
                        agnwVar.z("DROP INDEX IF EXISTS index_conversation_suggestions_target_rcs_message_id");
                        agnwVar.z("CREATE INDEX index_conversation_suggestions_target_rcs_message_id ON conversation_suggestions(target_rcs_message_id);");
                        return;
                    }
                    agnwVar.z("ALTER TABLE conversation_suggestions ADD COLUMN target_rcs_message_id TEXT;");
                    agnwVar.z("ALTER TABLE conversation_suggestions ADD COLUMN read INT DEFAULT(0);");
                    agnwVar.z("ALTER TABLE conversation_suggestions ADD COLUMN received_timestamp INT DEFAULT(0);");
                    return;
                }
                agnwVar.z("ALTER TABLE conversation_suggestions ADD COLUMN rcs_message_id TEXT;");
                return;
            case 16:
                Integer valueOf17 = Integer.valueOf(i);
                String[] strArr17 = sly.a;
                valueOf17.getClass();
                if (i != 55020) {
                    if (i != 56010) {
                        return;
                    }
                    sly.d(agnwVar);
                    return;
                }
                sly.d(agnwVar);
                return;
            case 17:
                Integer valueOf18 = Integer.valueOf(i);
                String[] strArr18 = smf.a;
                valueOf18.getClass();
                if (i != 59640) {
                    return;
                }
                smf.a(agnwVar);
                return;
            case 18:
                Integer valueOf19 = Integer.valueOf(i);
                String[] strArr19 = smp.a;
                valueOf19.getClass();
                if (i != 59630) {
                    return;
                }
                smp.b(agnwVar);
                return;
            case 19:
                Integer valueOf20 = Integer.valueOf(i);
                String[] strArr20 = sni.a;
                valueOf20.getClass();
                if (i != 57040) {
                    return;
                }
                agnc.F(agnwVar, "conversations", sni.i(57040, "TEMP___conversations"), sni.a, sni.k(57040));
                return;
            default:
                Integer valueOf21 = Integer.valueOf(i);
                String[] strArr21 = snp.a;
                valueOf21.getClass();
                if (i != 57060) {
                    return;
                }
                agnc.F(agnwVar, "custodian_rcs_group_ids", snp.a("TEMP___custodian_rcs_group_ids"), snp.a, d.at());
                return;
        }
    }
}
