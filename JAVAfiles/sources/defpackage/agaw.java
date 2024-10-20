package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agaw implements agau {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardDetectorPopupWindowStrategy");
    private final arml b;
    private final arml c;
    private final arml d;
    private final arml e;
    private boolean f;

    public agaw(Activity activity, aday adayVar) {
        activity.getClass();
        this.b = armd.a(new afzg(activity, 9));
        this.c = armd.a(new afzu(adayVar, this, 3));
        this.d = armd.a(new afzg(activity, 10));
        this.e = armd.a(new afzg(activity, 8));
    }

    private final View e() {
        return (View) this.e.a();
    }

    private final ViewGroup f() {
        return (ViewGroup) this.d.a();
    }

    private final agbp g() {
        return (agbp) this.c.a();
    }

    @Override // defpackage.agau
    public final void a(agar agarVar) {
        if (!this.f) {
            g().h = agarVar;
            d().getContentView().getViewTreeObserver().addOnGlobalLayoutListener(g());
            ViewGroup f = f();
            if (f.isAttachedToWindow()) {
                ((alvg) a.g().h("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardDetectorPopupWindowStrategy", "attachPopupWindow", 64, "KeyboardDetectorPopupWindowStrategy.kt")).q("Starting keyboard detection");
                d().showAtLocation(f.getRootView(), 0, 0, 0);
            } else {
                f.addOnAttachStateChangeListener(new agav(f, this, 0));
            }
            e().setOnApplyWindowInsetsListener(g());
            f().addView(e());
            this.f = true;
            return;
        }
        throw new IllegalStateException("Detector was already attached");
    }

    @Override // defpackage.agau
    public final void b() {
        if (this.f) {
            e().getViewTreeObserver().removeOnGlobalLayoutListener(g());
            f().removeView(e());
            d().getContentView().getViewTreeObserver().removeOnGlobalLayoutListener(g());
            if (d().isShowing()) {
                d().dismiss();
            }
            this.f = false;
            return;
        }
        throw new IllegalStateException("Detector wasn't attached");
    }

    @Override // defpackage.agau
    public final /* synthetic */ boolean c() {
        return false;
    }

    public final PopupWindow d() {
        return (PopupWindow) this.b.a();
    }
}
