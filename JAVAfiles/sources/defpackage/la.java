package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class la extends nd implements lc {
    public CharSequence a;
    ListAdapter b;
    public final Rect c;
    public final /* synthetic */ ld d;
    private int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(ld ldVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.d = ldVar;
        this.c = new Rect();
        this.l = ldVar;
        y();
        this.m = new ov(this, 1);
    }

    public static /* synthetic */ void m(la laVar) {
        super.s();
    }

    @Override // defpackage.lc
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.nd, defpackage.lc
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.lc
    public final void h(int i) {
        this.s = i;
    }

    @Override // defpackage.lc
    public final void i(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.lc
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean u = u();
        n();
        x();
        super.s();
        mh mhVar = this.e;
        mhVar.setChoiceMode(1);
        mhVar.setTextDirection(i);
        mhVar.setTextAlignment(i2);
        int selectedItemPosition = this.d.getSelectedItemPosition();
        mh mhVar2 = this.e;
        if (u() && mhVar2 != null) {
            mhVar2.a = false;
            mhVar2.setSelection(selectedItemPosition);
            if (mhVar2.getChoiceMode() != 0) {
                mhVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!u && (viewTreeObserver = this.d.getViewTreeObserver()) != null) {
            ja jaVar = new ja(this, 4);
            viewTreeObserver.addOnGlobalLayoutListener(jaVar);
            v(new kz(this, jaVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.widget.SpinnerAdapter, android.widget.ListAdapter] */
    public final void n() {
        int i;
        int i2;
        Drawable c = c();
        if (c != null) {
            c.getPadding(this.d.d);
            if (qn.a(this.d)) {
                i = this.d.d.right;
            } else {
                i = -this.d.d.left;
            }
        } else {
            Rect rect = this.d.d;
            rect.right = 0;
            rect.left = 0;
            i = 0;
        }
        ld ldVar = this.d;
        int paddingLeft = ldVar.getPaddingLeft();
        int paddingRight = ldVar.getPaddingRight();
        int width = ldVar.getWidth();
        int i3 = ldVar.c;
        if (i3 == -2) {
            int i4 = (width - paddingLeft) - paddingRight;
            int a = ldVar.a(this.b, c());
            int i5 = (this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.d.left) - this.d.d.right;
            if (a > i5) {
                a = i5;
            }
            r(Math.max(a, i4));
        } else if (i3 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i3);
        }
        if (qn.a(this.d)) {
            i2 = i + (((width - paddingRight) - this.f) - this.s);
        } else {
            i2 = i + paddingLeft + this.s;
        }
        this.g = i2;
    }
}
