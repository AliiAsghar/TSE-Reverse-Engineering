package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adff extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ adfg b;

    public adff(adfg adfgVar) {
        this.b = adfgVar;
    }

    private final void c() {
        NetworkInfo networkInfo;
        String typeName;
        try {
            networkInfo = adwp.f((Context) this.b.b).d();
        } catch (adwk e) {
            advr.s(e, "Can't get active network info, missing permissions.", new Object[0]);
            networkInfo = null;
        }
        Integer valueOf = Integer.valueOf(this.b.a);
        if (networkInfo == null) {
            typeName = "null";
        } else {
            typeName = networkInfo.getTypeName();
        }
        advr.k("Connected state: [%s], networkType: [%s]", valueOf, typeName);
    }

    private final void d() {
        b();
        c();
    }

    protected abstract void a();

    protected abstract void b();

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        advr.c("onAvailable triggered for default network.", new Object[0]);
        d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        advr.c("onCapabilitiesChanged triggered for default network. NetworkCapabilities=%s", networkCapabilities);
        a();
        c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        advr.c("onLosing triggered for default network.", new Object[0]);
        d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        advr.c("onLost triggered for default network.", new Object[0]);
        d();
    }
}
