package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class upg extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ uph a;
    final /* synthetic */ ConnectivityManager b;

    public upg(uph uphVar, ConnectivityManager connectivityManager) {
        this.a = uphVar;
        this.b = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        ascd ascdVar;
        Object c;
        aros arosVar;
        ascd ascdVar2;
        Object c2;
        aros arosVar2;
        network.getClass();
        if (((ansy) ((pqn) this.a.b).a.b()).e("bugle.handle_network_with_null_capabilities")) {
            NetworkCapabilities networkCapabilities = this.b.getNetworkCapabilities(network);
            if (networkCapabilities != null) {
                this.a.d.h(arnb.a);
                uph uphVar = this.a;
                do {
                    ascdVar2 = uphVar.c;
                    c2 = ascdVar2.c();
                    arosVar2 = new aros();
                    arosVar2.putAll((Map) c2);
                    arosVar2.put(Long.valueOf(network.getNetworkHandle()), networkCapabilities);
                } while (!ascdVar2.g(c2, arosVar2.e()));
                return;
            }
            return;
        }
        this.a.d.h(arnb.a);
        uph uphVar2 = this.a;
        ConnectivityManager connectivityManager = this.b;
        do {
            ascdVar = uphVar2.c;
            c = ascdVar.c();
            arosVar = new aros();
            arosVar.putAll((Map) c);
            Long valueOf = Long.valueOf(network.getNetworkHandle());
            NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(network);
            networkCapabilities2.getClass();
            arosVar.put(valueOf, networkCapabilities2);
        } while (!ascdVar.g(c, arosVar.e()));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        ascd ascdVar;
        Object c;
        aros arosVar;
        network.getClass();
        networkCapabilities.getClass();
        this.a.d.h(arnb.a);
        do {
            ascdVar = this.a.c;
            c = ascdVar.c();
            arosVar = new aros();
            arosVar.putAll((Map) c);
            arosVar.put(Long.valueOf(network.getNetworkHandle()), networkCapabilities);
        } while (!ascdVar.g(c, arosVar.e()));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        ascd ascdVar;
        Object c;
        aros arosVar;
        network.getClass();
        do {
            ascdVar = this.a.c;
            c = ascdVar.c();
            arosVar = new aros();
            arosVar.putAll((Map) c);
            arosVar.remove(Long.valueOf(network.getNetworkHandle()));
        } while (!ascdVar.g(c, arosVar.e()));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        this.a.d.h(arnb.a);
    }
}
