package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhr extends arrp implements arqg<arnb> {
    final /* synthetic */ bhm a;
    final /* synthetic */ bgr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhr(bhm bhmVar, bgr bgrVar) {
        super(0);
        this.a = bhmVar;
        this.b = bgrVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        if (!d.F(this.a, this.b.a)) {
            aqjn.Q(this.b.b, new bhq(this.a));
            bze bzeVar = this.b.c;
            if (bzeVar != null) {
                bzeVar.a();
            }
        }
        return arnb.a;
    }
}
