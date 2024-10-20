package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpa implements xye, xyf {
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final aneo h;
    public final aneo i;
    public final armf j;
    public final armf k;
    public final armf l;
    private final armf n;
    private final armf o;
    private static final long m = TimeUnit.SECONDS.toMillis(2);
    public static final xze a = xze.g("BugleNetwork", "TachyonBindApplicationStateManager");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager");

    public kpa(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, aneo aneoVar, aneo aneoVar2, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10) {
        this.e = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.f = armfVar4;
        this.g = armfVar5;
        this.h = aneoVar;
        this.i = aneoVar2;
        this.j = armfVar6;
        this.n = armfVar7;
        this.o = armfVar8;
        this.k = armfVar9;
        this.l = armfVar10;
    }

    @Override // defpackage.xyf
    public final void a() {
        aneo aneoVar;
        akrh e = aktp.e("TachyonBindApplicationStateManager#onFirstActivityStarted_tachyonReceiverManager");
        try {
            aneo aneoVar2 = this.h;
            Runnable j = akto.j(new ivl(this, 17));
            long j2 = m;
            e.b(akul.g(aneoVar2.schedule(j, j2, TimeUnit.MILLISECONDS)));
            e.close();
            akrh e2 = aktp.e("TachyonBindApplicationStateManager#onFirstActivityStarted_gaiaBindManagerMap");
            try {
                e2.b(akul.g(this.h.schedule(akto.j(new ivl(this, 18)), j2, TimeUnit.MILLISECONDS)));
                e2.close();
                if (((olo) this.n.b()).a()) {
                    aneoVar = this.h;
                } else {
                    aneoVar = this.i;
                }
                e2 = aktp.e("TachyonBindApplicationStateManager#scheduleBindTachygramChannels");
                try {
                    e2.b(aneoVar.schedule(akto.j(new ivl(this, 19)), j2, TimeUnit.MILLISECONDS));
                    e2.close();
                } finally {
                    try {
                        e2.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                e.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.xyf
    public final void b() {
        vhi vhiVar = (vhi) this.c.b();
        alvw d = vhi.a.d();
        d.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "onAppBackgrounding", BasePaymentResult.ERROR_REQUEST_FAILED, "TachyonReceiverManagerImpl.java")).q("Notifying TachyonReceivers for backgrounding");
        Iterator it = vhiVar.f.values().iterator();
        while (it.hasNext()) {
            ((vfp) ((vhe) it.next()).d.get()).b();
        }
    }

    @Override // defpackage.xye
    public final void e() {
        if (!((olq) this.o.b()).a()) {
            a();
        }
    }

    @Override // defpackage.xye
    public final void h() {
        if (!((olq) this.o.b()).a()) {
            b();
        }
    }

    @Override // defpackage.xye
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.xye
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.xye
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.xye
    public final /* synthetic */ void g() {
    }
}
