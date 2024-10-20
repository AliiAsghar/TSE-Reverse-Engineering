package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eug {
    public static final eug a = new eug(-1, -1);
    public final int b;
    public final int c;

    static {
        new eug(0, 0);
    }

    public eug(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        d.s(z);
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof eug) {
            eug eugVar = (eug) obj;
            if (this.b == eugVar.b && this.c == eugVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        return ((i >>> 16) | (i << 16)) ^ this.c;
    }

    public final String toString() {
        return this.b + "x" + this.c;
    }
}
