package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atmp {
    private static Map a;

    static {
        try {
            String property = System.getProperty("dnsjava.options");
            if (property != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(property, ",");
                while (stringTokenizer.hasMoreTokens()) {
                    String nextToken = stringTokenizer.nextToken();
                    int indexOf = nextToken.indexOf(61);
                    if (indexOf == -1) {
                        if (a == null) {
                            a = new HashMap();
                        }
                        a.put(nextToken.toLowerCase(), "true");
                    } else {
                        String substring = nextToken.substring(0, indexOf);
                        String substring2 = nextToken.substring(indexOf + 1);
                        if (a == null) {
                            a = new HashMap();
                        }
                        a.put(substring.toLowerCase(), substring2.toLowerCase());
                    }
                }
            }
        } catch (SecurityException unused) {
        }
    }

    public static boolean a(String str) {
        Map map = a;
        if (map == null || map.get(str.toLowerCase()) == null) {
            return false;
        }
        return true;
    }
}
