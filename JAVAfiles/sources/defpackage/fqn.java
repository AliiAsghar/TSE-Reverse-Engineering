package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqn implements fqs {
    public final long a;
    public final long b;
    public final fqw c;
    public long d;
    private final fqr e;
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public fqn(fqw fqwVar, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j >= 0 && j2 > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.s(z2);
        this.c = fqwVar;
        this.a = j;
        this.b = j2;
        if (j3 != j2 - j && !z) {
            this.f = 0;
        } else {
            this.d = j4;
            this.f = 4;
        }
        this.e = new fqr();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    @Override // defpackage.fqs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(defpackage.flv r26) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqn.a(flv):long");
    }

    @Override // defpackage.fqs
    public final /* bridge */ /* synthetic */ fmk b() {
        if (this.d != 0) {
            return new fqm(this);
        }
        return null;
    }

    @Override // defpackage.fqs
    public final void c(long j) {
        this.h = eul.q(j, 0L, this.d - 1);
        this.f = 2;
        this.i = this.a;
        this.j = this.b;
        this.k = 0L;
        this.l = this.d;
    }
}
