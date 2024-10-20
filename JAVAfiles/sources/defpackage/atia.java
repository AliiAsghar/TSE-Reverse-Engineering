package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class atia extends athq {
    final long a;
    private final atgd b;

    public atia(atfy atfyVar, atgd atgdVar) {
        super(atfyVar);
        if (atgdVar.e()) {
            long c = atgdVar.c();
            this.a = c;
            if (c >= 1) {
                this.b = atgdVar;
                return;
            }
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        throw new IllegalArgumentException("Unit duration field must be precise");
    }

    @Override // defpackage.atfw
    public int d() {
        return 0;
    }

    @Override // defpackage.athq, defpackage.atfw
    public long f(long j) {
        if (j >= 0) {
            return j % this.a;
        }
        long j2 = this.a;
        return (((j + 1) % j2) + j2) - 1;
    }

    @Override // defpackage.athq, defpackage.atfw
    public long g(long j) {
        long j2;
        if (j >= 0) {
            j2 = j % this.a;
        } else {
            long j3 = j + 1;
            j2 = this.a;
            j = j3 - (j3 % j2);
        }
        return j - j2;
    }

    @Override // defpackage.athq, defpackage.atfw
    public long h(long j, int i) {
        atow.q(this, i, d(), x(j, i));
        return j + ((i - a(j)) * this.a);
    }

    @Override // defpackage.athq, defpackage.atfw
    public final atgd q() {
        return this.b;
    }

    protected int x(long j, int i) {
        return w(j);
    }

    @Override // defpackage.atfw
    public final void v() {
    }
}
