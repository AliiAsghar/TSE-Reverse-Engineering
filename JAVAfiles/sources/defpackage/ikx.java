package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikx implements iko {
    final /* synthetic */ agoz a;
    private agmc b;

    public ikx(agoz agozVar) {
        this.a = agozVar;
    }

    @Override // defpackage.iko
    public final void a(arqg arqgVar) {
        ikw ikwVar = new ikw(arqgVar);
        this.b = ikwVar;
        this.a.E(ikwVar);
    }

    @Override // defpackage.iko
    public final void b() {
        agmc agmcVar = this.b;
        if (agmcVar == null) {
            arro.b("changeListener");
            agmcVar = null;
        }
        this.a.G(agmcVar);
    }
}
