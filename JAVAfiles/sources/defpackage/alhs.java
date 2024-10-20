package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alhs<T> implements Serializable, alhr {
    private static final long serialVersionUID = 0;
    final alhr a;
    final long b;
    volatile transient Object c;
    volatile transient long d;
    private transient arre e = new arre();

    public alhs(alhr alhrVar, long j) {
        this.a = alhrVar;
        this.b = j;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.e = new arre();
    }

    @Override // defpackage.alhr
    public final T get() {
        long j = this.d;
        long nanoTime = System.nanoTime();
        if (j == 0 || nanoTime - j >= 0) {
            synchronized (this.e) {
                if (j == this.d) {
                    T t = (T) this.a.get();
                    this.c = t;
                    long j2 = nanoTime + this.b;
                    if (j2 == 0) {
                        j2 = 1;
                    }
                    this.d = j2;
                    return t;
                }
            }
        }
        return (T) this.c;
    }

    public final String toString() {
        return "Suppliers.memoizeWithExpiration(" + this.a.toString() + ", " + this.b + ", NANOS)";
    }
}
