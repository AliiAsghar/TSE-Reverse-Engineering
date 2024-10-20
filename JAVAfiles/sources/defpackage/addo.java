package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addo {
    public final SettableFuture a = SettableFuture.create();
    public wcr b;

    public addo(wcr wcrVar) {
        this.b = wcrVar;
    }

    public final void a(Throwable th) {
        this.a.setException(th);
    }

    public final void b(wcs wcsVar) {
        this.a.set(wcsVar);
    }

    public final synchronized void c(Instant instant) {
        aozy builder = this.b.toBuilder();
        int i = this.b.h + 1;
        if (!builder.b.isMutable()) {
            builder.u();
        }
        wcr wcrVar = (wcr) builder.b;
        wcrVar.b |= 8;
        wcrVar.h = i;
        apct j = aotl.j(instant);
        if (!builder.b.isMutable()) {
            builder.u();
        }
        wcr wcrVar2 = (wcr) builder.b;
        j.getClass();
        wcrVar2.g = j;
        wcrVar2.b |= 4;
        this.b = (wcr) builder.s();
    }
}
