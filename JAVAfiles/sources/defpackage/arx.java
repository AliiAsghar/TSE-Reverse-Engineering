package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class arx extends arrp implements arqr<bxi, bxh> {
    final /* synthetic */ asm a;
    final /* synthetic */ arq b;
    final /* synthetic */ cvm c;
    final /* synthetic */ atk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arx(asm asmVar, arq arqVar, cvm cvmVar, atk atkVar) {
        super(1);
        this.a = asmVar;
        this.b = arqVar;
        this.c = cvmVar;
        this.d = atkVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        atf atfVar = new atf(this.b, this.c, this.d);
        asm asmVar = this.a;
        asmVar.c = atfVar;
        return new arw(asmVar);
    }
}
