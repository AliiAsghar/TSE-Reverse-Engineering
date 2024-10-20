package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Property;
import android.util.StateSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irg extends nq implements View.OnLayoutChangeListener, oa {
    public final RecyclerView a;
    public final ViewGroupOverlay b;
    public final TextView c;
    private final Context f;
    private final zpt g;
    private final ImageView h;
    private final ImageView i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final boolean s;
    private AnimatorSet v;
    private ObjectAnimator w;
    private final znj y;
    private final Rect q = new Rect();
    private final Handler r = new Handler();
    private boolean t = false;
    public boolean d = false;
    private boolean u = false;
    public boolean e = false;
    private final Runnable x = new gtq(this, 15, null);

    public irg(zpt zptVar, znj znjVar, RecyclerView recyclerView, int i) {
        Context context = recyclerView.getContext();
        this.f = context;
        this.a = recyclerView;
        this.g = zptVar;
        this.y = znjVar;
        this.s = 1 == (i ^ 1);
        Resources resources = context.getResources();
        this.j = resources.getDimensionPixelSize(R.dimen.fastscroll_track_width);
        this.k = resources.getDimensionPixelSize(R.dimen.fastscroll_thumb_height);
        this.l = resources.getDimensionPixelSize(R.dimen.fastscroll_preview_height);
        this.m = resources.getDimensionPixelSize(R.dimen.fastscroll_preview_min_width);
        this.n = resources.getDimensionPixelOffset(R.dimen.fastscroll_preview_margin_top);
        this.o = resources.getDimensionPixelOffset(R.dimen.fastscroll_preview_margin_left_right);
        this.p = resources.getDimensionPixelOffset(R.dimen.fastscroll_touch_slop);
        LayoutInflater from = LayoutInflater.from(context);
        ImageView imageView = (ImageView) from.inflate(R.layout.fastscroll_track, (ViewGroup) null);
        this.h = imageView;
        ImageView imageView2 = (ImageView) from.inflate(R.layout.fastscroll_thumb, (ViewGroup) null);
        this.i = imageView2;
        TextView textView = (TextView) from.inflate(R.layout.fastscroll_preview, (ViewGroup) null);
        this.c = textView;
        ViewGroupOverlay overlay = recyclerView.getOverlay();
        this.b = overlay;
        overlay.add(imageView);
        overlay.add(imageView2);
        overlay.add(textView);
    }

    private final void Z() {
        if (this.d) {
            this.r.removeCallbacks(this.x);
        }
    }

    private final void aa() {
        this.u = false;
        this.i.setPressed(false);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.c, (Property<TextView, Float>) View.ALPHA, brg.a);
        this.w = ofFloat;
        ofFloat.setDuration(300L);
        this.w.start();
        ab();
    }

    private final void ab() {
        Z();
        this.r.postDelayed(this.x, 1500L);
        this.d = true;
    }

    public final void W(boolean z) {
        int i;
        if (this.s) {
            i = this.j;
        } else {
            i = -this.j;
        }
        float f = i;
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.h, (Property<ImageView, Float>) View.TRANSLATION_X, f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.i, (Property<ImageView, Float>) View.TRANSLATION_X, f);
            AnimatorSet animatorSet = new AnimatorSet();
            this.v = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            this.v.setDuration(300L);
            this.v.start();
        } else {
            this.h.setTranslationX(f);
            this.i.setTranslationX(f);
        }
        this.t = false;
    }

    public final void X() {
        zpt zptVar = this.g;
        Drawable drawable = zptVar.a;
        if (drawable == null) {
            drawable = zptVar.d.getDrawable(R.drawable.fastscroll_preview_left);
            zptVar.a = drawable;
        }
        Drawable drawable2 = zptVar.b;
        if (drawable2 == null) {
            drawable2 = zptVar.d.getDrawable(R.drawable.fastscroll_preview_right);
            zptVar.b = drawable2;
        }
        boolean z = this.s;
        Context context = this.f;
        TextView textView = this.c;
        if (true == z) {
            drawable = drawable2;
        }
        drawable.getClass();
        textView.setBackground(yfo.i(context, drawable, zpt.b(context)));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, this.g.j(this.f, true));
        stateListDrawable.addState(StateSet.WILD_CARD, this.g.j(this.f, false));
        this.i.setImageDrawable(stateListDrawable);
        ImageView imageView = this.h;
        zpt zptVar2 = this.g;
        Context context2 = this.f;
        int color = context2.getColor(R.color.fastscroll_tint_color);
        if (zptVar2.c == null) {
            zptVar2.c = zptVar2.d.getDrawable(R.drawable.fastscroll_track);
        }
        Drawable drawable3 = zptVar2.c;
        drawable3.getClass();
        imageView.setImageDrawable(yfo.i(context2, drawable3, color));
    }

    public final void Y() {
        int i;
        int i2;
        int i3;
        int measuredWidth;
        int L;
        oo h;
        if (this.t) {
            if (this.e) {
                this.b.add(this.h);
                this.b.add(this.i);
                this.b.add(this.c);
                this.e = false;
            }
            int height = this.q.height() - this.k;
            int i4 = this.q.top + (this.k / 2);
            RecyclerView recyclerView = this.a;
            int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
            int computeVerticalScrollExtent = recyclerView.computeVerticalScrollExtent();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            float f = 1.0f;
            if (computeVerticalScrollRange != 0 && computeVerticalScrollExtent != 0) {
                f = Math.min(computeVerticalScrollOffset, r3) / (computeVerticalScrollRange - computeVerticalScrollExtent);
            }
            int i5 = i4 + ((int) (height * f));
            this.i.measure(View.MeasureSpec.makeMeasureSpec(this.j, 1073741824), View.MeasureSpec.makeMeasureSpec(this.k, 1073741824));
            if (this.s) {
                i = this.q.right - this.j;
            } else {
                i = this.q.left;
            }
            int height2 = i5 - (this.i.getHeight() / 2);
            if (this.s) {
                i2 = this.q.right;
            } else {
                i2 = this.q.left + this.j;
            }
            this.i.layout(i, height2, i2, this.k + height2);
            if (this.u) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.a.m;
                if (linearLayoutManager != null && (L = linearLayoutManager.L()) != -1 && (h = this.a.h(L)) != null) {
                    KeyEvent.Callback callback = h.a;
                    if (callback instanceof aacl) {
                        this.c.setText(this.y.B(((aacl) callback).c().i(), true, true, false));
                    }
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.q.width(), Integer.MIN_VALUE);
                int i6 = this.l;
                TextView textView = this.c;
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                textView.measure(makeMeasureSpec, makeMeasureSpec2);
                if (this.c.getMeasuredWidth() < this.m) {
                    this.c.measure(View.MeasureSpec.makeMeasureSpec(this.m, 1073741824), makeMeasureSpec2);
                }
                int i7 = this.q.top + this.n;
                if (this.s) {
                    measuredWidth = (this.q.right - this.j) - this.o;
                    i3 = measuredWidth - this.c.getMeasuredWidth();
                } else {
                    i3 = this.o + this.q.left + this.j;
                    measuredWidth = this.c.getMeasuredWidth() + i3;
                }
                int measuredHeight = i5 - this.c.getMeasuredHeight();
                if (measuredHeight < i7) {
                    i5 = this.c.getMeasuredHeight() + i7;
                } else {
                    i7 = measuredHeight;
                }
                this.c.layout(i3, i7, measuredWidth, i5);
            }
        }
    }

    @Override // defpackage.nq
    public final void dG(RecyclerView recyclerView, int i, int i2) {
        Y();
    }

    @Override // defpackage.oa
    public final void e(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.u) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return;
                    }
                } else {
                    float y = motionEvent.getY();
                    float min = Math.min(Math.max((y - (this.q.top + (this.k / 2))) / (this.q.height() - this.k), brg.a), 1.0f);
                    if (this.a.l != null) {
                        this.a.ae((int) ((r0.b() - 1) * (1.0f - min)));
                        return;
                    }
                    return;
                }
            }
            aa();
        }
    }

    @Override // defpackage.oa
    public final boolean k(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.t) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            return false;
                        }
                    } else {
                        return this.u;
                    }
                }
                if (this.u) {
                    aa();
                    return false;
                }
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int left = this.i.getLeft() - this.p;
            int right = this.i.getRight() + this.p;
            if (x >= left && x <= right && y >= this.i.getTop() && y <= this.i.getBottom()) {
                this.u = true;
                this.i.setPressed(true);
                Y();
                ObjectAnimator objectAnimator = this.w;
                if (objectAnimator != null && objectAnimator.isRunning()) {
                    this.w.cancel();
                }
                this.c.setAlpha(1.0f);
                Z();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        if (!this.t) {
            W(false);
        }
        this.q.set(i, i2 + this.a.getPaddingTop(), i3, i4);
        int max = Math.max(0, this.q.height());
        this.h.measure(View.MeasureSpec.makeMeasureSpec(this.j, 1073741824), View.MeasureSpec.makeMeasureSpec(max, 1073741824));
        if (this.s) {
            Rect rect = this.q;
            i9 = rect.right - this.j;
        } else {
            i9 = this.q.left;
        }
        Rect rect2 = this.q;
        boolean z = this.s;
        int i11 = rect2.top;
        if (z) {
            i10 = this.q.right;
        } else {
            Rect rect3 = this.q;
            i10 = rect3.left + this.j;
        }
        this.h.layout(i9, i11, i10, this.q.bottom);
        Y();
    }

    @Override // defpackage.nq
    public final void t(RecyclerView recyclerView, int i) {
        if (i == 1) {
            if (!this.t) {
                RecyclerView recyclerView2 = this.a;
                int computeVerticalScrollRange = recyclerView2.computeVerticalScrollRange();
                int computeVerticalScrollExtent = recyclerView2.computeVerticalScrollExtent();
                if (computeVerticalScrollRange != 0 && computeVerticalScrollExtent != 0 && computeVerticalScrollRange / computeVerticalScrollExtent > 2.0f) {
                    AnimatorSet animatorSet = this.v;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        this.v.cancel();
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.h, (Property<ImageView, Float>) View.TRANSLATION_X, brg.a);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.i, (Property<ImageView, Float>) View.TRANSLATION_X, brg.a);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ofFloat, ofFloat2);
                    animatorSet2.setDuration(150L);
                    animatorSet2.start();
                    this.t = true;
                    Y();
                }
            }
            Z();
            return;
        }
        if (i == 0 && !this.u) {
            ab();
        }
    }

    @Override // defpackage.oa
    public final void d(boolean z) {
    }
}
