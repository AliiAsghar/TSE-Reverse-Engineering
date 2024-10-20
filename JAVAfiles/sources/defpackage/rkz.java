package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rkz extends aglo {
    public static final String[] a = {"conversation_pins_backup._id", "conversation_pins_backup.conversation_id", "conversation_pins_backup.pin_status"};
    public static final alor b;
    public static final int[] c;
    public static final int[] d;
    public static final qya e;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        alok alokVar = new alok();
        alokVar.h("conversation_id", "index_conversation_pins_backup_conversation_id");
        alokVar.b();
        e = new qya((byte[]) null, (byte[]) null);
        c = new int[]{30};
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
        sb.append("conversation_id INTEGER REFERENCES conversations_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("pin_status INTEGER");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static String[] b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_pins_backup_conversation_id");
        arrayList.add("CREATE INDEX index_conversation_pins_backup_conversation_id ON conversation_pins_backup(conversation_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void c(agnw agnwVar) {
        agnwVar.z(a("conversation_pins_backup"));
        for (String str : b()) {
            agnwVar.z(str);
        }
    }
}
