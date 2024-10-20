package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class duz implements Iterator {
    final dva a;
    int b = 0;

    public duz(dva dvaVar) {
        this.a = dvaVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.a.d()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dux duxVar = (dux) this.a.a.get(this.b);
        this.b++;
        return duxVar;
    }
}
