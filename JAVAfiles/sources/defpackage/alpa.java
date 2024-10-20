package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alpa extends aluq {
    final Iterator a;
    Object b = null;
    Iterator c = alqp.a;
    final /* synthetic */ alpg d;

    public alpa(alpg alpgVar) {
        this.d = alpgVar;
        this.a = alpgVar.map.entrySet().listIterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.c.hasNext() && !this.a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((alnu) entry.getValue()).listIterator();
        }
        Object obj = this.b;
        obj.getClass();
        return new alnv(obj, this.c.next());
    }
}
