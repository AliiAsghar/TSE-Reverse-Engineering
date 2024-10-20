package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ajgl {
    public ajgl() {
    }

    static void c(Outline outline, Path path) {
        outline.setPath(path);
    }

    public static ColorStateList d(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && aei$$ExternalSyntheticApiModelOutline0.m30m((Object) drawable)) {
            colorStateList = aei$$ExternalSyntheticApiModelOutline0.m24m((Object) drawable).getColorStateList();
            return colorStateList;
        }
        return null;
    }

    public static PorterDuffColorFilter e(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
        }
        return null;
    }

    public static Drawable f(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            Drawable mutate = drawable.mutate();
            if (mode != null) {
                mutate.setTintMode(mode);
                return mutate;
            }
            return mutate;
        }
        return drawable;
    }

    public static void g(Outline outline, Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            c(outline, path);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                ajgk.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            ajgk.a(outline, path);
        }
    }

    public static void h(Drawable drawable, int i) {
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
    }

    public static float i(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static void j(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void k(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static boolean l(View view) {
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static boolean m(EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }

    public static RectF n(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.z && (view instanceof ajmm)) {
            ajmm ajmmVar = (ajmm) view;
            View[] viewArr = {ajmmVar.a, ajmmVar.b, null};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view2 = viewArr[i3];
                if (view2 != null && view2.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view2.getLeft());
                    } else {
                        i2 = view2.getLeft();
                    }
                    if (z) {
                        i = Math.max(i, view2.getRight());
                    } else {
                        i = view2.getRight();
                    }
                    z = true;
                }
            }
            int i4 = i - i2;
            View[] viewArr2 = {ajmmVar.a, ajmmVar.b, null};
            int i5 = 0;
            int i6 = 0;
            boolean z2 = false;
            for (int i7 = 0; i7 < 3; i7++) {
                View view3 = viewArr2[i7];
                if (view3 != null && view3.getVisibility() == 0) {
                    if (z2) {
                        i6 = Math.min(i6, view3.getTop());
                    } else {
                        i6 = view3.getTop();
                    }
                    if (z2) {
                        i5 = Math.max(i5, view3.getBottom());
                    } else {
                        i5 = view3.getBottom();
                    }
                    z2 = true;
                }
            }
            int i8 = i5 - i6;
            int i9 = (int) i(ajmmVar.getContext(), 24);
            if (i4 < i9) {
                i4 = i9;
            }
            int left = (ajmmVar.getLeft() + ajmmVar.getRight()) / 2;
            int top = (ajmmVar.getTop() + ajmmVar.getBottom()) / 2;
            int i10 = i4 / 2;
            return new RectF(left - i10, top - (i8 / 2), left + i10, (left / 2) + top);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static void p(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof ajkm) {
            ((ajkm) background).I(f);
        }
    }

    public static void q(View view) {
        Drawable background = view.getBackground();
        if (background instanceof ajkm) {
            r(view, (ajkm) background);
        }
    }

    public static void r(View view, ajkm ajkmVar) {
        ajgm ajgmVar = ajkmVar.o.b;
        if (ajgmVar != null && ajgmVar.a) {
            float f = brg.a;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f += edz.a((View) parent);
            }
            ajkk ajkkVar = ajkmVar.o;
            if (ajkkVar.n != f) {
                ajkkVar.n = f;
                ajkmVar.P();
            }
        }
    }

    public static ajki s(int i) {
        if (i != 1) {
            return new ajkp();
        }
        return new ajkh();
    }

    public static void t(View view) {
        int paddingStart;
        int paddingEnd;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            Context context = view.getContext();
            boolean r = ajuu.h(context).r(ajus.CONFIG_LAYOUT_MARGIN_START);
            boolean r2 = ajuu.h(context).r(ajus.CONFIG_LAYOUT_MARGIN_END);
            if (ajki.B(view)) {
                if (!r) {
                    if (r2) {
                        r2 = true;
                    } else {
                        return;
                    }
                }
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.sudMarginStart, R.attr.sudMarginEnd});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
                obtainStyledAttributes.recycle();
                if (r) {
                    paddingStart = ((int) ajuu.h(context).a(context, ajus.CONFIG_LAYOUT_MARGIN_START)) - dimensionPixelSize;
                } else {
                    paddingStart = view.getPaddingStart();
                }
                if (r2) {
                    paddingEnd = ((int) ajuu.h(context).a(context, ajus.CONFIG_LAYOUT_MARGIN_END)) - dimensionPixelSize2;
                    if (view.getId() == R.id.sud_layout_content) {
                        paddingEnd = ((int) ajuu.h(context).a(context, ajus.CONFIG_LAYOUT_MARGIN_START)) - dimensionPixelSize2;
                    }
                } else {
                    paddingEnd = view.getPaddingEnd();
                    if (view.getId() == R.id.sud_layout_content) {
                        paddingEnd = view.getPaddingStart();
                    }
                }
                if (paddingStart != view.getPaddingStart() || paddingEnd != view.getPaddingEnd()) {
                    if (view.getId() == R.id.sud_layout_content) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        } else {
                            marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
                        }
                        marginLayoutParams.setMargins(paddingStart, view.getPaddingTop(), paddingEnd, view.getPaddingBottom());
                        return;
                    }
                    view.setPadding(paddingStart, view.getPaddingTop(), paddingEnd, view.getPaddingBottom());
                }
            }
        }
    }

    public static void u(Spannable spannable, Object obj, Object... objArr) {
        int spanStart = spannable.getSpanStart(obj);
        int spanEnd = spannable.getSpanEnd(obj);
        spannable.removeSpan(obj);
        for (Object obj2 : objArr) {
            spannable.setSpan(obj2, spanStart, spanEnd, 0);
        }
    }

    public static boolean v(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 29) {
            if (!intent.getBooleanExtra("firstRun", false) && !intent.getBooleanExtra("preDeferredSetup", false) && !intent.getBooleanExtra("deferredSetup", false)) {
                return false;
            }
            return true;
        }
        return intent.getBooleanExtra("isSetupFlow", false);
    }

    public static boolean w() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    public static boolean x() {
        if (!Build.VERSION.CODENAME.equals("REL") || Build.VERSION.SDK_INT < 34) {
            if (!Build.VERSION.CODENAME.equals("REL") && Build.VERSION.CODENAME.compareTo("UpsideDownCake") >= 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void a(Object obj) {
        throw null;
    }

    public void b(Object obj) {
        throw null;
    }

    public void o(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF n = n(tabLayout, view);
        RectF n2 = n(tabLayout, view2);
        drawable.setBounds(ajdd.b((int) n.left, (int) n2.left, f), drawable.getBounds().top, ajdd.b((int) n.right, (int) n2.right, f), drawable.getBounds().bottom);
    }

    public ajgl(byte[] bArr) {
    }
}
