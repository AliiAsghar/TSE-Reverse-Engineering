package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alpb extends aluq {
    final Iterator a;
    Iterator b = alqp.a;
    final /* synthetic */ alpg c;

    public alpb(alpg alpgVar) {
        this.c = alpgVar;
        this.a = alpgVar.map.values().listIterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.b.hasNext() && !this.a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = ((alnu) this.a.next()).listIterator();
        }
        return this.b.next();
    }
}
