package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arlp implements aqvs {
    public final arln a;

    public arlp(arln arlnVar) {
        this.a = arlnVar;
    }

    @Override // defpackage.aqvs
    public final apzj a(aqvr aqvrVar, aqut aqutVar) {
        d.t(aqvrVar.f().a.a(), "asyncUnaryRequestCall is only for clientSendsOneMessage methods");
        arlm arlmVar = new arlm(aqvrVar);
        aqvrVar.d(2);
        return new arlo(this, arlmVar, aqvrVar);
    }
}
