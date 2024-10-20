package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajdk extends ecl {
    final /* synthetic */ AppBarLayout a;
    final /* synthetic */ CoordinatorLayout b;
    final /* synthetic */ AppBarLayout.BaseBehavior c;

    public ajdk(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
        this.a = appBarLayout;
        this.b = coordinatorLayout;
        this.c = baseBehavior;
    }

    @Override // defpackage.ecl
    public final void c(View view, efx efxVar) {
        View T;
        super.c(view, efxVar);
        efxVar.q(ScrollView.class.getName());
        if (this.a.f() != 0 && (T = AppBarLayout.BaseBehavior.T(this.b)) != null) {
            AppBarLayout appBarLayout = this.a;
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((ajdm) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                    if (this.c.N() != (-this.a.f())) {
                        efxVar.h(efw.d);
                        efxVar.M(true);
                    }
                    if (this.c.N() != 0) {
                        if (T.canScrollVertically(-1)) {
                            if ((-this.a.b()) != 0) {
                                efxVar.h(efw.e);
                                efxVar.M(true);
                                return;
                            }
                            return;
                        }
                        efxVar.h(efw.e);
                        efxVar.M(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.ecl
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 4096) {
            this.a.i(false);
            return true;
        }
        if (i == 8192) {
            if (this.c.N() != 0) {
                View T = AppBarLayout.BaseBehavior.T(this.b);
                if (T.canScrollVertically(-1)) {
                    int i2 = -this.a.b();
                    if (i2 != 0) {
                        this.c.U(this.b, this.a, T, i2, new int[]{0, 0});
                        return true;
                    }
                } else {
                    this.a.i(true);
                    return true;
                }
            }
            return false;
        }
        return super.i(view, i, bundle);
    }
}
