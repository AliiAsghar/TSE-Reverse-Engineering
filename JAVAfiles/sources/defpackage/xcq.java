package defpackage;

import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xcq {
    public final long a;
    public final mbh b;
    final /* synthetic */ xcs c;
    private final ahqq d;
    private final Set e = alzz.N();
    private final int f;

    public xcq(xcs xcsVar) {
        this.c = xcsVar;
        this.d = xcsVar.o.d();
        this.a = xcsVar.p.a();
        this.f = xcsVar.s.incrementAndGet();
        this.b = lgb.L(xcsVar.p);
    }

    public final void a(ahka ahkaVar) {
        b(ahkaVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ahka ahkaVar, ashu ashuVar) {
        if (!((Boolean) xcs.j.e()).booleanValue()) {
            return;
        }
        if (!this.e.add(ahkaVar.a)) {
            ((alvg) ((alvg) xcs.b.f()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics$MessageSendingTracker", "logTimer", 1008, "MessageLatencyAnalytics.java")).t("Timer was already logged, timer_name=%s", new aomj(aomi.NO_USER_DATA, ahkaVar.a));
            return;
        }
        xyo a = xcs.c.a();
        int i = this.f;
        a.H(String.format(Locale.US, "Timer%d[ms] %s=%d", Integer.valueOf(i), ahkaVar, Long.valueOf(this.c.p.a() - this.a)));
        a.q();
        this.c.o.f(new ahqq(this.d.b.a), ahkaVar, ashuVar, ahqp.SUCCESS);
    }
}
