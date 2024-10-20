package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajmj extends LinearLayout {
    public ValueAnimator a;
    public final /* synthetic */ TabLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajmj(TabLayout tabLayout, Context context) {
        super(context);
        this.b = tabLayout;
        setWillNotDraw(false);
    }

    private final void e(int i) {
        TabLayout tabLayout = this.b;
        if (tabLayout.F != 0 && (tabLayout.n.getBounds().left != -1 || this.b.n.getBounds().right != -1)) {
            return;
        }
        View childAt = getChildAt(i);
        TabLayout tabLayout2 = this.b;
        Drawable drawable = tabLayout2.n;
        RectF n = ajgl.n(tabLayout2, childAt);
        drawable.setBounds((int) n.left, drawable.getBounds().top, (int) n.right, drawable.getBounds().bottom);
        this.b.a = i;
    }

    public final void a() {
        e(this.b.a());
    }

    public final void b(int i) {
        Rect bounds = this.b.n.getBounds();
        this.b.n.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        if (view != null && view.getWidth() > 0) {
            TabLayout tabLayout = this.b;
            tabLayout.G.o(tabLayout, view, view2, f, tabLayout.n);
        } else {
            Drawable drawable = this.b.n;
            drawable.setBounds(-1, drawable.getBounds().top, -1, this.b.n.getBounds().bottom);
        }
        postInvalidateOnAnimation();
    }

    public final void d(boolean z, int i, int i2) {
        TabLayout tabLayout = this.b;
        if (tabLayout.a == i) {
            return;
        }
        View childAt = getChildAt(tabLayout.a());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a();
            return;
        }
        this.b.a = i;
        ajmi ajmiVar = new ajmi(this, childAt, childAt2, 0);
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.a = valueAnimator;
            valueAnimator.setInterpolator(this.b.C);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(brg.a, 1.0f);
            valueAnimator.addUpdateListener(ajmiVar);
            valueAnimator.start();
            return;
        }
        this.a.removeAllUpdateListeners();
        this.a.addUpdateListener(ajmiVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        int height2 = this.b.n.getBounds().height();
        if (height2 < 0) {
            height2 = this.b.n.getIntrinsicHeight();
        }
        int i = this.b.w;
        if (i != 0) {
            if (i != 1) {
                height = 0;
                if (i != 2) {
                    if (i != 3) {
                        height2 = 0;
                    } else {
                        height2 = getHeight();
                    }
                }
            } else {
                int height3 = getHeight() - height2;
                height2 = (getHeight() + height2) / 2;
                height = height3 / 2;
            }
        } else {
            height = getHeight() - height2;
            height2 = getHeight();
        }
        if (this.b.n.getBounds().width() > 0) {
            Rect bounds = this.b.n.getBounds();
            this.b.n.setBounds(bounds.left, height, bounds.right, height2);
            this.b.n.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(false, this.b.a(), -1);
            return;
        }
        TabLayout tabLayout = this.b;
        int i5 = tabLayout.a;
        if (i5 == -1) {
            i5 = tabLayout.a();
            tabLayout.a = i5;
        }
        e(i5);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            TabLayout tabLayout = this.b;
            if (tabLayout.u == 1 || tabLayout.x == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 > 0) {
                    int i5 = (int) ajgl.i(getContext(), 16);
                    if (i3 * childCount <= getMeasuredWidth() - (i5 + i5)) {
                        boolean z = false;
                        for (int i6 = 0; i6 < childCount; i6++) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i6).getLayoutParams();
                            if (layoutParams.width != i3 || layoutParams.weight != brg.a) {
                                layoutParams.width = i3;
                                layoutParams.weight = brg.a;
                                z = true;
                            }
                        }
                        if (!z) {
                            return;
                        }
                    } else {
                        TabLayout tabLayout2 = this.b;
                        tabLayout2.u = 0;
                        tabLayout2.u(false);
                    }
                    super.onMeasure(i, i2);
                }
            }
        }
    }
}
