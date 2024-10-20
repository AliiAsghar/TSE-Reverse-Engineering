package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agd implements dtm {
    private final long a;

    public agd(long j) {
        this.a = j;
    }

    @Override // defpackage.dtm
    public final long a(drg drgVar, long j, drk drkVar, long j2) {
        boolean z;
        agd agdVar;
        if (drkVar == drk.a) {
            agdVar = this;
            z = true;
        } else {
            z = false;
            agdVar = this;
        }
        long j3 = agdVar.a;
        int i = drgVar.b;
        int i2 = drgVar.c;
        return (age.a(i + dre.a(j3), (int) (j2 >> 32), (int) (j >> 32), z) << 32) | (age.a(i2 + dre.b(j3), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L);
    }
}
