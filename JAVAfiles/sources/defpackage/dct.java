package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dct extends arrp implements arqr<Object, arnb> {
    final /* synthetic */ arzj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dct(arzj arzjVar) {
        super(1);
        this.a = arzjVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (dcu.b.compareAndSet(false, true)) {
            this.a.c(arnb.a);
        }
        return arnb.a;
    }
}
