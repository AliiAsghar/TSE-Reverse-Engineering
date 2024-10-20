package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sjc extends aglo {
    public static final String[] a = {"cms.key_index", "cms.encryption_key", "cms.key_type", "cms.cms_correlation_id", "cms.cms_id"};
    public static final int[] b;
    public static final usk c;

    static {
        alok alokVar = new alok();
        alokVar.h("cms.cms_correlation_id", 42060);
        alokVar.h("cms.cms_id", 35020);
        alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("cms_correlation_id", "index_cms_cms_correlation_id");
        alokVar2.h("cms_id", "index_cms_cms_id");
        alokVar2.b();
        c = new usk((short[]) null, (byte[]) null);
        b = new int[]{32030, 35020, 42060};
    }

    public static void a(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("key_index INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("key_type INT DEFAULT(0)");
        if (i >= 42060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_correlation_id TEXT");
        }
        if (i >= 35020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_id TEXT");
        }
        sb.insert(0, "CREATE TABLE cms (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 35020) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_cms_id");
            arrayList.add("CREATE UNIQUE INDEX index_cms_cms_id ON cms(cms_id);");
        }
        if (i >= 42060) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_cms_correlation_id");
            arrayList.add("CREATE UNIQUE INDEX index_cms_cms_correlation_id ON cms(cms_correlation_id);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
