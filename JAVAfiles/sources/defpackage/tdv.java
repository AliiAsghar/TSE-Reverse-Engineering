package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tdv extends aglo {
    public static final String[] a = {"rbm_business_info_properties._id", "rbm_business_info_properties.rbm_bot_id", "rbm_business_info_properties.type", "rbm_business_info_properties.header", "rbm_business_info_properties.subheader", "rbm_business_info_properties.property_value"};
    public static final int[] b;
    public static final wyp c;

    static {
        alok alokVar = new alok();
        alokVar.h("rbm_business_info_properties.rbm_bot_id", 51020);
        alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("rbm_bot_id", "index_rbm_business_info_properties_rbm_bot_id");
        alokVar2.b();
        c = new wyp(null, null, null);
        b = new int[]{51020, 58410, 59830};
    }

    public static final tdt a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("rbm_business_info_properties._id");
            if (valueOf.intValue() >= 51020) {
                alobVar.h("rbm_business_info_properties.rbm_bot_id");
            }
            alobVar.h("rbm_business_info_properties.type");
            alobVar.h("rbm_business_info_properties.header");
            alobVar.h("rbm_business_info_properties.subheader");
            alobVar.h("rbm_business_info_properties.property_value");
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new tdt(strArr);
    }

    public static void b(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rbm_bot_id TEXT REFERENCES rbm_business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("type INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("header TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subheader TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("property_value TEXT");
        sb.insert(0, "CREATE TABLE rbm_business_info_properties (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58410) {
            arrayList.add("DROP INDEX IF EXISTS index_rbm_business_info_properties_rbm_bot_id");
            arrayList.add("CREATE INDEX index_rbm_business_info_properties_rbm_bot_id ON rbm_business_info_properties(rbm_bot_id);");
        }
        if (i >= 59830) {
            arrayList.add("DROP INDEX IF EXISTS index_rbm_business_info_properties_rbm_short_codes");
            arrayList.add("CREATE INDEX index_rbm_business_info_properties_rbm_short_codes ON rbm_business_info_properties(type, property_value) WHERE type = 10;");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
