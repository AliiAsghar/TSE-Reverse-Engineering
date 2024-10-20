package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atu extends arrp implements arqg<aul> {
    final /* synthetic */ cas a;
    final /* synthetic */ cas b;
    final /* synthetic */ arqg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atu(cas casVar, cas casVar2, arqg arqgVar) {
        super(0);
        this.a = casVar;
        this.b = casVar2;
        this.c = arqgVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        return new aul((arqx) this.a.a(), (arqr) this.b.a(), ((Number) this.c.a()).intValue());
    }
}
