package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeri extends arrp implements arqr {
    final /* synthetic */ long a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeri(long j, int i) {
        super(1);
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return Long.valueOf(this.a);
                }
                chj chjVar = (chj) obj;
                chjVar.getClass();
                return chjVar.o(new afhl(this.a, new cod(dqu.d(chjVar, 2.0f), brg.a, 0, 0, 30)));
            }
            ((Number) obj).floatValue();
            return new cku(this.a);
        }
        cnt cntVar = (cnt) obj;
        cntVar.getClass();
        cntVar.p();
        cnw.l(cntVar, this.a, 0L, 0L, brg.a, null, 126);
        return arnb.a;
    }
}
