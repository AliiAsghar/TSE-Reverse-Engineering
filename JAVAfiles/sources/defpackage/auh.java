package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class auh extends arrp implements arqg<Boolean> {
    final /* synthetic */ avc a;
    final /* synthetic */ arwe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auh(avc avcVar, arwe arweVar) {
        super(0);
        this.a = avcVar;
        this.b = arweVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        return Boolean.valueOf(aue.a(this.a, this.b));
    }
}
