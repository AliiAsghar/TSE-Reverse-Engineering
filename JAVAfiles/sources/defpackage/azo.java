package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azo extends arrp implements arqr<bxi, bxh> {
    final /* synthetic */ byn a;
    final /* synthetic */ ajr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azo(byn bynVar, ajr ajrVar) {
        super(1);
        this.a = bynVar;
        this.b = ajrVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new azn(this.a, this.b);
    }
}
