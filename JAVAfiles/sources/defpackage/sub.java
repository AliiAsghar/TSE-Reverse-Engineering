package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sub extends aglo {
    public static final String[] a = {"message_classifications_table._id", "message_classifications_table.message_id", "message_classifications_table.classification_type", "message_classifications_table.classification_details"};
    public static final alor b;
    public static final int[] c;
    public static final ifq d;

    static {
        alok alokVar = new alok();
        alokVar.h("message_classifications_table.classification_details", 58480);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("message_id", "index_message_classifications_table_message_id");
        alokVar2.h("classification_type", "index_message_classifications_table_classification_type");
        alokVar2.b();
        d = new ifq((byte[]) null, (char[]) null);
        c = new int[]{58400, 58480, 59350};
    }

    public static final stz a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("message_classifications_table._id");
            alobVar.h("message_classifications_table.message_id");
            alobVar.h("message_classifications_table.classification_type");
            if (valueOf.intValue() >= 58480) {
                alobVar.h("message_classifications_table.classification_details");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new stz(strArr);
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
        sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("classification_type INTEGER DEFAULT(0)");
        if (i >= 58480) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("classification_details BLOB");
        }
        sb.insert(0, "CREATE TABLE message_classifications_table (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_classifications_table_message_id");
        arrayList.add("CREATE INDEX index_message_classifications_table_message_id ON message_classifications_table(message_id);");
        if (i >= 59350) {
            arrayList.add("DROP INDEX IF EXISTS index_message_classifications_table_classification_type");
            arrayList.add("CREATE INDEX index_message_classifications_table_classification_type ON message_classifications_table(classification_type);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
