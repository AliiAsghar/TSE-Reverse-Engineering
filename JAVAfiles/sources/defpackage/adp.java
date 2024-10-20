package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adp extends arrp implements arqr<cnt, arnb> {
    final /* synthetic */ clr a;
    final /* synthetic */ cko b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adp(clr clrVar, cko ckoVar) {
        super(1);
        this.a = clrVar;
        this.b = ckoVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cnt cntVar = (cnt) obj;
        cntVar.p();
        cnw.j(cntVar, this.a, this.b, brg.a, null, 60);
        return arnb.a;
    }
}
