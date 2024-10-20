package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class szu extends aglo {
    public static final String[] a = {"p2p_suggestions._id", "p2p_suggestions.target_message_id", "p2p_suggestions.generated_timestamp", "p2p_suggestions.suggestion", "p2p_suggestions.smart_suggestion_type", "p2p_suggestions.suggestion_status", "p2p_suggestions.consumption_state"};
    public static final int[] b;
    public static final qxr c;

    static {
        alok alokVar = new alok();
        alokVar.h("p2p_suggestions.consumption_state", 53080);
        alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("target_message_id", "index_p2p_suggestions_target_message_id");
        alokVar2.h("generated_timestamp", "index_p2p_suggestions_generated_timestamp");
        alokVar2.b();
        c = new qxr((byte[]) null);
        b = new int[]{42020, 53080, 58510};
    }

    public static final szs a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("p2p_suggestions._id");
            alobVar.h("p2p_suggestions.target_message_id");
            alobVar.h("p2p_suggestions.generated_timestamp");
            alobVar.h("p2p_suggestions.suggestion");
            alobVar.h("p2p_suggestions.smart_suggestion_type");
            alobVar.h("p2p_suggestions.suggestion_status");
            if (valueOf.intValue() >= 53080) {
                alobVar.h("p2p_suggestions.consumption_state");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new szs(strArr);
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
        sb.append("target_message_id INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("generated_timestamp INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("suggestion BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("smart_suggestion_type INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("suggestion_status INTEGER DEFAULT(0)");
        if (i >= 53080) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("consumption_state INTEGER DEFAULT(1)");
        }
        sb.insert(0, "CREATE TABLE p2p_suggestions (");
        sb.append(", FOREIGN KEY (target_message_id) REFERENCES messages (_id) ON DELETE CASCADE);");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_p2p_suggestions_target_message_id");
        arrayList.add("CREATE INDEX index_p2p_suggestions_target_message_id ON p2p_suggestions(target_message_id);");
        if (i >= 58510) {
            arrayList.add("DROP INDEX IF EXISTS index_p2p_suggestions_generated_timestamp");
            arrayList.add("CREATE INDEX index_p2p_suggestions_generated_timestamp ON p2p_suggestions(generated_timestamp);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
