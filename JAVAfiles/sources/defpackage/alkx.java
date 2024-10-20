package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alkx extends alkv implements ListIterator {
    final /* synthetic */ alky d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alkx(alky alkyVar) {
        super(alkyVar);
        this.d = alkyVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.d.isEmpty();
        b().add(obj);
        alky alkyVar = this.d;
        alkyVar.f.b++;
        if (isEmpty) {
            alkyVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alkx(alky alkyVar, int i) {
        super(alkyVar, alkyVar.d().listIterator(i));
        this.d = alkyVar;
    }
}
