package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eaq {
    public static final eaq a = new eaq(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private eaq(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static eaq b(eaq eaqVar, eaq eaqVar2) {
        return d(Math.max(eaqVar.b, eaqVar2.b), Math.max(eaqVar.c, eaqVar2.c), Math.max(eaqVar.d, eaqVar2.d), Math.max(eaqVar.e, eaqVar2.e));
    }

    public static eaq c(Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static eaq d(int i, int i2, int i3, int i4) {
        if (i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 == 0) {
                    if (i4 != 0) {
                        i2 = 0;
                        i3 = 0;
                    } else {
                        return a;
                    }
                } else {
                    i2 = 0;
                }
            }
        }
        return new eaq(i, i2, i3, i4);
    }

    public static eaq e(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return d(i, i2, i3, i4);
    }

    public final Insets a() {
        Insets of;
        of = Insets.of(this.b, this.c, this.d, this.e);
        return of;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        eaq eaqVar = (eaq) obj;
        if (this.e == eaqVar.e && this.b == eaqVar.b && this.d == eaqVar.d && this.c == eaqVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
