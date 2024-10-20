package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aofl implements aofq {
    public final /* synthetic */ aofp a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TimeUnit c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ aofl(aofp aofpVar, Object obj, long j, TimeUnit timeUnit, int i) {
        this.e = i;
        this.a = aofpVar;
        this.d = obj;
        this.b = j;
        this.c = timeUnit;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // defpackage.aofq
    public final ScheduledFuture a(asqc asqcVar) {
        if (this.e != 0) {
            ?? r0 = this.d;
            aofp aofpVar = this.a;
            aofm aofmVar = new aofm(aofpVar, (Callable) r0, asqcVar, 0);
            TimeUnit timeUnit = this.c;
            return aofpVar.b.schedule(aofmVar, this.b, timeUnit);
        }
        Object obj = this.d;
        aofp aofpVar2 = this.a;
        aofo aofoVar = new aofo(aofpVar2, obj, asqcVar, 0, (byte[]) null);
        TimeUnit timeUnit2 = this.c;
        return aofpVar2.b.schedule(aofoVar, this.b, timeUnit2);
    }
}
