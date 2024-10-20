package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akvb implements aqvt {
    private final aksr a;

    public akvb(aksr aksrVar) {
        this.a = aksrVar;
    }

    @Override // defpackage.aqvt
    public final apzj a(aqvr aqvrVar, aqut aqutVar, aqvs aqvsVar) {
        akrx g = this.a.g(aqvrVar.f().b, akrk.a);
        try {
            akrh e = aktp.e(aqvrVar.f().b);
            try {
                akuy akuyVar = new akuy(aqvsVar.a(new akuz(aqvrVar, e), aqutVar), aktr.b());
                e.close();
                g.close();
                return akuyVar;
            } finally {
            }
        } catch (Throwable th) {
            try {
                g.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
