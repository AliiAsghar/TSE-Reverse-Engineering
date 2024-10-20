package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rnm extends aglo {
    public static final String[] a = {"messages_backup._id", "messages_backup.message_persistence_id", "messages_backup.my_identity", "messages_backup.message_status", "messages_backup.seen", "messages_backup.read", "messages_backup.conversation_id", "messages_backup.sender_participant_id", "messages_backup.sender_send_destination", "messages_backup.msisdn_receiving_rcs_message", "messages_backup.self_participant_id", "messages_backup.mms_subject", "messages_backup.received_timestamp", "messages_backup.sent_timestamp", "messages_backup.protocol", "messages_backup.message_priority", "messages_backup.rcs_encryption_status", "messages_backup.cloud_sync_id", "messages_backup.correlation_id", "messages_backup.sms_error_code", "messages_backup.sms_error_desc_map_name", "messages_backup.mms_transaction_id", "messages_backup.mms_content_location", "messages_backup.is_hidden", "messages_backup.rcs_message_id", "messages_backup.custom_headers", "messages_backup.cms_id", "messages_backup.cms_life_cycle", "messages_backup.cms_correlation_id", "messages_backup.cms_last_mod_seq"};
    public static final alor b;
    public static final rne c;
    public static final int[] d;
    public static final int[] e;

    static {
        alok alokVar = new alok();
        alokVar.h("messages_backup.message_persistence_id", 120);
        alokVar.h("messages_backup.my_identity", 110);
        alokVar.h("messages_backup.message_status", 0);
        alokVar.h("messages_backup.seen", 0);
        alokVar.h("messages_backup.read", 0);
        alokVar.h("messages_backup.conversation_id", 0);
        alokVar.h("messages_backup.sender_participant_id", 0);
        alokVar.h("messages_backup.sender_send_destination", 80);
        alokVar.h("messages_backup.msisdn_receiving_rcs_message", 80);
        alokVar.h("messages_backup.self_participant_id", 0);
        alokVar.h("messages_backup.mms_subject", 0);
        alokVar.h("messages_backup.received_timestamp", 0);
        alokVar.h("messages_backup.sent_timestamp", 0);
        alokVar.h("messages_backup.protocol", 0);
        alokVar.h("messages_backup.message_priority", 0);
        alokVar.h("messages_backup.rcs_encryption_status", 0);
        alokVar.h("messages_backup.cloud_sync_id", 0);
        alokVar.h("messages_backup.correlation_id", 0);
        alokVar.h("messages_backup.sms_error_code", 0);
        alokVar.h("messages_backup.sms_error_desc_map_name", 0);
        alokVar.h("messages_backup.is_hidden", 0);
        alokVar.h("messages_backup.rcs_message_id", 0);
        alokVar.h("messages_backup.custom_headers", 50);
        alokVar.h("messages_backup.cms_id", 0);
        alokVar.h("messages_backup.cms_life_cycle", 0);
        alokVar.h("messages_backup.cms_correlation_id", 0);
        alokVar.h("messages_backup.cms_last_mod_seq", 0);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("message_persistence_id", "index_messages_backup_message_persistence_id");
        alokVar2.h("my_identity", "index_messages_backup_my_identity");
        alokVar2.h("conversation_id", "index_messages_backup_conversation_id");
        alokVar2.h("sender_participant_id", "index_messages_backup_sender_participant_id");
        alokVar2.h("self_participant_id", "index_messages_backup_self_participant_id");
        alokVar2.h("received_timestamp", "index_messages_backup_received_timestamp");
        alokVar2.h("rcs_message_id", "index_messages_backup_rcs_message_id");
        alokVar2.h("custom_headers", "index_messages_backup_custom_headers");
        alokVar2.h("cms_id", "index_messages_backup_cms_id");
        alokVar2.h("cms_correlation_id", "index_messages_backup_cms_correlation_id");
        alokVar2.b();
        c = new rne();
        d = new int[]{0, 50, 80, 120};
        e = new int[]{90, 110};
    }

    public static final rnk a() {
        String[] strArr;
        Integer b2 = b();
        if (b2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("messages_backup._id");
            if (b2.intValue() >= 120) {
                alobVar.h("messages_backup.message_persistence_id");
            }
            if (b2.intValue() >= 110) {
                alobVar.h("messages_backup.my_identity");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.message_status");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.seen");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.read");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.conversation_id");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.sender_participant_id");
            }
            if (b2.intValue() >= 80) {
                alobVar.h("messages_backup.sender_send_destination");
            }
            if (b2.intValue() >= 80) {
                alobVar.h("messages_backup.msisdn_receiving_rcs_message");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.self_participant_id");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.mms_subject");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.received_timestamp");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.sent_timestamp");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.protocol");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.message_priority");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.rcs_encryption_status");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.cloud_sync_id");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.correlation_id");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.sms_error_code");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.sms_error_desc_map_name");
            }
            alobVar.h("messages_backup.mms_transaction_id");
            alobVar.h("messages_backup.mms_content_location");
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.is_hidden");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.rcs_message_id");
            }
            if (b2.intValue() >= 50) {
                alobVar.h("messages_backup.custom_headers");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.cms_id");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.cms_life_cycle");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.cms_correlation_id");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("messages_backup.cms_last_mod_seq");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new rnk(strArr);
    }

    public static Integer b() {
        agcp W;
        W = agnc.d("backup").W();
        return Integer.valueOf(W.c());
    }

    public static String c(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (i >= 120) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_persistence_id TEXT");
        }
        if (i >= 110) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_status INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("seen INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("read INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INT REFERENCES conversations_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sender_participant_id INT REFERENCES participants_backup(_id) ON DELETE CASCADE ");
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
        sb.append("self_participant_id INT REFERENCES participants_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("mms_subject TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("received_timestamp INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sent_timestamp INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("protocol INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_priority INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_encryption_status INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cloud_sync_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("correlation_id TEXT");
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
        sb.append("mms_transaction_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("mms_content_location TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_hidden INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("custom_headers BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_life_cycle INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_correlation_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_last_mod_seq INTEGER");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void d(agnw agnwVar, int i) {
        agnc.F(agnwVar, "messages_backup", c(i, "TEMP___messages_backup"), a, e(i));
    }

    public static String[] e(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_conversation_id");
        arrayList.add("CREATE INDEX index_messages_backup_conversation_id ON messages_backup(conversation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_sender_participant_id");
        arrayList.add("CREATE INDEX index_messages_backup_sender_participant_id ON messages_backup(sender_participant_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_self_participant_id");
        arrayList.add("CREATE INDEX index_messages_backup_self_participant_id ON messages_backup(self_participant_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_received_timestamp");
        arrayList.add("CREATE INDEX index_messages_backup_received_timestamp ON messages_backup(received_timestamp);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_rcs_message_id");
        arrayList.add("CREATE INDEX index_messages_backup_rcs_message_id ON messages_backup(rcs_message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_cms_id");
        arrayList.add("CREATE INDEX index_messages_backup_cms_id ON messages_backup(cms_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_cms_correlation_id");
        arrayList.add("CREATE INDEX index_messages_backup_cms_correlation_id ON messages_backup(cms_correlation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_custom_headers");
        arrayList.add("CREATE INDEX index_messages_backup_custom_headers ON messages_backup(custom_headers);");
        if (i >= 110) {
            arrayList.add("DROP INDEX IF EXISTS index_messages_backup_my_identity");
            arrayList.add("CREATE INDEX index_messages_backup_my_identity ON messages_backup(my_identity);");
        }
        if (i >= 120) {
            arrayList.add("DROP INDEX IF EXISTS index_messages_backup_message_persistence_id");
            arrayList.add("CREATE UNIQUE INDEX index_messages_backup_message_persistence_id ON messages_backup(message_persistence_id) WHERE message_persistence_id NOT NULL;");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
