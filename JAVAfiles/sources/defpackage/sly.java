package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sly extends aglo {
    public static final String[] a = {"conversation_suggestions._id", "conversation_suggestions.message_id", "conversation_suggestions.conversation_suggestion_type", "conversation_suggestions.properties", "conversation_suggestions.post_back_data", "conversation_suggestions.post_back_encoding", "conversation_suggestions.rcs_message_id", "conversation_suggestions.target_rcs_message_id", "conversation_suggestions.read", "conversation_suggestions.received_timestamp"};
    public static final int[] b;
    public static final int[] c;
    public static final vti d;

    static {
        alok alokVar = new alok();
        alokVar.h("conversation_suggestions.rcs_message_id", 11001);
        alokVar.h("conversation_suggestions.target_rcs_message_id", 12000);
        alokVar.h("conversation_suggestions.read", 12000);
        alokVar.h("conversation_suggestions.received_timestamp", 12000);
        alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("message_id", "index_conversation_suggestions_message_id");
        alokVar2.h("target_rcs_message_id", "index_conversation_suggestions_target_rcs_message_id");
        alokVar2.b();
        d = new vti(null, null);
        b = new int[]{11001, 12000, 17000};
        c = new int[]{55020, 56010};
    }

    public static final slv a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("conversation_suggestions._id");
            alobVar.h("conversation_suggestions.message_id");
            alobVar.h("conversation_suggestions.conversation_suggestion_type");
            alobVar.h("conversation_suggestions.properties");
            alobVar.h("conversation_suggestions.post_back_data");
            alobVar.h("conversation_suggestions.post_back_encoding");
            if (valueOf.intValue() >= 11001) {
                alobVar.h("conversation_suggestions.rcs_message_id");
            }
            if (valueOf.intValue() >= 12000) {
                alobVar.h("conversation_suggestions.target_rcs_message_id");
            }
            if (valueOf.intValue() >= 12000) {
                alobVar.h("conversation_suggestions.read");
            }
            if (valueOf.intValue() >= 12000) {
                alobVar.h("conversation_suggestions.received_timestamp");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new slv(strArr);
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_suggestion_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("properties TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("post_back_data TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("post_back_encoding TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("target_rcs_message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("read INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("received_timestamp INT DEFAULT(0)");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(", FOREIGN KEY (message_id) REFERENCES messages (_id) ON DELETE CASCADE);");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_suggestions_message_id");
        arrayList.add("CREATE INDEX index_conversation_suggestions_message_id ON conversation_suggestions(message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversation_suggestions_target_rcs_message_id");
        arrayList.add("CREATE INDEX index_conversation_suggestions_target_rcs_message_id ON conversation_suggestions(target_rcs_message_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void d(agnw agnwVar) {
        agnc.F(agnwVar, "conversation_suggestions", b("TEMP___conversation_suggestions"), a, c());
    }
}
