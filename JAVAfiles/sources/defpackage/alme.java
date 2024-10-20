package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alme implements Iterator {
    int a;
    int b;
    int c = -1;
    final /* synthetic */ almf d;

    public alme(almf almfVar) {
        this.d = almfVar;
        this.a = almfVar.b;
        this.b = almfVar.a();
    }

    private final void a() {
        if (this.d.b == this.a) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (hasNext()) {
            int i = this.b;
            this.c = i;
            Object c = this.d.c(i);
            this.b = this.d.b(this.b);
            return c;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        a();
        if (this.c >= 0) {
            z = true;
        } else {
            z = false;
        }
        albo.w(z);
        this.a += 32;
        int i = this.c;
        almf almfVar = this.d;
        almfVar.remove(almfVar.c(i));
        this.b--;
        this.c = -1;
    }
}
