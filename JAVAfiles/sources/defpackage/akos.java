package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akos implements akoi {
    public static final alvi a = alvi.m("com/google/apps/tiktok/sync/impl/SyncManagerImpl");
    public final aegu b;
    public final aneo c;
    public final anen d;
    public final akat e;
    public final akom f;
    public final Map g;
    public final armf h;
    public final ListenableFuture i;
    public final Object j = new Object();
    public final tm k;
    public final Map l;
    public final Map m;
    private final Context n;
    private final algw o;
    private final akov p;
    private final AtomicReference q;
    private final agrk r;
    private final asqe s;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        Map h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface b {
        asqe ke();
    }

    public akos(aegu aeguVar, Context context, aneo aneoVar, anen anenVar, agrk agrkVar, akat akatVar, algw algwVar, akom akomVar, Map map, Map map2, Map map3, asqe asqeVar, akov akovVar, armf armfVar) {
        tm tmVar = new tm();
        this.k = tmVar;
        this.l = new tm();
        this.m = new tm();
        this.q = new AtomicReference();
        this.b = aeguVar;
        this.n = context;
        this.c = aneoVar;
        this.d = anenVar;
        this.r = agrkVar;
        this.e = akatVar;
        this.o = algwVar;
        Boolean bool = false;
        bool.getClass();
        this.f = akomVar;
        this.g = map3;
        this.s = asqeVar;
        this.h = armfVar;
        bool.getClass();
        albo.U(map2.isEmpty(), "SyncletBindings cannot be bound outside of account scope without @ApplicationSynclet.");
        this.i = akomVar.c();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((alor) map).entrySet()) {
            aknz a2 = aknz.a((String) entry.getKey());
            aozy createBuilder = akpm.a.createBuilder();
            akpl akplVar = a2.a;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            akpm akpmVar = (akpm) createBuilder.b;
            akplVar.getClass();
            akpmVar.c = akplVar;
            akpmVar.b |= 1;
            p(new akot((akpm) createBuilder.s()), entry, hashMap);
        }
        tmVar.putAll(hashMap);
        this.p = akovVar;
        String a3 = aiep.a(context);
        int indexOf = a3.indexOf(58);
        if (indexOf == -1) {
            return;
        }
        a3.substring(indexOf + 1);
    }

    public static /* synthetic */ void j(ListenableFuture listenableFuture) {
        try {
            albo.bQ(listenableFuture);
        } catch (CancellationException e) {
            ((alvg) ((alvg) ((alvg) a.h()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "finishScheduleListener", (char) 686, "SyncManagerImpl.java")).q("The sync scheduling future was cancelled. This should never happen.");
        } catch (ExecutionException e2) {
            ((alvg) ((alvg) ((alvg) a.h()).g(e2)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "finishScheduleListener", (char) 684, "SyncManagerImpl.java")).q("Error scheduling next sync wakeup");
        }
    }

    public static /* synthetic */ void k(ListenableFuture listenableFuture) {
        try {
            albo.bQ(listenableFuture);
        } catch (CancellationException | ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((alvg) ((alvg) ((alvg) a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", (char) 788, "SyncManagerImpl.java")).q("Timeout updating accounts in sync. Some accounts may not sync correctly.");
            } else {
                ((alvg) ((alvg) ((alvg) a.h()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", (char) 792, "SyncManagerImpl.java")).q("Updating sync accounts failed. Some accounts may not sync correctly.");
            }
        }
    }

    private final ListenableFuture n() {
        return aktp.Y(((ansy) ((alha) this.o).a).C(), new akdg(7), this.c);
    }

    private final ListenableFuture o() {
        AtomicReference atomicReference = this.q;
        SettableFuture create = SettableFuture.create();
        if (defpackage.a.bE(atomicReference, create)) {
            create.m(aktp.Y(n(), new akok(this, 2), this.c));
        }
        return albo.bJ((ListenableFuture) this.q.get());
    }

    private static final void p(akot akotVar, Map.Entry entry, Map map) {
        try {
            akob akobVar = (akob) ((armf) entry.getValue()).b();
            if (!akobVar.a) {
                return;
            }
            map.put(akotVar, akobVar);
        } catch (RuntimeException e) {
            ((alvg) ((alvg) ((alvg) a.h()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "safePutBindingEntry", 903, "SyncManagerImpl.java")).t("Error accessing SyncletBinding for key %s. Its Synclet will be skipped", new aomj(aomi.NO_USER_DATA, entry.getKey()));
        }
    }

    @Override // defpackage.akoi
    public final ListenableFuture a() {
        ((alvg) ((alvg) a.g()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "poke", 588, "SyncManagerImpl.java")).q("#poke(). Scheduling workers.");
        return this.s.n(f(albo.bI(altg.a)), new akdk(5));
    }

    @Override // defpackage.akoi
    public final ListenableFuture b() {
        ((alvg) ((alvg) a.g()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "sync", 199, "SyncManagerImpl.java")).q("#sync(). Running Synclets and scheduling next sync.");
        long epochMilli = this.b.f().toEpochMilli();
        akom akomVar = this.f;
        ListenableFuture n = this.s.n(aktp.ac(akomVar.d.submit(akto.k(new ujb(akomVar, epochMilli, 4))), new akdj(this, 14), this.c), new akdk(6));
        n.c(new akqg(1), andi.a);
        return n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ ListenableFuture c(ListenableFuture listenableFuture, Map map) {
        Throwable th;
        boolean z;
        akob akobVar;
        asqe asqeVar;
        byte[] bArr = null;
        int i = 0;
        try {
            z = ((Boolean) albo.bQ(listenableFuture)).booleanValue();
            th = null;
        } catch (CancellationException | ExecutionException e) {
            th = e;
            z = false;
        }
        if (!z) {
            ((alvg) ((alvg) ((alvg) a.i()).g(th)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "syncInternal", (char) 339, "SyncManagerImpl.java")).q("Failed preparing sync datastore for sync. Aborting sync attempt.");
            long epochMilli = this.b.f().toEpochMilli();
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(this.f.d((akot) it.next(), epochMilli, false));
            }
            return aktp.ab(albo.bE(arrayList), new akoo(this, map, i), this.c);
        }
        albo.T(o().isDone());
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            akot akotVar = (akot) entry.getKey();
            SettableFuture settableFuture = (SettableFuture) entry.getValue();
            StringBuilder sb = new StringBuilder("Synclet: ");
            sb.append(akotVar.b.b());
            if (akotVar.a()) {
                sb.append(" ");
                sb.append(akotVar.c.a);
            }
            akrl akrlVar = akrk.a;
            if (akotVar.a()) {
                akrj c = akrlVar.c();
                ajwu.a(c, akotVar.c);
                akrlVar = ((akrl) c).f();
            }
            akrh f = aktp.f(sb.toString(), akrlVar);
            try {
                synchronized (this.j) {
                    akobVar = (akob) this.k.get(akotVar);
                }
                if (akobVar == null) {
                    settableFuture.cancel(false);
                } else {
                    akiq akiqVar = new akiq(this, akobVar, 7, bArr);
                    if (akotVar.a()) {
                        asqeVar = ((b) akec.x(this.n, b.class, akotVar.c)).ke();
                    } else {
                        asqeVar = this.s;
                    }
                    aknz aknzVar = akotVar.b;
                    Set set = (Set) ((apxx) asqeVar.b).a;
                    alpr i2 = alpt.i(set.size());
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        i2.c(new akpg((akpi) it2.next(), 0));
                    }
                    ListenableFuture c2 = ((alhm) asqeVar.a).c(akiqVar, i2.g());
                    akat.c(c2, "Synclet sync() failed for synckey: %s", new aomj(aomi.NO_USER_DATA, aknzVar));
                    settableFuture.m(c2);
                }
                ListenableFuture ac = aktp.ac(settableFuture, new akon(this, (ListenableFuture) settableFuture, akotVar, 2), this.c);
                ac.c(new adub(this, akotVar, ac, 19), this.c);
                f.b(ac);
                f.close();
                arrayList2.add(ac);
            } catch (Throwable th2) {
                try {
                    f.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return ancj.f(albo.bO(arrayList2), new algm(null), andi.a);
    }

    public final /* synthetic */ ListenableFuture d(ListenableFuture listenableFuture, akot akotVar) {
        boolean z = false;
        try {
            albo.bQ(listenableFuture);
            z = true;
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((alvg) ((alvg) ((alvg) a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "writeResultToDatabase", 472, "SyncManagerImpl.java")).t("Sync cancelled from timeout and will be retried later: %s", akotVar.b.b());
            }
        }
        final long epochMilli = this.b.f().toEpochMilli();
        return aktp.ab(this.f.d(akotVar, epochMilli, z), new Callable() { // from class: akor
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(epochMilli);
            }
        }, this.c);
    }

    public final ListenableFuture e() {
        ((alvg) ((alvg) a.g()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 728, "SyncManagerImpl.java")).q("onAccountsChanged: Checking and maybe rescheduling synclet bindings");
        albo.U(true, "onAccountsChanged called without an AccountManager bound");
        ListenableFuture h = h(n());
        akom akomVar = this.f;
        ListenableFuture submit = akomVar.d.submit(akto.k(new aidu(akomVar, 15)));
        ListenableFuture n = aktp.as(h, submit).n(new akon(this, h, submit, 3), this.c);
        this.q.set(n);
        ListenableFuture bP = albo.bP(n, 10L, TimeUnit.SECONDS, this.c);
        anel anelVar = new anel(akto.j(new akhg(bP, 15)));
        bP.c(anelVar, andi.a);
        return anelVar;
    }

    public final ListenableFuture f(ListenableFuture listenableFuture) {
        ListenableFuture bJ = albo.bJ(aktp.Z(this.i, new ahsi(this, listenableFuture, 19), this.c));
        this.e.g(bJ);
        bJ.c(new akhg(bJ, 16), this.c);
        return ancj.f(listenableFuture, akto.a(new akdg(8)), andi.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Set] */
    public final ListenableFuture g(ListenableFuture listenableFuture, long j) {
        HashMap hashMap;
        altg altgVar = altg.a;
        try {
            altgVar = (Set) albo.bQ(listenableFuture);
        } catch (CancellationException | ExecutionException e) {
            ((alvg) ((alvg) ((alvg) a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInner", (char) 669, "SyncManagerImpl.java")).q("Unable to determine attempted syncs. They will not be used to schedule the next sync.");
        }
        synchronized (this.j) {
            hashMap = new HashMap(this.k);
        }
        Collection.EL.removeIf(hashMap.entrySet(), new agol(this, 11));
        return aktp.Z(this.p.a(altgVar, j, hashMap), new ahsi(this, hashMap, 18), andi.a);
    }

    public final ListenableFuture h(ListenableFuture listenableFuture) {
        return aktp.Z(o(), new akoq(listenableFuture, 0), andi.a);
    }

    public final void i(Set set) {
        synchronized (this.j) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ajwt ajwtVar = (ajwt) it.next();
                tm tmVar = this.k;
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((alor) ((a) akec.x(this.n, a.class, ajwtVar)).h()).entrySet()) {
                    aknz a2 = aknz.a((String) entry.getKey());
                    int i = ajwtVar.a;
                    aozy createBuilder = akpm.a.createBuilder();
                    akpl akplVar = a2.a;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    akpm akpmVar = (akpm) apagVar;
                    akplVar.getClass();
                    akpmVar.c = akplVar;
                    akpmVar.b |= 1;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    akpm akpmVar2 = (akpm) createBuilder.b;
                    akpmVar2.b |= 2;
                    akpmVar2.d = i;
                    p(new akot((akpm) createBuilder.s()), entry, hashMap);
                }
                tmVar.putAll(hashMap);
            }
        }
    }

    public final /* synthetic */ void l(akot akotVar, ListenableFuture listenableFuture) {
        synchronized (this.j) {
            try {
                this.m.put(akotVar, (Long) albo.bQ(listenableFuture));
            } catch (CancellationException | ExecutionException unused) {
            }
        }
    }

    public final boolean m() {
        return this.r.i();
    }
}
