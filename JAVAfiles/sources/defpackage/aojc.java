package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aojc implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue d;
    private aojb e;
    private boolean f;

    public aojc(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new aglj("Firebase-FirebaseInstanceIdServiceConnection", 1));
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    private final void b() {
        while (!this.d.isEmpty()) {
            ((asmb) this.d.poll()).u();
        }
    }

    private final synchronized void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            aojb aojbVar = this.e;
            if (aojbVar != null && aojbVar.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                asmb asmbVar = (asmb) this.d.poll();
                aojb aojbVar2 = this.e;
                if (Binder.getCallingUid() == Process.myUid()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "service received new intent via bind strategy");
                    }
                    ((aoif) aojbVar2.a.a).d((Intent) asmbVar.b).n(new aoil(2), new uyb(asmbVar, 13));
                } else {
                    throw new SecurityException("Binding only allowed within app");
                }
            } else {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is dead. start connection? " + (!this.f));
                }
                if (!this.f) {
                    this.f = true;
                    try {
                    } catch (SecurityException e) {
                        Log.e("FirebaseMessaging", "Exception while binding the service", e);
                    }
                    if (!abva.a().c(this.a, this.b, this, 65)) {
                        Log.e("FirebaseMessaging", "binding to the service failed");
                        this.f = false;
                        b();
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized acir a(Intent intent) {
        asmb asmbVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        asmbVar = new asmb(intent);
        ScheduledExecutorService scheduledExecutorService = this.c;
        asmbVar.t().n(scheduledExecutorService, new uyb(scheduledExecutorService.schedule(new akwm(asmbVar, 16), 20L, TimeUnit.SECONDS), 14));
        this.d.add(asmbVar);
        c();
        return asmbVar.t();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: ".concat(String.valueOf(String.valueOf(componentName))));
        }
        this.f = false;
        if (!(iBinder instanceof aojb)) {
            Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(String.valueOf(iBinder))));
            b();
        } else {
            this.e = (aojb) iBinder;
            c();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: ".concat(String.valueOf(String.valueOf(componentName))));
        }
        c();
    }
}
