package j$.util.stream;

import j$.util.C0096f;
import j$.util.Map;
import j$.util.Spliterator;
import j$.util.StringJoiner;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0109a implements Supplier, Function, BiConsumer, BinaryOperator, Consumer, BooleanSupplier, InterfaceC0182o2, DoubleFunction, LongFunction {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C0109a(int i) {
        this.a = i;
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 9:
                AbstractC0219w0.a();
                throw null;
            default:
                AbstractC0219w0.a();
                throw null;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object apply = ((DoubleFunction) this.b).apply(d);
        if (apply == null) {
            return null;
        }
        if (apply instanceof DoubleStream) {
            return E.i((DoubleStream) apply);
        }
        if (j$.util.Z.D(apply)) {
            return D.i(AbstractC0134f.o(apply));
        }
        C0096f.a("java.util.stream.DoubleStream", apply.getClass());
        throw null;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 0:
                return ((AbstractC0114b) this.b).I();
            case 1:
            default:
                return (Spliterator) this.b;
            case 2:
                Set set = Collectors.a;
                return new StringJoiner((CharSequence) this.b, "", "");
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 6:
                C0197r3 c0197r3 = (C0197r3) this.b;
                return c0197r3.d.tryAdvance(c0197r3.e);
            case 7:
                C0212u3 c0212u3 = (C0212u3) this.b;
                return c0212u3.d.tryAdvance(c0212u3.e);
            case 8:
                C0222w3 c0222w3 = (C0222w3) this.b;
                return c0222w3.d.tryAdvance(c0222w3.e);
            default:
                K3 k3 = (K3) this.b;
                return k3.d.tryAdvance(k3.e);
        }
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public /* synthetic */ void k() {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public /* synthetic */ void l(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public /* synthetic */ boolean n() {
        switch (this.a) {
            case 9:
                return false;
            default:
                return false;
        }
    }

    public /* synthetic */ C0109a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // j$.util.stream.InterfaceC0182o2
    public /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 9:
                AbstractC0219w0.k();
                throw null;
            default:
                AbstractC0219w0.k();
                throw null;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC0182o2, j$.util.stream.InterfaceC0177n2, java.util.function.LongConsumer
    public /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 9:
                AbstractC0219w0.l();
                throw null;
            default:
                AbstractC0219w0.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 5:
                ((InterfaceC0182o2) this.b).accept((InterfaceC0182o2) obj);
                return;
            case 9:
                ((Y2) this.b).accept(obj);
                return;
            case 11:
                ((Consumer) this.b).accept(obj);
                return;
            default:
                ((ArrayList) this.b).add(obj);
                return;
        }
    }

    @Override // java.util.function.Function
    /* renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object apply = ((LongFunction) this.b).apply(j);
        if (apply == null) {
            return null;
        }
        if (apply instanceof LongStream) {
            return C0185p0.i((LongStream) apply);
        }
        if (AbstractC0134f.B(apply)) {
            return C0180o0.i(AbstractC0134f.s(apply));
        }
        C0096f.a("java.util.stream.LongStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        Set set = Collectors.a;
        jArr[0] = ((C0159k) this.b).applyAsLong(obj2) + jArr[0];
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        Map map = (Map) obj;
        Set set = Collectors.a;
        for (Map.Entry entry : ((Map) obj2).entrySet()) {
            Map.EL.a(map, entry.getKey(), entry.getValue(), (BinaryOperator) this.b);
        }
        return map;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Set set = Collectors.a;
        return ((Supplier) this.b).get();
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }
}
