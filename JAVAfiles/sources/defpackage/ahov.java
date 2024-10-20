package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahov implements ahlo {
    private final Window$OnFrameMetricsAvailableListener a;
    private final apwt b;
    private Activity c;
    private boolean d;
    private final Set e = Collections.newSetFromMap(new WeakHashMap());

    public ahov(apwt<Handler> apwtVar, aneo aneoVar, Window$OnFrameMetricsAvailableListener window$OnFrameMetricsAvailableListener) {
        this.a = window$OnFrameMetricsAvailableListener;
        this.b = apwtVar;
    }

    private final synchronized void k() {
        Activity activity = this.c;
        if (activity != null && this.e.add(activity.getWindow())) {
            activity.getWindow().addOnFrameMetricsAvailableListener(this.a, (Handler) this.b.b());
            return;
        }
        ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "attachToCurrentActivity", 91, "WindowTracker.java")).q("Activity is null or already being tracked");
    }

    private final synchronized void l(Activity activity) {
        if (activity != null) {
            if (this.e.remove(activity.getWindow())) {
                try {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.a);
                    return;
                } catch (RuntimeException e) {
                    ((alvg) ((alvg) ((alvg) ahkh.a.i()).g(e)).h("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "detachFromActivity", 'm', "WindowTracker.java")).q("Failed to detach the frame metrics listener");
                    return;
                }
            }
        }
        ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "detachFromActivity", 101, "WindowTracker.java")).q("Activity is null or isn't being tracked");
    }

    @Override // defpackage.ahlo
    public void b(Activity activity) {
        synchronized (this) {
            l(activity);
        }
    }

    @Override // defpackage.ahlo
    public void c(Activity activity) {
        synchronized (this) {
            this.c = null;
        }
    }

    @Override // defpackage.ahlo
    public void d(Activity activity) {
        synchronized (this) {
            this.c = activity;
            if (this.d) {
                k();
            }
        }
    }

    public synchronized void i() {
        this.d = true;
        k();
    }

    public synchronized void j() {
        this.d = false;
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
