package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rmq extends aglo {
    public static final String[] a = {"message_replies_backup.message_id", "message_replies_backup.replied_to_message_id", "message_replies_backup.replied_to_message_id_null_reason", "message_replies_backup.replied_to_rcs_message_id"};
    public static final alor b;
    public static final int[] c;
    public static final int[] d;
    public static final gqg e;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        alok alokVar = new alok();
        alokVar.h("replied_to_message_id", "index_message_replies_backup_replied_to_message_id");
        alokVar.h("replied_to_message_id_null_reason", "index_message_replies_backup_replied_to_message_id_null_reason");
        alokVar.h("replied_to_rcs_message_id", "index_message_replies_backup_replied_to_rcs_message_id");
        alokVar.b();
        e = new gqg(null, null, null);
        c = new int[]{60};
        d = new int[]{90};
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER PRIMARY KEY REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("replied_to_message_id INTEGER REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("replied_to_message_id_null_reason INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("replied_to_rcs_message_id TEXT");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_replies_backup_replied_to_message_id");
        arrayList.add("CREATE INDEX index_message_replies_backup_replied_to_message_id ON message_replies_backup(replied_to_message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_message_replies_backup_replied_to_message_id_null_reason");
        arrayList.add("CREATE INDEX index_message_replies_backup_replied_to_message_id_null_reason ON message_replies_backup(replied_to_message_id_null_reason);");
        arrayList.add("DROP INDEX IF EXISTS index_message_replies_backup_replied_to_rcs_message_id");
        arrayList.add("CREATE INDEX index_message_replies_backup_replied_to_rcs_message_id ON message_replies_backup(replied_to_rcs_message_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void c(agnw agnwVar) {
        agnwVar.z(a("message_replies_backup"));
        for (String str : b()) {
            agnwVar.z(str);
        }
    }
}
