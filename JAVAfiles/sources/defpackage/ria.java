package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionJobService;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionWorkManagerScheduler;
import com.google.android.apps.messaging.shared.datamodel.action.execution.PendingActionReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ria implements rhk {
    public static final utz b = uuh.i(uuh.b, "pwqSchedulingWaitsForAllActions", false);
    private static final xze d = xze.g("BugleAction", "ActionSchedulerImpl");
    public final armf c;
    private final Context e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final xnv i;

    public ria(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, xnv xnvVar) {
        this.e = context;
        this.c = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.i = xnvVar;
    }

    private final ListenableFuture k(Action action, Action action2, int i) {
        rho rhoVar;
        ListenableFuture listenableFuture = null;
        if (action2 != null && (rhoVar = action2.w) != null && (rhoVar.f == null || !action.fA())) {
            if (rhoVar.c()) {
                xyo c = d.c();
                c.H("Adding");
                c.H(action.t);
                c.H("after");
                c.H(action2.t);
                c.H("for");
                c.H(rhoVar.b);
                c.q();
            }
            listenableFuture = rhoVar.b(action);
        }
        if (listenableFuture != null) {
            return listenableFuture;
        }
        ListenableFuture b2 = ((rhg) this.c.b()).b(new rho(action.t, i, null, null, false), action);
        if (b2 != null) {
            return b2;
        }
        xyo c2 = d.c();
        c2.H(action);
        c2.H("deferred since it was started from unsafe context");
        c2.q();
        g(action, i, 1L);
        return albo.bG();
    }

    @Override // defpackage.rhk
    public final PendingIntent a(Context context, Action action, int i, boolean z, Uri uri) {
        return PendingActionReceiver.l(context, action, i, z, VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS, uri, (rib) this.f.b());
    }

    @Override // defpackage.rhk
    public final akul b(Action action) {
        if (((Boolean) b.e()).booleanValue()) {
            return akul.g(d.m(new gst(this, new AtomicReference(), action, 3, (char[]) null)));
        }
        return akul.g(j(action));
    }

    @Override // defpackage.rhk
    public final ListenableFuture c(Action action, wng wngVar, int i) {
        if (wngVar == null) {
            return k(action, null, i);
        }
        final SettableFuture create = SettableFuture.create();
        rho rhoVar = new rho(action.t, i, new rhn() { // from class: rhy
            @Override // defpackage.rhn
            public final void a() {
                utz utzVar = ria.b;
                SettableFuture.this.set(null);
            }
        }, wngVar, true);
        rhoVar.b = wngVar.toString();
        ((rhg) this.c.b()).a(rhoVar, action);
        wngVar.q(action.t, create);
        return create;
    }

    @Override // defpackage.rhk
    public final ListenableFuture d(Action action) {
        if (((Boolean) b.e()).booleanValue()) {
            return b(action);
        }
        return j(action);
    }

    @Override // defpackage.rhk
    public final ListenableFuture e(Action action) {
        return k(action, null, rho.a(action));
    }

    @Override // defpackage.rhk
    public final void f(Action action, int i) {
        if (((Boolean) utw.A.e()).booleanValue()) {
            gvf.ar(((ActionWorkManagerScheduler) this.h.b()).c).b(Integer.toString(i));
        }
        JobScheduler jobScheduler = (JobScheduler) ((rhu) this.g.b()).b.getSystemService(JobScheduler.class);
        jobScheduler.getClass();
        jobScheduler.cancel(i);
        Context context = this.e;
        rib ribVar = (rib) this.f.b();
        if (PendingActionReceiver.l(context, action, i, false, 536870912, null, ribVar) != null) {
            ((AlarmManager) context.getSystemService("alarm")).cancel(PendingActionReceiver.l(context, action, i, false, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES, null, ribVar));
        }
    }

    @Override // defpackage.rhk
    public final void g(Action action, int i, long j) {
        String str;
        if (j <= 0) {
            k(action, null, i);
            return;
        }
        if (((Boolean) utw.A.e()).booleanValue()) {
            ActionWorkManagerScheduler actionWorkManagerScheduler = (ActionWorkManagerScheduler) this.h.b();
            rib ribVar = (rib) actionWorkManagerScheduler.b.b();
            hgi hgiVar = new hgi((char[]) null);
            hgiVar.n("bundle_action_name", action.getClass().getName());
            hgiVar.n("bundle_action_key", action.t);
            if (((nhy) ribVar.b.b()).a()) {
                action.u.j().flatMap(new rhr(5)).ifPresentOrElse(new rgd(hgiVar, 7), new rah(hgiVar, action, 11));
            } else {
                hgiVar.n("bundle_action_serialized_params", rib.e(action.u));
            }
            gsi j2 = hgiVar.j();
            long min = Math.min(j, rhk.a);
            gsz gszVar = new gsz(ActionWorkManagerScheduler.ActionWorker.class);
            gszVar.g(j, TimeUnit.MILLISECONDS);
            gszVar.e(gry.LINEAR, min, TimeUnit.MILLISECONDS);
            gszVar.i(j2);
            gvf.ar(actionWorkManagerScheduler.c).l(Integer.toString(i), gso.APPEND, gszVar.j());
            return;
        }
        if (action.fA()) {
            rhu rhuVar = (rhu) this.g.b();
            rib ribVar2 = (rib) this.f.b();
            JobScheduler jobScheduler = (JobScheduler) rhuVar.b.getSystemService(JobScheduler.class);
            jobScheduler.getClass();
            ComponentName componentName = new ComponentName(rhuVar.b, (Class<?>) ActionJobService.class);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("bundle_action_name", action.getClass().getName());
            persistableBundle.putString("bundle_action_key", action.t);
            persistableBundle.putString("bundle_action_serialized_params", rib.e(action.u));
            if (((nhy) ribVar2.b.b()).a()) {
                action.u.j().ifPresent(new rgd(persistableBundle, 8));
            }
            try {
                if (jobScheduler.schedule(new JobInfo.Builder(i, componentName).setExtras(persistableBundle).setMinimumLatency(j).setOverrideDeadline(j + Math.min(j, rhk.a)).build()) == 1) {
                    return;
                } else {
                    throw new IllegalArgumentException("Invalid parameter was supplied. This can occur if the run-time for your job is too short, or perhaps the system can't resolve the requisite JobService in your package.");
                }
            } catch (IllegalStateException e) {
                StringBuilder sb = new StringBuilder("failed to schedule job: ");
                sb.append(action.getClass().getName());
                List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
                if (allPendingJobs == null || allPendingJobs.isEmpty()) {
                    rhu.a.m("Failed to retrieve JobScheduler pending jobs. Cancelling everything");
                    jobScheduler.cancelAll();
                    allPendingJobs = Collections.emptyList();
                }
                HashMap hashMap = new HashMap();
                int i2 = 0;
                for (JobInfo jobInfo : allPendingJobs) {
                    Action d2 = ribVar2.d(jobInfo.getExtras());
                    if (d2 != null) {
                        str = d2.getClass().getName();
                    } else {
                        str = "unknown";
                    }
                    AtomicInteger atomicInteger = (AtomicInteger) hashMap.get(str);
                    if (atomicInteger == null) {
                        hashMap.put(str, new AtomicInteger(1));
                    } else {
                        atomicInteger.incrementAndGet();
                    }
                    if (d2 != null) {
                        jobScheduler.cancel(jobInfo.getId());
                        i2++;
                    }
                }
                xyo b2 = rhu.a.b();
                b2.H("Dropped");
                b2.F(i2);
                b2.H("excess jobs.");
                b2.q();
                ((mbl) rhuVar.c.b()).g("Bugle.DataModel.Scheduler.DroppedExcessJobs.Count", i2);
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb.append("\n  ");
                    sb.append((String) entry.getKey());
                    sb.append(": ");
                    sb.append(((AtomicInteger) entry.getValue()).get());
                }
                rhu.a.n(sb.toString(), e);
                throw e;
            }
        }
        Context context = this.e;
        ((AlarmManager) context.getSystemService("alarm")).set(2, this.i.a() + j, PendingActionReceiver.l(context, action, i, false, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES, null, (rib) this.f.b()));
    }

    @Override // defpackage.rhk
    public final void h(Action action, Action action2) {
        k(action, action2, rho.a(action)).isCancelled();
    }

    @Override // defpackage.rhk
    public final rhx i(Action action, long j) {
        Runnable j2 = akto.j(new rah(this, action, 10, null));
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(j2, j);
        return new rhx(handler, j2);
    }

    public final ListenableFuture j(Action action) {
        return ((rhg) this.c.b()).a(new rho(action.t, rho.a(action), null, null, false), action);
    }
}
