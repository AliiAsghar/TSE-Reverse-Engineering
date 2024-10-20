package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class srm extends aglo {
    public static final String[] a = {"generic_worker_queue._id", "generic_worker_queue.worker_type", "generic_worker_queue.item_table_type", "generic_worker_queue.item_id", "generic_worker_queue.account_id", "generic_worker_queue.in_flight", "generic_worker_queue.retry_count", "generic_worker_queue.flags", "generic_worker_queue.next_execute_timestamp", "generic_worker_queue.trigger_name", "generic_worker_queue.enqueued_timestamp"};
    public static final alor b;
    public static final int[] c;
    public static final upt d;

    static {
        alok alokVar = new alok();
        alokVar.h("generic_worker_queue.account_id", 39020);
        alokVar.h("generic_worker_queue.flags", 32000);
        alokVar.h("generic_worker_queue.next_execute_timestamp", 34000);
        alokVar.h("generic_worker_queue.trigger_name", 59700);
        alokVar.h("generic_worker_queue.enqueued_timestamp", 59970);
        b = alokVar.b();
        new alok().b();
        d = new upt((char[]) null);
        c = new int[]{24000, 32000, 34000, 39020, 58340, 59700, 59970};
    }

    public static final srj a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("generic_worker_queue._id");
            alobVar.h("generic_worker_queue.worker_type");
            alobVar.h("generic_worker_queue.item_table_type");
            alobVar.h("generic_worker_queue.item_id");
            if (valueOf.intValue() >= 39020) {
                alobVar.h("generic_worker_queue.account_id");
            }
            alobVar.h("generic_worker_queue.in_flight");
            alobVar.h("generic_worker_queue.retry_count");
            if (valueOf.intValue() >= 32000) {
                alobVar.h("generic_worker_queue.flags");
            }
            if (valueOf.intValue() >= 34000) {
                alobVar.h("generic_worker_queue.next_execute_timestamp");
            }
            if (valueOf.intValue() >= 59700) {
                alobVar.h("generic_worker_queue.trigger_name");
            }
            if (valueOf.intValue() >= 59970) {
                alobVar.h("generic_worker_queue.enqueued_timestamp");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new srj(strArr);
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
        sb.append("worker_type INTEGER DEFAULT(3)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("item_table_type INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("item_id INTEGER");
        if (i >= 39020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("account_id INTEGER DEFAULT(-1)");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("in_flight INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("retry_count INTEGER DEFAULT(0)");
        if (i >= 32000) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("flags INTEGER DEFAULT(0)");
        }
        if (i >= 34000) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("next_execute_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 59700) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("trigger_name TEXT");
        }
        if (i >= 59970) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("enqueued_timestamp INTEGER DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE generic_worker_queue (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58340) {
            arrayList.add("DROP INDEX IF EXISTS index_generic_worker_queue_next_execute_timestamp");
            arrayList.add("CREATE INDEX index_generic_worker_queue_next_execute_timestamp ON generic_worker_queue(next_execute_timestamp);");
        }
        if (i >= 58340) {
            arrayList.add("DROP INDEX IF EXISTS index_multi_column_index");
            arrayList.add("CREATE INDEX index_multi_column_index ON generic_worker_queue(in_flight, retry_count, item_id, item_table_type, next_execute_timestamp);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
