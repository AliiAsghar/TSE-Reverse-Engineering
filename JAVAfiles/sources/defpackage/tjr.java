package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tjr extends aglo {
    public static final String[] a = {"restore_workflow_scratch_suffix.which_database", "restore_workflow_scratch_suffix.participant_id", "restore_workflow_scratch_suffix.destination_suffix"};
    public static final int[] b;
    public static final uqg c;

    static {
        new alok().b();
        alok alokVar = new alok();
        alokVar.h("participant_id", "index_restore_workflow_scratch_suffix_participant_id");
        alokVar.h("destination_suffix", "index_restore_workflow_scratch_suffix_destination_suffix");
        alokVar.b();
        c = new uqg((byte[]) null, (byte[]) null, (byte[]) null);
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
        sb.append("participant_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("destination_suffix TEXT");
        sb.insert(0, "CREATE TABLE restore_workflow_scratch_suffix (");
        sb.append(", UNIQUE(which_database,participant_id) ON CONFLICT IGNORE);");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_suffix_participant_id");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_suffix_participant_id ON restore_workflow_scratch_suffix(participant_id);");
        arrayList.add("DROP INDEX IF EXISTS index_restore_workflow_scratch_suffix_destination_suffix");
        arrayList.add("CREATE INDEX index_restore_workflow_scratch_suffix_destination_suffix ON restore_workflow_scratch_suffix(destination_suffix);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
