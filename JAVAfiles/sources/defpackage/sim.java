package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sim extends aglo {
    public static final String[] a = {"cms_restore_dependency_cache_table._id", "cms_restore_dependency_cache_table.dependent_id", "cms_restore_dependency_cache_table.dependent_cms_id", "cms_restore_dependency_cache_table.dependency_cms_id", "cms_restore_dependency_cache_table.cms_data_provider_type", "cms_restore_dependency_cache_table.payload", "cms_restore_dependency_cache_table.inserted_at_timestamp"};
    public static final int[] b;
    public static final qxr c;

    static {
        alok alokVar = new alok();
        alokVar.h("cms_restore_dependency_cache_table.cms_data_provider_type", 59660);
        alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("dependent_cms_id", "index_cms_restore_dependency_cache_table_dependent_cms_id");
        alokVar2.h("dependency_cms_id", "index_cms_restore_dependency_cache_table_dependency_cms_id");
        alokVar2.h("inserted_at_timestamp", "index_cms_restore_dependency_cache_table_inserted_at_timestamp");
        alokVar2.b();
        c = new qxr((char[]) null, (byte[]) null);
        b = new int[]{59650, 59660};
    }

    public static void a(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("dependent_id INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("dependent_cms_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("dependency_cms_id TEXT NOT NULL");
        if (i >= 59660) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_data_provider_type INT DEFAULT(0) NOT NULL");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("payload BLOB NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("inserted_at_timestamp INTEGER NOT NULL");
        sb.insert(0, "CREATE TABLE cms_restore_dependency_cache_table (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_cms_restore_dependency_cache_table_dependent_cms_id");
        arrayList.add("CREATE INDEX index_cms_restore_dependency_cache_table_dependent_cms_id ON cms_restore_dependency_cache_table(dependent_cms_id);");
        arrayList.add("DROP INDEX IF EXISTS index_cms_restore_dependency_cache_table_dependency_cms_id");
        arrayList.add("CREATE INDEX index_cms_restore_dependency_cache_table_dependency_cms_id ON cms_restore_dependency_cache_table(dependency_cms_id);");
        arrayList.add("DROP INDEX IF EXISTS index_cms_restore_dependency_cache_table_inserted_at_timestamp");
        arrayList.add("CREATE INDEX index_cms_restore_dependency_cache_table_inserted_at_timestamp ON cms_restore_dependency_cache_table(inserted_at_timestamp);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
