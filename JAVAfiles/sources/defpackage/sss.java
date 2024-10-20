package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sss extends aglo {
    public static final String[] a = {"link_preview._id", "link_preview.message_id", "link_preview.trigger_url", "link_preview.expiration_time_millis", "link_preview.link_title", "link_preview.link_description", "link_preview.link_image_url", "link_preview.link_domain", "link_preview.link_canonical_url", "link_preview.link_preview_prevented", "link_preview.link_preview_failed"};
    public static final alor b;
    public static final int[] c;
    public static final upt d;

    static {
        alok alokVar = new alok();
        alokVar.h("link_preview.link_preview_prevented", 21010);
        alokVar.h("link_preview.link_preview_failed", 22020);
        b = alokVar.b();
        new alok().b();
        d = new upt((byte[]) null);
        c = new int[]{21010, 22020};
    }

    public static ssj a() {
        int i = srr.a;
        return new ssj();
    }

    public static ssj b() {
        int i = srr.a;
        ssj ssjVar = new ssj();
        ssjVar.aD();
        return ssjVar;
    }

    public static final ssp c() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("link_preview._id");
            alobVar.h("link_preview.message_id");
            alobVar.h("link_preview.trigger_url");
            alobVar.h("link_preview.expiration_time_millis");
            alobVar.h("link_preview.link_title");
            alobVar.h("link_preview.link_description");
            alobVar.h("link_preview.link_image_url");
            alobVar.h("link_preview.link_domain");
            alobVar.h("link_preview.link_canonical_url");
            if (valueOf.intValue() >= 21010) {
                alobVar.h("link_preview.link_preview_prevented");
            }
            if (valueOf.intValue() >= 22020) {
                alobVar.h("link_preview.link_preview_failed");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new ssp(strArr);
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL UNIQUE ON CONFLICT FAIL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("trigger_url TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("expiration_time_millis INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_title TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_description TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_image_url TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_domain TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_canonical_url TEXT");
        if (i >= 21010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("link_preview_prevented INTEGER DEFAULT(0)");
        }
        if (i >= 22020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("link_preview_failed INTEGER DEFAULT(0)");
        }
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(agnw agnwVar, int i) {
        agnc.F(agnwVar, "link_preview", d(i, "TEMP___link_preview"), a, d.at());
    }
}
