package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahhe extends arrp implements arqv {
    final /* synthetic */ ahhf a;
    final /* synthetic */ cga b;
    final /* synthetic */ float c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahhe(ahhf ahhfVar, cga cgaVar, float f, long j, int i) {
        super(2);
        this.a = ahhfVar;
        this.b = cgaVar;
        this.c = f;
        this.d = j;
        this.e = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.a.a(this.b, this.c, this.d, (bwj) obj, bzh.a(this.e | 1));
        return arnb.a;
    }
}
