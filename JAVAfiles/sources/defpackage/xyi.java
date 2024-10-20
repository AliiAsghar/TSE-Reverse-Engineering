package defpackage;

import android.app.Activity;
import android.os.Bundle;
import j$.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xyi implements xyj {
    public static final /* synthetic */ int a = 0;
    private final Set b;
    private final Set c = new HashSet();
    private final Set d = new HashSet();
    private final Set e = new HashSet();

    public xyi(Set set) {
        this.b = set;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        akrh e = aktp.e("AppStateManagerV2#onActivityCreated");
        try {
            if (this.c.add(activity) && this.c.size() == 1) {
                Collection.EL.forEach(this.b, new xyh(3));
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.e.remove(activity) && this.e.isEmpty()) {
            Collection.EL.forEach(this.b, new xet(14));
        }
        if (this.d.remove(activity) && this.d.isEmpty()) {
            Collection.EL.forEach(this.b, new xet(17));
        }
        if (this.c.remove(activity) && this.c.isEmpty()) {
            Collection.EL.forEach(this.b, new xet(18));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.e.remove(activity) && this.e.isEmpty()) {
            Collection.EL.forEach(this.b, new xyh(1));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        akrh e = aktp.e("AppStateManagerV2#onActivityResumed");
        try {
            if (this.c.add(activity) && this.c.size() == 1) {
                Collection.EL.forEach(this.b, new xyh(4));
            }
            if (this.d.add(activity) && this.d.size() == 1) {
                Collection.EL.forEach(this.b, new xet(15));
            }
            if (this.e.add(activity) && this.e.size() == 1) {
                Collection.EL.forEach(this.b, new xet(16));
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        akrh e = aktp.e("AppStateManagerV2#onActivityStarted");
        try {
            if (this.c.add(activity) && this.c.size() == 1) {
                Collection.EL.forEach(this.b, new xyh(0));
            }
            if (this.d.add(activity) && this.d.size() == 1) {
                Collection.EL.forEach(this.b, new xyh(2));
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.e.remove(activity) && this.e.isEmpty()) {
            Collection.EL.forEach(this.b, new xet(19));
        }
        if (this.d.remove(activity) && this.d.isEmpty()) {
            Collection.EL.forEach(this.b, new xet(20));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
