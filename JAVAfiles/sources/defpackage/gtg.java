package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtg extends gtn {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtg(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        timeUnit.getClass();
        this.c.b(timeUnit.toMillis(j));
    }

    @Override // defpackage.gtn
    public final /* bridge */ /* synthetic */ kkc a() {
        if (this.a && this.c.l.d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        gys gysVar = this.c;
        if (!gysVar.s) {
            return new kkc(this.b, gysVar, this.d);
        }
        throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtg(Class cls, TimeUnit timeUnit, TimeUnit timeUnit2) {
        super(cls);
        timeUnit.getClass();
        timeUnit2.getClass();
        this.c.c(timeUnit.toMillis(6L), timeUnit2.toMillis(3L));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtg(Class cls, Duration duration) {
        super(cls);
        duration.getClass();
        this.c.b(duration.toMillis());
    }
}
