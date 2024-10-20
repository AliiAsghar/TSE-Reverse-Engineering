package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcq implements dtm {
    private final cfq a;
    private final bcv b;
    private long c = 0;

    public bcq(cfq cfqVar, bcv bcvVar) {
        this.a = cfqVar;
        this.b = bcvVar;
    }

    @Override // defpackage.dtm
    public final long a(drg drgVar, long j, drk drkVar, long j2) {
        long a = this.b.a();
        if ((9223372034707292159L & a) == 9205357640488583168L) {
            a = this.c;
        }
        this.c = a;
        return dre.d(dre.d(drgVar.d(), drf.c(a)), this.a.a(j2, 0L, drkVar));
    }
}
