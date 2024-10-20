package defpackage;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class altz extends Spliterators.AbstractSpliterator {
    final /* synthetic */ Iterator a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ BiFunction c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public altz(long j, int i, Iterator it, Iterator it2, BiFunction biFunction) {
        super(j, i);
        this.a = it;
        this.b = it2;
        this.c = biFunction;
    }

    @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Spliterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object apply;
        if (this.a.hasNext() && this.b.hasNext()) {
            apply = this.c.apply(this.a.next(), this.b.next());
            consumer.accept(apply);
            return true;
        }
        return false;
    }
}
