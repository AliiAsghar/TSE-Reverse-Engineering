package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybu extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int b = 0;
    public int a = 1;

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        ((alwl) ybv.a.m().h("com/google/android/apps/messaging/shared/util/connectivity/SingleRegistrationImsConnectivityProvider$ImsNetworkCallback", "onAvailable", 92, "SingleRegistrationImsConnectivityProvider.java")).q("ImsNetworkCallback#onAvailable - Single Reg IMS network is ready for use.");
        this.a = 2;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        int i;
        ((alwl) ybv.a.m().h("com/google/android/apps/messaging/shared/util/connectivity/SingleRegistrationImsConnectivityProvider$ImsNetworkCallback", "onBlockedStatusChanged", 99, "SingleRegistrationImsConnectivityProvider.java")).t("ImsNetworkCallback#onBlockedStatusChanged - Single Reg IMS network blocked=%b", Boolean.valueOf(z));
        if (true != z) {
            i = 2;
        } else {
            i = 3;
        }
        this.a = i;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        ((alwl) ybv.a.m().h("com/google/android/apps/messaging/shared/util/connectivity/SingleRegistrationImsConnectivityProvider$ImsNetworkCallback", "onLost", 107, "SingleRegistrationImsConnectivityProvider.java")).q("ImsNetworkCallback#onLost - Single Reg IMS network lost.");
        this.a = 3;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        ((alwl) ybv.a.m().h("com/google/android/apps/messaging/shared/util/connectivity/SingleRegistrationImsConnectivityProvider$ImsNetworkCallback", "onUnavailable", 113, "SingleRegistrationImsConnectivityProvider.java")).q("ImsNetworkCallback#onUnavailable - Single Reg IMS network unavailable.");
        this.a = 3;
    }
}
