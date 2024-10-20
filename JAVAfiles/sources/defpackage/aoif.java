package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aoif extends Service {
    private Binder a;
    private final Object b;
    private int c;
    private int d;
    final ExecutorService h;

    public aoif() {
        abgj abgjVar = accz.a;
        this.h = abgj.q(new aglj("Firebase-Messaging-Intent-Handle", 1));
        this.b = new Object();
        this.d = 0;
    }

    public final acir d(Intent intent) {
        acit acitVar = new acit();
        this.h.execute(new aofo(this, intent, acitVar, 2));
        return (acir) acitVar.a;
    }

    public final void e(Intent intent) {
        if (intent != null) {
            aoja.b(intent);
        }
        synchronized (this.b) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                stopSelfResult(this.c);
            }
        }
    }

    public abstract void f(Intent intent);

    protected Intent g() {
        throw null;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.a == null) {
            this.a = new aojb(new asqc(this, null));
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.h.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.b) {
            this.c = i2;
            this.d++;
        }
        Intent g = g();
        if (g == null) {
            e(intent);
            return 2;
        }
        acir d = d(g);
        if (d.k()) {
            e(intent);
            return 2;
        }
        d.n(new sp(20), new aoie(this, intent, 0));
        return 3;
    }
}
