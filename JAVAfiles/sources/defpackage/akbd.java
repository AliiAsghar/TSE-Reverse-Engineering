package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akbd {
    public static final alvi a = alvi.m("com/google/apps/tiktok/concurrent/ForegroundServiceTracker");
    public final akaw e;
    public Service h;
    public int i;
    public akba j;
    private final Context k;
    private final Executor l;
    private final NotificationManager m;
    private final akaz n;
    private final Class o;
    private final Runnable p;
    public final Object b = new Object();
    public final IdentityHashMap c = new IdentityHashMap(10);
    public final alnn d = new alnn();
    public final alsj f = new alno();
    public akbc g = akbc.STOPPED;

    public akbd(Context context, akaw akawVar, aneo aneoVar, NotificationManager notificationManager, akaz akazVar, Class cls) {
        this.k = context;
        this.e = akawVar;
        this.l = new anew(aneoVar);
        this.n = akazVar;
        this.m = notificationManager;
        this.o = cls;
        this.p = new ajnt(this, aneoVar, 9, (byte[]) null);
    }

    private final int g() {
        if (this.f.isEmpty()) {
            return this.n.a();
        }
        Iterator it = this.f.i().iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((Integer) it.next()).intValue();
        }
        return i;
    }

    public final akba a(akba akbaVar) {
        albo.U(!this.c.isEmpty(), "Can't select a best notification if thare are none");
        akba akbaVar2 = null;
        for (akba akbaVar3 : this.c.values()) {
            if (akbaVar2 != null) {
                int i = akbaVar3.b;
                int i2 = akbaVar2.b;
                if (i2 >= i) {
                    if (akbaVar == akbaVar3 && i2 == akbaVar.b) {
                    }
                }
            }
            akbaVar2 = akbaVar3;
        }
        return akbaVar2;
    }

    public final void b(Notification notification) {
        boolean z;
        if (this.g == akbc.STOPPED) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        Intent intent = new Intent(this.k, (Class<?>) this.o);
        intent.putExtra("fallback_notification", notification);
        this.g = akbc.STARTING;
        this.k.startForegroundService(intent);
    }

    public final void c(Service service, Notification notification) {
        if (Build.VERSION.SDK_INT < 29) {
            service.startForeground(174344743, notification);
            return;
        }
        int g = g();
        if (g == 0) {
            ((alvg) ((alvg) a.g()).h("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "startShortService", 370, "ForegroundServiceTracker.java")).q("starting foregroundService with type=none");
            g = 0;
        }
        service.startForeground(174344743, notification, g);
    }

    public final void d() {
        boolean z;
        akbc akbcVar = this.g;
        if (akbcVar == akbc.STARTED) {
            z = true;
        } else {
            z = false;
        }
        albo.X(z, "Destroyed in wrong state %s", akbcVar);
        this.g = akbc.STOPPED;
        this.h.stopForeground(true);
        this.j = null;
        this.h.stopSelf(this.i);
        this.h = null;
    }

    public final void e(akba akbaVar) {
        Service service;
        int foregroundServiceType;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && (service = this.h) != null) {
            foregroundServiceType = service.getForegroundServiceType();
            if (foregroundServiceType != g()) {
                z = true;
            }
        }
        akba akbaVar2 = this.j;
        akba a2 = a(akbaVar);
        this.j = a2;
        if (!z && akbaVar2 == a2) {
            return;
        }
        c(this.h, a2.a);
    }

    public final void f(ListenableFuture listenableFuture, Notification notification, int i) {
        boolean areNotificationsEnabled;
        String channelId;
        NotificationChannel notificationChannel;
        int importance;
        int importance2;
        if (listenableFuture.isDone()) {
            return;
        }
        areNotificationsEnabled = this.m.areNotificationsEnabled();
        if (!areNotificationsEnabled) {
            ((alvg) ((alvg) a.i()).h("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "attachForegroundService", 182, "ForegroundServiceTracker.java")).q("User disabled notifications for app");
        }
        NotificationManager notificationManager = this.m;
        channelId = notification.getChannelId();
        notificationChannel = notificationManager.getNotificationChannel(channelId);
        importance = notificationChannel.getImportance();
        importance2 = notificationChannel.getImportance();
        if (importance2 < 2) {
            ((alvg) ((alvg) a.i()).h("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "attachForegroundService", 190, "ForegroundServiceTracker.java")).q("User blocked notification channel");
        }
        notification.category = "service";
        notification.flags |= 256;
        notification.flags |= 34;
        akba akbaVar = new akba(notification, importance, aktp.c());
        synchronized (this.b) {
            this.f.add(Integer.valueOf(i));
            this.d.q(listenableFuture, aktr.b());
            akba akbaVar2 = (akba) this.c.get(listenableFuture);
            if (akbaVar2 == null) {
                listenableFuture.c(new wob(this, listenableFuture, i, 15, (byte[]) null), this.l);
                this.c.put(listenableFuture, akbaVar);
            } else if (akbaVar2.b <= akbaVar.b) {
                this.c.put(listenableFuture, akbaVar);
            }
            akaw akawVar = this.e;
            Runnable runnable = this.p;
            synchronized (akawVar.a) {
                akawVar.b.add(runnable);
            }
            if (!this.e.b()) {
                int ordinal = this.g.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 2) {
                        e(this.j);
                    }
                } else {
                    b(akbaVar.a);
                }
            }
        }
    }
}
