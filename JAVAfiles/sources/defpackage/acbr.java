package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbr implements ServiceConnection {
    int a = 0;
    final Messenger b = new Messenger(new acda(Looper.getMainLooper(), new hvk(this, 4, null)));
    final Queue c = new ArrayDeque();
    public final SparseArray d = new SparseArray();
    final /* synthetic */ ajvj e;
    acak f;

    public acbr(ajvj ajvjVar) {
        this.e = ajvjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
        }
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
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
            acbt acbtVar = new acbt(i, str);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((acbs) it.next()).a(acbtVar);
            }
            this.c.clear();
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                ((acbs) this.d.valueAt(i3)).a(acbtVar);
            }
            this.d.clear();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    final void b() {
        this.e.d.execute(new acbq(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final synchronized void d(int i) {
        acbs acbsVar = (acbs) this.d.get(i);
        if (acbsVar != null) {
            Log.w("MessengerIpcClient", a.bV(i, "Timing out request: "));
            this.d.remove(i);
            acbsVar.a(new acbt(3, "Timed out waiting for response"));
            e();
        }
    }

    public final synchronized void e() {
        if (this.a == 2 && this.c.isEmpty() && this.d.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            abva.a().b((Context) this.e.b, this);
        }
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    public final synchronized boolean f(acbs acbsVar) {
        boolean z;
        int i = this.a;
        int i2 = 0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                this.c.add(acbsVar);
                b();
                return true;
            }
            this.c.add(acbsVar);
            return true;
        }
        this.c.add(acbsVar);
        if (this.a == 0) {
            z = true;
        } else {
            z = false;
        }
        abhg.h(z);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        if (!abva.a().c((Context) this.e.b, intent, this, 1)) {
            a(0, "Unable to bind to service");
        } else {
            this.e.d.schedule(new acbq(this, i2), 30L, TimeUnit.SECONDS);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            a(0, "Null service connection");
            return;
        }
        try {
            this.f = new acak(iBinder);
            this.a = 2;
            b();
        } catch (RemoteException e) {
            a(0, e.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        a(2, "Service disconnected");
    }
}
