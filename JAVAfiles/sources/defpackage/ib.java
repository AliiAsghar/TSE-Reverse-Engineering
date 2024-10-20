package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ib implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ib(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.b) {
            case 0:
                return;
            case 1:
                ((View) this.a).removeOnAttachStateChangeListener(this);
                edx.c((View) this.a);
                return;
            case 2:
                return;
            case 3:
                if (!((ohs) ((kvw) this.a).bi.b()).a()) {
                    kvw kvwVar = (kvw) this.a;
                    kvwVar.f(kvwVar.b).getViewTreeObserver().addOnGlobalLayoutListener(((kvw) this.a).aS);
                    return;
                }
                return;
            case 4:
                kyl kylVar = (kyl) this.a;
                kylVar.s.c.b.addListener(new kyk(kylVar));
                kylVar.s.c();
                return;
            case 5:
                ldo ldoVar = (ldo) this.a;
                ldoVar.a.i(-1);
                ldoVar.a.c();
                return;
            case 6:
                return;
            default:
                ((ajnb) this.a).d();
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.b) {
            case 0:
                ViewTreeObserver viewTreeObserver = ((id) this.a).e;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        ((id) this.a).e = view.getViewTreeObserver();
                    }
                    id idVar = (id) this.a;
                    idVar.e.removeGlobalOnLayoutListener(idVar.c);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                return;
            case 2:
                ViewTreeObserver viewTreeObserver2 = ((jb) this.a).d;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        ((jb) this.a).d = view.getViewTreeObserver();
                    }
                    jb jbVar = (jb) this.a;
                    jbVar.d.removeGlobalOnLayoutListener(jbVar.b);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 3:
                kvw kvwVar = (kvw) this.a;
                kvwVar.f(kvwVar.b).getViewTreeObserver().removeOnGlobalLayoutListener(((kvw) this.a).aS);
                return;
            case 4:
                kyl kylVar = (kyl) this.a;
                if (kylVar.s.k()) {
                    kylVar.s.b();
                }
                if (kylVar.t.k()) {
                    kylVar.t.b();
                    return;
                }
                return;
            case 5:
                ldo ldoVar = (ldo) this.a;
                if (ldoVar.a.k()) {
                    ldoVar.a.b();
                    return;
                }
                return;
            case 6:
                if (view.equals(((nhh) this.a).g)) {
                    ((nhh) this.a).d();
                    return;
                }
                return;
            default:
                ((ajnb) this.a).h();
                return;
        }
    }
}
