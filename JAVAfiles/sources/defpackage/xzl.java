package defpackage;

import android.os.AsyncTask;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xzl {
    static {
        long j = xzo.e;
    }

    public static Executor a() {
        if (xyl.n()) {
            return andi.a;
        }
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public static void b(xzo xzoVar, RejectedExecutionException rejectedExecutionException) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS aa", Locale.US);
        StringBuilder sb = new StringBuilder();
        synchronized (xzo.f) {
            String str = "unknown time";
            if (xzo.f.containsKey(xzoVar)) {
                str = simpleDateFormat.format(new Date(((Long) xzo.f.get(xzoVar)).longValue()));
            }
            alvw h = xzn.a.h();
            h.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) h).g(rejectedExecutionException)).h("com/google/android/apps/messaging/shared/util/common/SafeAsyncExecutable", "dumpCrashInfo", 85, "SafeAsyncExecutable.java")).D("Failed to run %s, enqueued for execution at %s", xzoVar, str);
            sb.append("\nTHREAD_POOL_EXECUTOR executing list and enqueuing times: ");
            sb.append(xzo.f.size());
            sb.append(" tasks(s) or runnable(s)");
            for (Object obj : xzo.f.keySet()) {
                xzb.r(sb, String.format("\n %s, %s", obj, simpleDateFormat.format(new Date(((Long) xzo.f.get(obj)).longValue()))), "\nTHREAD_POOL_EXECUTOR executing list (continued):");
            }
        }
        xzb.j("Bugle", sb.toString());
        sb.setLength(0);
        BlockingQueue<Runnable> queue = ((ThreadPoolExecutor) AsyncTask.THREAD_POOL_EXECUTOR).getQueue();
        synchronized (queue) {
            sb.append("THREAD_POOL_EXECUTOR queued list: ");
            sb.append(queue.size());
            sb.append(" runnable(s)");
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                xzb.r(sb, "\n " + String.valueOf((Runnable) it.next()), "\nTHREAD_POOL_EXECUTOR queued list (continued):");
            }
        }
        xzb.j("Bugle", sb.toString());
    }
}
