package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkg {
    public final Set a;
    public final PriorityBlockingQueue b;
    public final PriorityBlockingQueue c;
    public final hjy[] d;
    public hjt e;
    public final List f;
    public final hgj g;
    public final atog h;
    public final ico i;
    private final AtomicInteger j;
    private final List k;

    public hkg(atog atogVar, ico icoVar) {
        hgj hgjVar = new hgj(new Handler(Looper.getMainLooper()));
        this.j = new AtomicInteger();
        this.a = new HashSet();
        this.b = new PriorityBlockingQueue();
        this.c = new PriorityBlockingQueue();
        this.f = new ArrayList();
        this.k = new ArrayList();
        this.h = atogVar;
        this.i = icoVar;
        this.d = new hjy[4];
        this.g = hgjVar;
    }

    public final void a(hkd hkdVar) {
        hkdVar.g = this;
        synchronized (this.a) {
            this.a.add(hkdVar);
        }
        hkdVar.f = Integer.valueOf(this.j.incrementAndGet());
        hkdVar.c("add-to-queue");
        b();
        this.b.add(hkdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        synchronized (this.k) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((hke) it.next()).a();
            }
        }
    }
}
