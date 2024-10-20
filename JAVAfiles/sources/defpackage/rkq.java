package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rkq extends aglo {
    public static final String[] a = {"conversation_participants_backup._id", "conversation_participants_backup.conversation_id", "conversation_participants_backup.participant_id", "conversation_participants_backup.is_normalized", "conversation_participants_backup.rcs_group_join_status", "conversation_participants_backup.is_c2p_only"};
    public static final alor b;
    public static final int[] c;
    public static final int[] d;
    public static final jat e;

    static {
        alok alokVar = new alok();
        alokVar.h("conversation_participants_backup.is_normalized", 0);
        alokVar.h("conversation_participants_backup.rcs_group_join_status", 0);
        alokVar.h("conversation_participants_backup.is_c2p_only", 70);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("conversation_id", "index_conversation_participants_backup_conversation_id");
        alokVar2.h("participant_id", "index_conversation_participants_backup_participant_id");
        alokVar2.h("is_c2p_only", "index_conversation_participants_backup_is_c2p_only");
        alokVar2.b();
        e = new jat((int[]) null);
        c = new int[]{0, 70};
        d = new int[]{90};
    }

    public static final rko a() {
        String[] strArr;
        Integer b2 = b();
        if (b2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("conversation_participants_backup._id");
            alobVar.h("conversation_participants_backup.conversation_id");
            alobVar.h("conversation_participants_backup.participant_id");
            if (b2.intValue() >= 0) {
                alobVar.h("conversation_participants_backup.is_normalized");
            }
            if (b2.intValue() >= 0) {
                alobVar.h("conversation_participants_backup.rcs_group_join_status");
            }
            if (b2.intValue() >= 70) {
                alobVar.h("conversation_participants_backup.is_c2p_only");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new rko(strArr);
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
        sb.append("conversation_id INT REFERENCES conversations_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INT REFERENCES participants_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_normalized INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_join_status INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_c2p_only INT");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(", UNIQUE(conversation_id,participant_id) ON CONFLICT FAIL);");
        return sb.toString();
    }

    public static String[] d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_participants_backup_conversation_id");
        arrayList.add("CREATE INDEX index_conversation_participants_backup_conversation_id ON conversation_participants_backup(conversation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversation_participants_backup_participant_id");
        arrayList.add("CREATE INDEX index_conversation_participants_backup_participant_id ON conversation_participants_backup(participant_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversation_participants_backup_is_c2p_only");
        arrayList.add("CREATE INDEX index_conversation_participants_backup_is_c2p_only ON conversation_participants_backup(is_c2p_only);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
