package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agnb {
    private static final Map a = new HashMap();

    public static synchronized Integer a(String str) {
        Integer num;
        synchronized (agnb.class) {
            num = (Integer) a.get(str);
        }
        return num;
    }

    public static synchronized void b(String str, Integer num) {
        synchronized (agnb.class) {
            a.put(str, num);
        }
    }
}
