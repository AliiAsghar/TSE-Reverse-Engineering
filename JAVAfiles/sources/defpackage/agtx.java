package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agtx implements Runnable {
    public final agtt a;
    final /* synthetic */ agty b;
    private final Runnable c;
    private final String d;
    private final long e;

    public agtx(agty agtyVar, Runnable runnable, int i) {
        this.b = agtyVar;
        this.c = runnable;
        String str = runnable.getClass().getSimpleName() + "@" + Long.toHexString(System.identityHashCode(runnable)) + "/" + i;
        this.d = str;
        this.e = System.nanoTime();
        agtt agttVar = new agtt(str, agtyVar.getQueue().size(), agtyVar.b.f().toEpochMilli());
        this.a = agttVar;
        agtyVar.d.c(agttVar);
        ((alvg) ((alvg) agty.a.f()).h("com/google/android/libraries/inputmethod/concurrent/ThreadPoolExecutorWrapper$RecordingRunnable", "<init>", 123, "ThreadPoolExecutorWrapper.java")).t("Enqueue: %s", agttVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        long nanoTime = System.nanoTime();
        agtw agtwVar = new agtw(currentThread.getName(), this.d, this.b.getQueue().size(), this.b.b.f().toEpochMilli(), nanoTime - this.e);
        this.b.d.c(agtwVar);
        agty agtyVar = this.b;
        agtp agtpVar = agtyVar.c;
        if (agtpVar != null) {
            agtpVar.c.put(this, agtpVar.b.schedule(new agto(this.a, agtwVar, agtyVar, agtpVar.d), 60000L, TimeUnit.MILLISECONDS));
        }
        ((alvg) ((alvg) agty.a.f()).h("com/google/android/libraries/inputmethod/concurrent/ThreadPoolExecutorWrapper$RecordingRunnable", "run", 141, "ThreadPoolExecutorWrapper.java")).t("Start: %s", agtwVar);
        try {
            this.c.run();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        agtu agtuVar = new agtu(currentThread.getName(), this.d, this.b.getQueue().size(), this.b.b.f().toEpochMilli(), System.nanoTime() - nanoTime, th);
        this.b.d.c(agtuVar);
        agtp agtpVar2 = this.b.c;
        if (agtpVar2 != null) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) agtpVar2.c.remove(this);
            if (scheduledFuture == null) {
                ((alvg) agtp.a.a(agyk.a).h("com/google/android/libraries/inputmethod/concurrent/StalledTaskDetector", "onFinish", 123, "StalledTaskDetector.java")).q("Finished runnable is not registered (unregistered twice?");
            } else {
                scheduledFuture.cancel(false);
            }
        }
        ((alvg) ((alvg) agty.a.f()).h("com/google/android/libraries/inputmethod/concurrent/ThreadPoolExecutorWrapper$RecordingRunnable", "run", 163, "ThreadPoolExecutorWrapper.java")).t("Finish: %s", agtuVar);
        if (th != null) {
            if (!(th instanceof RuntimeException)) {
                if (th instanceof Error) {
                    throw ((Error) th);
                }
                return;
            }
            throw ((RuntimeException) th);
        }
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.a(this.d);
        aj.a(this.c);
        return aj.toString();
    }
}
