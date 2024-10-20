package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class snz extends aglo {
    public static final String[] a = {"data_upgrade_workers._id", "data_upgrade_workers.last_update_version"};
    public static final int[] b;
    public static final nej c;

    static {
        new alok().b();
        new alok().b();
        c = new nej((char[]) null, (byte[]) null);
        b = new int[]{58240};
    }

    public static snq a(tqb tqbVar) {
        snw snwVar = new snw(a);
        snwVar.w("data_upgrade_workers.queryOnId");
        sny snyVar = new sny();
        snyVar.b(tqbVar);
        snwVar.k(new agpw(snyVar));
        return (snq) agnc.b(snwVar.b());
    }

    public static void b(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_update_version INT DEFAULT(0)");
        sb.insert(0, "CREATE TABLE data_upgrade_workers (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
