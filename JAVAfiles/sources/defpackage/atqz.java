package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atqz extends atop {
    @Override // defpackage.atop
    public final atoq a(Type type, Annotation[] annotationArr) {
        if (atqx.a(type) != ListenableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b = b((ParameterizedType) type);
            if (atqx.a(b) != atqo.class) {
                return new atou(b, 2);
            }
            if (b instanceof ParameterizedType) {
                return new atou(b((ParameterizedType) b), 3);
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("ListenableFuture return type must be parameterized as ListenableFuture<Foo> or ListenableFuture<? extends Foo>");
    }
}
