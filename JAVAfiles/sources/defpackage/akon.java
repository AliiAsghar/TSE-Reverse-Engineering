package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akon implements ancr {
    public final /* synthetic */ akos a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ akon(akos akosVar, ListenableFuture listenableFuture, akot akotVar, int i) {
        this.d = i;
        this.a = akosVar;
        this.c = listenableFuture;
        this.b = akotVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        int i = this.d;
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    Set set = (Set) albo.bQ(this.b);
                    Set set2 = (Set) albo.bQ(this.c);
                    altw G = alzz.G(set, set2);
                    altw G2 = alzz.G(set2, set);
                    akos akosVar = this.a;
                    akosVar.i(G);
                    HashSet hashSet = new HashSet();
                    synchronized (akosVar.j) {
                        for (akot akotVar : akosVar.k.keySet()) {
                            if (G2.contains(akotVar.c)) {
                                hashSet.add(akotVar);
                            }
                        }
                        synchronized (akosVar.j) {
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                ListenableFuture listenableFuture = (ListenableFuture) akosVar.l.get((akot) it.next());
                                if (listenableFuture != null) {
                                    listenableFuture.cancel(false);
                                }
                            }
                        }
                        akosVar.k.keySet().removeAll(hashSet);
                        akat akatVar = akosVar.e;
                        akom akomVar = akosVar.f;
                        ListenableFuture submit = akomVar.d.submit(new akoo(akomVar, hashSet, i2));
                        akatVar.g(submit);
                        akat.c(submit, "Error removing accounts from sync. IDs: %s", G2);
                    }
                    if (G.isEmpty() && G2.isEmpty()) {
                        return aneh.a;
                    }
                    ((alvg) ((alvg) akos.a.g()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 753, "SyncManagerImpl.java")).q("Accounts did change. Rescheduling synclets.");
                    return aktp.Y(akosVar.f(albo.bI(altg.a)), new algm(null), andi.a);
                }
                return this.a.d(this.c, (akot) this.b);
            }
            return this.a.c(this.b, this.c);
        }
        ((alvg) ((alvg) akos.a.g()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInParallel", 646, "SyncManagerImpl.java")).q("Completed sync. Scheduling next wakeup");
        return this.a.g(this.b, ((Long) this.c).longValue());
    }

    public /* synthetic */ akon(akos akosVar, ListenableFuture listenableFuture, Object obj, int i) {
        this.d = i;
        this.a = akosVar;
        this.b = listenableFuture;
        this.c = obj;
    }
}
