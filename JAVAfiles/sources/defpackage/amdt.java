package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amdt {
    private algw b = alfd.a;
    private final alhz c = alhz.b;
    public amdv a = amdw.c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final amdw a(alhr alhrVar, amdr amdrVar, algy algyVar) {
        ScheduledExecutorService scheduledExecutorService;
        albo.U(this.b.f(), "Either executor or scheduledExecutorService needs to be set.");
        algw algwVar = this.b;
        algwVar.getClass();
        ?? b = algwVar.b();
        if (this.b.f()) {
            scheduledExecutorService = this.b.b();
        } else {
            scheduledExecutorService = amdu.a;
        }
        return new amdw(alhrVar, amdrVar, algyVar, b, scheduledExecutorService, this.c, this.a);
    }

    public final void b(ScheduledExecutorService scheduledExecutorService) {
        this.b = algw.i(scheduledExecutorService);
    }
}
