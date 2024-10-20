package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjy extends Thread {
    public volatile boolean a = false;
    private final BlockingQueue b;
    private final hgj c;
    private final atog d;
    private final ico e;

    public hjy(BlockingQueue blockingQueue, ico icoVar, atog atogVar, hgj hgjVar) {
        this.b = blockingQueue;
        this.e = icoVar;
        this.d = atogVar;
        this.c = hgjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02e8, code lost:
    
        if (defpackage.hkn.b == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02ea, code lost:
    
        defpackage.hkn.d("Releasing %d waiting requests for cacheKey=%s.", java.lang.Integer.valueOf(r6.size()), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0300, code lost:
    
        r4 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0308, code lost:
    
        if (r4.hasNext() == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x030a, code lost:
    
        ((defpackage.hgj) r5.a).i((defpackage.hkd) r4.next(), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x031c, code lost:
    
        r5.p(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x027b, code lost:
    
        r2.c("network-http-complete");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0282, code lost:
    
        if (r4.b == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0284, code lost:
    
        r3 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0286, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0287, code lost:
    
        r5 = r2.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0289, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x028a, code lost:
    
        if (r5 == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x028c, code lost:
    
        r2.f("not-modified");
        r2.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x029a, code lost:
    
        r3 = r2.l(r4);
        r2.c("network-parse-complete");
        r4 = r2.h;
        r4 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02a7, code lost:
    
        if (r4 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02a9, code lost:
    
        r20.d.g(r2.b, (defpackage.hjs) r4);
        r2.c("network-cache-written");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02b7, code lost:
    
        r2.g();
        r20.c.i(r2, r3);
        r4 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02c1, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02c2, code lost:
    
        r5 = r2.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02c4, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02c5, code lost:
    
        if (r5 == null) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02c7, code lost:
    
        r4 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02c9, code lost:
    
        if (r4 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02d5, code lost:
    
        if (((defpackage.hjs) r4).a(java.lang.System.currentTimeMillis()) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02d8, code lost:
    
        r4 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02da, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02db, code lost:
    
        r6 = (java.util.List) r5.d.remove(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02e3, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02e4, code lost:
    
        if (r6 == null) goto L218;
     */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a() {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjy.a():void");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.a) {
                    Thread.currentThread().interrupt();
                    return;
                }
                hkn.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
