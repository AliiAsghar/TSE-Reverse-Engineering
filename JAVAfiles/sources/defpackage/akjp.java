package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Process;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akjp implements ComponentCallbacks2 {
    final /* synthetic */ akjq a;

    public akjp(akjq akjqVar) {
        this.a = akjqVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 40 && !this.a.c(akjq.d().importance)) {
            Log.w("TimedProcessReaper", a.cb(i, "onTrimMemory=", ". Killing process to refresh configuration"));
            Process.killProcess(Process.myPid());
            albo.bZ();
        }
    }

    @Override // android.content.ComponentCallbacks
    @armg
    public final void onLowMemory() {
    }
}
