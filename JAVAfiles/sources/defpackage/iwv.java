package defpackage;

import android.app.Activity;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwv implements View.OnApplyWindowInsetsListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public iwv(ixd ixdVar, int i) {
        this.b = i;
        this.a = ixdVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        View findViewById;
        WindowInsets windowInsets2;
        boolean z;
        switch (this.b) {
            case 0:
                ((ixd) this.a).z = windowInsets.getSystemWindowInsetTop();
                return windowInsets;
            case 1:
                ixd ixdVar = (ixd) this.a;
                ixdVar.A = windowInsets;
                view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                ixdVar.R(null, new ilf(view, windowInsets, 18));
                ixdVar.aJ(false);
                if (!yhx.d && (findViewById = ixdVar.q().findViewById(R.id.appBarLayout)) != null && (windowInsets2 = ixdVar.A) != null) {
                    findViewById.dispatchApplyWindowInsets(windowInsets2);
                }
                return windowInsets;
            case 2:
                kma kmaVar = (kma) this.a;
                cj cjVar = (cj) kmaVar.c.b();
                cjVar.getClass();
                view.setPadding(windowInsets.getSystemWindowInsetLeft(), abbu.d(cjVar) + ((klu) kmaVar.b.b()).z().getDimensionPixelSize(R.dimen.action_bar_height), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom() + ((klu) kmaVar.b.b()).z().getDimensionPixelOffset(R.dimen.confirm_button_container_height));
                return windowInsets.consumeSystemWindowInsets();
            case 3:
                kvw kvwVar = (kvw) this.a;
                kvwVar.aE.a();
                view.setPadding(0, kvwVar.b.z().getDimensionPixelSize(R.dimen.conversation_list_first_item_extra_padding) + abbu.a(kvwVar.b.F()) + windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            case 4:
                FrameLayout frameLayout = (FrameLayout) view;
                int i = 0;
                while (true) {
                    if (i < frameLayout.getChildCount()) {
                        View childAt = frameLayout.getChildAt(i);
                        if (!(childAt instanceof ViewStub) && childAt.getVisibility() == 0) {
                            z = true;
                        } else {
                            i++;
                        }
                    } else {
                        z = false;
                    }
                }
                kvw kvwVar2 = (kvw) this.a;
                kvwVar2.aN = z;
                if (z) {
                    view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                } else {
                    view.setPadding(0, 0, 0, 0);
                }
                kwl kwlVar = kvwVar2.T;
                kvwVar2.b.y();
                int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
                boolean z2 = !z;
                View view2 = kwlVar.g;
                if (view2 != null && view2.isAttachedToWindow()) {
                    View view3 = kwlVar.g;
                    view3.getClass();
                    lga.M(view3, systemWindowInsetBottom, z2);
                } else if (!z) {
                    kwlVar.j = true;
                    kwlVar.i = systemWindowInsetBottom;
                }
                if (kvwVar2.d(kvwVar2.b) != null) {
                    int dimensionPixelSize = kvwVar2.b.z().getDimensionPixelSize(R.dimen.go_to_top_view_margin_bottom);
                    if (!z) {
                        dimensionPixelSize += windowInsets.getSystemWindowInsetBottom();
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kvwVar2.d(kvwVar2.b).getLayoutParams();
                    if (marginLayoutParams != null) {
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                    }
                }
                return windowInsets;
            case 5:
                view.getClass();
                windowInsets.getClass();
                view.setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, 0);
                dxv dxvVar = new dxv(view.getLayoutParams());
                TypedValue typedValue = new TypedValue();
                ngu nguVar = (ngu) this.a;
                if (((Activity) nguVar.a).getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
                    dxvVar.height = TypedValue.complexToDimensionPixelSize(typedValue.data, ((Activity) nguVar.a).getResources().getDisplayMetrics()) + windowInsets.getSystemWindowInsetTop();
                    view.setLayoutParams(dxvVar);
                } else {
                    view.setTranslationY(windowInsets.getSystemWindowInsetTop());
                }
                return windowInsets;
            case 6:
                ((ztc) this.a).j.setTranslationY(windowInsets.getSystemWindowInsetTop());
                return windowInsets;
            case 7:
                ((aapc) this.a).g(view, windowInsets);
                return windowInsets;
            case 8:
                ((aapc) this.a).g(view, windowInsets);
                return windowInsets;
            case 9:
                aiqr aiqrVar = (aiqr) this.a;
                int dimensionPixelSize2 = aiqrVar.getResources().getDimensionPixelSize(R.dimen.browse_view_padding_lr);
                view.setPadding(dimensionPixelSize2, aiqrVar.getResources().getDimensionPixelOffset(R.dimen.browse_view_padding_top), dimensionPixelSize2, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            case 10:
                ((airg) this.a).j.a = windowInsets;
                return windowInsets;
            case 11:
                airg airgVar = (airg) this.a;
                int dimensionPixelSize3 = airgVar.getResources().getDimensionPixelSize(R.dimen.search_view_padding_lr);
                view.setPadding(dimensionPixelSize3, airgVar.getResources().getDimensionPixelOffset(R.dimen.search_view_padding_top), dimensionPixelSize3, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            default:
                int dimensionPixelSize4 = ((airr) this.a).getResources().getDimensionPixelSize(R.dimen.pack_details_view_padding_lr);
                view.setPadding(dimensionPixelSize4, 0, dimensionPixelSize4, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }

    public /* synthetic */ iwv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
