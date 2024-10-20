package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.ActionBarContextView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fb implements edh {
    final /* synthetic */ fo a;

    public fb(fo foVar) {
        this.a = foVar;
    }

    @Override // defpackage.edh
    public final efo ez(View view, efo efoVar) {
        int i;
        boolean z;
        efo efoVar2;
        efg efdVar;
        boolean z2;
        int b;
        int c;
        int color;
        Insets of;
        WindowInsets.Builder systemWindowInsets;
        WindowInsets build;
        Insets systemWindowInsets2;
        int i2;
        int i3;
        int i4;
        int i5;
        fo foVar = this.a;
        int d = efoVar.d();
        int d2 = efoVar.d();
        ActionBarContextView actionBarContextView = foVar.s;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) foVar.s.getLayoutParams();
            if (foVar.s.isShown()) {
                if (foVar.L == null) {
                    foVar.L = new Rect();
                    foVar.M = new Rect();
                }
                Rect rect = foVar.L;
                Rect rect2 = foVar.M;
                rect.set(efoVar.b(), efoVar.d(), efoVar.c(), efoVar.a());
                ViewGroup viewGroup = foVar.x;
                if (Build.VERSION.SDK_INT >= 29) {
                    WindowInsets.Builder builder = new WindowInsets.Builder();
                    of = Insets.of(rect);
                    systemWindowInsets = builder.setSystemWindowInsets(of);
                    build = systemWindowInsets.build();
                    systemWindowInsets2 = viewGroup.computeSystemWindowInsets(build, rect2).getSystemWindowInsets();
                    i2 = systemWindowInsets2.left;
                    i3 = systemWindowInsets2.top;
                    i4 = systemWindowInsets2.right;
                    i5 = systemWindowInsets2.bottom;
                    rect.set(i2, i3, i4, i5);
                } else {
                    if (!qn.a) {
                        qn.a = true;
                        try {
                            qn.b = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            if (!qn.b.isAccessible()) {
                                qn.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = qn.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i6 = rect.top;
                int i7 = rect.left;
                int i8 = rect.right;
                efo a = eea.a(foVar.x);
                if (a == null) {
                    b = 0;
                } else {
                    b = a.b();
                }
                if (a == null) {
                    c = 0;
                } else {
                    c = a.c();
                }
                if (marginLayoutParams.topMargin == i6 && marginLayoutParams.leftMargin == i7 && marginLayoutParams.rightMargin == i8) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i6;
                    marginLayoutParams.leftMargin = i7;
                    marginLayoutParams.rightMargin = i8;
                    z2 = true;
                }
                if (i6 > 0 && foVar.y == null) {
                    foVar.y = new View(foVar.k);
                    i = 8;
                    foVar.y.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    foVar.x.addView(foVar.y, -1, layoutParams);
                } else {
                    i = 8;
                    View view2 = foVar.y;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (marginLayoutParams2.height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            foVar.y.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = foVar.y;
                if (view3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && view3.getVisibility() != 0) {
                    View view4 = foVar.y;
                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = foVar.k.getColor(R.color.abc_decor_view_status_guard_light);
                    } else {
                        color = foVar.k.getColor(R.color.abc_decor_view_status_guard);
                    }
                    view4.setBackgroundColor(color);
                }
                if (!foVar.B && z) {
                    d2 = 0;
                }
            } else {
                i = 8;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                    z = false;
                } else {
                    z2 = false;
                    z = false;
                }
            }
            if (z2) {
                foVar.s.setLayoutParams(marginLayoutParams);
            }
        } else {
            i = 8;
            z = false;
        }
        View view5 = foVar.y;
        if (view5 != null) {
            if (true == z) {
                i = 0;
            }
            view5.setVisibility(i);
        }
        if (d != d2) {
            int b2 = efoVar.b();
            int c2 = efoVar.c();
            int a2 = efoVar.a();
            if (Build.VERSION.SDK_INT >= 30) {
                efdVar = new eff(efoVar);
            } else if (Build.VERSION.SDK_INT >= 29) {
                efdVar = new efe(efoVar);
            } else {
                efdVar = new efd(efoVar);
            }
            efdVar.c(eaq.d(b2, d2, c2, a2));
            efoVar2 = efdVar.a();
        } else {
            efoVar2 = efoVar;
        }
        return eek.f(view, efoVar2);
    }
}
