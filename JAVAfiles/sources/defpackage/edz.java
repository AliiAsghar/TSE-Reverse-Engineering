package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edz {
    public static float a(View view) {
        return view.getElevation();
    }

    public static float b(View view) {
        return view.getZ();
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static efo e(View view, efo efoVar, Rect rect) {
        WindowInsets e = efoVar.e();
        if (e != null) {
            return efo.p(view.computeSystemWindowInsets(e, rect), view);
        }
        rect.setEmpty();
        return efoVar;
    }

    public static String f(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void h(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void i(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void j(View view, float f) {
        view.setElevation(f);
    }

    public static void k(View view, edh edhVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, edhVar);
        }
        if (edhVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new edy(view, edhVar));
        }
    }

    public static void l(View view, String str) {
        view.setTransitionName(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(View view) {
        view.stopNestedScroll();
    }

    public static boolean n(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void o(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof ede) {
            ((ede) viewParent).e(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.cc(viewParent, "ViewParent ", " does not implement interface method onNestedPreScroll"), e);
            }
        }
    }

    public static void p(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof edf) {
            ((edf) viewParent).g(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof ede) {
            ((ede) viewParent).f(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.cc(viewParent, "ViewParent ", " does not implement interface method onNestedScroll"), e);
            }
        }
    }

    public static void q(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof ede) {
            ((ede) viewParent).h(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.cc(viewParent, "ViewParent ", " does not implement interface method onNestedScrollAccepted"), e);
            }
        }
    }

    public static void r(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof ede) {
            ((ede) viewParent).i(view, i);
        } else if (i == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.cc(viewParent, "ViewParent ", " does not implement interface method onStopNestedScroll"), e);
            }
        }
    }

    public static boolean s(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", a.cc(viewParent, "ViewParent ", " does not implement interface method onNestedFling"), e);
            return false;
        }
    }

    public static boolean t(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", a.cc(viewParent, "ViewParent ", " does not implement interface method onNestedPreFling"), e);
            return false;
        }
    }

    public static boolean u(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof ede) {
            return ((ede) viewParent).u(view, view2, i, i2);
        }
        if (i2 == 0) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.cc(viewParent, "ViewParent ", " does not implement interface method onStartNestedScroll"), e);
                return false;
            }
        }
        return false;
    }

    public static boolean v(Throwable th) {
        if (eul.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(")) {
            return true;
        }
        return false;
    }

    public static boolean w(Throwable th) {
        if (eul.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(")) {
            return true;
        }
        return false;
    }

    public static byte[] x(evg evgVar, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        ewb ewbVar = new ewb(evgVar);
        evk evkVar = new evk();
        evkVar.b(str);
        evkVar.d = map;
        evkVar.b = 2;
        evkVar.c = bArr;
        evkVar.f = 1;
        evl a = evkVar.a();
        int i = 0;
        while (true) {
            try {
                evj evjVar = new evj(ewbVar, a);
                try {
                    try {
                        return amcp.b(evjVar);
                    } finally {
                        eul.R(evjVar);
                    }
                } catch (evx e) {
                    int i2 = e.c;
                    String str2 = null;
                    if ((i2 == 307 || i2 == 308) && i < 5 && (map2 = e.d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                        str2 = (String) list.get(0);
                    }
                    if (str2 != null) {
                        i++;
                        evk evkVar2 = new evk(a);
                        evkVar2.b(str2);
                        a = evkVar2.a();
                    } else {
                        throw e;
                    }
                }
            } catch (Exception e2) {
                dzg.g(ewbVar.b);
                ewbVar.e();
                throw new fed(e2);
            }
        }
    }

    public static void y(fdp fdpVar, fdp fdpVar2) {
        if (fdpVar != fdpVar2) {
            if (fdpVar2 != null) {
                fdpVar2.n(null);
            }
            if (fdpVar != null) {
                fdpVar.o(null);
            }
        }
    }
}
