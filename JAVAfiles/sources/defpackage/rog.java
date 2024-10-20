package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rog extends aglo {
    public static final String[] a = {"backup_metadata.created_timestamp", "backup_metadata.schema_version", "backup_metadata.backup_id"};
    public static final int[] b;
    public static final qya c;

    static {
        alok alokVar = new alok();
        alokVar.h("backup_metadata.created_timestamp", 0);
        alokVar.h("backup_metadata.schema_version", 0);
        alokVar.h("backup_metadata.backup_id", 0);
        alokVar.b();
        new alok().b();
        c = new qya((short[]) null);
        b = new int[]{0};
    }

    public static final roe a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            if (c2.intValue() >= 0) {
                alobVar.h("backup_metadata.created_timestamp");
            }
            if (c2.intValue() >= 0) {
                alobVar.h("backup_metadata.schema_version");
            }
            if (c2.intValue() >= 0) {
                alobVar.h("backup_metadata.backup_id");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new roe(strArr);
    }

    public static agnw b() {
        return agnc.d("backup");
    }

    public static Integer c() {
        return Integer.valueOf(d().c());
    }

    public static agcp d() {
        return b().W();
    }
}
