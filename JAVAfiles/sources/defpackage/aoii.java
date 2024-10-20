package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoii implements Application.ActivityLifecycleCallbacks {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent != null && this.a.add(intent)) {
            Bundle bundle2 = null;
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    bundle2 = extras.getBundle("gcm.n.analytics_data");
                }
            } catch (RuntimeException e) {
                Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
            }
            if (aode.am(bundle2)) {
                if (bundle2 != null) {
                    if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                        aodp aodpVar = (aodp) aodi.b().d(aodp.class);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                        }
                        if (aodpVar != null) {
                            String string = bundle2.getString("google.c.a.c_id");
                            aodpVar.b();
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("source", "Firebase");
                            bundle3.putString("medium", "notification");
                            bundle3.putString("campaign", string);
                            aodpVar.a();
                        } else {
                            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                        }
                    } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                    }
                }
                aode.aj("_no", bundle2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.a.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
