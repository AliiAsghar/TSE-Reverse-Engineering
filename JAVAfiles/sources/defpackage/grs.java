package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grs implements grr {
    private final /* synthetic */ int d;
    public static final grs c = new grs(1);
    public static final grs b = new grs(0);

    private grs(int i) {
        this.d = i;
    }

    @Override // defpackage.grr
    public final Rect a(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        DisplayCutout displayCutout = null;
        if (this.d != 0) {
            Rect rect = new Rect();
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                if (d$$ExternalSyntheticApiModelOutline0.m(activity)) {
                    Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                    invoke.getClass();
                    rect.set((Rect) invoke);
                } else {
                    Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                    invoke2.getClass();
                    rect.set((Rect) invoke2);
                }
            } catch (Exception e) {
                if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                    throw e;
                }
                Log.w(grq.b, e);
                activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
            }
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (!d$$ExternalSyntheticApiModelOutline0.m(activity)) {
                int aI = gvf.aI(activity);
                if (rect.bottom + aI == point.y) {
                    rect.bottom += aI;
                } else if (rect.right + aI == point.x) {
                    rect.right += aI;
                } else if (rect.left == aI) {
                    rect.left = 0;
                }
            }
            if ((rect.width() < point.x || rect.height() < point.y) && !d$$ExternalSyntheticApiModelOutline0.m(activity)) {
                defaultDisplay.getClass();
                try {
                    Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                    constructor.setAccessible(true);
                    Object newInstance = constructor.newInstance(null);
                    Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(defaultDisplay, newInstance);
                    Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(newInstance);
                    if (cok$$ExternalSyntheticApiModelOutline0.m$1(obj2)) {
                        displayCutout = cok$$ExternalSyntheticApiModelOutline0.m141m(obj2);
                    }
                } catch (Exception e2) {
                    if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                        throw e2;
                    }
                    Log.w(grq.b, e2);
                }
                if (displayCutout != null) {
                    int i = rect.left;
                    safeInsetLeft = displayCutout.getSafeInsetLeft();
                    if (i == safeInsetLeft) {
                        rect.left = 0;
                    }
                    int i2 = point.x - rect.right;
                    safeInsetRight = displayCutout.getSafeInsetRight();
                    if (i2 == safeInsetRight) {
                        int i3 = rect.right;
                        safeInsetRight2 = displayCutout.getSafeInsetRight();
                        rect.right = i3 + safeInsetRight2;
                    }
                    int i4 = rect.top;
                    safeInsetTop = displayCutout.getSafeInsetTop();
                    if (i4 == safeInsetTop) {
                        rect.top = 0;
                    }
                    int i5 = point.y - rect.bottom;
                    safeInsetBottom = displayCutout.getSafeInsetBottom();
                    if (i5 == safeInsetBottom) {
                        int i6 = rect.bottom;
                        safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                        rect.bottom = i6 + safeInsetBottom2;
                    }
                }
            }
            return rect;
        }
        Configuration configuration2 = activity.getResources().getConfiguration();
        try {
            Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField3.setAccessible(true);
            Object obj3 = declaredField3.get(configuration2);
            Object invoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
            invoke3.getClass();
            return new Rect((Rect) invoke3);
        } catch (Exception e3) {
            if (!(e3 instanceof NoSuchFieldException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException)) {
                throw e3;
            }
            Log.w(grq.b, e3);
            return c.a(activity);
        }
    }
}
