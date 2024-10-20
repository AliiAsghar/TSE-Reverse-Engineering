package defpackage;

import android.os.Process;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjt extends Thread {
    private static final boolean b = hkn.b;
    public final BlockingQueue a;
    private final BlockingQueue c;
    private volatile boolean d = false;
    private final hgj e;
    private final atog f;
    private final gpx g;

    public hjt(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, atog atogVar, hgj hgjVar) {
        this.c = blockingQueue;
        this.a = blockingQueue2;
        this.f = atogVar;
        this.e = hgjVar;
        this.g = new gpx(this, blockingQueue2, hgjVar);
    }

    private void b() {
        List arrayList;
        List list;
        hkd hkdVar = (hkd) this.c.take();
        hkdVar.c("cache-queue-take");
        hkdVar.k();
        try {
            if (hkdVar.i()) {
                hkdVar.f("cache-discard-canceled");
            } else {
                hjs c = this.f.c(hkdVar.b);
                if (c == null) {
                    hkdVar.c("cache-miss");
                    if (!this.g.q(hkdVar)) {
                        this.a.put(hkdVar);
                    }
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (c.a(currentTimeMillis)) {
                        hkdVar.c("cache-hit-expired");
                        hkdVar.j = c;
                        if (!this.g.q(hkdVar)) {
                            this.a.put(hkdVar);
                        }
                    } else {
                        hkdVar.c("cache-hit");
                        byte[] bArr = c.a;
                        Map map = c.g;
                        if (map == null) {
                            list = null;
                        } else {
                            if (map.isEmpty()) {
                                arrayList = Collections.emptyList();
                            } else {
                                arrayList = new ArrayList(map.size());
                                for (Map.Entry entry : map.entrySet()) {
                                    arrayList.add(new hjx((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                            list = arrayList;
                        }
                        akju l = hkdVar.l(new hka(BasePaymentResult.ERROR_REQUEST_FAILED, bArr, map, list, false));
                        hkdVar.c("cache-hit-parsed");
                        if (!l.b()) {
                            hkdVar.c("cache-parsing-failed");
                            this.f.m(hkdVar.b);
                            hkdVar.j = null;
                            if (!this.g.q(hkdVar)) {
                                this.a.put(hkdVar);
                            }
                        } else if (c.f < currentTimeMillis) {
                            hkdVar.c("cache-hit-refresh-needed");
                            hkdVar.j = c;
                            l.a = true;
                            if (!this.g.q(hkdVar)) {
                                this.e.j(hkdVar, l, new fhh(this, hkdVar, 17, (short[]) null));
                            } else {
                                this.e.i(hkdVar, l);
                            }
                        } else {
                            this.e.i(hkdVar, l);
                        }
                    }
                }
            }
        } finally {
            hkdVar.k();
        }
    }

    public final void a() {
        this.d = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (b) {
            hkn.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f.f();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                hkn.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
