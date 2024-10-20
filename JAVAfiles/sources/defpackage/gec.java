package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gec {
    public static final gec a = new gec(0, arnv.a);
    public final int[] b;
    public final List c;
    public final int d;
    public final List e;

    public gec(int i, List list) {
        this(new int[]{i}, list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gec gecVar = (gec) obj;
        if (Arrays.equals(this.b, gecVar.b) && d.F(this.c, gecVar.c) && this.d == gecVar.d && d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) * 31) + this.c.hashCode()) * 31) + this.d) * 31;
    }

    public final String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.b) + ", data=" + this.c + ", hintOriginalPageOffset=" + this.d + ", hintOriginalIndices=null)";
    }

    public gec(int[] iArr, List list, int i) {
        iArr.getClass();
        list.getClass();
        this.b = iArr;
        this.c = list;
        this.d = i;
        this.e = null;
    }
}
