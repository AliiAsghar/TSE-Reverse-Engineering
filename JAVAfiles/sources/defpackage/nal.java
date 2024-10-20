package defpackage;

import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nal {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker");
    public mzj d;
    private final arqr f;
    public final Object b = new Object();
    public final AtomicLong c = new AtomicLong(0);
    public final List e = new ArrayList();

    public nal(arqr arqrVar) {
        this.f = arqrVar;
    }

    public final long a() {
        return this.c.get();
    }

    public final mzj b() {
        mzj mzjVar;
        synchronized (this.b) {
            mzjVar = this.d;
        }
        return mzjVar;
    }

    public final nae c(int i, long j, nae naeVar) {
        if (naeVar.b > 0) {
            return naeVar;
        }
        synchronized (this.b) {
            mzj mzjVar = this.d;
            Collection.EL.removeIf(this.e, new isg(new lnn(lga.aB(naeVar.a), 13), 20));
            if (!this.e.isEmpty()) {
                naeVar = d(naeVar, this.e, i);
            }
            if (mzjVar != null && mzjVar.b > j) {
                alvw g = a.g();
                g.X(alwp.a, "BugleMapi");
                ((alvg) g.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheIfNewerResults", 232, "OptimisticMessagePager.kt")).z("cache is at a newer version, leaving as is. %d > %d", mzjVar.b, j);
            }
            this.d = new mzj(i, j, naeVar);
            alvw g2 = a.g();
            g2.X(alwp.a, "BugleMapi");
            ((alvg) g2.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheIfNewerResults", 228, "OptimisticMessagePager.kt")).s("cache set to non null value at version %d.", j);
        }
        return naeVar;
    }

    public final nae d(nae naeVar, List list, int i) {
        int min;
        long j;
        alog alogVar = naeVar.a;
        if (list.size() > i) {
            min = Math.min(alogVar.size(), i);
        } else {
            min = Math.min(alogVar.size(), i - list.size());
        }
        alob alobVar = new alob();
        alobVar.j(list);
        alobVar.j(alogVar.subList(0, min));
        long size = naeVar.c + (alogVar.size() - min);
        if (size < 0) {
            alvi alviVar = a;
            alvw d = alviVar.d();
            d.X(alwp.a, "BugleMapi");
            ((alvg) d.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "merge", 293, "OptimisticMessagePager.kt")).J("Cached list size = %d, inFlights size = %d, endIndex = %d", Integer.valueOf(alogVar.size()), Integer.valueOf(list.size()), Integer.valueOf(min));
            alvw i2 = alviVar.i();
            i2.X(alwp.a, "BugleMapi");
            ((alvg) i2.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "merge", 299, "OptimisticMessagePager.kt")).q("Paging results contain negative itemsAfter. Resetting to zero.");
            j = 0;
        } else {
            j = size;
        }
        if (naeVar.b == 0) {
            alog g = alobVar.g();
            g.getClass();
            return new nae(g, 0L, j, this.f);
        }
        throw new IllegalStateException("Check failed.");
    }
}
