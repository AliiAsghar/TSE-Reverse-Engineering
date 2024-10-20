package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tji extends aglo {
    public static final String[] a = {"restore_workflow_scratch_duplicates.key", "restore_workflow_scratch_duplicates.backup_id", "restore_workflow_scratch_duplicates.bugle_id"};
    public static final int[] b;
    public static final uqg c;

    static {
        new alok().b();
        alok alokVar = new alok();
        alokVar.h("key", "index_restore_workflow_scratch_duplicates_key");
        alokVar.h("backup_id", "index_restore_workflow_scratch_duplicates_backup_id");
        alokVar.h("bugle_id", "index_restore_workflow_scratch_duplicates_bugle_id");
        alokVar.b();
        c = new uqg((short[]) null);
        b = new int[]{60420};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("key INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("backup_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("bugle_id TEXT");
        sb.insert(0, "CREATE TABLE restore_workflow_scratch_duplicates (");
        sb.append(");");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_duplicates_key");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_duplicates_key ON restore_workflow_scratch_duplicates(key);");
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_duplicates_backup_id");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_duplicates_backup_id ON restore_workflow_scratch_duplicates(backup_id);");
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_duplicates_bugle_id");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_duplicates_bugle_id ON restore_workflow_scratch_duplicates(bugle_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
