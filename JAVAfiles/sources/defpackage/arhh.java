package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arhh {
    final aqua a;
    final Object b;

    public arhh(aqua aquaVar, Object obj) {
        this.a = aquaVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            arhh arhhVar = (arhh) obj;
            if (d.B(this.a, arhhVar.a) && d.B(this.b, arhhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("provider", this.a);
        aj.b("config", this.b);
        return aj.toString();
    }
}
