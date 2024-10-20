package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class baz extends arrp implements arqr<aruo, CharSequence> {
    final /* synthetic */ arrz a;
    final /* synthetic */ arrz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baz(arrz arrzVar, arrz arrzVar2) {
        super(1);
        this.a = arrzVar;
        this.b = arrzVar2;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aruo aruoVar = (aruo) obj;
        arrz arrzVar = this.a;
        if (arrzVar.a == -1) {
            arrzVar.a = aruoVar.b().a;
        }
        this.b.a = aruoVar.b().b + 1;
        return "";
    }
}
