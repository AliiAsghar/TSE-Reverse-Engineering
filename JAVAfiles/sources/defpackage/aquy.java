package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aquy {
    public final int a;
    public final aqvo b;
    public final aqwe c;
    public final aqvc d;
    public final ScheduledExecutorService e;
    public final Executor f;
    private final aqrt g;

    public aquy(Integer num, aqvo aqvoVar, aqwe aqweVar, aqvc aqvcVar, ScheduledExecutorService scheduledExecutorService, aqrt aqrtVar, Executor executor) {
        this.a = num.intValue();
        this.b = aqvoVar;
        this.c = aqweVar;
        this.d = aqvcVar;
        this.e = scheduledExecutorService;
        this.g = aqrtVar;
        this.f = executor;
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.f("defaultPort", this.a);
        aj.b("proxyDetector", this.b);
        aj.b("syncContext", this.c);
        aj.b("serviceConfigParser", this.d);
        aj.b("scheduledExecutorService", this.e);
        aj.b("channelLogger", this.g);
        aj.b("executor", this.f);
        aj.b("overrideAuthority", null);
        return aj.toString();
    }
}
