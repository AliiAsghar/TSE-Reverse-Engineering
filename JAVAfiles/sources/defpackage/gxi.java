package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxi extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ gxj a;

    public gxi(gxj gxjVar) {
        this.a = gxjVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        gwm a;
        network.getClass();
        networkCapabilities.getClass();
        gsy a2 = gsy.a();
        String str = gxk.a;
        Objects.toString(networkCapabilities);
        a2.c(str, "Network capabilities changed: ".concat(networkCapabilities.toString()));
        if (Build.VERSION.SDK_INT >= 28) {
            a = new gwm(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18));
        } else {
            a = gxk.a(this.a.e);
        }
        this.a.f(a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        gsy.a().c(gxk.a, "Network connection lost");
        gxj gxjVar = this.a;
        gxjVar.f(gxk.a(gxjVar.e));
    }
}
