package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class syj extends aglo {
    public static final String[] a = {"modified_by._id", "modified_by.am_version_code", "modified_by.stack_trace_hash", "modified_by.source", "modified_by.tiktok_trace", "modified_by.stack_trace"};
    public static final int[] b;
    public static final int[] c;
    public static final jat d;

    static {
        new alok().b();
        new alok().b();
        d = new jat((byte[]) null);
        b = new int[0];
        c = new int[]{59440};
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("am_version_code INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("stack_trace_hash INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("source TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("tiktok_trace TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("stack_trace TEXT");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS lookup_idx");
        arrayList.add("CREATE UNIQUE INDEX lookup_idx ON modified_by(am_version_code, stack_trace_hash);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
