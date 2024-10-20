package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class god implements ny {
    @Override // defpackage.ny
    public final void c(View view) {
        nx nxVar = (nx) view.getLayoutParams();
        if (nxVar.width == -1 && nxVar.height == -1) {
        } else {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    @Override // defpackage.ny
    public final void d(View view) {
    }
}
