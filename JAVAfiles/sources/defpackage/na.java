package defpackage;

import android.graphics.PointF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class na extends nz {
    private nl c;
    private nl d;

    private final int g(nw nwVar, nl nlVar, int i, int i2) {
        int i3;
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int at = nwVar.at();
        char c = 1;
        float f = 1.0f;
        if (at != 0) {
            View view = null;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            View view2 = null;
            for (int i6 = 0; i6 < at; i6++) {
                View aF = nwVar.aF(i6);
                int bt = nw.bt(aF);
                if (bt != -1) {
                    if (bt < i4) {
                        i3 = bt;
                    } else {
                        i3 = i4;
                    }
                    if (bt < i4) {
                        view = aF;
                    }
                    if (bt > i5) {
                        view2 = aF;
                        i5 = bt;
                    }
                    i4 = i3;
                }
            }
            if (view != null && view2 != null) {
                int max = Math.max(nlVar.a(view), nlVar.a(view2)) - Math.min(nlVar.d(view), nlVar.d(view2));
                if (max != 0) {
                    f = max / ((i5 - i4) + 1);
                }
            }
        }
        if (f <= brg.a) {
            return 0;
        }
        if (Math.abs(iArr[0]) > Math.abs(iArr[1])) {
            c = 0;
        }
        return Math.round(iArr[c] / f);
    }

    private final nl h(nw nwVar) {
        nl nlVar = this.d;
        if (nlVar == null || nlVar.a != nwVar) {
            this.d = new nj(nwVar);
        }
        return this.d;
    }

    private final nl i(nw nwVar) {
        nl nlVar = this.c;
        if (nlVar == null || nlVar.a != nwVar) {
            this.c = new nk(nwVar);
        }
        return this.c;
    }

    private static final int j(View view, nl nlVar) {
        return (nlVar.d(view) + (nlVar.b(view) / 2)) - (nlVar.j() + (nlVar.k() / 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nz
    public final int a(nw nwVar, int i, int i2) {
        int av;
        View b;
        int bt;
        int i3;
        PointF Q;
        int i4;
        int i5;
        if (!(nwVar instanceof oj) || (av = nwVar.av()) == 0 || (b = b(nwVar)) == null || (bt = nw.bt(b)) == -1 || (Q = ((oj) nwVar).Q(av - 1)) == null) {
            return -1;
        }
        int i6 = 0;
        if (nwVar.ag()) {
            i4 = g(nwVar, h(nwVar), i, 0);
            if (Q.x < brg.a) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (nwVar.ah()) {
            i5 = g(nwVar, i(nwVar), 0, i2);
            if (Q.y < brg.a) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (true == nwVar.ah()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = bt + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        if (i6 >= av) {
            return i3;
        }
        return i6;
    }

    @Override // defpackage.nz
    public View b(nw nwVar) {
        if (nwVar.ah()) {
            return ef.i(nwVar, i(nwVar));
        }
        if (nwVar.ag()) {
            return ef.i(nwVar, h(nwVar));
        }
        return null;
    }

    @Override // defpackage.nz
    public int[] c(nw nwVar, View view) {
        int[] iArr = new int[2];
        if (nwVar.ag()) {
            iArr[0] = j(view, h(nwVar));
        } else {
            iArr[0] = 0;
        }
        if (nwVar.ah()) {
            iArr[1] = j(view, i(nwVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
