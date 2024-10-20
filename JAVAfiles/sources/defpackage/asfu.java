package defpackage;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asfu extends aser {
    public static final asfu a = new asfu();
    private static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private static final WeakHashMap c = new WeakHashMap();

    private asfu() {
    }

    @Override // defpackage.aser
    public final arqr a(Class cls) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            arqr arqrVar = (arqr) c.get(cls);
            if (arqrVar == null) {
                ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                int i2 = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i = reentrantReadWriteLock.getReadHoldCount();
                } else {
                    i = 0;
                }
                for (int i3 = 0; i3 < i; i3++) {
                    readLock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    WeakHashMap weakHashMap = c;
                    arqr arqrVar2 = (arqr) weakHashMap.get(cls);
                    if (arqrVar2 != null) {
                        return arqrVar2;
                    }
                    arqr b2 = asew.b(cls);
                    weakHashMap.put(cls, b2);
                    while (i2 < i) {
                        readLock2.lock();
                        i2++;
                    }
                    writeLock.unlock();
                    return b2;
                } finally {
                    while (i2 < i) {
                        readLock2.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            }
            return arqrVar;
        } finally {
            readLock.unlock();
        }
    }
}
