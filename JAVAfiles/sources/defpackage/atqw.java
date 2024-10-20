package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atqw implements WildcardType {
    private final Type a;
    private final Type b;

    public atqw(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length == 1) {
            Type type = typeArr2[0];
            type.getClass();
            atqx.l(type);
            if (typeArr[0] == Object.class) {
                this.b = typeArr2[0];
                this.a = Object.class;
                return;
            }
            throw new IllegalArgumentException();
        }
        Type type2 = typeArr[0];
        type2.getClass();
        atqx.l(type2);
        this.b = null;
        this.a = typeArr[0];
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && atqx.n(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        if (type != null) {
            return new Type[]{type};
        }
        return atqx.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        int i;
        Type type = this.b;
        if (type != null) {
            i = type.hashCode() + 31;
        } else {
            i = 1;
        }
        return i ^ (this.a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.b;
        if (type != null) {
            return "? super ".concat(String.valueOf(atqx.f(type)));
        }
        Type type2 = this.a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends ".concat(String.valueOf(atqx.f(type2)));
    }
}
