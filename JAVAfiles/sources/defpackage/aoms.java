package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoms extends alxy {
    public static final /* synthetic */ int c = 0;
    private static final long d = TimeUnit.HOURS.toSeconds(1);
    public final Context a;
    public final zfj b;
    private final aomt e;
    private final armf f;
    private final aomz g;
    private final armf h;

    public aoms(Context context, aomt aomtVar, zfj zfjVar, armf armfVar, String str) {
        super(null);
        this.g = new aomz(d);
        this.a = context;
        this.e = aomtVar;
        this.b = zfjVar;
        this.h = armfVar;
        this.f = new aomq(context, str, armfVar);
    }

    private final void e(aong aongVar, ListenableFuture listenableFuture) {
        ListenableFuture bI;
        akmi akmiVar = (akmi) this.e;
        ansy ansyVar = akmiVar.c;
        long serializedSize = aongVar.getSerializedSize();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = (-86400000) + elapsedRealtime;
        if (j > 0) {
            for (akmg akmgVar = (akmg) ((ConcurrentLinkedQueue) ansyVar.b).peek(); akmgVar != null && akmgVar.a <= j; akmgVar = (akmg) ((ConcurrentLinkedQueue) ansyVar.b).peek()) {
                if (((ConcurrentLinkedQueue) ansyVar.b).remove(akmgVar)) {
                    ((AtomicLong) ansyVar.a).addAndGet(-akmgVar.b);
                }
            }
        }
        long j2 = ((AtomicLong) ansyVar.a).get();
        for (int i = 0; i < 10 && j2 + serializedSize < 1048576; i++) {
            j2 = ((AtomicLong) ansyVar.a).get();
            if (((AtomicLong) ansyVar.a).compareAndSet(j2, j2 + serializedSize)) {
                ((ConcurrentLinkedQueue) ansyVar.b).offer(new akmg(elapsedRealtime, serializedSize));
                aomv aomvVar = akmiVar.a;
                aquq aquqVar = aomvVar.d;
                if (aquqVar == null) {
                    synchronized (aomvVar) {
                        aquqVar = aomvVar.d;
                        if (aquqVar == null) {
                            aquqVar = new aquq();
                            aomvVar.d = aquqVar;
                        }
                    }
                }
                bI = aquqVar.i(aomvVar.a, aomvVar.c, true);
                albo.bR(bI, akto.h(new ahjd(this, listenableFuture, aongVar, 7)), andi.a);
            }
        }
        Log.w("TikTokClientLogging", "Log rate too high, dropping logs.");
        bI = albo.bI(false);
        albo.bR(bI, akto.h(new ahjd(this, listenableFuture, aongVar, 7)), andi.a);
    }

    @Override // defpackage.alww
    public final void b(alwv alwvVar) {
        algw i;
        ArrayList<aomx> arrayList;
        this.h.b();
        akmi akmiVar = (akmi) this.e;
        aomv aomvVar = akmiVar.a;
        String str = (String) aomm.a(alwvVar, aomo.a);
        if (str == null) {
            i = alfd.a;
        } else {
            i = algw.i(albo.bI(str));
        }
        if (!i.f()) {
            algw h = algw.h((ajwt) aomm.a(alwvVar, akme.a));
            if (!h.f()) {
                akri s = aktp.s(ajwu.a);
                if (s.b()) {
                    h = algw.i((ajwt) s.a());
                }
            }
            if (h.f()) {
                i = algw.i(ancd.f(((agxw) akmiVar.b.b()).m((ajwt) h.b()), ajzn.class, akto.a(new ajwz(11)), andi.a));
            } else {
                i = alfd.a;
            }
        }
        String str2 = null;
        ListenableFuture listenableFuture = (ListenableFuture) i.d(albo.bI(null));
        aomx aomxVar = new aomx(((aomq) this.f).b().b(alwvVar, 3, aomm.b), listenableFuture, alwvVar.d());
        if (alwvVar.j() != null) {
            str2 = alwvVar.j().b;
        }
        aomz aomzVar = this.g;
        aomy aomyVar = new aomy(alwvVar.e(), str2);
        synchronized (aomzVar) {
            long j = aomxVar.b;
            if (j >= aomzVar.b || aomzVar.c.size() >= 1000) {
                Collection values = aomzVar.c.values();
                long nanos = TimeUnit.SECONDS.toNanos(aomzVar.a);
                Iterator it = values.iterator();
                int size = aomzVar.c.size();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    aomx aomxVar2 = (aomx) it.next();
                    long j2 = aomxVar2.b + nanos;
                    if (j2 >= j && size <= 1000) {
                        aomzVar.b = j2;
                        break;
                    }
                    if (aomxVar2.c > 0 && aomzVar.d.size() < 1000) {
                        aomzVar.d.add(aomxVar2);
                    }
                    it.remove();
                    size--;
                }
            }
            aomx aomxVar3 = (aomx) aomzVar.c.get(aomyVar);
            if (aomxVar3 == null) {
                aomzVar.c.put(aomyVar, aomxVar);
                aomt aomtVar = this.e;
                aomm b = ((aomq) this.f).b();
                aomv aomvVar2 = ((akmi) aomtVar).a;
                aomk a = aoml.a();
                a.b(true);
                a.c(true);
                aozy b2 = b.b(alwvVar, 2, a.a());
                Throwable th = (Throwable) aomm.a(alwvVar, alvm.a);
                aomvVar2.b.b();
                if (alwvVar.m().intValue() >= Integer.MAX_VALUE && !(th instanceof alvu)) {
                    anav anavVar = ((aong) b2.b).g;
                    if (anavVar == null) {
                        anavVar = anav.a;
                    }
                    aozy builder = anavVar.toBuilder();
                    aomvVar2.b.b();
                    aozy cW = albo.cW(new aomu(th));
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    anav anavVar2 = (anav) builder.b;
                    anba anbaVar = (anba) cW.s();
                    anbaVar.getClass();
                    anavVar2.j = anbaVar;
                    anavVar2.b |= 1024;
                    anav anavVar3 = (anav) builder.s();
                    if (!b2.b.isMutable()) {
                        b2.u();
                    }
                    aong aongVar = (aong) b2.b;
                    anavVar3.getClass();
                    aongVar.g = anavVar3;
                    aongVar.b |= 32;
                }
                aong aongVar2 = (aong) b2.s();
                boolean z = akqj.a;
                alob alobVar = new alob();
                for (akry c2 = akqj.c(); c2 != null; c2 = c2.a()) {
                    alobVar.h(c2.c());
                }
                List ar = alzz.ar(alobVar.g());
                if (!ar.isEmpty()) {
                    aozy builder2 = aongVar2.toBuilder();
                    aozy createBuilder = aond.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    aond aondVar = (aond) createBuilder.b;
                    apax apaxVar = aondVar.b;
                    if (!apaxVar.c()) {
                        aondVar.b = apag.mutableCopy(apaxVar);
                    }
                    aoyj.addAll(ar, aondVar.b);
                    if (!builder2.b.isMutable()) {
                        builder2.u();
                    }
                    aong aongVar3 = (aong) builder2.b;
                    aond aondVar2 = (aond) createBuilder.s();
                    aondVar2.getClass();
                    aongVar3.h = aondVar2;
                    aongVar3.b |= 64;
                    aongVar2 = (aong) builder2.s();
                }
                e(aongVar2, listenableFuture);
                return;
            }
            aomxVar3.c++;
            aomz aomzVar2 = this.g;
            synchronized (aomzVar2) {
                arrayList = aomzVar2.d;
                aomzVar2.d = new ArrayList();
            }
            for (aomx aomxVar4 : arrayList) {
                aozy aozyVar = aomxVar4.d;
                long j3 = aomxVar4.c;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                aong aongVar4 = (aong) aozyVar.b;
                aong aongVar5 = aong.a;
                aongVar4.b |= 2;
                aongVar4.d = j3;
                e((aong) aozyVar.s(), aomxVar4.a);
            }
        }
    }

    @Override // defpackage.alww
    public final boolean c(Level level) {
        ydm ydmVar = (ydm) this.h.b();
        if (ydmVar.b.compareAndSet(false, true)) {
            ydmVar.c();
        }
        if (level.intValue() < ydmVar.a.get()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.alxy, defpackage.alww
    public final void g(RuntimeException runtimeException, alwv alwvVar) {
        Log.e("ClientLoggingBackend", "Internal logging error", runtimeException);
    }
}
