package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Optional;
import java.lang.Thread;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ngr extends aklc implements Thread.UncaughtExceptionHandler, gsa {
    public static final alvi c = alvi.m("com/google/android/apps/messaging/shared/app/BugleApplicationBase");
    public static final uuf d = uuh.r(12345, "observable_query_on_read_kill_switch");
    private Executor a;
    protected Thread.UncaughtExceptionHandler e;
    public armf f;
    public armf g;
    public armf h;
    public armf i;
    public armf j;
    public armf k;
    public armf l;
    public armf m;
    public aksr n;
    public armf o;
    public armf p;
    public armf q;
    public ocs r;
    public ocv s;
    public otx t;
    public ocn u;

    private final void eY(Thread thread, Throwable th) {
        itl itlVar = new itl(this, th, thread, 11, (char[]) null);
        if (getMainLooper().getThread() != thread) {
            alvw h = c.h();
            h.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) h).g(th)).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "reportException", 253, "BugleApplicationBase.java")).t("BugleApplicationBase: Uncaught exception in background thread %s", thread);
            new Handler(getMainLooper()).post(itlVar);
            armf armfVar = this.i;
            if (armfVar != null) {
                ((mek) armfVar.b()).e(mej.EXCEPTION, Optional.of("Uncaught exception in background thread"));
                return;
            }
            return;
        }
        alvw h2 = c.h();
        h2.X(alwp.a, "Bugle");
        ((alvg) ((alvg) ((alvg) h2).g(th)).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "reportException", 264, "BugleApplicationBase.java")).t("BugleApplicationBase: Uncaught exception in primary thread %s", thread);
        itlVar.run();
        armf armfVar2 = this.i;
        if (armfVar2 != null) {
            ((mek) armfVar2.b()).e(mej.EXCEPTION, Optional.of("Uncaught exception in primary thread"));
        }
    }

    @Override // defpackage.gsa
    public final gsb a() {
        grz grzVar = new grz();
        grzVar.b((Executor) this.m.b());
        grzVar.c((Executor) this.m.b());
        int i = 2;
        if (!Log.isLoggable("BugleAction", 2)) {
            i = 3;
            if (!Log.isLoggable("BugleAction", 3)) {
                i = 4;
            }
        }
        grzVar.h = i;
        String packageName = getApplicationContext().getPackageName();
        packageName.getClass();
        grzVar.g = packageName;
        grzVar.d((gto) this.o.b());
        grzVar.f = new ch(this, 8);
        grzVar.i = 1000;
        grzVar.j = 3000;
        return new gsb(grzVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aklc, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        yyb.b = this;
        anfi.a = this;
        acrj.a(this);
        ahtp.f(this);
    }

    public final void d(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.e;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    @Override // defpackage.aklc, android.app.Application
    public void onCreate() {
        Supplier supplier;
        Supplier supplier2;
        Supplier supplier3;
        Supplier supplier4;
        Supplier supplier5;
        Supplier supplier6;
        Supplier supplier7;
        Supplier supplier8;
        Supplier supplier9;
        Supplier supplier10;
        Supplier supplier11;
        Supplier supplier12;
        Supplier supplier13;
        Supplier supplier14;
        Supplier supplier15;
        akul c2;
        String str;
        String lowerCase;
        long j;
        super.onCreate();
        abjc.b = this;
        abis.b(this);
        agms agmsVar = new agms();
        agmsVar.a = new addh(14);
        agmsVar.b = new agmr(6);
        agmsVar.c = new agmr(7);
        agmsVar.d = new agmr(8);
        agmsVar.e = new addh(15);
        agmsVar.f = new addh(16);
        agmsVar.g = new addh(17);
        agmsVar.h = new addh(18);
        agmsVar.j = new addh(19);
        agmsVar.i = new addh(20);
        agmsVar.l = new agmr(1);
        agmsVar.m = new agmr(0);
        agmsVar.p = new agmr(2);
        agmsVar.n = new agmr(3);
        agmsVar.o = new agmr(4);
        agmsVar.a(true);
        agmsVar.k = new agmr(5);
        agmsVar.a = new nfz(7);
        agmsVar.b = new ngq(this, 1);
        agmsVar.c = new ngq(this, 0);
        agmsVar.d = new ngq(this, 2);
        agmsVar.e = new ijm(this, 16);
        agmsVar.h = new nfz(3);
        agmsVar.i = new nfz(4);
        agmsVar.m = new ijm(this, 17);
        agmsVar.j = new nfz(5);
        agmsVar.l = new nfz(6);
        agmsVar.n = new ijm(this, 18);
        agmsVar.o = new ijm(this, 19);
        agmsVar.p = new ijm(this, 20);
        agmsVar.k = new nfz(8);
        agmsVar.a(yhx.f(getApplicationContext()));
        if (agmsVar.r == 1 && (supplier = agmsVar.a) != null && (supplier2 = agmsVar.b) != null && (supplier3 = agmsVar.c) != null && (supplier4 = agmsVar.d) != null && (supplier5 = agmsVar.e) != null && (supplier6 = agmsVar.f) != null && (supplier7 = agmsVar.g) != null && (supplier8 = agmsVar.h) != null && (supplier9 = agmsVar.i) != null && (supplier10 = agmsVar.j) != null && (supplier11 = agmsVar.k) != null && (supplier12 = agmsVar.l) != null && (supplier13 = agmsVar.m) != null && (supplier14 = agmsVar.n) != null) {
            Supplier supplier16 = agmsVar.o;
            if (supplier16 != null && (supplier15 = agmsVar.p) != null) {
                agmt agmtVar = new agmt(supplier, supplier2, supplier3, supplier4, supplier5, supplier6, supplier7, supplier8, supplier9, supplier10, supplier11, supplier12, supplier13, supplier14, supplier16, supplier15, agmsVar.q);
                agnc.b = this;
                agnc.c = agmtVar;
                agnc.e.set(agmtVar);
                if (yhx.f(this)) {
                    Iterator it = ((Set) this.h.b()).iterator();
                    while (it.hasNext()) {
                        registerActivityLifecycleCallbacks((xyj) it.next());
                    }
                } else {
                    ahtp.f(this);
                    aczc.m();
                }
                utx.a.set(true);
                xcj xcjVar = (xcj) this.f.b();
                akrh e = aktp.e("StartupHandlerImpl#onApplicationCreated");
                try {
                    if (!xcjVar.f()) {
                        c2 = aktp.ag(null);
                    } else {
                        c2 = xcjVar.c();
                    }
                    e.close();
                    qiu.h(c2);
                    alvw g = c.g();
                    g.X(alwp.a, "Bugle");
                    alvg alvgVar = (alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "onCreate", 151, "BugleApplicationBase.java");
                    int i = xws.a;
                    try {
                        PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
                        if (TextUtils.isEmpty(packageInfo.versionName)) {
                            lowerCase = "unknown_app_version";
                        } else {
                            lowerCase = packageInfo.versionName.toLowerCase(Locale.US);
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            j = packageInfo.getLongVersionCode();
                        } else {
                            j = packageInfo.versionCode;
                        }
                        str = "Bugle version: " + lowerCase + " , Bugle version code: " + j;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        str = "Error getting app version information.";
                    }
                    alvgVar.t("BugleApplicationBase: %s", str);
                    Context applicationContext = getApplicationContext();
                    String d2 = xws.d(getApplicationContext());
                    xzt.a = applicationContext;
                    xzt.b = d2;
                    return;
                } finally {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if (agmsVar.a == null) {
            sb.append(" enforceCheckInitializedSupplier");
        }
        if (agmsVar.b == null) {
            sb.append(" enforceThreadChecksOnCursorsSupplier");
        }
        if (agmsVar.c == null) {
            sb.append(" useIteratingStreamSupplier");
        }
        if (agmsVar.d == null) {
            sb.append(" omitUnchangedRowsFromUpdatesByDefaultSupplier");
        }
        if (agmsVar.e == null) {
            sb.append(" useCustomCursorFactorySupplier");
        }
        if (agmsVar.f == null) {
            sb.append(" throwOnExtractBindDatasArrayLengthCheckSupplier");
        }
        if (agmsVar.g == null) {
            sb.append(" enforceConcurrentCursorModificationDurinBindSupplier");
        }
        if (agmsVar.h == null) {
            sb.append(" suppressPhantomRowsByDefaultSupplier");
        }
        if (agmsVar.i == null) {
            sb.append(" catchBulkInsertThrowablesSupplier");
        }
        if (agmsVar.j == null) {
            sb.append(" useExplicitWriteLockSupplier");
        }
        if (agmsVar.k == null) {
            sb.append(" observableQueryOnReadyKillSwitch");
        }
        if (agmsVar.l == null) {
            sb.append(" addIdsToBindDataInBulkInsertSupplier");
        }
        if (agmsVar.m == null) {
            sb.append(" enableDbOverridesSupplier");
        }
        if (agmsVar.n == null) {
            sb.append(" readExecutor");
        }
        if (agmsVar.o == null) {
            sb.append(" writeExecutor");
        }
        if (agmsVar.p == null) {
            sb.append(" blockingExecutor");
        }
        if (agmsVar.r == 0) {
            sb.append(" isPrimaryProcess");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        akrc b = this.n.b("BugleApplicationBase#onTrimMemory");
        try {
            super.onTrimMemory(i);
            if (yhx.f(this)) {
                alvw d2 = c.d();
                d2.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "onTrimMemory", 163, "BugleApplicationBase.java")).q("BugleApplicationBase: onTrimMemory");
                if (this.a == null) {
                    this.a = new anew((Executor) this.j.b());
                }
                qjb.a(new ebm(this, i, 6), this.a);
                if (xvo.a.get()) {
                    try {
                        hkz.b(this).h(i);
                    } catch (NoSuchFieldError | OutOfMemoryError e) {
                        alvw i2 = c.i();
                        i2.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) ((alvg) i2).g(e)).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "onTrimMemory", (char) 176, "BugleApplicationBase.java")).q("BugleApplicationBase: Exception clearing glide memory");
                    }
                }
                ((mek) this.i.b()).e(mej.TRIM_MEMORY, Optional.of(String.valueOf(i)));
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (!yhx.f(this)) {
            if (yhx.a(this).equals(getPackageName().concat(":crash_report"))) {
                alvw h = c.h();
                h.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) h).g(th)).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "uncaughtException", 225, "BugleApplicationBase.java")).t("BugleApplicationBase: Reporting disabled for background process. Dropping for %s", thread);
                d(thread, th);
                return;
            }
            eY(thread, th);
            return;
        }
        eY(thread, th);
    }
}
