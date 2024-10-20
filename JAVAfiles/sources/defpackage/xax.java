package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xax {
    private static final Lock b = new ReentrantLock();
    static final Map a = new HashMap();

    public static xaw a(String str) {
        Lock lock = b;
        lock.lock();
        try {
            Map map = a;
            xaw xawVar = (xaw) map.get(str);
            if (xawVar == null) {
                xawVar = new xaw(str);
                map.put(str, xawVar);
            }
            lock.unlock();
            return xawVar;
        } catch (Throwable th) {
            b.unlock();
            throw th;
        }
    }
}
