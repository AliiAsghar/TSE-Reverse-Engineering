package defpackage;

import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class inj {
    private static final alwo i = alwo.o("BugleInputManager");
    public final Activity a;
    public final ioc b;
    public final View c;
    public final ViewGroup d;
    public final ViewGroup e;
    public int f;
    public ini g = ini.NONE;
    public final ink h;
    private final int j;
    private final atal k;

    public inj(Activity activity, ink inkVar, atal atalVar, ioc iocVar, View view) {
        this.a = activity;
        this.h = inkVar;
        this.k = atalVar;
        this.b = iocVar;
        this.c = view;
        this.d = (ViewGroup) view.findViewById(R.id.hugo_input_container);
        this.e = (ViewGroup) view.findViewById(R.id.fragment_input_container);
        this.f = a(activity);
        this.j = (int) TypedValue.applyDimension(1, ((Integer) inp.a.e()).intValue(), activity.getResources().getDisplayMetrics());
        d(this.g);
    }

    public static int a(Activity activity) {
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.minimum_available_space);
        WindowManager windowManager = activity.getWindowManager();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (((Boolean) yig.af.e()).booleanValue()) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels - dimensionPixelSize;
    }

    private static void g(View view) {
        view.setVisibility(8);
    }

    public final void b() {
        d(ini.NONE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(inr inrVar) {
        ini iniVar;
        int ordinal = inrVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                    throw new IllegalStateException("No display state for surface ".concat(String.valueOf(String.valueOf(inrVar))));
                }
                iniVar = ini.FRAGMENT;
            } else {
                ini iniVar2 = this.g;
                if (iniVar2 != ini.HUGO && iniVar2 != ini.FRAGMENT) {
                    if (this.h.d()) {
                        iniVar = ini.MATCHING_IME_TRANSIENT_HEIGHTS;
                    } else {
                        iniVar = ini.NONE;
                    }
                } else {
                    iniVar = ini.MATCHING_IME_FINAL_HEIGHT;
                }
            }
        } else {
            iniVar = ini.HUGO;
        }
        d(iniVar);
    }

    public final void d(ini iniVar) {
        ((alwl) ((alwl) i.g()).h("com/google/android/apps/messaging/conversation/input/ContainerController", "setDisplayState", 187, "ContainerController.java")).D("ContainerController: Switching display state from %s to %s", this.g, iniVar);
        int max = Math.max(this.h.a(), this.j);
        int ordinal = iniVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            this.k.q();
                            e(this.c, this.h.b());
                            g(this.d);
                            g(this.e);
                        }
                    } else {
                        this.k.q();
                        e(this.c, this.h.a());
                        g(this.d);
                        g(this.e);
                    }
                } else {
                    this.k.q();
                    e(this.c, -2);
                    e(this.e, max);
                    g(this.d);
                    if (this.h.e()) {
                        this.h.c(this.e);
                    }
                }
            } else if (this.g != ini.HUGO) {
                this.k.q();
                e(this.c, -2);
                e(this.d, max);
                g(this.e);
                if (this.h.e()) {
                    this.h.c(this.d);
                }
            }
        } else {
            atal atalVar = this.k;
            if (Build.VERSION.SDK_INT > 29) {
                ((Activity) atalVar.b).getWindow().setDecorFitsSystemWindows(true);
            }
            atalVar.r(atalVar.a);
            g(this.c);
            g(this.d);
            g(this.e);
        }
        this.g = iniVar;
    }

    public final void e(View view, int i2) {
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        layoutParams.height = i2;
        view.requestLayout();
        if (i2 > 0) {
            this.b.d(this.f - i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.b.b();
    }
}
