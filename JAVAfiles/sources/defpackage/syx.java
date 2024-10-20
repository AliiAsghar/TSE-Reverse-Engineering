package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class syx extends aglo {
    public static final String[] a = {"smarts_personalization_features.feature_id", "smarts_personalization_features.feature", "smarts_personalization_features.start_date"};
    public static final int[] b;
    public static final uqg c;

    static {
        alok alokVar = new alok();
        alokVar.h("smarts_personalization_features.feature", 54060);
        alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("feature", "index_smarts_personalization_features_feature");
        alokVar2.b();
        c = new uqg((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        b = new int[]{54000, 54060};
    }

    public static String a(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("feature_id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE ON CONFLICT FAIL");
        if (i >= 54060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("feature TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("start_date INTEGER");
        sb.insert(0, a.bW(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void b(agnw agnwVar, int i) {
        agnwVar.z(a(i, "smarts_personalization_features"));
        for (String str : c(i)) {
            agnwVar.z(str);
        }
    }

    public static String[] c(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 54060) {
            arrayList.add("DROP INDEX IF EXISTS index_smarts_personalization_features_feature");
            arrayList.add("CREATE UNIQUE INDEX index_smarts_personalization_features_feature ON smarts_personalization_features(feature);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
