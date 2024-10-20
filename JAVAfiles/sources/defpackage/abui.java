package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abui {
    public static int a = 4225;
    public static final Object b = new Object();
    public static HandlerThread c;
    private static abui k;
    public final HashMap d;
    public final Context e;
    public volatile Handler f;
    public final abva g;
    public final long h;
    private final long i;
    private volatile Executor j;
    private final hvk l;

    public abui() {
        throw null;
    }

    public static abui a(Context context) {
        synchronized (b) {
            if (k == null) {
                k = new abui(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return k;
    }

    public final ConnectionResult b(abuh abuhVar, ServiceConnection serviceConnection, String str) {
        ConnectionResult connectionResult;
        synchronized (this.d) {
            abuj abujVar = (abuj) this.d.get(abuhVar);
            if (abujVar == null) {
                abujVar = new abuj(this, abuhVar);
                abujVar.d(serviceConnection, serviceConnection);
                connectionResult = abuj.c(abujVar, str);
                this.d.put(abuhVar, abujVar);
            } else {
                this.f.removeMessages(0, abuhVar);
                if (!abujVar.a(serviceConnection)) {
                    abujVar.d(serviceConnection, serviceConnection);
                    int i = abujVar.b;
                    if (i != 1) {
                        if (i == 2) {
                            connectionResult = abuj.c(abujVar, str);
                        }
                    } else {
                        serviceConnection.onServiceConnected(abujVar.f, abujVar.d);
                    }
                    connectionResult = null;
                } else {
                    throw new IllegalStateException(hht.c(abuhVar, "Trying to bind a GmsServiceConnection that was already connected before.  config="));
                }
            }
            if (abujVar.c) {
                return ConnectionResult.a;
            }
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(-1);
            }
            return connectionResult;
        }
    }

    public final void c(ComponentName componentName, ServiceConnection serviceConnection) {
        d(new abuh(componentName, a), serviceConnection);
    }

    protected final void d(abuh abuhVar, ServiceConnection serviceConnection) {
        synchronized (this.d) {
            abuj abujVar = (abuj) this.d.get(abuhVar);
            if (abujVar != null) {
                if (abujVar.a(serviceConnection)) {
                    abujVar.a.remove(serviceConnection);
                    if (abujVar.b()) {
                        this.f.sendMessageDelayed(this.f.obtainMessage(0, abuhVar), this.i);
                    }
                } else {
                    throw new IllegalStateException(hht.c(abuhVar, "Trying to unbind a GmsServiceConnection  that was not bound before.  config="));
                }
            } else {
                throw new IllegalStateException(hht.c(abuhVar, "Nonexistent connection status for service config: "));
            }
        }
    }

    public final void e(String str, String str2, int i, ServiceConnection serviceConnection, boolean z) {
        d(new abuh(str, str2, i, z), serviceConnection);
    }

    public abui(Context context, Looper looper) {
        this.d = new HashMap();
        hvk hvkVar = new hvk(this, 3);
        this.l = hvkVar;
        this.e = context.getApplicationContext();
        this.f = new acda(looper, hvkVar);
        this.g = abva.a();
        this.i = 5000L;
        this.h = 300000L;
        this.j = null;
    }
}
