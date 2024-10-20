package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ardz extends WeakReference {
    public static final /* synthetic */ int b = 0;
    private static final boolean c = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException d;
    public final AtomicBoolean a;
    private final ReferenceQueue e;
    private final ConcurrentMap f;
    private final String g;
    private final Reference h;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        d = runtimeException;
    }

    public ardz(area areaVar, aquc aqucVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(areaVar, referenceQueue);
        RuntimeException runtimeException;
        this.a = new AtomicBoolean();
        if (c) {
            runtimeException = new RuntimeException("ManagedChannel allocation site");
        } else {
            runtimeException = d;
        }
        this.h = new SoftReference(runtimeException);
        this.g = aqucVar.toString();
        this.e = referenceQueue;
        this.f = concurrentMap;
        concurrentMap.put(this, this);
        a(referenceQueue);
    }

    static void a(ReferenceQueue referenceQueue) {
        while (true) {
            ardz ardzVar = (ardz) referenceQueue.poll();
            if (ardzVar != null) {
                RuntimeException runtimeException = (RuntimeException) ardzVar.h.get();
                ardzVar.b();
                if (!ardzVar.a.get()) {
                    Level level = Level.SEVERE;
                    if (area.b.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                        logRecord.setLoggerName(area.b.getName());
                        logRecord.setParameters(new Object[]{ardzVar.g});
                        logRecord.setThrown(runtimeException);
                        area.b.log(logRecord);
                    }
                }
            } else {
                return;
            }
        }
    }

    private final void b() {
        super.clear();
        this.f.remove(this);
        this.h.clear();
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        b();
        a(this.e);
    }
}
