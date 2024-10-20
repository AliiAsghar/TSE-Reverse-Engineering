package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kan extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ kao a;

    public kan(kao kaoVar) {
        this.a = kaoVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        ((AtomicBoolean) this.a.a).set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        ((AtomicBoolean) this.a.a).set(false);
    }
}
