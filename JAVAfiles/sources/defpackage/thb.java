package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class thb extends aglo {
    public static final String[] a = {"remote_instances._id", "remote_instances.remote_instance_id", "remote_instances.etouffee", "remote_instances.tachyon_id", "remote_instances.last_modified_timestamp", "remote_instances.identity_key", "remote_instances.updated_at_hash", "remote_instances.guaranteed_fresh_as_of_timestamp", "remote_instances.is_updated_at_hash_valid"};
    public static final int[] b;
    public static final uqu c;

    static {
        alok alokVar = new alok();
        alokVar.h("remote_instances.last_modified_timestamp", 35040);
        alokVar.h("remote_instances.identity_key", 38010);
        alokVar.h("remote_instances.updated_at_hash", 39040);
        alokVar.h("remote_instances.guaranteed_fresh_as_of_timestamp", 40010);
        alokVar.h("remote_instances.is_updated_at_hash_valid", 40030);
        alokVar.b();
        new alok().b();
        c = new uqu((byte[]) null, (byte[]) null);
        b = new int[]{34010, 35040, 38010, 39040, 40010, 40030};
    }

    public static final tgz a() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("remote_instances._id");
            alobVar.h("remote_instances.remote_instance_id");
            alobVar.h("remote_instances.etouffee");
            alobVar.h("remote_instances.tachyon_id");
            if (valueOf.intValue() >= 35040) {
                alobVar.h("remote_instances.last_modified_timestamp");
            }
            if (valueOf.intValue() >= 38010) {
                alobVar.h("remote_instances.identity_key");
            }
            if (valueOf.intValue() >= 39040) {
                alobVar.h("remote_instances.updated_at_hash");
            }
            if (valueOf.intValue() >= 40010) {
                alobVar.h("remote_instances.guaranteed_fresh_as_of_timestamp");
            }
            if (valueOf.intValue() >= 40030) {
                alobVar.h("remote_instances.is_updated_at_hash_valid");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new tgz(strArr);
    }

    public static void b(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("remote_instance_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("etouffee INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("tachyon_id TEXT");
        if (i >= 35040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_modified_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 38010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("identity_key BLOB");
        }
        if (i >= 39040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("updated_at_hash INTEGER DEFAULT(0)");
        }
        if (i >= 40010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("guaranteed_fresh_as_of_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 40030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_updated_at_hash_valid INTEGER DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE remote_instances (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
