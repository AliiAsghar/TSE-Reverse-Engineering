package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmn extends arrp implements arqr<dmp, arnb> {
    final /* synthetic */ dmo a;
    final /* synthetic */ dmm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmn(dmo dmoVar, dmm dmmVar) {
        super(1);
        this.a = dmoVar;
        this.b = dmmVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        dmp dmpVar = (dmp) obj;
        dmo dmoVar = this.a;
        synchronized (dmoVar.a) {
            boolean b = dmpVar.b();
            dmm dmmVar = this.b;
            if (b) {
                dmoVar.b.c(dmmVar, dmpVar);
            } else {
                dmoVar.b.b(dmmVar);
            }
        }
        return arnb.a;
    }
}
