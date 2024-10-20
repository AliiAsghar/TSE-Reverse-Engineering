package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tky extends aglo {
    public static final String[] a = {"self_profiles._id", "self_profiles.my_identity_token", "self_profiles.limited_profile_display_name", "self_profiles.photo_uri", "self_profiles.is_self_profile_shareable", "self_profiles.belongs_to_self_gaia", "self_profiles.update_timestamp"};
    public static final int[] b;
    public static final int[] c;
    public static final toz d;

    static {
        alok alokVar = new alok();
        alokVar.h("self_profiles.is_self_profile_shareable", 60400);
        alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("my_identity_token", "index_self_profiles_my_identity_token");
        alokVar2.b();
        d = new toz((char[]) null);
        b = new int[]{59920, 60400};
        c = new int[]{60140};
    }

    public static String a(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("my_identity_token TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("limited_profile_display_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("photo_uri TEXT");
        if (i >= 60400) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_self_profile_shareable INT DEFAULT(1)");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("belongs_to_self_gaia INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("update_timestamp INT DEFAULT(0)");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void b(agnw agnwVar, int i) {
        agnwVar.z(a(i, "self_profiles"));
        for (String str : c()) {
            agnwVar.z(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_self_profiles_my_identity_token");
        arrayList.add("CREATE INDEX index_self_profiles_my_identity_token ON self_profiles(my_identity_token);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
