package com.google.android.apps.messaging.shared.datamodel.action.execution;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Debug;
import android.os.IBinder;
import android.os.PowerManager;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ahka;
import defpackage.ahqp;
import defpackage.ahqr;
import defpackage.alvg;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.anen;
import defpackage.anew;
import defpackage.armf;
import defpackage.iqp;
import defpackage.mce;
import defpackage.mm;
import defpackage.rah;
import defpackage.rhg;
import defpackage.rhm;
import defpackage.rhn;
import defpackage.rho;
import defpackage.rhv;
import defpackage.rhw;
import defpackage.rib;
import defpackage.rif;
import defpackage.rig;
import defpackage.ryg;
import defpackage.tm;
import defpackage.utw;
import defpackage.uub;
import defpackage.uuf;
import defpackage.uuh;
import defpackage.xyl;
import defpackage.xyo;
import defpackage.xze;
import defpackage.yac;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ActionExecutorImpl implements rhg, rhm, rhw {
    public static final uuf a = uuh.c(uuh.b, "action_runnable_primes_timer_ratio", 1.0d);
    public static final xze b = xze.g("BugleDataModel", "ActionExecutorImpl");
    public final Context c;
    public final mce d;
    public final ahqr e;
    public final anen f;
    public final Queue g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final Map k;
    public final AtomicInteger l;
    public final AtomicInteger m;
    public final Runnable n;
    public final rig o;
    public final ryg p;
    public final ryg q;
    private final Intent r;
    private final yac s;
    private boolean t;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public static final class EmptyService extends Service {
        @Override // android.app.Service
        public final IBinder onBind(Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public final void onDestroy() {
            ActionExecutorImpl.b.l("ActionExecutor Empty Service destroyed.");
        }

        @Override // android.app.Service
        public final int onStartCommand(Intent intent, int i, int i2) {
            ActionExecutorImpl.b.l("ActionExecutor Empty Service started.");
            return super.onStartCommand(intent, i, i2);
        }
    }

    public ActionExecutorImpl(Context context, mce mceVar, uub uubVar, ahqr ahqrVar, anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, rig rigVar, armf armfVar3) {
        yac yacVar = new yac();
        PriorityQueue priorityQueue = new PriorityQueue(11, new mm(9));
        this.l = new AtomicInteger(0);
        this.m = new AtomicInteger(0);
        this.t = false;
        uubVar.a();
        this.c = context;
        this.d = mceVar;
        this.r = new Intent(context, (Class<?>) EmptyService.class);
        this.s = yacVar;
        this.e = ahqrVar;
        this.g = priorityQueue;
        this.f = anenVar2;
        this.k = new tm();
        this.n = new rah(this, priorityQueue, 9);
        anew anewVar = new anew(anenVar);
        anew anewVar2 = new anew(anenVar);
        this.p = new ryg(anewVar);
        this.q = new ryg(anewVar2);
        this.h = armfVar;
        this.i = armfVar2;
        this.o = rigVar;
        this.j = armfVar3;
    }

    private final ListenableFuture j(rho rhoVar, Action action, boolean z, boolean z2) {
        synchronized (this.k) {
            boolean z3 = true;
            if (!this.t) {
                try {
                    b.o("Starting ActionService");
                    this.c.startService(this.r);
                    this.t = true;
                    yac yacVar = this.s;
                    Context context = this.c;
                    Intent intent = this.r;
                    synchronized (yacVar.b) {
                        if (yacVar.e == null) {
                            yacVar.e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, yacVar.c);
                        }
                    }
                    yacVar.e.acquire();
                    intent.putExtra("pid", yacVar.d);
                } catch (IllegalStateException e) {
                    z3 = false;
                    if (z2) {
                        xyo e2 = b.e();
                        e2.H("Action started execution, but we can't guarantee it will complete, the app may be killed.");
                        e2.z("Action", action);
                        e2.r(e);
                    }
                }
            }
            if (z && !z3) {
                return null;
            }
            this.k.put(Integer.valueOf(rhoVar.a), rhoVar);
            rhoVar.e = this;
            return rhoVar.b(action);
        }
    }

    @Override // defpackage.rhg
    public final ListenableFuture a(rho rhoVar, Action action) {
        ListenableFuture j = j(rhoVar, action, false, !rhoVar.g);
        j.getClass();
        return j;
    }

    @Override // defpackage.rhg
    public final ListenableFuture b(rho rhoVar, Action action) {
        return j(rhoVar, action, true, false);
    }

    @Override // defpackage.rhg
    public final void c(int i) {
        synchronized (this.k) {
            if (((rho) this.k.get(Integer.valueOf(i))) == null) {
                xyo e = b.e();
                e.H("Tried to cancel job");
                e.F(i);
                e.H("that can't be found. already finished?");
                e.q();
            }
        }
    }

    @Override // defpackage.rhw
    public final void d(String str, Action action) {
        xyo c = b.c();
        c.H(str);
        c.u(action.getClass().getSimpleName());
        c.q();
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [rhw, rhm] */
    @Override // defpackage.rhw
    public final void e(Action action, rho rhoVar) {
        Object valueOf;
        rhn rhnVar;
        List list = action.v;
        action.v = new ArrayList();
        rho rhoVar2 = action.w;
        if (rhoVar2 != null && (!rhoVar2.c() || !((Boolean) utw.z.e()).booleanValue())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Action action2 = (Action) it.next();
                if (rhoVar2.c()) {
                    xyo a2 = b.a();
                    a2.H("Adding");
                    a2.H(action2.t);
                    a2.H("background work for");
                    a2.H(rhoVar2.b);
                    a2.q();
                }
                rhoVar2.d.add(action2);
                action2.y(rhoVar2);
                xyl.l(rhoVar2.e);
                ?? r14 = rhoVar2.e;
                if (r14 != 0) {
                    ActionExecutorImpl actionExecutorImpl = (ActionExecutorImpl) r14;
                    armf armfVar = actionExecutorImpl.j;
                    Iterator it2 = it;
                    rif rifVar = new rif(rhoVar2, action2, r14, actionExecutorImpl.f, actionExecutorImpl.h, actionExecutorImpl.i, armfVar);
                    rifVar.c(actionExecutorImpl.d.a("Bugle.DataModel.ActionBreakdown.BackgroundQueue.Latency", action2.x, action2.t));
                    synchronized (actionExecutorImpl.k) {
                        ((ActionExecutorImpl) r14).q.p(rifVar);
                    }
                    actionExecutorImpl.d("ACTION_BACKGROUND_QUEUED_", action2);
                    it = it2;
                }
            }
        } else {
            rig rigVar = this.o;
            ArrayList arrayList = new ArrayList(list);
            rib ribVar = (rib) rigVar.a.b();
            ribVar.getClass();
            new DeferBackgroundWorkAction(ribVar, arrayList).x(127, 0L);
        }
        this.m.decrementAndGet();
        rhoVar.d.remove(action);
        if (rhoVar.d.isEmpty() && (rhnVar = rhoVar.c) != null) {
            rhnVar.a();
        }
        if (rhoVar.d.isEmpty()) {
            synchronized (this.k) {
                this.k.remove(Integer.valueOf(rhoVar.a));
                if (this.k.isEmpty() && this.t) {
                    yac yacVar = this.s;
                    Intent intent = this.r;
                    if (yacVar.d == intent.getIntExtra("pid", -1)) {
                        try {
                            yacVar.e.release();
                        } catch (RuntimeException unused) {
                            alvw h = yac.a.h();
                            h.X(alwp.a, "BugleDataModel");
                            alvg alvgVar = (alvg) ((alvg) h).h("com/google/android/apps/messaging/shared/util/common/WakeLockHelper", "release", 96, "WakeLockHelper.java");
                            String action3 = intent.getAction();
                            PowerManager.WakeLock wakeLock = yacVar.e;
                            if (wakeLock == null) {
                                valueOf = "(null)";
                            } else {
                                valueOf = Boolean.valueOf(wakeLock.isHeld());
                            }
                            alvgVar.L("KeepAliveService.onHandleIntent exit crash %s %s opcode: %d wakeLock: %s isHeld: %s", intent, action3, 0, wakeLock, valueOf);
                            if (!Debug.isDebuggerConnected()) {
                                xyl.c("WakeLock no longer held at end of handler");
                            }
                        }
                    }
                    b.o("Stopping ActionService");
                    this.c.stopService(this.r);
                    this.t = false;
                }
            }
        }
        i();
    }

    @Override // defpackage.rhw
    public final void f(rhv rhvVar, String str) {
        i();
        this.m.incrementAndGet();
        Action action = rhvVar.f;
        rhvVar.c(this.d.a(str, action.x, action.t));
        synchronized (this.k) {
            this.g.add(rhvVar);
            this.p.p(this.n);
        }
    }

    @Override // defpackage.rhw
    public final void g(Optional optional, ahka ahkaVar, ahqp ahqpVar) {
        optional.ifPresent(new iqp(this, ahkaVar, ahqpVar, 10, (char[]) null));
    }

    @Override // defpackage.rhw
    public final void h(String str, String str2) {
        this.d.o(str, str2);
    }

    public final void i() {
        this.m.get();
    }
}
