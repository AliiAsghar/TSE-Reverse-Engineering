package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpc implements hyy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hpc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [ecf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [hpk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [hpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [ecf, java.lang.Object] */
    @Override // defpackage.hyy
    public final /* synthetic */ Object a() {
        if (this.b != 0) {
            arrt arrtVar = (arrt) this.a;
            return new how((hpd) arrtVar.c, arrtVar.b);
        }
        iql iqlVar = (iql) this.a;
        Object obj = iqlVar.d;
        Object obj2 = iqlVar.f;
        hrc hrcVar = (hrc) obj2;
        return new hpj((hrc) obj, hrcVar, (hrc) iqlVar.e, iqlVar.a, iqlVar.c, iqlVar.b);
    }
}
