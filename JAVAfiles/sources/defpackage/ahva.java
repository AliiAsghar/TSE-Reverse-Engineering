package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahva implements ahvd {
    private static boolean b;
    public final alhr a;
    private final alhr c;
    private final int d;

    public ahva(alhr alhrVar) {
        abnl abnlVar = new abnl(12);
        this.c = alhrVar;
        this.d = Math.max(5, 10);
        this.a = abnlVar;
    }

    @Override // defpackage.ahvd
    public final void a() {
        synchronized (ahva.class) {
            if (!b) {
                ahsa ahsaVar = new ahsa(this, 7);
                long j = this.d;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                aneo aneoVar = (aneo) this.c.get();
                ahmc.C(aneoVar.schedule(new prc(ahsaVar, aneoVar, j, timeUnit, 5), j, timeUnit));
                b = true;
            }
        }
    }
}
