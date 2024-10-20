package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqza implements Runnable {
    final aqyz a;
    final /* synthetic */ String b;
    final /* synthetic */ aqut c;
    final /* synthetic */ aqux d;
    final /* synthetic */ arhn e;
    final /* synthetic */ aqrr f;
    final /* synthetic */ aqzb g;

    public aqza(aqzb aqzbVar, String str, aqut aqutVar, aqux aquxVar, arhn arhnVar, aqrr aqrrVar) {
        this.b = str;
        this.c = aqutVar;
        this.d = aquxVar;
        this.e = arhnVar;
        this.f = aqrrVar;
        this.g = aqzbVar;
        this.a = new aqyz(str, aqzbVar.a, aqzbVar.e, aqutVar, aqzbVar, this, aqzbVar.c, aqzbVar.f, aquxVar, arhnVar, aqrrVar, aqzbVar.g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.g.c) {
            aqzb aqzbVar = this.g;
            if (aqzbVar.j) {
                this.a.o.l(aqzbVar.k, true, new aqut());
            } else if (aqzbVar.l) {
                aqyz aqyzVar = this.a;
                aqzbVar.d.add(aqyzVar);
                aqyzVar.o.h.p = aqzbVar.i;
            } else {
                throw new AssertionError("Transport is not started");
            }
        }
    }
}
