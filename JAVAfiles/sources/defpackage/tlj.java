package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tlj extends aglo {
    public static final String[] a = {"settings._id", "settings.key", "settings.sub_key", "settings.data", "settings.last_modified_timestamp"};
    public static final alor b;
    public static final int[] c;
    public static final usk d;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        new alok().b();
        d = new usk((char[]) null);
        c = new int[]{41000};
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
        sb.append("key TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sub_key TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("data BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_modified_timestamp INTEGER DEFAULT(0)");
        sb.insert(0, "CREATE TABLE settings (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_settings_keys");
        arrayList.add("CREATE UNIQUE INDEX index_settings_keys ON settings(key, sub_key);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
