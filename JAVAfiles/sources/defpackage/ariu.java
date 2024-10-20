package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ariu implements arhk {
    private final /* synthetic */ int a;

    public ariu(int i) {
        this.a = i;
    }

    @Override // defpackage.arhk
    public final /* synthetic */ Object a() {
        if (this.a != 0) {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, arcb.k("grpc-timer-%d"));
            try {
                newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, true);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
            return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }
        return Executors.newCachedThreadPool(arcb.k("grpc-okhttp-%d"));
    }

    @Override // defpackage.arhk
    public final /* synthetic */ void b(Object obj) {
        if (this.a != 0) {
            ((ScheduledExecutorService) obj).shutdown();
        } else {
            ((ExecutorService) obj).shutdown();
        }
    }
}
