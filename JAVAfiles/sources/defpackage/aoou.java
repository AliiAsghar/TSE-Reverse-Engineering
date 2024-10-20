package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoou implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;
    private final Type b;

    public aoou(Type[] typeArr, Type[] typeArr2) {
        boolean z;
        boolean z2;
        int length = typeArr2.length;
        if (length <= 1) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        if (typeArr.length == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.s(z2);
        if (length == 1) {
            Type type = typeArr2[0];
            type.getClass();
            aoov.f(type);
            d.s(typeArr[0] == Object.class);
            this.b = aoov.c(typeArr2[0]);
            this.a = Object.class;
            return;
        }
        Type type2 = typeArr[0];
        type2.getClass();
        aoov.f(type2);
        this.b = null;
        this.a = aoov.c(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && aoov.g(this, (WildcardType) obj)) {
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
        return aoov.a;
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
            return "? super ".concat(String.valueOf(aoov.b(type)));
        }
        Type type2 = this.a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends ".concat(String.valueOf(aoov.b(type2)));
    }
}
