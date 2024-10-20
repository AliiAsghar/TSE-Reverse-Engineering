package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alle<E> extends allj<E> implements Serializable {
    private static final long serialVersionUID = 0;
    transient alsp a = g();
    transient long b;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        this.a = g();
        for (int i = 0; i < readInt; i++) {
            a(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(j().size());
        for (alsk alskVar : j()) {
            objectOutputStream.writeObject(alskVar.a);
            objectOutputStream.writeInt(alskVar.a());
        }
    }

    @Override // defpackage.allj, defpackage.alsj
    public final int a(Object obj, int i) {
        boolean z;
        if (i == 0) {
            return b(obj);
        }
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        albo.L(z, "occurrences cannot be negative: %s", i);
        int d = this.a.d(obj);
        long j = i;
        if (d == -1) {
            this.a.o(obj, i);
            this.b += j;
            return 0;
        }
        int c = this.a.c(d);
        long j2 = c + j;
        if (j2 > 2147483647L) {
            z2 = false;
        }
        albo.M(z2, "too many occurrences: %s", j2);
        this.a.m(d, (int) j2);
        this.b += j;
        return c;
    }

    @Override // defpackage.alsj
    public final int b(Object obj) {
        return this.a.b(obj);
    }

    @Override // defpackage.allj
    public final int c() {
        return this.a.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        alsp alspVar = this.a;
        alspVar.d++;
        Arrays.fill(alspVar.a, 0, alspVar.c, (Object) null);
        Arrays.fill(alspVar.b, 0, alspVar.c, 0);
        Arrays.fill(alspVar.e, -1);
        Arrays.fill(alspVar.f, -1L);
        alspVar.c = 0;
        this.b = 0L;
    }

    @Override // defpackage.allj, defpackage.alsj
    public final int d(Object obj, int i) {
        albo.L(true, "occurrences cannot be negative: %s", i);
        int d = this.a.d(obj);
        if (d == -1) {
            return 0;
        }
        int c = this.a.c(d);
        if (c > i) {
            this.a.m(d, c - i);
        } else {
            this.a.g(d);
            i = c;
        }
        this.b -= i;
        return c;
    }

    @Override // defpackage.allj
    public final Iterator e() {
        return new allb(this);
    }

    @Override // defpackage.allj
    public final Iterator f() {
        return new allc(this);
    }

    public abstract alsp g();

    @Override // defpackage.allj, defpackage.alsj
    public final boolean h(Object obj, int i) {
        albo.x(i, "oldCount");
        albo.x(0, "newCount");
        int d = this.a.d(obj);
        if (d == -1) {
            if (i != 0) {
                return false;
            }
            return true;
        }
        if (this.a.c(d) != i) {
            return false;
        }
        this.a.g(d);
        this.b -= i;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new alsn(this, j().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.alsj
    public final int size() {
        return albo.cu(this.b);
    }
}
