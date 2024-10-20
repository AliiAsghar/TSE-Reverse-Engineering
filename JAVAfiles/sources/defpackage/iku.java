package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iku implements iko {
    final /* synthetic */ ncq a;
    private yga b;

    public iku(ncq ncqVar) {
        this.a = ncqVar;
    }

    @Override // defpackage.iko
    public final void a(arqg arqgVar) {
        this.b = this.a.a(new mlq(arqgVar, 1));
    }

    @Override // defpackage.iko
    public final void b() {
        yga ygaVar = this.b;
        if (ygaVar == null) {
            arro.b("subscriptionToken");
            ygaVar = null;
        }
        ygaVar.a();
    }
}
