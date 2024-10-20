package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwj extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ arxm a;
    final /* synthetic */ arzu b;

    public gwj(arxm arxmVar, arzu arzuVar) {
        this.a = arxmVar;
        this.b = arzuVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        this.a.v(null);
        gsy.a().c(gwp.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.b.c(gwh.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        this.a.v(null);
        gsy.a().c(gwp.a, "NetworkRequestConstraintController onLost callback");
        this.b.c(new gwi(7));
    }
}
