package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import androidx.work.WorkerParameters;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class wmx extends arpw implements arqv {
    final /* synthetic */ WorkerParameters a;
    final /* synthetic */ wmy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmx(WorkerParameters workerParameters, wmy wmyVar, arpe arpeVar) {
        super(2, arpeVar);
        this.a = workerParameters;
        this.b = wmyVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wmx) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        JobInfo pendingJob;
        aqil.P(obj);
        String d = this.a.b.d("intent_action");
        if (!d.F(d, "android.intent.action.BOOT_COMPLETED")) {
            ((alvg) wmy.b.g().h("com/google/android/apps/messaging/shared/receiver/bootcomplete/BootCompleteWorker$startWork$1", "invokeSuspend", 79, "BootCompleteWorker.kt")).t("Got unexpected action: %s", d);
            return new gsu();
        }
        if (!((yjv) this.b.f.b()).e()) {
            return new gsu();
        }
        wmy wmyVar = this.b;
        long epochMilli = ((xnv) wmyVar.g.b()).f().toEpochMilli();
        if (((ykw) wmyVar.h.b()).e("app_install_time_millis", 0L) == 0) {
            ((ykw) wmyVar.h.b()).k("app_install_time_millis", epochMilli);
        }
        wmy wmyVar2 = this.b;
        ((alwl) wmy.a.g()).q("Silently refreshing notifications after Boot/Package replacement");
        ((wpp) wmyVar2.q.b()).L();
        ((Optional) ((apxx) wmyVar2.m).a).ifPresent(new vwq(vnk.n, 15));
        wmy wmyVar3 = this.b;
        ((mho) wmyVar3.i.b()).ae();
        ((mek) wmyVar3.l.b()).e(mej.BOOT_COMPLETE, Optional.empty());
        ((mfo) wmyVar3.j.b()).d();
        JobScheduler jobScheduler = (JobScheduler) this.b.d.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            int[] iArr = wmy.c;
            int length = iArr.length;
            for (int i = 0; i < 2; i++) {
                int i2 = iArr[i];
                pendingJob = jobScheduler.getPendingJob(i2);
                if (pendingJob != null) {
                    jobScheduler.cancel(i2);
                }
            }
        } else {
            ((alvg) wmy.b.h().h("com/google/android/apps/messaging/shared/receiver/bootcomplete/BootCompleteWorker", "cancelObsoleteJobs", 157, "BootCompleteWorker.kt")).q("JobScheduler is null");
        }
        Optional optional = (Optional) this.b.p.b();
        if (optional.isPresent()) {
            qiu.h(((vyv) optional.get()).w());
        }
        wmy wmyVar4 = this.b;
        if (((Boolean) ((utz) qrd.a.get()).e()).booleanValue()) {
            qiu.h(((qrd) wmyVar4.o.b()).a());
        }
        ((wlb) this.b.k.b()).a();
        ((wnw) this.b.e.b()).c();
        Iterator it = ((Set) this.b.n.b()).iterator();
        while (it.hasNext()) {
            ((wns) it.next()).a();
        }
        return new gsw();
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new wmx(this.a, this.b, arpeVar);
    }
}
