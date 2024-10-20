package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akoz implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ akoz(Object obj, WorkerParameters workerParameters, int i) {
        this.c = i;
        this.a = obj;
        this.b = workerParameters;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        long a;
        int i = this.c;
        byte[] bArr = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            Exception exc = (Exception) obj;
                            ?? r0 = this.a;
                            if (!r0.isCancelled()) {
                                amdw amdwVar = (amdw) this.b;
                                int i2 = amdwVar.j;
                                amdwVar.g.a(TimeUnit.MILLISECONDS);
                                amdr amdrVar = amdwVar.e;
                                if (!amdrVar.b(i2)) {
                                    a = -1;
                                } else {
                                    a = amdrVar.a(i2);
                                }
                                if (a >= 0 && amdwVar.f.a(exc)) {
                                    amdwVar.i.c(exc, a);
                                    amdwVar.d(a, TimeUnit.MILLISECONDS);
                                    return albo.bI(amdw.b);
                                }
                                amdwVar.i.d(exc);
                                int i3 = amdwVar.j;
                                throw new amdk(exc);
                            }
                            return r0;
                        }
                        ArrayList arrayList = new ArrayList();
                        HashSet hashSet = new HashSet();
                        for (gtl gtlVar : (List) obj) {
                            if (gtlVar.b == gtk.ENQUEUED) {
                                hashSet.add(gtlVar.d);
                            }
                        }
                        aluq listIterator = alpt.o(hashSet).listIterator();
                        while (listIterator.hasNext()) {
                            ?? r2 = this.a;
                            gsf gsfVar = (gsf) listIterator.next();
                            if (!r2.contains(gsfVar)) {
                                akpc akpcVar = (akpc) this.b;
                                arrayList.add(ancj.f(akpcVar.c.p(akpc.d(gsfVar, akpcVar.c())), new algm(null), andi.a));
                            }
                        }
                        return albo.bV(arrayList).a(akto.k(new agug(15)), andi.a);
                    }
                    return ((akpa) this.a).c((WorkerParameters) this.b);
                }
                akpa akpaVar = (akpa) this.a;
                agrk agrkVar = akpaVar.e;
                akpc akpcVar2 = (akpc) akpaVar.c;
                if (agrkVar.i()) {
                    WorkerParameters workerParameters = (WorkerParameters) this.b;
                    if (!workerParameters.c.contains(akpa.d(akpcVar2.c()))) {
                        ((alvg) ((alvg) akpa.a.g()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncPeriodicWorker", "maybeCancelThisWorkerIfItHasWrongMainProcessTag", 141, "SyncPeriodicWorker.java")).q("Cancelling Sync worker since it has the wrong tag");
                        return akpaVar.f.q(workerParameters.a);
                    }
                }
                return aneh.a;
            }
            Object obj2 = this.a;
            akoy akoyVar = (akoy) obj2;
            return akec.f(ancj.g(akoyVar.b.s("com.google.apps.tiktok.sync.impl.workmanager.SyncWorker"), akto.d(new ahsi(obj2, this.b, 20, bArr)), akoyVar.a), new agug(11), andi.a);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (true) {
            Object obj3 = this.b;
            Object obj4 = this.a;
            if (it.hasNext()) {
                gtl gtlVar2 = (gtl) it.next();
                if (!((WorkerParameters) obj3).a.equals(gtlVar2.a)) {
                    arrayList2.add(((akpa) obj4).f.q(gtlVar2.a));
                }
            } else {
                return aktp.aq(arrayList2).n(new akiq(obj4, obj3, 9, bArr), ((akpa) obj4).d);
            }
        }
    }

    public /* synthetic */ akoz(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
