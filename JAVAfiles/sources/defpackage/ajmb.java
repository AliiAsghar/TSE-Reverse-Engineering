package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajmb extends ajgl {
    public ajmb() {
        super(null);
    }

    @Override // defpackage.ajgl
    public final void o(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float a;
        if (f >= 0.5f) {
            view = view2;
        }
        RectF n = n(tabLayout, view);
        if (f < 0.5f) {
            a = ajdd.a(1.0f, brg.a, brg.a, 0.5f, f);
        } else {
            a = ajdd.a(brg.a, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) n.left, drawable.getBounds().top, (int) n.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (a * 255.0f));
    }
}
