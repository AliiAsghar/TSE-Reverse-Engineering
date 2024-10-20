package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class apo extends arrp implements arqg<apl> {
    final /* synthetic */ cas a;
    final /* synthetic */ aqr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apo(cas casVar, aqr aqrVar) {
        super(0);
        this.a = casVar;
        this.b = aqrVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        api apiVar = (api) this.a.a();
        return new apl(this.b, apiVar, new atc(this.b.c.c.a(), apiVar));
    }
}
