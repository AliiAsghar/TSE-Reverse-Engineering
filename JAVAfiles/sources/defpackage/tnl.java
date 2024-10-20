package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tnl extends aglo {
    public static final String[] a = {"supersort_labels._id", "supersort_labels.name", "supersort_labels.status"};
    public static final int[] b;
    public static final uqg c;

    static {
        new alok().b();
        new alok().b();
        c = new uqg((byte[]) null);
        b = new int[]{53020};
    }

    public static tne a() {
        int i = tls.a;
        return new tne();
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
        sb.append("name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status INTEGER");
        sb.insert(0, "CREATE TABLE supersort_labels (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
