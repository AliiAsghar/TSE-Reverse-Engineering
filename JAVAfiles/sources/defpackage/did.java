package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class did {
    public static final int a(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (true) {
            char c = 1;
            if (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                dif difVar = (dif) list.get(i3);
                if (difVar.b <= i) {
                    if (difVar.c <= i) {
                        c = 65535;
                    } else {
                        c = 0;
                    }
                }
                if (c < 0) {
                    i2 = i3 + 1;
                } else if (c > 0) {
                    size = i3 - 1;
                } else {
                    return i3;
                }
            } else {
                return -(i2 + 1);
            }
        }
    }

    public static final int b(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (true) {
            char c = 1;
            if (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                dif difVar = (dif) list.get(i3);
                if (difVar.d <= i) {
                    if (difVar.e <= i) {
                        c = 65535;
                    } else {
                        c = 0;
                    }
                }
                if (c < 0) {
                    i2 = i3 + 1;
                } else if (c > 0) {
                    size = i3 - 1;
                } else {
                    return i3;
                }
            } else {
                return -(i2 + 1);
            }
        }
    }

    public static final int c(List list, float f) {
        if (f <= brg.a) {
            return 0;
        }
        if (f >= ((dif) aqjn.ac(list)).g) {
            return aqjn.z(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (true) {
            char c = 1;
            if (i <= size) {
                int i2 = (i + size) >>> 1;
                dif difVar = (dif) list.get(i2);
                if (difVar.f <= f) {
                    if (difVar.g <= f) {
                        c = 65535;
                    } else {
                        c = 0;
                    }
                }
                if (c < 0) {
                    i = i2 + 1;
                } else if (c > 0) {
                    size = i2 - 1;
                } else {
                    return i2;
                }
            } else {
                return -(i + 1);
            }
        }
    }

    public static final void d(List list, long j, arqr arqrVar) {
        int size = list.size();
        for (int a = a(list, djc.d(j)); a < size; a++) {
            dif difVar = (dif) list.get(a);
            if (difVar.b < djc.c(j)) {
                if (difVar.b != difVar.c) {
                    arqrVar.a(difVar);
                }
            } else {
                return;
            }
        }
    }
}
