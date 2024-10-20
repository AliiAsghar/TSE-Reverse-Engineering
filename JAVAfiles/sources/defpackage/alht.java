package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alht<T> implements Serializable, alhr {
    private static final long serialVersionUID = 0;
    final alhr a;
    volatile transient boolean b;
    transient Object c;
    private transient arre d = new arre();

    public alht(alhr alhrVar) {
        alhrVar.getClass();
        this.a = alhrVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.d = new arre();
    }

    @Override // defpackage.alhr
    public final T get() {
        if (!this.b) {
            synchronized (this.d) {
                if (!this.b) {
                    T t = (T) this.a.get();
                    this.c = t;
                    this.b = true;
                    return t;
                }
            }
        }
        return (T) this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            obj = "<supplier that returned " + String.valueOf(this.c) + ">";
        } else {
            obj = this.a;
        }
        return a.bX(obj, "Suppliers.memoize(", ")");
    }
}
