package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fll implements fmk {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public fll(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        } else {
            this.f = 0L;
        }
    }

    @Override // defpackage.fmk
    public final long a() {
        return this.f;
    }

    @Override // defpackage.fmk
    public final fmi b(long j) {
        long[] jArr = this.e;
        int ai = eul.ai(jArr, j, true);
        fml fmlVar = new fml(jArr[ai], this.c[ai]);
        if (fmlVar.b < j && ai != this.a - 1) {
            int i = ai + 1;
            return new fmi(fmlVar, new fml(this.e[i], this.c[i]));
        }
        return new fmi(fmlVar, fmlVar);
    }

    @Override // defpackage.fmk
    public final boolean c() {
        return true;
    }

    public final String toString() {
        long[] jArr = this.d;
        long[] jArr2 = this.e;
        long[] jArr3 = this.c;
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(jArr3) + ", timeUs=" + Arrays.toString(jArr2) + ", durationsUs=" + Arrays.toString(jArr) + ")";
    }
}
