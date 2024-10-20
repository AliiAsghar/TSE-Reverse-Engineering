package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class athz extends atia {
    private final int b;
    private final atgd c;

    public athz(atfy atfyVar, atgd atgdVar, atgd atgdVar2) {
        super(atfyVar, atgdVar);
        if (atgdVar2.e()) {
            int c = (int) (atgdVar2.c() / this.a);
            this.b = c;
            if (c >= 2) {
                this.c = atgdVar2;
                return;
            }
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        throw new IllegalArgumentException("Range duration field must be precise");
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int a(long j) {
        if (j >= 0) {
            return (int) ((j / this.a) % this.b);
        }
        int i = this.b;
        return (i - 1) + ((int) (((j + 1) / this.a) % i));
    }

    @Override // defpackage.athq, defpackage.atfw
    public final int c() {
        return this.b - 1;
    }

    @Override // defpackage.atia, defpackage.athq, defpackage.atfw
    public final long h(long j, int i) {
        atow.q(this, i, 0, c());
        return j + ((i - a(j)) * this.a);
    }

    @Override // defpackage.atfw
    public final atgd s() {
        return this.c;
    }
}
