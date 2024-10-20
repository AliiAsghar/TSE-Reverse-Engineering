package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akqg implements Runnable {
    private final /* synthetic */ int a;

    public /* synthetic */ akqg(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    } else {
                        throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
                    }
                } else {
                    akqj.j = null;
                    return;
                }
            }
            ((alvg) ((alvg) akos.a.g()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "sync", 210, "SyncManagerImpl.java")).q("#sync() complete");
            return;
        }
        Object remove = akqj.d.remove();
        if (remove == akqj.f) {
            akqj.e.pop();
        } else {
            akqj.e.push((akry) remove);
        }
    }
}
