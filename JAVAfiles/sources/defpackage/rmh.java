package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rmh extends aglo {
    public static final String[] a = {"message_reactions_backup._id", "message_reactions_backup.message_id", "message_reactions_backup.reactions_data", "message_reactions_backup.reacted_message_id", "message_reactions_backup.reaction", "message_reactions_backup.applied_reaction"};
    public static final alor b;
    public static final int[] c;
    public static final int[] d;
    public static final jat e;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        alok alokVar = new alok();
        alokVar.h("message_id", "index_message_reactions_backup_message_id");
        alokVar.h("reacted_message_id", "index_message_reactions_backup_reacted_message_id");
        alokVar.b();
        e = new jat((byte[]) null, (char[]) null);
        c = new int[]{40};
        d = new int[]{90};
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("reactions_data BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("reacted_message_id INTEGER REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("reaction INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("applied_reaction BLOB");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_reactions_backup_message_id");
        arrayList.add("CREATE INDEX index_message_reactions_backup_message_id ON message_reactions_backup(message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_message_reactions_backup_reacted_message_id");
        arrayList.add("CREATE INDEX index_message_reactions_backup_reacted_message_id ON message_reactions_backup(reacted_message_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void c(agnw agnwVar) {
        agnwVar.z(a("message_reactions_backup"));
        for (String str : b()) {
            agnwVar.z(str);
        }
    }
}
