package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhc extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ int a;
    final /* synthetic */ arqv b;
    final /* synthetic */ arqw c;
    final /* synthetic */ arqv d;
    final /* synthetic */ bgv e;
    final /* synthetic */ arqv f;
    final /* synthetic */ arqw g;
    final /* synthetic */ bhj h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhc(int i, arqv arqvVar, arqw arqwVar, arqv arqvVar2, bgv bgvVar, arqv arqvVar3, arqw arqwVar2, bhj bhjVar) {
        super(2);
        this.a = i;
        this.b = arqvVar;
        this.c = arqwVar;
        this.d = arqvVar2;
        this.e = bgvVar;
        this.f = arqvVar3;
        this.g = arqwVar2;
        this.h = bhjVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            bgz.c(this.a, this.b, this.c, cdk.e(433906483, new bhb(this.g, this.h), bwjVar), this.d, this.e, this.f, bwjVar, 24576);
        }
        return arnb.a;
    }
}
