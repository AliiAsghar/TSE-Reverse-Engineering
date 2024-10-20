package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aieu implements Application.ActivityLifecycleCallbacks {
    boolean a = false;
    final /* synthetic */ Application b;
    final /* synthetic */ armf c;
    final /* synthetic */ algw d;

    public aieu(Application application, armf armfVar, algw algwVar) {
        this.b = application;
        this.c = armfVar;
        this.d = algwVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [algk, java.lang.Object] */
    private final alog a() {
        if (!this.a) {
            this.a = true;
            this.b.unregisterActivityLifecycleCallbacks(this);
            Set set = (Set) this.c.b();
            alob d = alog.d(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) ((alha) this.d).a.apply((Application.ActivityLifecycleCallbacks) it.next());
                this.b.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                d.h(activityLifecycleCallbacks);
            }
            return d.g();
        }
        int i = alog.d;
        return alsx.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        alog a = a();
        int i = ((alsx) a).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) a.get(i2)).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        albo.T(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        albo.T(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        alog a = a();
        int i = ((alsx) a).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) a.get(i2)).onActivityPreCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        albo.T(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        albo.T(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        albo.T(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        albo.T(this.a);
    }
}
