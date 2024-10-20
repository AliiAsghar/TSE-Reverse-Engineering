package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class thk extends aglo {
    public static final String[] a = {"remote_registrations_table.tachyon_registration_id", "remote_registrations_table.etouffee", "remote_registrations_table.better_etouffee", "remote_registrations_table.messages_feature_hash", "remote_registrations_table.last_modified_timestamp", "remote_registrations_table.identity_key", "remote_registrations_table.updated_at_hash", "remote_registrations_table.guaranteed_fresh_as_of_timestamp", "remote_registrations_table.is_updated_at_hash_valid"};
    public static final int[] b;
    public static final uqu c;

    static {
        alok alokVar = new alok();
        alokVar.h("remote_registrations_table.better_etouffee", 46000);
        alokVar.h("remote_registrations_table.messages_feature_hash", 58800);
        alokVar.b();
        new alok().b();
        c = new uqu((char[]) null);
        b = new int[]{45000, 46000, 58800};
    }

    public static thd a() {
        int i = tfq.a;
        return new thd();
    }

    public static final thh b() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("remote_registrations_table.tachyon_registration_id");
            alobVar.h("remote_registrations_table.etouffee");
            if (valueOf.intValue() >= 46000) {
                alobVar.h("remote_registrations_table.better_etouffee");
            }
            if (valueOf.intValue() >= 58800) {
                alobVar.h("remote_registrations_table.messages_feature_hash");
            }
            alobVar.h("remote_registrations_table.last_modified_timestamp");
            alobVar.h("remote_registrations_table.identity_key");
            alobVar.h("remote_registrations_table.updated_at_hash");
            alobVar.h("remote_registrations_table.guaranteed_fresh_as_of_timestamp");
            alobVar.h("remote_registrations_table.is_updated_at_hash_valid");
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new thh(strArr);
    }

    public static void c(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("tachyon_registration_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("etouffee INT DEFAULT(0)");
        if (i >= 46000) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("better_etouffee INT DEFAULT(0)");
        }
        if (i >= 58800) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("messages_feature_hash INTEGER DEFAULT(0)");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_modified_timestamp INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("identity_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("updated_at_hash INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("guaranteed_fresh_as_of_timestamp INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_updated_at_hash_valid INTEGER DEFAULT(0)");
        sb.insert(0, "CREATE TABLE remote_registrations_table (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
