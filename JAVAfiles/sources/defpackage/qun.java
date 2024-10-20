package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qun extends aglo {
    public static final String[] a = {"active_sims.sim_serial_number", "active_sims.active_sub_id", "active_sims.sim_slot_index"};
    public static final int[] b;
    public static final int[] c;
    public static final qya d;

    static {
        new alok().b();
        new alok().b();
        d = new qya((byte[]) null);
        b = new int[]{59230};
        c = new int[]{59250};
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_serial_number TEXT PRIMARY KEY NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("active_sub_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_slot_index INT DEFAULT(-1)");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(", FOREIGN KEY (sim_serial_number,active_sub_id) REFERENCES subscriptions (sim_serial_number,sub_id) ON DELETE RESTRICT ON UPDATE RESTRICT");
        sb.append(", CHECK (" + new agpk("$R >= 0", new Object[]{"sim_slot_index"}).ad(agpo.b()) + ")");
        sb.append(");");
        return sb.toString();
    }

    public static void b(agnw agnwVar) {
        agnwVar.z(a("active_sims"));
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
