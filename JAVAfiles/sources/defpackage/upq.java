package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.workqueue.WorkQueueWorkerShim;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.time.Duration;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class upq implements upp {
    public static final xze a = xze.g("BugleWorkQueue", "WorkQueueSchedulerImpl");
    private final Context b;
    private final xnv c;
    private final anen d;
    private final anen e;
    private final armf f;
    private final armf g;
    private final urp h;
    private final otw i;
    private final Map j = new HashMap();
    private final Object k = new Object();

    public upq(Context context, xnv xnvVar, anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, urp urpVar, otw otwVar) {
        this.b = context;
        this.c = xnvVar;
        this.d = anenVar;
        this.e = anenVar2;
        this.f = armfVar;
        this.g = armfVar2;
        this.h = urpVar;
        this.i = otwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c5, code lost:
    
        if (r6 != 3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00da, code lost:
    
        r1 = r1.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dc, code lost:
    
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00de, code lost:
    
        r2.b.e(r0, r1, 13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ed, code lost:
    
        throw new java.lang.IllegalStateException("cannot be null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d7, code lost:
    
        if (r3 == defpackage.unv.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE) goto L28;
     */
    @Override // defpackage.upp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.akul a(defpackage.upr r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upq.a(upr):akul");
    }

    @Override // defpackage.upp
    public final akul b(upr uprVar) {
        String str;
        Integer valueOf;
        Integer valueOf2;
        anen anenVar;
        String o = uprVar.o();
        if (o != null) {
            try {
                unf a2 = ((uop) this.g.b()).c(uprVar.p()).a();
                gsz gszVar = new gsz(WorkQueueWorkerShim.class);
                gszVar.c(o);
                if (uprVar.q().getTime() > 0) {
                    Duration ofMillis = Duration.ofMillis(uprVar.q().getTime() - this.c.f().toEpochMilli());
                    if (ofMillis.toMillis() > 0) {
                        gszVar.h(ofMillis);
                    }
                }
                hgi hgiVar = new hgi((char[]) null);
                hgiVar.n("worker_type", o);
                gszVar.i(hgiVar.j());
                gsf gsfVar = a2.b;
                if (gsfVar != null) {
                    gszVar.f(gsfVar);
                }
                if (gsfVar == null || !gsfVar.d) {
                    gszVar.e(a2.g, a2.f, TimeUnit.MILLISECONDS);
                }
                kkc j = gszVar.j();
                if (uprVar.q().getTime() == 0) {
                    if (d(o, upo.SCHEDULED, (UUID) j.a)) {
                        xyo d = a.d();
                        d.H("skipping wm scheduling");
                        d.y("rowId", uprVar.k());
                        d.z("queue", o);
                        d.z(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, uprVar.p());
                        d.q();
                        upz upzVar = new upz();
                        upzVar.aj("launchToWorkManager");
                        upzVar.d();
                        upzVar.c(uprVar.k());
                        return aktp.ag(gtd.a);
                    }
                }
                xyo d2 = a.d();
                d2.H("scheduling in wm");
                d2.y("rowId", uprVar.k());
                d2.z("queue", o);
                d2.z(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, uprVar.p());
                d2.q();
                uot uotVar = (uot) this.f.b();
                synchronized (uotVar.d) {
                    uotVar.e.add(new uos(uotVar.b.f().toEpochMilli(), 4, uprVar));
                }
                gtm ar = gvf.ar(this.b);
                if (uprVar.q().getTime() == 0) {
                    str = "";
                } else {
                    str = "-" + uprVar.q().getTime();
                }
                akul g = akul.g(((gte) ar.k(o.concat(str), gso.APPEND_OR_REPLACE, j).a()).c);
                upz upzVar2 = new upz();
                upzVar2.aj("WorkQueueSchedulerImpl#launchToWorkManager1");
                Optional of = Optional.of(j.a);
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 46060) {
                    agnc.t("workmanager_id", intValue2);
                }
                if (intValue >= 46060) {
                    upzVar2.a.put("workmanager_id", rvg.b(of));
                }
                upzVar2.c(uprVar.k());
                mhr mhrVar = new mhr(this, uprVar, o, j, 5);
                if (this.i.a()) {
                    anenVar = this.e;
                } else {
                    anenVar = this.d;
                }
                return g.h(mhrVar, anenVar);
            } catch (IllegalArgumentException e) {
                throw new unr(e);
            }
        }
        throw new unr();
    }

    @Override // defpackage.upp
    public final /* synthetic */ Optional c(upr uprVar) {
        return Optional.empty();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078 A[Catch: all -> 0x007d, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0037, B:11:0x0045, B:13:0x0049, B:16:0x004b, B:22:0x007b, B:24:0x0064, B:26:0x0068, B:27:0x006e, B:29:0x0072, B:30:0x0078), top: B:3:0x0003 }] */
    @Override // defpackage.upp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.String r6, defpackage.upo r7, java.util.UUID r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.k
            monitor-enter(r0)
            java.util.Map r1 = r5.j     // Catch: java.lang.Throwable -> L7d
            unt r2 = new unt     // Catch: java.lang.Throwable -> L7d
            r3 = 7
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r1 = j$.util.Map.EL.computeIfAbsent(r1, r6, r2)     // Catch: java.lang.Throwable -> L7d
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L7d
            xze r2 = defpackage.upq.a     // Catch: java.lang.Throwable -> L7d
            xyo r2 = r2.d()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = "set execution state"
            r2.H(r3)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = "queue"
            r2.z(r3, r6)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r6 = "id"
            r2.z(r6, r8)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r6 = "proposedState"
            r2.z(r6, r7)     // Catch: java.lang.Throwable -> L7d
            r2.q()     // Catch: java.lang.Throwable -> L7d
            upo r6 = defpackage.upo.SCHEDULED     // Catch: java.lang.Throwable -> L7d
            boolean r6 = r1.containsValue(r6)     // Catch: java.lang.Throwable -> L7d
            r2 = 1
            if (r6 != 0) goto L42
            upo r6 = defpackage.upo.PERSISTED     // Catch: java.lang.Throwable -> L7d
            boolean r6 = r1.containsValue(r6)     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L40
            goto L42
        L40:
            r6 = 0
            goto L43
        L42:
            r6 = r2
        L43:
            if (r6 == 0) goto L4b
            upo r3 = defpackage.upo.SCHEDULED     // Catch: java.lang.Throwable -> L7d
            if (r7 != r3) goto L4b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            return r2
        L4b:
            unt r3 = new unt     // Catch: java.lang.Throwable -> L7d
            r4 = 8
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r3 = j$.util.Map.EL.computeIfAbsent(r1, r8, r3)     // Catch: java.lang.Throwable -> L7d
            upo r3 = (defpackage.upo) r3     // Catch: java.lang.Throwable -> L7d
            int r7 = r7.ordinal()     // Catch: java.lang.Throwable -> L7d
            if (r7 == 0) goto L78
            if (r7 == r2) goto L6e
            r2 = 2
            if (r7 == r2) goto L64
            goto L7b
        L64:
            upo r7 = defpackage.upo.SCHEDULED     // Catch: java.lang.Throwable -> L7d
            if (r3 != r7) goto L7b
            upo r7 = defpackage.upo.PERSISTED     // Catch: java.lang.Throwable -> L7d
            r1.put(r8, r7)     // Catch: java.lang.Throwable -> L7d
            goto L7b
        L6e:
            upo r7 = defpackage.upo.NOT_SCHEDULED     // Catch: java.lang.Throwable -> L7d
            if (r3 != r7) goto L7b
            upo r7 = defpackage.upo.SCHEDULED     // Catch: java.lang.Throwable -> L7d
            r1.put(r8, r7)     // Catch: java.lang.Throwable -> L7d
            goto L7b
        L78:
            r1.remove(r8)     // Catch: java.lang.Throwable -> L7d
        L7b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            return r6
        L7d:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upq.d(java.lang.String, upo, java.util.UUID):boolean");
    }
}
