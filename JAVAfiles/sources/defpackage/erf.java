package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erf {
    private static final HashSet a = new HashSet();
    private static String b = "media3.common";

    public static synchronized String a() {
        String str;
        synchronized (erf.class) {
            str = b;
        }
        return str;
    }

    public static synchronized void b(String str) {
        synchronized (erf.class) {
            if (a.add(str)) {
                b = b + ", " + str;
            }
        }
    }
}
