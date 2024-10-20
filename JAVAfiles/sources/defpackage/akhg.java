package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akhg implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public akhg(akqz akqzVar, int i) {
        this.b = i;
        this.a = akqzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v38, types: [akin, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        boolean z2 = true;
        switch (this.b) {
            case 0:
                akhj akhjVar = (akhj) this.a;
                aluq listIterator = akhjVar.b.entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    akgs akgsVar = (akgs) entry.getKey();
                    aodz aodzVar = (aodz) entry.getValue();
                    akhl akhlVar = new akhl(akgsVar, z ? 1 : 0);
                    akhh akhhVar = new akhh(akhjVar, aodzVar, 1);
                    aiut.c();
                    Object obj = aodzVar.a;
                    obj.getClass();
                    algw algwVar = ((akhk) obj).c;
                    if (algwVar.f()) {
                        aodzVar.a = ((akhk) aodzVar.a).a((akho) algwVar.b());
                    }
                    akhk akhkVar = (akhk) aodzVar.a;
                    algw algwVar2 = akhkVar.d;
                    algw algwVar3 = akhkVar.b;
                    if (algwVar2.f()) {
                        akhlVar.a(algwVar2.b());
                    }
                    if (algwVar3.f()) {
                        akhhVar.a(algwVar3.b());
                    }
                }
                return;
            case 1:
                akgm akgmVar = (akgm) this.a;
                akfw akfwVar = (akfw) akgmVar.a.e.getAndSet(null);
                akgn akgnVar = akgmVar.a;
                akge akgeVar = akgnVar.g;
                long j = akgeVar.d;
                Instant f = akgnVar.a.f();
                if (j == Long.MAX_VALUE) {
                    z = false;
                }
                albo.U(z, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
                akfb akfbVar = akgeVar.a;
                akgnVar.g = new akge(akfbVar, akgeVar.b, akgeVar.c, akgeVar.d, akgeVar.f, akgeVar.e.a(akfbVar, f));
                if (akfw.LOCAL_STATE_CHANGE.equals(akfwVar)) {
                    akgn akgnVar2 = akgmVar.a;
                    akgnVar2.e(akgnVar2.g.e);
                    return;
                } else {
                    if (akfw.REMOTE_STATE_CHANGE.equals(akfwVar)) {
                        akgn akgnVar3 = akgmVar.a;
                        akgnVar3.d(akgnVar3.g.e);
                        return;
                    }
                    throw new IllegalStateException("Invalidation was ".concat(String.valueOf(String.valueOf(akfwVar))));
                }
            case 2:
                throw ((Throwable) this.a);
            case 3:
                aiut.c();
                akhj akhjVar2 = (akhj) this.a;
                if (akhjVar2.h != 1) {
                    z2 = false;
                }
                albo.U(z2, "Duplicate or leaked callback task.");
                alob alobVar = new alob();
                int i = 2;
                akhjVar2.h = 2;
                tn tnVar = new tn((to) akhjVar2.f);
                while (tnVar.hasNext()) {
                    aodz aodzVar2 = (aodz) tnVar.next();
                    aiut.c();
                    Object obj2 = aodzVar2.a;
                    obj2.getClass();
                    albo.U(((akhk) obj2).c.f(), "Isolation failure in updateToPublish(). The state to publish has gone missing. Please report this error as a P1 bug at go/tiktok-bug.");
                    akhk akhkVar2 = (akhk) aodzVar2.a;
                    aodzVar2.a = akhkVar2.a((akho) akhkVar2.c.b());
                    alobVar.h(new akhi((akgs) ((alsw) akhjVar2.b).d.get(aodzVar2), (akho) ((akhk) aodzVar2.a).d.b()));
                }
                akhjVar2.f.clear();
                alog g = alobVar.g();
                int i2 = ((alsx) g).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    akhi akhiVar = (akhi) g.get(i3);
                    try {
                        akhj.a(akhiVar.a, akhiVar.b);
                    } catch (Throwable th) {
                        akhjVar2.c.execute(akto.j(new akhg(th, i)));
                    }
                }
                return;
            case 4:
                akhj akhjVar3 = (akhj) this.a;
                aluq listIterator2 = akhjVar3.b.values().listIterator();
                while (listIterator2.hasNext()) {
                    akhjVar3.d((aodz) listIterator2.next());
                }
                return;
            case 5:
                akhj akhjVar4 = (akhj) this.a;
                akhjVar4.h = 3;
                tn tnVar2 = new tn((to) akhjVar4.g);
                while (tnVar2.hasNext()) {
                    ((ListenableFuture) tnVar2.next()).cancel(false);
                }
                akhjVar4.g = null;
                return;
            case 6:
                ((akhp) this.a).b();
                return;
            case 7:
                for (asqe asqeVar : ((akju) this.a).d.values()) {
                    if (asqeVar.q()) {
                        aiut.c();
                        for (akjb akjbVar : asqeVar.b.values()) {
                            if (akjbVar.b()) {
                                try {
                                    akix akixVar = (akix) albo.bQ(akjbVar.m.c());
                                    akixVar.b();
                                    akja a = akixVar.a();
                                    akec.A(akjbVar.j.b().b(a.a, a.c), "Failed to commit to config");
                                } catch (ExecutionException e) {
                                    throw new RuntimeException(e.getCause());
                                }
                            }
                        }
                    }
                }
                return;
            case 8:
                ((akju) this.a).a = false;
                return;
            case 9:
                Object obj3 = this.a;
                if (akqj.u()) {
                    ((akkl) obj3).a(false);
                    return;
                }
                akrc b = ((aksr) ((akkl) obj3).e.b()).b("StartupAfterPackageReplacedUnlock");
                try {
                    ((akkl) obj3).a(false);
                    armd.i(b, null);
                    return;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        armd.i(b, th2);
                        throw th3;
                    }
                }
            case 10:
                aknh.b(this.a);
                return;
            case 11:
                aknh.b(this.a);
                return;
            case 12:
                try {
                    albo.bQ(this.a);
                    return;
                } catch (ExecutionException e2) {
                    if (e2.getCause() instanceof ajzn) {
                        ((alvg) ((alvg) ((alvg) aknh.a.h()).g(e2)).h("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver", "crashOnException", (char) 343, "IntentFilterAcledReceiver.java")).q("Got unexpected accountId. Was the account removed?");
                        return;
                    } else {
                        if (!(e2.getCause() instanceof TimeoutException)) {
                            aktu.k(e2.getCause());
                            return;
                        }
                        Throwable cause = e2.getCause();
                        int i4 = aktu.a;
                        akqd.a(cause);
                        throw aktu.b(cause);
                    }
                } catch (Throwable th4) {
                    aktu.k(th4);
                    return;
                }
            case 13:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return;
            case 14:
                Context context = ((akom) this.a).c;
                File file = new File(context.getFilesDir(), "103795117_".concat(String.valueOf(aiep.a(context).replaceAll("[^A-Za-z0-9\\-_:]", "_"))));
                if (file.exists() && file.delete()) {
                    ((alvg) ((alvg) akom.a.i()).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryCleanUpPerProcessDatabase", 238, "SyncManagerDataStore.java")).q("Failed to delete per-process database file even though it exists");
                    return;
                }
                return;
            case 15:
                akos.k(this.a);
                return;
            case 16:
                akos.j(this.a);
                return;
            case 17:
                ((akpr) this.a).a = null;
                return;
            case 18:
                break;
            case 19:
                ((akuf) this.a).f.cancel(false);
                return;
            default:
                Object obj4 = this.a;
                synchronized (akto.b) {
                }
                return;
        }
        while (!((akqz) this.a).c.isShutdown()) {
            try {
                try {
                    akqx akqxVar = ((akqy) ((akqz) this.a).b.remove()).a;
                    int i5 = akqx.b;
                    akqxVar.set(null);
                } catch (InterruptedException unused) {
                    ((akqz) this.a).c.execute(this);
                    return;
                } catch (Throwable th5) {
                    try {
                        ((akqz) this.a).c.execute(this);
                        throw th5;
                    } catch (RejectedExecutionException e3) {
                        Iterator it = akqz.a.keySet().iterator();
                        while (it.hasNext()) {
                            ((akqy) it.next()).a.setException(e3);
                        }
                        throw th5;
                    }
                }
            } catch (RejectedExecutionException e4) {
                Iterator it2 = akqz.a.keySet().iterator();
                while (it2.hasNext()) {
                    ((akqy) it2.next()).a.setException(e4);
                }
                return;
            }
        }
        try {
            ((akqz) this.a).c.execute(this);
        } catch (RejectedExecutionException e5) {
            Iterator it3 = akqz.a.keySet().iterator();
            while (it3.hasNext()) {
                ((akqy) it3.next()).a.setException(e5);
            }
        }
    }

    public /* synthetic */ akhg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
