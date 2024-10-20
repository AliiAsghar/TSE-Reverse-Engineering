package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aug extends arrp implements arqg<Boolean> {
    final /* synthetic */ avc a;
    final /* synthetic */ arwe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aug(avc avcVar, arwe arweVar) {
        super(0);
        this.a = avcVar;
        this.b = arweVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        return Boolean.valueOf(aue.b(this.a, this.b));
    }
}
