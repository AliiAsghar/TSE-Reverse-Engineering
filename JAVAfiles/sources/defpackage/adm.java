package defpackage;

import defpackage.cln;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adm extends arrp implements arqr<cnt, arnb> {
    final /* synthetic */ cln.a a;
    final /* synthetic */ cko b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adm(cln.a aVar, cko ckoVar) {
        super(1);
        this.a = aVar;
        this.b = ckoVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cnt cntVar = (cnt) obj;
        cntVar.p();
        cnw.j(cntVar, this.a.a, this.b, brg.a, null, 60);
        return arnb.a;
    }
}
