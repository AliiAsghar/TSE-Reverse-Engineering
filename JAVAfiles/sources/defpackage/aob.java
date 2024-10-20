package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aob extends arrp implements arqg<any> {
    final /* synthetic */ cas a;
    final /* synthetic */ aov b;
    final /* synthetic */ anr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aob(cas casVar, aov aovVar, anr anrVar) {
        super(0);
        this.a = casVar;
        this.b = aovVar;
        this.c = anrVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        anv anvVar = (anv) this.a.a();
        atc atcVar = new atc(this.b.e.c.a(), anvVar);
        return new any(this.b, anvVar, this.c, atcVar);
    }
}
