package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adk extends arrp implements arqr<cnt, arnb> {
    final /* synthetic */ cko a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ cnz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adk(cko ckoVar, long j, long j2, cnz cnzVar) {
        super(1);
        this.a = ckoVar;
        this.b = j;
        this.c = j2;
        this.d = cnzVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cnt cntVar = (cnt) obj;
        cntVar.p();
        cnw.k(cntVar, this.a, this.b, this.c, brg.a, this.d, 104);
        return arnb.a;
    }
}
