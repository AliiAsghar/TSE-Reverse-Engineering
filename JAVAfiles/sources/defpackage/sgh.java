package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sgh extends aglo {
    public static final String[] a = {"business_conversations_metadata._id", "business_conversations_metadata.conversation_id", "business_conversations_metadata.chatbot_directory_conversation_state", "business_conversations_metadata.conversation_stop_state", "business_conversations_metadata.conversation_toolstone_state", "business_conversations_metadata.conversation_toolstone_timestamp_ms"};
    public static final alor b;
    public static final int[] c;
    public static final jat d;

    static {
        alok alokVar = new alok();
        alokVar.h("business_conversations_metadata.conversation_stop_state", 59010);
        alokVar.h("business_conversations_metadata.conversation_toolstone_state", 59050);
        alokVar.h("business_conversations_metadata.conversation_toolstone_timestamp_ms", 59050);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("conversation_id", "index_business_conversations_metadata_conversation_id");
        alokVar2.b();
        d = new jat((short[]) null);
        c = new int[]{58070, 59010, 59050};
    }

    public static final sge a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("business_conversations_metadata._id");
            alobVar.h("business_conversations_metadata.conversation_id");
            alobVar.h("business_conversations_metadata.chatbot_directory_conversation_state");
            if (valueOf.intValue() >= 59010) {
                alobVar.h("business_conversations_metadata.conversation_stop_state");
            }
            if (valueOf.intValue() >= 59050) {
                alobVar.h("business_conversations_metadata.conversation_toolstone_state");
            }
            if (valueOf.intValue() >= 59050) {
                alobVar.h("business_conversations_metadata.conversation_toolstone_timestamp_ms");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new sge(strArr);
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
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("chatbot_directory_conversation_state INT");
        if (i >= 59010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_stop_state INTEGER");
        }
        if (i >= 59050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_toolstone_state INTEGER");
        }
        if (i >= 59050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_toolstone_timestamp_ms INTEGER");
        }
        sb.insert(0, "CREATE TABLE business_conversations_metadata (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_business_conversations_metadata_conversation_id");
        arrayList.add("CREATE UNIQUE INDEX index_business_conversations_metadata_conversation_id ON business_conversations_metadata(conversation_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }

    public static sxe c() {
        int i = seo.a;
        return new sxe(null);
    }
}
