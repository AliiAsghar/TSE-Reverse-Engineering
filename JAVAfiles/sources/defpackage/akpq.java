package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akpq implements aksa {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public akpq(aksa aksaVar, int i) {
        this.b = i;
        this.a = aksaVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r0v7, types: [akrc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [akrc, java.lang.Object] */
    @Override // defpackage.aksa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                akqj.g(this.a);
                                return;
                            } else {
                                aiut.d(new akwm(this, i2), 10000L);
                                return;
                            }
                        }
                        this.a.close();
                        akqj.p();
                        return;
                    }
                    this.a.close();
                    akqj.p();
                    return;
                }
                ((akpr) this.a).p();
                return;
            }
            akpr akprVar = (akpr) this.a;
            akprVar.p();
            akprVar.n();
            return;
        }
        akpr akprVar2 = (akpr) this.a;
        akprVar2.p();
        akprVar2.n();
        akprVar2.a = null;
    }

    public /* synthetic */ akpq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
