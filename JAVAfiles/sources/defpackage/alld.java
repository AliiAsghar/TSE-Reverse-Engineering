package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alld implements Iterator {
    int b;
    int c = -1;
    int d;
    final /* synthetic */ alle e;

    public alld(alle alleVar) {
        this.e = alleVar;
        this.b = alleVar.a.a();
        this.d = alleVar.a.d;
    }

    private final void b() {
        if (this.e.a.d == this.d) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        if (this.b >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object a = a(this.b);
            int i = this.b;
            this.c = i;
            this.b = this.e.a.e(i);
            return a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        b();
        if (this.c != -1) {
            z = true;
        } else {
            z = false;
        }
        albo.w(z);
        this.e.b -= r0.a.g(this.c);
        this.b--;
        this.c = -1;
        this.d = this.e.a.d;
    }
}
