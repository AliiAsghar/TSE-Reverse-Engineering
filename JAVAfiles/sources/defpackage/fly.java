package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fly implements fmk {
    private final flz a;
    private final long b;

    public fly(flz flzVar, long j) {
        this.a = flzVar;
        this.b = j;
    }

    private final fml d(long j, long j2) {
        return new fml((j * 1000000) / this.a.e, this.b + j2);
    }

    @Override // defpackage.fmk
    public final long a() {
        return this.a.a();
    }

    @Override // defpackage.fmk
    public final fmi b(long j) {
        long j2;
        dzg.h(this.a.k);
        flz flzVar = this.a;
        fvq fvqVar = flzVar.k;
        Object obj = fvqVar.b;
        Object obj2 = fvqVar.a;
        long[] jArr = (long[]) obj;
        int ai = eul.ai(jArr, flzVar.b(j), false);
        long j3 = 0;
        if (ai == -1) {
            j2 = 0;
        } else {
            j2 = jArr[ai];
        }
        if (ai != -1) {
            j3 = ((long[]) obj2)[ai];
        }
        fml d = d(j2, j3);
        if (d.b != j && ai != jArr.length - 1) {
            int i = ai + 1;
            return new fmi(d, d(jArr[i], ((long[]) obj2)[i]));
        }
        return new fmi(d, d);
    }

    @Override // defpackage.fmk
    public final boolean c() {
        return true;
    }
}
