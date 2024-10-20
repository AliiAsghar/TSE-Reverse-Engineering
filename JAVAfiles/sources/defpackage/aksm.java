package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aksm implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ Application.ActivityLifecycleCallbacks a;
    final /* synthetic */ aksr b;

    public aksm(aksr aksrVar, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.a = activityLifecycleCallbacks;
        this.b = aksrVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (akqj.u()) {
            this.a.onActivityCreated(activity, bundle);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityCreated"));
        try {
            this.a.onActivityCreated(activity, bundle);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (akqj.u()) {
            this.a.onActivityDestroyed(activity);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityDestroyed"));
        try {
            this.a.onActivityDestroyed(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (akqj.u()) {
            this.a.onActivityPaused(activity);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPaused"));
        try {
            this.a.onActivityPaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        if (akqj.u()) {
            this.a.onActivityPostCreated(activity, bundle);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostCreated"));
        try {
            this.a.onActivityPostCreated(activity, bundle);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostDestroyed(Activity activity) {
        if (!akqj.u()) {
            akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostDestroyed"));
            try {
                this.a.onActivityPostDestroyed(activity);
                b.close();
                return;
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        this.a.onActivityPostDestroyed(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(Activity activity) {
        if (akqj.u()) {
            this.a.onActivityPostPaused(activity);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostPaused"));
        try {
            this.a.onActivityPostPaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        if (akqj.u()) {
            this.a.onActivityPostResumed(activity);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostResumed"));
        try {
            this.a.onActivityPostResumed(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
        if (akqj.u()) {
            this.a.onActivityPostSaveInstanceState(activity, bundle);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostSaveInstanceState"));
        try {
            this.a.onActivityPostSaveInstanceState(activity, bundle);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        if (akqj.u()) {
            this.a.onActivityPostStarted(activity);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostStarted"));
        try {
            this.a.onActivityPostStarted(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(Activity activity) {
        if (akqj.u()) {
            this.a.onActivityPostStopped(activity);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPostStopped"));
        try {
            this.a.onActivityPostStopped(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        if (!akqj.u()) {
            akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreCreated"));
            try {
                this.a.onActivityPreCreated(activity, bundle);
                b.close();
                return;
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        this.a.onActivityPreCreated(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        if (akqj.u()) {
            this.a.onActivityPreDestroyed(activity);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreDestroyed"));
        try {
            this.a.onActivityPreDestroyed(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        if (akqj.u()) {
            this.a.onActivityPrePaused(activity);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPrePaused"));
        try {
            this.a.onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(Activity activity) {
        if (akqj.u()) {
            this.a.onActivityPreResumed(activity);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreResumed"));
        try {
            this.a.onActivityPreResumed(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
        if (akqj.u()) {
            this.a.onActivityPreSaveInstanceState(activity, bundle);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreSaveInstanceState"));
        try {
            this.a.onActivityPreSaveInstanceState(activity, bundle);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
        if (akqj.u()) {
            this.a.onActivityPreStarted(activity);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreStarted"));
        try {
            this.a.onActivityPreStarted(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        if (akqj.u()) {
            this.a.onActivityPreStopped(activity);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityPreStopped"));
        try {
            this.a.onActivityPreStopped(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (akqj.u()) {
            this.a.onActivityResumed(activity);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityResumed"));
        try {
            this.a.onActivityResumed(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (akqj.u()) {
            this.a.onActivitySaveInstanceState(activity, bundle);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivitySaveInstanceState"));
        try {
            this.a.onActivitySaveInstanceState(activity, bundle);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (akqj.u()) {
            this.a.onActivityStarted(activity);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityStarted"));
        try {
            this.a.onActivityStarted(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (akqj.u()) {
            this.a.onActivityStopped(activity);
            return;
        }
        akrc b = this.b.b(String.valueOf(activity.getClass().getName()).concat("#onActivityStopped"));
        try {
            this.a.onActivityStopped(activity);
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
