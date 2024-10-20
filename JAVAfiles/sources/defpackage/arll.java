package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arll implements aqrv {
    private static arll c;
    public final Object a;
    private final /* synthetic */ int b;

    public arll(alhr alhrVar, int i) {
        this.b = i;
        this.a = alhrVar;
    }

    public static synchronized arll b() {
        arll arllVar;
        synchronized (arll.class) {
            if (c == null) {
                c = new arll(new abnl(7), 1);
            }
            arllVar = c;
        }
        return arllVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [alhr, java.lang.Object] */
    @Override // defpackage.aqrv
    public final aqru a(aqux aquxVar, aqrr aqrrVar, aqrs aqrsVar) {
        agqx agqxVar;
        if (this.b != 0) {
            if (!((Boolean) this.a.get()).booleanValue()) {
                return aqrsVar.a(aquxVar, aqrrVar);
            }
            ahka ahkaVar = (ahka) aqrrVar.f(agqq.a);
            if (ahkaVar == null) {
                agqxVar = new agqx(new ahpn("https://" + aqrsVar.b() + "/" + aquxVar.b));
            } else {
                agqxVar = new agqx(ahpn.a(aqrsVar.b(), ahkaVar));
            }
            return new agqv(aqrsVar.a(aquxVar, aqrrVar.h(agqxVar)), agqxVar);
        }
        return new arlk(this, aqrsVar.a(aquxVar, aqrrVar));
    }

    public arll(aqut aqutVar, int i) {
        this.b = i;
        aqutVar.getClass();
        this.a = aqutVar;
    }
}
