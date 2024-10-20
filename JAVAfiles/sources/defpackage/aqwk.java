package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqwk extends aquc {
    public final aquc a;
    public final Context b;
    public final ConnectivityManager c;
    private final Object d = new Object();
    private Runnable e;

    public aqwk(aquc aqucVar, Context context) {
        this.a = aqucVar;
        this.b = context;
        if (context != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            this.c = connectivityManager;
            try {
                if (connectivityManager != null) {
                    aqwi aqwiVar = new aqwi(this);
                    connectivityManager.registerDefaultNetworkCallback(aqwiVar);
                    this.e = new aqwh(this, aqwiVar, 1);
                    return;
                } else {
                    aqwj aqwjVar = new aqwj(this);
                    context.registerReceiver(aqwjVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.e = new aqwh(this, aqwjVar, 0);
                    return;
                }
            } catch (SecurityException e) {
                Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e);
                return;
            }
        }
        this.c = null;
    }

    @Override // defpackage.aqrs
    public final aqru a(aqux aquxVar, aqrr aqrrVar) {
        return this.a.a(aquxVar, aqrrVar);
    }

    @Override // defpackage.aqrs
    public final String b() {
        return this.a.b();
    }

    @Override // defpackage.aquc
    public final aquc d() {
        synchronized (this.d) {
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
                this.e = null;
            }
        }
        return this.a.d();
    }

    @Override // defpackage.aquc
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.aquc
    public final aqsd f() {
        return this.a.f();
    }
}
