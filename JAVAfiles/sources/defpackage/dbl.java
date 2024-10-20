package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import defpackage.dfu;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbl implements ComponentCallbacks2 {
    final /* synthetic */ Configuration a;
    final /* synthetic */ dfu b;

    public dbl(Configuration configuration, dfu dfuVar) {
        this.a = configuration;
        this.b = dfuVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        dfu dfuVar = this.b;
        int updateFrom = this.a.updateFrom(configuration);
        Iterator it = dfuVar.a.entrySet().iterator();
        while (it.hasNext()) {
            dfu.a aVar = (dfu.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(updateFrom, aVar.b)) {
                it.remove();
            }
        }
        this.a.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    @armg
    public final void onLowMemory() {
        this.b.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.b.a();
    }
}
