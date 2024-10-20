package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rlk extends aglo {
    public static final String[] a = {"conversations_backup._id", "conversations_backup.current_my_identity", "conversations_backup.snippet_text", "conversations_backup.archive_status", "conversations_backup.most_recent_timestamp_ms", "conversations_backup.subject", "conversations_backup.name", "conversations_backup.name_is_automatic", "conversations_backup.has_rbm_participant", "conversations_backup.rcs_group_self_msisdn", "conversations_backup.rcs_group_id", "conversations_backup.rcs_conference_uri", "conversations_backup.rcs_group_capabilities", "conversations_backup.error_state", "conversations_backup.rcs_subject_change_timestamp_ms", "conversations_backup.join_state", "conversations_backup.conversation_type", "conversations_backup.send_mode", "conversations_backup.cms_id", "conversations_backup.cms_life_cycle"};
    public static final alor b;
    public static final int[] c;
    public static final int[] d;
    public static final tde e;

    static {
        alok alokVar = new alok();
        alokVar.h("conversations_backup.current_my_identity", 110);
        alokVar.h("conversations_backup.snippet_text", 0);
        alokVar.h("conversations_backup.archive_status", 0);
        alokVar.h("conversations_backup.most_recent_timestamp_ms", 0);
        alokVar.h("conversations_backup.subject", 0);
        alokVar.h("conversations_backup.name", 0);
        alokVar.h("conversations_backup.name_is_automatic", 0);
        alokVar.h("conversations_backup.has_rbm_participant", 0);
        alokVar.h("conversations_backup.rcs_group_self_msisdn", 0);
        alokVar.h("conversations_backup.rcs_group_id", 0);
        alokVar.h("conversations_backup.rcs_conference_uri", 0);
        alokVar.h("conversations_backup.rcs_group_capabilities", 0);
        alokVar.h("conversations_backup.error_state", 0);
        alokVar.h("conversations_backup.rcs_subject_change_timestamp_ms", 0);
        alokVar.h("conversations_backup.join_state", 0);
        alokVar.h("conversations_backup.conversation_type", 0);
        alokVar.h("conversations_backup.send_mode", 0);
        alokVar.h("conversations_backup.cms_id", 0);
        alokVar.h("conversations_backup.cms_life_cycle", 0);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("current_my_identity", "index_conversations_backup_current_my_identity");
        alokVar2.h("rcs_group_id", "index_conversations_backup_rcs_group_id");
        alokVar2.h("cms_id", "index_conversations_backup_cms_id");
        alokVar2.b();
        e = new tde(null);
        c = new int[]{0};
        d = new int[]{110};
    }

    public static final rli a() {
        String[] strArr;
        Integer b2 = b();
        if (b2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("conversations_backup._id");
            if (b2.intValue() >= 110) {
                alobVar.h("conversations_backup.current_my_identity");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.snippet_text");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.archive_status");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.most_recent_timestamp_ms");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.subject");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.name");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.name_is_automatic");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.has_rbm_participant");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.rcs_group_self_msisdn");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.rcs_group_id");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.rcs_conference_uri");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.rcs_group_capabilities");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.error_state");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.rcs_subject_change_timestamp_ms");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.join_state");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.conversation_type");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.send_mode");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.cms_id");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversations_backup.cms_life_cycle");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new rli(strArr);
    }

    public static Integer b() {
        agcp W;
        W = agnc.d("backup").W();
        return Integer.valueOf(W.c());
    }

    public static String c(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("current_my_identity TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("snippet_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("archive_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("most_recent_timestamp_ms INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subject TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name_is_automatic INTEGER DEFAULT(1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("has_rbm_participant INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_self_msisdn TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_conference_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_capabilities INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("error_state INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_subject_change_timestamp_ms INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("join_state INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("send_mode INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_life_cycle INT");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static String[] d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversations_backup_rcs_group_id");
        arrayList.add("CREATE INDEX index_conversations_backup_rcs_group_id ON conversations_backup(rcs_group_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_backup_cms_id");
        arrayList.add("CREATE INDEX index_conversations_backup_cms_id ON conversations_backup(cms_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversations_backup_current_my_identity");
        arrayList.add("CREATE INDEX index_conversations_backup_current_my_identity ON conversations_backup(current_my_identity);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
