package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tjz extends aglo {
    public static final String[] a = {"restore_workflow_scratch_timestamps.which_database", "restore_workflow_scratch_timestamps.message_id", "restore_workflow_scratch_timestamps.timestamp_in_seconds", "restore_workflow_scratch_timestamps.timestamp_mod_1000"};
    public static final int[] b;
    public static final ifq c;

    static {
        new alok().b();
        alok alokVar = new alok();
        alokVar.h("message_id", "index_restore_workflow_scratch_timestamps_message_id");
        alokVar.h("timestamp_in_seconds", "index_restore_workflow_scratch_timestamps_timestamp_in_seconds");
        alokVar.b();
        c = new ifq();
        b = new int[]{60420};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("which_database INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp_in_seconds INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp_mod_1000 INTEGER");
        sb.insert(0, "CREATE TABLE restore_workflow_scratch_timestamps (");
        sb.append(", UNIQUE(which_database,message_id) ON CONFLICT IGNORE);");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_timestamps_message_id");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_timestamps_message_id ON restore_workflow_scratch_timestamps(message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_timestamps_timestamp_in_seconds");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_timestamps_timestamp_in_seconds ON restore_workflow_scratch_timestamps(timestamp_in_seconds);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
