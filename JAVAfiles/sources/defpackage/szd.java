package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class szd extends aglo {
    public static final String[] a = {"smarts_personalization_normalized_feature_values.date", "smarts_personalization_normalized_feature_values.features"};
    public static final int[] b;
    public static final nej c;

    static {
        new alok().b();
        new alok().b();
        c = new nej();
        b = new int[]{54020};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("date INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("features BLOB");
        sb.insert(0, "CREATE TABLE smarts_personalization_normalized_feature_values (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
