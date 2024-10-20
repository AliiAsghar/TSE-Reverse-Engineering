package defpackage;

import java.io.Closeable;
import java.nio.channels.FileLock;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aivj implements Closeable {
    public Object a;
    private final /* synthetic */ int b;

    public aivj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    Object obj = this.a;
                    if (obj != null) {
                        ((Semaphore) obj).release();
                        this.a = null;
                        return;
                    }
                    return;
                }
                Object obj2 = this.a;
                if (obj2 != null) {
                    ((Semaphore) obj2).release();
                    this.a = null;
                    return;
                }
                return;
            }
            ?? r0 = this.a;
            if (r0 != 0) {
                this.a = null;
                r0.unlock();
                return;
            }
            return;
        }
        Object obj3 = this.a;
        if (obj3 != null) {
            ((FileLock) obj3).release();
            this.a = null;
        }
    }

    public aivj(Semaphore semaphore, int i, byte[] bArr) {
        this.b = i;
        this.a = semaphore;
    }

    public aivj(Lock lock, int i) {
        this.b = i;
        if (lock.tryLock()) {
            this.a = lock;
        }
    }
}
