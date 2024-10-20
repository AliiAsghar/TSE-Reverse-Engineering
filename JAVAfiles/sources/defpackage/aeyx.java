package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeyx extends arrp implements arqv {
    final /* synthetic */ String a;
    final /* synthetic */ cga b;
    final /* synthetic */ long c;
    final /* synthetic */ dqi d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ dje g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeyx(String str, cga cgaVar, long j, dqi dqiVar, int i, int i2, dje djeVar) {
        super(2);
        this.a = str;
        this.b = cgaVar;
        this.c = j;
        this.d = dqiVar;
        this.e = i;
        this.f = i2;
        this.g = djeVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            ahji.e(this.a, this.b, this.c, 0L, 0L, this.d, 0L, this.e, false, this.f, 0, null, this.g, bwjVar, 0, 0, 54776);
        }
        return arnb.a;
    }
}
