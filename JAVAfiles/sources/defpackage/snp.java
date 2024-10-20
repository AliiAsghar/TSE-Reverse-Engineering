package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class snp extends aglo {
    public static final String[] a = {"custodian_rcs_group_ids.conversation_id", "custodian_rcs_group_ids.rcs_group_id"};
    public static final int[] b;
    public static final int[] c;
    public static final nej d;

    static {
        new alok().b();
        new alok().b();
        d = new nej((byte[]) null, (byte[]) null, (byte[]) null);
        b = new int[]{57000};
        c = new int[]{57060};
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER PRIMARY KEY REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_id TEXT NOT NULL");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void b(agnw agnwVar) {
        agnwVar.z(a("custodian_rcs_group_ids"));
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
