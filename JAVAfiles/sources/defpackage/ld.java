package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ld extends Spinner {
    private static final int[] e = {R.attr.spinnerMode};
    public final Context a;
    public lc b;
    int c;
    final Rect d;
    private final ki f;
    private ml g;
    private SpinnerAdapter h;
    private final boolean i;

    public ld(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i;
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int i3 = 0;
        while (max2 < min) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                i = itemViewType;
            } else {
                i = i2;
            }
            if (itemViewType != i2) {
                view = null;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
            max2++;
            i2 = i;
        }
        if (drawable != null) {
            drawable.getPadding(this.d);
            Rect rect = this.d;
            return i3 + rect.left + rect.right;
        }
        return i3;
    }

    public final void b() {
        this.b.l(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ki kiVar = this.f;
        if (kiVar != null) {
            kiVar.a();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        lc lcVar = this.b;
        if (lcVar != null) {
            return lcVar.a();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        lc lcVar = this.b;
        if (lcVar != null) {
            return lcVar.b();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        if (this.b != null) {
            return this.c;
        }
        return super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        lc lcVar = this.b;
        if (lcVar != null) {
            return lcVar.c();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.a;
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        lc lcVar = this.b;
        if (lcVar != null) {
            return lcVar.d();
        }
        return super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lc lcVar = this.b;
        if (lcVar != null && lcVar.u()) {
            this.b.k();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        lb lbVar = (lb) parcelable;
        super.onRestoreInstanceState(lbVar.getSuperState());
        if (lbVar.a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ja(this, 3));
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        lb lbVar = new lb(super.onSaveInstanceState());
        lc lcVar = this.b;
        boolean z = false;
        if (lcVar != null && lcVar.u()) {
            z = true;
        }
        lbVar.a = z;
        return lbVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ml mlVar = this.g;
        if (mlVar != null && mlVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        lc lcVar = this.b;
        if (lcVar != null) {
            if (!lcVar.u()) {
                b();
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ki kiVar = this.f;
        if (kiVar != null) {
            kiVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ki kiVar = this.f;
        if (kiVar != null) {
            kiVar.c(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        lc lcVar = this.b;
        if (lcVar != null) {
            lcVar.h(i);
            this.b.g(i);
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        lc lcVar = this.b;
        if (lcVar != null) {
            lcVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.b != null) {
            this.c = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        lc lcVar = this.b;
        if (lcVar != null) {
            lcVar.f(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(d.f(this.a, i));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        lc lcVar = this.b;
        if (lcVar != null) {
            lcVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00d5: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:35:0x00d5 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ld(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            r0 = 2130970250(0x7f04068a, float:1.7549205E38)
            r10.<init>(r11, r12, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r10.d = r1
            android.content.Context r1 = r10.getContext()
            defpackage.pr.d(r10, r1)
            int[] r1 = defpackage.gc.w
            r2 = 0
            ktk r1 = defpackage.ktk.A(r11, r12, r1, r0, r2)
            ki r3 = new ki
            r3.<init>(r10)
            r10.f = r3
            r3 = 4
            int r3 = r1.n(r3, r2)
            if (r3 == 0) goto L31
            so r4 = new so
            r4.<init>(r11, r3)
            r10.a = r4
            goto L33
        L31:
            r10.a = r11
        L33:
            r3 = 1
            r4 = 0
            int[] r5 = defpackage.ld.e     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            android.content.res.TypedArray r5 = r11.obtainStyledAttributes(r12, r5, r0, r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L96
            boolean r6 = r5.hasValue(r2)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Ld4
            if (r6 == 0) goto L46
            int r6 = r5.getInt(r2, r2)     // Catch: java.lang.Exception -> L92 java.lang.Throwable -> Ld4
            goto L47
        L46:
            r6 = -1
        L47:
            if (r5 == 0) goto L4c
            r5.recycle()
        L4c:
            r5 = 2
            if (r6 == 0) goto L83
            if (r6 == r3) goto L52
            goto La5
        L52:
            la r6 = new la
            android.content.Context r7 = r10.a
            r6.<init>(r10, r7, r12)
            android.content.Context r7 = r10.a
            int[] r8 = defpackage.gc.w
            ktk r7 = defpackage.ktk.A(r7, r12, r8, r0, r2)
            r8 = 3
            r9 = -2
            int r8 = r7.m(r8, r9)
            r10.c = r8
            android.graphics.drawable.Drawable r8 = r7.p(r3)
            r6.f(r8)
            java.lang.String r5 = r1.s(r5)
            r6.a = r5
            r7.t()
            r10.b = r6
            kw r5 = new kw
            r5.<init>(r10, r10, r6)
            r10.g = r5
            goto La5
        L83:
            kx r6 = new kx
            r6.<init>(r10)
            r10.b = r6
            java.lang.String r5 = r1.s(r5)
            r6.i(r5)
            goto La5
        L92:
            r6 = move-exception
            goto L99
        L94:
            r11 = move-exception
            goto Ld6
        L96:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L99:
            java.lang.String r7 = "AppCompatSpinner"
            java.lang.String r8 = "Could not read android:spinnerMode"
            android.util.Log.i(r7, r8, r6)     // Catch: java.lang.Throwable -> Ld4
            if (r5 == 0) goto La5
            r5.recycle()
        La5:
            java.lang.Object r5 = r1.b
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            java.lang.CharSequence[] r2 = r5.getTextArray(r2)
            if (r2 == 0) goto Lc0
            android.widget.ArrayAdapter r5 = new android.widget.ArrayAdapter
            r6 = 17367048(0x1090008, float:2.5162948E-38)
            r5.<init>(r11, r6, r2)
            r11 = 2131624665(0x7f0e02d9, float:1.8876516E38)
            r5.setDropDownViewResource(r11)
            r10.setAdapter(r5)
        Lc0:
            r1.t()
            r10.i = r3
            android.widget.SpinnerAdapter r11 = r10.h
            if (r11 == 0) goto Lce
            r10.setAdapter(r11)
            r10.h = r4
        Lce:
            ki r11 = r10.f
            r11.b(r12, r0)
            return
        Ld4:
            r11 = move-exception
            r4 = r5
        Ld6:
            if (r4 == 0) goto Ldb
            r4.recycle()
        Ldb:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.b != null) {
            Context context = this.a;
            if (context == null) {
                context = getContext();
            }
            this.b.e(new ky(spinnerAdapter, context.getTheme()));
        }
    }
}
