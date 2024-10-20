package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingRevocationsAction;
import com.google.android.rcs.client.ims.ImsConnectionTrackerService;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rjf {
    private static final xze a = xze.g("BugleDataModel", "ProcessPendingRevocationsActionScheduler");
    private static final Random b = new Random();
    private static long c = 0;
    private static int d = 0;
    private final xnv e;
    private final rdb f;

    public rjf(xnv xnvVar, rdb rdbVar) {
        this.e = xnvVar;
        this.f = rdbVar;
    }

    public static synchronized void c() {
        synchronized (rjf.class) {
            c = 0L;
            d = 0;
        }
    }

    private final synchronized void d(boolean z) {
        long j;
        long epochMilli = this.e.f().toEpochMilli();
        long j2 = c;
        if (epochMilli > j2) {
            if (z) {
                int i = d;
                long longValue = ((Long) acpq.E().h().a()).longValue();
                long longValue2 = ((Long) acpq.E().i().a()).longValue();
                long j3 = longValue << i;
                if (j3 <= longValue2) {
                    d = i + 1;
                    longValue2 = j3;
                }
                j = Math.max((longValue2 / 2) + b.nextInt((int) r8), longValue);
            } else {
                j = 0;
            }
            c = epochMilli + j;
            rdb rdbVar = this.f;
            ImsConnectionTrackerService imsConnectionTrackerService = (ImsConnectionTrackerService) rdbVar.a.b();
            imsConnectionTrackerService.getClass();
            vqu vquVar = (vqu) rdbVar.c.b();
            vquVar.getClass();
            rjf rjfVar = (rjf) rdbVar.d.b();
            rjfVar.getClass();
            new ProcessPendingRevocationsAction(imsConnectionTrackerService, rdbVar.b, vquVar, rjfVar, rdbVar.e, rdbVar.f, rdbVar.g).F(j);
            xyo c2 = a.c();
            c2.H("scheduled next action.");
            c2.y("back off seconds", j / 1000);
            c2.q();
            return;
        }
        xyo c3 = a.c();
        c3.H("deferred.");
        c3.y("next action remaining seconds", (epochMilli - j2) / 1000);
        c3.q();
    }

    public final void a() {
        d(false);
    }

    public final void b() {
        d(true);
    }
}
