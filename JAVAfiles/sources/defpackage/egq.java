package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egq extends ecl {
    @Override // defpackage.ecl
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.b(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.c() > 0) {
            z = true;
        } else {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.c());
    }

    @Override // defpackage.ecl
    public final void c(View view, efx efxVar) {
        int c;
        super.c(view, efxVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        efxVar.q(ScrollView.class.getName());
        if (nestedScrollView.isEnabled() && (c = nestedScrollView.c()) > 0) {
            efxVar.M(true);
            if (nestedScrollView.getScrollY() > 0) {
                efxVar.h(efw.e);
                efxVar.h(efw.j);
            }
            if (nestedScrollView.getScrollY() < c) {
                efxVar.h(efw.d);
                efxVar.h(efw.l);
            }
        }
    }

    @Override // defpackage.ecl
    public final boolean i(View view, int i, Bundle bundle) {
        if (super.i(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i != 4096) {
            if (i != 8192 && i != 16908344) {
                if (i != 16908346) {
                    return false;
                }
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.v(max);
                return true;
            }
        }
        int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.c());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.v(min);
        return true;
    }
}
