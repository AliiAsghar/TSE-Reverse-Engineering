package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class suz extends aglo {
    public static final String[] a = {"message_labels._id", "message_labels.message_id", "message_labels.label", "message_labels.confidence", "message_labels.source", "message_labels.intent", "message_labels.model_id"};
    public static final alor b;
    public static final int[] c;
    public static final qxr d;

    static {
        alok alokVar = new alok();
        alokVar.h("message_labels.confidence", 53060);
        alokVar.h("message_labels.intent", 58590);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("intent", "index_message_labels_intent");
        alokVar2.b();
        d = new qxr((char[]) null);
        c = new int[]{53050, 53060, 58550, 58590, 59240};
    }

    public static final sux a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("message_labels._id");
            alobVar.h("message_labels.message_id");
            alobVar.h("message_labels.label");
            if (valueOf.intValue() >= 53060) {
                alobVar.h("message_labels.confidence");
            }
            alobVar.h("message_labels.source");
            if (valueOf.intValue() >= 58590) {
                alobVar.h("message_labels.intent");
            }
            alobVar.h("message_labels.model_id");
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new sux(strArr);
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
        sb.append("label INTEGER REFERENCES supersort_labels(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (i >= 53060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("confidence INTEGER");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("source INTEGER");
        if (i >= 58590) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("intent TEXT DEFAULT('')");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("model_id TEXT DEFAULT('')");
        sb.insert(0, "CREATE TABLE message_labels (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS unique_idx_message_label");
        arrayList.add("CREATE UNIQUE INDEX unique_idx_message_label ON message_labels(message_id, label);");
        if (i >= 58550) {
            arrayList.add("DROP INDEX IF EXISTS index_message_labels_label");
            arrayList.add("CREATE INDEX index_message_labels_label ON message_labels(label);");
        }
        if (i >= 59240) {
            arrayList.add("DROP INDEX IF EXISTS index_message_labels_intent");
            arrayList.add("CREATE INDEX index_message_labels_intent ON message_labels(intent) WHERE intent = 'Otp';");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
