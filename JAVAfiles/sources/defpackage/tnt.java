package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tnt extends aglo {
    public static final String[] a = {"trigger_flags._id", "trigger_flags.enabled"};
    public static final int[] b;
    public static final iji c;

    static {
        new alok().b();
        new alok().b();
        c = new iji((byte[]) null, (byte[]) null);
        b = new int[]{58220};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("enabled INT DEFAULT(0)");
        sb.insert(0, "CREATE TABLE trigger_flags (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
