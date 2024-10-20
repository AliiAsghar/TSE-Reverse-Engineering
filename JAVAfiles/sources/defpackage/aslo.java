package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aslo {
    private ExecutorService c;
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b = new ArrayDeque();
    private final ArrayDeque d = new ArrayDeque();

    public final synchronized ExecutorService a() {
        ExecutorService executorService;
        if (this.c == null) {
            this.c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new asms(String.valueOf(asmt.f).concat(" Dispatcher"), false));
        }
        executorService = this.c;
        executorService.getClass();
        return executorService;
    }

    public final void b(asne asneVar) {
        asneVar.a.decrementAndGet();
        ArrayDeque arrayDeque = this.b;
        synchronized (this) {
            if (!arrayDeque.remove(asneVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        c();
    }

    public final void c() {
        byte[] bArr = asmt.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                asne asneVar = (asne) it.next();
                if (this.b.size() >= 64) {
                    break;
                }
                if (asneVar.a.get() < 5) {
                    it.remove();
                    asneVar.a.incrementAndGet();
                    asneVar.getClass();
                    arrayList.add(asneVar);
                    this.b.add(asneVar);
                }
            }
            d();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((asne) arrayList.get(i)).b(a());
        }
    }

    public final synchronized void d() {
        this.b.size();
        this.d.size();
    }
}
