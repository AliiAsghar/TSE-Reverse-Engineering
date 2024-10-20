package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aent extends arrp implements arqw {
    final /* synthetic */ cku a;
    final /* synthetic */ aenv b;
    final /* synthetic */ cku c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aent(cku ckuVar, aenv aenvVar, cku ckuVar2, boolean z) {
        super(3);
        this.a = ckuVar;
        this.b = aenvVar;
        this.c = ckuVar2;
        this.d = z;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bwj bwjVar = (bwj) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ake) obj).getClass();
        if ((intValue & 81) == 16 && bwjVar.L()) {
            bwjVar.v();
        } else {
            cku ckuVar = this.a;
            aenv aenvVar = this.b;
            adom.aI(ckuVar, aenvVar.b, cdk.e(650380314, new aens(aenvVar, this.c, this.d, 0), bwjVar), bwjVar, 3072);
        }
        return arnb.a;
    }
}
