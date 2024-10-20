package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agug implements Callable {
    private final /* synthetic */ int a;

    public /* synthetic */ agug(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 9:
                return new gsw();
            case 10:
                return a.by();
            case 11:
                return new gsu();
            case 12:
                return new gsu();
            case 13:
                ((alvg) ((alvg) akpb.a.g()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleNextSyncSystemWakeup", 101, "SyncWorkManagerOneTimeScheduler.java")).q("Successfully scheduled next onetime workers");
                return null;
            case 14:
                ((alvg) ((alvg) akpc.a.g()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleNextSyncSystemWakeup", 103, "SyncWorkManagerPeriodicScheduler.java")).q("Successfully scheduled next periodic workers");
                return null;
            default:
                return null;
        }
    }
}
