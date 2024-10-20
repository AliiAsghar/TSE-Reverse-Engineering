package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class goo implements InvocationHandler {
    private final artf a;
    private final arqr b;

    public goo(artf artfVar, arqr arqrVar) {
        this.a = artfVar;
        this.b = arqrVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        boolean z = false;
        if (d.F(method.getName(), "accept") && objArr != null && objArr.length == 1) {
            artf artfVar = this.a;
            Object obj2 = objArr[0];
            if (artfVar.d(obj2)) {
                obj2.getClass();
                this.b.a(obj2);
                return arnb.a;
            }
            throw new ClassCastException("Value cannot be cast to ".concat(String.valueOf(artfVar.b())));
        }
        if (d.F(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            if (obj == objArr[0]) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (d.F(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(this.b.hashCode());
        }
        if (d.F(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return this.b.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
