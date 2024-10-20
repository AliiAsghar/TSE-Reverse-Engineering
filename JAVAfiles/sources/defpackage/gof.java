package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gof extends LinearLayoutManager {
    final /* synthetic */ ViewPager2 a;

    public gof(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutManager
    public final void W(ol olVar, int[] iArr) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.h == -1) {
            super.W(olVar, iArr);
            return;
        }
        RecyclerView recyclerView = viewPager2.e;
        if (viewPager2.a() == 0) {
            recyclerView.getWidth();
            recyclerView.getPaddingLeft();
            recyclerView.getPaddingRight();
        } else {
            recyclerView.getHeight();
            recyclerView.getPaddingTop();
            recyclerView.getPaddingBottom();
        }
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // defpackage.nw
    public final boolean bn(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.nw
    public final void n(od odVar, ol olVar, View view, efx efxVar) {
        int i;
        int i2;
        goi goiVar = (goi) this.a.j;
        if (goiVar.a.a() == 1) {
            i = LinearLayoutManager.bt(view);
        } else {
            i = 0;
        }
        if (goiVar.a.a() == 0) {
            i2 = LinearLayoutManager.bt(view);
        } else {
            i2 = 0;
        }
        efxVar.t(efu.i(i, 1, i2, 1, false));
    }
}
