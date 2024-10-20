package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwn extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ akju a;

    public hwn(akju akjuVar) {
        this.a = akjuVar;
    }

    private final void a(boolean z) {
        hyv.j(new hwm(this, z, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        a(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        a(false);
    }
}
