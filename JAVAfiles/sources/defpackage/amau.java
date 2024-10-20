package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amau implements Iterable {
    final /* synthetic */ alpt a;
    final /* synthetic */ amaw b;

    public amau(amaw amawVar, alpt alptVar) {
        this.a = alptVar;
        this.b = amawVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ahlp ahlpVar = new ahlp(this.b.b);
        aluq listIterator = this.a.listIterator();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        arrayDeque2.add(listIterator);
        return new amav(ahlpVar, arrayDeque2, arrayDeque);
    }
}
