package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aixu {
    static final Object[] a;
    public final Object[] b;
    private final int c;

    static {
        Object[] objArr = new Object[0];
        a = objArr;
        new aixu(objArr);
    }

    public aixu(Object... objArr) {
        this.b = objArr;
        this.c = Arrays.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aixu) {
            aixu aixuVar = (aixu) obj;
            if (this.c == aixuVar.c && Arrays.equals(this.b, aixuVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return Arrays.toString(this.b);
    }
}
