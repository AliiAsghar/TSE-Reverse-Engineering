package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dso implements dtm {
    private final cfq a;

    public dso(cfq cfqVar) {
        this.a = cfqVar;
    }

    @Override // defpackage.dtm
    public final long a(drg drgVar, long j, drk drkVar, long j2) {
        int i;
        long b = drgVar.b();
        long a = drgVar.a();
        cfq cfqVar = this.a;
        long a2 = cfqVar.a(0L, (b << 32) | (a & 4294967295L), drkVar);
        long a3 = cfqVar.a(0L, j2, drkVar);
        long j3 = a3 >> 32;
        long j4 = a3 & 4294967295L;
        drk drkVar2 = drk.a;
        long d = dre.d(drgVar.d(), a2);
        if (drkVar == drkVar2) {
            i = 1;
        } else {
            i = -1;
        }
        return dre.d(dre.d(d, ((-((int) j4)) & 4294967295L) | ((-((int) j3)) << 32)), ((dre.a(0L) * i) << 32) | (dre.b(0L) & 4294967295L));
    }
}
