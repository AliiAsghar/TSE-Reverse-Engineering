package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahoe implements ahlo {
    private final apwt a;
    private boolean b = false;
    private Activity c;

    public ahoe(apwt<ahoh> apwtVar, algw<armf<Boolean>> algwVar, Executor executor) {
        this.a = apwtVar;
        executor.execute(new ahnu(this, algwVar, 2, null));
    }

    @Override // defpackage.ahlo
    public synchronized void c(Activity activity) {
        if (this.b) {
            ((ahoh) this.a.b()).a(activity);
        } else if (!activity.equals(this.c)) {
            ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor", "onActivityPaused", 86, "ActivityLevelJankMonitor.java")).D("Activity mismatch (currentActivity=%s, activity=%s)", this.c, activity);
        }
        this.c = null;
    }

    @Override // defpackage.ahlo
    public synchronized void d(Activity activity) {
        if (this.b) {
            ((ahoh) this.a.b()).c(activity);
        } else {
            this.c = activity;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    public /* synthetic */ void i(algw algwVar) {
        if (!((Boolean) ((alha) algwVar).a.b()).booleanValue()) {
            return;
        }
        synchronized (this) {
            this.b = true;
            Activity activity = this.c;
            if (activity != null) {
                d(activity);
            }
            this.c = null;
        }
    }

    @Override // defpackage.ahlo
    public /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.ahlo
    public /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.ahlo
    public /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.ahlo
    public /* synthetic */ void h(int i) {
    }

    @Override // defpackage.ahlo
    public /* synthetic */ void a(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.ahlo
    public /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
