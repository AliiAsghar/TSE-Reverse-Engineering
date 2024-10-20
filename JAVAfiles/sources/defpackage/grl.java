package defpackage;

import android.app.Activity;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grl implements grj {
    public final ReentrantLock a = new ReentrantLock();
    public final WeakHashMap b = new WeakHashMap();
    private final grj c;

    public grl(grj grjVar) {
        this.c = grjVar;
    }

    public final void a(Activity activity, gqz gqzVar) {
        activity.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (d.F(gqzVar, (gqz) this.b.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((gro) this.c).a.c.iterator();
            while (it.hasNext()) {
                ktk ktkVar = (ktk) it.next();
                if (d.F(ktkVar.a, activity)) {
                    ktkVar.f(gqzVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
