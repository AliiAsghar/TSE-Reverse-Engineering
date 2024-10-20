package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.view.StatusBarBackgroundLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajvg implements ajvf {
    private final ajue a;
    private StatusBarBackgroundLayout b;
    private LinearLayout c;
    private final View d;

    public ajvg(ajue ajueVar, Window window, AttributeSet attributeSet, int i) {
        boolean z;
        this.a = ajueVar;
        View g = ajueVar.g(R.id.suc_layout_status);
        if (g != null) {
            if (g instanceof StatusBarBackgroundLayout) {
                this.b = (StatusBarBackgroundLayout) g;
            } else {
                this.c = (LinearLayout) g;
            }
            View decorView = window.getDecorView();
            this.d = decorView;
            window.setStatusBarColor(0);
            TypedArray obtainStyledAttributes = ajueVar.getContext().obtainStyledAttributes(attributeSet, ajuf.e, i, 0);
            if ((decorView.getSystemUiVisibility() & 8192) == 8192) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = obtainStyledAttributes.getBoolean(0, z);
            if (ajueVar.e()) {
                Context context = ajueVar.getContext();
                z2 = ajuu.h(context).l(context, ajus.CONFIG_LIGHT_STATUS_BAR, false);
            }
            if (z2) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            } else {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
            }
            a(obtainStyledAttributes.getDrawable(1));
            obtainStyledAttributes.recycle();
            return;
        }
        throw new NullPointerException("sucLayoutStatus cannot be null in StatusBarMixin");
    }

    public final void a(Drawable drawable) {
        boolean z;
        if (this.a.e() && !this.a.f()) {
            Context context = this.a.getContext();
            drawable = ajuu.h(context).f(context, ajus.CONFIG_STATUS_BAR_BACKGROUND);
        }
        StatusBarBackgroundLayout statusBarBackgroundLayout = this.b;
        if (statusBarBackgroundLayout == null) {
            this.c.setBackgroundDrawable(drawable);
            return;
        }
        statusBarBackgroundLayout.a = drawable;
        boolean z2 = true;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        statusBarBackgroundLayout.setWillNotDraw(z);
        if (drawable == null) {
            z2 = false;
        }
        statusBarBackgroundLayout.setFitsSystemWindows(z2);
        statusBarBackgroundLayout.invalidate();
    }
}
