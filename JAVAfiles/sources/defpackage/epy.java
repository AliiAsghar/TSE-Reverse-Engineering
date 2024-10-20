package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epy {
    public static final epy a = new epy(new epx[0]);
    private static final epx e;
    private final epx[] f;
    public final long c = 0;
    public final int b = 0;
    public final int d = 0;

    static {
        epx epxVar = new epx(-1, new int[0], new ere[0], new long[0]);
        int[] iArr = epxVar.e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = epxVar.f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        e = new epx(0, copyOf, (ere[]) Arrays.copyOf(epxVar.d, 0), copyOf2);
        eul.M(1);
        eul.M(2);
        eul.M(3);
        eul.M(4);
    }

    private epy(epx[] epxVarArr) {
        this.f = epxVarArr;
    }

    public final epx a(int i) {
        if (i < 0) {
            return e;
        }
        return this.f[i];
    }

    public final void b() {
        a(-1);
        int i = epx.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            epy epyVar = (epy) obj;
            if (Objects.equals(null, null) && Arrays.equals(this.f, epyVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[])";
    }
}
