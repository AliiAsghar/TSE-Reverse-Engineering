package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xzf implements xyj {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/common/LoggingApplicationStateManagerV2");

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        alvw f = a.f();
        f.X(alwp.a, "Bugle");
        ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/util/common/LoggingApplicationStateManagerV2", "onActivityCreated", 22, "LoggingApplicationStateManagerV2.java")).t("%s.onCreate", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        alvw f = a.f();
        f.X(alwp.a, "Bugle");
        ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/util/common/LoggingApplicationStateManagerV2", "onActivityDestroyed", 52, "LoggingApplicationStateManagerV2.java")).t("%s.onDestroy", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        alvw f = a.f();
        f.X(alwp.a, "Bugle");
        ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/util/common/LoggingApplicationStateManagerV2", "onActivityPaused", 37, "LoggingApplicationStateManagerV2.java")).t("%s.onPause", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        alvw f = a.f();
        f.X(alwp.a, "Bugle");
        ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/util/common/LoggingApplicationStateManagerV2", "onActivityResumed", 32, "LoggingApplicationStateManagerV2.java")).t("%s.onResume", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        alvw f = a.f();
        f.X(alwp.a, "Bugle");
        ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/util/common/LoggingApplicationStateManagerV2", "onActivitySaveInstanceState", 47, "LoggingApplicationStateManagerV2.java")).t("%s.onSaveInstanceState", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        alvw f = a.f();
        f.X(alwp.a, "Bugle");
        ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/util/common/LoggingApplicationStateManagerV2", "onActivityStarted", 27, "LoggingApplicationStateManagerV2.java")).t("%s.onStart", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        alvw f = a.f();
        f.X(alwp.a, "Bugle");
        ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/util/common/LoggingApplicationStateManagerV2", "onActivityStopped", 42, "LoggingApplicationStateManagerV2.java")).t("%s.onStop", activity);
    }
}
