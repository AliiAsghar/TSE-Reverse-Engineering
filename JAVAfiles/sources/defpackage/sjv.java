package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sjv extends aglo {
    public static final String[] a = {"conversation_classifications_table._id", "conversation_classifications_table.conversation_id", "conversation_classifications_table.classification_type", "conversation_classifications_table.classification_state", "conversation_classifications_table.date", "conversation_classifications_table.impression_count", "conversation_classifications_table.generated_timestamp"};
    public static final alor b;
    public static final int[] c;
    public static final qxr d;

    static {
        alok alokVar = new alok();
        alokVar.h("conversation_classifications_table.classification_state", 58690);
        alokVar.h("conversation_classifications_table.impression_count", 58840);
        alokVar.h("conversation_classifications_table.generated_timestamp", 58840);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("conversation_id", "index_conversation_classifications_table_conversation_id");
        alokVar2.h("classification_type", "index_conversation_classifications_table_classification_type");
        alokVar2.h("date", "index_conversation_classifications_table_date");
        alokVar2.b();
        d = new qxr((byte[]) null, (char[]) null);
        c = new int[]{58670, 58690, 58790, 58840, 59350};
    }

    public static final sjs a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("conversation_classifications_table._id");
            alobVar.h("conversation_classifications_table.conversation_id");
            alobVar.h("conversation_classifications_table.classification_type");
            if (valueOf.intValue() >= 58690) {
                alobVar.h("conversation_classifications_table.classification_state");
            }
            alobVar.h("conversation_classifications_table.date");
            if (valueOf.intValue() >= 58840) {
                alobVar.h("conversation_classifications_table.impression_count");
            }
            if (valueOf.intValue() >= 58840) {
                alobVar.h("conversation_classifications_table.generated_timestamp");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new sjs(strArr);
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
        sb.append("conversation_id INTEGER NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("classification_type INTEGER DEFAULT(0)");
        if (i >= 58690) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("classification_state INTEGER DEFAULT(0) NOT NULL");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("date TEXT");
        if (i >= 58840) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("impression_count INTEGER DEFAULT(0)");
        }
        if (i >= 58840) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("generated_timestamp INTEGER DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE conversation_classifications_table (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_classifications_table_conversation_id");
        arrayList.add("CREATE INDEX index_conversation_classifications_table_conversation_id ON conversation_classifications_table(conversation_id);");
        if (i >= 58790) {
            arrayList.add("DROP INDEX IF EXISTS index_conversation_classifications_table_date");
            arrayList.add("CREATE INDEX index_conversation_classifications_table_date ON conversation_classifications_table(date);");
        }
        if (i >= 59350) {
            arrayList.add("DROP INDEX IF EXISTS index_conversation_classifications_table_classification_type");
            arrayList.add("CREATE INDEX index_conversation_classifications_table_classification_type ON conversation_classifications_table(classification_type);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
