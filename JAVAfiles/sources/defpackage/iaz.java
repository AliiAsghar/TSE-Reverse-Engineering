package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.lang.Thread;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class iaz extends ngr implements aiqi {
    public armf a;
    public armf b;
    private yyb x;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface a {
        aksr a();

        yyb b();
    }

    @Override // defpackage.ngr, defpackage.aklc, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        try {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (!xyl.n()) {
                if (xyp.c()) {
                    alvw f = ngr.c.f();
                    f.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "setupUncaughtExceptionHandler", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "BugleApplicationBase.java")).q("BugleApplicationBase: UncaughtException unset: eng build");
                    if (!ActivityManager.isRunningInTestHarness()) {
                        xyl.b = true;
                    }
                } else if (ActivityManager.isUserAMonkey()) {
                    alvw f2 = ngr.c.f();
                    f2.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) f2).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "setupUncaughtExceptionHandler", 206, "BugleApplicationBase.java")).q("BugleApplicationBase: UncaughtException unset: monkey");
                } else {
                    uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    Thread.setDefaultUncaughtExceptionHandler(this);
                }
            }
            this.e = uncaughtExceptionHandler;
        } catch (RuntimeException e) {
            xyo e2 = xze.g("BugleDataModel", "BuglePhoneApplicationBase").e();
            e2.H("Exception installing exception handler. Crashes will not report");
            e2.r(e);
        }
        if (yhx.f(this)) {
            a aVar = (a) akec.w(this, a.class);
            akrc b = aVar.a().b("BuglePhoneApplicationBase#attatchBaseContext");
            try {
                akqj.q();
                this.x = aVar.b();
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
    }

    @Override // defpackage.aiqi
    public final aiqj b() {
        return (aiqj) this.a.b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        Context applicationContext = super.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return this;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (yhx.f(this)) {
            ((zpt) this.b.b()).r();
        }
    }

    @Override // defpackage.ngr, defpackage.aklc, android.app.Application
    public void onCreate() {
        super.onCreate();
        if (yhx.f(this) && this.x != null && fa.b != -1) {
            fa.b = -1;
            synchronized (fa.g) {
                tn tnVar = new tn(fa.f);
                while (tnVar.hasNext()) {
                    fa faVar = (fa) ((WeakReference) tnVar.next()).get();
                    if (faVar != null) {
                        faVar.o();
                    }
                }
            }
        }
    }
}
