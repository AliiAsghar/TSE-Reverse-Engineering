package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hph {
    final hxd a;
    final Executor b;

    public hph(hxd hxdVar, Executor executor) {
        this.a = hxdVar;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hph) {
            return this.a.equals(((hph) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
