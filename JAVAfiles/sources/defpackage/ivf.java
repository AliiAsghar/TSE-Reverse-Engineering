package defpackage;

import android.view.View;
import android.view.WindowInsets;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ivf implements View.OnApplyWindowInsetsListener {
    private final /* synthetic */ int a;

    public /* synthetic */ ivf(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        View view2;
        View findViewById;
        switch (this.a) {
            case 0:
                alvi alviVar = ixd.a;
                view.setPadding(0, 0, 0, 0);
                return windowInsets;
            case 1:
                alwo alwoVar = inh.a;
                return windowInsets.consumeSystemWindowInsets();
            case 2:
                alvi alviVar2 = ixd.a;
                return windowInsets;
            case 3:
                view.getClass();
                windowInsets.getClass();
                return windowInsets;
            case 4:
                view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), 0);
                if (!kpt.a()) {
                    view2 = view.findViewById(R.id.action_bar_overflow);
                } else {
                    view2 = null;
                }
                if (view2 != null && (findViewById = view.findViewById(R.id.gk_tooltip_hack)) != null) {
                    view2.getLocationOnScreen(new int[2]);
                    float[] fArr = {r3[0] + (view2.getWidth() / 2), r3[1] + ((view2.getHeight() * 3) / 5)};
                    findViewById.setX(fArr[0]);
                    findViewById.setY(fArr[1]);
                }
                return windowInsets;
            case 5:
                view.getClass();
                windowInsets.getClass();
                return windowInsets;
            case 6:
                view.getClass();
                windowInsets.getClass();
                return windowInsets;
            case 7:
                view.getClass();
                windowInsets.getClass();
                return windowInsets;
            case 8:
                view.getClass();
                windowInsets.getClass();
                return windowInsets;
            case 9:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            case 10:
                view.setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, 0);
                return windowInsets;
            case 11:
                view.setPadding(0, 0, 0, 0);
                return windowInsets;
            case 12:
                view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
                return windowInsets;
            case 13:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            case 14:
                view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), 0);
                return windowInsets;
            case 15:
                view.setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, 0);
                return windowInsets;
            case 17:
                view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
            case 16:
                return windowInsets;
            default:
                view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
            case 18:
                return windowInsets;
        }
    }
}
