package j$.util.stream;

import j$.util.C0243y;
import j$.util.C0244z;
import j$.util.Optional;
import j$.util.OptionalDouble;
import j$.util.OptionalInt;
import j$.util.OptionalLong;
import j$.util.StringJoiner;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/* renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0169m implements BiConsumer, Supplier, BinaryOperator, Function, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction, ToDoubleFunction, IntFunction, Predicate, ToIntFunction, IntBinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0169m(int i) {
        this.a = i;
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        ((C0243y) obj).accept(d);
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 21:
                return Predicate$CC.$default$and(this, predicate);
            case 22:
                return Predicate$CC.$default$and(this, predicate);
            case 23:
                return Predicate$CC.$default$and(this, predicate);
            default:
                return Predicate$CC.$default$and(this, predicate);
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 0:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 3:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 5:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 10:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 11:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            default:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        switch (this.a) {
            case 12:
                return Math.min(d, d2);
            default:
                return Math.max(d, d2);
        }
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i, int i2) {
        return Math.min(i, i2);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 1:
                return new C0244z();
            case 2:
                return new HashSet();
            case 4:
                return new j$.util.B();
            case 8:
                return new HashMap();
            case 9:
                return new LinkedHashSet();
            case 13:
                return new double[4];
            default:
                return new double[3];
        }
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public /* synthetic */ Predicate mo407negate() {
        switch (this.a) {
            case 21:
                return Predicate$CC.$default$negate(this);
            case 22:
                return Predicate$CC.$default$negate(this);
            case 23:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 21:
                return Predicate$CC.$default$or(this, predicate);
            case 22:
                return Predicate$CC.$default$or(this, predicate);
            case 23:
                return Predicate$CC.$default$or(this, predicate);
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 21:
                return ((OptionalDouble) obj).isPresent();
            case 22:
                return ((OptionalInt) obj).isPresent();
            case 23:
                return ((OptionalLong) obj).isPresent();
            default:
                return ((Optional) obj).isPresent();
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((List) obj).add(obj2);
                return;
            case 3:
                ((Set) obj).add(obj2);
                return;
            case 5:
                ((StringJoiner) obj).add((CharSequence) obj2);
                return;
            case 10:
                ((LinkedHashSet) obj).add(obj2);
                return;
            case 11:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                return;
            default:
                ((C0243y) obj).b((C0243y) obj2);
                return;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 18:
                return new Double[i];
            case 25:
                return new Object[i];
            case 26:
                return new Integer[i];
            default:
                return Integer.valueOf(i);
        }
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        return ((StringJoiner) obj).toString();
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((StringJoiner) obj).c((StringJoiner) obj2);
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }
}
