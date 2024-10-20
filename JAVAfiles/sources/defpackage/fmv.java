package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmv implements fmk {
    final /* synthetic */ fmw a;
    private final long b;

    public fmv(fmw fmwVar, long j) {
        this.a = fmwVar;
        this.b = j;
    }

    @Override // defpackage.fmk
    public final long a() {
        return this.b;
    }

    @Override // defpackage.fmk
    public final fmi b(long j) {
        fmi c = this.a.a[0].c(j);
        int i = 1;
        while (true) {
            fmz[] fmzVarArr = this.a.a;
            if (i < fmzVarArr.length) {
                fmi c2 = fmzVarArr[i].c(j);
                if (c2.a.c < c.a.c) {
                    c = c2;
                }
                i++;
            } else {
                return c;
            }
        }
    }

    @Override // defpackage.fmk
    public final boolean c() {
        return true;
    }
}
