package defpackage;

import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aduk {
    public static final /* synthetic */ int f = 0;
    private static final long g = TimeUnit.MINUTES.toMillis(1);
    public final actw a;
    public final advp c;
    public Thread d;
    private final aneo h;
    public final PriorityQueue b = new PriorityQueue();
    public final AtomicReference e = new AtomicReference();

    public aduk(advp advpVar, actw actwVar, aneo aneoVar) {
        this.c = advpVar.b("ImsRefreshableManager");
        this.a = actwVar;
        this.h = aneoVar;
    }

    private final void c() {
        if (yhx.d) {
            if (this.e.get() == null) {
                advr.d(this.c, "Scheduling refresh task with ScheduledExecutor in: %ds", 900L);
                this.e.set(this.h.schedule(new adhp(this, 18), 900L, TimeUnit.SECONDS));
                return;
            }
            return;
        }
        if (this.d == null) {
            advr.d(this.c, "Scheduling refresh task with AlarmTimer in: %ds", 900L);
            Thread b = adwy.a().b("ims_refresh", new adhp(this, 19), g);
            this.d = b;
            if (b != null) {
                this.a.d(b, 900L);
            } else {
                advr.r(this.c, "Unable to schedule a refresh task with AlarmTimer", new Object[0]);
            }
        }
    }

    public final void a() {
        long currentTimeMillis = System.currentTimeMillis() + 900000;
        synchronized (this.b) {
            this.d = null;
            this.e.set(null);
            if (this.b.isEmpty()) {
                return;
            }
            aduj adujVar = (aduj) this.b.peek();
            while (adujVar != null && adujVar.a < currentTimeMillis) {
                adpe adpeVar = ((aduj) this.b.remove()).b;
                ahjj ahjjVar = new ahjj(this, (byte[]) null);
                advr.c("Sending subscribe refresh for event: %s to %s", adpeVar.b, advq.URI.c(adpeVar.h));
                adpeVar.d.a();
                try {
                    String[] strArr = adpeVar.i;
                    if (strArr == null) {
                        strArr = new String[0];
                    }
                    aion e = adpeVar.l.e(adpeVar.b(), adpeVar.d, adpeVar.j, adpeVar.b, strArr);
                    adpeVar.c(e);
                    adpeVar.m(e);
                    adpeVar.b().d(e, new adpc(adpeVar, ahjjVar, 0));
                } catch (Exception e2) {
                    advr.i(e2, "Error while subscribing: %s", e2.getMessage());
                    adpeVar.f(new aduh("Error while subscribing refer: ".concat(String.valueOf(e2.getMessage())), e2));
                }
                if (this.b.isEmpty()) {
                    break;
                } else {
                    adujVar = (aduj) this.b.peek();
                }
            }
            if (!this.b.isEmpty()) {
                c();
            }
        }
    }

    public final void b(adpe adpeVar) {
        advr.d(this.c, "adding refreshable: %s", adpeVar);
        if (adpeVar.j <= 900) {
            advr.r(this.c, "Expires value below configured interval. Expected at least: %d was %d", 900L, Integer.valueOf(adpeVar.j));
            return;
        }
        aduj adujVar = new aduj(adpeVar);
        synchronized (this.b) {
            if (this.b.add(adujVar)) {
                c();
            }
        }
    }
}
