package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akpo implements aksa {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ akpo(aksa aksaVar, Object obj, int i) {
        this.c = i;
        this.a = aksaVar;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aksa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [aksa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [aksa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [aksa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [aksa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aksa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aksa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [aksa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [aksa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [aksa, java.lang.Object] */
    @Override // defpackage.aksa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            this.b.close();
                            this.a.close();
                            akqj.p();
                            return;
                        } else {
                            this.b.close();
                            algw algwVar = (algw) this.a;
                            if (algwVar.f()) {
                                algwVar.b().close();
                                return;
                            }
                            return;
                        }
                    }
                    this.a.close();
                    akpr akprVar = (akpr) this.b;
                    akprVar.a = null;
                    akprVar.b = false;
                    akqj.g(akprVar.c);
                    akprVar.c = null;
                    return;
                }
                this.b.close();
                this.a.close();
                return;
            }
            this.b.close();
            this.a.close();
            return;
        }
        this.a.close();
        akqj.g(this.b);
    }

    public /* synthetic */ akpo(aksa aksaVar, Object obj, int i, byte[] bArr) {
        this.c = i;
        this.b = aksaVar;
        this.a = obj;
    }
}
