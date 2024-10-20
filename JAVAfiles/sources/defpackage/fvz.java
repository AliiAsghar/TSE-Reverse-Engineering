package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvz {
    public final ere a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final int f;
    public final fwa g;

    public fvz(ere ereVar, boolean z, long j, fwa fwaVar) {
        boolean z2;
        dzg.e(true, "Audio and video cannot both be removed");
        if (c(ereVar)) {
            if (j != -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            d.s(z2);
            d.s(!z && fwaVar.b.isEmpty());
        }
        this.a = ereVar;
        this.b = z;
        this.c = false;
        this.d = false;
        this.e = j;
        this.f = -2147483647;
        this.g = fwaVar;
    }

    private static boolean c(ere ereVar) {
        return Objects.equals(ereVar.a, "androidx-media3-GapMediaItem");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(long j) {
        long j2;
        if (this.b) {
            j2 = -9223372036854775807L;
        } else {
            alog alogVar = this.g.b;
            int size = alogVar.size();
            long j3 = j;
            for (int i = 0; i < size; i++) {
                j3 = ((esr) alogVar.get(i)).a(j3);
            }
            j2 = j3;
        }
        alog alogVar2 = this.g.c;
        int size2 = alogVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((eqk) alogVar2.get(i2)).a();
        }
        return Math.max(j2, j);
    }

    public final boolean b() {
        return c(this.a);
    }
}
