package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbv {
    public static final /* synthetic */ int a = 0;

    static {
        uuh.d(uuh.b, "large_screen_size_in_inch", 7.0f);
    }

    public static int a(Context context) {
        return b(context).x;
    }

    public static Point b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point;
    }

    public static boolean c(Context context) {
        if (b(context).x < context.getResources().getDimensionPixelSize(R.dimen.small_screen_width_dp)) {
            return true;
        }
        return false;
    }
}
