package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esf {
    public final int a;
    public final esa b;
    public final int[] c;
    public final boolean[] d;
    private final boolean e;

    static {
        eul.M(0);
        eul.M(1);
        eul.M(3);
        eul.M(4);
    }

    public esf(esa esaVar, boolean z, int[] iArr, boolean[] zArr) {
        boolean z2;
        int i = esaVar.a;
        this.a = i;
        if (i == iArr.length && i == zArr.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.s(z2);
        this.b = esaVar;
        this.e = z && i > 1;
        this.c = (int[]) iArr.clone();
        this.d = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.b.c;
    }

    public final eqn b(int i) {
        return this.b.a(i);
    }

    public final boolean c(int i) {
        return this.d[i];
    }

    public final boolean d(int i) {
        if (this.c[i] != 4) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            esf esfVar = (esf) obj;
            if (this.e == esfVar.e && this.b.equals(esfVar.b) && Arrays.equals(this.c, esfVar.c) && Arrays.equals(this.d, esfVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + (this.e ? 1 : 0)) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }
}
