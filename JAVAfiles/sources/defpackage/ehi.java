package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ehi extends ecl {
    private static final Rect e = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager a;
    public final View b;
    private ehh j;
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final int[] i = new int[2];
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;

    public ehi(View view) {
        if (view != null) {
            this.b = view;
            this.a = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // defpackage.ecl
    public final ega a(View view) {
        if (this.j == null) {
            this.j = new ehh(this);
        }
        return this.j;
    }

    @Override // defpackage.ecl
    public void c(View view, efx efxVar) {
        super.c(view, efxVar);
        m(efxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final efx j(int i) {
        boolean z;
        if (i == -1) {
            efx efxVar = new efx(AccessibilityNodeInfo.obtain(this.b));
            View view = this.b;
            int[] iArr = eek.a;
            view.onInitializeAccessibilityNodeInfo(efxVar.a);
            ArrayList arrayList = new ArrayList();
            k(arrayList);
            if (efxVar.a.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                efxVar.i(this.b, ((Integer) arrayList.get(i2)).intValue());
            }
            return efxVar;
        }
        efx b = efx.b();
        b.w(true);
        b.y(true);
        b.q("android.view.View");
        Rect rect = e;
        b.m(rect);
        b.n(rect);
        b.I(this.b);
        n(i, b);
        if (b.e() == null && b.d() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        b.j(this.g);
        b.k(this.f);
        if (this.g.equals(rect) && this.f.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int actions = b.a.getActions();
        if ((actions & 64) == 0) {
            if ((actions & 128) == 0) {
                b.G(this.b.getContext().getPackageName());
                b.O(this.b, i);
                if (this.c == i) {
                    b.l(true);
                    b.g(128);
                } else {
                    b.l(false);
                    b.g(64);
                }
                if (this.d == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    b.g(2);
                } else if (b.Y()) {
                    b.g(1);
                }
                b.z(z);
                this.b.getLocationOnScreen(this.i);
                if (this.f.equals(rect)) {
                    Rect rect2 = this.g;
                    b.m(rect2);
                    Rect rect3 = new Rect();
                    rect3.set(rect2);
                    if (b.b != -1) {
                        efx b2 = efx.b();
                        Rect rect4 = new Rect();
                        for (int i3 = b.b; i3 != -1; i3 = b2.b) {
                            b2.J(this.b, -1);
                            b2.m(e);
                            n(i3, b2);
                            b2.j(rect4);
                            rect3.offset(rect4.left, rect4.top);
                        }
                    }
                    this.b.getLocationOnScreen(this.i);
                    rect3.offset(this.i[0] - this.b.getScrollX(), this.i[1] - this.b.getScrollY());
                    b.n(rect3);
                    b.k(this.f);
                }
                if (this.b.getLocalVisibleRect(this.h)) {
                    this.h.offset(this.i[0] - this.b.getScrollX(), this.i[1] - this.b.getScrollY());
                    if (this.f.intersect(this.h)) {
                        b.n(this.f);
                        Rect rect5 = this.f;
                        if (rect5 != null && !rect5.isEmpty() && this.b.getWindowVisibility() == 0) {
                            Object parent = this.b.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view2 = (View) parent;
                                    if (view2.getAlpha() <= brg.a || view2.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view2.getParent();
                                } else if (parent != null) {
                                    b.U(true);
                                }
                            }
                        }
                    }
                }
                return b;
            }
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }

    protected abstract void k(List list);

    protected abstract void n(int i, efx efxVar);

    public final boolean p(int i) {
        if (this.c == i) {
            this.c = Integer.MIN_VALUE;
            this.b.invalidate();
            s(i, 65536);
            return true;
        }
        return false;
    }

    public final boolean q(int i) {
        if (this.d != i) {
            return false;
        }
        this.d = Integer.MIN_VALUE;
        o(i, false);
        s(i, 8);
        return true;
    }

    public abstract boolean r(int i, int i2);

    public final void s(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i != Integer.MIN_VALUE && this.a.isEnabled() && (parent = this.b.getParent()) != null) {
            if (i != -1) {
                obtain = AccessibilityEvent.obtain(i2);
                efx j = j(i);
                obtain.getText().add(j.e());
                obtain.setContentDescription(j.d());
                obtain.setScrollable(j.ab());
                obtain.setPassword(j.aa());
                obtain.setEnabled(j.X());
                obtain.setChecked(j.V());
                l(i, obtain);
                if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
                obtain.setClassName(j.c());
                obtain.setSource(this.b, i);
                obtain.setPackageName(this.b.getContext().getPackageName());
            } else {
                obtain = AccessibilityEvent.obtain(i2);
                this.b.onInitializeAccessibilityEvent(obtain);
            }
            parent.requestSendAccessibilityEvent(this.b, obtain);
        }
    }

    protected void m(efx efxVar) {
    }

    protected void l(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(int i, boolean z) {
    }
}
