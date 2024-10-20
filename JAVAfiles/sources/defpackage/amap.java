package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class amap extends aluq {
    final /* synthetic */ Iterator a;
    final /* synthetic */ amaq b;

    public amap(amaq amaqVar, Iterator it) {
        this.a = it;
        this.b = amaqVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        this.b.a.b = entry;
        return entry.getKey();
    }
}
