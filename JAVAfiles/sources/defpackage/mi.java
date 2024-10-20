package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mi extends nq {
    final /* synthetic */ mk a;

    public mi(mk mkVar) {
        this.a = mkVar;
    }

    @Override // defpackage.nq
    public final void dG(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        mk mkVar = this.a;
        int computeVerticalScrollRange = mkVar.l.computeVerticalScrollRange();
        int i3 = mkVar.k;
        if (computeVerticalScrollRange - i3 > 0 && i3 >= mkVar.a) {
            z = true;
        } else {
            z = false;
        }
        mkVar.m = z;
        int computeHorizontalScrollRange = mkVar.l.computeHorizontalScrollRange();
        int i4 = mkVar.j;
        if (computeHorizontalScrollRange - i4 > 0 && i4 >= mkVar.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        mkVar.n = z2;
        if (!mkVar.m) {
            if (!z2) {
                if (mkVar.o != 0) {
                    mkVar.g(0);
                    return;
                }
                return;
            }
        } else {
            float f = i3;
            mkVar.e = (int) ((f * (computeVerticalScrollOffset + (f / 2.0f))) / computeVerticalScrollRange);
            mkVar.d = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (mkVar.n) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i4;
            mkVar.h = (int) ((f3 * (f2 + (f3 / 2.0f))) / computeHorizontalScrollRange);
            mkVar.g = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = mkVar.o;
        if (i5 != 0 && i5 != 1) {
            return;
        }
        mkVar.g(1);
    }
}
