package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrk {
    public static final AtomicReference a = new AtomicReference();

    public static Object a(Class cls) {
        Object obj;
        Supplier m330m = d$$ExternalSyntheticApiModelOutline0.m330m(a.get());
        m330m.getClass();
        obj = m330m.get();
        obj.getClass();
        albo.N(cls.isInstance(obj), "SingletonEntryPoints (i.e SingletonComponent) does not implement %s", cls.getName());
        return cls.cast(obj);
    }
}
