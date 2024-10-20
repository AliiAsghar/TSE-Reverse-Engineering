package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class siu extends aglo {
    public static final String[] a = {"cms_status._id", "cms_status.table_type", "cms_status.item_id", "cms_status.cms_id", "cms_status.timestamp", "cms_status.event_type", "cms_status.status", "cms_status.attempt_number"};
    public static final int[] b;
    public static final ahmv c;

    static {
        new alok().b();
        new alok().b();
        c = new ahmv(null);
        b = new int[]{44000};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("table_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("item_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("event_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attempt_number INT");
        sb.insert(0, "CREATE TABLE cms_status (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
