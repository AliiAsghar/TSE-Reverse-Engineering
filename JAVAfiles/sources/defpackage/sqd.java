package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sqd extends aglo {
    public static final String[] a = {"events._id", "events.timestamp", "events.event", "events.data"};
    public static final alor b;
    public static final int[] c;
    public static final ifq d;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        new alok().b();
        d = new ifq((char[]) null, (byte[]) null);
        c = new int[]{33010};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("event INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("data TEXT");
        sb.insert(0, "CREATE TABLE events (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
