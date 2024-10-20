package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpf implements ServiceConnection {
    public int a = 0;
    public final Messenger b = new Messenger(new acda(Looper.getMainLooper(), new hvk(this, 2, null)));
    public final Queue c = new ArrayDeque();
    public final SparseArray d = new SparseArray();
    public final /* synthetic */ aixx e;
    public znp f;

    public abpf(aixx aixxVar) {
        this.e = aixxVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    public final void a() {
        this.e.c.execute(new aaxu(this, 12));
    }

    public final synchronized void b() {
        if (this.a == 1) {
            g("Timed out while binding");
        }
    }

    public final synchronized void c(int i) {
        abph abphVar = (abph) this.d.get(i);
        if (abphVar != null) {
            Log.w("MessengerIpcClient", a.bV(i, "Timing out request: "));
            this.d.remove(i);
            abphVar.c(new abpi("Timed out waiting for response"));
            d();
        }
    }

    public final synchronized void d() {
        if (this.a == 2 && this.c.isEmpty() && this.d.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            abva.a().b((Context) this.e.b, this);
        }
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    public final synchronized boolean e(abph abphVar) {
        int i = this.a;
        boolean z = false;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                this.c.add(abphVar);
                a();
                return true;
            }
            this.c.add(abphVar);
            return true;
        }
        this.c.add(abphVar);
        if (this.a == 0) {
            z = true;
        }
        abhg.h(z);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!abva.a().c((Context) this.e.b, intent, this, 1)) {
                g("Unable to bind to service");
            } else {
                this.e.c.schedule(new aaxu(this, 13), 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            f("Unable to bind to service", e);
        }
        return true;
    }

    final synchronized void f(String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
        }
        int i = this.a;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            abva.a().b((Context) this.e.b, this);
            abpi abpiVar = new abpi(str, th);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((abph) it.next()).c(abpiVar);
            }
            this.c.clear();
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                ((abph) this.d.valueAt(i2)).c(abpiVar);
            }
            this.d.clear();
            return;
        }
        throw new IllegalStateException();
    }

    public final synchronized void g(String str) {
        f(str, null);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        aixx aixxVar = this.e;
        aixxVar.c.execute(new aanh(this, iBinder, 14, null));
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        aixx aixxVar = this.e;
        aixxVar.c.execute(new aaxu(this, 14));
    }
}
