package defpackage;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.ArrayMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajuk {
    private static final agxw a = new agxw("PersistableBundles");

    public static Bundle a(PersistableBundle persistableBundle) {
        Bundle bundle = new Bundle();
        bundle.putAll(persistableBundle);
        return bundle;
    }

    public static boolean b(PersistableBundle persistableBundle, PersistableBundle persistableBundle2) {
        if (persistableBundle != persistableBundle2 && !d(persistableBundle).equals(d(persistableBundle2))) {
            return false;
        }
        return true;
    }

    public static void c(PersistableBundle persistableBundle) {
        d.aB(persistableBundle, "PersistableBundle cannot be null!");
        for (String str : persistableBundle.keySet()) {
            Object obj = persistableBundle.get(str);
            ajgk.r(e(obj), String.format("Unknown/unsupported data type [%s] for key %s", obj, str));
        }
    }

    private static ArrayMap d(BaseBundle baseBundle) {
        if (baseBundle.isEmpty()) {
            return new ArrayMap(0);
        }
        ArrayMap arrayMap = new ArrayMap(baseBundle.size());
        for (String str : baseBundle.keySet()) {
            Object obj = baseBundle.get(str);
            if (!e(obj)) {
                a.u(String.format("Unknown/unsupported data type [%s] for key %s", obj, str));
            } else {
                arrayMap.put(str, baseBundle.get(str));
            }
        }
        return arrayMap;
    }

    private static boolean e(Object obj) {
        if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof String) && !(obj instanceof Boolean)) {
            return false;
        }
        return true;
    }
}
