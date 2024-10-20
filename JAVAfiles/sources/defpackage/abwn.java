package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwn {
    private final abwm a;
    private long b;
    private final abvc c;
    private final aozy d;

    public abwn(abwm abwmVar, abvc abvcVar) {
        this.a = abwmVar;
        this.c = abvcVar;
        this.d = alcj.a.createBuilder();
        this.b = -1L;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized abwn clone() {
        return new abwn(this);
    }

    public final synchronized alcj b() {
        return (alcj) this.d.s();
    }

    public final void c(int i, abwm abwmVar) {
        if (abwmVar != abwm.NOTHING) {
            if (abwmVar.compareTo(this.a) > 0) {
                return;
            }
            synchronized (this) {
                aozy createBuilder = alci.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                alci alciVar = (alci) createBuilder.b;
                alciVar.c = i - 1;
                alciVar.b |= 1;
                long nanoTime = System.nanoTime();
                long j = this.b;
                if (j >= 0) {
                    long millis = Duration.ofNanos(nanoTime - j).toMillis();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    alci alciVar2 = (alci) createBuilder.b;
                    alciVar2.b |= 2;
                    alciVar2.d = millis;
                }
                this.b = nanoTime;
                aozy aozyVar = this.d;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                alcj alcjVar = (alcj) aozyVar.b;
                alci alciVar3 = (alci) createBuilder.s();
                alcj alcjVar2 = alcj.a;
                alciVar3.getClass();
                apax apaxVar = alcjVar.b;
                if (!apaxVar.c()) {
                    alcjVar.b = apag.mutableCopy(apaxVar);
                }
                alcjVar.b.add(alciVar3);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot record an event with granularity NOTHING");
    }

    private abwn(abwn abwnVar) {
        this.a = abwnVar.a;
        this.c = abwnVar.c;
        this.d = abwnVar.d.b();
        this.b = abwnVar.b;
    }
}
