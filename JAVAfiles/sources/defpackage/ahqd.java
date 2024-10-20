package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahqd implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    public final /* synthetic */ ahqe b;

    public ahqd(ahqe ahqeVar, Application application) {
        this.b = ahqeVar;
        this.a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ahqa ahqaVar;
        if (this.b.s.b == null) {
            ahqaVar = this.b.s;
        } else {
            ahqaVar = this.b.t;
        }
        ahqaVar.a = activity.getClass().getSimpleName();
        ahqaVar.b = ahmz.b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ahqa ahqaVar;
        if (this.b.t.b == null) {
            ahqaVar = this.b.s;
        } else {
            ahqaVar = this.b.t;
        }
        if (ahqaVar.d == null) {
            ahqaVar.d = ahmz.b();
        }
        try {
            View findViewById = activity.findViewById(R.id.content);
            ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(new ahqb(this, findViewById));
            viewTreeObserver.addOnPreDrawListener(new ahqc(this, findViewById));
        } catch (RuntimeException e) {
            Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onActivityResume", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ahqa ahqaVar;
        if (this.b.t.b == null) {
            ahqaVar = this.b.s;
        } else {
            ahqaVar = this.b.t;
        }
        if (ahqaVar.c == null) {
            ahqaVar.c = ahmz.b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
