package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class soz extends aglo {
    public static final String[] a = {"disambiguations.lookup_key", "disambiguations.normalized_destination"};
    public static final int[] b;
    public static final nej c;

    static {
        new alok().b();
        new alok().b();
        c = new nej((byte[]) null, (char[]) null);
        b = new int[]{10015};
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("lookup_key TEXT UNIQUE ON CONFLICT REPLACE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("normalized_destination TEXT NOT NULL");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void b(agnw agnwVar) {
        agnwVar.z(a("disambiguations"));
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }

    public static tpk c() {
        int i = sms.a;
        return new tpk((byte[]) null, (char[]) null);
    }
}
