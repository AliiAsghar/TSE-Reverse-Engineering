package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lg {
    public Typeface b;
    public boolean c;
    private final TextView d;
    private pu e;
    private pu f;
    private pu g;
    private pu h;
    private pu i;
    private pu j;
    private final lm k;
    public int a = 0;
    private int l = -1;
    private String m = null;

    public lg(TextView textView) {
        this.d = textView;
        this.k = new lm(textView);
    }

    public static void f(TextView textView, Typeface typeface, int i) {
        String fontVariationSettings;
        ul ulVar = lf.a;
        fontVariationSettings = textView.getFontVariationSettings();
        if (!TextUtils.isEmpty(fontVariationSettings)) {
            lf.a(textView, null);
        }
        textView.setTypeface(typeface, i);
        if (!TextUtils.isEmpty(fontVariationSettings)) {
            lf.a(textView, fontVariationSettings);
        }
    }

    public static final void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            egl.c(editorInfo, textView.getText());
        }
    }

    private static pu s(Context context, km kmVar, int i) {
        ColorStateList a = kmVar.a(context, i);
        if (a != null) {
            pu puVar = new pu();
            puVar.d = true;
            puVar.a = a;
            return puVar;
        }
        return null;
    }

    private final void t(Drawable drawable, pu puVar) {
        if (drawable != null && puVar != null) {
            or.g(drawable, puVar, this.d.getDrawableState());
        }
    }

    private final void u(boolean z) {
        Typeface typeface = this.b;
        if (typeface != null) {
            if (this.l == -1) {
                this.d.setTypeface(typeface, this.a);
            } else {
                this.d.setTypeface(typeface);
            }
        } else if (z) {
            this.d.setTypeface(null);
        }
        String str = this.m;
        if (str != null) {
            lf.a(this.d, str);
        }
    }

    private final boolean v(Context context, ktk ktkVar) {
        String s;
        Typeface create;
        boolean z;
        boolean z2;
        Typeface create2;
        int i;
        Typeface typeface;
        Typeface create3;
        Typeface typeface2;
        int[] iArr = gc.a;
        this.a = ktkVar.k(2, this.a);
        if (Build.VERSION.SDK_INT >= 28) {
            int k = ktkVar.k(11, -1);
            this.l = k;
            if (k != -1) {
                this.a &= 2;
            }
        }
        if (ktkVar.v(13)) {
            this.m = ktkVar.s(13);
        }
        int i2 = 10;
        boolean z3 = false;
        if (!ktkVar.v(10) && !ktkVar.v(12)) {
            if (ktkVar.v(1)) {
                this.c = false;
                int k2 = ktkVar.k(1, 1);
                if (k2 != 1) {
                    if (k2 != 2) {
                        if (k2 == 3) {
                            typeface2 = Typeface.MONOSPACE;
                        }
                        return true;
                    }
                    typeface2 = Typeface.SERIF;
                } else {
                    typeface2 = Typeface.SANS_SERIF;
                }
                this.b = typeface2;
                return true;
            }
            if (Build.VERSION.SDK_INT < 28 || (i = this.l) == -1 || (typeface = this.b) == null) {
                return false;
            }
            if ((2 & this.a) != 0) {
                z3 = true;
            }
            create3 = Typeface.create(typeface, i, z3);
            this.b = create3;
            return true;
        }
        Typeface typeface3 = null;
        this.b = null;
        if (true == ktkVar.v(12)) {
            i2 = 12;
        }
        int i3 = this.l;
        int i4 = this.a;
        if (!context.isRestricted()) {
            le leVar = new le(this, i3, i4, new WeakReference(this.d));
            try {
                int i5 = this.a;
                int resourceId = ((TypedArray) ktkVar.b).getResourceId(i2, 0);
                if (resourceId != 0) {
                    if (ktkVar.c == null) {
                        ktkVar.c = new TypedValue();
                    }
                    Object obj = ktkVar.a;
                    Object obj2 = ktkVar.c;
                    WeakHashMap weakHashMap = ean.a;
                    if (!((Context) obj).isRestricted()) {
                        typeface3 = ean.e((Context) obj, resourceId, (TypedValue) obj2, i5, leVar, true, false);
                    }
                }
                if (typeface3 != null) {
                    if (Build.VERSION.SDK_INT >= 28 && this.l != -1) {
                        Typeface create4 = Typeface.create(typeface3, 0);
                        int i6 = this.l;
                        if ((this.a & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        create2 = Typeface.create(create4, i6, z2);
                        this.b = create2;
                    } else {
                        this.b = typeface3;
                    }
                }
                if (this.b == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.c = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.b == null && (s = ktkVar.s(i2)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.l != -1) {
                Typeface create5 = Typeface.create(s, 0);
                int i7 = this.l;
                if ((2 & this.a) != 0) {
                    z3 = true;
                }
                create = Typeface.create(create5, i7, z3);
                this.b = create;
            } else {
                this.b = Typeface.create(s, this.a);
            }
        }
        return true;
    }

    public final int a() {
        return this.k.a();
    }

    public final int b() {
        return this.k.b();
    }

    public final int c() {
        return this.k.c();
    }

    public final int d() {
        return this.k.a;
    }

    public final void e() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            t(compoundDrawables[0], this.e);
            t(compoundDrawables[1], this.f);
            t(compoundDrawables[2], this.g);
            t(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        t(compoundDrawablesRelative[0], this.i);
        t(compoundDrawablesRelative[2], this.j);
    }

    public final void g() {
        this.k.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0296, code lost:
    
        if (r6 != null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02e4, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02e2, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02e0, code lost:
    
        if (r6 != null) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x032c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.util.AttributeSet r22, int r23) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg.h(android.util.AttributeSet, int):void");
    }

    public final void i(Context context, int i) {
        ktk y = ktk.y(context, i, gc.y);
        if (y.v(14)) {
            j(y.u(14, false));
        }
        if (y.v(0) && y.j(0, -1) == 0) {
            this.d.setTextSize(0, brg.a);
        }
        boolean v = v(context, y);
        y.t();
        u(v);
    }

    final void j(boolean z) {
        this.d.setAllCaps(z);
    }

    public final void k(int i, int i2, int i3, int i4) {
        lm lmVar = this.k;
        if (lmVar.k()) {
            DisplayMetrics displayMetrics = lmVar.i.getResources().getDisplayMetrics();
            lmVar.g(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (lmVar.i()) {
                lmVar.e();
            }
        }
    }

    public final void l(int[] iArr, int i) {
        lm lmVar = this.k;
        if (lmVar.k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = lmVar.i.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                lmVar.f = lm.l(iArr2);
                if (!lmVar.j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: ".concat(String.valueOf(Arrays.toString(iArr))));
                }
            } else {
                lmVar.g = false;
            }
            if (lmVar.i()) {
                lmVar.e();
            }
        }
    }

    public final void m(int i) {
        lm lmVar = this.k;
        if (lmVar.k()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = lmVar.i.getResources().getDisplayMetrics();
                    lmVar.g(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (lmVar.i()) {
                        lmVar.e();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(a.bV(i, "Unknown auto-size text type: "));
            }
            lmVar.a = 0;
            lmVar.d = -1.0f;
            lmVar.e = -1.0f;
            lmVar.c = -1.0f;
            lmVar.f = new int[0];
            lmVar.b = false;
        }
    }

    public final void n(int i, float f) {
        if (!qn.c && !o()) {
            this.k.f(i, f);
        }
    }

    public final boolean o() {
        return this.k.h();
    }

    public final int[] p() {
        return this.k.f;
    }

    public final void q() {
        if (!qn.c) {
            g();
        }
    }
}
