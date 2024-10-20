package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atov extends atop {
    public static final atop a = new atov();

    @Override // defpackage.atop
    public final atoq a(Type type, Annotation[] annotationArr) {
        if (atqx.a(type) != d$$ExternalSyntheticApiModelOutline0.m323m()) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b = b((ParameterizedType) type);
            if (atqx.a(b) != atqo.class) {
                return new atou(b, 1);
            }
            if (b instanceof ParameterizedType) {
                return new atou(b((ParameterizedType) b), 0);
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
