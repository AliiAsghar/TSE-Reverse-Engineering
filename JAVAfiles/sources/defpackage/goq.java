package defpackage;

import java.lang.reflect.Proxy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goq {
    private final ClassLoader a;

    public goq(ClassLoader classLoader) {
        this.a = classLoader;
    }

    public final Class a() {
        try {
            return b();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final Class b() {
        Class<?> loadClass = this.a.loadClass("java.util.function.Consumer");
        loadClass.getClass();
        return loadClass;
    }

    public final Object c(artf artfVar, arqr arqrVar) {
        Object newProxyInstance = Proxy.newProxyInstance(this.a, new Class[]{b()}, new goo(artfVar, arqrVar));
        newProxyInstance.getClass();
        return newProxyInstance;
    }
}
