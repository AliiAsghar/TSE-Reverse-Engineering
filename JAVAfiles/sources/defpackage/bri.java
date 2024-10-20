package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bri extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ arqv a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bri(arqv arqvVar, int i) {
        super(2);
        this.a = arqvVar;
        this.b = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = bzh.a(this.b | 1);
        brg.d(this.a, (bwj) obj, a);
        return arnb.a;
    }
}
