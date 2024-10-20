package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqj extends arrp implements arqg<arnb> {
    final /* synthetic */ bqe a;
    final /* synthetic */ bly b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqj(bqe bqeVar, bly blyVar) {
        super(0);
        this.a = bqeVar;
        this.b = blyVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        if (!d.F(this.a, this.b.a)) {
            aqjn.Q(this.b.b, new bqi(this.a));
            bze bzeVar = this.b.c;
            if (bzeVar != null) {
                bzeVar.a();
            }
        }
        return arnb.a;
    }
}
