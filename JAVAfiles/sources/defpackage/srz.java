package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class srz extends aglo {
    public static final String[] a = {"lighter_conversations_table._id", "lighter_conversations_table.conversation_id", "lighter_conversations_table.business_id", "lighter_conversations_table.lighter_conversation_id_json", "lighter_conversations_table.read", "lighter_conversations_table.is_last_message_outgoing", "lighter_conversations_table.conversation_status", "lighter_conversations_table.last_action_timestamp", "lighter_conversations_table.sync_timestamp_ms"};
    public static final alor b;
    public static final int[] c;
    public static final int[] d;
    public static final uqu e;

    static {
        alok alokVar = new alok();
        alokVar.h("lighter_conversations_table.read", 58700);
        alokVar.h("lighter_conversations_table.is_last_message_outgoing", 58810);
        alokVar.h("lighter_conversations_table.conversation_status", 59030);
        alokVar.h("lighter_conversations_table.last_action_timestamp", 59040);
        alokVar.h("lighter_conversations_table.sync_timestamp_ms", 59100);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("conversation_id", "index_lighter_conversations_table_conversation_id");
        alokVar2.h("business_id", "index_lighter_conversations_table_business_id");
        alokVar2.h("read", "index_lighter_conversation_read_0");
        alokVar2.b();
        e = new uqu((char[]) null, (byte[]) null);
        c = new int[]{58660, 58700, 58760, 58810, 58930, 59030, 59040, 59100};
        d = new int[]{59110};
    }

    public static final srw a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("lighter_conversations_table._id");
            alobVar.h("lighter_conversations_table.conversation_id");
            alobVar.h("lighter_conversations_table.business_id");
            alobVar.h("lighter_conversations_table.lighter_conversation_id_json");
            if (valueOf.intValue() >= 58700) {
                alobVar.h("lighter_conversations_table.read");
            }
            if (valueOf.intValue() >= 58810) {
                alobVar.h("lighter_conversations_table.is_last_message_outgoing");
            }
            if (valueOf.intValue() >= 59030) {
                alobVar.h("lighter_conversations_table.conversation_status");
            }
            if (valueOf.intValue() >= 59040) {
                alobVar.h("lighter_conversations_table.last_action_timestamp");
            }
            if (valueOf.intValue() >= 59100) {
                alobVar.h("lighter_conversations_table.sync_timestamp_ms");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new srw(strArr);
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
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("business_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("lighter_conversation_id_json TEXT");
        if (i >= 58700) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("read INTEGER DEFAULT(1)");
        }
        if (i >= 58810) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_last_message_outgoing INTEGER");
        }
        if (i >= 59030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_status INTEGER");
        }
        if (i >= 59040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_action_timestamp INT DEFAULT(0)");
        }
        if (i >= 59100) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("sync_timestamp_ms INT DEFAULT(0)");
        }
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void c(agnw agnwVar, int i) {
        agnwVar.z(b(i, "lighter_conversations_table"));
        for (String str : d(i)) {
            agnwVar.z(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] d(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_lighter_conversations_table_business_id");
        arrayList.add("CREATE UNIQUE INDEX index_lighter_conversations_table_business_id ON lighter_conversations_table(business_id);");
        if (i >= 58760) {
            arrayList.add("DROP INDEX IF EXISTS index_lighter_conversation_read_0");
            arrayList.add("CREATE INDEX index_lighter_conversation_read_0 ON lighter_conversations_table(read) WHERE read == 0;");
        }
        if (i >= 58930) {
            arrayList.add("DROP INDEX IF EXISTS index_lighter_conversations_table_conversation_id");
            arrayList.add("CREATE INDEX index_lighter_conversations_table_conversation_id ON lighter_conversations_table(conversation_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
