package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Z2 extends Spliterators.AbstractSpliterator {
    Object d;
    boolean e;
    boolean f;
    final /* synthetic */ UnaryOperator g;
    final /* synthetic */ Object h;
    final /* synthetic */ Predicate i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z2(Object obj, Predicate predicate, UnaryOperator unaryOperator) {
        super(Long.MAX_VALUE, 1040);
        this.g = unaryOperator;
        this.h = obj;
        this.i = predicate;
    }

    @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Object obj;
        consumer.getClass();
        if (this.f) {
            return;
        }
        this.f = true;
        boolean z = this.e;
        UnaryOperator unaryOperator = this.g;
        if (z) {
            obj = unaryOperator.apply(this.d);
        } else {
            obj = this.h;
        }
        this.d = null;
        while (this.i.test(obj)) {
            consumer.accept(obj);
            obj = unaryOperator.apply(obj);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        consumer.getClass();
        if (this.f) {
            return false;
        }
        if (this.e) {
            obj = this.g.apply(this.d);
        } else {
            this.e = true;
            obj = this.h;
        }
        if (!this.i.test(obj)) {
            this.d = null;
            this.f = true;
            return false;
        }
        this.d = obj;
        consumer.accept(obj);
        return true;
    }
}
