package com.google.firebase.iid;

import android.os.Looper;
import android.util.Log;
import defpackage.abhg;
import defpackage.abpn;
import defpackage.acir;
import defpackage.aciv;
import defpackage.actx;
import defpackage.aetn;
import defpackage.aglj;
import defpackage.aodi;
import defpackage.aogv;
import defpackage.aogy;
import defpackage.aogz;
import defpackage.aohb;
import defpackage.aohd;
import defpackage.aohf;
import defpackage.aohi;
import defpackage.aojh;
import defpackage.asmb;
import defpackage.asqe;
import defpackage.d;
import defpackage.sp;
import defpackage.uyb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public class FirebaseInstanceId {
    static ScheduledExecutorService a;
    public static asqe g;
    private static final long i = TimeUnit.HOURS.toSeconds(8);
    private static final Pattern j = Pattern.compile("\\AA[\\w-]{38}\\z");
    public final Executor b;
    public final aodi c;
    public final aogz d;
    public final aogy e;
    public final asmb h;
    private final aohi k;
    private boolean l = false;
    public final List f = new ArrayList();

    public FirebaseInstanceId(aodi aodiVar, aogz aogzVar, Executor executor, Executor executor2, aohf aohfVar, aohf aohfVar2, aohi aohiVar) {
        if (aetn.bg(aodiVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (g == null) {
                    g = new asqe(aodiVar.a());
                }
            }
            this.c = aodiVar;
            this.d = aogzVar;
            this.e = new aogy(aodiVar, aogzVar, new abpn(aodiVar.a()), aohfVar, aohfVar2, aohiVar);
            this.b = executor2;
            this.h = new asmb(executor, (byte[]) null);
            this.k = aohiVar;
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static FirebaseInstanceId b() {
        return getInstance(aodi.b());
    }

    public static FirebaseInstanceId getInstance(aodi aodiVar) {
        i(aodiVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) aodiVar.d(FirebaseInstanceId.class);
        d.aC(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    public static void i(aodi aodiVar) {
        abhg.l(aodiVar.c().d, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        abhg.l(aodiVar.c().b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        abhg.l(aodiVar.c().a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        d.t(aodiVar.c().b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        d.t(j.matcher(aodiVar.c().a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public static boolean n() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return false;
        }
        return true;
    }

    public static final void p(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (a == null) {
                a = new ScheduledThreadPoolExecutor(1, new aglj("FirebaseInstanceId", 1));
            }
            a.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    private final Object q(acir acirVar) {
        try {
            return actx.v(acirVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    j();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e);
        }
    }

    public final acir a(String str, String str2) {
        if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
            str2 = "*";
        }
        return actx.s(null).d(this.b, new aogv(this, str, str2, 0));
    }

    public final aohb c() {
        return d(aetn.bg(this.c), "*");
    }

    public final aohb d(String str, String str2) {
        return g.e(f(), str, str2);
    }

    public final String e() {
        try {
            g.j(this.c.f());
            acir a2 = this.k.a();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            a2.n(new sp(19), new uyb(countDownLatch, 11));
            countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            if (a2.l()) {
                return (String) a2.h();
            }
            if (!((aciv) a2).c) {
                if (a2.k()) {
                    throw new IllegalStateException(a2.g());
                }
                throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
            }
            throw new CancellationException("Task is already canceled");
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String f() {
        if ("[DEFAULT]".equals(this.c.e())) {
            return "";
        }
        return this.c.f();
    }

    @Deprecated
    public final String g() {
        i(this.c);
        aohb c = c();
        if (o(c)) {
            l();
        }
        long j2 = aohb.a;
        if (c == null) {
            return null;
        }
        return c.b;
    }

    @Deprecated
    public final String h(String str, String str2) {
        i(this.c);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return (String) ((aojh) q(a(str, str2))).a;
        }
        throw new IOException("MAIN_THREAD");
    }

    final synchronized void j() {
        g.f();
    }

    public final synchronized void k(boolean z) {
        this.l = z;
    }

    public final synchronized void l() {
        if (!this.l) {
            m(0L);
        }
    }

    public final synchronized void m(long j2) {
        p(new aohd(this, Math.min(Math.max(30L, j2 + j2), i)), j2);
        this.l = true;
    }

    public final boolean o(aohb aohbVar) {
        if (aohbVar != null) {
            aogz aogzVar = this.d;
            long j2 = aohbVar.d;
            String c = aogzVar.c();
            if (System.currentTimeMillis() <= j2 + aohb.a && c.equals(aohbVar.c)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
