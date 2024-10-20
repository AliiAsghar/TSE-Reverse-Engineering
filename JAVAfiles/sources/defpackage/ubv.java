package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ubv implements uce {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ubv(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // defpackage.uce
    public final Object a() {
        if (this.c != 0) {
            alvi alviVar = uci.a;
            return Boolean.valueOf(((agmp) this.b).dg(this.a));
        }
        uci uciVar = (uci) this.b;
        albo.T(uciVar.M());
        uciVar.k().setVersion(this.a);
        return 1L;
    }
}
