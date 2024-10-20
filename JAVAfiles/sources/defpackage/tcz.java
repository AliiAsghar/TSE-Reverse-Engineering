package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tcz extends aglo {
    public static final String[] a = {"pii_hash._id", "pii_hash.timestamp", "pii_hash.hash_value", "pii_hash.hash_key"};
    public static final alor b;
    public static final int[] c;
    public static final ifq d;

    static {
        alor b2;
        b2 = new alok().b();
        b = b2;
        new alok().b();
        d = new ifq((char[]) null);
        c = new int[]{57080};
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
        sb.append("hash_value TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("hash_key TEXT");
        sb.insert(0, "CREATE TABLE pii_hash (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
