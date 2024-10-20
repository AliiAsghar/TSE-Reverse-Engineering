package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alow extends aluq {
    final aluq a;
    final /* synthetic */ aloz b;

    public alow(aloz alozVar) {
        this.b = alozVar;
        this.a = alozVar.a.entrySet().listIterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.a.next()).getValue();
    }
}
