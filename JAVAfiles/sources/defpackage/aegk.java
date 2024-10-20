package defpackage;

import j$.util.function.Function$CC;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aegk implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ aegk(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return Function$CC.$default$andThen(this, function);
                            }
                            return Function$CC.$default$andThen(this, function);
                        }
                        return Function$CC.$default$andThen(this, function);
                    }
                    return Function$CC.$default$andThen(this, function);
                }
                return Function$CC.$default$andThen(this, function);
            }
            return Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int lastIndexOf;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                String str = (String) obj;
                                Object obj2 = agnc.a;
                                int indexOf = str.indexOf(" AS ");
                                if (indexOf >= 0) {
                                    return str.substring(indexOf + 4);
                                }
                                if (!str.contains("group_concat") && (lastIndexOf = str.lastIndexOf(".")) != -1) {
                                    return str.substring(lastIndexOf + 1);
                                }
                                return str;
                            }
                            return (aehn) ((Map.Entry) obj).getValue();
                        }
                        return (String) ((Map.Entry) obj).getKey();
                    }
                    return new AtomicReference((aoud) aoud.g(new wci(3), (aquc) obj));
                }
                return ((akwr) obj).a();
            }
            return ((aikt) obj).a;
        }
        return new akwj((akxm) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return Function$CC.$default$compose(this, function);
                            }
                            return Function$CC.$default$compose(this, function);
                        }
                        return Function$CC.$default$compose(this, function);
                    }
                    return Function$CC.$default$compose(this, function);
                }
                return Function$CC.$default$compose(this, function);
            }
            return Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }
}
