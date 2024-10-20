package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uqb extends aglo {
    public static final String[] a = {"work_queue._id", "work_queue.type", "work_queue.rawdata", "work_queue.attempts", "work_queue.timestamp", "work_queue.queue", "work_queue.deduplication_tag", "work_queue.scheduled_in_workmanager", "work_queue.workmanager_id", "work_queue.minimum_start_time", "work_queue.cancellation_tag"};
    public static final alor b;
    public static final upt c;
    public static final int[] d;

    static {
        alok alokVar = new alok();
        alokVar.h("work_queue.queue", 41030);
        alokVar.h("work_queue.deduplication_tag", 42050);
        alokVar.h("work_queue.scheduled_in_workmanager", 45030);
        alokVar.h("work_queue.workmanager_id", 46060);
        alokVar.h("work_queue.minimum_start_time", 46070);
        alokVar.h("work_queue.cancellation_tag", 48020);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "index_work_queue_type");
        alokVar2.h("deduplication_tag", "index_work_queue_deduplication_tag");
        alokVar2.h("scheduled_in_workmanager", "index_work_queue_scheduled_in_workmanager");
        alokVar2.b();
        c = new upt();
        d = new int[]{39060, 41030, 42050, 45030, 46060, 46070, 48020, 58270};
    }

    public static final upy a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("work_queue._id");
            alobVar.h("work_queue.type");
            alobVar.h("work_queue.rawdata");
            alobVar.h("work_queue.attempts");
            alobVar.h("work_queue.timestamp");
            if (valueOf.intValue() >= 41030) {
                alobVar.h("work_queue.queue");
            }
            if (valueOf.intValue() >= 42050) {
                alobVar.h("work_queue.deduplication_tag");
            }
            if (valueOf.intValue() >= 45030) {
                alobVar.h("work_queue.scheduled_in_workmanager");
            }
            if (valueOf.intValue() >= 46060) {
                alobVar.h("work_queue.workmanager_id");
            }
            if (valueOf.intValue() >= 46070) {
                alobVar.h("work_queue.minimum_start_time");
            }
            if (valueOf.intValue() >= 48020) {
                alobVar.h("work_queue.cancellation_tag");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new upy(strArr);
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
        sb.append("type TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subtype TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rawdata BLOB NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attempts INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp INTEGER");
        if (i >= 41030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("queue TEXT");
        }
        if (i >= 42050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("deduplication_tag TEXT");
        }
        if (i >= 45030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("scheduled_in_workmanager INT");
        }
        if (i >= 46060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("workmanager_id TEXT");
        }
        if (i >= 46070) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("minimum_start_time INT");
        }
        if (i >= 48020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cancellation_tag TEXT");
        }
        sb.insert(0, "CREATE TABLE work_queue (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 41030) {
            arrayList.add("DROP INDEX IF EXISTS index_work_queue_queue");
            arrayList.add("CREATE INDEX index_work_queue_queue ON work_queue(queue);");
        }
        if (i >= 42050) {
            arrayList.add("DROP INDEX IF EXISTS index_work_queue_deduplication_tag");
            arrayList.add("CREATE INDEX index_work_queue_deduplication_tag ON work_queue(deduplication_tag);");
        }
        if (i >= 58270) {
            arrayList.add("DROP INDEX IF EXISTS index_work_queue_type");
            arrayList.add("CREATE INDEX index_work_queue_type ON work_queue(type);");
        }
        if (i >= 58270) {
            arrayList.add("DROP INDEX IF EXISTS index_work_queue_scheduled_in_workmanager");
            arrayList.add("CREATE INDEX index_work_queue_scheduled_in_workmanager ON work_queue(scheduled_in_workmanager);");
        }
        if (i >= 58270) {
            arrayList.add("DROP INDEX IF EXISTS queue_time");
            arrayList.add("CREATE INDEX queue_time ON work_queue(queue, minimum_start_time);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
