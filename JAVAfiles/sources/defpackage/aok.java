package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aok extends arrp implements arqr<Integer, aon> {
    final /* synthetic */ aoo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aok(aoo aooVar) {
        super(1);
        this.a = aooVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aon b;
        b = r0.b(((Number) obj).intValue(), this.a.m);
        return b;
    }
}
