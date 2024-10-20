package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpn {
    public static final Executor a = new sp(13);
    public static final Pattern b = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private static int h;
    private static PendingIntent i;
    public final Context d;
    public Messenger e;
    public CloudMessagingMessengerCompat f;
    public final atkt g;
    private final ScheduledExecutorService j;
    public final vl c = new vl();
    private final Messenger k = new Messenger(new abpm(this, Looper.getMainLooper()));

    public abpn(Context context) {
        this.d = context;
        this.g = new atkt(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.j = scheduledThreadPoolExecutor;
    }

    public static boolean d(Bundle bundle) {
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return true;
        }
        return false;
    }

    private static synchronized String e() {
        String num;
        synchronized (abpn.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    private static synchronized void f(Context context, Intent intent) {
        synchronized (abpn.class) {
            if (i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                i = accy.b(context, intent2, accy.a);
            }
            intent.putExtra("app", i);
        }
    }

    public final acir a(Bundle bundle) {
        String e = e();
        acit acitVar = new acit();
        synchronized (this.c) {
            this.c.put(e, acitVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.g.r() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        f(this.d, intent);
        intent.putExtra("kid", a.bW(e, "|ID|", "|"));
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(String.valueOf(intent.getExtras()))));
        }
        intent.putExtra("google.messenger", this.k);
        if (this.e != null || this.f != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.e;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            ScheduledFuture<?> schedule = this.j.schedule(new aaxu(acitVar, 15), 30L, TimeUnit.SECONDS);
            ((acir) acitVar.a).n(a, new abpl(this, e, schedule, 0));
            return (acir) acitVar.a;
        }
        if (this.g.r() == 2) {
            this.d.sendBroadcast(intent);
        } else {
            this.d.startService(intent);
        }
        ScheduledFuture<?> schedule2 = this.j.schedule(new aaxu(acitVar, 15), 30L, TimeUnit.SECONDS);
        ((acir) acitVar.a).n(a, new abpl(this, e, schedule2, 0));
        return (acir) acitVar.a;
    }

    public final acir b(Bundle bundle) {
        if (this.g.q() < 12000000) {
            if (this.g.r() != 0) {
                return a(bundle).d(a, new abpk(this, bundle, 0));
            }
            return actx.r(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        aixx d = aixx.d(this.d);
        return d.c(new abpj(d.a(), bundle)).b(a, new acca(1));
    }

    public final void c(String str, Bundle bundle) {
        synchronized (this.c) {
            acit acitVar = (acit) this.c.remove(str);
            if (acitVar == null) {
                Log.w("Rpc", a.cp(str, "Missing callback for "));
            } else {
                acitVar.b(bundle);
            }
        }
    }
}
