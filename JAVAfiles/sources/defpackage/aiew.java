package defpackage;

import android.os.Looper;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiew implements aies {
    private final armf a;
    private final aegu b;

    public aiew(armf armfVar, aegu aeguVar) {
        this.a = armfVar;
        this.b = aeguVar;
    }

    @Override // defpackage.aies
    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(new aoxh(this, Thread.getDefaultUncaughtExceptionHandler(), 1));
    }

    public final /* synthetic */ void b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        boolean z;
        long a = this.b.a();
        try {
            ArrayList arrayList = new ArrayList();
            if (thread == Looper.getMainLooper().getThread()) {
                Set set = (Set) this.a.b();
                ArrayList arrayList2 = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList2.add(((aiev) it.next()).a());
                    } catch (Throwable th2) {
                        arrayList.add(th2);
                    }
                }
                ListenableFuture[] listenableFutureArr = (ListenableFuture[]) arrayList2.toArray(new ListenableFuture[0]);
                anec anecVar = new anec(listenableFutureArr);
                alob d = alog.d(listenableFutureArr.length);
                for (int i = 0; i < listenableFutureArr.length; i++) {
                    d.h(new aneb(anecVar));
                }
                alog g = d.g();
                for (int i2 = 0; i2 < listenableFutureArr.length; i2++) {
                    listenableFutureArr[i2].c(new wob(anecVar, g, i2, 16), andi.a);
                }
                alur it2 = g.iterator();
                while (it2.hasNext()) {
                    ListenableFuture listenableFuture = (ListenableFuture) it2.next();
                    try {
                    } catch (TimeoutException e) {
                        arrayList.add(e);
                    } catch (Throwable th3) {
                        arrayList.add(th3);
                    }
                    try {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(4000 - (this.b.a() - a));
                        long nanoTime = System.nanoTime() + nanos;
                        z = false;
                        while (true) {
                            try {
                                try {
                                    listenableFuture.get(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    z = true;
                                    nanos = nanoTime - System.nanoTime();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                                break;
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z = false;
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((Throwable) it3.next()).printStackTrace();
            }
        } finally {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
