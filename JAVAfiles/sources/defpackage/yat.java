package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yat extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ ahjj a;

    public yat(ahjj ahjjVar) {
        this.a = ahjjVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        ((yav) this.a.a).z(network);
        if (((wpc) ((yav) this.a.a).p.get()).equals(wpc.b)) {
            ((yav) this.a.a).B(2);
        } else if (((wpc) ((yav) this.a.a).q.get()).equals(wpc.b) && ((wpc) ((yav) this.a.a).p.get()).equals(wpc.c)) {
            ((yav) this.a.a).B(3);
        }
    }
}
