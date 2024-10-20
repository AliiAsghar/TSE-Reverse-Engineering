package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class stl extends aglo {
    public static final String[] a = {"messages_annotations._id", "messages_annotations.conversation_id", "messages_annotations.message_id", "messages_annotations.annotation_type", "messages_annotations.annotation_details"};
    public static final alor b;
    public static final int[] c;
    public static final int[] d;
    public static final usk e;

    static {
        alok alokVar = new alok();
        alokVar.h("messages_annotations.message_id", 20040);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("conversation_id", "index_messages_annotations_conversation_id");
        alokVar2.h("message_id", "index_messages_annotations_message_id");
        alokVar2.h("annotation_type", "index_messages_annotations_annotation_type");
        alokVar2.b();
        e = new usk((char[]) null, (byte[]) null);
        c = new int[]{20030, 20040, 20070, 58530};
        d = new int[]{57020};
    }

    public static final stj a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("messages_annotations._id");
            alobVar.h("messages_annotations.conversation_id");
            if (valueOf.intValue() >= 20040) {
                alobVar.h("messages_annotations.message_id");
            }
            alobVar.h("messages_annotations.annotation_type");
            alobVar.h("messages_annotations.annotation_details");
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new stj(strArr);
    }

    public static String b(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id TEXT");
        if (i >= 20040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("annotation_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("annotation_details BLOB");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void c(agnw agnwVar, int i) {
        agnwVar.z(b(i, "messages_annotations"));
        for (String str : d(i)) {
            agnwVar.z(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] d(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 20040) {
            arrayList.add("DROP INDEX IF EXISTS index_messages_annotations_message_id");
            arrayList.add("CREATE INDEX index_messages_annotations_message_id ON messages_annotations(message_id);");
        }
        if (i >= 20070) {
            arrayList.add("DROP INDEX IF EXISTS index_messages_annotations_conversation_id");
            arrayList.add("CREATE INDEX index_messages_annotations_conversation_id ON messages_annotations(conversation_id);");
        }
        if (i >= 58530) {
            arrayList.add("DROP INDEX IF EXISTS index_messages_annotations_annotation_type");
            arrayList.add("CREATE INDEX index_messages_annotations_annotation_type ON messages_annotations(annotation_type);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static final stf e(agmq agmqVar) {
        agmp agmpVar = (agmp) agmqVar;
        return new stf(agmpVar.b, agmqVar, agmpVar.d, agmpVar.e, new sab(4), new akkw(), null);
    }
}
