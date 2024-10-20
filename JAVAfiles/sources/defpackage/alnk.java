package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alnk implements Iterator {
    final /* synthetic */ alnl a;
    private int b;
    private int c;
    private int d;
    private int e;

    public alnk(alnl alnlVar) {
        this.a = alnlVar;
        alnm alnmVar = alnlVar.b;
        this.b = alnmVar.e;
        this.c = -1;
        this.d = alnmVar.d;
        this.e = alnmVar.c;
    }

    private final void a() {
        if (this.a.b.d == this.d) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        if (this.b != -2 && this.e > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object a = this.a.a(this.b);
            int i = this.b;
            this.c = i;
            this.b = this.a.b.f[i];
            this.e--;
            return a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        a();
        if (this.c != -1) {
            z = true;
        } else {
            z = false;
        }
        albo.w(z);
        alnm alnmVar = this.a.b;
        int i = this.c;
        alnmVar.h(i, alzz.bg(alnmVar.a[i]));
        int i2 = this.b;
        alnm alnmVar2 = this.a.b;
        if (i2 == alnmVar2.c) {
            this.b = this.c;
        }
        this.c = -1;
        this.d = alnmVar2.d;
    }
}
