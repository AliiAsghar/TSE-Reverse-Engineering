package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grx implements grw {
    private final /* synthetic */ int d;
    public static final grx c = new grx(2);
    public static final grx b = new grx(1);
    public static final grx a = new grx(0);

    private grx(int i) {
        this.d = i;
    }

    @Override // defpackage.grw
    public final gra a(Activity activity, gru gruVar) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        efg efdVar;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                activity.getClass();
                gon gonVar = new gon(grr.a.a().a(activity));
                if (Build.VERSION.SDK_INT >= 30) {
                    efdVar = new eff();
                } else if (Build.VERSION.SDK_INT >= 29) {
                    efdVar = new efe();
                } else {
                    efdVar = new efd();
                }
                efo a2 = efdVar.a();
                a2.getClass();
                return new gra(gonVar, a2, gruVar.a(activity));
            }
            gon gonVar2 = new gon(grr.a.a().a(activity));
            currentWindowMetrics = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            windowInsets = currentWindowMetrics.getWindowInsets();
            windowInsets.getClass();
            return new gra(gonVar2, efo.o(windowInsets), gruVar.a(activity));
        }
        return b.a(activity, gruVar);
    }

    @Override // defpackage.grw
    public final gra b(Context context, gru gruVar) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowMetrics currentWindowMetrics2;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics3;
        float density;
        WindowMetrics currentWindowMetrics4;
        WindowInsets windowInsets2;
        WindowMetrics currentWindowMetrics5;
        Rect bounds2;
        efg efdVar;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                Context context2 = context;
                while (context2 instanceof ContextWrapper) {
                    if (context2 instanceof Activity) {
                        return a((Activity) context2, gruVar);
                    }
                    if (context2 instanceof InputMethodService) {
                        Object systemService = context.getSystemService("window");
                        systemService.getClass();
                        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                        defaultDisplay.getClass();
                        Point aF = gvf.aF(defaultDisplay);
                        Rect rect = new Rect(0, 0, aF.x, aF.y);
                        float a2 = gruVar.a(context);
                        if (Build.VERSION.SDK_INT >= 30) {
                            efdVar = new eff();
                        } else if (Build.VERSION.SDK_INT >= 29) {
                            efdVar = new efe();
                        } else {
                            efdVar = new efd();
                        }
                        efo a3 = efdVar.a();
                        a3.getClass();
                        return new gra(rect, a3, a2);
                    }
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        context2.getClass();
                    } else {
                        Objects.toString(context);
                        throw new IllegalArgumentException(context.toString().concat(" is not a UiContext"));
                    }
                }
                throw new IllegalArgumentException(a.cc(context, "Context ", " is not a UiContext"));
            }
            WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
            currentWindowMetrics4 = windowManager.getCurrentWindowMetrics();
            windowInsets2 = currentWindowMetrics4.getWindowInsets();
            efo o = efo.o(windowInsets2);
            float f = context.getResources().getDisplayMetrics().density;
            currentWindowMetrics5 = windowManager.getCurrentWindowMetrics();
            bounds2 = currentWindowMetrics5.getBounds();
            bounds2.getClass();
            return new gra(bounds2, o, f);
        }
        WindowManager windowManager2 = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager2.getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        bounds.getClass();
        currentWindowMetrics2 = windowManager2.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics2.getWindowInsets();
        efo o2 = efo.o(windowInsets);
        currentWindowMetrics3 = windowManager2.getCurrentWindowMetrics();
        density = currentWindowMetrics3.getDensity();
        return new gra(bounds, o2, density);
    }

    @Override // defpackage.grw
    public final gra c(WindowMetrics windowMetrics, float f) {
        Rect bounds;
        WindowInsets windowInsets;
        float density;
        Rect bounds2;
        WindowInsets windowInsets2;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                bounds2 = windowMetrics.getBounds();
                bounds2.getClass();
                windowInsets2 = windowMetrics.getWindowInsets();
                return new gra(bounds2, efo.o(windowInsets2), f);
            }
            throw new UnsupportedOperationException("translateWindowMetrics not available before API30");
        }
        bounds = windowMetrics.getBounds();
        bounds.getClass();
        windowInsets = windowMetrics.getWindowInsets();
        efo o = efo.o(windowInsets);
        density = windowMetrics.getDensity();
        return new gra(bounds, o, density);
    }
}
