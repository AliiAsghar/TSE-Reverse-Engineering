package j$.util.stream;

import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0164l implements BiConsumer, Supplier, Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0164l(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (this.a) {
            case 0:
                Set set = Collectors.a;
                Object apply = ((Function) obj4).apply(obj2);
                Object apply2 = ((Function) obj3).apply(obj2);
                apply2.getClass();
                Object putIfAbsent = Map.EL.putIfAbsent((java.util.Map) obj, apply, apply2);
                if (putIfAbsent != null) {
                    throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", apply, putIfAbsent, apply2));
                }
                return;
            default:
                Set set2 = Collectors.a;
                ((BiConsumer) obj3).accept(obj, ((Function) obj4).apply(obj2));
                return;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 0:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            default:
                return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 2:
                return new C0194r0((EnumC0204t0) this.b, (IntPredicate) this.c);
            default:
                return new C0190q0((EnumC0204t0) this.b, (Predicate) this.c);
        }
    }

    public /* synthetic */ C0164l(BiConsumer biConsumer, Function function) {
        this.a = 1;
        this.c = biConsumer;
        this.b = function;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((C0188p3) this.b).b((Consumer) this.c, obj);
                return;
            case 5:
                if (obj == null) {
                    ((AtomicBoolean) this.b).set(true);
                    return;
                } else {
                    ((ConcurrentHashMap) this.c).putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            default:
                ((BiConsumer) this.b).accept(this.c, obj);
                return;
        }
    }
}
