package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tcq extends aglo {
    public static final String[] a = {"phone_number_min_match_guesser.guesser_id", "phone_number_min_match_guesser.test_phone_number"};
    public static final int[] b;
    public static final iji c;

    static {
        new alok().b();
        new alok().b();
        c = new iji((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        b = new int[]{58080};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("guesser_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("test_phone_number TEXT");
        sb.insert(0, "CREATE TABLE phone_number_min_match_guesser (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
