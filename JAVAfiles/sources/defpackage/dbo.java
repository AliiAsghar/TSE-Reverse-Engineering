package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbo implements ComponentCallbacks2 {
    final /* synthetic */ dfx a;

    public dbo(dfx dfxVar) {
        this.a = dfxVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.a();
    }

    @Override // android.content.ComponentCallbacks
    @armg
    public final void onLowMemory() {
        this.a.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.a.a();
    }
}
