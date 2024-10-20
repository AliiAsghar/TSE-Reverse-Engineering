package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tgr extends aglo {
    public static final String[] a = {"reminders._id", "reminders.message_id", "reminders.conversation_id", "reminders.trigger_time", "reminders.status"};
    public static final alor b;
    public static final int[] c;
    public static final usk d;

    static {
        alok alokVar = new alok();
        alokVar.h("reminders.conversation_id", 35070);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("conversation_id", "index_reminders_conversation_id");
        alokVar2.h("trigger_time", "index_reminders_trigger_time");
        alokVar2.b();
        d = new usk((short[]) null);
        c = new int[]{33070, 35070, 58470};
    }

    public static final tgo a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("reminders._id");
            alobVar.h("reminders.message_id");
            if (valueOf.intValue() >= 35070) {
                alobVar.h("reminders.conversation_id");
            }
            alobVar.h("reminders.trigger_time");
            alobVar.h("reminders.status");
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new tgo(strArr);
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
        sb.append("message_id INTEGER UNIQUE REFERENCES messages(_id) ON DELETE CASCADE ");
        if (i >= 35070) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("trigger_time INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status INTEGER DEFAULT(0)");
        sb.insert(0, "CREATE TABLE reminders (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58470) {
            arrayList.add("DROP INDEX IF EXISTS index_reminders_conversation_id");
            arrayList.add("CREATE INDEX index_reminders_conversation_id ON reminders(conversation_id);");
        }
        if (i >= 58470) {
            arrayList.add("DROP INDEX IF EXISTS index_reminders_trigger_time");
            arrayList.add("CREATE INDEX index_reminders_trigger_time ON reminders(trigger_time);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
