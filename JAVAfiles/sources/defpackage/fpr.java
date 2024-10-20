package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpr implements fpq {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;
    private final int e;

    public fpr(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.fmk
    public final long a() {
        return this.c;
    }

    @Override // defpackage.fmk
    public final fmi b(long j) {
        long[] jArr = this.a;
        int ai = eul.ai(jArr, j, true);
        fml fmlVar = new fml(jArr[ai], this.b[ai]);
        if (fmlVar.b < j) {
            long[] jArr2 = this.a;
            if (ai != jArr2.length - 1) {
                int i = ai + 1;
                return new fmi(fmlVar, new fml(jArr2[i], this.b[i]));
            }
        }
        return new fmi(fmlVar, fmlVar);
    }

    @Override // defpackage.fmk
    public final boolean c() {
        return true;
    }

    @Override // defpackage.fpq
    public final int d() {
        return this.e;
    }

    @Override // defpackage.fpq
    public final long e() {
        return this.d;
    }

    @Override // defpackage.fpq
    public final long f(long j) {
        return this.a[eul.ai(this.b, j, true)];
    }
}
