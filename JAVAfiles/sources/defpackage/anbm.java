package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anbm implements Serializable {
    public static final /* synthetic */ int a = 0;
    private static final anbm b = new anbm(new int[0]);
    private final int[] c;
    private final int d;

    public anbm(int[] iArr) {
        int length = iArr.length;
        this.c = iArr;
        this.d = length;
    }

    public static anbm b(int i, int i2) {
        return new anbm(new int[]{i, i2});
    }

    public static anbm c(int i, int i2, int i3, int i4, int i5) {
        return new anbm(new int[]{i, i2, i3, i4, i5});
    }

    public final int a(int i) {
        albo.ad(i, this.d);
        return this.c[i];
    }

    public final boolean d() {
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof anbm)) {
            return false;
        }
        anbm anbmVar = (anbm) obj;
        if (this.d != anbmVar.d) {
            return false;
        }
        for (int i = 0; i < this.d; i++) {
            if (a(i) != anbmVar.a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    Object readResolve() {
        if (d()) {
            return b;
        }
        return this;
    }

    public final String toString() {
        if (d()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(this.d * 5);
        sb.append('[');
        sb.append(this.c[0]);
        for (int i = 1; i < this.d; i++) {
            sb.append(", ");
            sb.append(this.c[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        int[] iArr = this.c;
        int i = this.d;
        if (i < iArr.length) {
            return new anbm(Arrays.copyOfRange(iArr, 0, i));
        }
        return this;
    }
}
