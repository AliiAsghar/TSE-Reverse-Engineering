package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tip extends aglo {
    public static final String[] a = {"restore_workflow_executions._id", "restore_workflow_executions.session_id", "restore_workflow_executions.feature", "restore_workflow_executions.status", "restore_workflow_executions.start_time", "restore_workflow_executions.finish_time", "restore_workflow_executions.backup_database_metadata", "restore_workflow_executions.initial_messages_version", "restore_workflow_executions.status_timestamp", "restore_workflow_executions.last_attachment_request_timestamp"};
    public static final alor b;
    public static final int[] c;
    public static final vti d;

    static {
        alok alokVar = new alok();
        alokVar.h("restore_workflow_executions.initial_messages_version", 60110);
        alokVar.h("restore_workflow_executions.status_timestamp", 60220);
        alokVar.h("restore_workflow_executions.last_attachment_request_timestamp", 60330);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("session_id", "index_restore_workflow_executions_session_id");
        alokVar2.b();
        d = new vti(null);
        c = new int[]{60040, 60110, 60220, 60330};
    }

    public static final tim a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("restore_workflow_executions._id");
            alobVar.h("restore_workflow_executions.session_id");
            alobVar.h("restore_workflow_executions.feature");
            alobVar.h("restore_workflow_executions.status");
            alobVar.h("restore_workflow_executions.start_time");
            alobVar.h("restore_workflow_executions.finish_time");
            alobVar.h("restore_workflow_executions.backup_database_metadata");
            if (valueOf.intValue() >= 60110) {
                alobVar.h("restore_workflow_executions.initial_messages_version");
            }
            if (valueOf.intValue() >= 60220) {
                alobVar.h("restore_workflow_executions.status_timestamp");
            }
            if (valueOf.intValue() >= 60330) {
                alobVar.h("restore_workflow_executions.last_attachment_request_timestamp");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new tim(strArr);
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
        sb.append("session_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("feature INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("start_time INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("finish_time INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("backup_database_metadata BLOB");
        if (i >= 60110) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("initial_messages_version INTEGER");
        }
        if (i >= 60220) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("status_timestamp INTEGER");
        }
        if (i >= 60330) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_attachment_request_timestamp INTEGER");
        }
        sb.insert(0, "CREATE TABLE restore_workflow_executions (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_executions_session_id");
        arrayList.add("CREATE UNIQUE INDEX index_restore_workflow_executions_session_id ON restore_workflow_executions(session_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
