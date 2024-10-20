package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tom extends aglo {
    public static final String[] a = {"user_references._id", "user_references.message_id", "user_references.user_ref_id", "user_references.user_ref_datetime"};
    public static final alor b;
    public static final int[] c;
    public static final int[] d;
    public static final zai e;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        alok alokVar = new alok();
        alokVar.h("message_id", "index_user_references_message_id");
        alokVar.b();
        e = new zai(null);
        c = new int[]{10014};
        d = new int[]{57030};
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
        sb.append("message_id INTEGER NOT NULL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("user_ref_id INTEGER NOT NULL REFERENCES participants(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("user_ref_datetime INTEGER");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(", UNIQUE(message_id,user_ref_id) ON CONFLICT FAIL);");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_user_references_message_id");
        arrayList.add("CREATE INDEX index_user_references_message_id ON user_references(message_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void c(agnw agnwVar) {
        agnwVar.z(a("user_references"));
        for (String str : b()) {
            agnwVar.z(str);
        }
    }
}
