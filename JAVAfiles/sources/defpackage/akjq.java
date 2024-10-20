package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akjq implements ahvd {
    public static final ahlp c = new ahlp((byte[]) null);
    public final aegu a;
    public final AtomicLong b;
    private final Context d;
    private final akat e;
    private final aneo f;
    private final armf g;
    private final armf h;
    private final Map i;
    private final armf j;
    private final armf k;

    public akjq(Context context, akat akatVar, aegu aeguVar, aneo aneoVar, armf armfVar, armf armfVar2, Map map, armf armfVar3) {
        context.getClass();
        akatVar.getClass();
        aeguVar.getClass();
        aneoVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.d = context;
        this.e = akatVar;
        this.a = aeguVar;
        this.f = aneoVar;
        this.g = armfVar;
        this.h = armfVar2;
        this.i = map;
        this.j = armfVar3;
        this.b = new AtomicLong(-1L);
        this.k = new ahjy(8);
    }

    public static final ActivityManager.RunningAppProcessInfo d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    private final void e(final String str, long j, final boolean z) {
        final long millis = this.a.e().toMillis() + TimeUnit.SECONDS.toMillis(j);
        this.e.f(this.f.schedule(new Callable() { // from class: akjn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final akjq akjqVar = akjq.this;
                final long j2 = millis;
                final String str2 = str;
                int i = Build.VERSION.SDK_INT;
                final boolean z2 = z;
                if (i >= 30) {
                    Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: akjo
                        @Override // android.os.MessageQueue.IdleHandler
                        public final boolean queueIdle() {
                            akjq.this.b(j2, str2, z2);
                            return false;
                        }
                    });
                    aiut.e(new zth(20));
                    return null;
                }
                akjqVar.b(j2, str2, z2);
                return null;
            }
        }, j, TimeUnit.SECONDS), 1L, TimeUnit.DAYS);
    }

    @Override // defpackage.ahvd
    public final void a() {
        ahvd ahvdVar;
        String str = (String) this.h.b();
        if (!this.i.isEmpty()) {
            if (str != null) {
                armf armfVar = (armf) this.i.get(str);
                if (armfVar != null && (ahvdVar = (ahvd) armfVar.b()) != null) {
                    ahvdVar.a();
                    return;
                }
            } else {
                return;
            }
        }
        if (this.b.compareAndSet(-1L, this.a.a())) {
            if (Build.VERSION.SDK_INT >= 34 && ((Boolean) ((algw) ((apxx) this.j).a).d(false)).booleanValue()) {
                this.d.registerComponentCallbacks(new akjp(this));
            }
            long longValue = ((Number) this.k.b()).longValue();
            if (longValue <= TimeUnit.DAYS.toSeconds(30L)) {
                Log.w("TimedProcessReaper", "Scheduling killing of process to refresh configuration");
                e(str, longValue, false);
            }
        }
    }

    public final void b(long j, String str, boolean z) {
        long abs = Math.abs(this.a.e().toMillis() - j);
        boolean c2 = c(d().importance);
        if (abs <= 60000) {
            if (!c2) {
                Log.w("TimedProcessReaper", "Killing process to refresh configuration");
                Process.killProcess(Process.myPid());
                albo.bZ();
            }
            Log.d("TimedProcessReaper", "Attempted to reap process, but was too important");
            e(str, ((Number) this.k.b()).longValue(), false);
            return;
        }
        Log.d("TimedProcessReaper", "Attempted to reap process, but schedule tolerance was exceeded");
        if (z) {
            Log.d("TimedProcessReaper", "Rescheduling process reaping after pollDuration");
            e(str, ((Number) this.k.b()).longValue(), false);
        } else {
            Log.d("TimedProcessReaper", "Rescheduling process reaping with expedited retry");
            e(str, 60L, true);
        }
    }

    public final boolean c(int i) {
        Log.w("TimedProcessReaper", a.bV(i, "Memory state is: "));
        if (i < ((Number) ((algw) ((apxx) this.g).a).d(400)).intValue()) {
            return true;
        }
        return false;
    }
}
