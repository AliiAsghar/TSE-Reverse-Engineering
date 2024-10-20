package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dst extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ cga a;
    final /* synthetic */ arqv b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dst(cga cgaVar, arqv arqvVar, int i) {
        super(2);
        this.a = cgaVar;
        this.b = arqvVar;
        this.c = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = bzh.a(this.c | 1);
        dsq.c(this.a, this.b, (bwj) obj, a);
        return arnb.a;
    }
}
