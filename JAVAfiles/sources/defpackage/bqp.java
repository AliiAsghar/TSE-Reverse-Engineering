package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqp extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ arqv a;
    final /* synthetic */ arqv b;
    final /* synthetic */ arqv c;
    final /* synthetic */ dje d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqp(arqv arqvVar, arqv arqvVar2, arqv arqvVar3, dje djeVar, long j, long j2) {
        super(2);
        this.a = arqvVar;
        this.b = arqvVar2;
        this.c = arqvVar3;
        this.d = djeVar;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            bwjVar.y(-810703340);
            bqo.a(this.b, this.a, this.c, this.d, this.e, this.f, bwjVar, 0);
            bwjVar.q();
        }
        return arnb.a;
    }
}
