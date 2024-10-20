package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import defpackage.ajat;
import defpackage.ajgl;
import defpackage.ajlt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class Snackbar extends BaseTransientBottomBar {
    private static final int[] w = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public ajgl v;
    private final AccessibilityManager x;
    private boolean y;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class SnackbarLayout extends ajlt {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // defpackage.ajlt, android.widget.FrameLayout, android.view.View
        protected final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        super(context, viewGroup, view, snackbarContentLayout);
        this.x = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static Snackbar p(View view, int i, int i2) {
        return q(view, view.getResources().getText(i), i2);
    }

    public static Snackbar q(View view, CharSequence charSequence, int i) {
        return u(null, view, charSequence, i);
    }

    public static Snackbar r(Context context, View view, CharSequence charSequence) {
        return u(context, view, charSequence, 0);
    }

    private static Snackbar u(Context context, View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup != null) {
            if (context == null) {
                context = viewGroup.getContext();
            }
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(w);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            int i2 = R.layout.design_layout_snackbar_include;
            if (resourceId != -1 && resourceId2 != -1) {
                i2 = R.layout.mtrl_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, viewGroup, false);
            Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
            snackbar.v().a.setText(charSequence);
            snackbar.k = i;
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    private final SnackbarContentLayout v() {
        return (SnackbarContentLayout) this.j.getChildAt(0);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final int a() {
        int i;
        int recommendedTimeoutMillis;
        int i2 = this.k;
        if (i2 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (true != this.y) {
                i = 0;
            } else {
                i = 4;
            }
            recommendedTimeoutMillis = this.x.getRecommendedTimeoutMillis(i2, i | 3);
            return recommendedTimeoutMillis;
        }
        if (this.y && this.x.isTouchExplorationEnabled()) {
            return -2;
        }
        return i2;
    }

    public final void s(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button button = v().b;
        int i = 8;
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            this.y = true;
            button.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener(new ajat(this, onClickListener, i));
            return;
        }
        button.setVisibility(8);
        button.setOnClickListener(null);
        this.y = false;
    }

    public final void t(int i, View.OnClickListener onClickListener) {
        s(this.i.getText(i), onClickListener);
    }
}
