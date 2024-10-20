package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbu {
    private final Context g;
    private final armf h;
    private static final alvi c = alvi.m("com/google/android/apps/messaging/ui/util/UiUtils");
    private static final xze d = xze.g("Bugle", "UiUtils");
    public static final Interpolator a = new xyr(0.4f, brg.a, 0.8f, 0.5f);
    public static final Interpolator b = new xyr(brg.a, brg.a, 0.2f, 1.0f);
    private static int e = -1;
    private static int f = -1;

    public abbu(Context context, armf armfVar) {
        this.g = context;
        this.h = armfVar;
    }

    public static int a(Activity activity) {
        if (activity == null) {
            d.q("Can't get action bar height. Provided activity is null");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        if (activity.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, activity.getResources().getDisplayMetrics());
        }
        return activity.getResources().getDimensionPixelSize(R.dimen.action_bar_height);
    }

    public static int b(Context context) {
        if (context.getResources().getConfiguration().orientation == 1) {
            return c(context);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (r0 == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(android.content.Context r12) {
        /*
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r12)
            boolean r0 = r0.hasPermanentMenuKey()
            java.lang.String r1 = "Bugle"
            java.lang.String r2 = "android"
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L17
            r0 = 4
            boolean r0 = android.view.KeyCharacterMap.deviceHasKey(r0)
            if (r0 == 0) goto L99
        L17:
            android.content.res.Resources r0 = r12.getResources()
            java.lang.String r5 = "config_showNavigationBar"
            java.lang.String r6 = "bool"
            int r0 = r0.getIdentifier(r5, r6, r2)
            if (r0 <= 0) goto L31
            android.content.res.Resources r5 = r12.getResources()
            boolean r0 = r5.getBoolean(r0)
            if (r0 == 0) goto L31
            r0 = r3
            goto L32
        L31:
            r0 = r4
        L32:
            java.lang.String r5 = "qemu.hw.mainkeys"
            r6 = 0
            java.lang.String r7 = "android.os.SystemProperties"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r8 = "get"
            r9 = 2
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L5e
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r10[r4] = r11     // Catch: java.lang.Throwable -> L5e
            r10[r3] = r11     // Catch: java.lang.Throwable -> L5e
            java.lang.reflect.Method r8 = r7.getDeclaredMethod(r8, r10)     // Catch: java.lang.Throwable -> L5e
            r8.setAccessible(r3)     // Catch: java.lang.Throwable -> L5e
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L5e
            r9[r4] = r5     // Catch: java.lang.Throwable -> L5e
            r9[r3] = r6     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r8.invoke(r7, r9)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L5e
            if (r7 != 0) goto L5c
            goto L85
        L5c:
            r6 = r7
            goto L85
        L5e:
            r7 = move-exception
            alvi r8 = defpackage.yhz.a
            alvw r8 = r8.h()
            alvz r9 = defpackage.alwp.a
            r8.X(r9, r1)
            alvg r8 = (defpackage.alvg) r8
            alvw r7 = r8.g(r7)
            alvg r7 = (defpackage.alvg) r7
            java.lang.String r8 = "getSystemProperty"
            r9 = 38
            java.lang.String r10 = "com/google/android/apps/messaging/shared/util/os/SystemProperties"
            java.lang.String r11 = "SystemProperties.java"
            alvw r7 = r7.h(r10, r8, r9, r11)
            alvg r7 = (defpackage.alvg) r7
            java.lang.String r8 = "Error while trying to retrieve system property '%s'"
            r7.t(r8, r5)
        L85:
            java.lang.String r5 = "1"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L8e
            goto Le8
        L8e:
            java.lang.String r5 = "0"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L97
            goto L99
        L97:
            if (r0 == 0) goto Le8
        L99:
            android.content.res.Resources r0 = r12.getResources()
            android.content.res.Configuration r5 = r0.getConfiguration()
            int r5 = r5.orientation
            android.content.res.Resources r12 = r12.getResources()
            android.content.res.Configuration r12 = r12.getConfiguration()
            int r12 = r12.screenLayout
            r12 = r12 & 15
            r6 = 3
            if (r12 >= r6) goto Lb5
            java.lang.String r12 = "navigation_bar_width"
            goto Lb7
        Lb5:
            java.lang.String r12 = "navigation_bar_height_landscape"
        Lb7:
            if (r5 != r3) goto Lbb
            java.lang.String r12 = "navigation_bar_height"
        Lbb:
            java.lang.String r3 = "dimen"
            int r12 = r0.getIdentifier(r12, r3, r2)
            if (r12 <= 0) goto Lc8
            int r12 = r0.getDimensionPixelSize(r12)
            return r12
        Lc8:
            alvi r12 = defpackage.abbu.c
            alvw r12 = r12.i()
            alvz r0 = defpackage.alwp.a
            r12.X(r0, r1)
            alvg r12 = (defpackage.alvg) r12
            java.lang.String r0 = "getNavigationBarSize"
            r1 = 322(0x142, float:4.51E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/ui/util/UiUtils"
            java.lang.String r3 = "UiUtils.java"
            alvw r12 = r12.h(r2, r0, r1, r3)
            alvg r12 = (defpackage.alvg) r12
            java.lang.String r0 = "Could not find navigation bar size"
            r12.q(r0)
        Le8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abbu.c(android.content.Context):int");
    }

    public static int d(Context context) {
        int i;
        int i2;
        int i3 = 0;
        boolean z = true;
        if (context.getResources().getConfiguration().orientation != 1) {
            z = false;
        }
        if (z && (i2 = e) != -1) {
            return i2;
        }
        if (!z && (i = f) != -1) {
            return i;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i3 = context.getResources().getDimensionPixelSize(identifier);
            if (z) {
                e = i3;
            } else {
                f = i3;
            }
        }
        return i3;
    }

    public static Activity e(Context context) {
        if (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (context instanceof ContextWrapper) {
                return e(((ContextWrapper) context).getBaseContext());
            }
            return null;
        }
        return null;
    }

    public static Activity f(View view) {
        if (view == null) {
            return null;
        }
        return e(view.getContext());
    }

    public static Activity g(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static void i(View view) {
        Activity f2 = f(view);
        if (f2 instanceof ex) {
            ex exVar = (ex) f2;
            dyx.d(view, exVar);
            dyy.o(view, exVar);
            gvf.bm(view, exVar);
        }
        if (f2 instanceof cj) {
            cj cjVar = (cj) f2;
            dyx.d(view, cjVar);
            dyy.o(view, cjVar);
            gvf.bm(view, cjVar);
        }
    }

    public static void j(TextView textView, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(0);
            textView.setText(charSequence);
        } else {
            textView.setVisibility(8);
        }
    }

    public static boolean n(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    public static void o(Activity activity, View view) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        double d2 = displayMetrics.widthPixels;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            int i = (int) (d2 * 0.15d);
            marginLayoutParams.setMargins(i, 0, i, 0);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    @Deprecated
    public final Toast h(int i) {
        return ((abay) this.h.b()).a(i, false);
    }

    @Deprecated
    public final void k(int i) {
        l(this.g.getString(i));
    }

    @Deprecated
    public final void l(String str) {
        xyo c2 = d.c();
        c2.H("showToastAtBottom");
        c2.z("message", str);
        c2.q();
        ((abay) this.h.b()).b(str, false);
    }

    public final boolean m() {
        return n(this.g);
    }

    public final void p(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            alvw i = c.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) i).g(e2)).h("com/google/android/apps/messaging/ui/util/UiUtils", "startExternalActivity", (char) 380, "UiUtils.java")).q("Couldn't find activity:");
            k(R.string.activity_not_found_message);
        }
    }
}
