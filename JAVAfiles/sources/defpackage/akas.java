package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class akas extends Service {
    private ListenableFuture a = albo.bI(null);
    private int b = -1;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        akau hB();
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = ((a) aovp.m(getApplicationContext(), a.class)).hB().e.entrySet().iterator();
        while (it.hasNext()) {
            printWriter.println((String) ((Map.Entry) it.next()).getValue());
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        long j;
        if (!this.a.isDone()) {
            akau hB = ((a) aovp.m(getApplicationContext(), a.class)).hB();
            int i = this.b;
            int b = akau.b(hB.c.get());
            if (i != b) {
                return;
            }
            do {
                j = hB.c.get();
                if (akau.b(j) != b) {
                    return;
                }
            } while (!hB.c.compareAndSet(j, akau.c(0, r1 + 1)));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ListenableFuture bI;
        int i3 = 2;
        if ((i & 2) == 0 && intent != null) {
            akau hB = ((a) aovp.m(getApplicationContext(), a.class)).hB();
            albo.N(intent.hasExtra("EXTRA_FUTURE_INDEX"), "Intent missing extra %s", intent);
            albo.N(intent.hasExtra("EXTRA_PROCESS_UUID"), "Intent missing extra %s", intent);
            albo.N(intent.hasExtra("EXTRA_PROCESS_UUID2"), "Intent missing extra %s", intent);
            UUID uuid = hB.h;
            long longExtra = intent.getLongExtra("EXTRA_PROCESS_UUID", -1L);
            long longExtra2 = intent.getLongExtra("EXTRA_PROCESS_UUID2", -1L);
            if (uuid.getMostSignificantBits() == longExtra && hB.h.getLeastSignificantBits() == longExtra2) {
                int intExtra = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
                synchronized (hB.d) {
                    bI = (SettableFuture) hB.f.get(intExtra);
                    bI.getClass();
                    if (bI != akau.b) {
                        hB.g.put(intExtra, bI);
                    }
                    hB.f.remove(intExtra);
                }
            } else {
                ((alvg) ((alvg) akau.a.g()).h("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter", "onStartCommand", 224, "AndroidFuturesServiceCounter.java")).u("Stopping service immediately, intent delivered from previous process. Old PID was %d but current PID is %d", intent.getIntExtra("EXTRA_PROCESS_PID", -1), Process.myPid());
                bI = albo.bI(null);
            }
            this.a = bI;
            this.b = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
        }
        this.a.c(new ajbz(this, i2, i3), andi.a);
        return 2;
    }
}
