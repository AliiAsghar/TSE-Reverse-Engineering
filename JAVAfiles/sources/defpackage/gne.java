package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gne implements edh {
    final /* synthetic */ ViewPager a;
    private final Rect b = new Rect();

    public gne(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // defpackage.edh
    public final efo ez(View view, efo efoVar) {
        efg efdVar;
        efo f = eek.f(view, efoVar);
        if (f.t()) {
            return f;
        }
        Rect rect = this.b;
        rect.left = f.b();
        rect.top = f.d();
        rect.right = f.c();
        rect.bottom = f.a();
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            efo e = eek.e(this.a.getChildAt(i), f);
            rect.left = Math.min(e.b(), rect.left);
            rect.top = Math.min(e.d(), rect.top);
            rect.right = Math.min(e.c(), rect.right);
            rect.bottom = Math.min(e.a(), rect.bottom);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            efdVar = new eff(f);
        } else if (Build.VERSION.SDK_INT >= 29) {
            efdVar = new efe(f);
        } else {
            efdVar = new efd(f);
        }
        efdVar.c(eaq.c(rect));
        return efdVar.a();
    }
}
