package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class roq extends aglo {
    public static final String[] a = {"my_identities_backup.token", "my_identities_backup.address_type", "my_identities_backup.phone_number", "my_identities_backup.display_name"};
    public static final int[] b;
    public static final gqg c;

    static {
        new alok().b();
        new alok().b();
        c = new gqg((short[]) null);
        b = new int[]{110};
    }

    public static void a(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("token TEXT PRIMARY KEY NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("address_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("phone_number TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("display_name TEXT");
        sb.insert(0, "CREATE TABLE my_identities_backup (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
