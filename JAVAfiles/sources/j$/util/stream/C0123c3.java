package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.c3 */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0123c3 implements Stream {
    public final /* synthetic */ java.util.stream.Stream a;

    private /* synthetic */ C0123c3(java.util.stream.Stream stream) {
        this.a = stream;
    }

    public static /* synthetic */ Stream i(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new C0123c3(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream A(C0179o c0179o) {
        java.util.stream.IntStream flatMapToInt;
        flatMapToInt = this.a.flatMapToInt(AbstractC0219w0.Q(c0179o));
        return IntStream.VivifiedWrapper.convert(flatMapToInt);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        boolean allMatch;
        allMatch = this.a.allMatch(predicate);
        return allMatch;
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        boolean anyMatch;
        anyMatch = this.a.anyMatch(predicate);
        return anyMatch;
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Collector collector) {
        Object collect;
        collect = this.a.collect(C0154j.a(collector));
        return collect;
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        long count;
        count = this.a.count();
        return count;
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        java.util.stream.Stream distinct;
        distinct = this.a.distinct();
        return i(distinct);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        java.util.stream.Stream dropWhile;
        dropWhile = this.a.dropWhile(predicate);
        return i(dropWhile);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream stream = this.a;
        if (obj instanceof C0123c3) {
            obj = ((C0123c3) obj).a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        java.util.stream.Stream filter;
        filter = this.a.filter(predicate);
        return i(filter);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        java.util.Optional findAny;
        findAny = this.a.findAny();
        return j$.util.Q.h(findAny);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        java.util.Optional findFirst;
        findFirst = this.a.findFirst();
        return j$.util.Q.h(findFirst);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream flatMap(Function function) {
        java.util.stream.Stream flatMap;
        flatMap = this.a.flatMap(AbstractC0219w0.Q(function));
        return i(flatMap);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        boolean isParallel;
        isParallel = this.a.isParallel();
        return isParallel;
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    /* renamed from: iterator */
    public final /* synthetic */ Iterator iterator2() {
        Iterator it;
        it = this.a.iterator();
        return it;
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j) {
        java.util.stream.Stream limit;
        limit = this.a.limit(j);
        return i(limit);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        java.util.stream.Stream map;
        map = this.a.map(function);
        return i(map);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        java.util.stream.DoubleStream mapToDouble;
        mapToDouble = this.a.mapToDouble(toDoubleFunction);
        return D.i(mapToDouble);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        java.util.stream.IntStream mapToInt;
        mapToInt = this.a.mapToInt(toIntFunction);
        return IntStream.VivifiedWrapper.convert(mapToInt);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
        java.util.stream.LongStream mapToLong;
        mapToLong = this.a.mapToLong(toLongFunction);
        return C0180o0.i(mapToLong);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        java.util.Optional max;
        max = this.a.max(comparator);
        return j$.util.Q.h(max);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        java.util.Optional min;
        min = this.a.min(comparator);
        return j$.util.Q.h(min);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        boolean noneMatch;
        noneMatch = this.a.noneMatch(predicate);
        return noneMatch;
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        java.util.stream.BaseStream onClose;
        onClose = this.a.onClose(runnable);
        return C0139g.i(onClose);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* synthetic */ BaseStream parallel() {
        java.util.stream.BaseStream parallel;
        parallel = this.a.parallel();
        return C0139g.i(parallel);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        java.util.stream.Stream peek;
        peek = this.a.peek(consumer);
        return i(peek);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        java.util.Optional reduce;
        reduce = this.a.reduce(binaryOperator);
        return j$.util.Q.h(reduce);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* synthetic */ BaseStream sequential() {
        java.util.stream.BaseStream sequential;
        sequential = this.a.sequential();
        return C0139g.i(sequential);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j) {
        java.util.stream.Stream skip;
        skip = this.a.skip(j);
        return i(skip);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        java.util.stream.Stream sorted;
        sorted = this.a.sorted();
        return i(sorted);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        java.util.Spliterator spliterator;
        spliterator = this.a.spliterator();
        return j$.util.g0.a(spliterator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        java.util.stream.Stream takeWhile;
        takeWhile = this.a.takeWhile(predicate);
        return i(takeWhile);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        Object[] array;
        array = this.a.toArray();
        return array;
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ LongStream u(C0179o c0179o) {
        java.util.stream.LongStream flatMapToLong;
        flatMapToLong = this.a.flatMapToLong(AbstractC0219w0.Q(c0179o));
        return C0180o0.i(flatMapToLong);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        java.util.stream.BaseStream unordered;
        unordered = this.a.unordered();
        return C0139g.i(unordered);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ DoubleStream y(C0179o c0179o) {
        java.util.stream.DoubleStream flatMapToDouble;
        flatMapToDouble = this.a.flatMapToDouble(AbstractC0219w0.Q(c0179o));
        return D.i(flatMapToDouble);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Object collect;
        collect = this.a.collect(supplier, biConsumer, biConsumer2);
        return collect;
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Object reduce;
        reduce = this.a.reduce(obj, biFunction, binaryOperator);
        return reduce;
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        java.util.stream.Stream sorted;
        sorted = this.a.sorted(comparator);
        return i(sorted);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = this.a.toArray(intFunction);
        return array;
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        Object reduce;
        reduce = this.a.reduce(obj, binaryOperator);
        return reduce;
    }
}
