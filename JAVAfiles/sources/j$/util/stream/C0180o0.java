package j$.util.stream;

import j$.util.OptionalDouble;
import j$.util.OptionalLong;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.o0 */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0180o0 implements LongStream {
    public final /* synthetic */ java.util.stream.LongStream a;

    private /* synthetic */ C0180o0(java.util.stream.LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ LongStream i(java.util.stream.LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C0185p0 ? ((C0185p0) longStream).a : new C0180o0(longStream);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream a() {
        java.util.stream.LongStream takeWhile;
        takeWhile = this.a.takeWhile(null);
        return i(takeWhile);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ DoubleStream asDoubleStream() {
        java.util.stream.DoubleStream asDoubleStream;
        asDoubleStream = this.a.asDoubleStream();
        return D.i(asDoubleStream);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ OptionalDouble average() {
        java.util.OptionalDouble average;
        average = this.a.average();
        return j$.util.Q.i(average);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream b() {
        java.util.stream.LongStream filter;
        filter = this.a.filter(null);
        return i(filter);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Stream boxed() {
        java.util.stream.Stream boxed;
        boxed = this.a.boxed();
        return C0123c3.i(boxed);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream c() {
        java.util.stream.LongStream dropWhile;
        dropWhile = this.a.dropWhile(null);
        return i(dropWhile);
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Object collect;
        collect = this.a.collect(supplier, objLongConsumer, biConsumer);
        return collect;
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long count() {
        long count;
        count = this.a.count();
        return count;
    }

    @Override // j$.util.stream.LongStream
    public final LongStream d(C0109a c0109a) {
        java.util.stream.LongStream flatMap;
        java.util.stream.LongStream longStream = this.a;
        C0109a c0109a2 = new C0109a(14);
        c0109a2.b = c0109a;
        flatMap = longStream.flatMap(c0109a2);
        return i(flatMap);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream distinct() {
        java.util.stream.LongStream distinct;
        distinct = this.a.distinct();
        return i(distinct);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.LongStream longStream = this.a;
        if (obj instanceof C0180o0) {
            obj = ((C0180o0) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean f() {
        boolean noneMatch;
        noneMatch = this.a.noneMatch(null);
        return noneMatch;
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ OptionalLong findAny() {
        java.util.OptionalLong findAny;
        findAny = this.a.findAny();
        return j$.util.Q.k(findAny);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ OptionalLong findFirst() {
        java.util.OptionalLong findFirst;
        findFirst = this.a.findFirst();
        return j$.util.Q.k(findFirst);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
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

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    /* renamed from: iterator */
    public final /* synthetic */ Iterator<Long> iterator2() {
        PrimitiveIterator.OfLong it;
        it = this.a.iterator();
        return j$.util.M.a(it);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ DoubleStream j() {
        java.util.stream.DoubleStream mapToDouble;
        mapToDouble = this.a.mapToDouble(null);
        return D.i(mapToDouble);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream l() {
        java.util.stream.LongStream map;
        map = this.a.map(null);
        return i(map);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream limit(long j) {
        java.util.stream.LongStream limit;
        limit = this.a.limit(j);
        return i(limit);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        java.util.stream.Stream mapToObj;
        mapToObj = this.a.mapToObj(longFunction);
        return C0123c3.i(mapToObj);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ OptionalLong max() {
        java.util.OptionalLong max;
        max = this.a.max();
        return j$.util.Q.k(max);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ OptionalLong min() {
        java.util.OptionalLong min;
        min = this.a.min();
        return j$.util.Q.k(min);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [j$.util.stream.BaseStream, j$.util.stream.LongStream] */
    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ LongStream onClose(Runnable runnable) {
        java.util.stream.BaseStream onClose;
        onClose = this.a.onClose(runnable);
        return C0139g.i(onClose);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean p() {
        boolean anyMatch;
        anyMatch = this.a.anyMatch(null);
        return anyMatch;
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* synthetic */ BaseStream parallel() {
        java.util.stream.BaseStream parallel;
        parallel = this.a.parallel();
        return C0139g.i(parallel);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream peek(LongConsumer longConsumer) {
        java.util.stream.LongStream peek;
        peek = this.a.peek(longConsumer);
        return i(peek);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        long reduce;
        reduce = this.a.reduce(j, longBinaryOperator);
        return reduce;
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* synthetic */ BaseStream sequential() {
        java.util.stream.BaseStream sequential;
        sequential = this.a.sequential();
        return C0139g.i(sequential);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream skip(long j) {
        java.util.stream.LongStream skip;
        skip = this.a.skip(j);
        return i(skip);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream sorted() {
        java.util.stream.LongStream sorted;
        sorted = this.a.sorted();
        return i(sorted);
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Long> spliterator() {
        Spliterator.OfLong spliterator;
        spliterator = this.a.spliterator();
        return j$.util.a0.a(spliterator);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long sum() {
        long sum;
        sum = this.a.sum();
        return sum;
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.B summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean t() {
        boolean allMatch;
        allMatch = this.a.allMatch(null);
        return allMatch;
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        long[] array;
        array = this.a.toArray();
        return array;
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        java.util.stream.BaseStream unordered;
        unordered = this.a.unordered();
        return C0139g.i(unordered);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ IntStream w() {
        java.util.stream.IntStream mapToInt;
        mapToInt = this.a.mapToInt(null);
        return IntStream.VivifiedWrapper.convert(mapToInt);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    /* renamed from: iterator */
    public final /* synthetic */ Iterator<Long> iterator2() {
        Iterator<Long> it;
        it = this.a.iterator();
        return it;
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* synthetic */ LongStream parallel() {
        java.util.stream.LongStream parallel;
        parallel = this.a.parallel();
        return i(parallel);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        java.util.OptionalLong reduce;
        reduce = this.a.reduce(longBinaryOperator);
        return j$.util.Q.k(reduce);
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* synthetic */ LongStream sequential() {
        java.util.stream.LongStream sequential;
        sequential = this.a.sequential();
        return i(sequential);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.Spliterator<Long> spliterator() {
        java.util.Spliterator spliterator;
        spliterator = this.a.spliterator();
        return j$.util.g0.a(spliterator);
    }
}
