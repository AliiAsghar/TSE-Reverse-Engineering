package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atv extends arrp implements arqg<aum> {
    final /* synthetic */ cas a;
    final /* synthetic */ avc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atv(cas casVar, avc avcVar) {
        super(0);
        this.a = casVar;
        this.b = avcVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        aul aulVar = (aul) this.a.a();
        return new aum(this.b, aulVar, new atc(this.b.c.e.a(), aulVar));
    }
}
