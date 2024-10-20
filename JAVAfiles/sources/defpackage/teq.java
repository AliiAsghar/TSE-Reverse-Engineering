package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class teq extends aglo {
    public static final String[] a = {"rbm_business_verifier_info.verifier_id", "rbm_business_verifier_info.verifier_name", "rbm_business_verifier_info.verifier_logo_image_remote_url", "rbm_business_verifier_info.verifier_logo_image_local_uri"};
    public static final int[] b;
    public static final ifq c;

    static {
        new alok().b();
        new alok().b();
        c = new ifq((byte[]) null);
        b = new int[]{49050};
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("verifier_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("verifier_name TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("verifier_logo_image_remote_url TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("verifier_logo_image_local_uri TEXT NOT NULL");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void b(agnw agnwVar) {
        agnwVar.z(a("rbm_business_verifier_info"));
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
