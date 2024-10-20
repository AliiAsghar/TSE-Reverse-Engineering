package defpackage;

import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afvv implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ afvv(aksr aksrVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, int i) {
        this.d = i;
        this.a = aksrVar;
        this.b = onGlobalLayoutListener;
        this.c = "layout changed";
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, android.view.ViewTreeObserver$OnGlobalLayoutListener] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                ?? r0 = this.b;
                if (!akqj.u()) {
                    akrc b = ((aksr) this.a).b((String) this.c);
                    try {
                        r0.onGlobalLayout();
                        b.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            b.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                r0.onGlobalLayout();
                return;
            }
            if (((View) this.c).getWidth() > 0 && ((View) this.c).getHeight() > 0) {
                ((View) this.c).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Object obj = this.c;
                Object obj2 = this.b;
                Object obj3 = this.a;
                View view = (View) obj;
                View view2 = (View) obj3;
                RippleDrawable rippleDrawable = (RippleDrawable) obj2;
                rippleDrawable.setHotspotBounds(view2.getPaddingLeft(), view2.getPaddingTop(), view.getWidth() - view2.getPaddingRight(), view.getHeight() - ((View) this.a).getPaddingBottom());
                return;
            }
            return;
        }
        if (((View) this.a).getWidth() > 0 && ((View) this.a).getHeight() > 0) {
            ((View) this.a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ((View) this.a).getWidth();
            Object obj4 = this.a;
            Object obj5 = this.b;
            int height = ((View) obj4).getHeight();
            View view3 = (View) obj5;
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = height + ((ViewGroup.MarginLayoutParams) this.c).topMargin;
                view3.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public afvv(View view, RippleDrawable rippleDrawable, View view2, int i) {
        this.d = i;
        this.c = view;
        this.b = rippleDrawable;
        this.a = view2;
    }

    public afvv(View view, View view2, ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        this.d = i;
        this.a = view;
        this.b = view2;
        this.c = marginLayoutParams;
    }
}
