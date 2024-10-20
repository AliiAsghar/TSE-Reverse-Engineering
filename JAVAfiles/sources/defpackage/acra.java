package defpackage;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acra implements ThreadFactory {
    private final /* synthetic */ int a;

    public acra(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(runnable, "ImsContactsDatabaseSyncer");
            case 1:
                return new ebw(runnable);
            case 2:
                return new Thread(new adhp(runnable, 10));
            case 3:
                return new Thread(runnable, "PrivateDataStorageThread");
            case 4:
                runnable.getClass();
                return new Thread(new aefw(runnable, 3));
            case 5:
                return new Thread(runnable);
            case 6:
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
            case 7:
                Thread thread = new Thread(runnable, String.format(Locale.US, "DnsClientWorker[%d]", Integer.valueOf(new AtomicInteger(0).getAndIncrement())));
                thread.setUncaughtExceptionHandler(new arfo(1));
                return thread;
            default:
                return new Thread(runnable, "ObservableStateMachineNotifierThread");
        }
    }
}
