package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.a;
import defpackage.abil;
import defpackage.abpn;
import defpackage.acir;
import defpackage.actx;
import defpackage.aetn;
import defpackage.aglj;
import defpackage.akwm;
import defpackage.aodi;
import defpackage.aogn;
import defpackage.aohe;
import defpackage.aohf;
import defpackage.aohi;
import defpackage.aoih;
import defpackage.aoii;
import defpackage.aoij;
import defpackage.aoik;
import defpackage.aoil;
import defpackage.aoim;
import defpackage.aoip;
import defpackage.aoit;
import defpackage.aoiv;
import defpackage.aojh;
import defpackage.asmb;
import defpackage.asqc;
import defpackage.d;
import defpackage.kos;
import defpackage.kwr;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class FirebaseMessaging {
    static abil a;
    static ScheduledExecutorService b;
    private static final long h = TimeUnit.HOURS.toSeconds(8);
    private static aojh o;
    public final aodi c;
    public final Context d;
    public final aoim e;
    public final Executor f;
    public final aoip g;
    private final aohe i;
    private final aoik j;
    private final Executor k;
    private final acir l;
    private boolean m;
    private final Application.ActivityLifecycleCallbacks n;
    private final asmb p;

    public FirebaseMessaging(aodi aodiVar, aohe aoheVar, aohf aohfVar, aohf aohfVar2, aohi aohiVar, abil abilVar, aogn aognVar) {
        aoip aoipVar = new aoip(aodiVar.a());
        aoim aoimVar = new aoim(aodiVar, aoipVar, new abpn(aodiVar.a()), aohfVar, aohfVar2, aohiVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new aglj("Firebase-Messaging-Task", 1));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new aglj("Firebase-Messaging-Init", 1));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new aglj("Firebase-Messaging-File-Io", 1));
        this.m = false;
        a = abilVar;
        this.c = aodiVar;
        this.i = aoheVar;
        this.j = new aoik(this, aognVar);
        Context a2 = aodiVar.a();
        this.d = a2;
        aoii aoiiVar = new aoii();
        this.n = aoiiVar;
        this.g = aoipVar;
        this.e = aoimVar;
        this.p = new asmb(newSingleThreadExecutor);
        this.k = scheduledThreadPoolExecutor;
        this.f = threadPoolExecutor;
        Context a3 = aodiVar.a();
        if (a3 instanceof Application) {
            ((Application) a3).registerActivityLifecycleCallbacks(aoiiVar);
        } else {
            Log.w("FirebaseMessaging", a.bX(a3, "Context ", " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result."));
        }
        if (aoheVar != null) {
            aoheVar.c(new asqc(this));
        }
        scheduledThreadPoolExecutor.execute(new akwm(this, 13));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new aglj("Firebase-Messaging-Topics-Io", 1));
        int i = 9;
        acir q = actx.q(scheduledThreadPoolExecutor2, new kwr(a2, scheduledThreadPoolExecutor2, this, aoipVar, aoimVar, i));
        this.l = q;
        q.p(scheduledThreadPoolExecutor, new kos(this, i));
        scheduledThreadPoolExecutor.execute(new akwm(this, 14));
    }

    static synchronized FirebaseMessaging getInstance(aodi aodiVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) aodiVar.d(FirebaseMessaging.class);
            d.aC(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static final void j(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (b == null) {
                b = new ScheduledThreadPoolExecutor(1, new aglj("TAG", 1));
            }
            b.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static synchronized aojh k(Context context) {
        aojh aojhVar;
        synchronized (FirebaseMessaging.class) {
            if (o == null) {
                o = new aojh(context);
            }
            aojhVar = o;
        }
        return aojhVar;
    }

    private final synchronized void l() {
        if (!this.m) {
            g(0L);
        }
    }

    final aoit a() {
        return k(this.d).a(c(), aetn.bg(this.c));
    }

    public final String b() {
        aohe aoheVar = this.i;
        if (aoheVar != null) {
            try {
                return (String) actx.u(aoheVar.a());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        aoit a2 = a();
        if (!i(a2)) {
            return a2.b;
        }
        aodi aodiVar = this.c;
        asmb asmbVar = this.p;
        String bg = aetn.bg(aodiVar);
        try {
            return (String) actx.u(asmbVar.v(bg, new aoij(this, bg, a2)));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public final String c() {
        if ("[DEFAULT]".equals(this.c.e())) {
            return "";
        }
        return this.c.f();
    }

    public final void d(String str) {
        if ("[DEFAULT]".equals(this.c.e())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: ".concat(String.valueOf(this.c.e())));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            aoih.b(intent, this.d, new aoil(1));
        }
    }

    public final synchronized void e(boolean z) {
        this.m = z;
    }

    public final void f() {
        aohe aoheVar = this.i;
        if (aoheVar != null) {
            aoheVar.b();
        } else if (i(a())) {
            l();
        }
    }

    public final synchronized void g(long j) {
        j(new aoiv(this, Math.min(Math.max(30L, j + j), h)), j);
        this.m = true;
    }

    public final boolean h() {
        return this.j.b();
    }

    final boolean i(aoit aoitVar) {
        if (aoitVar != null) {
            aoip aoipVar = this.g;
            long j = aoitVar.d;
            String c = aoipVar.c();
            if (System.currentTimeMillis() <= j + aoit.a && c.equals(aoitVar.c)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
