package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ptt implements agne {
    private final /* synthetic */ int a;

    @Override // defpackage.agne
    public final void a(int i, agnw agnwVar) {
        switch (this.a) {
            case 0:
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = pty.a;
                valueOf.getClass();
                if (i != 58130) {
                    return;
                }
                agnc.F(agnwVar, "rcs_remote_capabilities_cache", pty.c("TEMP___rcs_remote_capabilities_cache"), pty.a, pty.b(58130));
                return;
            case 1:
                Integer valueOf2 = Integer.valueOf(i);
                String[] strArr2 = pty.a;
                valueOf2.getClass();
                if (i != 58110) {
                    if (i != 58420) {
                        return;
                    }
                    agnwVar.z("DROP INDEX IF EXISTS index_rcs_remote_capabilities_cache_msisdn");
                    agnwVar.z("CREATE INDEX index_rcs_remote_capabilities_cache_msisdn ON rcs_remote_capabilities_cache(msisdn);");
                    return;
                }
                pty.a(agnwVar, 58110);
                return;
            case 2:
                Integer valueOf3 = Integer.valueOf(i);
                String[] strArr3 = qal.a;
                valueOf3.getClass();
                if (i != 60260) {
                    return;
                }
                qal.a(agnwVar);
                return;
            case 3:
                Integer valueOf4 = Integer.valueOf(i);
                String[] strArr4 = qpw.a;
                valueOf4.getClass();
                if (i != 58580) {
                    if (i != 59180) {
                        return;
                    }
                    agnwVar.z("DROP INDEX IF EXISTS index_conversation_matcher_cache_conversation_id");
                    agnwVar.z("CREATE INDEX index_conversation_matcher_cache_conversation_id ON conversation_matcher_cache(conversation_id) WHERE conversation_id NOT NULL;");
                    return;
                }
                qpw.a(agnwVar, 58580);
                return;
            case 4:
                Integer valueOf5 = Integer.valueOf(i);
                String[] strArr5 = qpw.a;
                valueOf5.getClass();
                if (i != 58640) {
                    return;
                }
                agnc.o(agnwVar, "conversation_matcher_cache");
                agnc.F(agnwVar, "conversation_matcher_cache", qpw.c("TEMP___conversation_matcher_cache"), qpw.a, qpw.b(58640));
                return;
            case 5:
                Integer valueOf6 = Integer.valueOf(i);
                String[] strArr6 = qsz.a;
                valueOf6.getClass();
                if (i != 60280) {
                    return;
                }
                qsz.a(agnwVar);
                return;
            case 6:
                Integer valueOf7 = Integer.valueOf(i);
                String[] strArr7 = qty.a;
                valueOf7.getClass();
                if (i != 60430) {
                    return;
                }
                qty.a(agnwVar);
                return;
            case 7:
                Integer valueOf8 = Integer.valueOf(i);
                String[] strArr8 = qug.a;
                valueOf8.getClass();
                if (i != 60460) {
                    return;
                }
                agnc.F(agnwVar, "groups", qug.a("TEMP___groups"), qug.a, qug.b());
                return;
            case 8:
                Integer valueOf9 = Integer.valueOf(i);
                String[] strArr9 = qug.a;
                valueOf9.getClass();
                if (i != 60430) {
                    return;
                }
                qug.c(agnwVar);
                return;
            case 9:
                Integer valueOf10 = Integer.valueOf(i);
                String[] strArr10 = qun.a;
                valueOf10.getClass();
                if (i != 59250) {
                    return;
                }
                agnc.F(agnwVar, "active_sims", qun.a("TEMP___active_sims"), qun.a, d.at());
                return;
            case 10:
                Integer valueOf11 = Integer.valueOf(i);
                String[] strArr11 = qun.a;
                valueOf11.getClass();
                if (i != 59230) {
                    return;
                }
                qun.b(agnwVar);
                return;
            case 11:
                Integer valueOf12 = Integer.valueOf(i);
                String[] strArr12 = qvk.a;
                valueOf12.getClass();
                switch (i) {
                    case 59450:
                        qvk.c(agnwVar, 59450);
                        return;
                    case 59980:
                        agnwVar.z("ALTER TABLE my_identities ADD COLUMN address_type INT;");
                        return;
                    case 59990:
                        agnwVar.z("ALTER TABLE my_identities ADD COLUMN provisioning_id TEXT;");
                        return;
                    case 60120:
                        agnwVar.z("ALTER TABLE my_identities ADD COLUMN display_name TEXT;");
                        return;
                    case 60320:
                        agnwVar.z("ALTER TABLE my_identities ADD COLUMN is_verified INT DEFAULT(0) NOT NULL;");
                        return;
                    default:
                        return;
                }
            case 12:
                Integer valueOf13 = Integer.valueOf(i);
                String[] strArr13 = qww.a;
                valueOf13.getClass();
                if (i != 59250) {
                    return;
                }
                agnc.F(agnwVar, "subscriptions", qww.b(59250, "TEMP___subscriptions"), qww.a, qww.d(59250));
                return;
            case 13:
                Integer valueOf14 = Integer.valueOf(i);
                String[] strArr14 = qww.a;
                valueOf14.getClass();
                if (i != 59230) {
                    if (i != 59450) {
                        if (i != 60160) {
                            return;
                        }
                        agnwVar.z("ALTER TABLE subscriptions ADD COLUMN my_identity_token_with_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                        agnwVar.z("CREATE INDEX index_subscriptions_my_identity_token_with_foreign_key ON subscriptions(my_identity_token_with_foreign_key);");
                        return;
                    }
                    agnwVar.z("ALTER TABLE subscriptions ADD COLUMN my_identity_token TEXT;");
                    agnwVar.z("CREATE INDEX index_subscriptions_my_identity_token ON subscriptions(my_identity_token);");
                    return;
                }
                qww.c(agnwVar, 59230);
                return;
            case 14:
                Integer valueOf15 = Integer.valueOf(i);
                String[] strArr15 = rkq.a;
                valueOf15.getClass();
                if (i != 0) {
                    if (i != 70) {
                        return;
                    }
                    agnwVar.z("ALTER TABLE conversation_participants_backup ADD COLUMN is_c2p_only INT;");
                    agnwVar.z("CREATE INDEX index_conversation_participants_backup_is_c2p_only ON conversation_participants_backup(is_c2p_only);");
                    return;
                }
                agnwVar.z("ALTER TABLE conversation_participants_backup ADD COLUMN is_normalized INT;");
                agnwVar.z("ALTER TABLE conversation_participants_backup ADD COLUMN rcs_group_join_status INT;");
                return;
            case 15:
                Integer valueOf16 = Integer.valueOf(i);
                String[] strArr16 = rkq.a;
                valueOf16.getClass();
                if (i != 90) {
                    return;
                }
                agnc.F(agnwVar, "conversation_participants_backup", rkq.c("TEMP___conversation_participants_backup"), rkq.a, rkq.d());
                return;
            case 16:
                Integer valueOf17 = Integer.valueOf(i);
                String[] strArr17 = rkz.a;
                valueOf17.getClass();
                if (i != 30) {
                    return;
                }
                rkz.c(agnwVar);
                return;
            case 17:
                Integer valueOf18 = Integer.valueOf(i);
                String[] strArr18 = rkz.a;
                valueOf18.getClass();
                if (i != 90) {
                    return;
                }
                agnc.F(agnwVar, "conversation_pins_backup", rkz.a("TEMP___conversation_pins_backup"), rkz.a, rkz.b());
                return;
            case 18:
                Integer valueOf19 = Integer.valueOf(i);
                String[] strArr19 = rlk.a;
                valueOf19.getClass();
                if (i != 0) {
                    if (i != 110) {
                        return;
                    }
                    agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN current_my_identity TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                    agnwVar.z("CREATE INDEX index_conversations_backup_current_my_identity ON conversations_backup(current_my_identity);");
                    return;
                }
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN snippet_text TEXT;");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN archive_status INT DEFAULT(0);");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN most_recent_timestamp_ms INT;");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN subject TEXT;");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN name TEXT;");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN name_is_automatic INTEGER DEFAULT(1);");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN has_rbm_participant INT;");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN rcs_group_self_msisdn TEXT;");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN rcs_group_id TEXT;");
                agnwVar.z("CREATE INDEX index_conversations_backup_rcs_group_id ON conversations_backup(rcs_group_id);");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN rcs_conference_uri TEXT;");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN rcs_group_capabilities INT;");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN error_state INT;");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN rcs_subject_change_timestamp_ms INTEGER;");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN join_state INT;");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN conversation_type INT;");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN send_mode INT DEFAULT(0);");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN cms_id TEXT;");
                agnwVar.z("CREATE INDEX index_conversations_backup_cms_id ON conversations_backup(cms_id);");
                agnwVar.z("ALTER TABLE conversations_backup ADD COLUMN cms_life_cycle INT;");
                return;
            case 19:
                Integer valueOf20 = Integer.valueOf(i);
                String[] strArr20 = rlk.a;
                valueOf20.getClass();
                if (i != 110) {
                    return;
                }
                agnc.F(agnwVar, "conversations_backup", rlk.c("TEMP___conversations_backup"), rlk.a, rlk.d());
                return;
            default:
                Integer valueOf21 = Integer.valueOf(i);
                String[] strArr21 = rlv.a;
                valueOf21.getClass();
                if (i != 120) {
                    return;
                }
                rlv.a(agnwVar);
                return;
        }
    }
}
