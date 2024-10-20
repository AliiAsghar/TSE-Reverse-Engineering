package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akpc implements akov {
    public static final alvi a = alvi.m("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler");
    public final Executor b;
    public final aogy c;
    private final Boolean d = false;
    private final Boolean e;
    private final akyr f;

    public akpc(aogy aogyVar, akyr akyrVar, Executor executor, Boolean bool) {
        this.c = aogyVar;
        this.f = akyrVar;
        this.b = executor;
        this.e = bool;
    }

    public static gsf b(Set set) {
        gsd gsdVar = new gsd();
        gsdVar.a = set.contains(akny.ON_CHARGER);
        if (set.contains(akny.ON_NETWORK_UNMETERED)) {
            gsdVar.c(3);
        } else if (set.contains(akny.ON_NETWORK_CONNECTED)) {
            gsdVar.c(2);
        }
        return gsdVar.a();
    }

    public static String d(gsf gsfVar, algw algwVar) {
        StringBuilder sb = new StringBuilder("SyncPeriodicTask");
        if (gsfVar.c) {
            sb.append("_charging");
        }
        int i = gsfVar.j;
        if (i == 3) {
            sb.append("_unmetered");
        } else if (i == 2) {
            sb.append("_connected");
        }
        return sb.toString();
    }

    @Override // defpackage.akov
    public final ListenableFuture a(Set set, long j, Map map) {
        if (!this.e.booleanValue()) {
            return aneh.a;
        }
        ((alvg) ((alvg) a.g()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleNextSyncSystemWakeup", 84, "SyncWorkManagerPeriodicScheduler.java")).q("Scheduling next periodic WorkManager workers");
        return ancj.g(this.f.g(set, j, map), akto.d(new akoq(this, 3)), this.b);
    }

    public final algw c() {
        this.d.booleanValue();
        return alfd.a;
    }
}
