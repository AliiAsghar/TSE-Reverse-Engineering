package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.home.toolbar.StatusBarScrimView;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lbd implements edh {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lbd(StatusBarScrimView statusBarScrimView, int i) {
        this.b = i;
        this.a = statusBarScrimView;
    }

    @Override // defpackage.edh
    public final efo ez(View view, efo efoVar) {
        boolean z;
        efo efoVar2;
        int i = this.b;
        if (i != 0) {
            boolean z2 = true;
            if (i != 1) {
                if (i != 2) {
                    ajek ajekVar = (ajek) this.a;
                    ajej ajejVar = ajekVar.g;
                    if (ajejVar != null) {
                        ajekVar.a.C.remove(ajejVar);
                    }
                    ajek ajekVar2 = (ajek) this.a;
                    ajekVar2.g = new ajej(ajekVar2.c, efoVar);
                    ajek ajekVar3 = (ajek) this.a;
                    ajekVar3.g.d(ajekVar3.getWindow());
                    ajek ajekVar4 = (ajek) this.a;
                    ajekVar4.a.O(ajekVar4.g);
                    return efoVar;
                }
                AppBarLayout appBarLayout = (AppBarLayout) this.a;
                if (true != appBarLayout.getFitsSystemWindows()) {
                    efoVar2 = null;
                } else {
                    efoVar2 = efoVar;
                }
                if (!Objects.equals(appBarLayout.c, efoVar2)) {
                    appBarLayout.c = efoVar2;
                    appBarLayout.k();
                    appBarLayout.requestLayout();
                }
                return efoVar;
            }
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a;
            if (!Objects.equals(coordinatorLayout.e, efoVar)) {
                coordinatorLayout.e = efoVar;
                if (efoVar.d() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                coordinatorLayout.f = z;
                if (z || coordinatorLayout.getBackground() != null) {
                    z2 = false;
                }
                coordinatorLayout.setWillNotDraw(z2);
                if (!efoVar.t()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = coordinatorLayout.getChildAt(i2);
                        int[] iArr = eek.a;
                        if (childAt.getFitsSystemWindows() && ((dxv) childAt.getLayoutParams()).a != null && efoVar.t()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return efoVar;
        }
        view.getClass();
        ((StatusBarScrimView) this.a).b.d(StatusBarScrimView.a[0], Integer.valueOf(efoVar.f(7).c));
        return efoVar;
    }

    public lbd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
