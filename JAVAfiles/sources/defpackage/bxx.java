package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bxx extends arrp implements arqr<Throwable, arnb> {
    final /* synthetic */ bxy a;
    final /* synthetic */ arvo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxx(bxy bxyVar, arvo arvoVar) {
        super(1);
        this.a = bxyVar;
        this.b = arvoVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bxy bxyVar = this.a;
        Object obj2 = bxyVar.a;
        arvo arvoVar = this.b;
        synchronized (obj2) {
            bxyVar.b.remove(arvoVar);
        }
        return arnb.a;
    }
}
