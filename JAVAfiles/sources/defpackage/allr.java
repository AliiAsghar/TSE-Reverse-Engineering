package defpackage;

import j$.util.function.Function$CC;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class allr implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ allr(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((alok) obj).b();
            case 1:
                return ((alpr) obj).g();
            case 2:
                return alor.j((LinkedHashMap) obj);
            case 3:
                return ((Map.Entry) obj).getKey();
            case 4:
                return ((Map.Entry) obj).getValue();
            case 5:
                return ((Map.Entry) obj).getKey();
            case 6:
                return ((Map.Entry) obj).getValue();
            case 7:
                return atsg.f((String) obj);
            default:
                return (ExperimentalCronetEngine.Builder) ((CronetProvider) obj).createBuilder();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
