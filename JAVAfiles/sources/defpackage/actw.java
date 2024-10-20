package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class actw {
    public actv a;
    private final BroadcastReceiver b = new actu(this);
    private final Context c;
    private final AlarmManager d;
    private final String e;
    private long f;

    protected actw(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.e = str;
        this.d = (AlarmManager) applicationContext.getSystemService("alarm");
    }

    public static actw a(Context context, String str) {
        return new actw(context, str.replaceAll("[(): ]", ""));
    }

    public final synchronized void b() {
        actv actvVar = this.a;
        if (actvVar != null) {
            advr.c("Cancelling task %s", actvVar.a.getName());
            c();
        }
    }

    public final void c() {
        actv actvVar = this.a;
        if (actvVar != null) {
            this.d.cancel(actvVar.c);
            this.a = null;
            try {
                this.c.unregisterReceiver(this.b);
            } catch (Exception e) {
                advr.i(e, "Error unregistering broadcast receiver", new Object[0]);
            }
        }
    }

    public final synchronized void d(Thread thread, long j) {
        if (thread != null) {
            b();
            advr.c("%s: Scheduling task \"%s\" for execution in %ds", this.e, thread.getName(), Long.valueOf(j));
            actv actvVar = new actv();
            actvVar.a = thread;
            actvVar.b = this.e + "." + thread.getName().replace(' ', '.');
            actvVar.c = PendingIntent.getBroadcast(this.c, 0, new Intent(actvVar.b), 201326592);
            this.a = actvVar;
            egl.h(this.c, this.b, new IntentFilter(actvVar.b));
            actv actvVar2 = this.a;
            if (actvVar2 != null && actvVar2.c != null) {
                this.f = agkx.W().longValue() + TimeUnit.SECONDS.toMillis(j);
                advr.c("Setting alarm for post-M devices", new Object[0]);
                actv actvVar3 = this.a;
                if (actvVar3 != null) {
                    this.d.setExactAndAllowWhileIdle(0, this.f, actvVar3.c);
                    return;
                }
                return;
            }
            advr.g("PendingIntent for task %s is null, alarm won't be set", actvVar2.a);
            return;
        }
        throw new IllegalArgumentException("Task cannot be null!");
    }

    public final synchronized boolean e() {
        if (this.a != null) {
            return true;
        }
        return false;
    }
}
