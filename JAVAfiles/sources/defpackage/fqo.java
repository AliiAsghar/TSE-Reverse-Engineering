package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqo implements fqs {
    private final flz b;
    private final fvq d;
    public long a = -1;
    private long c = -1;

    public fqo(flz flzVar, fvq fvqVar) {
        this.b = flzVar;
        this.d = fvqVar;
    }

    @Override // defpackage.fqs
    public final long a(flv flvVar) {
        long j = this.c;
        if (j < 0) {
            return -1L;
        }
        this.c = -1L;
        return -(j + 2);
    }

    @Override // defpackage.fqs
    public final fmk b() {
        boolean z;
        if (this.a != -1) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        return new fly(this.b, this.a);
    }

    @Override // defpackage.fqs
    public final void c(long j) {
        long[] jArr = (long[]) this.d.b;
        this.c = jArr[eul.ai(jArr, j, true)];
    }
}
