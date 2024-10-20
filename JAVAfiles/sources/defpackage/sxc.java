package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sxc extends aglo {
    public static final String[] a = {"message_star._id", "message_star.message_id"};
    public static final alor b;
    public static final int[] c;
    public static final nej d;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        alok alokVar = new alok();
        alokVar.h("message_id", "index_message_star_message_id");
        alokVar.b();
        d = new nej((byte[]) null);
        c = new int[]{58180};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ");
        sb.insert(0, "CREATE TABLE message_star (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_star_message_id");
        arrayList.add("CREATE UNIQUE INDEX index_message_star_message_id ON message_star(message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
