package defpackage;

import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atde {
    private static final ThreadLocal a = new ThreadLocal();

    public static String a(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new atdd(str, 0));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) a.get();
        if (map != null && (str2 = (String) map.get(str)) != null) {
            return str2;
        }
        return (String) AccessController.doPrivileged(new atdd(str, 2));
    }

    public static boolean b(String str) {
        try {
            String a2 = a(str);
            if (a2 != null && a2.length() == 4) {
                if (a2.charAt(0) != 't' && a2.charAt(0) != 'T') {
                    return false;
                }
                if (a2.charAt(1) != 'r' && a2.charAt(1) != 'R') {
                    return false;
                }
                if (a2.charAt(2) != 'u' && a2.charAt(2) != 'U') {
                    return false;
                }
                if (a2.charAt(3) == 'e') {
                    return true;
                }
                if (a2.charAt(3) != 'E') {
                    return false;
                }
                return true;
            }
            return false;
        } catch (AccessControlException unused) {
            return false;
        }
    }
}
