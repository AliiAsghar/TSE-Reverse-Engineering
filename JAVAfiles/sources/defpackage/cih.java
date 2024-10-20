package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cih {
    public static final cib a(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                return null;
                            }
                            return new cib(6);
                        }
                        return new cib(4);
                    }
                    return new cib(5);
                }
                return new cib(3);
            }
            return new cib(1);
        }
        return new cib(2);
    }

    public static final cjp b(View view, View view2) {
        view.getLocationInWindow(cig.a);
        int[] iArr = cig.a;
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int[] iArr2 = cig.a;
        int i3 = i - iArr2[0];
        float f = i3;
        float f2 = i2 - iArr2[1];
        return new cjp(f, f2, view.getWidth() + f, view.getHeight() + f2);
    }

    public static final drk c(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return drk.b;
        }
        return drk.a;
    }

    public static final Integer d(int i) {
        if (a.bA(i, 5)) {
            return 33;
        }
        if (a.bA(i, 6)) {
            return 130;
        }
        if (a.bA(i, 3)) {
            return 17;
        }
        if (a.bA(i, 4)) {
            return 66;
        }
        if (a.bA(i, 1)) {
            return 2;
        }
        if (!a.bA(i, 2)) {
            return null;
        }
        return 1;
    }

    public static final boolean e(View view, Integer num, Rect rect) {
        View view2;
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof dai) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            if (findNextFocusFromRect != null) {
                return findNextFocusFromRect.requestFocus(num.intValue(), rect);
            }
            return view.requestFocus(num.intValue(), rect);
        }
        if (view.hasFocus()) {
            view2 = view.findFocus();
        } else {
            view2 = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view2, num.intValue());
        if (findNextFocus != null) {
            return findNextFocus.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue());
    }
}
