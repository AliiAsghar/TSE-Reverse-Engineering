package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esa {
    public final int a;
    public final String b;
    public final int c;
    public final eqn[] d;
    private int e;

    static {
        eul.M(0);
        eul.M(1);
    }

    public esa(String str, eqn... eqnVarArr) {
        boolean z;
        int length = eqnVarArr.length;
        int i = 1;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        this.b = str;
        this.d = eqnVarArr;
        this.a = length;
        int b = erl.b(eqnVarArr[0].o);
        this.c = b == -1 ? erl.b(eqnVarArr[0].n) : b;
        String c = c(eqnVarArr[0].d);
        int b2 = b(eqnVarArr[0].f);
        while (true) {
            eqn[] eqnVarArr2 = this.d;
            if (i < eqnVarArr2.length) {
                if (!c.equals(c(eqnVarArr2[i].d))) {
                    eqn[] eqnVarArr3 = this.d;
                    d("languages", eqnVarArr3[0].d, eqnVarArr3[i].d, i);
                    return;
                } else {
                    eqn[] eqnVarArr4 = this.d;
                    if (b2 != b(eqnVarArr4[i].f)) {
                        d("role flags", Integer.toBinaryString(eqnVarArr4[0].f), Integer.toBinaryString(this.d[i].f), i);
                        return;
                    }
                    i++;
                }
            } else {
                return;
            }
        }
    }

    private static int b(int i) {
        return i | 16384;
    }

    private static String c(String str) {
        if (str != null && !str.equals("und")) {
            return str;
        }
        return "";
    }

    private static void d(String str, String str2, String str3, int i) {
        eub.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final eqn a(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            esa esaVar = (esa) obj;
            if (this.b.equals(esaVar.b) && Arrays.equals(this.d, esaVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = ((this.b.hashCode() + 527) * 31) + Arrays.hashCode(this.d);
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }
}
