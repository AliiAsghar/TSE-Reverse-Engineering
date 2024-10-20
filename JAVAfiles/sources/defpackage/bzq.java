package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzq extends arrp implements arqr<Object, arnb> {
    final /* synthetic */ bxc a;
    final /* synthetic */ vh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzq(bxc bxcVar, vh vhVar) {
        super(1);
        this.a = bxcVar;
        this.b = vhVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        this.a.p(obj);
        vh vhVar = this.b;
        if (vhVar != null) {
            vhVar.j(obj);
        }
        return arnb.a;
    }
}
