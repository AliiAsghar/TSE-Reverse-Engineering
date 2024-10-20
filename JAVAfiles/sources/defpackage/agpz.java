package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agpz extends BroadcastReceiver {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Context b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ dtq d;

    public agpz(AtomicBoolean atomicBoolean, Context context, Runnable runnable, dtq dtqVar) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = runnable;
        this.d = dtqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            this.b.unregisterReceiver(this);
            this.c.run();
            this.d.b(null);
        }
    }
}
