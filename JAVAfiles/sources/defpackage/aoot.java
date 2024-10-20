package defpackage;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoot implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;
    private final Type b;
    private final Type[] c;

    public aoot(Type type, Type type2, Type... typeArr) {
        Type c;
        type2.getClass();
        if (type == null && aoov.h(type2)) {
            throw new IllegalArgumentException("Must specify owner type for ".concat(type2.toString()));
        }
        if (type == null) {
            c = null;
        } else {
            c = aoov.c(type);
        }
        this.a = c;
        this.b = aoov.c(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Type type3 = this.c[i];
            type3.getClass();
            aoov.f(type3);
            Type[] typeArr3 = this.c;
            typeArr3[i] = aoov.c(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && aoov.g(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.b;
    }

    public final int hashCode() {
        int i;
        Type type = this.b;
        int hashCode = type.hashCode() ^ Arrays.hashCode(this.c);
        Type type2 = this.a;
        if (type2 != null) {
            i = type2.hashCode();
        } else {
            i = 0;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        int length = this.c.length;
        if (length == 0) {
            return aoov.b(this.b);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(aoov.b(this.b));
        sb.append("<");
        sb.append(aoov.b(this.c[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(aoov.b(this.c[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
