package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejh {
    private static final ThreadLocal j = new ThreadLocal();
    public ejf g;
    public final fvq h;
    public final vl a = new vl();
    public final ArrayList b = new ArrayList();
    public final qdq i = new qdq(this, null);
    public final Runnable c = new ou(this, 17, null);
    public long d = 0;
    public boolean e = false;
    public float f = 1.0f;

    public ejh(fvq fvqVar) {
        this.h = fvqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ejh a() {
        ThreadLocal threadLocal = j;
        if (threadLocal.get() == null) {
            threadLocal.set(new ejh(new fvq((byte[]) null)));
        }
        return (ejh) threadLocal.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        if (Thread.currentThread() == ((Looper) this.h.a).getThread()) {
            return true;
        }
        return false;
    }
}
