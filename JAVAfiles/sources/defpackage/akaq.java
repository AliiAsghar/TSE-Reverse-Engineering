package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akaq extends arwb implements arwm {
    private final arwb a;
    private final arwm b;

    public akaq(arwb arwbVar, arwm arwmVar) {
        this.a = arwbVar;
        this.b = arwmVar;
    }

    @Override // defpackage.arwb
    public final void a(arpi arpiVar, Runnable runnable) {
        arpiVar.getClass();
        runnable.getClass();
        long j = akto.a;
        if (akto.q()) {
            runnable = akto.i(runnable);
        }
        this.a.a(arpiVar, runnable);
    }

    @Override // defpackage.arwm
    public final arwu c(long j, Runnable runnable, arpi arpiVar) {
        arpiVar.getClass();
        return this.b.c(j, runnable, arpiVar);
    }

    @Override // defpackage.arwm
    public final void d(long j, arvo arvoVar) {
        this.b.d(j, arvoVar);
    }
}
