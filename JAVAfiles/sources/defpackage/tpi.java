package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tpi extends aglo {
    public static final String[] a = {"verified_sms_brands._id", "verified_sms_brands.brand_id", "verified_sms_brands.name", "verified_sms_brands.description", "verified_sms_brands.logo_url", "verified_sms_brands.logo_uri", "verified_sms_brands.version_token"};
    public static final toz b;
    public static final int[] c;

    static {
        new alok().b();
        new alok().b();
        b = new toz();
        c = new int[]{29120};
    }

    public static toy a() {
        int i = toe.a;
        toy toyVar = new toy();
        toyVar.aD();
        return toyVar;
    }

    public static void b(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("brand_id TEXT NOT NULL UNIQUE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("description TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("logo_url TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("logo_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("version_token TEXT NOT NULL");
        sb.insert(0, "CREATE TABLE verified_sms_brands (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
