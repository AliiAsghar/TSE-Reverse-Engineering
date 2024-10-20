package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class fqw {
    public fmq b;
    public flw c;
    public fqs d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final gad n = new gad(null);
    public fqu j = new fqu();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract long a(euf eufVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(boolean z) {
        int i;
        if (z) {
            this.j = new fqu();
            this.f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.h = i;
        this.e = -1L;
        this.g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean c(euf eufVar, long j, fqu fquVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final long e(long j) {
        return (j * 1000000) / this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long f(long j) {
        return (this.i * j) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(long j) {
        this.g = j;
    }
}
