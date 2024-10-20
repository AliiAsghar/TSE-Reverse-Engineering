package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jga extends arrp implements arqv {
    final /* synthetic */ jgc a;
    final /* synthetic */ long b;
    final /* synthetic */ float c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jga(jgc jgcVar, long j, float f, int i) {
        super(2);
        this.a = jgcVar;
        this.b = j;
        this.c = f;
        this.d = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        jgc jgcVar = this.a;
        long j = this.b;
        hlc.N(jgcVar, j, this.c, (bwj) obj, bzh.a(this.d | 1));
        return arnb.a;
    }
}
