package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asqp extends Thread {
    public asqp() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r8 = this;
        L0:
            java.util.concurrent.locks.ReentrantLock r0 = defpackage.asqs.b     // Catch: java.lang.InterruptedException -> L0
            r0.lock()     // Catch: java.lang.InterruptedException -> L0
            asqs r1 = defpackage.asqs.f     // Catch: java.lang.Throwable -> L6b
            r1.getClass()     // Catch: java.lang.Throwable -> L6b
            asqs r1 = r1.h     // Catch: java.lang.Throwable -> L6b
            r2 = 0
            if (r1 != 0) goto L33
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.locks.Condition r1 = defpackage.asqs.c     // Catch: java.lang.Throwable -> L6b
            long r5 = defpackage.asqs.d     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L6b
            r1.await(r5, r7)     // Catch: java.lang.Throwable -> L6b
            asqs r1 = defpackage.asqs.f     // Catch: java.lang.Throwable -> L6b
            r1.getClass()     // Catch: java.lang.Throwable -> L6b
            asqs r1 = r1.h     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L48
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L6b
            long r5 = r5 - r3
            long r3 = defpackage.asqs.e     // Catch: java.lang.Throwable -> L6b
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 < 0) goto L48
            asqs r1 = defpackage.asqs.f     // Catch: java.lang.Throwable -> L6b
            goto L58
        L33:
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L6b
            long r3 = r1.c(r3)     // Catch: java.lang.Throwable -> L6b
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L4a
            java.util.concurrent.locks.Condition r1 = defpackage.asqs.c     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L6b
            r1.await(r3, r5)     // Catch: java.lang.Throwable -> L6b
        L48:
            r1 = r2
            goto L58
        L4a:
            asqs r3 = defpackage.asqs.f     // Catch: java.lang.Throwable -> L6b
            r3.getClass()     // Catch: java.lang.Throwable -> L6b
            asqs r4 = r1.h     // Catch: java.lang.Throwable -> L6b
            r3.h = r4     // Catch: java.lang.Throwable -> L6b
            r1.h = r2     // Catch: java.lang.Throwable -> L6b
            r3 = 2
            r1.g = r3     // Catch: java.lang.Throwable -> L6b
        L58:
            asqs r3 = defpackage.asqs.f     // Catch: java.lang.Throwable -> L6b
            if (r1 != r3) goto L62
            defpackage.asqs.f = r2     // Catch: java.lang.Throwable -> L6b
            r0.unlock()     // Catch: java.lang.InterruptedException -> L0
            return
        L62:
            r0.unlock()     // Catch: java.lang.InterruptedException -> L0
            if (r1 == 0) goto L0
            r1.a()     // Catch: java.lang.InterruptedException -> L0
            goto L0
        L6b:
            r1 = move-exception
            r0.unlock()     // Catch: java.lang.InterruptedException -> L0
            throw r1     // Catch: java.lang.InterruptedException -> L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asqp.run():void");
    }
}
