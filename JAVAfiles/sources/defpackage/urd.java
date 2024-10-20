package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class urd extends aglo {
    public static final String[] a = {"work_queue_work_manager_ids.queue", "work_queue_work_manager_ids.workmanager_id", "work_queue_work_manager_ids.scheduled_at_time", "work_queue_work_manager_ids.minimum_start_time", "work_queue_work_manager_ids.requires_network_type", "work_queue_work_manager_ids.requires_charging", "work_queue_work_manager_ids.requires_device_idle", "work_queue_work_manager_ids.requires_battery_not_low", "work_queue_work_manager_ids.requires_storage_not_low"};
    public static final alor b;
    public static final uqu c;
    public static final int[] d;
    public static final int[] e;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        alok alokVar = new alok();
        alokVar.h("workmanager_id", "index_work_queue_work_manager_ids_workmanager_id");
        alokVar.b();
        c = new uqu();
        d = new int[]{59330, 59400};
        e = new int[]{59390};
    }

    public static void a(agnw agnwVar, int i) {
        agnwVar.z(c("work_queue_work_manager_ids"));
        for (String str : b(i)) {
            agnwVar.z(str);
        }
    }

    public static String[] b(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 59400) {
            arrayList.add("DROP INDEX IF EXISTS index_work_queue_work_manager_ids_workmanager_id");
            arrayList.add("CREATE INDEX index_work_queue_work_manager_ids_workmanager_id ON work_queue_work_manager_ids(workmanager_id) WHERE workmanager_id IS NULL;");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String c(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("queue TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("workmanager_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("scheduled_at_time INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("minimum_start_time INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("requires_network_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("requires_charging INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("requires_device_idle INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("requires_battery_not_low INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("requires_storage_not_low INTEGER");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }
}
