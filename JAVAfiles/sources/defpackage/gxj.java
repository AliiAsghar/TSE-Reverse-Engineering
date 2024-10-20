package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxj extends gxg {
    public final ConnectivityManager e;
    private final gxi f;

    public gxj(Context context, gpx gpxVar) {
        super(context, gpxVar);
        Object systemService = this.a.getSystemService("connectivity");
        systemService.getClass();
        this.e = (ConnectivityManager) systemService;
        this.f = new gxi(this);
    }

    @Override // defpackage.gxg
    public final /* bridge */ /* synthetic */ Object b() {
        return gxk.a(this.e);
    }

    @Override // defpackage.gxg
    public final void d() {
        try {
            gsy.a().c(gxk.a, "Registering network callback");
            ConnectivityManager connectivityManager = this.e;
            gxi gxiVar = this.f;
            gxiVar.getClass();
            connectivityManager.registerDefaultNetworkCallback(gxiVar);
        } catch (IllegalArgumentException e) {
            gsy.a();
            Log.e(gxk.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            gsy.a();
            Log.e(gxk.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.gxg
    public final void e() {
        try {
            gsy.a().c(gxk.a, "Unregistering network callback");
            ConnectivityManager connectivityManager = this.e;
            gxi gxiVar = this.f;
            gxiVar.getClass();
            connectivityManager.unregisterNetworkCallback(gxiVar);
        } catch (IllegalArgumentException e) {
            gsy.a();
            Log.e(gxk.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            gsy.a();
            Log.e(gxk.a, "Received exception while unregistering network callback", e2);
        }
    }
}
