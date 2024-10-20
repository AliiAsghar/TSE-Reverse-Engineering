package defpackage;

import android.os.Looper;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class euk implements ThreadFactory {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ euk(int i) {
        this.b = i;
        this.a = "emojiCompat";
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return new Thread(runnable, (String) this.a);
                        }
                        Thread newThread = this.a.newThread(runnable);
                        if (newThread.getContextClassLoader() == null) {
                            newThread.setContextClassLoader(Looper.getMainLooper().getThread().getContextClassLoader());
                        }
                        return newThread;
                    }
                    return this.a.newThread(new aefw(runnable, 12));
                }
                return new Thread(runnable, (String) this.a);
            }
            Thread thread = new Thread(runnable, (String) this.a);
            thread.setPriority(10);
            return thread;
        }
        return new Thread(runnable, (String) this.a);
    }

    public /* synthetic */ euk(int i, byte[] bArr) {
        this.b = i;
        this.a = "SetupCompatServiceInvoker";
    }

    public /* synthetic */ euk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
