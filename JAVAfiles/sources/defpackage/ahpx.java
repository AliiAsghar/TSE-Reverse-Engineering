package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahpx extends ahpw implements ahlj {
    public final Context a;
    public final aneo b;
    public final apwt c;
    public final Handler d;
    public final ahmu e;
    public final ahlm f;
    public volatile boolean g = false;
    public final Object h = new Object();
    public volatile ahpy i = null;
    public final agrk j;
    private final Executor k;
    private final armf l;

    public ahpx(Context context, Executor executor, aneo aneoVar, apwt apwtVar, ahmv ahmvVar, agrk agrkVar, ahlm ahlmVar, armf armfVar, Handler handler) {
        this.a = context;
        this.b = aneoVar;
        this.k = executor;
        this.c = apwtVar;
        this.l = armfVar;
        this.d = handler;
        this.f = ahlmVar;
        this.j = agrkVar;
        this.e = ahmvVar.a(aneoVar, apwtVar, armfVar);
    }

    public final void a() {
        if (!this.e.c(null)) {
            synchronized (this.h) {
                this.f.b(this);
            }
        } else if (((ahpv) this.c.b()).e.isEmpty()) {
            ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/stall/StallMetricServiceImpl", "readConfigsAndMaybeStart", 181, "StallMetricServiceImpl.java")).r("Stall thresholds list expected to have size > 0, was %s", ((ahpv) this.c.b()).e.size());
        } else {
            this.b.schedule(new ahoa(this, 2), ((ahpv) this.c.b()).a, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.ahpw, defpackage.ahmw
    public final void as() {
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        if (bool.booleanValue()) {
            asja asjaVar = (asja) this.l.b();
            int aD = a.aD(asjaVar.d);
            if (aD != 0 && aD == 4 && asjaVar.c == 0) {
                return;
            }
        }
        this.f.a(this);
        albo.bL(new ahoa(this, 4), this.k);
    }

    @Override // defpackage.ahlj
    public final void i(ahka ahkaVar) {
        this.g = false;
        if (this.i == null) {
            return;
        }
        albo.bL(new ahoa(this, 7), this.b);
    }

    @Override // defpackage.ahlj
    public final void j(ahka ahkaVar) {
        this.g = true;
        if (this.i == null) {
            return;
        }
        albo.bL(new ahoa(this, 6), this.b);
    }
}
