package defpackage;

import j$.util.Objects;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aorn<T> {
    public final Class a;
    public final Type b;
    private final int c;

    /* JADX INFO: Access modifiers changed from: protected */
    public aorn() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == aorn.class) {
                Type c = aoov.c(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    b(c);
                }
                this.b = c;
                this.a = aoov.a(c);
                this.c = c.hashCode();
                return;
            }
        } else if (genericSuperclass == aorn.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee ".concat(aotl.q("type-token-raw")));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public static aorn a(Type type, Type... typeArr) {
        Class cls = (Class) type;
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 == length) {
            if (!aoov.h(type)) {
                for (int i = 0; i < length; i++) {
                    Type type2 = typeArr[i];
                    type2.getClass();
                    Class<?> a = aoov.a(type2);
                    TypeVariable<Class<T>> typeVariable = typeParameters[i];
                    for (Type type3 : typeVariable.getBounds()) {
                        if (!aoov.a(type3).isAssignableFrom(a)) {
                            throw new IllegalArgumentException("Type argument " + type2.toString() + " does not satisfy bounds for type variable " + String.valueOf(typeVariable) + " declared by " + type.toString());
                        }
                    }
                }
                return new aorn(new aoot(null, type, typeArr));
            }
            throw new IllegalArgumentException("Raw type " + cls.getName() + " is not supported because it requires specifying an owner type");
        }
        throw new IllegalArgumentException(cls.getName() + " requires " + length + " type arguments, but got " + length2);
    }

    private static void b(Type type) {
        if (!(type instanceof TypeVariable)) {
            if (type instanceof GenericArrayType) {
                b(((GenericArrayType) type).getGenericComponentType());
                return;
            }
            int i = 0;
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType != null) {
                    b(ownerType);
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length = actualTypeArguments.length;
                while (i < length) {
                    b(actualTypeArguments[i]);
                    i++;
                }
                return;
            }
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                for (Type type2 : wildcardType.getLowerBounds()) {
                    b(type2);
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                int length2 = upperBounds.length;
                while (i < length2) {
                    b(upperBounds[i]);
                    i++;
                }
                return;
            }
            if (type != null) {
                return;
            } else {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
        }
        TypeVariable typeVariable = (TypeVariable) type;
        throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + String.valueOf(typeVariable.getGenericDeclaration()) + "\nSee " + aotl.q("typetoken-type-variable"));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof aorn) && aoov.g(this.b, ((aorn) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return aoov.b(this.b);
    }

    public aorn(Type type) {
        type.getClass();
        Type c = aoov.c(type);
        this.b = c;
        this.a = aoov.a(c);
        this.c = c.hashCode();
    }
}
