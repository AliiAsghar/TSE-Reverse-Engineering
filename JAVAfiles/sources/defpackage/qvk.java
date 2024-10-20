package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qvk extends aglo {
    public static final String[] a = {"my_identities.token", "my_identities.provisioning_id", "my_identities.is_verified", "my_identities.address_type", "my_identities.phone_number", "my_identities.display_name"};
    public static final alor b = qya.e();
    public static final int[] c;
    public static final jat d;

    static {
        new alok().b();
        d = new jat((byte[]) null, (short[]) null);
        c = new int[]{59450, 59980, 59990, 60120, 60320};
    }

    public static qvd a() {
        int i = qqe.a;
        return new qvd();
    }

    public static final qvh b() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("my_identities.token");
            if (valueOf.intValue() >= 59990) {
                alobVar.h("my_identities.provisioning_id");
            }
            if (valueOf.intValue() >= 60320) {
                alobVar.h("my_identities.is_verified");
            }
            if (valueOf.intValue() >= 59980) {
                alobVar.h("my_identities.address_type");
            }
            alobVar.h("my_identities.phone_number");
            if (valueOf.intValue() >= 60120) {
                alobVar.h("my_identities.display_name");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new qvh(strArr);
    }

    public static void c(agnw agnwVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("token TEXT PRIMARY KEY NOT NULL");
        if (i >= 59990) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("provisioning_id TEXT");
        }
        if (i >= 60320) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_verified INT DEFAULT(0) NOT NULL");
        }
        if (i >= 59980) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("address_type INT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("phone_number TEXT");
        if (i >= 60120) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("display_name TEXT");
        }
        sb.insert(0, "CREATE TABLE my_identities (");
        sb.append(");");
        agnwVar.z(sb.toString());
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
