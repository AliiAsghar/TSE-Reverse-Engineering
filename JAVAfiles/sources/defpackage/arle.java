package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arle extends ance {
    public final aqru a;

    public arle(aqru aqruVar) {
        this.a = aqruVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ance
    public final String gs() {
        algv aj = albo.aj(this);
        aj.b("clientCall", this.a);
        return aj.toString();
    }

    @Override // defpackage.ance
    protected final void k() {
        this.a.c("GrpcFuture was cancelled", null);
    }
}
