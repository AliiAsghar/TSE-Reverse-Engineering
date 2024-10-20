package defpackage;

import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingService;
import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingServiceAndroidV;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uii implements RejectedExecutionHandler {
    private final /* synthetic */ int a;

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/PrimesExecutorsModule$DefaultRejectedExecutionHandler", "rejectedExecution", 76, "PrimesExecutorsModule.java")).t("Service rejected execution of %s", runnable);
                return;
            } else {
                ResizingService.a.decrementAndGet();
                return;
            }
        }
        ResizingServiceAndroidV.a.decrementAndGet();
    }
}
