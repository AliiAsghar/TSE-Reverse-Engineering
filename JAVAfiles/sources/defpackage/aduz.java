package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aduz extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ SettableFuture a;

    public aduz(SettableFuture settableFuture) {
        this.a = settableFuture;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.set(network);
    }
}
