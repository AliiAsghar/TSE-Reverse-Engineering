package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adoa implements andy {
    private final /* synthetic */ int a;

    public adoa(int i) {
        this.a = i;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ((alvg) ((alvg) ((alvg) akdi.a.h()).g(th)).h("com/google/apps/tiktok/contrib/work/impl/WipeoutWorker$5", "onFailure", (char) 143, "WipeoutWorker.java")).q("Failed to prune WorkManager's database.");
                            return;
                        } else {
                            ((alvg) ((alvg) ((alvg) akdi.a.h()).g(th)).h("com/google/apps/tiktok/contrib/work/impl/WipeoutWorker$4", "onFailure", (char) 131, "WipeoutWorker.java")).q("Error during cancellation sub-task.");
                            return;
                        }
                    }
                    ((alvg) ((alvg) ((alvg) akdi.a.h()).g(th)).h("com/google/apps/tiktok/contrib/work/impl/WipeoutWorker$3", "onFailure", 'u', "WipeoutWorker.java")).q("This iteration failed to complete all cancellations. Proceeded to prune database.");
                    return;
                }
                ((alvg) ((alvg) ((alvg) akdi.a.h()).g(th)).h("com/google/apps/tiktok/contrib/work/impl/WipeoutWorker$2", "onFailure", 'i', "WipeoutWorker.java")).q("Error while gathering dependencies.");
                return;
            }
            return;
        }
        advr.s(th, "Chat API flag check failed", new Object[0]);
    }

    @Override // defpackage.andy
    public final void b(Object obj) {
        if (this.a != 0) {
            return;
        }
        advr.o("Chat API flag check successful", new Object[0]);
    }
}
