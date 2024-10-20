package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fin implements fje {
    protected final esa a;
    protected final int b;
    protected final int[] c;
    private final eqn[] d;
    private int e;

    /* JADX INFO: Access modifiers changed from: protected */
    public fin(esa esaVar, int[] iArr, List list) {
        this(esaVar, iArr);
        alog.n(list);
    }

    public static void h(List list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            alob alobVar = (alob) list.get(i);
            if (alobVar != null) {
                alobVar.h(new fim(j, jArr[i]));
            }
        }
    }

    @Override // defpackage.fjg
    public final int a(int i) {
        return this.c[i];
    }

    @Override // defpackage.fje
    public final int b() {
        return this.c[0];
    }

    @Override // defpackage.fjg
    public final int c(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.fjg
    public final int d() {
        return this.c.length;
    }

    @Override // defpackage.fjg
    public final eqn e(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fin finVar = (fin) obj;
            if (this.a.equals(finVar.a) && Arrays.equals(this.c, finVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fje
    public final eqn f() {
        return this.d[0];
    }

    @Override // defpackage.fjg
    public final esa g() {
        return this.a;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int identityHashCode = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
            this.e = identityHashCode;
            return identityHashCode;
        }
        return i;
    }

    public fin(esa esaVar, int[] iArr) {
        int length = iArr.length;
        dzg.d(length > 0);
        this.a = esaVar;
        this.b = length;
        this.d = new eqn[length];
        for (int i = 0; i < iArr.length; i++) {
            this.d[i] = esaVar.a(iArr[i]);
        }
        Arrays.sort(this.d, new ebn(2));
        this.c = new int[this.b];
        for (int i2 = 0; i2 < this.b; i2++) {
            int[] iArr2 = this.c;
            eqn eqnVar = this.d[i2];
            int i3 = 0;
            while (true) {
                eqn[] eqnVarArr = esaVar.d;
                if (i3 >= eqnVarArr.length) {
                    i3 = -1;
                    break;
                } else if (eqnVar == eqnVarArr[i3]) {
                    break;
                } else {
                    i3++;
                }
            }
            iArr2[i2] = i3;
        }
    }
}
