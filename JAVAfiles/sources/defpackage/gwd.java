package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwd implements gts {
    public static final String a = gsy.b("SystemAlarmDispatcher");
    final Context b;
    public final hag c;
    public final gud d;
    public final gvd e;
    final gvw f;
    final List g;
    Intent h;
    public gwb i;
    final gpx j;
    public final ico k;
    private final gui l;

    public gwd(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        gui ap = gvf.ap();
        this.l = ap;
        gvd m = gvd.m(context);
        this.e = m;
        gvf gvfVar = m.d.l;
        this.f = new gvw(applicationContext, ap);
        this.c = new hag(m.d.e);
        gud gudVar = m.g;
        this.d = gudVar;
        gpx gpxVar = m.l;
        this.j = gpxVar;
        this.k = new ico(gudVar, gpxVar);
        gudVar.a(this);
        this.g = new ArrayList();
        this.h = null;
    }

    public static final void e() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.gts
    public final void a(gyg gygVar, boolean z) {
        Intent intent = new Intent(this.b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        gvw.f(intent, gygVar);
        this.j.c.execute(new gwa(this, intent, 0, 0));
    }

    public final void b() {
        gsy.a().c(a, "Destroying SystemAlarmDispatcher");
        this.d.b(this);
        this.i = null;
    }

    public final void c() {
        e();
        PowerManager.WakeLock a2 = haa.a(this.b, "ProcessCommand");
        try {
            a2.acquire();
            this.e.l.b(new gvz(this));
        } finally {
            a2.release();
        }
    }

    public final void d(Intent intent, int i) {
        gsy a2 = gsy.a();
        String str = a;
        a2.c(str, "Adding command " + intent + " (" + i + ")");
        e();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            gsy.a();
            Log.w(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            e();
            synchronized (this.g) {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.g) {
            boolean isEmpty = this.g.isEmpty();
            this.g.add(intent);
            if (isEmpty) {
                c();
            }
        }
    }
}
