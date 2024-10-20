package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alph extends aluq {
    int a;
    Object b;
    final /* synthetic */ Iterator c;

    public alph(Iterator it) {
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a <= 0 && !this.c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i <= 0) {
            alsk alskVar = (alsk) this.c.next();
            this.b = alskVar.a;
            i = alskVar.a();
        }
        this.a = i - 1;
        Object obj = this.b;
        obj.getClass();
        return obj;
    }
}
