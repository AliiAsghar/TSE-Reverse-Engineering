package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpb extends atop {
    private final Executor a;

    public atpb(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.atop
    public final atoq a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (atqx.a(type) != atoo.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type h = atqx.h(0, (ParameterizedType) type);
            if (!atqx.p(annotationArr, atqs.class)) {
                executor = this.a;
            }
            return new atoy(h, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
