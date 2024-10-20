package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hxs {
    static Integer a;
    public final View b;
    public final List c = new ArrayList();
    boolean d;
    public hxr e;

    public hxs(View view) {
        this.b = view;
    }

    public static final boolean d(int i, int i2) {
        if (f(i) && f(i2)) {
            return true;
        }
        return false;
    }

    private final int e(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        if (!this.d || !this.b.isLayoutRequested()) {
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (!this.b.isLayoutRequested() && i2 == -2) {
                if (Log.isLoggable("ViewTarget", 4)) {
                    Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
                }
                Context context = this.b.getContext();
                if (a == null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    hwr.i(windowManager);
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    a = Integer.valueOf(Math.max(point.x, point.y));
                }
                return a.intValue();
            }
            return 0;
        }
        return 0;
    }

    private static final boolean f(int i) {
        if (i <= 0 && i != Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final int a() {
        int i;
        View view = this.b;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.height;
        } else {
            i = 0;
        }
        return e(this.b.getHeight(), i, paddingTop);
    }

    public final int b() {
        int i;
        View view = this.b;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        return e(this.b.getWidth(), i, paddingLeft);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.e);
        }
        this.e = null;
        this.c.clear();
    }
}
