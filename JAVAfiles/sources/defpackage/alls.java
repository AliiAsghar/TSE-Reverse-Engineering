package defpackage;

import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alls {
    public static final Collector a = Collector.CC.of(new akxz(12), new akxy(9), new mcb(15), new akyg(20), new Collector.Characteristics[0]);
    public static final Collector b = Collector.CC.of(new akxz(13), new akxy(10), new mcb(16), new allr(1), new Collector.Characteristics[0]);

    static {
        int i = 14;
        Collector.CC.of(new akxz(i), new akxy(11), new mcb(i), new akyg(19), new Collector.Characteristics[0]);
    }

    public static Collector a(Function function, Function function2) {
        function.getClass();
        function2.getClass();
        return Collector.CC.of(new akxz(15), new ajrn(function, function2, 3), new mcb(17), new allr(0), new Collector.Characteristics[0]);
    }

    public static Collector b(Function function, Function function2, BinaryOperator binaryOperator) {
        function2.getClass();
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new akxz(16)), new allr(2));
    }
}
