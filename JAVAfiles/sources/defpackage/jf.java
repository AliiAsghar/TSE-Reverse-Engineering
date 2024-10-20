package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jf extends ViewGroup {
    protected final je a;
    public final Context b;
    public ActionMenuView c;
    public jq d;
    public int e;
    protected efu f;
    private boolean g;
    private boolean h;

    jf(Context context) {
        this(context, null);
    }

    public static int a(int i, int i2, boolean z) {
        if (z) {
            return i - i2;
        }
        return i + i2;
    }

    public static final int e(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static final int f(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        int i5 = measuredHeight + i4;
        if (z) {
            view.layout(i - measuredWidth, i4, i, i5);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, i5);
        return measuredWidth;
    }

    public void c(int i) {
        throw null;
    }

    public final efu g(int i, long j) {
        efu efuVar = this.f;
        if (efuVar != null) {
            efuVar.d();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(brg.a);
            }
            efu v = eek.v(this);
            v.e(1.0f);
            v.f(j);
            je jeVar = this.a;
            jeVar.d(v, 0);
            v.g(jeVar);
            return v;
        }
        efu v2 = eek.v(this);
        v2.e(brg.a);
        v2.f(j);
        je jeVar2 = this.a;
        jeVar2.d(v2, i);
        v2.g(jeVar2);
        return v2;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, gc.a, R.attr.actionBarStyle, 0);
        c(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        jq jqVar = this.d;
        if (jqVar != null) {
            jqVar.h = ef.j(jqVar.b);
            ij ijVar = jqVar.c;
            if (ijVar != null) {
                ijVar.l(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.h = false;
            actionMasked = 9;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.h = true;
                }
                if (i != 10 || i == 3) {
                    this.h = false;
                }
                return true;
            }
        }
        i = actionMasked;
        if (i != 10) {
        }
        this.h = false;
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
            actionMasked = 0;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.g = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            efu efuVar = this.f;
            if (efuVar != null) {
                efuVar.d();
            }
            super.setVisibility(i);
        }
    }

    public jf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new je(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
