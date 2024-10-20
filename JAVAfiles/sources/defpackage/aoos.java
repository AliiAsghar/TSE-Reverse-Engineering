package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoos implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;

    public aoos(Type type) {
        type.getClass();
        this.a = aoov.c(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && aoov.g(this, (GenericArrayType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.valueOf(aoov.b(this.a)).concat("[]");
    }
}
