package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajma extends ajgl {
    public ajma() {
        super(null);
    }

    private static float y(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    private static float z(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    @Override // defpackage.ajgl
    public final void o(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float z;
        float y;
        RectF n = n(tabLayout, view);
        RectF n2 = n(tabLayout, view2);
        if (n.left < n2.left) {
            z = y(f);
            y = z(f);
        } else {
            z = z(f);
            y = y(f);
        }
        drawable.setBounds(ajdd.b((int) n.left, (int) n2.left, z), drawable.getBounds().top, ajdd.b((int) n.right, (int) n2.right, y), drawable.getBounds().bottom);
    }
}
