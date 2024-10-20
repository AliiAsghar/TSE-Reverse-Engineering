package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eez extends efc {
    public static final Interpolator a = new PathInterpolator(brg.a, 1.1f, brg.a, 1.0f);
    public static final Interpolator b = new emp();
    public static final Interpolator c = new DecelerateInterpolator();

    public eez(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static eeu b(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof eey) {
            return ((eey) tag).a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, efo efoVar, List list) {
        eeu b2 = b(view);
        if (b2 != null) {
            efoVar = b2.b(efoVar, list);
            if (b2.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                c(viewGroup.getChildAt(i), efoVar, list);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(View view, mka mkaVar) {
        eeu b2 = b(view);
        if (b2 != null) {
            b2.e(mkaVar);
            if (b2.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i), mkaVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void e(View view, mka mkaVar, WindowInsets windowInsets, boolean z) {
        boolean z2;
        eeu b2 = b(view);
        boolean z3 = z;
        if (b2 != null) {
            b2.b = windowInsets;
            z3 = z;
            if (!z) {
                b2.c();
                z3 = b2.c ^ 1;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (true != z3) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                e(viewGroup.getChildAt(i), mkaVar, windowInsets, z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view, mka mkaVar, eet eetVar) {
        eeu b2 = b(view);
        if (b2 != null) {
            b2.d(eetVar);
            if (b2.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), mkaVar, eetVar);
            }
        }
    }
}
