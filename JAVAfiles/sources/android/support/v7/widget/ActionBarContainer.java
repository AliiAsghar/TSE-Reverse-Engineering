package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import defpackage.gc;
import defpackage.jg;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public View a;
    public Drawable b;
    public Drawable c;
    public Drawable d;
    public boolean e;
    public boolean f;
    private boolean g;
    private View h;
    private int i;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public final void a(boolean z) {
        int i;
        this.g = z;
        if (true != z) {
            i = 262144;
        } else {
            i = 393216;
        }
        setDescendantFocusability(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.b;
        if (drawable != null && drawable.isStateful()) {
            this.b.setState(getDrawableState());
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null && drawable2.isStateful()) {
            this.c.setState(getDrawableState());
        }
        Drawable drawable3 = this.d;
        if (drawable3 != null && drawable3.isStateful()) {
            this.d.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.action_bar);
        this.h = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.g && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        if (this.e) {
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                return;
            }
        } else {
            if (this.b != null) {
                z2 = true;
                if (this.a.getVisibility() != 0 && ((view = this.h) == null || view.getVisibility() != 0)) {
                    this.b.setBounds(0, 0, 0, 0);
                } else {
                    this.b.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                }
            } else {
                z2 = false;
            }
            this.f = false;
            if (!z2) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.a == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.i) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.a == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        Drawable drawable = this.b;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.b || this.e) {
            if ((drawable == this.d && this.e) || super.verifyDrawable(drawable)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new jg(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gc.a);
        boolean z = false;
        this.b = obtainStyledAttributes.getDrawable(0);
        this.c = obtainStyledAttributes.getDrawable(2);
        this.i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.e = true;
            this.d = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.e ? !(this.b != null || this.c != null) : this.d == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
