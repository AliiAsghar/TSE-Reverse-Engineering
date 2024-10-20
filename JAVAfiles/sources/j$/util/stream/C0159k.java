package j$.util.stream;

import j$.util.C0243y;
import j$.util.Map;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0159k implements BinaryOperator, Function, ToLongFunction, Supplier, BiConsumer, ObjDoubleConsumer, LongFunction, IntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ C0159k(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 11:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                return;
            case 12:
            default:
                ((Collection) obj).add(obj2);
                return;
            case 13:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.a(dArr3, dArr4[0]);
                Collectors.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                return;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 11:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 12:
            default:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            case 13:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 19:
                return AbstractC0219w0.J(j);
            case 20:
            default:
                return AbstractC0219w0.S(j);
            case 21:
                return AbstractC0219w0.R(j);
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        Set set = Collectors.a;
        return 1L;
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
            default:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 8:
                Set set = Collectors.a;
                return new long[1];
            case 15:
                return new Object();
            case 16:
                return new Object();
            case 17:
                return new Object();
            case 18:
                return new Object();
            case 27:
                return new C0243y();
            default:
                return new ArrayList();
        }
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 0:
                return BiFunction$CC.$default$andThen(this, function);
            case 1:
                return BiFunction$CC.$default$andThen(this, function);
            case 2:
                return BiFunction$CC.$default$andThen(this, function);
            case 4:
                return BiFunction$CC.$default$andThen(this, function);
            case 6:
                return BiFunction$CC.$default$andThen(this, function);
            case 9:
                return BiFunction$CC.$default$andThen(this, function);
            case 20:
                return BiFunction$CC.$default$andThen(this, function);
            case 22:
                return BiFunction$CC.$default$andThen(this, function);
            case 24:
                return BiFunction$CC.$default$andThen(this, function);
            default:
                return BiFunction$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                Set set = Collectors.a;
                return j$.desugar.sun.nio.fs.g.b(((List) obj).toArray());
            case 4:
            default:
                Set set2 = Collectors.a;
                return Long.valueOf(((long[]) obj)[0]);
            case 5:
                Set set3 = Collectors.a;
                return obj;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                Set set = Collectors.a;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    value.getClass();
                    Object putIfAbsent = Map.EL.putIfAbsent(map, key, value);
                    if (putIfAbsent != null) {
                        throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", key, putIfAbsent, value));
                    }
                }
                return map;
            case 1:
                Collection collection = (Collection) obj;
                Set set2 = Collectors.a;
                collection.addAll((Collection) obj2);
                return collection;
            case 2:
                List list = (List) obj;
                Set set3 = Collectors.a;
                list.addAll((List) obj2);
                return list;
            case 4:
                List list2 = (List) obj;
                Set set4 = Collectors.a;
                list2.addAll((List) obj2);
                return list2;
            case 6:
                Set set5 = (Set) obj;
                Set set6 = (Set) obj2;
                Set set7 = Collectors.a;
                if (set5.size() < set6.size()) {
                    set6.addAll(set5);
                    return set6;
                }
                set5.addAll(set6);
                return set5;
            case 9:
                long[] jArr = (long[]) obj;
                Set set8 = Collectors.a;
                jArr[0] = jArr[0] + ((long[]) obj2)[0];
                return jArr;
            case 20:
                return new K0((C0) obj, (C0) obj2);
            case 22:
                return new K0((E0) obj, (E0) obj2);
            case 24:
                return new K0((G0) obj, (G0) obj2);
            default:
                return new K0((I0) obj, (I0) obj2);
        }
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        double[] dArr = (double[]) obj;
        switch (this.a) {
            case 12:
                dArr[2] = dArr[2] + 1.0d;
                Collectors.a(dArr, d);
                dArr[3] = dArr[3] + d;
                return;
            default:
                Collectors.a(dArr, d);
                dArr[2] = dArr[2] + d;
                return;
        }
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo416andThen(Function function) {
        switch (this.a) {
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
            default:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
        }
    }
}
