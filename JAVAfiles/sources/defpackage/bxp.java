package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bxp implements Iterator, arse {
    private final cab a;
    private final int b;
    private int c;
    private final int d;

    public bxp(cab cabVar, int i, int i2) {
        this.a = cabVar;
        this.b = i2;
        this.c = i;
        this.d = cabVar.g;
        if (cabVar.f) {
            cad.l();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < this.b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.a.g != this.d) {
            cad.l();
        }
        int i = this.c;
        this.c = cad.c(this.a.a, i) + i;
        return new cac(this.a, i, this.d);
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.g();
    }
}
