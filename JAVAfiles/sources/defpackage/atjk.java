package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atjk {
    final char a;
    final int b;
    final int c;
    final int d;
    final boolean e;
    final int f;

    public atjk(char c, int i, int i2, int i3, boolean z, int i4) {
        if (c != 'u' && c != 'w' && c != 's') {
            throw new IllegalArgumentException("Unknown mode: " + c);
        }
        this.a = c;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    private final long d(atfu atfuVar, long j) {
        int i = this.c;
        if (i >= 0) {
            return ((atgr) atfuVar).k.h(j, i);
        }
        atgr atgrVar = (atgr) atfuVar;
        return atgrVar.k.e(atgrVar.m.e(atgrVar.k.h(j, 1), 1), this.c);
    }

    public final long a(atfu atfuVar, long j) {
        try {
            return d(atfuVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                atgr atgrVar = (atgr) atfuVar;
                if (!atgrVar.n.t(j)) {
                    j = atgrVar.n.e(j, 1);
                } else {
                    return d(atfuVar, j);
                }
            }
        }
    }

    public final long b(atfu atfuVar, long j) {
        try {
            return d(atfuVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                atgr atgrVar = (atgr) atfuVar;
                if (!atgrVar.n.t(j)) {
                    j = atgrVar.n.e(j, -1);
                } else {
                    return d(atfuVar, j);
                }
            }
        }
    }

    public final long c(atfu atfuVar, long j) {
        atgr atgrVar = (atgr) atfuVar;
        int a = this.d - atgrVar.j.a(j);
        if (a != 0) {
            if (this.e) {
                if (a < 0) {
                    a += 7;
                }
            } else if (a > 0) {
                a -= 7;
            }
            return atgrVar.j.e(j, a);
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof atjk) {
            atjk atjkVar = (atjk) obj;
            if (this.a == atjkVar.a && this.b == atjkVar.b && this.c == atjkVar.c && this.d == atjkVar.d && this.e == atjkVar.e && this.f == atjkVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Character.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f)});
    }

    public final String toString() {
        return "[OfYear]\nMode: " + this.a + "\nMonthOfYear: " + this.b + "\nDayOfMonth: " + this.c + "\nDayOfWeek: " + this.d + "\nAdvanceDayOfWeek: " + this.e + "\nMillisOfDay: " + this.f + "\n";
    }
}
