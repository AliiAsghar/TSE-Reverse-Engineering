package defpackage;

import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agav implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public agav(ajcx ajcxVar, TouchDelegate touchDelegate, int i) {
        this.c = i;
        this.b = ajcxVar;
        this.a = touchDelegate;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            dg dgVar = (dg) this.b;
            dgVar.e();
            dv.c((ViewGroup) dgVar.a.Q.getParent(), ((co) this.a).a).f();
            return;
        }
        ((View) this.a).removeOnAttachStateChangeListener(this);
        ((alvg) agaw.a.g().h("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardDetectorPopupWindowStrategy$attachPopupWindow$$inlined$doOnAttach$1", "onViewAttachedToWindow", 64, "KeyboardDetectorPopupWindowStrategy.kt")).q("Starting keyboard detection");
        ((agaw) this.b).d().showAtLocation(((ViewGroup) this.a).getRootView(), 0, 0, 0);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                Object obj = this.a;
                ajcx ajcxVar = (ajcx) this.b;
                ajcxVar.a.remove(obj);
                if (obj == ajcxVar.b) {
                    ajcxVar.b = null;
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            }
            return;
        }
        ((View) this.a).removeOnAttachStateChangeListener(this);
    }

    public agav(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
