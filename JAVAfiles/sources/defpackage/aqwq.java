package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqwq extends aqss {
    public final aqxa a;
    private final ardy b;

    public aqwq(aqwn aqwnVar, Context context, appn appnVar) {
        aqxa aqxaVar = new aqxa();
        context.getClass();
        aqxaVar.a = context;
        aqxaVar.h = appnVar;
        this.a = aqxaVar;
        this.b = new ardy(aqwnVar, aqwnVar.d(), aqxaVar);
        f(60L, TimeUnit.SECONDS);
    }

    public static aqwq q(aqwn aqwnVar, Context context) {
        return new aqwq(aqwnVar, context, new appn(null));
    }

    @Override // defpackage.aqsr, defpackage.aque
    public final aquc a() {
        arep arepVar = this.b.e;
        arepVar.getClass();
        this.a.b = arepVar;
        return super.a();
    }

    @Override // defpackage.aqss, defpackage.aqsr
    protected final aque b() {
        return this.b;
    }

    @Override // defpackage.aqss
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void f(long j, TimeUnit timeUnit) {
        albo.U(true, "Idle timeouts are not supported when strict lifecycle management is enabled");
        super.f(j, timeUnit);
    }

    public final void s(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.a.d = new arhm(scheduledExecutorService, 1);
    }

    public final void t(aqww aqwwVar) {
        this.a.e = aqwwVar;
    }
}
