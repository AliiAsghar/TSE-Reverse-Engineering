package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akpb implements akov {
    public static final alvi a = alvi.m("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler");
    public final aegu b;
    public final aogy c;
    private final Executor d;
    private final Boolean e = false;
    private final Boolean f;
    private final akyr g;

    public akpb(aogy aogyVar, akyr akyrVar, aegu aeguVar, Executor executor, Boolean bool) {
        this.c = aogyVar;
        this.g = akyrVar;
        this.b = aeguVar;
        this.d = executor;
        this.f = bool;
    }

    @Override // defpackage.akov
    public final ListenableFuture a(Set set, long j, Map map) {
        if (!this.f.booleanValue()) {
            return aneh.a;
        }
        ((alvg) ((alvg) a.g()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleNextSyncSystemWakeup", 82, "SyncWorkManagerOneTimeScheduler.java")).q("Scheduling next onetime WorkManager workers");
        return ancj.g(this.g.g(set, j, map), akto.d(new akoq(this, 2)), this.d);
    }

    public final algw b() {
        this.e.booleanValue();
        return alfd.a;
    }
}
