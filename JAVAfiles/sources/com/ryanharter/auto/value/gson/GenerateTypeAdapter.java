package com.ryanharter.auto.value.gson;

import defpackage.aonx;
import defpackage.aoon;
import defpackage.aooo;
import defpackage.aorn;
import j$.util.DesugarCollections;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface GenerateTypeAdapter {
    static {
        new aooo() { // from class: com.ryanharter.auto.value.gson.GenerateTypeAdapter.1
            private final Class a = Array.newInstance((Class<?>) Type.class, 0).getClass();
            private final Map b = DesugarCollections.synchronizedMap(new LinkedHashMap());

            private final Constructor b(Class cls) {
                Constructor<?> b;
                Constructor constructor = (Constructor) this.b.get(cls);
                if (constructor != null) {
                    return constructor;
                }
                String name = cls.getName();
                if (!name.startsWith("android.") && !name.startsWith("java.") && !name.startsWith("kotlin.")) {
                    try {
                        try {
                            String replace = cls.getName().replace("$", "_");
                            Class<?> loadClass = cls.getClassLoader().loadClass(replace + "_GsonTypeAdapter");
                            try {
                                b = loadClass.getDeclaredConstructor(aonx.class);
                                b.setAccessible(true);
                            } catch (NoSuchMethodException unused) {
                                b = loadClass.getDeclaredConstructor(aonx.class, this.a);
                                b.setAccessible(true);
                            }
                        } catch (ClassNotFoundException unused2) {
                            b = b(cls.getSuperclass());
                            if (b != null) {
                                b.setAccessible(true);
                            }
                        }
                        this.b.put(cls, b);
                        return b;
                    } catch (NoSuchMethodException e) {
                        throw new RuntimeException("Unable to find binding constructor for ".concat(String.valueOf(name)), e);
                    }
                }
                return null;
            }

            @Override // defpackage.aooo
            public final aoon a(aonx aonxVar, aorn aornVar) {
                Class cls = aornVar.a;
                if (!cls.isAnnotationPresent(GenerateTypeAdapter.class)) {
                    return null;
                }
                Class superclass = cls.getSuperclass();
                if (superclass.isAnnotationPresent(GenerateTypeAdapter.class)) {
                    return aonxVar.b(superclass);
                }
                Constructor b = b(cls);
                if (b == null) {
                    return null;
                }
                try {
                    if (b.getParameterTypes().length == 1) {
                        return (aoon) b.newInstance(aonxVar);
                    }
                    return (aoon) b.newInstance(aonxVar, ((ParameterizedType) aornVar.b).getActualTypeArguments());
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Unable to invoke ".concat(b.toString()), e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Unable to invoke ".concat(b.toString()), e2);
                } catch (InvocationTargetException e3) {
                    Throwable cause = e3.getCause();
                    if (!(cause instanceof RuntimeException)) {
                        if (cause instanceof Error) {
                            throw ((Error) cause);
                        }
                        throw new RuntimeException("Could not create generated TypeAdapter instance for type ".concat(String.valueOf(String.valueOf(cls))), cause);
                    }
                    throw ((RuntimeException) cause);
                }
            }
        };
    }
}
