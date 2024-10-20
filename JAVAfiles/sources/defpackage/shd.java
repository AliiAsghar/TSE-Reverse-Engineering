package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class shd extends aglo {
    public static final String[] a = {"cms_dead_letter_queue._id", "cms_dead_letter_queue.cms_id", "cms_dead_letter_queue.cms_data_type", "cms_dead_letter_queue.abandoned_action", "cms_dead_letter_queue.failure_reason", "cms_dead_letter_queue.bugle_table_type", "cms_dead_letter_queue.bugle_id", "cms_dead_letter_queue.cms_backup_parameters", "cms_dead_letter_queue.backup_flags", "cms_dead_letter_queue.backup_dependency_table_type", "cms_dead_letter_queue.backup_dependency_bugle_id"};
    public static final int[] b;
    public static final upt c;

    static {
        alok alokVar = new alok();
        alokVar.h("cms_dead_letter_queue.bugle_table_type", 57090);
        alokVar.h("cms_dead_letter_queue.bugle_id", 57090);
        alokVar.h("cms_dead_letter_queue.cms_backup_parameters", 57090);
        alokVar.h("cms_dead_letter_queue.backup_flags", 57090);
        alokVar.h("cms_dead_letter_queue.backup_dependency_table_type", 57090);
        alokVar.h("cms_dead_letter_queue.backup_dependency_bugle_id", 57090);
        alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("cms_id", "index_cms_dead_letter_queue_cms_id");
        alokVar2.h("abandoned_action", "index_cms_dead_letter_queue_abandoned_action");
        alokVar2.h("bugle_id", "index_cms_dead_letter_queue_bugle_id");
        alokVar2.b();
        c = new upt(null, null);
        b = new int[]{51040, 57090, 58050, 58300};
    }

    public static void a(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_data_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("abandoned_action INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("failure_reason INT");
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("bugle_table_type INTEGER DEFAULT(-1)");
        }
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("bugle_id INTEGER DEFAULT('-1')");
        }
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_backup_parameters BLOB");
        }
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("backup_flags INTEGER");
        }
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("backup_dependency_table_type INTEGER DEFAULT(-1)");
        }
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("backup_dependency_bugle_id INTEGER DEFAULT('-1')");
        }
        sb.insert(0, "CREATE TABLE cms_dead_letter_queue (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58050) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_dead_letter_queue_cms_id");
            arrayList.add("CREATE INDEX index_cms_dead_letter_queue_cms_id ON cms_dead_letter_queue(cms_id);");
        }
        if (i >= 58050) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_dead_letter_queue_bugle_id");
            arrayList.add("CREATE INDEX index_cms_dead_letter_queue_bugle_id ON cms_dead_letter_queue(bugle_id);");
        }
        if (i >= 58300) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_dead_letter_queue_abandoned_action");
            arrayList.add("CREATE INDEX index_cms_dead_letter_queue_abandoned_action ON cms_dead_letter_queue(abandoned_action);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
