package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akux implements aqrv {
    private final /* synthetic */ int a;

    public akux(int i) {
        this.a = i;
    }

    @Override // defpackage.aqrv
    public final aqru a(aqux aquxVar, aqrr aqrrVar, aqrs aqrsVar) {
        int i = this.a;
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (aqrrVar.f(aokd.a) != null) {
                        z = false;
                    }
                    albo.U(z, "AuthContext was set, but no AuthContextManager was bound");
                    return aqrsVar.a(aquxVar, aqrrVar);
                }
                if (aqrrVar.f(aokd.a) == null) {
                    return aqrsVar.a(aquxVar, aqrrVar);
                }
                return new aokz(aqrsVar, aquxVar, aqrrVar);
            }
            return new aknm(aqrsVar.a(aquxVar, aqrrVar), "gRPC:".concat(aquxVar.b), aktr.b());
        }
        return new akva(aqrsVar.a(aquxVar, aqrrVar));
    }
}
