package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sfp extends aglo {
    public static final String[] a = {"add_contact_banner._id", "add_contact_banner.conversation_id", "add_contact_banner.banner_status"};
    public static final int[] b;
    public static final int[] c;
    public static final uqg d;

    static {
        new alok().b();
        new alok().b();
        d = new uqg((char[]) null, (byte[]) null, (byte[]) null);
        b = new int[]{26020};
        c = new int[]{58160};
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER UNIQUE ON CONFLICT FAIL REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("banner_status INT DEFAULT(0)");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void b(agnw agnwVar) {
        agnwVar.z(a("add_contact_banner"));
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
