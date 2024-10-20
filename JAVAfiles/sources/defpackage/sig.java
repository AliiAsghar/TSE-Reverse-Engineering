package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sig extends aglo {
    public static final String[] a = {"cms_notifications.cms_id", "cms_notifications.cms_last_mod_seq", "cms_notifications.cms_correlation_id", "cms_notifications.from_address", "cms_notifications.to_address", "cms_notifications.correlation_text", "cms_notifications.modified_at_timestamp", "cms_notifications.message_received_timestamp"};
    public static final int[] b;
    public static final ahmv c;

    static {
        alok alokVar = new alok();
        alokVar.h("cms_notifications.message_received_timestamp", 46040);
        alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("correlation_text", "index_cms_notifications_correlation_text");
        alokVar2.b();
        c = new ahmv(null, null);
        b = new int[]{38000, 46040};
    }

    public static void a(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_last_mod_seq INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_correlation_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("from_address TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("to_address TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("correlation_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("modified_at_timestamp INTEGER DEFAULT(0)");
        if (i >= 46040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_received_timestamp INTEGER DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE cms_notifications (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_cms_notifications_correlation_text");
        arrayList.add("CREATE INDEX index_cms_notifications_correlation_text ON cms_notifications(correlation_text);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
