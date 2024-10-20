package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzo implements mjf {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public mzo(muz muzVar, ncp ncpVar, int i) {
        this.c = i;
        this.a = muzVar;
        this.b = ncpVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [mjc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, ncp] */
    @Override // defpackage.yfv
    public final /* synthetic */ akul a(Object obj) {
        if (this.c != 0) {
            mzi mziVar = (mzi) obj;
            mziVar.getClass();
            if (!d.F(mziVar.b, ((muz) this.a).a)) {
                akul ag = aktp.ag(null);
                ag.getClass();
                return ag;
            }
            akul a = this.b.a();
            a.getClass();
            return a;
        }
        mzi mziVar2 = (mzi) obj;
        this.a.b(mziVar2.a, ((mzs) this.b).i(mziVar2.b, mziVar2.d));
        return aktp.ag(null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mjc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ncp] */
    @Override // defpackage.mjf
    public final akul b() {
        if (this.c != 0) {
            return this.b.a();
        }
        this.a.a();
        return aktp.ag(null);
    }

    public mzo(mzs mzsVar, mjc mjcVar, int i) {
        this.c = i;
        this.a = mjcVar;
        this.b = mzsVar;
    }
}
