package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sof extends aglo {
    public static final String[] a = {"data_usage._id", "data_usage.phone_number", "data_usage.data_size"};
    public static final int[] b;
    public static final uqg c;

    static {
        new alok().b();
        new alok().b();
        c = new uqg((byte[]) null, (byte[]) null, (char[]) null);
        b = new int[]{51010};
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
        sb.append("phone_number TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("data_size INTEGER DEFAULT(0)");
        sb.insert(0, "CREATE TABLE data_usage (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
