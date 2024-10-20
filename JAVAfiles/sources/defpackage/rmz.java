package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rmz extends aglo {
    public static final String[] a = {"message_star_backup._id", "message_star_backup.message_id"};
    public static final alor b;
    public static final int[] c;
    public static final int[] d;
    public static final lrf e;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        alok alokVar = new alok();
        alokVar.h("message_id", "index_message_star_backup_message_id");
        alokVar.b();
        e = new lrf();
        c = new int[]{20};
        d = new int[]{90};
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_star_backup_message_id");
        arrayList.add("CREATE INDEX index_message_star_backup_message_id ON message_star_backup(message_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void c(agnw agnwVar) {
        agnwVar.z(a("message_star_backup"));
        for (String str : b()) {
            agnwVar.z(str);
        }
    }
}
