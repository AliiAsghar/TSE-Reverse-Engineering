package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class smg implements apxw {
    public static agns a() {
        return new agnf(smf.b, "conversation_to_participants_audit_log", new shm(17));
    }

    public static agmh[] c() {
        return (agmh[]) smf.c.g;
    }

    public static agmh[] d() {
        return (agmh[]) smp.d.e;
    }

    public static agns e() {
        return new agnf(smp.c, "conversation_to_participants", new shm(18));
    }

    public static agmh[] f() {
        return wcm.K();
    }

    public static agns g() {
        return new agnf(sni.d, "conversations", new agne() { // from class: snc
            @Override // defpackage.agne
            public final void a(int i, agnw agnwVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = sni.a;
                valueOf.getClass();
                switch (i) {
                    case 8500:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN participant_id_list TEXT;");
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN source_type INT DEFAULT(0);");
                        return;
                    case 10000:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN rcs_session_id INT DEFAULT(-1);");
                        agnwVar.z("CREATE INDEX index_conversations_rcs_session_id ON conversations(rcs_session_id);");
                        return;
                    case 10006:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN join_state INT DEFAULT(0);");
                        return;
                    case 10007:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN conv_type INT DEFAULT(0);");
                        return;
                    case 10012:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN name_is_automatic INTEGER DEFAULT(1);");
                        return;
                    case 10016:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN send_mode INT DEFAULT(0);");
                        return;
                    case 10018:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN IS_ENTERPRISE INT DEFAULT(0);");
                        return;
                    case 12001:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN has_ea2p_bot_recipient INT DEFAULT(0);");
                        return;
                    case 15000:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN last_interactive_event_timestamp INT DEFAULT(0);");
                        return;
                    case 15010:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN participant_display_destination TEXT;");
                        return;
                    case 23000:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN spam_warning_dismiss_status INT DEFAULT(0);");
                        return;
                    case 26020:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN open_count INT DEFAULT(0);");
                        return;
                    case 28010:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN last_logged_scooby_metadata_timestamp INT DEFAULT(0);");
                        return;
                    case 29020:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN delete_timestamp INT DEFAULT(0);");
                        agnwVar.z("CREATE INDEX index_conversations_delete_timestamp ON conversations(delete_timestamp);");
                        return;
                    case 29060:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN etouffee_default INT DEFAULT(0);");
                        return;
                    case 32000:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN cms_id TEXT;");
                        agnwVar.z("CREATE UNIQUE INDEX index_conversations_cms_id ON conversations(cms_id);");
                        return;
                    case 40050:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN rcs_group_id TEXT;");
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN rcs_conference_uri TEXT;");
                        return;
                    case 46050:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN rcs_subject_change_timestamp_ms INTEGER DEFAULT(-1);");
                        return;
                    case 48040:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN rcs_session_allows_revocation INT DEFAULT(1);");
                        return;
                    case 49020:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN rcs_group_capabilities INTEGER DEFAULT(0);");
                        return;
                    case 49060:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN awaiting_reverse_sync INT DEFAULT(0);");
                        return;
                    case 53030:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN cms_most_recent_read_message_timestamp_ms INT DEFAULT(0);");
                        return;
                    case 58090:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN normalized_participant_contact_id INT DEFAULT(-1);");
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN normalized_participant_lookup_key TEXT;");
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN participant_comparable_destination TEXT;");
                        agnwVar.z("CREATE UNIQUE INDEX index_conversations_participant_comparable_destination ON conversations(participant_comparable_destination);");
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN normalized_participant_id_list TEXT;");
                        agnwVar.z("CREATE UNIQUE INDEX index_conversations_normalized_participant_id_list ON conversations(normalized_participant_id_list);");
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN normalized_participant_display_destination TEXT;");
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN duplicate_of INTEGER REFERENCES conversations(_id)  ;");
                        return;
                    case 58120:
                        agnwVar.z("DROP INDEX IF EXISTS index_conversations_rcs_group_id");
                        agnwVar.z("CREATE INDEX index_conversations_rcs_group_id ON conversations(rcs_group_id) WHERE rcs_group_id NOT NULL;");
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN tachygram_group_routing_info_token BLOB;");
                        return;
                    case 58140:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN error_state INT;");
                        return;
                    case 58210:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN cms_life_cycle INT DEFAULT(0);");
                        return;
                    case 58370:
                        agnwVar.z("DROP INDEX IF EXISTS index_conversations_awaiting_reverse_sync");
                        agnwVar.z("CREATE INDEX index_conversations_awaiting_reverse_sync ON conversations(awaiting_reverse_sync) WHERE awaiting_reverse_sync = 1;");
                        return;
                    case 58390:
                        agnwVar.z("DROP INDEX IF EXISTS index_conversations_participant_normalized_destination");
                        agnwVar.z("CREATE INDEX index_conversations_participant_normalized_destination ON conversations(participant_normalized_destination);");
                        return;
                    case 58540:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN rcs_group_self_msisdn TEXT;");
                        return;
                    case 58750:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN recipient_offline_timestamp_ms INTEGER DEFAULT(-1);");
                        return;
                    case 58910:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN rcs_group_last_sync_timestamp INTEGER DEFAULT(-1);");
                        return;
                    case 59130:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN new_duplicate_of INTEGER REFERENCES conversations(_id) ON DELETE SET NULL ;");
                        return;
                    case 59180:
                        agnwVar.z("DROP INDEX IF EXISTS index_conversations_duplicate_of");
                        agnwVar.z("CREATE INDEX index_conversations_duplicate_of ON conversations(duplicate_of) WHERE duplicate_of NOT NULL;");
                        agnwVar.z("DROP INDEX IF EXISTS index_conversations_new_duplicate_of");
                        agnwVar.z("CREATE INDEX index_conversations_new_duplicate_of ON conversations(new_duplicate_of) WHERE new_duplicate_of NOT NULL;");
                        return;
                    case 59210:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN has_been_e2ee INT DEFAULT(0);");
                        return;
                    case 59220:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN marked_as_unread INT DEFAULT(0);");
                        return;
                    case 59260:
                        agnwVar.z("DROP INDEX IF EXISTS index_conversations_marked_as_unread");
                        agnwVar.z("CREATE INDEX index_conversations_marked_as_unread ON conversations(marked_as_unread) WHERE marked_as_unread = 1;");
                        return;
                    case 59760:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN subtitle TEXT;");
                        return;
                    case 59810:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN current_my_identity TEXT;");
                        return;
                    case 59820:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN custom_theme BLOB;");
                        return;
                    case 60050:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN mms_group_upgrade_status INTEGER DEFAULT(0);");
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN mms_group_upgrade_retries INTEGER DEFAULT(0);");
                        return;
                    case 60160:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN current_my_identity_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                        agnwVar.z("CREATE INDEX index_conversations_current_my_identity_foreign_key ON conversations(current_my_identity_foreign_key);");
                        return;
                    case 60180:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN encryption_protocol INTEGER DEFAULT(0);");
                        return;
                    case 60210:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN encryption_id TEXT;");
                        return;
                    case 60250:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN cms_correlation_id TEXT;");
                        return;
                    case 60310:
                        agnwVar.z("DROP INDEX IF EXISTS index_conversations_cms_correlation_id");
                        agnwVar.z("CREATE UNIQUE INDEX index_conversations_cms_correlation_id ON conversations(cms_correlation_id);");
                        return;
                    case 60360:
                        agnwVar.z("ALTER TABLE conversations ADD COLUMN destination_token TEXT REFERENCES destinations(token) ON DELETE RESTRICT ON UPDATE CASCADE;");
                        agnwVar.z("CREATE INDEX index_conversations_destination_token ON conversations(destination_token);");
                        return;
                    default:
                        return;
                }
            }
        });
    }

    public static agns h() {
        return new agnf(sni.e, true, "conversations", new shm(19));
    }

    public static agmh[] i() {
        return (agmh[]) snp.d.c;
    }

    public static agns j() {
        return new agnf(snp.b, "custodian_rcs_group_ids", new snu(1));
    }

    public static agns k() {
        return new agnf(snp.c, true, "custodian_rcs_group_ids", new shm(20));
    }

    public static agmh[] l() {
        return (agmh[]) snz.c.c;
    }

    public static agns m() {
        return new agnf(snz.b, "data_upgrade_workers", new snu(0));
    }

    public static agmh[] n() {
        return (agmh[]) sof.c.b;
    }

    public static agns o() {
        return new agnf(sof.b, "data_usage", new snu(2));
    }

    public static agmh[] p() {
        return sor.c.w;
    }

    public static agns q() {
        return new agnf(sor.d, "desktop", new snu(3));
    }

    public static agmh[] r() {
        return (agmh[]) soz.c.c;
    }

    public static agns s() {
        return new agnf(soz.b, "disambiguations", new snu(4));
    }

    public static agmh[] t() {
        return (agmh[]) spj.c.a;
    }

    public static agns u() {
        return new agnf(spj.b, "drafts", new snu(5));
    }

    public static agmh[] v() {
        return spv.b.r;
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        throw null;
    }
}
