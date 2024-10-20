package defpackage;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arcc {
    final int a;
    final long b;
    final Set c;

    public arcc(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = alpt.o(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            arcc arccVar = (arcc) obj;
            if (this.a == arccVar.a && this.b == arccVar.b && d.B(this.c, arccVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.f("maxAttempts", this.a);
        aj.g("hedgingDelayNanos", this.b);
        aj.b("nonFatalStatusCodes", this.c);
        return aj.toString();
    }
}
