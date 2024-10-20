package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class svi extends aglo {
    public static final String[] a = {"message_photos_sharing.message_id", "message_photos_sharing.sharing_state"};
    public static final int[] b;
    public static final nej c;

    static {
        new alok().b();
        alok alokVar = new alok();
        alokVar.h("message_id", "index_message_photos_sharing_message_id");
        alokVar.b();
        c = new nej((char[]) null);
        b = new int[]{58320, 58610};
    }

    public static void a(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sharing_state BLOB NOT NULL");
        sb.insert(0, "CREATE TABLE message_photos_sharing (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58610) {
            arrayList.add("DROP INDEX IF EXISTS index_message_photos_sharing_message_id");
            arrayList.add("CREATE UNIQUE INDEX index_message_photos_sharing_message_id ON message_photos_sharing(message_id);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
