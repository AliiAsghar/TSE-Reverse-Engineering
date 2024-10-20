package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybv {
    public static final alwo a = alwo.o("BugleNetwork");
    public final adwu b;
    public final ybu c;
    public final armf d;
    private final Context e;
    private boolean f = false;

    public ybv(Context context, ybu ybuVar, adwu adwuVar, armf armfVar) {
        this.e = context;
        this.c = ybuVar;
        this.b = adwuVar;
        this.d = armfVar;
    }

    public final synchronized void a() {
        if (this.f) {
            return;
        }
        adwp f = adwp.f(this.e);
        try {
            try {
                ((ConnectivityManager) f.a).registerNetworkCallback(new NetworkRequest.Builder().addCapability(4).build(), this.c);
                this.f = true;
            } catch (SecurityException e) {
                throw new adwk("ACCESS_NETWORK_STATE permission is missing.", e);
            }
        } catch (adwk unused) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/util/connectivity/SingleRegistrationImsConnectivityProvider", "initialize", 140, "SingleRegistrationImsConnectivityProvider.java")).q("Failed to register network callback due to lacking permissions.");
        }
    }
}
