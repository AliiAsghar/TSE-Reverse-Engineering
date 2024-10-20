package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amg {
    public static long a(long j, ama amaVar) {
        int c;
        int a;
        int d;
        int b;
        if (amaVar == ama.a) {
            c = dqs.d(j);
        } else {
            c = dqs.c(j);
        }
        ama amaVar2 = ama.a;
        if (amaVar == amaVar2) {
            a = dqs.b(j);
        } else {
            a = dqs.a(j);
        }
        if (amaVar == amaVar2) {
            d = dqs.c(j);
        } else {
            d = dqs.d(j);
        }
        if (amaVar == amaVar2) {
            b = dqs.a(j);
        } else {
            b = dqs.b(j);
        }
        return dqt.d(c, a, d, b);
    }

    public static final long b(long j, ama amaVar) {
        if (amaVar == ama.a) {
            return dqt.d(dqs.d(j), dqs.b(j), dqs.c(j), dqs.a(j));
        }
        return dqt.d(dqs.c(j), dqs.a(j), dqs.d(j), dqs.b(j));
    }

    public static /* synthetic */ long c(long j, int i) {
        int i2;
        int i3;
        int i4 = 0;
        if ((i & 1) != 0) {
            i2 = dqs.d(j);
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            i3 = dqs.b(j);
        } else {
            i3 = 0;
        }
        if ((i & 4) != 0) {
            i4 = dqs.c(j);
        }
        return dqt.d(i2, i3, i4, dqs.a(j));
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
