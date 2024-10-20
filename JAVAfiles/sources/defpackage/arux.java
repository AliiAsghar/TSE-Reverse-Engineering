package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arux implements Comparable {
    private final long a;

    public static long b(long j) {
        int i = aruw.a;
        long b = aruw.b();
        aruv aruvVar = aruv.a;
        aruvVar.getClass();
        if ((((-1) + j) | 1) == Long.MAX_VALUE) {
            return arut.k(arrj.l(j));
        }
        return arrj.m(b, j, aruvVar);
    }

    public final long a() {
        return b(this.a);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        long m;
        arux aruxVar = (arux) obj;
        aruxVar.getClass();
        int i = aruw.a;
        aruv aruvVar = aruv.a;
        aruvVar.getClass();
        long j = aruxVar.a;
        long j2 = (j - 1) | 1;
        long j3 = this.a;
        if (j2 == Long.MAX_VALUE) {
            if (j3 == j) {
                long j4 = arut.a;
                m = 0;
            } else {
                m = arut.k(arrj.l(j));
            }
        } else if ((((-1) + j3) | 1) == Long.MAX_VALUE) {
            m = arrj.l(j3);
        } else {
            m = arrj.m(j3, j, aruvVar);
        }
        long j5 = arut.a;
        return arut.a(m, 0L);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof arux) && this.a == ((arux) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.a);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.a + ")";
    }
}
