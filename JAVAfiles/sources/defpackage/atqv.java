package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atqv implements ParameterizedType {
    private final Type a;
    private final Type b;
    private final Type[] c;

    public atqv(Type type, Type type2, Type... typeArr) {
        boolean z;
        if (type2 instanceof Class) {
            if (type != null) {
                z = false;
            } else {
                z = true;
            }
            if (z != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            type3.getClass();
            atqx.l(type3);
        }
        this.a = type;
        this.b = type2;
        this.c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && atqx.n(this, (ParameterizedType) obj)) {
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
            return atqx.f(this.b);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(atqx.f(this.b));
        sb.append("<");
        sb.append(atqx.f(this.c[0]));
        for (int i = 1; i < this.c.length; i++) {
            sb.append(", ");
            sb.append(atqx.f(this.c[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
