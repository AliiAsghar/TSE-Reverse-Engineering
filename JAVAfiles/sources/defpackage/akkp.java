package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akkp {
    public static final akyr i;
    public final Context a;
    public final ExecutorService b;
    public final ScheduledExecutorService c;
    public final int d;
    public final Map e;
    public final alvi f;
    public final boolean g;
    public final Map h;
    public final agrk j;
    private final Map k;
    private final apwt l;

    static {
        aixn aixnVar = new aixn();
        aixnVar.a("CREATE TABLE ListenerSuccessfulRuns (listener_key, version_code INTEGER NOT NULL);");
        aixnVar.a("CREATE TABLE AllListenersSucceededVersionTable (version_code INTEGER PRIMARY KEY ON CONFLICT REPLACE);");
        i = aixnVar.b();
    }

    public akkp(Context context, agrk agrkVar, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, int i2, Map map, Map map2, apwt apwtVar) {
        context.getClass();
        executorService.getClass();
        scheduledExecutorService.getClass();
        apwtVar.getClass();
        this.a = context;
        this.j = agrkVar;
        this.b = executorService;
        this.c = scheduledExecutorService;
        this.d = i2;
        this.k = map;
        this.e = map2;
        this.l = apwtVar;
        if (aqjn.aB(((alor) map).keySet(), ((alor) map2).keySet()).isEmpty()) {
            this.f = alvi.m("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner");
            Boolean bool = false;
            bool.getClass();
            this.g = false;
            this.h = agrkVar.i() ? aqjn.p(map, map2) : map2;
            return;
        }
        Set aB = aqjn.aB(((alor) map).keySet(), ((alor) map2).keySet());
        Objects.toString(aB);
        throw new IllegalStateException("Don't provide both an unannotated and @AllProcessesStartupAfterPackageReplacedListener StartupAfterPackageReplacedListener provider for keys ".concat(aB.toString()));
    }

    public final ahmn a() {
        return (ahmn) this.l.b();
    }
}
