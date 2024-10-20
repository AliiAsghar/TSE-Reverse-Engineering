package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adva {
    private final yjy a;
    private final Object b = new Object();
    private ConnectivityManager.NetworkCallback c = null;
    private final adwp d;

    public adva(Context context, yjy yjyVar) {
        this.d = adwp.f(context);
        this.a = yjyVar;
    }

    public final Network a() {
        this.a.i();
        Network network = null;
        if (!this.a.i().E()) {
            return null;
        }
        SettableFuture create = SettableFuture.create();
        NetworkRequest build = new NetworkRequest.Builder().addTransportType(0).addCapability(12).build();
        try {
            synchronized (this.b) {
                aduz aduzVar = new aduz(create);
                this.c = aduzVar;
                try {
                    ((ConnectivityManager) this.d.a).requestNetwork(build, aduzVar);
                } catch (SecurityException e) {
                    throw new adwk("ACCESS_NETWORK_STATE permission is missing.", e);
                }
            }
            network = (Network) create.get(10L, TimeUnit.SECONDS);
        } catch (adwk e2) {
            advr.i(e2, "Do not have required permission to get mobile network.", new Object[0]);
        } catch (TimeoutException e3) {
            advr.i(e3, "Timeout when trying to get mobile network.", new Object[0]);
        } catch (Exception e4) {
            advr.i(e4, "Exception when trying to get mobile network.", new Object[0]);
        }
        advr.o("Got mobile network: %s", network);
        if (network == null) {
            b();
        }
        return network;
    }

    public final void b() {
        synchronized (this.b) {
            ConnectivityManager.NetworkCallback networkCallback = this.c;
            if (networkCallback != null) {
                try {
                    this.d.h(networkCallback);
                } catch (Exception e) {
                    advr.i(e, "Exception when trying close network.", new Object[0]);
                }
                this.c = null;
            }
        }
    }
}
