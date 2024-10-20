package defpackage;

import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class teh extends aglo {
    public static final String[] a = {"rbm_business_info.rbm_bot_id", "rbm_business_info.display_name", "rbm_business_info.logo_image_remote_url", "rbm_business_info.logo_image_local_uri", "rbm_business_info.description", "rbm_business_info.color", "rbm_business_info.hero_image_remote_url", "rbm_business_info.hero_image_local_uri", "rbm_business_info.verifier_id", "rbm_business_info.version", "rbm_business_info.expiry_milliseconds", "rbm_business_info.agent_use_case_category"};
    public static final int[] b;
    public static final rtb c;

    static {
        alok alokVar = new alok();
        alokVar.h("rbm_business_info.agent_use_case_category", 59140);
        alokVar.b();
        new alok().b();
        c = new rtb(null);
        b = new int[]{49030, 59140};
    }

    public static tdx a(String str) {
        tee b2 = b();
        b2.w("rbm_business_info.queryOnRbmBotId");
        teg tegVar = new teg();
        tegVar.b(str);
        b2.k(new agpw(tegVar));
        return (tdx) agnc.b(b2.b());
    }

    public static final tee b() {
        Integer valueOf;
        String[] strArr;
        valueOf = Integer.valueOf(a.bp().c());
        if (valueOf.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            alob alobVar = new alob();
            alobVar.h("rbm_business_info.rbm_bot_id");
            alobVar.h("rbm_business_info.display_name");
            alobVar.h("rbm_business_info.logo_image_remote_url");
            alobVar.h("rbm_business_info.logo_image_local_uri");
            alobVar.h("rbm_business_info.description");
            alobVar.h("rbm_business_info.color");
            alobVar.h("rbm_business_info.hero_image_remote_url");
            alobVar.h("rbm_business_info.hero_image_local_uri");
            alobVar.h("rbm_business_info.verifier_id");
            alobVar.h("rbm_business_info.version");
            alobVar.h("rbm_business_info.expiry_milliseconds");
            if (valueOf.intValue() >= 59140) {
                alobVar.h("rbm_business_info.agent_use_case_category");
            }
            strArr = (String[]) alobVar.g().toArray(new String[0]);
        }
        return new tee(strArr);
    }

    public static Object c(String str, Function function, Supplier supplier) {
        Object obj;
        Object apply;
        tdx a2 = a(str);
        if (a2 != null) {
            apply = function.apply(a2);
            return apply;
        }
        obj = supplier.get();
        return obj;
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rbm_bot_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("display_name TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("logo_image_remote_url TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("logo_image_local_uri TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("description TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("color TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("hero_image_remote_url TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("hero_image_local_uri TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("verifier_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("version TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("expiry_milliseconds INTEGER NOT NULL");
        if (i >= 59140) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("agent_use_case_category INT DEFAULT(0)");
        }
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(agnw agnwVar, int i) {
        agnwVar.z(d(i, "rbm_business_info"));
        for (String str : d.at()) {
            agnwVar.z(str);
        }
    }
}
