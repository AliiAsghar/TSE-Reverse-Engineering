package defpackage;

import j$.util.Collection;
import j$.util.function.BiPredicate$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.util.Collection;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class amdg implements AutoCloseable {
    private final Stream a;
    public final Function b;
    public final Function c;

    public amdg() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static amdg b(Iterable iterable) {
        Stream stream;
        Function identity = Function$CC.identity();
        Function identity2 = Function$CC.identity();
        if (iterable instanceof Collection) {
            stream = Collection.EL.stream(iterable);
        } else {
            stream = StreamSupport.stream(new amdf(iterable.iterator()), false);
        }
        return new amdg(stream, identity, identity2);
    }

    public Stream a() {
        int i = mle.a;
        return this.a.map(new akyh(this, 19));
    }

    public final amdg c(final Predicate predicate) {
        Stream filter = a().filter(new agol(new BiPredicate() { // from class: amdd
            public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
                return BiPredicate$CC.$default$and(this, biPredicate);
            }

            public final /* synthetic */ BiPredicate negate() {
                return BiPredicate$CC.$default$negate(this);
            }

            public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
                return BiPredicate$CC.$default$or(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                boolean test;
                test = Predicate.this.test(obj);
                return test;
            }
        }, 15));
        return new amde(filter, new allr(5), new allr(6), filter);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final amdg d(Function function) {
        Function mo416andThen;
        mo416andThen = this.b.mo416andThen(function);
        return new amdg(this.a, mo416andThen, this.c);
    }

    public final amdg e(Function function) {
        Function mo416andThen;
        mo416andThen = this.c.mo416andThen(function);
        return new amdg(this.a, this.b, mo416andThen);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.function.BinaryOperator] */
    public final Object f(asqc asqcVar) {
        int i = 18;
        return this.a.collect(alls.b(new akyh(this.b, i), new akyh(this.c, i), asqcVar.a));
    }

    public amdg(Stream stream, Function function, Function function2) {
        stream.getClass();
        this.a = stream;
        function.getClass();
        this.b = function;
        function2.getClass();
        this.c = function2;
    }
}
