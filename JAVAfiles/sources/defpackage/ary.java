package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ary extends arrp implements arqv<cvn, dqs, cuf> {
    final /* synthetic */ arq a;
    final /* synthetic */ arqv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ary(arq arqVar, arqv arqvVar) {
        super(2);
        this.a = arqVar;
        this.b = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        long j = ((dqs) obj2).a;
        return (cuf) this.b.a(new asc(this.a, (cvn) obj), new dqs(j));
    }
}
