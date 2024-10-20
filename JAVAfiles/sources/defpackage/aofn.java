package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aofn implements aofq {
    public final /* synthetic */ aofp a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TimeUnit e;
    private final /* synthetic */ int f;

    public /* synthetic */ aofn(aofp aofpVar, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.f = i;
        this.a = aofpVar;
        this.b = runnable;
        this.c = j;
        this.d = j2;
        this.e = timeUnit;
    }

    @Override // defpackage.aofq
    public final ScheduledFuture a(asqc asqcVar) {
        if (this.f != 0) {
            Runnable runnable = this.b;
            aofp aofpVar = this.a;
            aofo aofoVar = new aofo(aofpVar, runnable, asqcVar, 1, (byte[]) null);
            TimeUnit timeUnit = this.e;
            long j = this.d;
            return aofpVar.b.scheduleAtFixedRate(aofoVar, this.c, j, timeUnit);
        }
        Runnable runnable2 = this.b;
        aofp aofpVar2 = this.a;
        adub adubVar = new adub(aofpVar2, runnable2, asqcVar, 20, (short[]) null);
        TimeUnit timeUnit2 = this.e;
        long j2 = this.d;
        return aofpVar2.b.scheduleWithFixedDelay(adubVar, this.c, j2, timeUnit2);
    }
}
