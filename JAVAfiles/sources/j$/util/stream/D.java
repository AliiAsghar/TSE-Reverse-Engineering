package j$.util.stream;

import j$.util.C0243y;
import j$.util.OptionalDouble;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
public final /* synthetic */ class D implements DoubleStream {
    public final /* synthetic */ java.util.stream.DoubleStream a;

    private /* synthetic */ D(java.util.stream.DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ DoubleStream i(java.util.stream.DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof E ? ((E) doubleStream).a : new D(doubleStream);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream a() {
        java.util.stream.DoubleStream takeWhile;
        takeWhile = this.a.takeWhile(null);
        return i(takeWhile);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble average() {
        java.util.OptionalDouble average;
        average = this.a.average();
        return j$.util.Q.i(average);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream b() {
        java.util.stream.DoubleStream filter;
        filter = this.a.filter(null);
        return i(filter);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ Stream boxed() {
        java.util.stream.Stream boxed;
        boxed = this.a.boxed();
        return C0123c3.i(boxed);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream c() {
        java.util.stream.DoubleStream dropWhile;
        dropWhile = this.a.dropWhile(null);
        return i(dropWhile);
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Object collect;
        collect = this.a.collect(supplier, objDoubleConsumer, biConsumer);
        return collect;
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ long count() {
        long count;
        count = this.a.count();
        return count;
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream d(C0109a c0109a) {
        java.util.stream.DoubleStream flatMap;
        java.util.stream.DoubleStream doubleStream = this.a;
        C0109a c0109a2 = new C0109a(13);
        c0109a2.b = c0109a;
        flatMap = doubleStream.flatMap(c0109a2);
        return i(flatMap);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream distinct() {
        java.util.stream.DoubleStream distinct;
        distinct = this.a.distinct();
        return i(distinct);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.DoubleStream doubleStream = this.a;
        if (obj instanceof D) {
            obj = ((D) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble findAny() {
        java.util.OptionalDouble findAny;
        findAny = this.a.findAny();
        return j$.util.Q.i(findAny);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble findFirst() {
        java.util.OptionalDouble findFirst;
        findFirst = this.a.findFirst();
        return j$.util.Q.i(findFirst);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ boolean g() {
        boolean allMatch;
        allMatch = this.a.allMatch(null);
        return allMatch;
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ LongStream h() {
        java.util.stream.LongStream mapToLong;
        mapToLong = this.a.mapToLong(null);
        return C0180o0.i(mapToLong);
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

    @Override // j$.util.stream.DoubleStream
    /* renamed from: iterator */
    public final /* synthetic */ Iterator<Double> iterator2() {
        PrimitiveIterator.OfDouble it;
        it = this.a.iterator();
        return j$.util.D.a(it);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream limit(long j) {
        java.util.stream.DoubleStream limit;
        limit = this.a.limit(j);
        return i(limit);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ boolean m() {
        boolean anyMatch;
        anyMatch = this.a.anyMatch(null);
        return anyMatch;
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        java.util.stream.DoubleStream map;
        map = this.a.map(doubleUnaryOperator);
        return i(map);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        java.util.stream.Stream mapToObj;
        mapToObj = this.a.mapToObj(doubleFunction);
        return C0123c3.i(mapToObj);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble max() {
        java.util.OptionalDouble max;
        max = this.a.max();
        return j$.util.Q.i(max);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble min() {
        java.util.OptionalDouble min;
        min = this.a.min();
        return j$.util.Q.i(min);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [j$.util.stream.DoubleStream, j$.util.stream.BaseStream] */
    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ DoubleStream onClose(Runnable runnable) {
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

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream peek(DoubleConsumer doubleConsumer) {
        java.util.stream.DoubleStream peek;
        peek = this.a.peek(doubleConsumer);
        return i(peek);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ IntStream q() {
        java.util.stream.IntStream mapToInt;
        mapToInt = this.a.mapToInt(null);
        return IntStream.VivifiedWrapper.convert(mapToInt);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        double reduce;
        reduce = this.a.reduce(d, doubleBinaryOperator);
        return reduce;
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* synthetic */ BaseStream sequential() {
        java.util.stream.BaseStream sequential;
        sequential = this.a.sequential();
        return C0139g.i(sequential);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream skip(long j) {
        java.util.stream.DoubleStream skip;
        skip = this.a.skip(j);
        return i(skip);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream sorted() {
        java.util.stream.DoubleStream sorted;
        sorted = this.a.sorted();
        return i(sorted);
    }

    @Override // j$.util.stream.DoubleStream, j$.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Double> spliterator() {
        Spliterator.OfDouble spliterator;
        spliterator = this.a.spliterator();
        return j$.util.T.a(spliterator);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ double sum() {
        double sum;
        sum = this.a.sum();
        return sum;
    }

    @Override // j$.util.stream.DoubleStream
    public final C0243y summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ double[] toArray() {
        double[] array;
        array = this.a.toArray();
        return array;
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        java.util.stream.BaseStream unordered;
        unordered = this.a.unordered();
        return C0139g.i(unordered);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ boolean x() {
        boolean noneMatch;
        noneMatch = this.a.noneMatch(null);
        return noneMatch;
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    /* renamed from: iterator */
    public final /* synthetic */ Iterator<Double> iterator2() {
        Iterator<Double> it;
        it = this.a.iterator();
        return it;
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream parallel() {
        java.util.stream.DoubleStream parallel;
        parallel = this.a.parallel();
        return i(parallel);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        java.util.OptionalDouble reduce;
        reduce = this.a.reduce(doubleBinaryOperator);
        return j$.util.Q.i(reduce);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream sequential() {
        java.util.stream.DoubleStream sequential;
        sequential = this.a.sequential();
        return i(sequential);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.Spliterator<Double> spliterator() {
        java.util.Spliterator spliterator;
        spliterator = this.a.spliterator();
        return j$.util.g0.a(spliterator);
    }
}
