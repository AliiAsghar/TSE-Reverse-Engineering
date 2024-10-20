package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atqu implements GenericArrayType {
    private final Type a;

    public atqu(Type type) {
        this.a = type;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && atqx.n(this, (GenericArrayType) obj)) {
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
        return String.valueOf(atqx.f(this.a)).concat("[]");
    }
}
