package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aepu extends arrp implements arqv {
    final /* synthetic */ cga a;
    final /* synthetic */ aepy b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepu(cga cgaVar, aepy aepyVar, int i) {
        super(2);
        this.a = cgaVar;
        this.b = aepyVar;
        this.c = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = bzh.a(this.c | 1);
        adom.B(this.a, this.b, (bwj) obj, a);
        return arnb.a;
    }
}
