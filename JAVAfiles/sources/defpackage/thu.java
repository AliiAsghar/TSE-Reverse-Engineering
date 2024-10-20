package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class thu extends aglo {
    public static final String[] a = {"remote_user_id_info_table.remote_user_id", "remote_user_id_info_table.last_modified_timestamp", "remote_user_id_info_table.guaranteed_fresh_as_of_timestamp"};
    public static final int[] b;
    public static final uqg c;

    static {
        new alok().b();
        new alok().b();
        c = new uqg((byte[]) null, (char[]) null);
        b = new int[]{45000};
    }

    public static thm a(String str) {
        thr thrVar = new thr(a);
        thrVar.w("remote_user_id_info_table.queryOnRemoteUserId");
        tht thtVar = new tht();
        thtVar.b(str);
        thrVar.k(new agpw(thtVar));
        return (thm) agnc.b(thrVar.b());
    }

    public static void b(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("remote_user_id TEXT PRIMARY KEY NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_modified_timestamp INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("guaranteed_fresh_as_of_timestamp INTEGER DEFAULT(0)");
        sb.insert(0, "CREATE TABLE remote_user_id_info_table (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }

    public static tmc c() {
        int i = tfq.a;
        return new tmc(null, null, null);
    }
}
