package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class erz {
    public static final erz a = new erw();

    static {
        eul.M(0);
        eul.M(1);
        eul.M(2);
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract erx d(int i, erx erxVar, boolean z);

    public abstract ery e(int i, ery eryVar, long j);

    public final boolean equals(Object obj) {
        int h;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erz)) {
            return false;
        }
        erz erzVar = (erz) obj;
        if (erzVar.c() == c() && erzVar.b() == b()) {
            ery eryVar = new ery();
            erx erxVar = new erx();
            ery eryVar2 = new ery();
            erx erxVar2 = new erx();
            for (int i = 0; i < c(); i++) {
                if (!p(i, eryVar).equals(erzVar.p(i, eryVar2))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < b(); i2++) {
                if (!d(i2, erxVar, true).equals(erzVar.d(i2, erxVar2, true))) {
                    return false;
                }
            }
            int g = g(true);
            if (g == erzVar.g(true) && (h = h(true)) == erzVar.h(true)) {
                while (g != h) {
                    int j = j(g, 0, true);
                    if (j != erzVar.j(g, 0, true)) {
                        return false;
                    }
                    g = j;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int i);

    public int g(boolean z) {
        if (q()) {
            return -1;
        }
        return 0;
    }

    public int h(boolean z) {
        if (q()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i;
        ery eryVar = new ery();
        erx erxVar = new erx();
        int c = c() + 217;
        int i2 = 0;
        while (true) {
            i = c * 31;
            if (i2 >= c()) {
                break;
            }
            c = i + p(i2, eryVar).hashCode();
            i2++;
        }
        int b = i + b();
        for (int i3 = 0; i3 < b(); i3++) {
            b = (b * 31) + d(i3, erxVar, true).hashCode();
        }
        int g = g(true);
        while (g != -1) {
            b = (b * 31) + g;
            g = j(g, 0, true);
        }
        return b;
    }

    public final int i(int i, erx erxVar, ery eryVar, int i2, boolean z) {
        int i3 = n(i, erxVar).c;
        if (p(i3, eryVar).o == i) {
            int j = j(i3, i2, z);
            if (j == -1) {
                return -1;
            }
            return p(j, eryVar).n;
        }
        return i + 1;
    }

    public int j(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == h(z)) {
                        return g(z);
                    }
                    return i + 1;
                }
                throw new IllegalStateException();
            }
            return i;
        }
        if (i == h(z)) {
            return -1;
        }
        return i + 1;
    }

    public int k(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == g(z)) {
                        return h(z);
                    }
                    return i - 1;
                }
                throw new IllegalStateException();
            }
            return i;
        }
        if (i == g(z)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair l(ery eryVar, erx erxVar, int i, long j) {
        Pair m = m(eryVar, erxVar, i, j, 0L);
        dzg.g(m);
        return m;
    }

    public final Pair m(ery eryVar, erx erxVar, int i, long j, long j2) {
        dzg.f(i, c());
        e(i, eryVar, j2);
        if (j == -9223372036854775807L) {
            j = eryVar.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = eryVar.n;
        n(i2, erxVar);
        while (i2 < eryVar.o && erxVar.e != j) {
            int i3 = i2 + 1;
            if (n(i3, erxVar).e > j) {
                break;
            }
            i2 = i3;
        }
        d(i2, erxVar, true);
        long j3 = j - erxVar.e;
        long j4 = erxVar.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = erxVar.b;
        dzg.g(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    public final erx n(int i, erx erxVar) {
        return d(i, erxVar, false);
    }

    public erx o(Object obj, erx erxVar) {
        return d(a(obj), erxVar, true);
    }

    public final ery p(int i, ery eryVar) {
        return e(i, eryVar, 0L);
    }

    public final boolean q() {
        if (c() == 0) {
            return true;
        }
        return false;
    }
}
