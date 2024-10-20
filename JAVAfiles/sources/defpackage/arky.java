package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arky extends arlb {
    public arky(aqrs aqrsVar, aqrr aqrrVar) {
        super(aqrsVar, aqrrVar);
    }

    @Override // defpackage.arlb
    public final /* synthetic */ arlb a(aqrs aqrsVar, aqrr aqrrVar) {
        return new arky(aqrsVar, aqrrVar);
    }

    public final void b(aqec aqecVar, arlq arlqVar) {
        aqux aquxVar = aqam.a;
        if (aquxVar == null) {
            synchronized (aqam.class) {
                aquxVar = aqam.a;
                if (aquxVar == null) {
                    aquu a = aqux.a();
                    a.e = aquw.SERVER_STREAMING;
                    a.a = aqux.c("google.internal.communications.instantmessaging.v1.Messaging", "ReceiveMessages");
                    a.b();
                    aqec aqecVar2 = aqec.a;
                    aozs aozsVar = arkx.a;
                    a.c = new arkw(aqecVar2);
                    a.d = new arkw(aqel.a);
                    aquxVar = a.a();
                    aqam.a = aquxVar;
                }
            }
        }
        aqru a2 = this.a.a(aquxVar, this.b);
        aqrq aqrqVar = arlj.a;
        arlqVar.getClass();
        arlj.b(a2, aqecVar, new arlg(arlqVar, new arld(a2)));
    }
}
