package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class emv {
    final int a;
    final Method b;

    public emv(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emv)) {
            return false;
        }
        emv emvVar = (emv) obj;
        if (this.a == emvVar.a && this.b.getName().equals(emvVar.b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}
