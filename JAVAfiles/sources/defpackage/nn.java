package defpackage;

import android.graphics.PointF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nn extends nz {
    private nl c;
    private nl d;

    private final nl g(nw nwVar) {
        nl nlVar = this.d;
        if (nlVar == null || nlVar.a != nwVar) {
            this.d = new nj(nwVar);
        }
        return this.d;
    }

    private final nl h(nw nwVar) {
        nl nlVar = this.c;
        if (nlVar == null || nlVar.a != nwVar) {
            this.c = new nk(nwVar);
        }
        return this.c;
    }

    private static final int i(View view, nl nlVar) {
        return (nlVar.d(view) + (nlVar.b(view) / 2)) - (nlVar.j() + (nlVar.k() / 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nz
    public final int a(nw nwVar, int i, int i2) {
        nl nlVar;
        boolean z;
        PointF Q;
        int av = nwVar.av();
        if (av != 0) {
            View view = null;
            if (nwVar.ah()) {
                nlVar = h(nwVar);
            } else if (nwVar.ag()) {
                nlVar = g(nwVar);
            } else {
                nlVar = null;
            }
            if (nlVar != null) {
                int at = nwVar.at();
                boolean z2 = false;
                int i3 = Integer.MIN_VALUE;
                int i4 = Integer.MAX_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < at; i5++) {
                    View aF = nwVar.aF(i5);
                    if (aF != null) {
                        int i6 = i(aF, nlVar);
                        if (i6 <= 0 && i6 > i3) {
                            view2 = aF;
                            i3 = i6;
                        }
                        if (i6 >= 0 && i6 < i4) {
                            view = aF;
                            i4 = i6;
                        }
                    }
                }
                int i7 = 1;
                if (true != nwVar.ag()) {
                    i = i2;
                }
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && view != null) {
                    return nw.bt(view);
                }
                if (!z && view2 != null) {
                    return nw.bt(view2);
                }
                if (true == z) {
                    view = view2;
                }
                if (view != null) {
                    int bt = nw.bt(view);
                    int av2 = nwVar.av();
                    if ((nwVar instanceof oj) && (Q = ((oj) nwVar).Q(av2 - 1)) != null && (Q.x < brg.a || Q.y < brg.a)) {
                        z2 = true;
                    }
                    if (z2 == z) {
                        i7 = -1;
                    }
                    int i8 = bt + i7;
                    if (i8 >= 0 && i8 < av) {
                        return i8;
                    }
                }
            }
        }
        return -1;
    }

    @Override // defpackage.nz
    public View b(nw nwVar) {
        if (nwVar.ah()) {
            return ef.i(nwVar, h(nwVar));
        }
        if (nwVar.ag()) {
            return ef.i(nwVar, g(nwVar));
        }
        return null;
    }

    @Override // defpackage.nz
    public final int[] c(nw nwVar, View view) {
        int[] iArr = new int[2];
        if (nwVar.ag()) {
            iArr[0] = i(view, g(nwVar));
        } else {
            iArr[0] = 0;
        }
        if (nwVar.ah()) {
            iArr[1] = i(view, h(nwVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // defpackage.nz
    public final ok d(nw nwVar) {
        if (!(nwVar instanceof oj)) {
            return null;
        }
        return new nm(this, this.a.getContext());
    }
}
