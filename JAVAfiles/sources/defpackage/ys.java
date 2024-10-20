package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ys extends arrp implements arqr<cnt, arnb> {
    final /* synthetic */ yi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys(yi yiVar) {
        super(1);
        this.a = yiVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cnt cntVar = (cnt) obj;
        cntVar.p();
        yi yiVar = this.a;
        cez cezVar = yiVar.h;
        if (cezVar.a() > 1) {
            aqjn.M(cezVar, new yj());
        }
        cez cezVar2 = yiVar.h;
        int a = cezVar2.a();
        for (int i = 0; i < a; i++) {
            ((xt) cezVar2.get(i)).b(cntVar);
        }
        return arnb.a;
    }
}
